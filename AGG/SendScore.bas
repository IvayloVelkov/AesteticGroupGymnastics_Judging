B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
Sub Class_Globals
	Public finalPanel As Panel
	Private teamname As EditText
	Private teamscore As Label
	Private SendBtn As Button
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	finalPanel.Initialize("")
	teamname.Initialize("")
	teamscore.Initialize("")
	SendBtn.Initialize("send")
	
	finalPanel.AddView(teamname, 20%x, 10%y, 60%x, 10%y)
	teamname.Hint = "Team Name"
	teamname.SingleLine = True
	
	finalPanel.AddView(teamscore, 20%x, 35%y, 60%x, 10%y)
	teamscore.Gravity = Gravity.CENTER
	
	finalPanel.AddView(SendBtn, 20%x, 55%y, 60%x, 10%y)
	SendBtn.Text = "Send"
	SendBtn.Gravity = Gravity.CENTER
End Sub

Public Sub finalScore
	teamscore.Text = CallSub(Main, "finalScore")

	Log("FINAL"&teamscore.Text)
End Sub

Public Sub asView As Panel
	Return finalPanel
End Sub

Private Sub send_Click
	If teamname.Text = "" Then
		Msgbox("Добавате име на отбора.","Липсва име.")
	End If
	
End Sub