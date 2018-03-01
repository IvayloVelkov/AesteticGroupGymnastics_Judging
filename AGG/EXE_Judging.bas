Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
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
	
	
	page(0).AddView(label(0), 0, 11%y, 50%x, 15%y)
	label(0).Text = Main.translate.GetString("AVlabal1")
	label(0).TextColor = Colors.White
	
	page(1).AddView(label(1), 0, 11%y, 50%x, 15%y)
	label(1).Text = Main.translate.GetString("AVlabal1")
	label(1).TextColor = Colors.White
	
	page(2).AddView(label(2), 0, 11%y, 50%x, 15%y)
	label(2).Text = Main.translate.GetString("AVlabal1")
	label(2).TextColor = Colors.White
	
	page(3).AddView(label(3), 0, 11%y, 50%x, 15%y)
	label(3).Text = Main.translate.GetString("AVlabal1")
	label(3).TextColor = Colors.White
	
End Sub

Private Sub ready_Click
	CallSub(Main, "FinalClick")
End Sub

Public Sub asView As Panel
	Return exePanel
End Sub