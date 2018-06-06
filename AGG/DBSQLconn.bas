B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim IP, Databases As String
	Dim UserName, Password As String
	Dim DBMySQL As MYSQL
	
	Public CONNECTION_MODE As Int
	Public CONNECTION_MSSQL As Int = 0
	Public CONNECTION_MYSQL As Int = 1
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	DisableStrictMode
End Sub

Public Sub setDatabase(address As String, base As String, user As String, pass As String)
	IP = address
	Databases = base
	UserName = user
	Password = pass
End Sub

'Getters
public Sub GetServerAddress As String
	Return IP
End Sub

public Sub GetDatabase As String
	Return Databases
End Sub

public Sub GetUserName As String
	Return UserName
End Sub

public Sub GetPassword As String
	Return Password
End Sub


Public Sub TableList As List
	Dim result As List
	result = DBMySQL.TableList
	If Not (result.IsInitialized) Then
		result.Initialize
		Log("Error! No tables found!")
	End If
	Return result
End Sub

'SQL Query
Public Sub ExecuteNonQuery(sql As String)
	DBMySQL.ExecuteNonQuery(sql)
End Sub

Public Sub Query(sql As String, SkipErrorMessage As Boolean) As List
	Dim result As List
	result.Initialize
	Log("Executing SQL: " & sql)
	Try
				result = DBMySQL.Query(sql)
		Log("Result: " & result)
		'		Log("SQL: " & sql)
		If result.Size = 0 Then
			'			result.Initialize
			Log("Error! No data from query!")
			Msgbox("errNoData", "Error")
		End If
		Return result
	Catch
		Dim err As String = LastException.Message
		Log(err)
		If Not (SkipErrorMessage) Then
			If err.Contains("sql") Then
				Msgbox("errSQLError" & Chr(10) & Chr(10) & LastException, "Error")
			Else
				Msgbox("ErrUnexpected", "Error")
			End If
		End If
		Return result
	End Try
End Sub

Public Sub DisableStrictMode 'Disables Strict Network Mode for TargetSDK later than 8/9
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