B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Private ServerUrl As String = "http://localhost:8080/result"
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	Dim job As HttpJob
	job.Initialize("Job1", Me)
	job.PostString(ServerUrl, "SELECT name, avResult, tvResult, exeResult FROM Results")

End Sub

Sub JobDone (Job As HttpJob)
	If Job.Success Then
		Dim parser As JSONParser
		Dim response As String = Job.GetString
		parser.Initialize(response)
		Dim rows As List
		rows = parser.NextArray
		
		'work with result
		'rows is a List. Each item is a Map with the columns names as keys and the db values as the values.
		For i = 0 To rows.Size - 1
			Log("Rows #" & i)
			Dim m As Map
			m = rows.Get(i)
			Log("teamname" & m.Get("teamname")) 'log the values of col1 and col2
			Log("avResult" & m.Get("avResult"))
			Log("tvResult" & m.Get("tvResult"))
			Log("exeResult" & m.Get("exeResult"))
		Next
	End If
	Job.Release
End Sub
