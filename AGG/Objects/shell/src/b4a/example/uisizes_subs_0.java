package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class uisizes_subs_0 {


public static RemoteObject  _initialize(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (uisizes) ","uisizes",9,_ba,uisizes.mostCurrent,10);
if (RapidSub.canDelegate("initialize")) return b4a.example.uisizes.remoteMe.runUserSub(false, "uisizes","initialize", _ba);
;
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="DefaultFont = 16";
Debug.ShouldStop(1024);
uisizes._defaultfont = BA.numberCast(int.class, 16);
 BA.debugLineNum = 12;BA.debugLine="initSettingsWidth = 70%x";
Debug.ShouldStop(2048);
uisizes._initsettingswidth = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),_ba);
 BA.debugLineNum = 13;BA.debugLine="keyboardWidth = 100%x";
Debug.ShouldStop(4096);
uisizes._keyboardwidth = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba);
 BA.debugLineNum = 14;BA.debugLine="HeaderHeight = 8%y";
Debug.ShouldStop(8192);
uisizes._headerheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),_ba);
 BA.debugLineNum = 15;BA.debugLine="FooterHeight = 5%y";
Debug.ShouldStop(16384);
uisizes._footerheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),_ba);
 BA.debugLineNum = 16;BA.debugLine="GroupScroller = 15%x";
Debug.ShouldStop(32768);
uisizes._groupscroller = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),_ba);
 BA.debugLineNum = 17;BA.debugLine="DefaultPadding = 1%x";
Debug.ShouldStop(65536);
uisizes._defaultpadding = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),_ba);
 BA.debugLineNum = 18;BA.debugLine="LeftPart = 100%x";
Debug.ShouldStop(131072);
uisizes._leftpart = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba);
 BA.debugLineNum = 19;BA.debugLine="settingsWidth = 80%x";
Debug.ShouldStop(262144);
uisizes._settingswidth = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),_ba);
 BA.debugLineNum = 20;BA.debugLine="GroupButtonHeight = 64dip";
Debug.ShouldStop(524288);
uisizes._groupbuttonheight = uisizes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)));
 BA.debugLineNum = 21;BA.debugLine="GroupColor_Normal = 0xFF19ABFF";
Debug.ShouldStop(1048576);
uisizes._groupcolor_normal = BA.NumberToString(0xff19abff);
 BA.debugLineNum = 22;BA.debugLine="GroupColor_Pressed = Colors.White";
Debug.ShouldStop(2097152);
uisizes._groupcolor_pressed = BA.NumberToString(uisizes.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 24;BA.debugLine="PressedTextColor = Colors.Black";
Debug.ShouldStop(8388608);
uisizes._pressedtextcolor = uisizes.mostCurrent.__c.getField(false,"Colors").getField(true,"Black");
 BA.debugLineNum = 25;BA.debugLine="ButtonLeft = 5%x";
Debug.ShouldStop(16777216);
uisizes._buttonleft = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),_ba);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public HeaderHeight, FooterHeight, LeftPart,Group";
uisizes._headerheight = RemoteObject.createImmutable(0);
uisizes._footerheight = RemoteObject.createImmutable(0);
uisizes._leftpart = RemoteObject.createImmutable(0);
uisizes._groupscroller = RemoteObject.createImmutable(0);
uisizes._buttonleft = RemoteObject.createImmutable(0);
uisizes._settingswidth = RemoteObject.createImmutable(0);
uisizes._initsettingswidth = RemoteObject.createImmutable(0);
uisizes._keyboardwidth = RemoteObject.createImmutable(0);
uisizes._groupbuttonheight = RemoteObject.createImmutable(0);
uisizes._defaultfont = RemoteObject.createImmutable(0);
uisizes._headerlabelheight = RemoteObject.createImmutable(0);
uisizes._footerlabelheight = RemoteObject.createImmutable(0);
uisizes._defaultpadding = RemoteObject.createImmutable(0);
uisizes._pressedtextcolor = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 6;BA.debugLine="Public GroupColor_Normal, GroupColor_Pressed As S";
uisizes._groupcolor_normal = RemoteObject.createImmutable("");
uisizes._groupcolor_pressed = RemoteObject.createImmutable("");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}