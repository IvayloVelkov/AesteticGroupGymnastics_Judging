Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Sub Class_Globals
	Public pnlBase, pnlMenu As Panel
	Public lblSettings, lblLanguage As Label
	Public SpnLanguage As Spinner
	Public intLanguageIndex As Int
	Public booVisible As Boolean
End Sub

Public Sub Initialize			'Инициализира обекта / Initializes the object
	pnlBase.Initialize("Hiding")
	pnlMenu.Initialize("InitialSetMenuFake")
	lblSettings.Initialize("")
	lblLanguage.Initialize("")
	SpnLanguage.Initialize("spnLang")
	InitialSetAddLanguages
End Sub

'Метод третиращ обекта, като панел / Makes the Initial settings object to be treated as panel
Public Sub InitSetAsView As Panel
	Return pnlBase
End Sub

Public Sub InitialSetShow			'Визуализира на началните настройки / Shows the initial settings panel
	pnlBase.BringToFront
	pnlMenu.SetLayoutAnimated(200, 0, pnlMenu.Top, pnlMenu.Width, pnlMenu.Height)
	booVisible = True
End Sub

Public Sub InitSettingsBuildScreen				'Построява екран с началните настройки / Builds Initial screen panel
	intLanguageIndex = 0						'Български език / Language is Bulgarian
	pnlBase.Color = Colors.Transparent 			'База за паналеа на менюто, която е невидима, използва се за прибиране на менюто
	pnlMenu.Color = Colors.ARGB(255, 50, 50, 50)	'Основни панел
	pnlBase.AddView(pnlMenu, 0, 0, UISizes.initSettingsWidth, 100%y)	' същинското меню
	Private labelWidth,labelHeight,paddingHeight As Int
		labelWidth = pnlMenu.Width * 0.5
		labelHeight = pnlMenu.Height * 0.06
		paddingHeight = UISizes.DefaultPadding

	lblSettings.TextSize = Main.intFontTransfer + 6		'Заглавен label
	lblSettings.Typeface = Typeface.DEFAULT_BOLD
	lblSettings.Gravity = Gravity.CENTER
	pnlMenu.AddView(lblSettings, 0, paddingHeight * 2, pnlMenu.Width, labelHeight)
	lblLanguage.TextSize = Main.intFontTransfer - 2		'Label език на програмата
	lblLanguage.Gravity = Gravity.CENTER_VERTICAL + Gravity.LEFT
	pnlMenu.AddView(lblLanguage, pnlMenu.Width * 0.05, lblSettings.Top + lblSettings.Height * 2 + paddingHeight,labelWidth, labelHeight)
	SpnLanguage.TextSize = Main.intFontTransfer - 2		'Spinner език на програмата
	SpnLanguage.SelectedIndex = SpnLanguage.IndexOf(Main.SelectedLanguage)
	HelperFunctions.Remove_Padding(SpnLanguage)
	pnlMenu.AddView(SpnLanguage, lblLanguage.Left + lblLanguage.Width , lblLanguage.Top, pnlMenu.Width - lblLanguage.Width - lblLanguage.Left * 2, labelHeight)
		InitialSetSignsRefresh
End Sub

Public Sub InitSettingsHide			'Скриване на панел/меню с началните настройки / Hides Initial setting panel/menu
	If pnlMenu.IsInitialized Then pnlMenu.SetLayoutAnimated(200, -pnlMenu.Width, pnlMenu.Top, pnlMenu.Width, pnlMenu.Height)
	pnlBase.SendToBack
	booVisible = False
	WriteInitialSettings
End Sub

Private Sub WriteInitialSettings	'Записва първоначалните настройки / Writes the initial settings
	Private randomFile As RandomAccessFile
	randomFile.Initialize(File.DirDefaultExternal, "initialSetting.config", False)
	randomFile.WriteEncryptedObject(Main.SelectedLanguage, ProgramData.rafEncPass, randomFile.CurrentPosition)
End Sub

Public Sub Hiding_Click					'Скриване на панела / Hides the Panel
	InitSettingsHide
End Sub

Private Sub InitialSetSignsRefresh		'Опресняване на надписите в първоначалните настройки / Refreshes signs in Initial settings
	lblSettings.TextSize = UISizes.DefaultFont
	lblSettings.Text = Main.translate.GetString("lblSettings")
	lblLanguage.TextSize = UISizes.DefaultFont
	lblLanguage.Text = Main.translate.GetString("lblLanguage")
	SpnLanguage.TextSize = UISizes.DefaultFont
End Sub

Private Sub InitialSetAddLanguages		'Добавяне на езици в първоначалните езици / Adds languages to the initial settings
	SpnLanguage.Clear
	SpnLanguage.AddAll(Main.translate.Get_LanguageList)
End Sub

'Самото падащо меню за избор на език / The actual spinner for language
Private Sub spnLang_ItemClick (Position As Int, Value As Object)
	intLanguageIndex = Position
	Main.SelectedLanguage = Value
	Main.translate.SetLanguage(Value)
	InitialSetSignsRefresh
End Sub

Private Sub InitialSetMenuFake_Click As Boolean	'Спира преминаването на тъч през панел / Stops unwanted touch passing through layers of panel
	Return True
End Sub
