package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class config extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.config");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.config.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _dbserveraddress = "";
public String _dbbasename = "";
public String _dbusername = "";
public String _dbpassword = "";
public String _dbengine = "";
public String _configfilename = "";
public anywheresoftware.b4a.objects.collections.Map _cfgmap = null;
public String _sellanguage = "";
public int _sellangindex = 0;
public int _selfontsize = 0;
public int _selfontsizeindex = 0;
public int _seldbengineindex = 0;
public String _logfilename = "";
public String _reportsfolder = "";
public String _default_currency = "";
public String _currencyname = "";
public String _currencyleftprefix = "";
public String _currencyrightprefix = "";
public String _currencydisplay = "";
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public String  _class_globals(b4a.example.config __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="config";
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Public dbServerAddress,dbBaseName,dbUserName,dbPa";
_dbserveraddress = "";
_dbbasename = "";
_dbusername = "";
_dbpassword = "";
_dbengine = "";
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Public configFileName As String";
_configfilename = "";
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="Public cfgMap As Map";
_cfgmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="Public selLanguage As String = \"EN\"";
_sellanguage = "EN";
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="Public selLangIndex As Int = 0";
_sellangindex = (int) (0);
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="Public selFontSize As Int = 12";
_selfontsize = (int) (12);
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="Public selFontSizeIndex As Int = 0";
_selfontsizeindex = (int) (0);
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="Public selDBEngineIndex As Int = 0";
_seldbengineindex = (int) (0);
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="Public logFileName As String";
_logfilename = "";
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="Public ReportsFolder As String = \"Reports\"";
_reportsfolder = "Reports";
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="Public DEFAULT_CURRENCY As String = \"BGN\"";
_default_currency = "BGN";
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="Private CurrencyName As String = DEFAULT_CURRENCY";
_currencyname = __ref._default_currency;
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="Private CurrencyLeftPrefix As String = \"(\"";
_currencyleftprefix = "(";
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="Private CurrencyRightPrefix As String = \")\"";
_currencyrightprefix = ")";
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="Public CurrencyDisplay As String = CurrencyLeftPr";
_currencydisplay = __ref._currencyleftprefix+__ref._currencyname+__ref._currencyrightprefix;
RDebugUtils.currentLine=7536657;
 //BA.debugLineNum = 7536657;BA.debugLine="End Sub";
return "";
}
public String  _debugconfig(b4a.example.config __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(ba, "debugconfig"))
	return (String) Debug.delegate(ba, "debugconfig", null);
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub DebugConfig";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="cfgMap.Initialize";
__ref._cfgmap.Initialize();
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="dbServerAddress = \"192.168.1.135\"";
__ref._dbserveraddress = "192.168.1.135";
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="dbBaseName = \"RestaurantBG\"";
__ref._dbbasename = "RestaurantBG";
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="dbUserName = \"sa\"";
__ref._dbusername = "sa";
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="dbPassword = \"Micr0!nvest\"";
__ref._dbpassword = "Micr0!nvest";
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="selLanguage = \"EN\"";
__ref._sellanguage = "EN";
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="selLangIndex = 0";
__ref._sellangindex = (int) (0);
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="selFontSize = 12";
__ref._selfontsize = (int) (12);
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="selFontSizeIndex = 0";
__ref._selfontsizeindex = (int) (0);
RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="selDBEngineIndex = 0";
__ref._seldbengineindex = (int) (0);
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="WriteConfig";
__ref._writeconfig(null);
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="End Sub";
return "";
}
public String  _writeconfig(b4a.example.config __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(ba, "writeconfig"))
	return (String) Debug.delegate(ba, "writeconfig", null);
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub WriteConfig";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="cfgMap.Clear";
__ref._cfgmap.Clear();
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="cfgMap.Put(\"ServerAddress\",dbServerAddress)";
__ref._cfgmap.Put((Object)("ServerAddress"),(Object)(__ref._dbserveraddress));
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="cfgMap.Put(\"BaseName\",dbBaseName)";
__ref._cfgmap.Put((Object)("BaseName"),(Object)(__ref._dbbasename));
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="cfgMap.Put(\"Username\",dbUserName)";
__ref._cfgmap.Put((Object)("Username"),(Object)(__ref._dbusername));
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="cfgMap.Put(\"Password\",dbPassword)";
__ref._cfgmap.Put((Object)("Password"),(Object)(__ref._dbpassword));
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="cfgMap.Put(\"DBEngine\",selDBEngineIndex)";
__ref._cfgmap.Put((Object)("DBEngine"),(Object)(__ref._seldbengineindex));
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="SaveCurrentConfig";
__ref._savecurrentconfig(null);
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="End Sub";
return "";
}
public String  _defaultconfig(b4a.example.config __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(ba, "defaultconfig"))
	return (String) Debug.delegate(ba, "defaultconfig", null);
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub DefaultConfig";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="cfgMap.Initialize";
__ref._cfgmap.Initialize();
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="dbServerAddress = \"\"";
__ref._dbserveraddress = "";
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="dbBaseName = \"\"";
__ref._dbbasename = "";
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="dbUserName = \"\"";
__ref._dbusername = "";
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="dbPassword = \"\"";
__ref._dbpassword = "";
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="selLanguage = \"EN\"";
__ref._sellanguage = "EN";
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="CurrencyName = DEFAULT_CURRENCY";
__ref._currencyname = __ref._default_currency;
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="selLangIndex = 0";
__ref._sellangindex = (int) (0);
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="selFontSize = 12";
__ref._selfontsize = (int) (12);
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="selFontSizeIndex = 0";
__ref._selfontsizeindex = (int) (0);
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="selDBEngineIndex = 0";
__ref._seldbengineindex = (int) (0);
RDebugUtils.currentLine=7929868;
 //BA.debugLineNum = 7929868;BA.debugLine="Main.translate.SetLanguage(selLanguage)";
_main._translate._setlanguage(null,__ref._sellanguage);
RDebugUtils.currentLine=7929869;
 //BA.debugLineNum = 7929869;BA.debugLine="End Sub";
return "";
}
public String  _getreportsfolder(b4a.example.config __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(ba, "getreportsfolder"))
	return (String) Debug.delegate(ba, "getreportsfolder", null);
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub GetReportsFolder As String";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Return File.DirRootExternal & Version.Path & \"/\"";
if (true) return __c.File.getDirRootExternal()+_version._path(getActivityBA())+"/"+__ref._reportsfolder;
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.config __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="cfgMap.Initialize";
__ref._cfgmap.Initialize();
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="logFileName = Version.ProgramName&\".log\"";
__ref._logfilename = _version._programname+".log";
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="configFileName = Version.ProgramName&\".config\"";
__ref._configfilename = _version._programname+".config";
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="Try";
try {RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="If Not (File.Exists(File.DirRootExternal,Version";
if (__c.Not(__c.File.Exists(__c.File.getDirRootExternal(),_version._path(getActivityBA())))) { 
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="Log(\"Created Dirt: \" & File.DirRootExternal&Ver";
__c.Log("Created Dirt: "+__c.File.getDirRootExternal()+_version._path(getActivityBA()));
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="File.MakeDir(File.DirRootExternal, Version.Path";
__c.File.MakeDir(__c.File.getDirRootExternal(),_version._path(getActivityBA()));
 }else {
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="Log(\"Dir already exists.\")";
__c.Log("Dir already exists.");
 };
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="If Not (File.Exists(File.DirRootExternal,Version";
if (__c.Not(__c.File.Exists(__c.File.getDirRootExternal(),_version._path(getActivityBA())+"/"+__ref._reportsfolder))) { 
RDebugUtils.currentLine=7602190;
 //BA.debugLineNum = 7602190;BA.debugLine="Log(\"Created Dirt Reports: \" & File.DirRootExte";
__c.Log("Created Dirt Reports: "+__c.File.getDirRootExternal()+_version._path(getActivityBA())+"/"+__ref._reportsfolder);
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="File.MakeDir(File.DirRootExternal, Version.Path";
__c.File.MakeDir(__c.File.getDirRootExternal(),_version._path(getActivityBA())+"/"+__ref._reportsfolder);
 }else {
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="Log(\"Reports Dir already exists.\")";
__c.Log("Reports Dir already exists.");
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="ToastMessageShow(Main.translate.GetString(\"msgNo";
__c.ToastMessageShow(BA.ObjectToCharSequence(_main._translate._getstring(null,"msgNoFreeSpace")),__c.False);
RDebugUtils.currentLine=7602197;
 //BA.debugLineNum = 7602197;BA.debugLine="Log(\"No free space to save config. EX: \" & LastE";
__c.Log("No free space to save config. EX: "+BA.ObjectToString(__c.LastException(getActivityBA())));
 };
RDebugUtils.currentLine=7602202;
 //BA.debugLineNum = 7602202;BA.debugLine="End Sub";
return "";
}
public String  _loadconfig(b4a.example.config __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(ba, "loadconfig"))
	return (String) Debug.delegate(ba, "loadconfig", null);
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub LoadConfig";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Try";
try {RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="If File.Exists(File.DirRootExternal&Version.Path";
if (__c.File.Exists(__c.File.getDirRootExternal()+_version._path(getActivityBA()),__ref._configfilename)) { 
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="cfgMap=File.ReadMap(File.DirRootExternal&Versio";
__ref._cfgmap = __c.File.ReadMap(__c.File.getDirRootExternal()+_version._path(getActivityBA()),__ref._configfilename);
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="Log(\"Configuration Loaded.\")";
__c.Log("Configuration Loaded.");
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="SetConfigFromMap";
__ref._setconfigfrommap(null);
 }else {
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="Log(\"New Configuration Created.\")";
__c.Log("New Configuration Created.");
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="DefaultConfig";
__ref._defaultconfig(null);
 };
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="If Not(File.Exists(File.DirRootExternal&Version.";
if (__c.Not(__c.File.Exists(__c.File.getDirRootExternal()+_version._path(getActivityBA()),__ref._logfilename))) { 
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="File.WriteString(File.DirRootExternal&Version.P";
__c.File.WriteString(__c.File.getDirRootExternal()+_version._path(getActivityBA()),__ref._logfilename,"");
 };
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="WriteConfig";
__ref._writeconfig(null);
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(getActivityBA())));
RDebugUtils.currentLine=7733267;
 //BA.debugLineNum = 7733267;BA.debugLine="Log(\"Old Config file. Reseting to defaults.\")";
__c.Log("Old Config file. Reseting to defaults.");
RDebugUtils.currentLine=7733268;
 //BA.debugLineNum = 7733268;BA.debugLine="DefaultConfig";
__ref._defaultconfig(null);
RDebugUtils.currentLine=7733269;
 //BA.debugLineNum = 7733269;BA.debugLine="WriteConfig";
__ref._writeconfig(null);
 };
RDebugUtils.currentLine=7733272;
 //BA.debugLineNum = 7733272;BA.debugLine="End Sub";
return "";
}
public String  _setconfigfrommap(b4a.example.config __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(ba, "setconfigfrommap"))
	return (String) Debug.delegate(ba, "setconfigfrommap", null);
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Private Sub SetConfigFromMap";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="dbServerAddress = cfgMap.Get(\"ServerAddress\")";
__ref._dbserveraddress = BA.ObjectToString(__ref._cfgmap.Get((Object)("ServerAddress")));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="dbBaseName = cfgMap.Get(\"BaseName\")";
__ref._dbbasename = BA.ObjectToString(__ref._cfgmap.Get((Object)("BaseName")));
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="dbUserName = cfgMap.Get(\"Username\")";
__ref._dbusername = BA.ObjectToString(__ref._cfgmap.Get((Object)("Username")));
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="dbPassword = cfgMap.Get(\"Password\")";
__ref._dbpassword = BA.ObjectToString(__ref._cfgmap.Get((Object)("Password")));
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="selLanguage = cfgMap.Get(\"Language\")";
__ref._sellanguage = BA.ObjectToString(__ref._cfgmap.Get((Object)("Language")));
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="selLangIndex = cfgMap.Get(\"LanguageIndex\")";
__ref._sellangindex = (int)(BA.ObjectToNumber(__ref._cfgmap.Get((Object)("LanguageIndex"))));
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="selFontSize = cfgMap.Get(\"FontSize\")";
__ref._selfontsize = (int)(BA.ObjectToNumber(__ref._cfgmap.Get((Object)("FontSize"))));
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="selFontSizeIndex = cfgMap.Get(\"FontSizeIndex\")";
__ref._selfontsizeindex = (int)(BA.ObjectToNumber(__ref._cfgmap.Get((Object)("FontSizeIndex"))));
RDebugUtils.currentLine=8192009;
 //BA.debugLineNum = 8192009;BA.debugLine="selDBEngineIndex = cfgMap.Get(\"DBEngine\")";
__ref._seldbengineindex = (int)(BA.ObjectToNumber(__ref._cfgmap.Get((Object)("DBEngine"))));
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="Log(\"DB engine loaded: \" & selDBEngineIndex)";
__c.Log("DB engine loaded: "+BA.NumberToString(__ref._seldbengineindex));
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="Main.DB.SetDBEngine(selDBEngineIndex)";
_main._db._setdbengine(null,__ref._seldbengineindex);
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="Main.translate.SetLanguage(selLanguage)";
_main._translate._setlanguage(null,__ref._sellanguage);
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="ToastMessageShow(Main.translate.GetString(\"msgCon";
__c.ToastMessageShow(BA.ObjectToCharSequence(_main._translate._getstring(null,"msgConfigLoaded")),__c.False);
RDebugUtils.currentLine=8192014;
 //BA.debugLineNum = 8192014;BA.debugLine="End Sub";
return "";
}
public String  _savecurrentconfig(b4a.example.config __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(ba, "savecurrentconfig"))
	return (String) Debug.delegate(ba, "savecurrentconfig", null);
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub SaveCurrentConfig";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Try";
try {RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="If File.ExternalWritable Then";
if (__c.File.getExternalWritable()) { 
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="Log(\"ConfigMAP: \" & cfgMap)";
__c.Log("ConfigMAP: "+BA.ObjectToString(__ref._cfgmap));
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="File.WriteMap(File.DirRootExternal&Version.Path";
__c.File.WriteMap(__c.File.getDirRootExternal()+_version._path(getActivityBA()),__ref._configfilename,__ref._cfgmap);
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="Log(\"Configuration Saved.\")";
__c.Log("Configuration Saved.");
 }else {
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="ToastMessageShow(Main.translate.GetString(\"msgE";
__c.ToastMessageShow(BA.ObjectToCharSequence(_main._translate._getstring(null,"msgErrorWritingFile")),__c.False);
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="Log(\"No permission to save configuration file.\"";
__c.Log("No permission to save configuration file.");
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="ToastMessageShow(Main.translate.GetString(\"msgNo";
__c.ToastMessageShow(BA.ObjectToCharSequence(_main._translate._getstring(null,"msgNoFreeSpace")),__c.False);
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="Log(\"No free space to save config. EX: \" & LastE";
__c.Log("No free space to save config. EX: "+BA.ObjectToString(__c.LastException(getActivityBA())));
 };
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="End Sub";
return "";
}
public String  _setupcurrency(b4a.example.config __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(ba, "setupcurrency"))
	return (String) Debug.delegate(ba, "setupcurrency", null);
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub SetupCurrency";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Try";
try {RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If (dbServerAddress<>\"\" And dbBaseName<>\"\" And d";
if (((__ref._dbserveraddress).equals("") == false && (__ref._dbbasename).equals("") == false && (__ref._dbusername).equals("") == false && (__ref._dbpassword).equals("") == false)) { 
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="Main.PrimeCurrency = Main.DB.Get_Currency";
_main._primecurrency = _main._db._get_currency(null);
 };
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="Log(\"Currency load failed: \" & LastException)";
__c.Log("Currency load failed: "+BA.ObjectToString(__c.LastException(getActivityBA())));
 };
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="End Sub";
return "";
}
public String  _writesettings(b4a.example.config __ref,String _address,String _base,String _username,String _pass,String _lang,int _langindex,int _fontsize,int _fontindex,int _engineindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(ba, "writesettings"))
	return (String) Debug.delegate(ba, "writesettings", new Object[] {_address,_base,_username,_pass,_lang,_langindex,_fontsize,_fontindex,_engineindex});
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="public Sub WriteSettings(address As String, base A";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="dbServerAddress = address";
__ref._dbserveraddress = _address;
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="dbBaseName = base";
__ref._dbbasename = _base;
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="dbUserName = username";
__ref._dbusername = _username;
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="dbPassword = pass";
__ref._dbpassword = _pass;
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="selLanguage = lang";
__ref._sellanguage = _lang;
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="selLangIndex = langIndex";
__ref._sellangindex = _langindex;
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="selFontSize = fontSize";
__ref._selfontsize = _fontsize;
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="selFontSizeIndex = fontIndex";
__ref._selfontsizeindex = _fontindex;
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="selDBEngineIndex = engineIndex";
__ref._seldbengineindex = _engineindex;
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="WriteConfig";
__ref._writeconfig(null);
RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="End Sub";
return "";
}
}