Type=StaticCode
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Code module Program Data
Private Sub Process_Globals
	Public strUser As String = ""
	Public strPass As String = ""
	Public rafEncPass As Int = 6380						'Парола за RAF файл
	Public sameUser As Boolean


	'Размер на текст
	Public DefaultFont As Int = 14
	Public Tile_Small As Int
	Public Tile_Large As Int
	Public TextSize_ExtraLarge As Int
	Public TextSize_Large As Int
	Public TextSize_Small As Int
	Public TextSize_Huge As Int

	'Цветове
	Public COLOR_UIHOLDER_LEFT As Int = 0xFFF4F4F4
	Public COLOR_UIHOLDER_RIGHT As Int = 0xFFFFFFFF
	Public COLOR_UIGROUP_SCROLLER As Int = 0xFFEAEAEA
	Public COLOR_HEADER As Int = 0xFF0068A0
	Public COLOR_FOOTOR As Int = 0xFFFFFFFF'0xFF19ABFF
	Public COLOR_BUTTON_NORMAL As Int = 0xFF0580C7
	Public COLOR_BUTTON_PRESSED As Int = 0xFF38B6FF
	Public COLOR_BUTTON_DISABLED As Int = 0xFF38B6FF
	Public COLOR_BUTTON_TEXTCOLOR As Int = 0xFFFFFFFF 'White
	Public BUTTON_ROUNDING As Int = 0
	
	
	Public bmpPrinterStatusIcon_Error, bmpPrinterStatusIcon_Success As Bitmap
End Sub

'Инициализиране на обекта / Initializes the object
Public Sub Initialize
	If File.Exists(File.DirDefaultExternal , "token.config")  = True And File.Size (File.DirDefaultExternal , "token.config") > 0 Then
		Private raf As RandomAccessFile
		raf.Initialize(File.DirDefaultExternal, "token.config", False)
		raf.Close
	End If
End Sub

'Прочитане на запазените потребители / Read saved user
Private Sub Read_SavedUser
	Private raf As RandomAccessFile
	If File.Exists(File.DirDefaultExternal , "users.config") = True And File.Size(File.DirDefaultExternal , "users.config") > 0 Then
		raf.Initialize(File.DirDefaultExternal, "users.config", False)
		strUser = raf.ReadEncryptedObject(rafEncPass, raf.CurrentPosition)
		strPass = raf.ReadEncryptedObject(rafEncPass, raf.CurrentPosition)
		raf.Close
	End If
End Sub




