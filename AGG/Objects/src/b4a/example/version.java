package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class version {
private static version mostCurrent = new version();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static int _productid = 0;
public static String _programname = "";
public static String _productindictionary = "";
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public static String  _path(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="version";
if (Debug.shouldDelegate(null, "path"))
	return (String) Debug.delegate(null, "path", new Object[] {_ba});
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub Path As String";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Return \"/Microinvest/\"&ProgramName";
if (true) return "/Microinvest/"+_programname;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
}