﻿Type=Class
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
		chekpointbox(i).Initialize("")
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
	page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)
	label(0).Text = Main.translate.GetString("AVlabal0")
	label(0).TextColor = Colors.White
	
	page(0).AddView(chekpointbox(0), label(0).left + label(0).Width + 10%x, label(0).Top, 30%x, 10%y)
	chekpointbox(0).Text = Main.translate.GetString("Checkl0")

	
	For i = 1 To 7
		page(0).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("AVlabal" & i)
		label(i).TextColor = Colors.White
		page(0).AddView(chekpointbox(i), label(i).left + label(i).Width + 10%x, label(i).Top, 30%x, 10%y)
		chekpointbox(i).Text = Main.translate.GetString("Checkl" & i)

	Next
	
	page(1).AddView(label(8), 2%x, 5%y, 50%x, 10%y)
	label(8).Text = Main.translate.GetString("AVlabal8")
	label(8).TextColor = Colors.White
	
	page(1).AddView(chekpointbox(8), label(8).left + label(8).Width + 10%x, label(8).Top, 30%x, 10%y)
	chekpointbox(8).Text = Main.translate.GetString("Checkl8")
	
	For i = 9 To 15
		page(1).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("AVlabal" & i)
		label(i).TextColor = Colors.White
		page(1).AddView(chekpointbox(i), label(i).left + label(i).Width + 10%x, label(i).Top, 30%x, 10%y)
		chekpointbox(i).Text = Main.translate.GetString("Checkl" & i)

	Next
	
	page(2).AddView(label(16),2%x, 5%y, 50%x, 10%y)
	label(16).Text = Main.translate.GetString("AVlabal17")
	label(16).TextColor = Colors.White
	page(2).AddView(chekpointbox(16), label(16).left + label(16).Width + 10%x, label(16).Top, 30%x, 10%y)
	chekpointbox(16).Text = Main.translate.GetString("Checkl8")
	
	
	For i = 17 To 23
		page(2).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("AVlabal" & i)
		label(i).TextColor = Colors.White
		page(2).AddView(chekpointbox(i), label(i).left + label(i).Width + 10%x, label(i).Top, 30%x, 10%y)
		chekpointbox(i).Text = Main.translate.GetString("Checkl" & i)

	Next
	
	page(3).AddView(label(24), 2%x, 5%y, 50%x, 10%y)
	label(24).Text = Main.translate.GetString("AVlabal26")
	label(24).TextColor = Colors.White
	page(3).AddView(chekpointbox(24), label(24).left + label(24).Width + 10%x, label(24).Top, 30%x, 10%y)
	chekpointbox(24).Text = Main.translate.GetString("Checkl8")
	
	For i = 25 To 31
		page(3).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("AVlabal" & i)
		label(i).TextColor = Colors.White
		page(3).AddView(chekpointbox(i), label(i).left + label(i).Width + 10%x, label(i).Top, 30%x, 10%y)
		chekpointbox(i).Text = Main.translate.GetString("Checkl" & i)
	Next
	
End Sub

Private Sub ready_Click
	CallSub(Main, "FinalClick")
End Sub

Public Sub asView As Panel
	Return avPanel
End Sub