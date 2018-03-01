Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Sub Class_Globals
	Public finalPanel As Panel
	Private teamname As EditText
	Private teamscore As Label
	Private score As Double
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
	teamscore.Text = "0.00"
	teamscore.Gravity = Gravity.CENTER
	
	finalPanel.AddView(SendBtn, 20%x, 55%y, 60%x, 10%y)
	SendBtn.Text = "Send"
	SendBtn.Gravity = Gravity.CENTER
End Sub

Public Sub asView As Panel
	Return finalPanel
End Sub

Private Sub send_Click
'	Main.DB.Exec_Query("")
End Sub