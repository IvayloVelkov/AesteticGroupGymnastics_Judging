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
			s = s & ",'" & HelperFunctions.avResult & "'"
			s = s & ",'" & HelperFunctions.tvResult & "'"
			s = s & ",'" & HelperFunctions.exeResult & "')"
			
			SQL = SQL & s
			
	If SQL.Length > 0 Then
			Main.DataBaseSQL.ExecuteNonQuery(SQL)
	End If
	
End Sub