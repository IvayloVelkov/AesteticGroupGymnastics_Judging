Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Sub Class_Globals
	Public typePanel As Panel
	Private btnAv As Button
	Private btnTv As Button
	Private btnExe As Button
	
	Private Padding As Int

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	typePanel.Initialize("")
	btnAv.Initialize("AVtypeBtn")
	btnTv.Initialize("TVtypeBtn")
	btnExe.Initialize("EXEtypeBtn")
	
	Padding = UISizes.DefaultPadding


	
	typePanel.AddView(btnAv,35%x, 20%y, 30%x, 10%y)
	typePanel.AddView(btnTv, 35%x, btnAv.Top+btnAv.Height*1.5+Padding, 30%x, 10%y)
	typePanel.AddView(btnExe, 35%x, btnTv.Top+btnTv.Height*1.5+Padding, 30%x, 10%y)
	
	HelperFunctions.Apply_ViewStyle(btnAv,Colors.White,0xff4ac2ff,0xff149be0,0xff2cb7ff,0xff2cb7ff,0x66040509,0x66040509,60)
	btnAv.Text = Main.translate.GetString("AVbtn")
	btnAv.Padding = Array As Int(15,0,0,0)
	btnAv.TextSize = 14
	
	HelperFunctions.Apply_ViewStyle(btnTv,Colors.White,0xff4ac2ff,0xff149be0,0xff2cb7ff,0xff2cb7ff,0x66040509,0x66040509,60)
	btnTv.Text = Main.translate.GetString("TVbtn")
	btnTv.Padding = Array As Int(15,0,0,0)
	btnTv.TextSize = 14

	HelperFunctions.Apply_ViewStyle(btnExe,Colors.White,0xff4ac2ff,0xff149be0,0xff2cb7ff,0xff2cb7ff,0x66040509,0x66040509,60)
	btnExe.Text = Main.translate.GetString("EXEbtn")
	btnExe.Padding = Array As Int(15,0,0,0)
	btnExe.TextSize = 14
End Sub

Public Sub asView As Panel
	Return typePanel
End Sub

Private Sub AVtypeBtn_Click
	CallSub(Main, "AV_Click")
End Sub

Private Sub TVtypeBtn_Click
	CallSub(Main, "TV_Click")
End Sub

Private Sub EXEtypeBtn_Click
	CallSub(Main, "EXE_Click")
End Sub