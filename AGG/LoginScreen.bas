Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Private Sub Class_Globals
	Private raf As RandomAccessFile
	Private loginPanel As Panel
	Private user, pass As EditText
	Public btnloginPanel, btnSettings, btnExit As Button
	Public CAD As CustomAlertDialog
	Private checkloginPanel As CheckBox
	Private usrString, passString As String
	Private btnloginPanelTimer As Timer
End Sub

'Проверка за съществуване на директории и фаилове / Folder and file check on start up
Private Sub start_up
	If File.Exists(File.DirDefaultExternal , "users.config")  = True And File.Size (File.DirDefaultExternal , "users.config") > 0 Then
		checkloginPanel.Checked = True
	End If
	
	If checkloginPanel.Checked Then
		Read_SavedUsrs
		user.Text = usrString
		pass.Text = passString
	Else
		user.Text = ""
		pass.Text = ""
	End If
End Sub

'Инициализиране на обекта / Initializes the object
Public Sub Initialize
	loginPanel.Initialize("loginPanelPanelsFake")
	user.Initialize("userName")
	pass.Initialize("Pass")
	checkloginPanel.Initialize("Remember")
	btnloginPanel.Initialize("ButtonloginPanel")
	btnSettings.Initialize("loginPanelSettings")	'Бутон за начални настройки на програмата
	btnExit.Initialize("loginPanelExit")
	btnloginPanelTimer.Initialize("btnloginPanelTimer",200)
End Sub

' Построяване на екрана / Builds the UI of the screen
Public Sub build_Screen
	loginPanel_Configurations
	start_up
	
	Private edtWidth,edtHeight As Int
	Private btnWidth,btnHeight As Int
	Private settingsWidth,settingsHeight As Int
	Private Padding,left As Int
	

		Padding = UISizes.DefaultPadding
		edtWidth = loginPanel.Width*0.7
		edtHeight = loginPanel.Height*0.08
		btnHeight = loginPanel.Height*0.08
		btnWidth = edtWidth/2 - Padding
		left = (loginPanel.Width - edtWidth)/2
		settingsWidth = loginPanel.Width*0.06
		settingsHeight = settingsWidth' loginPanel.Height * 0.05
	
	
	loginPanel.AddView(user,left, loginPanel.Height*(0.3),edtWidth, edtHeight)
	loginPanel.AddView(pass, left, user.Top+user.Height*1.5+Padding, edtWidth, edtHeight)
		
	loginPanel.AddView(checkloginPanel, left + Padding, pass.Top + edtHeight * 1.5, btnWidth, btnHeight)
	loginPanel.AddView(btnloginPanel, checkloginPanel.Left + checkloginPanel.Width + Padding, checkloginPanel.Top, btnWidth, btnHeight)


	btnSettings.SetBackgroundImage(LoadBitmap(File.DirAssets, "initial_options_icon.png"))
	loginPanel.AddView(btnSettings, loginPanel.Width * 0.01,loginPanel.Height * 0.01, settingsWidth, settingsHeight)

	btnExit.SetBackgroundImage(LoadBitmap(File.DirAssets,"exit_program_x.png"))
	loginPanel.AddView(btnExit, loginPanel.width - settingsWidth - loginPanel.Width * 0.01,loginPanel.Height * 0.01, settingsWidth, settingsHeight)
	
	btnloginPanel.Enabled=True
'	refreshloginPanel_Labels
End Sub

'Прилагане на стилове за външния вид на екрана за влизане / Applying visual styles for loginPanel screen
Private Sub loginPanel_Configurations
	loginPanel.SetBackgroundImage(LoadBitmap(File.DirAssets,"login_background.jpg"))
	
		
	HelperFunctions.Apply_ViewStyle(user,Colors.Black,Colors.White,Colors.White,Colors.White,Colors.White,Colors.White,Colors.White,60)
	user.Padding = Array As Int(15,0,0,0)
	user.SingleLine = True
	user.Hint = Main.translate.GetString("hintMail")
	user.TextSize = 14
	
	HelperFunctions.Apply_ViewStyle(pass,Colors.Black,Colors.White,Colors.White,Colors.White,Colors.White,Colors.White,Colors.White,60)
	pass.Padding = Array As Int(15,0,0,0)
	pass.SingleLine = True
	pass.PasswordMode = True
	pass.Hint = Main.translate.GetString("lblPassword")
	pass.TextSize = 14

	checkloginPanel.TextColor=Colors.White
	checkloginPanel.TextSize = 14
	checkloginPanel.Gravity = Gravity.CENTER_VERTICAL
	checkloginPanel.Text = Main.translate.GetString("rememberMe")


	HelperFunctions.Apply_ViewStyle(btnloginPanel,Colors.White,0xff4ac2ff,0xff149be0,0xff2cb7ff,0xff2cb7ff,0x66040509,0x66040509,60)
	btnloginPanel.TextSize = 14
	btnloginPanel.Gravity = Gravity.CENTER
	btnloginPanel.Text = Main.translate.GetString("btnloginPanel")

End Sub

'Метод прехвърлящ фокус между полетата / Changes focus between input fields
Private Sub pass_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		pass.Text=""
	End If
End Sub

'Записва в RAF файл текущия потребител / Writes the current user 
Private Sub write_Usrs
	raf.Initialize(File.DirDefaultExternal, "users.config", False)
	raf.WriteEncryptedObject(usrString, ProgramData.rafEncPass, raf.CurrentPosition)
	raf.WriteEncryptedObject(passString, ProgramData.rafEncPass, raf.CurrentPosition)
	raf.Close
End Sub

'Чете от RAF файл текущия потребител
Private Sub Read_SavedUsrs
	raf.Initialize(File.DirDefaultExternal, "users.config", False)
	usrString = raf.ReadEncryptedObject(ProgramData.rafEncPass, raf.CurrentPosition)
	passString = raf.ReadEncryptedObject(ProgramData.rafEncPass, raf.CurrentPosition)
	
	ProgramData.strUser = usrString
	ProgramData.strPass = passString
	raf.Close
End Sub

'Метода, който вкарва потребителя в системата / Method for log in 
Private Sub ButtonloginPanel_Click
	'Бутона Вход се деактивира. Против спам
	btnloginPanel.Enabled=False
	'Нужно задаване на стойности от programdata след logout
	'Запазваме локално стойностите от текстовите полета
	usrString = user.Text.ToLowerCase
	passString = pass.Text
	'Проверяваме дали паролата и емейла са правилни. Чрез Regex
	If check_User(usrString) And check_Pass(passString) Then
		'Ако е зададено да се запомни потребителя, запазваме локално в Raf файл нужната информация. Ако не е, трием файла, ако има такъв.
			If checkloginPanel.Checked Then
				write_Usrs
			Else
				File.Delete(File.DirDefaultExternal, "users.config")
			End If
			'Проверяваме дали се логва същия потребител като миналия път. Нужно е за да знам дали да заредим последно избрания обект(магазин,склад,ресторант).
			If usrString = ProgramData.strUser And ProgramData.strPass = passString Then
				ProgramData.sameUser = True
			Else
				ProgramData.sameUser = False
			End If
		Else
			ProgramData.sameUser = False
		End If
		'След проверките записва паролата и емейла в глобални променливи
		ProgramData.strUser = usrString
		ProgramData.strPass = passString
			
	CallSub(Main, "LoginScreen_LoginClick")
			
	btnloginPanelTimer.Enabled = True
End Sub

'Проверя, чрез Regex дали е въведен e-mail / Regex check if email is used
Private Sub check_User(text As String) As Boolean
	Private m As Matcher
	m = Regex.Matcher("[a-z0-9]+[_a-z0-9\.-]*[a-z0-9]+@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,4})", text)
			If m.Find Then Return True
		Return False
End Sub

'Проверява паролата / Checks the pass
Private Sub check_Pass(text As String) As Boolean
	Return True
End Sub

	
Public Sub loginPanelSettings_Click
	CallSub(Main, "showSettings")
End Sub

Public Sub asView As Panel
	Return loginPanel
End Sub