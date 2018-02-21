package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class typejudge_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("asView (typejudge) ","typejudge",2,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "typejudge","asview", __ref);
 BA.debugLineNum = 16;BA.debugLine="Public Sub asView As Panel";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Return typePanel";
Debug.ShouldStop(65536);
if (true) return __ref.getField(false,"_typepanel");
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public typePanel As Panel";
typejudge._typepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_typepanel",typejudge._typepanel);
 //BA.debugLineNum = 3;BA.debugLine="Private btnAv As Button";
typejudge._btnav = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnav",typejudge._btnav);
 //BA.debugLineNum = 4;BA.debugLine="Private btnTv As Button";
typejudge._btntv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btntv",typejudge._btntv);
 //BA.debugLineNum = 5;BA.debugLine="Private btnExe As Button";
typejudge._btnexe = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnexe",typejudge._btnexe);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (typejudge) ","typejudge",2,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "typejudge","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="typePanel.Initialize(\"\")";
Debug.ShouldStop(512);
__ref.getField(false,"_typepanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 11;BA.debugLine="btnAv.Initialize(\"AVtypeBtn\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_btnav").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AVtypeBtn")));
 BA.debugLineNum = 12;BA.debugLine="btnTv.Initialize(\"TVtypeBtn\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_btntv").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TVtypeBtn")));
 BA.debugLineNum = 13;BA.debugLine="btnExe.Initialize(\"EXEtypeBtn\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnexe").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("EXEtypeBtn")));
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}