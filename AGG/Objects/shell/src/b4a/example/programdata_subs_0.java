package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class programdata_subs_0 {


public static RemoteObject  _initialize(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (programdata) ","programdata",8,_ba,programdata.mostCurrent,35);
if (RapidSub.canDelegate("initialize")) return b4a.example.programdata.remoteMe.runUserSub(false, "programdata","initialize", _ba);
RemoteObject _raf = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
;
 BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="If File.Exists(File.DirDefaultExternal , \"token.c";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",programdata.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(programdata.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("token.config"))),programdata.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean(">",programdata.mostCurrent.__c.getField(false,"File").runMethod(true,"Size",(Object)(programdata.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("token.config"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 37;BA.debugLine="Private raf As RandomAccessFile";
Debug.ShouldStop(16);
_raf = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");Debug.locals.put("raf", _raf);
 BA.debugLineNum = 38;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"token.c";
Debug.ShouldStop(32);
_raf.runVoidMethod ("Initialize",(Object)(programdata.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("token.config")),(Object)(programdata.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 39;BA.debugLine="raf.Close";
Debug.ShouldStop(64);
_raf.runVoidMethod ("Close");
 };
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
 //BA.debugLineNum = 3;BA.debugLine="Public strUser As String = \"\"";
programdata._struser = BA.ObjectToString("");
 //BA.debugLineNum = 4;BA.debugLine="Public strPass As String = \"\"";
programdata._strpass = BA.ObjectToString("");
 //BA.debugLineNum = 5;BA.debugLine="Public rafEncPass As Int = 6380						'Парола за R";
programdata._rafencpass = BA.numberCast(int.class, 6380);
 //BA.debugLineNum = 6;BA.debugLine="Public sameUser As Boolean";
programdata._sameuser = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 10;BA.debugLine="Public DefaultFont As Int = 14";
programdata._defaultfont = BA.numberCast(int.class, 14);
 //BA.debugLineNum = 11;BA.debugLine="Public Tile_Small As Int";
programdata._tile_small = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="Public Tile_Large As Int";
programdata._tile_large = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="Public TextSize_ExtraLarge As Int";
programdata._textsize_extralarge = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="Public TextSize_Large As Int";
programdata._textsize_large = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 15;BA.debugLine="Public TextSize_Small As Int";
programdata._textsize_small = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 16;BA.debugLine="Public TextSize_Huge As Int";
programdata._textsize_huge = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 19;BA.debugLine="Public COLOR_UIHOLDER_LEFT As Int = 0xFFF4F4F4";
programdata._color_uiholder_left = BA.numberCast(int.class, 0xfff4f4f4);
 //BA.debugLineNum = 20;BA.debugLine="Public COLOR_UIHOLDER_RIGHT As Int = 0xFFFFFFFF";
programdata._color_uiholder_right = BA.numberCast(int.class, 0xffffffff);
 //BA.debugLineNum = 21;BA.debugLine="Public COLOR_UIGROUP_SCROLLER As Int = 0xFFEAEAEA";
programdata._color_uigroup_scroller = BA.numberCast(int.class, 0xffeaeaea);
 //BA.debugLineNum = 22;BA.debugLine="Public COLOR_HEADER As Int = 0xFF0068A0";
programdata._color_header = BA.numberCast(int.class, 0xff0068a0);
 //BA.debugLineNum = 23;BA.debugLine="Public COLOR_FOOTOR As Int = 0xFFFFFFFF'0xFF19ABF";
programdata._color_footor = BA.numberCast(int.class, 0xffffffff);
 //BA.debugLineNum = 24;BA.debugLine="Public COLOR_BUTTON_NORMAL As Int = 0xFF0580C7";
programdata._color_button_normal = BA.numberCast(int.class, 0xff0580c7);
 //BA.debugLineNum = 25;BA.debugLine="Public COLOR_BUTTON_PRESSED As Int = 0xFF38B6FF";
programdata._color_button_pressed = BA.numberCast(int.class, 0xff38b6ff);
 //BA.debugLineNum = 26;BA.debugLine="Public COLOR_BUTTON_DISABLED As Int = 0xFF38B6FF";
programdata._color_button_disabled = BA.numberCast(int.class, 0xff38b6ff);
 //BA.debugLineNum = 27;BA.debugLine="Public COLOR_BUTTON_TEXTCOLOR As Int = 0xFFFFFFFF";
programdata._color_button_textcolor = BA.numberCast(int.class, 0xffffffff);
 //BA.debugLineNum = 28;BA.debugLine="Public BUTTON_ROUNDING As Int = 0";
programdata._button_rounding = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 31;BA.debugLine="Public bmpPrinterStatusIcon_Error, bmpPrinterStat";
programdata._bmpprinterstatusicon_error = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
programdata._bmpprinterstatusicon_success = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _read_saveduser(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Read_SavedUser (programdata) ","programdata",8,_ba,programdata.mostCurrent,44);
if (RapidSub.canDelegate("read_saveduser")) return b4a.example.programdata.remoteMe.runUserSub(false, "programdata","read_saveduser", _ba);
RemoteObject _raf = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
;
 BA.debugLineNum = 44;BA.debugLine="Private Sub Read_SavedUser";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Private raf As RandomAccessFile";
Debug.ShouldStop(4096);
_raf = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");Debug.locals.put("raf", _raf);
 BA.debugLineNum = 46;BA.debugLine="If File.Exists(File.DirDefaultExternal , \"users.c";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",programdata.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(programdata.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("users.config"))),programdata.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean(">",programdata.mostCurrent.__c.getField(false,"File").runMethod(true,"Size",(Object)(programdata.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("users.config"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 47;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.c";
Debug.ShouldStop(16384);
_raf.runVoidMethod ("Initialize",(Object)(programdata.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("users.config")),(Object)(programdata.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 48;BA.debugLine="strUser = raf.ReadEncryptedObject(rafEncPass, ra";
Debug.ShouldStop(32768);
programdata._struser = BA.ObjectToString(_raf.runMethod(false,"ReadEncryptedObject",(Object)(BA.NumberToString(programdata._rafencpass)),(Object)(_raf.getField(true,"CurrentPosition"))));
 BA.debugLineNum = 49;BA.debugLine="strPass = raf.ReadEncryptedObject(rafEncPass, ra";
Debug.ShouldStop(65536);
programdata._strpass = BA.ObjectToString(_raf.runMethod(false,"ReadEncryptedObject",(Object)(BA.NumberToString(programdata._rafencpass)),(Object)(_raf.getField(true,"CurrentPosition"))));
 BA.debugLineNum = 50;BA.debugLine="raf.Close";
Debug.ShouldStop(131072);
_raf.runVoidMethod ("Close");
 };
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}