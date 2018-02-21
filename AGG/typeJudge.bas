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
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	typePanel.Initialize("")
	btnAv.Initialize("AVtypeBtn")
	btnTv.Initialize("TVtypeBtn")
	btnExe.Initialize("EXEtypeBtn")
	
	
End Sub

Public Sub asView As Panel
	Return typePanel
End Sub