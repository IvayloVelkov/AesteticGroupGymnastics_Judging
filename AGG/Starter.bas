B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=7.3
@EndOfDesignText@
#Region  Service Attributes 
'	#StartAtBoot: False
'	#ExcludeFromLibrary: True
#End Region
'
Sub Process_Globals
'	Public mysql As JdbcSQL
'	Private driver As String = "com.mysql.jdbc.Driver"
'	Private jdbcUrl As String = "jdbc:mysql://192.168.0.6/test"
'	Private Username As String = "username"
'	Private Password As String = "password"
End Sub
'
'Sub Service_Create
'	'need to disable it as reading from large JdbcResultSet will cause network requests to be sent on the main thread.
'	DisableStrictMode
'End Sub
'
'Sub Service_Start (StartingIntent As Intent)
'
'End Sub
'
'Sub DisableStrictMode
'	Dim jo As JavaObject
'	jo.InitializeStatic("android.os.Build.VERSION")
'	If jo.GetField("SDK_INT") > 9 Then
'		Dim policy As JavaObject
'		policy = policy.InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder", Null)
'		policy = policy.RunMethodJO("permitAll", Null).RunMethodJO("build", Null)
'		Dim sm As JavaObject
'		sm.InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy", Array(policy))
'	End If
'End Sub
'
'Sub Connect As ResumableSub
'	mysql.InitializeAsync("mysql", driver, jdbcUrl, Username, Password)
'	Wait For MySQL_Ready (Success As Boolean)
'	If Success = False Then
'		Log("Check unfiltered logs for JDBC errors.")
'	End If
'	Return Success
'End Sub
'
'Sub CloseConnection
'	mysql.Close
'End Sub
'
'Sub ListAnimals As ResumableSub
'	Wait For (Connect) Complete (Success As Boolean)
'	If Success Then
'		Try
'			Dim sf As Object = mysql.ExecQueryAsync("mysql", "SELECT id, name FROM animals WHERE id > ?", Array(300))
'			Wait For (sf) mysql_QueryComplete (Success As Boolean, Crsr As JdbcResultSet)
'			If Success Then
'				Do While Crsr.NextRow
'					Log($"Id: ${Crsr.GetInt("id")}, Name: ${Crsr.GetString("name")}"$)
'				Loop
'				Crsr.Close
'			End If
'		Catch
'			Success = False
'			Log(LastException)
'		End Try
'		CloseConnection
'	End If
'	Return Success
'End Sub
'
'Sub Service_TaskRemoved
'	'This event will be raised when the user removes the app from the recent apps list.
'End Sub
'
''Return true to allow the OS default exceptions handler to handle the uncaught exception.
'Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	Return True
'End Sub
'
'Sub Service_Destroy
'
'End Sub
