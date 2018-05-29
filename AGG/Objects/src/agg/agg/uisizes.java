package agg.agg;


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
public agg.agg.main _main = null;
public agg.agg.starter _starter = null;
public agg.agg.programdata _programdata = null;
public agg.agg.version _version = null;
public agg.agg.helperfunctions _helperfunctions = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="uisizes";
if (Debug.shouldDelegate(null, "initialize"))
	return (String) Debug.delegate(null, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="DefaultFont = 16";
_defaultfont = (int) (16);
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="initSettingsWidth = 70%x";
_initsettingswidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (70),_ba);
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="keyboardWidth = 100%x";
_keyboardwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba);
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="HeaderHeight = 8%y";
_headerheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),_ba);
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="FooterHeight = 5%y";
_footerheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba);
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="GroupScroller = 15%x";
_groupscroller = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),_ba);
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="DefaultPadding = 1%x";
_defaultpadding = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),_ba);
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="LeftPart = 100%x";
_leftpart = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba);
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="settingsWidth = 80%x";
_settingswidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),_ba);
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="GroupButtonHeight = 64dip";
_groupbuttonheight = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (64));
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="GroupColor_Normal = 0xFF19ABFF";
_groupcolor_normal = BA.NumberToString(0xff19abff);
RDebugUtils.currentLine=5701644;
 //BA.debugLineNum = 5701644;BA.debugLine="GroupColor_Pressed = Colors.White";
_groupcolor_pressed = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=5701646;
 //BA.debugLineNum = 5701646;BA.debugLine="PressedTextColor = Colors.Black";
_pressedtextcolor = anywheresoftware.b4a.keywords.Common.Colors.Black;
RDebugUtils.currentLine=5701647;
 //BA.debugLineNum = 5701647;BA.debugLine="ButtonLeft = 5%x";
_buttonleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),_ba);
RDebugUtils.currentLine=5701648;
 //BA.debugLineNum = 5701648;BA.debugLine="End Sub";
return "";
}
}