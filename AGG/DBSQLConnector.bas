B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
Sub Class_Globals
	Public CONNECTION_MODE As Int
	Public CONNECTION_MYSQL As Int = 0
	
	Private IP, Database, UserName, Password As String
	Private DBMySQL As MYSQL
	Private QueryResult As List
	Private RepReference As Report
	Private Currencies As List
	Private DatabaseTimeout As Int = 10000	'10 seconds timeout
End Sub

Public Sub Initialize 
	DisableStrictMode
	QueryResult.Initialize
	RepReference.Initialize
	Currencies.Initialize
End Sub

'Set the type of connection to use 0-MySQL, 1-MSSQL
Public Sub SetDBEngine (Connection As Int)
	CONNECTION_MODE = Connection
	Log("Connection Mode: " & Connection)
End Sub

'Set database to use for the queries
Public Sub SetDatabase(address As String, base As String, user As String, pass As String)
	
	IP = address
	Database = base
	UserName = user
	Password = pass
	
	DBMySQL.setDatabase(IP,Database,UserName,Password,DatabaseTimeout)
	
End Sub

'GET Methods
public Sub GetServerAddress As String
	Return IP
End Sub

public Sub GetDatabase As String
	Return Database
End Sub

public Sub GetUserName As String
	Return UserName
End Sub

public Sub GetPassword As String
	Return Password
End Sub

'Returns a list of all the tables in the database
'Public Sub TableList As List
'Dim result As List
'
'			result = DBMySQL.TableList
'	
'	If Not (result.IsInitialized) Then
'		result.Initialize
'		Log("Error! No tables found!")
'	End If
'	
'	Return result
'End Sub

''Executes a SQL NON-query (does not return results)
'Public Sub Exec_NonQuery(sql As String)
'	QueryResult.Clear
'		DBMySQL.ExecuteNonQuery(sql)
'End Sub  
'
'Executes a SQL query and returns the results as a list
Public Sub Exec_Query(sql As String, SkipErrorMessage As Boolean) As List
	QueryResult.Clear
	Try		
'				Log("Executing MYSQL: " & sql)
		QueryResult = DBMySQL.Query(sql)


		If QueryResult.Size = 0 Then
			If Not (QueryResult.IsInitialized) Then QueryResult.Initialize
			Log("Error! No data from query!")
			Msgbox(Main.translate.GetString("errNoData"),Main.translate.GetString("errError"))
'			Support.SaveLog(Main.translate.GetString("errNoData"), LastException)
		End If
		
		Return QueryResult
	Catch
		Dim ex As String = LastException
		Log("QUERY Exception (connection error?): " & LastException.Message)
'		Main.StopLoadingOnError = True
		If ex.Contains("rollback") Then
'			Main.RollbackFailed = True
		End If
		If Not (SkipErrorMessage) Then
			
			If ex.Contains("sql") Then
				Msgbox(Main.translate.GetString("errSQLError") & Chr(10) & Chr(10) & LastException, (Main.translate.GetString("lblSQL")&" "& Main.translate.GetString("lblError")))
'				Support.SaveLog(Main.translate.GetString("errSQLError"), LastException)
			Else
				Msgbox(Main.translate.GetString("errUnexpected"),Main.translate.GetString("errError"))
'				Support.SaveLog(Main.translate.GetString("errUnexpected"), LastException)
			End If
			
		End If
		
		Return QueryResult
	End Try
End Sub


'Public Sub ExecuteNonQueryThread(sql As String)
'	'DataThread.Interrupt
'	'DataThread.Start(Me,"Exec_NonQuery",Array As Object(sql))
'End Sub

Public Sub QueryThread(sql As String, skipErrors As Boolean)
	Private DataThread As Thread
	ProgressDialogShow2(Main.translate.GetString("msgTestConnection"),True)
	DataThread.Initialise("DataThread")
	DataThread.Start(Me,"Exec_Query",Array As Object(sql,skipErrors))
End Sub

private Sub DataThread_Ended(endedOK As Boolean, error As String) 'The thread has terminated. If endedOK is False error holds the reason for failure
	ProgressDialogHide
	If Not (QueryResult.IsInitialized) Then QueryResult.Initialize
	Log("Inner query result: " & QueryResult.Size)
End Sub

Public Sub QueryReportThread(pos As Int, rep As Report, skipErrors As Boolean)
	Private DataThread As Thread
	ProgressDialogShow2(Main.translate.GetString("lblLoading"),True)
	RepReference.Initialize
	RepReference.Data.Initialize
	RepReference = rep
	DataThread.Initialise("DataReportThread")
	DataThread.priority = DataThread.NormalPriority
	DataThread.Start(Me,"Exec_Query",Array As Object(rep.Query,skipErrors))
	DataThread.Yield
End Sub

private Sub DataReportThread_Ended(endedOK As Boolean, error As String) 'The thread has terminated. If endedOK is False error holds the reason for failure
	ProgressDialogHide
	Log("Inner report query result: " & QueryResult)
	If SubExists(Main,"Handle_DBReportResults") Then
	If Not (QueryResult.IsInitialized) Then QueryResult.Initialize
		Dim rep As Report
		rep.Initialize
		rep.Data.Initialize
		rep.ChartType = RepReference.ChartType
		rep.curveType = RepReference.curveType
		rep.Data.AddAll(QueryResult)
		rep.Limit = RepReference.Limit
		rep.Query = RepReference.Query
		rep.sliceText = RepReference.sliceText
		rep.Title = RepReference.Title
		rep.X = RepReference.x
		rep.y = RepReference.y
	End If
End Sub

'Enables network to run on main thread.
'Disables Strict Network Mode for TargetSDK later than 8/9
Public Sub DisableStrictMode 
   Dim jo As JavaObject
   jo.InitializeStatic("android.os.Build.VERSION")
   
   If jo.GetField("SDK_INT") > 9 Then
     Dim policy As JavaObject
     policy = policy.InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder", Null)
     policy = policy.RunMethodJO("permitAll", Null).RunMethodJO("build", Null)
     Dim sm As JavaObject
     sm.InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy", Array(policy))
   End If
   
End Sub

'Selects the primary currency from the database. Returns default currency on fail.
Public Sub Get_Currency As String
	Try
		Currencies.Clear
'		Currencies = Exec_Query("SELECT Currency FROM Currencies where id = 1",True)
		
		Dim s As String = Currencies.Get(1)
		
		s = s.Replace("[","")
		s = s.Replace("]","")
		
		Return s
		Log("Currency PRIME!: " & s)
	Catch
'		Support.SaveLog("Failed to get currency from DB. Currency set to default: BGN", LastException)
		Main.BaseNotAccessible = True
		Log("Failed to get currency from DB. Currency set to default: BGN")
		Return Main.cfg.DEFAULT_CURRENCY
	End Try
End Sub

Public Sub Get_CurrencyThread
	Dim CurrencyThread As Thread
	Log("Attempt to get currency form DB")
	CurrencyThread.Initialise("CurrencyThread")
	CurrencyThread.Start(Me,"Get_Currency",Null)
	CurrencyThread.priority = CurrencyThread.MaxPriority
End Sub

Private Sub CurrencyThread_Ended(endedOK As Boolean, error As String) 'The thread has terminated. If endedOK is False error holds the reason for failure
	
End Sub

