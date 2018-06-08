B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
Sub Class_Globals
	
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
   
	Log(m)
   		mylist.Add(m)
	Log(mylist)
	Dim j As JSONGenerator
	j.Initialize2(mylist)
	Log(j.ToPrettyString(5))
   
	Dim job As HttpJob
		job.Initialize("SendResults", Me)
	job.PostString("https://192.168.8.100:8080/results", j.ToString)
'	job.PostString("https://aggserver.herokuapp.com/results", j.ToString)
   
	ToastMessageShow("Sending...", True)
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