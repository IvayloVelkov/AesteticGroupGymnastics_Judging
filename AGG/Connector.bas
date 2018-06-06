B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Private ServerUrl As String = "http://localhost:8080/results"
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub


Public Sub SendToDatabase
	SendOrdersToDatabase	
End Sub

Private Sub SendOrdersToDatabase
	Dim s As String
	Dim SQL As String
		
	SQL = ""
			s = "INSERT INTO Results "
			s = s & "(teamname"
			s = s & ",avResult"
			s = s & ",tvResult"
			s = s & ",exeResult"
			s = s & " VALUES"
			s = s & "('" & HelperFunctions.TeamName & "'"
			s = s & ",'" & CallSub(Main, "finalScore") & "')"
			
			SQL = SQL & s
			
	If SQL.Length > 0 Then
			Main.DataBaseSQL.ExecuteNonQuery(SQL)
	End If
	
End Sub