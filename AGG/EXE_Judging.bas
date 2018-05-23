B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
Sub Class_Globals
	Public exePanel As Panel
	Public Pager As AHViewPager
	Public Container As AHPageContainer
	Private page(1) As Panel
	Private label(8) As Label
	Dim Tabs As AHViewPagerTabs
	Dim Line As Panel
	Dim Line2 As Panel
	Dim downPanel As Panel
	Dim btnready As Button
	Private chekpointbox As CheckBox
	Private btnPoints(7) As Button
	Public maxValue As Double = 10.00
	Public exeScore As Double
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	exePanel.Initialize("")
	page(0).Initialize("")
	For i = 0 To 7
		label(i).Initialize("")
	Next
	chekpointbox.Initialize("check")
	For i = 0 To 6
		btnPoints(i).Initialize("addPan")
	Next
	downPanel.Initialize("")
	btnready.Initialize("ready")
End Sub

Public Sub BuildUi
	Container.Initialize
		
	Container.AddPage(page(0), Main.translate.GetString("AvPage0"))

	Pager.Initialize(Container, "MPager")
	
	Tabs.Initialize(Pager)
	Tabs.LineHeight = 5dip
	Tabs.LineColorCenter = Colors.Red
	Tabs.TextColor = Colors.Gray
	Tabs.TextColorCenter = Colors.Yellow

	exePanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)
				
	'We add a line below the tab page indicator because it looks good
	Dim Col As ColorDrawable
	
	Col.Initialize(Colors.Green, 0)
	
	Line.Initialize("")
	Line.Background = Col
	
	Line2.Initialize("")
	Line2.Background = Col
	
	exePanel.AddView(Line, 0dip, 35dip, exePanel.Width, 2dip)
	
	'Now we can add the pager to the activity
	exePanel.AddView(Pager, 0dip, 35dip + 2dip, exePanel.Width, exePanel.Height - 35dip - 2dip)
	
	exePanel.AddView(downPanel, 0, exePanel.Height - 35dip, exePanel.Width, exePanel.Height - 35dip - 2dip)
	exePanel.AddView(Line2, 0dip, exePanel.Height - (35dip + 2dip), exePanel.Width, 2dip)

	downPanel.AddView(btnready, downPanel.Width - 12%x, 0, 10%x, 33dip)
	
	page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)
	label(0).Text = Main.translate.GetString("AVlabal0")
	label(0).TextColor = Colors.White
	
	page(0).AddView(btnPoints(0), label(0).left + label(0).Width + 10%x, label(0).Top, 15%x, 10%y)
	btnPoints(0).Text = Main.translate.GetString("Checkl0")

	For i = 1 To 7
		page(0).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("AVlabal" & i)
		label(i).TextColor = Colors.White
	Next
	
	For i = 1 To 6
		page(0).AddView(btnPoints(i), label(i).left + label(i).Width + 10%x, label(i).Top, 15%x, 10%y)
		btnPoints(i).Text = Main.translate.GetString("addPan" & i)
	Next
	
	page(0).AddView(chekpointbox, label(7).left + label(7).Width + 10%x, label(7).Top, 15%x, 10%y)
	chekpointbox.Text = Main.translate.GetString("addPan" & i)
End Sub

Public Sub addPan_Click
	exeScore = exeScore + 0.1
	Log(exeScore)
End Sub

Private Sub check_CheckedChange(Checked As Boolean)
	If Checked = True Then
		exeScore = exeScore + 0.1
		Log(exeScore)
	Else
		exeScore = exeScore - 0.1
	End If
End Sub

Public Sub finalEXEscore As Double
	exeScore = maxValue - exeScore
	Log("EXESCORE:"&exeScore)
	Return exeScore
End Sub

Private Sub ready_Click
	CallSub(Main, "FinalClick")
	finalEXEscore
End Sub

Public Sub asView As Panel
	Return exePanel
End Sub