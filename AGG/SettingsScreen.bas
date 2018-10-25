B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Private pnlSettings As Panel
	Dim backgroundColor As Int = Colors.ARGB(255, 180, 180, 180)
	Dim vLeft, vLeft1, vTop, vTop1 As Int
	
	'Connection UI
	Dim lbServerAdress, lbDatabaseName, lbUserName, lbPassword As Label
	Dim etServerAdress, etDatabaseName, etUserName, etPassword As EditText
	
	'Interface Settings
	Dim lbLanguage, lbFontSize As Label
	Dim spLanguage, spFontSize As Spinner
	
	Dim lbConfigTitle, lbInterfaceTitle As Label
	
	Dim LangSelectedIndex As Int = 0
	Dim LangSelectedAbb As String = "EN"
	Dim FontSize, FontSizeIndex, DBEngineIndex As Int = 0
	
	Dim bitmap As Bitmap
	
	Dim btnTestConnection As Button
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	pnlSettings.Initialize("")
	pnlSettings.Color = backgroundColor
	
	vLeft = 2%x
	vTop1 = 50%y
	vLeft1 = vLeft

	'Init all views
	lbConfigTitle.Initialize("")
	lbConfigTitle.Gravity = Gravity.CENTER_VERTICAL
	lbConfigTitle.TextColor = Colors.RGB(0, 0, 0)
	lbConfigTitle.TextSize = UISizes.DefaultBigTitleSize

	'Set ET(edit texts)
	etServerAdress.Initialize("")
'	etServerAdress.SetBackgroundImage(Resources.bmpETBackground)
	etServerAdress.Gravity = Gravity.CENTER_VERTICAL
	etServerAdress.SingleLine = True
	etServerAdress.TextColor = Colors.Black
	etServerAdress.TextSize = UISizes.DefaultTextSize
	etServerAdress.HintColor = Colors.RGB(180, 180, 180)
	
	etDatabaseName.Initialize("")
'	etDatabaseName.SetBackgroundImage(Resources.bmpETBackground)
	etDatabaseName.Gravity = Gravity.CENTER_VERTICAL
	etDatabaseName.SingleLine = True
	etDatabaseName.TextColor = Colors.Black
	etDatabaseName.TextSize = UISizes.DefaultTextSize
	etDatabaseName.HintColor = Colors.RGB(180, 180, 180)

	etUserName.Initialize("")
'	etUserName.SetBackgroundImage(Resources.bmpETBackground)
	etUserName.Gravity = Gravity.CENTER_VERTICAL
	etUserName.SingleLine = True
	etUserName.TextColor = Colors.Black
	etUserName.TextSize = UISizes.DefaultTextSize
	etUserName.HintColor = Colors.RGB(180, 180, 180)
	
	
	etPassword.Initialize("etPassword")
'	etPassword.SetBackgroundImage(Resources.bmpETBackground)
	etPassword.Gravity = Gravity.CENTER_VERTICAL
	etPassword.SingleLine = True
	etPassword.PasswordMode = True
	etPassword.TextColor = Colors.Black
	etPassword.TextSize = UISizes.DefaultTextSize
	etPassword.HintColor = Colors.RGB(180, 180, 180)
	
	
	'Labels
	lbServerAdress.Initialize("")
	lbServerAdress.Gravity = Gravity.CENTER_VERTICAL
	lbServerAdress.TextColor = Colors.RGB(0, 0, 0)
	lbServerAdress.TextSize = UISizes.DefaultTextSize
	
	lbDatabaseName.Initialize("")
	lbDatabaseName.Gravity = Gravity.CENTER_VERTICAL
	lbDatabaseName.TextColor = Colors.RGB(0, 0, 0)
	lbDatabaseName.TextSize = UISizes.DefaultTextSize
	
	lbUserName.Initialize("")
	lbUserName.Gravity = Gravity.CENTER_VERTICAL
	lbUserName.TextColor = Colors.RGB(0, 0, 0)
	lbUserName.TextSize = UISizes.DefaultTextSize
	
	lbPassword.Initialize("")
	lbPassword.Gravity = Gravity.CENTER_VERTICAL
	lbPassword.TextColor = Colors.RGB(0, 0, 0)
	lbPassword.TextSize = UISizes.DefaultTextSize
	
	'Interface
	lbInterfaceTitle.Initialize("")
	lbInterfaceTitle.TextSize = UISizes.DefaultBigTitleSize
	lbInterfaceTitle.TextColor = Colors.RGB(0, 0, 0)
	lbInterfaceTitle.Gravity = Gravity.CENTER_VERTICAL
	
	lbLanguage.Initialize("")
	lbLanguage.TextSize = UISizes.DefaultTextSize
	lbLanguage.Gravity = Gravity.CENTER_VERTICAL
	lbLanguage.TextColor = Colors.RGB(0, 0, 0)
	
	lbFontSize.Initialize("")
	lbFontSize.TextColor = Colors.RGB(0, 0, 0)
	lbFontSize.Gravity = Gravity.CENTER_VERTICAL
	lbFontSize.TextColor = Colors.RGB(0, 0, 0)
	lbFontSize.TextSize = UISizes.DefaultTextSize
	
	
	spLanguage.Initialize("spLang")
	spLanguage.TextSize = UISizes.DefaultTextSize
	spLanguage.TextColor = Colors.Black
'	spLanguage.SetBackgroundImage(Resources.bmpSPBackground)
'	Support.ApplySpinnerDefaultStyle(spLanguage)
	
	spFontSize.Initialize("spFontSize")
	spFontSize.TextSize = UISizes.DefaultTextSize
	spFontSize.TextColor = Colors.Black

'	spFontSize.SetBackgroundImage(Resources.bmpSPBackground)
'	Support.ApplySpinnerDefaultStyle(spFontSize)
		
	btnTestConnection.Initialize("TestConnection")
'	Support.ApplyButtonStyle(btnTestConnection, 0)
	
	SetLabelText
	'Set background
	bitmap = LoadBitmapSample(File.DirAssets, "SettingsP.jpg", 400dip, 600dip)

	pnlSettings.SetBackgroundImage(bitmap)
	'Raise flag to tell back button to save config on exit
'	Main.SaveConfig = True
	MakeScreen
	'enc dusb
End Sub

'Separated for dynamic change
Public Sub SetLabelText
	lbConfigTitle.Text = Main.translate.GetString("lblConnectionSettings")
		
	lbServerAdress.Text = Main.translate.GetString("lblServer") & ":"
	lbDatabaseName.Text = Main.translate.GetString("lblDatabaseName") & ":"
	lbUserName.Text = Main.translate.GetString("lblUserName") & ":"
	lbPassword.Text = Main.translate.GetString("lblPassword") & ":"
	
	etServerAdress.Hint = Main.translate.GetString("lblServer")
	etDatabaseName.Hint = Main.translate.GetString("lblDatabaseName")
	etUserName.Hint = Main.translate.GetString("lblUserName")
	etPassword.Hint = Main.translate.GetString("lblPassword")
	
	lbInterfaceTitle.Text = Main.translate.GetString("lblProgramSettings")
	lbLanguage.Text = Main.translate.GetString("lblLanguage") & ":"
	lbFontSize.Text = Main.translate.GetString("lblFontSize") & ":"
	
	btnTestConnection.Text = Main.translate.GetString("btnTestConnection")

End Sub
Public Sub MakeScreen
	vTop = 13%y
		
	'Interface Settings
	pnlSettings.AddView(lbInterfaceTitle, vLeft, vTop / 2, -1, UISizes.DefaultBigTitleSize * 3dip)
	vTop = (lbInterfaceTitle.Top + lbInterfaceTitle.Height)
	'Language
	pnlSettings.AddView(lbLanguage, vLeft, vTop + UISizes.ObjectVSeperation, UISizes.DefaultLabelWidth, UISizes.DefaultControlHeight)
	pnlSettings.AddView(spLanguage, lbLanguage.Left + lbLanguage.Width + UISizes.LabelEditSpacing, lbLanguage.Top, (UISizes.DefaultEditWidth / 2), UISizes.DefaultControlHeight)
		
	AddLanguages
		
	'Font Size
	pnlSettings.AddView(lbFontSize, vLeft, vTop + (UISizes.DefaultControlHeight) + UISizes.ObjectVSeperation, UISizes.DefaultLabelWidth, UISizes.DefaultControlHeight + lbFontSize.TextSize)
	pnlSettings.AddView(spFontSize, lbFontSize.Left + lbFontSize.Width + UISizes.LabelEditSpacing, lbFontSize.Top, (UISizes.DefaultEditWidth / 2), UISizes.DefaultControlHeight)
	AddFontSizes
		
	'END Interface Settings
	'Connection Settings
	Dim top1 As Int
		top1 = vTop1 / 1.5
		If top1 <= 0 Then top1 = vTop1
'		vTop1 = top1
	pnlSettings.AddView(lbConfigTitle, vLeft1, top1, -1, UISizes.DefaultBigTitleSize * 3dip)
	vTop1 = (lbConfigTitle.Top + lbConfigTitle.Height)
	'Server
	pnlSettings.AddView(lbServerAdress, vLeft1, vTop1 + UISizes.ObjectVSeperation, UISizes.DefaultLabelWidth, UISizes.DefaultControlHeight)
	pnlSettings.AddView(etServerAdress, lbServerAdress.Left + lbServerAdress.Width + UISizes.LabelEditSpacing, lbServerAdress.Top, UISizes.DefaultEditWidth, UISizes.DefaultControlHeight)
		
	'Database
	pnlSettings.AddView(lbDatabaseName, vLeft1, vTop1 + UISizes.DefaultControlHeight + UISizes.ObjectVSeperation, UISizes.DefaultLabelWidth, UISizes.DefaultControlHeight)
	pnlSettings.AddView(etDatabaseName, lbDatabaseName.Left + lbDatabaseName.Width + UISizes.LabelEditSpacing, lbDatabaseName.Top, UISizes.DefaultEditWidth, UISizes.DefaultControlHeight)
		
	'Username
	pnlSettings.AddView(lbUserName, vLeft1, vTop1+ (UISizes.DefaultControlHeight * 2) + UISizes.ObjectVSeperation, UISizes.DefaultLabelWidth, UISizes.DefaultControlHeight)
	pnlSettings.AddView(etUserName, lbUserName.Left + lbUserName.Width + UISizes.LabelEditSpacing, lbUserName.Top, UISizes.DefaultEditWidth, UISizes.DefaultControlHeight)
		
	'Password
	pnlSettings.AddView(lbPassword, vLeft1, vTop1 + (UISizes.DefaultControlHeight * 3) + UISizes.ObjectVSeperation, UISizes.DefaultLabelWidth, UISizes.DefaultControlHeight)
	pnlSettings.AddView(etPassword, lbPassword.Left + lbPassword.Width + UISizes.LabelEditSpacing, lbPassword.Top, UISizes.DefaultEditWidth, UISizes.DefaultControlHeight)
		
		
	pnlSettings.AddView(btnTestConnection, etPassword.Left + UISizes.LabelEditSpacing, etPassword.Top + etPassword.Height + 2%y, UISizes.DefaultEditWidth, UISizes.DefaultControlHeight)

	DataFromConfig
'	Support.RemoveControlsPadding(pnlSettings)
End Sub

Private Sub DataFromConfig
'	etServerAdress.Text = Main.Cfg.dbServerAddress
'	etDatabaseName.Text = Main.Cfg.dbBaseName
'	etUserName.Text = Main.Cfg.dbUserName
'	etPassword.Text = Main.Cfg.dbPassword
'	DBEngineIndex = Main.Cfg.selDBEngineIndex
'	LangSelectedAbb = Main.Cfg.selLanguage
'	spLanguage.SelectedIndex = Main.Cfg.selLangIndex
'	LangSelectedIndex = Main.Cfg.selLangIndex
'	LangSelectedAbb = Main.Cfg.selLanguage
'	'Font
'	spFontSize.SelectedIndex = Main.Cfg.selFontSizeIndex
'	FontSizeIndex = Main.Cfg.selFontSizeIndex
'	FontSize = Main.Cfg.selFontSize
End Sub


Private Sub AddFontSizes
	spFontSize.Clear
	spFontSize.Add("6")
	spFontSize.Add("7")
	spFontSize.Add("8")
	spFontSize.Add("9")
	spFontSize.Add("10")
	spFontSize.Add("11")
	spFontSize.Add("12")
	spFontSize.Add("13")
	spFontSize.Add("14")
	spFontSize.Add("15")
	spFontSize.Add("16")
	spFontSize.Add("17")
	spFontSize.Add("18")
	spFontSize.Add("19")
	spFontSize.Add("20")
	spFontSize.Add("21")
	spFontSize.Add("22")
	spFontSize.Add("23")
	spFontSize.Add("24")
End Sub

Public Sub AddLanguages
	spLanguage.Clear
	spLanguage.AddAll(Main.translate.Get_LanguageList)
End Sub

Private Sub TestConnection_Click
	If etServerAdress.Text == "" Then
'		Main.MytoastMessage.Show(Support.ReplaceStringParameter(Main.translate.GetString("msgFieldNotFilled"), "{0}", "'" & Main.translate.GetString("lblServer") & "'"))
		ToastMessageShow("Enter Address", False)
	Else If etDatabaseName.Text == "" Then
'		Main.MytoastMessage.Show(Support.ReplaceStringParameter(Main.translate.GetString("msgFieldNotFilled"), "{0}", "'" & Main.translate.GetString("lblDatabaseName") & "'"))
		ToastMessageShow("Enter Name",False)
	Else If etUserName.Text == "" Then
'		Main.MytoastMessage.Show(Support.ReplaceStringParameter(Main.translate.GetString("msgFieldNotFilled"), "{0}", "'" & Main.translate.GetString("lblUserName") & "'"))
		ToastMessageShow("Enter User", False)
	Else If etPassword.Text == "" Then
'		Main.MytoastMessage.Show(Support.ReplaceStringParameter(Main.translate.GetString("msgFieldNotFilled"), "{0}", "'" & Main.translate.GetString("lblPassword") & "'"))
		ToastMessageShow("Enter Password", False)
	Else
		DataToConfig
		TestConnectionMethod(True)
'						CallSub(Main, "getDatabaseList")
	End If
End Sub

Public Sub TestConnectionMethod(showLogs As Boolean)
	Try
		btnTestConnection.Enabled = False
		If IsValidIp(etServerAdress.Text) Then
			CallSub(Main, "ConnectToDatabase")
		Else
			ToastMessageShow("Your IP is invalid.", False)
			btnTestConnection.Enabled = True
			Return
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub IsValidIp(ip As String) As Boolean
	Dim m, n As Matcher
	m = Regex.Matcher("^(\d+)\.(\d+)\.(\d+)\.(\d+)$", ip)
	n = Regex.Matcher("^(\d+)\.(\d+)\.(\d+)\.(\d+):(\d+)$", ip)
	
	If m.Find = False Then
		If n.Find = False Then
			Return False
		Else
			For i = 1 To 4
				If n.Group(i) > 255 Or n.Group(i) < 0 Then Return False
			Next
			If n.Group(5) > 49151 Or n.Group(5) < 1024 Then Return False
			Return True
		End If
	Else
		For i = 1 To 4
			If m.Group(i) > 255 Or m.Group(i) < 0 Then Return False
		Next
		Return True
	End If
End Sub


Public Sub DataToConfig
'	Main.Cfg.dbServerAddress = etServerAdress.Text
'	Main.Cfg.dbBaseName = etDatabaseName.Text
'	Main.Cfg.dbUserName = etUserName.Text
'	Main.Cfg.dbPassword = etPassword.Text
'	Main.Cfg.dbEngine = DBEngineIndex
'	Main.Cfg.WriteSettings(etServerAdress.Text, etDatabaseName.Text, etUserName.Text, etPassword.Text, LangSelectedAbb, LangSelectedIndex, FontSize, FontSizeIndex, DBEngineIndex)
End Sub


Public Sub asView As Panel
	Return pnlSettings
End Sub