B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
Sub Class_Globals
	Private IP, Database, UserName, Password As String
	Private DBMySQL As MYSQL
	Private DatabaseTimeout As Int = 10000	'10 seconds timeout

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Sub PerformUpload ()
	Dim mylist As List
	Dim m As Map

	mylist.Initialize
   
		m.Initialize
		m.Put("teamname", HelperFunctions.TeamName)
		m.Put("avResult", HelperFunctions.avResult)
		m.Put("tvResult", HelperFunctions.tvResult)
		m.Put("exeResult", HelperFunctions.exeResult)
		m.Put("JudgeName", ProgramData.strUser)
		m.Put("JudgeTType", ProgramData.activeJ)
   
	Log(m)
   		mylist.Add(m)
	Log(mylist)
	Dim j As JSONGenerator
	j.Initialize2(mylist)
	Log(j.ToPrettyString(5))
   Try
	Dim job As HttpJob
	job.Initialize("SendResults", Me)
	job.PostString("https://" & ProgramData.dbIP & ":8080/results", j.ToString)
   
	ToastMessageShow("Sending...", True)
	Catch
		ToastMessageShow("No conection to DataBase", True)

	End Try
End Sub

Public Sub SetDatabase(address As String, base As String, user As String, pass As String)

	IP = address
	Database = base
	UserName = user
	Password = pass
	DBMySQL.setDatabase(IP, Database, UserName, Password, DatabaseTimeout)
	
End Sub


Sub JobDone (Job As HttpJob)
	Dim res As String
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success = True Then
		res = Job.GetString
        Log(res)
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub