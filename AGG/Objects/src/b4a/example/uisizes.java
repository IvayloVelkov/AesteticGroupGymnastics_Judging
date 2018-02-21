package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class uisizes {
private static uisizes mostCurrent = new uisizes();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static int _headerheight = 0;
public static int _footerheight = 0;
public static int _leftpart = 0;
public static int _groupscroller = 0;
public static int _buttonleft = 0;
public static int _settingswidth = 0;
public static int _initsettingswidth = 0;
public static int _keyboardwidth = 0;
public static int _groupbuttonheight = 0;
public static int _defaultfont = 0;
public static int _headerlabelheight = 0;
public static int _footerlabelheight = 0;
public static int _defaultpadding = 0;
public static int _pressedtextcolor = 0;
public static String _groupcolor_normal = "";
public static String _groupcolor_pressed = "";
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="uisizes";
if (Debug.shouldDelegate(null, "initialize"))
	return (String) Debug.delegate(null, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="DefaultFont = 18";
_defaultfont = (int) (18);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="initSettingsWidth = 70%x";
_initsettingswidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (70),_ba);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="keyboardWidth = 100%x";
_keyboardwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba);
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="HeaderHeight = 8%y";
_headerheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),_ba);
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="FooterHeight = 5%y";
_footerheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba);
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="GroupScroller = 15%x";
_groupscroller = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),_ba);
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="DefaultPadding = 1%x";
_defaultpadding = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),_ba);
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="LeftPart = 100%x";
_leftpart = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba);
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="settingsWidth = 80%x";
_settingswidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),_ba);
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="GroupButtonHeight = 64dip";
_groupbuttonheight = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (64));
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="GroupColor_Normal = 0xFF19ABFF";
_groupcolor_normal = BA.NumberToString(0xff19abff);
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="GroupColor_Pressed = Colors.White";
_groupcolor_pressed = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="PressedTextColor = Colors.Black";
_pressedtextcolor = anywheresoftware.b4a.keywords.Common.Colors.Black;
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="ButtonLeft = 5%x";
_buttonleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),_ba);
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="End Sub";
return "";
}
}