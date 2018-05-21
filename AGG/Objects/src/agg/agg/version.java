package agg.agg;


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
public agg.agg.main _main = null;
public agg.agg.starter _starter = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.helperfunctions _helperfunctions = null;
public static String  _path(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="version";
if (Debug.shouldDelegate(null, "path"))
	return (String) Debug.delegate(null, "path", new Object[] {_ba});
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Path As String";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Return \"/Microinvest/\"&ProgramName";
if (true) return "/Microinvest/"+_programname;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
}