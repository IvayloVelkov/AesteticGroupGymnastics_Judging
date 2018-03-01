Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Sub Class_Globals
	'Database Settings
	Public dbServerAddress,dbBaseName,dbUserName,dbPassword,dbEngine As String
	Public configFileName As String
	Public cfgMap As Map
	Public selLanguage As String = "EN"
	Public selLangIndex As Int = 0
	Public selFontSize As Int = 12
	Public selFontSizeIndex As Int = 0
	Public selDBEngineIndex As Int = 0
	Public logFileName As String
	Public ReportsFolder As String = "Reports"
	Public DEFAULT_CURRENCY As String = "BGN"
	Private CurrencyName As String = DEFAULT_CURRENCY
	Private CurrencyLeftPrefix As String = "("
	Private CurrencyRightPrefix As String = ")"
	Public CurrencyDisplay As String = CurrencyLeftPrefix&CurrencyName&CurrencyRightPrefix
End Sub

Public Sub Initialize
	cfgMap.Initialize
	logFileName = Version.ProgramName&".log"
	configFileName = Version.ProgramName&".config"

	'Make Dir
	Try
		If Not (File.Exists(File.DirRootExternal,Version.Path)) Then
			Log("Created Dirt: " & File.DirRootExternal&Version.Path)
			File.MakeDir(File.DirRootExternal, Version.Path)
		Else
			Log("Dir already exists.")
		End If
		If Not (File.Exists(File.DirRootExternal,Version.Path & "/" & ReportsFolder)) Then
			Log("Created Dirt Reports: " & File.DirRootExternal & Version.Path & "/" & ReportsFolder)
			File.MakeDir(File.DirRootExternal, Version.Path & "/" & ReportsFolder)
		Else
			Log("Reports Dir already exists.")
		End If
	Catch
		ToastMessageShow(Main.translate.GetString("msgNoFreeSpace"),False)
		Log("No free space to save config. EX: " & LastException)
	End Try
'		LoadConfig
'		DebugConfig
'	End If
End Sub
 
Public Sub GetReportsFolder As String
	Return File.DirRootExternal & Version.Path & "/" & ReportsFolder
End Sub

'Loads the saved configuration if exist or creates a default one.
Public Sub LoadConfig
	Try
		'Check for config file
		If File.Exists(File.DirRootExternal&Version.Path,configFileName) Then
			cfgMap=File.ReadMap(File.DirRootExternal&Version.Path,configFileName)
			Log("Configuration Loaded.")
			
			SetConfigFromMap
		Else
			Log("New Configuration Created.")
			DefaultConfig
		End If
		If Not(File.Exists(File.DirRootExternal&Version.Path,logFileName)) Then
			File.WriteString(File.DirRootExternal&Version.Path,logFileName,"")
		End If
		WriteConfig
	Catch
'		Support.SaveLog("Old Config file. Reseting to defaults.", LastException)
		Log(LastException)
		Log("Old Config file. Reseting to defaults.")
		DefaultConfig
		WriteConfig
	End Try

End Sub

Public Sub SetupCurrency
	Try
		If (dbServerAddress<>"" And dbBaseName<>"" And dbUserName<>"" And dbPassword<>"") Then
			Main.PrimeCurrency = Main.DB.Get_Currency
		End If
	Catch
		Log("Currency load failed: " & LastException)
	End Try
End Sub

Public Sub SaveCurrentConfig
	Try
		If File.ExternalWritable Then
			Log("ConfigMAP: " & cfgMap)
			File.WriteMap(File.DirRootExternal&Version.Path,configFileName,cfgMap)
			Log("Configuration Saved.")
		Else
			ToastMessageShow(Main.translate.GetString("msgErrorWritingFile"),False)
			Log("No permission to save configuration file.")
		End If
	Catch
		ToastMessageShow(Main.translate.GetString("msgNoFreeSpace"),False)
		Log("No free space to save config. EX: " & LastException)
'		Support.SaveLog("No free space to save config.",LastException)
	End Try
End Sub

Public Sub DefaultConfig
	cfgMap.Initialize
	dbServerAddress = ""
	dbBaseName = ""
	dbUserName = ""
	dbPassword = ""
	selLanguage = "EN"
	CurrencyName = DEFAULT_CURRENCY
	selLangIndex = 0
	selFontSize = 12
	selFontSizeIndex = 0
	selDBEngineIndex = 0
	Main.translate.SetLanguage(selLanguage)
End Sub

Public Sub DebugConfig
	cfgMap.Initialize
	dbServerAddress = "192.168.1.135"
	dbBaseName = "RestaurantBG"
	dbUserName = "sa"
	dbPassword = "Micr0!nvest"
	selLanguage = "EN"
	selLangIndex = 0
	selFontSize = 12
	selFontSizeIndex = 0
	selDBEngineIndex = 0
	WriteConfig
End Sub

public Sub WriteSettings(address As String, base As String, username As String, pass As String,lang As String,langIndex As Int, fontSize As Int, fontIndex As Int, engineIndex As Int)
	dbServerAddress = address
	dbBaseName = base
	dbUserName = username
	dbPassword = pass
	selLanguage = lang
	selLangIndex = langIndex
	selFontSize = fontSize
	selFontSizeIndex = fontIndex
	selDBEngineIndex = engineIndex
	WriteConfig
End Sub

Public Sub WriteConfig
	cfgMap.Clear
	cfgMap.Put("ServerAddress",dbServerAddress)
	cfgMap.Put("BaseName",dbBaseName)
	cfgMap.Put("Username",dbUserName)
	cfgMap.Put("Password",dbPassword)
	cfgMap.Put("DBEngine",selDBEngineIndex)
	SaveCurrentConfig
End Sub

Private Sub SetConfigFromMap
	dbServerAddress = cfgMap.Get("ServerAddress")
	dbBaseName = cfgMap.Get("BaseName")
	dbUserName = cfgMap.Get("Username")
	dbPassword = cfgMap.Get("Password")
	selLanguage = cfgMap.Get("Language")
	selLangIndex = cfgMap.Get("LanguageIndex")
	selFontSize = cfgMap.Get("FontSize")
	selFontSizeIndex = cfgMap.Get("FontSizeIndex")
	selDBEngineIndex = cfgMap.Get("DBEngine")
	Log("DB engine loaded: " & selDBEngineIndex)
	Main.DB.SetDBEngine(selDBEngineIndex)
	Main.translate.SetLanguage(selLanguage)
	ToastMessageShow(Main.translate.GetString("msgConfigLoaded"),False)
End Sub