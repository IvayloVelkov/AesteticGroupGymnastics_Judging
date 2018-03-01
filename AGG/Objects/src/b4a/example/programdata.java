package b4a.example;


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
public static int _tile_small = 0;
public static int _tile_large = 0;
public static int _textsize_extralarge = 0;
public static int _textsize_large = 0;
public static int _textsize_small = 0;
public static int _textsize_huge = 0;
public static int _color_uiholder_left = 0;
public static int _color_uiholder_right = 0;
public static int _color_uigroup_scroller = 0;
public static int _color_header = 0;
public static int _color_footor = 0;
public static int _color_button_normal = 0;
public static int _color_button_pressed = 0;
public static int _color_button_disabled = 0;
public static int _color_button_textcolor = 0;
public static int _button_rounding = 0;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpprinterstatusicon_error = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpprinterstatusicon_success = null;
public b4a.example.main _main = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="programdata";
if (Debug.shouldDelegate(null, "initialize"))
	return (String) Debug.delegate(null, "initialize", new Object[] {_ba});
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="If File.Exists(File.DirDefaultExternal , \"token.c";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"token.config")==anywheresoftware.b4a.keywords.Common.True && anywheresoftware.b4a.keywords.Common.File.Size(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"token.config")>0) { 
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Private raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"token.c";
_raf.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"token.config",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="raf.Close";
_raf.Close();
 };
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="End Sub";
return "";
}
public static String  _read_saveduser(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="programdata";
if (Debug.shouldDelegate(null, "read_saveduser"))
	return (String) Debug.delegate(null, "read_saveduser", new Object[] {_ba});
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub Read_SavedUser";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Private raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="If File.Exists(File.DirDefaultExternal , \"users.c";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"users.config")==anywheresoftware.b4a.keywords.Common.True && anywheresoftware.b4a.keywords.Common.File.Size(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"users.config")>0) { 
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.c";
_raf.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"users.config",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="strUser = raf.ReadEncryptedObject(rafEncPass, ra";
_struser = BA.ObjectToString(_raf.ReadEncryptedObject(BA.NumberToString(_rafencpass),_raf.CurrentPosition));
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="strPass = raf.ReadEncryptedObject(rafEncPass, ra";
_strpass = BA.ObjectToString(_raf.ReadEncryptedObject(BA.NumberToString(_rafencpass),_raf.CurrentPosition));
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="raf.Close";
_raf.Close();
 };
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="End Sub";
return "";
}
}