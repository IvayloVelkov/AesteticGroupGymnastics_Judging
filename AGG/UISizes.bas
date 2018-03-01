Type=StaticCode
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Subs in this code module will be accessible from all modules.
Private Sub Process_Globals
	Public HeaderHeight, FooterHeight, LeftPart,GroupScroller, ButtonLeft, settingsWidth, initSettingsWidth, _
	keyboardWidth, GroupButtonHeight, DefaultFont, HeaderLabelHeight, FooterLabelHeight, DefaultPadding, _
	PressedTextColor As Int	
	Public GroupColor_Normal, GroupColor_Pressed As String
End Sub

'Инициализиране на обекта / Initializes the object
Public Sub Initialize
	DefaultFont = 16
	initSettingsWidth = 70%x
	keyboardWidth = 100%x
	HeaderHeight = 8%y
	FooterHeight = 5%y
	GroupScroller = 15%x
	DefaultPadding = 1%x
	LeftPart = 100%x
	settingsWidth = 80%x
	GroupButtonHeight = 64dip
	GroupColor_Normal = 0xFF19ABFF
	GroupColor_Pressed = Colors.White
'	GroupColor_Pressed = HelperFunctions.Clr("0D5E89")
	PressedTextColor = Colors.Black
	ButtonLeft = 5%x
End Sub