Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Sub Class_Globals
	Public avPanel As Panel
	Public Pager As AHViewPager
	Public Container As AHPageContainer
	Private page(4) As Panel
	Private label(35) As Label
	Private chekpointbox(35) As CheckBox
	Dim Tabs As AHViewPagerTabs
	Dim Line As Panel
	Dim Line2 As Panel
	Dim downPanel As Panel
	Dim btnready As Button
	Public avScore As Double
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	avPanel.Initialize("")
	For i = 0 To 3
		page(i).Initialize("")
	Next
	For i = 0 To 34
		label(i).Initialize("")
	Next
	For i = 0 To 34
		chekpointbox(i).Initialize("check")
	Next
	downPanel.Initialize("")
	btnready.Initialize("ready")
End Sub

Public Sub BuildUi
	Container.Initialize
		
	Container.AddPage(page(0), Main.translate.GetString("AvPage0"))
	Container.AddPage(page(1), Main.translate.GetString("AvPage1"))
	Container.AddPage(page(2), Main.translate.GetString("AvPage2"))
	Container.AddPage(page(3), Main.translate.GetString("AvPage3"))

	Pager.Initialize(Container, "MPager")
	
	Tabs.Initialize(Pager)
	Tabs.LineHeight = 5dip
	Tabs.LineColorCenter = Colors.Red
	Tabs.TextColor = Colors.Gray
	Tabs.TextColorCenter = Colors.Yellow

	avPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)
				
	'We add a line below the tab page indicator because it looks good
	Dim Col As ColorDrawable
	
	Col.Initialize(Colors.Green, 0)
	
	Line.Initialize("")
	Line.Background = Col
	
	Line2.Initialize("")
	Line2.Background = Col
	
	avPanel.AddView(Line, 0dip, 35dip, avPanel.Width, 2dip)
	
	'Now we can add the pager to the activity
	avPanel.AddView(Pager, 0dip, 35dip + 2dip, avPanel.Width, avPanel.Height - 35dip - 2dip)
	
	avPanel.AddView(downPanel, 0, avPanel.Height - 35dip, avPanel.Width, avPanel.Height - 35dip - 2dip)
	avPanel.AddView(Line2, 0dip, avPanel.Height - (35dip + 2dip), avPanel.Width, 2dip)

	downPanel.AddView(btnready, downPanel.Width - 12%x, 0, 10%x, 33dip)
	
	Dim lblHeigh As Int = (avPanel.Height - downPanel.Height) / 7
	Log(lblHeigh)
	page(0).AddView(label(0), 2%x, 5%y, 50%x, 7%y)
	label(0).Text = Main.translate.GetString("AVlabal0")
	label(0).TextColor = Colors.White
	
	page(0).AddView(chekpointbox(0), label(0).left + label(0).Width + 10%x, label(0).Top, 15%x, 5%y)
	chekpointbox(0).Text = HelperFunctions.TvScore1

	
	For i = 1 To 3
		page(0).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("AVlabal" & i)
		label(i).TextColor = Colors.White
		page(0).AddView(chekpointbox(i), label(i).left + label(i).Width + 10%x, label(i).Top, 15%x, 5%y)
		chekpointbox(i).Text = HelperFunctions.TvScore1

	Next
	
	page(1).AddView(label(4), 2%x, 5%y, 50%x, 7%y)
	label(4).Text = Main.translate.GetString("AVlabal4")
	label(4).TextColor = Colors.White
	
	page(1).AddView(chekpointbox(4), label(4).left + label(4).Width + 10%x, label(4).Top, 15%x, 7%y)
	chekpointbox(4).Text = HelperFunctions.TvScore1
	
	For i = 5 To 15
		page(1).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 7%y)
		label(i).Text = Main.translate.GetString("AVlabal" & i)
		label(i).TextColor = Colors.White
		page(1).AddView(chekpointbox(i), label(i).left + label(i).Width + 10%x, label(i).Top, 15%x, 5%y)
		chekpointbox(i).Text = HelperFunctions.TvScore1

	Next
	
	page(2).AddView(label(16),2%x, 5%y, 50%x, 7%y)
	label(16).Text = Main.translate.GetString("AVlabal16")
	label(16).TextColor = Colors.White
	page(2).AddView(chekpointbox(16), label(16).left + label(16).Width + 10%x, label(16).Top, 15%x, 5%y)
	chekpointbox(16).Text = HelperFunctions.TvScore1
	
	
	For i = 17 To 27
		page(2).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 7%y)
		label(i).Text = Main.translate.GetString("AVlabal" & i)
		label(i).TextColor = Colors.White
		page(2).AddView(chekpointbox(i), label(i).left + label(i).Width + 10%x, label(i).Top, 15%x, 5%y)
		chekpointbox(i).Text = HelperFunctions.TvScore1

	Next
	
	page(3).AddView(label(28), 2%x, 5%y, 50%x, 10%y)
	label(28).Text = Main.translate.GetString("AVlabal28")
	label(28).TextColor = Colors.White
	page(3).AddView(chekpointbox(28), label(28).left + label(28).Width + 10%x, label(28).Top, 15%x, 10%y)
	chekpointbox(28).Text = HelperFunctions.TvScore1
	
	For i = 29 To 33
		page(3).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("AVlabal" & i)
		label(i).TextColor = Colors.White
		page(3).AddView(chekpointbox(i), label(i).left + label(i).Width + 10%x, label(i).Top, 15%x, 5%y)
		chekpointbox(i).Text = HelperFunctions.TvScore1
	Next
	
End Sub

Private Sub check_CheckedChange(Checked As Boolean)
	If Checked = True Then
		avScore = avScore + 0.1
		Log(avScore)
	Else 
		avScore = avScore - 0.1
	End If
End Sub

Public Sub finalAVscore As Double
	Log("AVSCORE:"&avScore)
	Return avScore
End Sub

Private Sub ready_Click
	CallSub(Main, "FinalClick")
	finalAVscore
End Sub

Public Sub asView As Panel
	Return avPanel
End Sub