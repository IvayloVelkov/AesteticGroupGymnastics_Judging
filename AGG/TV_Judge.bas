B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
Sub Class_Globals
	Public tvPanel As Panel
	Public Pager As AHViewPager
	Public Container As AHPageContainer
	Private page(2) As Panel
	Private label(12) As Label
	Dim Tabs As AHViewPagerTabs
	Dim Line As Panel
	Dim Line2 As Panel
	Dim downPanel As Panel
	Dim btnready As Button
	Private chekpointbox(30) As CheckBox

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	tvPanel.Initialize("")
	For i = 0 To 1
		page(i).Initialize("")
	Next
	For i = 0 To 11
		label(i).Initialize("")
	Next
	For i = 0 To 29
		chekpointbox(i).Initialize("check")
	Next

	downPanel.Initialize("")
	btnready.Initialize("ready")
End Sub

Public Sub BuildUi
	Container.Initialize
		
	Container.AddPage(page(0), Main.translate.GetString("AvPage0"))
	Container.AddPage(page(1), Main.translate.GetString("AvPage1"))

	Pager.Initialize(Container, "MPager")
	
	Tabs.Initialize(Pager)
	Tabs.LineHeight = 5dip
	Tabs.LineColorCenter = Colors.Red
	Tabs.TextColor = Colors.Gray
	Tabs.TextColorCenter = Colors.Yellow

	tvPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)
				
	'We add a line below the tab page indicator because it looks good
	Dim Col As ColorDrawable
	
	Col.Initialize(Colors.Green, 0)
	
	Line.Initialize("")
	Line.Background = Col
	
	Line2.Initialize("")
	Line2.Background = Col
	
	tvPanel.AddView(Line, 0dip, 35dip, tvPanel.Width, 2dip)
	
	'Now we can add the pager to the activity
	tvPanel.AddView(Pager, 0dip, 35dip + 2dip, tvPanel.Width, tvPanel.Height - 35dip - 2dip)
	
	tvPanel.AddView(downPanel, 0, tvPanel.Height - 35dip, tvPanel.Width, tvPanel.Height - 35dip - 2dip)
	tvPanel.AddView(Line2, 0dip, tvPanel.Height - (35dip + 2dip), tvPanel.Width, 2dip)

	downPanel.AddView(btnready, downPanel.Width - 12%x, 0, 10%x, 33dip)
	
	
	page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)
	label(0).Text = Main.translate.GetString("TVlabel0")
	label(0).TextColor = Colors.White
	
	page(0).AddView(chekpointbox(0), label(0).left + label(0).Width, label(0).Top, 30%x, 10%y)
	chekpointbox(0).Text = Main.translate.GetString("Check0")
	page(0).AddView(chekpointbox(13), chekpointbox(0).left + chekpointbox(0).Width, chekpointbox(0).Top, 30%x, 10%y)
	chekpointbox(13).Text = Main.translate.GetString("Check14")

	
	For i = 1 To 5
		page(0).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("TVlabel" & i)
		label(i).TextColor = Colors.White
		page(0).AddView(chekpointbox(i), label(i).left + label(i).Width, label(i).Top, 30%x, 10%y)
		chekpointbox(i).Text = Main.translate.GetString("Check" & i)
	Next
	
	page(0).AddView(chekpointbox(6), chekpointbox(5).left + chekpointbox(5).Width, chekpointbox(5).Top, 30%x, 10%y)
	chekpointbox(7).Text = Main.translate.GetString("Check6")
	page(0).AddView(chekpointbox(7), chekpointbox(6).left + chekpointbox(6).Width, chekpointbox(6).Top, 30%x, 10%y)
	chekpointbox(7).Text = Main.translate.GetString("Check12")

	For i = 8 To 12
		page(0).AddView(chekpointbox(i), chekpointbox(i - 7).left + chekpointbox(i - 7).Width, chekpointbox(i - 7).Top, 30%x, 10%y)
		chekpointbox(i).Text = Main.translate.GetString("Check" & i)
	Next
	
	
	
	
	
	page(1).AddView(label(6), 2%x, 5%y, 50%x, 10%y)
	label(6).Text = Main.translate.GetString("TVlabel6")
	label(6).TextColor = Colors.White
	
	page(1).AddView(chekpointbox(14), label(6).left + label(6).Width, label(6).Top, 30%x, 10%y)
	chekpointbox(14).Text = Main.translate.GetString("Checkl6")
	page(1).AddView(chekpointbox(15), chekpointbox(14).left + chekpointbox(14).Width, chekpointbox(14).Top, 30%x, 10%y)
	chekpointbox(15).Text = Main.translate.GetString("Checkl6")
	
	For i = 7 To 11
		page(1).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("TVlabel" & i)
		label(i).TextColor = Colors.White
	Next
	
	For i = 16 To 20
		page(1).AddView(chekpointbox(i),label(i - 9).left + label(i - 9).Width, label(i - 9).Top, 30%x, 10%y)
		chekpointbox(i).Text = Main.translate.GetString("Check" & i)
	Next
	
	For i = 21 To 25
		page(1).AddView(chekpointbox(i), chekpointbox(i - 5).left + chekpointbox(i - 5).Width, chekpointbox(i - 5).Top, 30%x, 10%y)
		chekpointbox(i).Text = Main.translate.GetString("Check" & i)
	Next
	
	
	
End Sub

Private Sub ready_Click
	CallSub(Main, "FinalClick")
End Sub

Public Sub asView As Panel
	Return tvPanel
End Sub