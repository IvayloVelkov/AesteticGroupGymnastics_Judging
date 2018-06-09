Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
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
'	j.Initialize2(mylist)
	j.Initialize(m)
	Log(j.ToPrettyString(1))
   
	Dim job As HttpJob
		job.Initialize("SendResults", Me)
	job.PostString("http://192.168.97.33:8080/results", j.ToString)
	job.GetRequest.SetContentType("application/json")
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