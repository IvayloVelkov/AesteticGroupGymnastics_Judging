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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public static String  _path(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Path As String";
 //BA.debugLineNum = 9;BA.debugLine="Return \"/Microinvest/\"&ProgramName";
if (true) return "/Microinvest/"+_programname;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public ProductID As Int = 301							'Product Iden";
_productid = (int) (301);
 //BA.debugLineNum = 3;BA.debugLine="Public ProgramName As String = \"AGG\"";
_programname = "AGG";
 //BA.debugLineNum = 4;BA.debugLine="Public ProductInDictionary As String = \"AndroidPr";
_productindictionary = "AndroidProjects";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
