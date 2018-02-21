Type=StaticCode
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Private Sub Process_Globals
	Public ProductID As Int = 301							'Product Identifier (301 some number)
	Public ProgramName As String = "AGG"
	Public ProductInDictionary As String = "AndroidProjects"
End Sub

'Пътека за директория на приложението / Application Path
Public Sub Path As String
	Return "/Microinvest/"&ProgramName
End Sub
