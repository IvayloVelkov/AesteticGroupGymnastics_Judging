package agg.agg;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class programdata_subs_0 {


public static RemoteObject  _initialize(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (programdata) ","programdata",9,_ba,programdata.mostCurrent,16);
if (RapidSub.canDelegate("initialize")) return agg.agg.programdata.remoteMe.runUserSub(false, "programdata","initialize", _ba);
;
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 12;BA.debugLine="Public finalScore as Double";
programdata._finalscore = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}