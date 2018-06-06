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
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.version _version = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 11;BA.debugLine="DefaultFont = 16";
_defaultfont = (int) (16);
 //BA.debugLineNum = 12;BA.debugLine="initSettingsWidth = 70%x";
_initsettingswidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (70),_ba);
 //BA.debugLineNum = 13;BA.debugLine="keyboardWidth = 100%x";
_keyboardwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba);
 //BA.debugLineNum = 14;BA.debugLine="HeaderHeight = 8%y";
_headerheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),_ba);
 //BA.debugLineNum = 15;BA.debugLine="FooterHeight = 5%y";
_footerheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba);
 //BA.debugLineNum = 16;BA.debugLine="GroupScroller = 15%x";
_groupscroller = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),_ba);
 //BA.debugLineNum = 17;BA.debugLine="DefaultPadding = 1%x";
_defaultpadding = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),_ba);
 //BA.debugLineNum = 18;BA.debugLine="LeftPart = 100%x";
_leftpart = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba);
 //BA.debugLineNum = 19;BA.debugLine="settingsWidth = 80%x";
_settingswidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),_ba);
 //BA.debugLineNum = 20;BA.debugLine="GroupButtonHeight = 64dip";
_groupbuttonheight = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (64));
 //BA.debugLineNum = 21;BA.debugLine="GroupColor_Normal = 0xFF19ABFF";
_groupcolor_normal = BA.NumberToString(0xff19abff);
 //BA.debugLineNum = 22;BA.debugLine="GroupColor_Pressed = Colors.White";
_groupcolor_pressed = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 24;BA.debugLine="PressedTextColor = Colors.Black";
_pressedtextcolor = anywheresoftware.b4a.keywords.Common.Colors.Black;
 //BA.debugLineNum = 25;BA.debugLine="ButtonLeft = 5%x";
_buttonleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),_ba);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public HeaderHeight, FooterHeight, LeftPart,Group";
_headerheight = 0;
_footerheight = 0;
_leftpart = 0;
_groupscroller = 0;
_buttonleft = 0;
_settingswidth = 0;
_initsettingswidth = 0;
_keyboardwidth = 0;
_groupbuttonheight = 0;
_defaultfont = 0;
_headerlabelheight = 0;
_footerlabelheight = 0;
_defaultpadding = 0;
_pressedtextcolor = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public GroupColor_Normal, GroupColor_Pressed As S";
_groupcolor_normal = "";
_groupcolor_pressed = "";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
