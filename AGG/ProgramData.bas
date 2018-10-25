B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.3
@EndOfDesignText@
'Code module Program Data
Private Sub Process_Globals
	Public strUser As String = ""
	Public strPass As String = ""
	Public rafEncPass As Int = 6380						'Парола за RAF файл
	Public sameUser As Boolean
	Public activeJ As Int
	Public dbIP As String
	Public dbServerAddress As String
	Public dbBaseName As String
	Public dbUserName As String
	Public dbPassword As String
	
	'Размер на текст
	Public DefaultFont As Int = 14
	
	Public finalScore As Double
End Sub

'Инициализиране на обекта / Initializes the object
Public Sub Initialize
	
End Sub
