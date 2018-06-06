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
public static int _defaultfont = 0;
public static double _finalscore = 0;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="Public DefaultFont As Int = 14";
_defaultfont = (int) (14);
 //BA.debugLineNum = 12;BA.debugLine="Public finalScore as Double";
_finalscore = 0;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
}
