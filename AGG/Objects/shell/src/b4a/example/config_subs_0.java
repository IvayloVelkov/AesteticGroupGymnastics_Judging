package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class config_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public dbServerAddress,dbBaseName,dbUserName,dbPa";
config._dbserveraddress = RemoteObject.createImmutable("");__ref.setField("_dbserveraddress",config._dbserveraddress);
config._dbbasename = RemoteObject.createImmutable("");__ref.setField("_dbbasename",config._dbbasename);
config._dbusername = RemoteObject.createImmutable("");__ref.setField("_dbusername",config._dbusername);
config._dbpassword = RemoteObject.createImmutable("");__ref.setField("_dbpassword",config._dbpassword);
config._dbengine = RemoteObject.createImmutable("");__ref.setField("_dbengine",config._dbengine);
 //BA.debugLineNum = 4;BA.debugLine="Public configFileName As String";
config._configfilename = RemoteObject.createImmutable("");__ref.setField("_configfilename",config._configfilename);
 //BA.debugLineNum = 5;BA.debugLine="Public cfgMap As Map";
config._cfgmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cfgmap",config._cfgmap);
 //BA.debugLineNum = 6;BA.debugLine="Public selLanguage As String = \"EN\"";
config._sellanguage = BA.ObjectToString("EN");__ref.setField("_sellanguage",config._sellanguage);
 //BA.debugLineNum = 7;BA.debugLine="Public selLangIndex As Int = 0";
config._sellangindex = BA.numberCast(int.class, 0);__ref.setField("_sellangindex",config._sellangindex);
 //BA.debugLineNum = 8;BA.debugLine="Public selFontSize As Int = 12";
config._selfontsize = BA.numberCast(int.class, 12);__ref.setField("_selfontsize",config._selfontsize);
 //BA.debugLineNum = 9;BA.debugLine="Public selFontSizeIndex As Int = 0";
config._selfontsizeindex = BA.numberCast(int.class, 0);__ref.setField("_selfontsizeindex",config._selfontsizeindex);
 //BA.debugLineNum = 10;BA.debugLine="Public selDBEngineIndex As Int = 0";
config._seldbengineindex = BA.numberCast(int.class, 0);__ref.setField("_seldbengineindex",config._seldbengineindex);
 //BA.debugLineNum = 11;BA.debugLine="Public logFileName As String";
config._logfilename = RemoteObject.createImmutable("");__ref.setField("_logfilename",config._logfilename);
 //BA.debugLineNum = 12;BA.debugLine="Public ReportsFolder As String = \"Reports\"";
config._reportsfolder = BA.ObjectToString("Reports");__ref.setField("_reportsfolder",config._reportsfolder);
 //BA.debugLineNum = 13;BA.debugLine="Public DEFAULT_CURRENCY As String = \"BGN\"";
config._default_currency = BA.ObjectToString("BGN");__ref.setField("_default_currency",config._default_currency);
 //BA.debugLineNum = 14;BA.debugLine="Private CurrencyName As String = DEFAULT_CURRENCY";
config._currencyname = __ref.getField(true,"_default_currency");__ref.setField("_currencyname",config._currencyname);
 //BA.debugLineNum = 15;BA.debugLine="Private CurrencyLeftPrefix As String = \"(\"";
config._currencyleftprefix = BA.ObjectToString("(");__ref.setField("_currencyleftprefix",config._currencyleftprefix);
 //BA.debugLineNum = 16;BA.debugLine="Private CurrencyRightPrefix As String = \")\"";
config._currencyrightprefix = BA.ObjectToString(")");__ref.setField("_currencyrightprefix",config._currencyrightprefix);
 //BA.debugLineNum = 17;BA.debugLine="Public CurrencyDisplay As String = CurrencyLeftPr";
config._currencydisplay = RemoteObject.concat(__ref.getField(true,"_currencyleftprefix"),__ref.getField(true,"_currencyname"),__ref.getField(true,"_currencyrightprefix"));__ref.setField("_currencydisplay",config._currencydisplay);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _debugconfig(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DebugConfig (config) ","config",15,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("debugconfig")) return __ref.runUserSub(false, "config","debugconfig", __ref);
 BA.debugLineNum = 121;BA.debugLine="Public Sub DebugConfig";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="cfgMap.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cfgmap").runVoidMethod ("Initialize");
 BA.debugLineNum = 123;BA.debugLine="dbServerAddress = \"192.168.1.135\"";
Debug.ShouldStop(67108864);
__ref.setField ("_dbserveraddress",BA.ObjectToString("192.168.1.135"));
 BA.debugLineNum = 124;BA.debugLine="dbBaseName = \"RestaurantBG\"";
Debug.ShouldStop(134217728);
__ref.setField ("_dbbasename",BA.ObjectToString("RestaurantBG"));
 BA.debugLineNum = 125;BA.debugLine="dbUserName = \"sa\"";
Debug.ShouldStop(268435456);
__ref.setField ("_dbusername",BA.ObjectToString("sa"));
 BA.debugLineNum = 126;BA.debugLine="dbPassword = \"Micr0!nvest\"";
Debug.ShouldStop(536870912);
__ref.setField ("_dbpassword",BA.ObjectToString("Micr0!nvest"));
 BA.debugLineNum = 127;BA.debugLine="selLanguage = \"EN\"";
Debug.ShouldStop(1073741824);
__ref.setField ("_sellanguage",BA.ObjectToString("EN"));
 BA.debugLineNum = 128;BA.debugLine="selLangIndex = 0";
Debug.ShouldStop(-2147483648);
__ref.setField ("_sellangindex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 129;BA.debugLine="selFontSize = 12";
Debug.ShouldStop(1);
__ref.setField ("_selfontsize",BA.numberCast(int.class, 12));
 BA.debugLineNum = 130;BA.debugLine="selFontSizeIndex = 0";
Debug.ShouldStop(2);
__ref.setField ("_selfontsizeindex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 131;BA.debugLine="selDBEngineIndex = 0";
Debug.ShouldStop(4);
__ref.setField ("_seldbengineindex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 132;BA.debugLine="WriteConfig";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.config.class, "_writeconfig");
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _defaultconfig(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DefaultConfig (config) ","config",15,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("defaultconfig")) return __ref.runUserSub(false, "config","defaultconfig", __ref);
 BA.debugLineNum = 106;BA.debugLine="Public Sub DefaultConfig";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="cfgMap.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_cfgmap").runVoidMethod ("Initialize");
 BA.debugLineNum = 108;BA.debugLine="dbServerAddress = \"\"";
Debug.ShouldStop(2048);
__ref.setField ("_dbserveraddress",BA.ObjectToString(""));
 BA.debugLineNum = 109;BA.debugLine="dbBaseName = \"\"";
Debug.ShouldStop(4096);
__ref.setField ("_dbbasename",BA.ObjectToString(""));
 BA.debugLineNum = 110;BA.debugLine="dbUserName = \"\"";
Debug.ShouldStop(8192);
__ref.setField ("_dbusername",BA.ObjectToString(""));
 BA.debugLineNum = 111;BA.debugLine="dbPassword = \"\"";
Debug.ShouldStop(16384);
__ref.setField ("_dbpassword",BA.ObjectToString(""));
 BA.debugLineNum = 112;BA.debugLine="selLanguage = \"EN\"";
Debug.ShouldStop(32768);
__ref.setField ("_sellanguage",BA.ObjectToString("EN"));
 BA.debugLineNum = 113;BA.debugLine="CurrencyName = DEFAULT_CURRENCY";
Debug.ShouldStop(65536);
__ref.setField ("_currencyname",__ref.getField(true,"_default_currency"));
 BA.debugLineNum = 114;BA.debugLine="selLangIndex = 0";
Debug.ShouldStop(131072);
__ref.setField ("_sellangindex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 115;BA.debugLine="selFontSize = 12";
Debug.ShouldStop(262144);
__ref.setField ("_selfontsize",BA.numberCast(int.class, 12));
 BA.debugLineNum = 116;BA.debugLine="selFontSizeIndex = 0";
Debug.ShouldStop(524288);
__ref.setField ("_selfontsizeindex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 117;BA.debugLine="selDBEngineIndex = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_seldbengineindex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 118;BA.debugLine="Main.translate.SetLanguage(selLanguage)";
Debug.ShouldStop(2097152);
config._main._translate.runClassMethod (b4a.example.translator.class, "_setlanguage",(Object)(__ref.getField(true,"_sellanguage")));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getreportsfolder(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetReportsFolder (config) ","config",15,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("getreportsfolder")) return __ref.runUserSub(false, "config","getreportsfolder", __ref);
 BA.debugLineNum = 48;BA.debugLine="Public Sub GetReportsFolder As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Return File.DirRootExternal & Version.Path & \"/\"";
Debug.ShouldStop(65536);
if (true) return RemoteObject.concat(config.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")),RemoteObject.createImmutable("/"),__ref.getField(true,"_reportsfolder"));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (config) ","config",15,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "config","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="cfgMap.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cfgmap").runVoidMethod ("Initialize");
 BA.debugLineNum = 22;BA.debugLine="logFileName = Version.ProgramName&\".log\"";
Debug.ShouldStop(2097152);
__ref.setField ("_logfilename",RemoteObject.concat(config._version._programname,RemoteObject.createImmutable(".log")));
 BA.debugLineNum = 23;BA.debugLine="configFileName = Version.ProgramName&\".config\"";
Debug.ShouldStop(4194304);
__ref.setField ("_configfilename",RemoteObject.concat(config._version._programname,RemoteObject.createImmutable(".config")));
 BA.debugLineNum = 26;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 27;BA.debugLine="If Not (File.Exists(File.DirRootExternal,Version";
Debug.ShouldStop(67108864);
if (config.__c.runMethod(true,"Not",(Object)(config.__c.getField(false,"File").runMethod(true,"Exists",(Object)(config.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 28;BA.debugLine="Log(\"Created Dirt: \" & File.DirRootExternal&Ver";
Debug.ShouldStop(134217728);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Created Dirt: "),config.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")))));
 BA.debugLineNum = 29;BA.debugLine="File.MakeDir(File.DirRootExternal, Version.Path";
Debug.ShouldStop(268435456);
config.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(config.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA"))));
 }else {
 BA.debugLineNum = 31;BA.debugLine="Log(\"Dir already exists.\")";
Debug.ShouldStop(1073741824);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Dir already exists.")));
 };
 BA.debugLineNum = 33;BA.debugLine="If Not (File.Exists(File.DirRootExternal,Version";
Debug.ShouldStop(1);
if (config.__c.runMethod(true,"Not",(Object)(config.__c.getField(false,"File").runMethod(true,"Exists",(Object)(config.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(RemoteObject.concat(config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")),RemoteObject.createImmutable("/"),__ref.getField(true,"_reportsfolder")))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 34;BA.debugLine="Log(\"Created Dirt Reports: \" & File.DirRootExte";
Debug.ShouldStop(2);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Created Dirt Reports: "),config.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")),RemoteObject.createImmutable("/"),__ref.getField(true,"_reportsfolder"))));
 BA.debugLineNum = 35;BA.debugLine="File.MakeDir(File.DirRootExternal, Version.Path";
Debug.ShouldStop(4);
config.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(config.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(RemoteObject.concat(config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")),RemoteObject.createImmutable("/"),__ref.getField(true,"_reportsfolder"))));
 }else {
 BA.debugLineNum = 37;BA.debugLine="Log(\"Reports Dir already exists.\")";
Debug.ShouldStop(16);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Reports Dir already exists.")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 40;BA.debugLine="ToastMessageShow(Main.translate.GetString(\"msgNo";
Debug.ShouldStop(128);
config.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(config._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("msgNoFreeSpace"))))),(Object)(config.__c.getField(true,"False")));
 BA.debugLineNum = 41;BA.debugLine="Log(\"No free space to save config. EX: \" & LastE";
Debug.ShouldStop(256);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("No free space to save config. EX: "),config.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 };
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadconfig(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadConfig (config) ","config",15,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("loadconfig")) return __ref.runUserSub(false, "config","loadconfig", __ref);
 BA.debugLineNum = 53;BA.debugLine="Public Sub LoadConfig";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 56;BA.debugLine="If File.Exists(File.DirRootExternal&Version.Path";
Debug.ShouldStop(8388608);
if (config.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(config.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")))),(Object)(__ref.getField(true,"_configfilename"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 57;BA.debugLine="cfgMap=File.ReadMap(File.DirRootExternal&Versio";
Debug.ShouldStop(16777216);
__ref.setField ("_cfgmap",config.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(RemoteObject.concat(config.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")))),(Object)(__ref.getField(true,"_configfilename"))));
 BA.debugLineNum = 58;BA.debugLine="Log(\"Configuration Loaded.\")";
Debug.ShouldStop(33554432);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Configuration Loaded.")));
 BA.debugLineNum = 60;BA.debugLine="SetConfigFromMap";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.config.class, "_setconfigfrommap");
 }else {
 BA.debugLineNum = 62;BA.debugLine="Log(\"New Configuration Created.\")";
Debug.ShouldStop(536870912);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("New Configuration Created.")));
 BA.debugLineNum = 63;BA.debugLine="DefaultConfig";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.config.class, "_defaultconfig");
 };
 BA.debugLineNum = 65;BA.debugLine="If Not(File.Exists(File.DirRootExternal&Version.";
Debug.ShouldStop(1);
if (config.__c.runMethod(true,"Not",(Object)(config.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(config.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")))),(Object)(__ref.getField(true,"_logfilename"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 66;BA.debugLine="File.WriteString(File.DirRootExternal&Version.P";
Debug.ShouldStop(2);
config.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(RemoteObject.concat(config.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")))),(Object)(__ref.getField(true,"_logfilename")),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 68;BA.debugLine="WriteConfig";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.config.class, "_writeconfig");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 71;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
config.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(config.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 BA.debugLineNum = 72;BA.debugLine="Log(\"Old Config file. Reseting to defaults.\")";
Debug.ShouldStop(128);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Old Config file. Reseting to defaults.")));
 BA.debugLineNum = 73;BA.debugLine="DefaultConfig";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.config.class, "_defaultconfig");
 BA.debugLineNum = 74;BA.debugLine="WriteConfig";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.config.class, "_writeconfig");
 };
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savecurrentconfig(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SaveCurrentConfig (config) ","config",15,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("savecurrentconfig")) return __ref.runUserSub(false, "config","savecurrentconfig", __ref);
 BA.debugLineNum = 89;BA.debugLine="Public Sub SaveCurrentConfig";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 91;BA.debugLine="If File.ExternalWritable Then";
Debug.ShouldStop(67108864);
if (config.__c.getField(false,"File").runMethod(true,"getExternalWritable").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 92;BA.debugLine="Log(\"ConfigMAP: \" & cfgMap)";
Debug.ShouldStop(134217728);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ConfigMAP: "),__ref.getField(false,"_cfgmap"))));
 BA.debugLineNum = 93;BA.debugLine="File.WriteMap(File.DirRootExternal&Version.Path";
Debug.ShouldStop(268435456);
config.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(RemoteObject.concat(config.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),config._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")))),(Object)(__ref.getField(true,"_configfilename")),(Object)(__ref.getField(false,"_cfgmap")));
 BA.debugLineNum = 94;BA.debugLine="Log(\"Configuration Saved.\")";
Debug.ShouldStop(536870912);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Configuration Saved.")));
 }else {
 BA.debugLineNum = 96;BA.debugLine="ToastMessageShow(Main.translate.GetString(\"msgE";
Debug.ShouldStop(-2147483648);
config.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(config._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("msgErrorWritingFile"))))),(Object)(config.__c.getField(true,"False")));
 BA.debugLineNum = 97;BA.debugLine="Log(\"No permission to save configuration file.\"";
Debug.ShouldStop(1);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("No permission to save configuration file.")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 100;BA.debugLine="ToastMessageShow(Main.translate.GetString(\"msgNo";
Debug.ShouldStop(8);
config.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(config._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("msgNoFreeSpace"))))),(Object)(config.__c.getField(true,"False")));
 BA.debugLineNum = 101;BA.debugLine="Log(\"No free space to save config. EX: \" & LastE";
Debug.ShouldStop(16);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("No free space to save config. EX: "),config.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 };
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setconfigfrommap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetConfigFromMap (config) ","config",15,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("setconfigfrommap")) return __ref.runUserSub(false, "config","setconfigfrommap", __ref);
 BA.debugLineNum = 158;BA.debugLine="Private Sub SetConfigFromMap";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="dbServerAddress = cfgMap.Get(\"ServerAddress\")";
Debug.ShouldStop(1073741824);
__ref.setField ("_dbserveraddress",BA.ObjectToString(__ref.getField(false,"_cfgmap").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ServerAddress"))))));
 BA.debugLineNum = 160;BA.debugLine="dbBaseName = cfgMap.Get(\"BaseName\")";
Debug.ShouldStop(-2147483648);
__ref.setField ("_dbbasename",BA.ObjectToString(__ref.getField(false,"_cfgmap").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BaseName"))))));
 BA.debugLineNum = 161;BA.debugLine="dbUserName = cfgMap.Get(\"Username\")";
Debug.ShouldStop(1);
__ref.setField ("_dbusername",BA.ObjectToString(__ref.getField(false,"_cfgmap").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Username"))))));
 BA.debugLineNum = 162;BA.debugLine="dbPassword = cfgMap.Get(\"Password\")";
Debug.ShouldStop(2);
__ref.setField ("_dbpassword",BA.ObjectToString(__ref.getField(false,"_cfgmap").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Password"))))));
 BA.debugLineNum = 163;BA.debugLine="selLanguage = cfgMap.Get(\"Language\")";
Debug.ShouldStop(4);
__ref.setField ("_sellanguage",BA.ObjectToString(__ref.getField(false,"_cfgmap").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Language"))))));
 BA.debugLineNum = 164;BA.debugLine="selLangIndex = cfgMap.Get(\"LanguageIndex\")";
Debug.ShouldStop(8);
__ref.setField ("_sellangindex",BA.numberCast(int.class, __ref.getField(false,"_cfgmap").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("LanguageIndex"))))));
 BA.debugLineNum = 165;BA.debugLine="selFontSize = cfgMap.Get(\"FontSize\")";
Debug.ShouldStop(16);
__ref.setField ("_selfontsize",BA.numberCast(int.class, __ref.getField(false,"_cfgmap").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FontSize"))))));
 BA.debugLineNum = 166;BA.debugLine="selFontSizeIndex = cfgMap.Get(\"FontSizeIndex\")";
Debug.ShouldStop(32);
__ref.setField ("_selfontsizeindex",BA.numberCast(int.class, __ref.getField(false,"_cfgmap").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FontSizeIndex"))))));
 BA.debugLineNum = 167;BA.debugLine="selDBEngineIndex = cfgMap.Get(\"DBEngine\")";
Debug.ShouldStop(64);
__ref.setField ("_seldbengineindex",BA.numberCast(int.class, __ref.getField(false,"_cfgmap").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DBEngine"))))));
 BA.debugLineNum = 168;BA.debugLine="Log(\"DB engine loaded: \" & selDBEngineIndex)";
Debug.ShouldStop(128);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DB engine loaded: "),__ref.getField(true,"_seldbengineindex"))));
 BA.debugLineNum = 169;BA.debugLine="Main.DB.SetDBEngine(selDBEngineIndex)";
Debug.ShouldStop(256);
config._main._db.runClassMethod (b4a.example.dbsqlconnector.class, "_setdbengine",(Object)(__ref.getField(true,"_seldbengineindex")));
 BA.debugLineNum = 170;BA.debugLine="Main.translate.SetLanguage(selLanguage)";
Debug.ShouldStop(512);
config._main._translate.runClassMethod (b4a.example.translator.class, "_setlanguage",(Object)(__ref.getField(true,"_sellanguage")));
 BA.debugLineNum = 171;BA.debugLine="ToastMessageShow(Main.translate.GetString(\"msgCon";
Debug.ShouldStop(1024);
config.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(config._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("msgConfigLoaded"))))),(Object)(config.__c.getField(true,"False")));
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupcurrency(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetupCurrency (config) ","config",15,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("setupcurrency")) return __ref.runUserSub(false, "config","setupcurrency", __ref);
 BA.debugLineNum = 79;BA.debugLine="Public Sub SetupCurrency";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 81;BA.debugLine="If (dbServerAddress<>\"\" And dbBaseName<>\"\" And d";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("!",__ref.getField(true,"_dbserveraddress"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_dbbasename"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_dbusername"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_dbpassword"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 82;BA.debugLine="Main.PrimeCurrency = Main.DB.Get_Currency";
Debug.ShouldStop(131072);
config._main._primecurrency = config._main._db.runClassMethod (b4a.example.dbsqlconnector.class, "_get_currency");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 85;BA.debugLine="Log(\"Currency load failed: \" & LastException)";
Debug.ShouldStop(1048576);
config.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Currency load failed: "),config.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 };
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writeconfig(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("WriteConfig (config) ","config",15,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("writeconfig")) return __ref.runUserSub(false, "config","writeconfig", __ref);
 BA.debugLineNum = 148;BA.debugLine="Public Sub WriteConfig";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="cfgMap.Clear";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cfgmap").runVoidMethod ("Clear");
 BA.debugLineNum = 150;BA.debugLine="cfgMap.Put(\"ServerAddress\",dbServerAddress)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_cfgmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ServerAddress"))),(Object)((__ref.getField(true,"_dbserveraddress"))));
 BA.debugLineNum = 151;BA.debugLine="cfgMap.Put(\"BaseName\",dbBaseName)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_cfgmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("BaseName"))),(Object)((__ref.getField(true,"_dbbasename"))));
 BA.debugLineNum = 152;BA.debugLine="cfgMap.Put(\"Username\",dbUserName)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_cfgmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Username"))),(Object)((__ref.getField(true,"_dbusername"))));
 BA.debugLineNum = 153;BA.debugLine="cfgMap.Put(\"Password\",dbPassword)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_cfgmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Password"))),(Object)((__ref.getField(true,"_dbpassword"))));
 BA.debugLineNum = 154;BA.debugLine="cfgMap.Put(\"DBEngine\",selDBEngineIndex)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cfgmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DBEngine"))),(Object)((__ref.getField(true,"_seldbengineindex"))));
 BA.debugLineNum = 155;BA.debugLine="SaveCurrentConfig";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.config.class, "_savecurrentconfig");
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writesettings(RemoteObject __ref,RemoteObject _address,RemoteObject _base,RemoteObject _username,RemoteObject _pass,RemoteObject _lang,RemoteObject _langindex,RemoteObject _fontsize,RemoteObject _fontindex,RemoteObject _engineindex) throws Exception{
try {
		Debug.PushSubsStack("WriteSettings (config) ","config",15,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("writesettings")) return __ref.runUserSub(false, "config","writesettings", __ref, _address, _base, _username, _pass, _lang, _langindex, _fontsize, _fontindex, _engineindex);
Debug.locals.put("address", _address);
Debug.locals.put("base", _base);
Debug.locals.put("username", _username);
Debug.locals.put("pass", _pass);
Debug.locals.put("lang", _lang);
Debug.locals.put("langIndex", _langindex);
Debug.locals.put("fontSize", _fontsize);
Debug.locals.put("fontIndex", _fontindex);
Debug.locals.put("engineIndex", _engineindex);
 BA.debugLineNum = 135;BA.debugLine="public Sub WriteSettings(address As String, base A";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="dbServerAddress = address";
Debug.ShouldStop(128);
__ref.setField ("_dbserveraddress",_address);
 BA.debugLineNum = 137;BA.debugLine="dbBaseName = base";
Debug.ShouldStop(256);
__ref.setField ("_dbbasename",_base);
 BA.debugLineNum = 138;BA.debugLine="dbUserName = username";
Debug.ShouldStop(512);
__ref.setField ("_dbusername",_username);
 BA.debugLineNum = 139;BA.debugLine="dbPassword = pass";
Debug.ShouldStop(1024);
__ref.setField ("_dbpassword",_pass);
 BA.debugLineNum = 140;BA.debugLine="selLanguage = lang";
Debug.ShouldStop(2048);
__ref.setField ("_sellanguage",_lang);
 BA.debugLineNum = 141;BA.debugLine="selLangIndex = langIndex";
Debug.ShouldStop(4096);
__ref.setField ("_sellangindex",_langindex);
 BA.debugLineNum = 142;BA.debugLine="selFontSize = fontSize";
Debug.ShouldStop(8192);
__ref.setField ("_selfontsize",_fontsize);
 BA.debugLineNum = 143;BA.debugLine="selFontSizeIndex = fontIndex";
Debug.ShouldStop(16384);
__ref.setField ("_selfontsizeindex",_fontindex);
 BA.debugLineNum = 144;BA.debugLine="selDBEngineIndex = engineIndex";
Debug.ShouldStop(32768);
__ref.setField ("_seldbengineindex",_engineindex);
 BA.debugLineNum = 145;BA.debugLine="WriteConfig";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.config.class, "_writeconfig");
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}