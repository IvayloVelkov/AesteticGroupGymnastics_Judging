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
	Private page(4) As Panel
	Private label(35) As Label
	Dim Tabs As AHViewPagerTabs
	Dim Line As Panel
	Dim Line2 As Panel
	Dim downPanel As Panel
	Dim btnready As Button
	Private chekpointbox(35) As CheckBox

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	exePanel.Initialize("")
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
	
	
	For i = 1 To 7
		page(0).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("AVlabal" & i)
		label(i).TextColor = Colors.White
		page(0).AddView(chekpointbox(i), label(i).left + label(i).Width + 10%x, label(i).Top, 30%x, 10%y)
		chekpointbox(i).Text = Main.translate.GetString("Check" & i)

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
		chekpointbox(i).Text = Main.translate.GetString("Check" & i)

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
		chekpointbox(i).Text = Main.translate.GetString("Check" & i)

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
		chekpointbox(i).Text = Main.translate.GetString("Check" & i)
	Next
End Sub

Private Sub ready_Click
	CallSub(Main, "FinalClick")
End Sub

Public Sub asView As Panel
	Return exePanel
End Sub