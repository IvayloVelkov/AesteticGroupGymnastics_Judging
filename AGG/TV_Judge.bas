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
	Private label(6) As Label
	Private label2(6) As Label
	Dim Tabs As AHViewPagerTabs
	Dim Line As Panel
	Dim Line2 As Panel
	Dim downPanel As Panel
	Dim btnready As Button
	Private chekpointbox1(6) As CheckBox
	Private chekpointbox2(6) As CheckBox
	Private chekpointbox22(6) As CheckBox
	Private chekpointbox3(6) As CheckBox
	Private chekpointbox32(6) As CheckBox
	Public tvScore As Double
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	tvPanel.Initialize("")
	For i = 0 To 1
		page(i).Initialize("")
	Next
	For i = 0 To 5
		label(i).Initialize("")
	Next
	
	For i = 0 To 5
		label2(i).Initialize("")
	Next
	
	For i = 0 To 5
		chekpointbox1(i).Initialize("check1")
	Next
	For i = 0 To 5
		chekpointbox2(i).Initialize("check2")
	Next
	For i = 0 To 5
		chekpointbox22(i).Initialize("check22")
	Next
	For i = 0 To 5
		chekpointbox3(i).Initialize("check3")
	Next	
	For i = 0 To 5
		chekpointbox32(i).Initialize("check32")
	Next

	downPanel.Initialize("")
	btnready.Initialize("ready")
	HelperFunctions.Apply_ViewStyle(btnready,Colors.White,0xff4ac2ff,0xff149be0,0xff2cb7ff,0xff2cb7ff,0x66040509,0x66040509,20)
	btnready.Text = Main.translate.GetString("readyBtn")

End Sub

Public Sub BuildUi
	Container.Initialize
		
	Container.AddPage(page(0), Main.translate.GetString("TvPage0"))
	Container.AddPage(page(1), Main.translate.GetString("TvPage1"))

	Pager.Initialize(Container, "MPager")
	
	Tabs.Initialize(Pager)
	Tabs.LineHeight = 5dip
	Tabs.LineColorCenter = Colors.Red
	Tabs.TextColor = Colors.Gray
	Tabs.TextColorCenter = Colors.Yellow

	tvPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)
				
	'We add a line below the tab page indicator because it looks good
	Dim Col As ColorDrawable
	
	Col.Initialize(0xff149be0, 0)
	
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
	
	page(0).AddView(chekpointbox1(0), label(0).left + label(0).Width, label(0).Top, 30%x, 10%y)
'	chekpointbox(0).Text = Main.translate.GetString("Check0")
	chekpointbox1(0).Text = HelperFunctions.TvScore1
	chekpointbox1(0).Tag = 0 
	page(0).AddView(chekpointbox2(0), chekpointbox1(0).left + chekpointbox1(0).Width, chekpointbox1(0).Top, 30%x, 10%y)
'	chekpointbox(13).Text = Main.translate.GetString("Check14")
	chekpointbox2(0).Tag = 0
	chekpointbox2(0).Text = HelperFunctions.TvScore2

	For i = 1 To 5
		page(0).AddView(label(i), 2%x, label(i - 1).Top + label(i - 1).Height + 3dip, 50%x, 10%y)
		label(i).Text = Main.translate.GetString("TVlabel" & i)
		label(i).TextColor = Colors.White
		
		page(0).AddView(chekpointbox1(i), label(i).left + label(i).Width, label(i).Top, 30%x, 10%y)
'		chekpointbox(i).Text = Main.translate.GetString("Check" & i)
		chekpointbox1(i).Text = HelperFunctions.TvScore1
		chekpointbox1(i).Tag = i

		page(0).AddView(chekpointbox2(i), chekpointbox1(i).left + chekpointbox1(i).Width, chekpointbox1(i).Top, 30%x, 10%y)
'		chekpointbox(i).Text = Main.translate.GetString("Check" & i)
		chekpointbox2(i).Text = HelperFunctions.TvScore2
		chekpointbox2(i).Tag = i


	Next
	
	page(1).AddView(label2(0), 2%x, 5%y, 50%x, 10%y)
	label2(0).Text = Main.translate.GetString("TVlabel6")
	label2(0).TextColor = Colors.White
	
	page(1).AddView(chekpointbox22(0), label2(0).left + label2(0).Width, label2(0).Top, 15%x, 10%y)
'	chekpointbox(0).Text = Main.translate.GetString("Check0")
	chekpointbox22(0).Text = HelperFunctions.TvScore2
	chekpointbox22(0).Tag = 0

	page(1).AddView(chekpointbox3(0), chekpointbox22(0).left + chekpointbox22(0).Width, chekpointbox22(0).Top, 15%x, 10%y)
'	chekpointbox(13).Text = Main.translate.GetString("Check14")
	chekpointbox3(0).Text = HelperFunctions.TvScore3
	chekpointbox3(0).Tag = 0

	
	page(1).AddView(chekpointbox32(0), chekpointbox3(0).left + chekpointbox3(0).Width, chekpointbox3(0).Top, 15%x, 10%y)
'	chekpointbox(13).Text = Main.translate.GetString("Check14")
	chekpointbox32(0).Text = HelperFunctions.TvScore5
	chekpointbox32(0).Tag = 0

	
	For i = 1 To 5
		page(1).AddView(label2(i), 2%x, label2(i - 1).Top + label2(i - 1).Height + 3dip, 50%x, 10%y)
		label2(i).Text = Main.translate.GetString("TVlabel" & i)
		label2(i).TextColor = Colors.White
	Next
	
	For i = 1 To 5
		page(1).AddView(chekpointbox22(i),label2(i).left + label2(i).Width, label2(i).Top, 15%x, 10%y)
		'chekpointbox(i).Text = Main.translate.GetString("Check" & i)
		chekpointbox22(i).Text = HelperFunctions.TvScore2
		chekpointbox22(i).Tag = i

		page(1).AddView(chekpointbox3(i),chekpointbox22(i).left + chekpointbox22(i).Width, chekpointbox22(i).Top, 15%x, 10%y)
		'chekpointbox(i).Text = Main.translate.GetString("Check" & i)
		chekpointbox3(i).Text = HelperFunctions.TvScore3
		chekpointbox3(i).Tag = i

		page(1).AddView(chekpointbox32(i), chekpointbox3(i).left + chekpointbox3(i).Width, chekpointbox3(i).Top, 15%x, 10%y)
		'chekpointbox(i).Text = Main.translate.GetString("Check" & i)
		chekpointbox32(i).Text = HelperFunctions.TvScore5
		chekpointbox32(i).Tag = i

	Next

End Sub

Private Sub check1_CheckedChange(checked As Boolean)
	Private chek1 As CheckBox = Sender
	chek1 = Sender
	If chek1.Checked = True Then
		tvScore = tvScore + 0.1
		If chekpointbox2(chek1.Tag).Checked = True Then
			tvScore = tvScore - 0.2
			chekpointbox2(chek1.Tag).Checked = False

		End If
	Else
		tvScore = tvScore - 0.1
	End If
End Sub

Private Sub check2_CheckedChange(checked As Boolean)	
	Private chek2 As CheckBox
	chek2 = Sender

	If chek2.Checked = True Then
		tvScore = tvScore + 0.2
		If chekpointbox1(chek2.Tag).Checked = True Then
			tvScore = tvScore - 0.1
			chekpointbox1(chek2.Tag).Checked = False
		End If
	Else
		tvScore = tvScore - 0.2
	End If
End Sub

Private Sub check3_CheckedChange(checked As Boolean)
	Private chek3 As CheckBox = Sender
	chek3 = Sender
	 If chek3.Checked = True Then
		tvScore = tvScore + 0.2
		If chekpointbox22(chek3.Tag).Checked = True Then
			tvScore = tvScore - 0.3
			chekpointbox22(chek3.Tag).Checked = False
		End If
		If chekpointbox32(chek3.Tag).Checked = True Then
			tvScore = tvScore - 0.5
			chekpointbox32(chek3.Tag).Checked = False
		End If
	Else
		tvScore = tvScore - 0.3
	End If
End Sub

Private Sub check22_CheckedChange(checked As Boolean)
	Private chek22 As CheckBox = Sender
	chek22 = Sender
	 If chek22.Checked = True Then
		tvScore = tvScore + 0.3
		If chekpointbox3(chek22.Tag).Checked = True Then
			tvScore = tvScore - 0.2
			chekpointbox3(chek22.Tag).Checked = False
		End If
		If chekpointbox32(chek22.Tag).Checked = True Then
			tvScore = tvScore - 0.5
			chekpointbox32(chek22.Tag).Checked = False
		End If

	Else
		tvScore = tvScore - 0.3
	End If
End Sub

Private Sub check32_CheckedChange(checked As Boolean)
	Private chek32 As CheckBox = Sender
	chek32 = Sender
	 If chek32.Checked = True Then
		tvScore = tvScore + 0.5
		If chekpointbox22(chek32.Tag).Checked = True Then
			tvScore = tvScore - 0.3
			chekpointbox22(chek32.Tag).Checked = False
		End If
		If chekpointbox3(chek32.Tag).Checked = True Then
			tvScore = tvScore - 0.2
			chekpointbox3(chek32.Tag).Checked = False
		End If

	Else
		tvScore = tvScore - 0.5
	End If
End Sub

Public Sub finalTVscore As Double
	Log("AVSCORE:"&tvScore)
	Return tvScore
End Sub

Private Sub ready_Click
	CallSub(Main, "FinalClick")
	finalTVscore
End Sub

Public Sub asView As Panel
	Return tvPanel
End Sub