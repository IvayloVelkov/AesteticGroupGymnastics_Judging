package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class programdata {
private static programdata mostCurrent = new programdata();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static String _struser = "";
public static String _strpass = "";
public static int _rafencpass = 0;
public static boolean _sameuser = false;
public static int _activej = 0;
public static String _dbip = "";
public static String _dbserveraddress = "";
public static String _dbbasename = "";
public static String _dbusername = "";
public static String _dbpassword = "";
public static int _defaultfont = 0;
public static double _finalscore = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public strUser As String = \"\"";
_struser = "";
 //BA.debugLineNum = 4;BA.debugLine="Public strPass As String = \"\"";
_strpass = "";
 //BA.debugLineNum = 5;BA.debugLine="Public rafEncPass As Int = 6380						'Парола за R";
_rafencpass = (int) (6380);
 //BA.debugLineNum = 6;BA.debugLine="Public sameUser As Boolean";
_sameuser = false;
 //BA.debugLineNum = 7;BA.debugLine="Public activeJ As Int";
_activej = 0;
 //BA.debugLineNum = 8;BA.debugLine="Public dbIP As String";
_dbip = "";
 //BA.debugLineNum = 9;BA.debugLine="Public dbServerAddress As String";
_dbserveraddress = "";
 //BA.debugLineNum = 10;BA.debugLine="Public dbBaseName As String";
_dbbasename = "";
 //BA.debugLineNum = 11;BA.debugLine="Public dbUserName As String";
_dbusername = "";
 //BA.debugLineNum = 12;BA.debugLine="Public dbPassword As String";
_dbpassword = "";
 //BA.debugLineNum = 15;BA.debugLine="Public DefaultFont As Int = 14";
_defaultfont = (int) (14);
 //BA.debugLineNum = 17;BA.debugLine="Public finalScore As Double";
_finalscore = 0;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
}
