package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sendscore_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("asView (sendscore) ","sendscore",4,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "sendscore","asview", __ref);
 BA.debugLineNum = 29;BA.debugLine="Public Sub asView As Panel";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Return finalPanel";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(false,"_finalpanel");
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 2;BA.debugLine="Public finalPanel As Panel";
sendscore._finalpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_finalpanel",sendscore._finalpanel);
 //BA.debugLineNum = 3;BA.debugLine="Private teamname As EditText";
sendscore._teamname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_teamname",sendscore._teamname);
 //BA.debugLineNum = 4;BA.debugLine="Private teamscore As Label";
sendscore._teamscore = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_teamscore",sendscore._teamscore);
 //BA.debugLineNum = 5;BA.debugLine="Private score As Double";
sendscore._score = RemoteObject.createImmutable(0);__ref.setField("_score",sendscore._score);
 //BA.debugLineNum = 6;BA.debugLine="Private SendBtn As Button";
sendscore._sendbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_sendbtn",sendscore._sendbtn);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sendscore) ","sendscore",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "sendscore","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="finalPanel.Initialize(\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_finalpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 12;BA.debugLine="teamname.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_teamname").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 13;BA.debugLine="teamscore.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_teamscore").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 14;BA.debugLine="SendBtn.Initialize(\"send\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_sendbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("send")));
 BA.debugLineNum = 16;BA.debugLine="finalPanel.AddView(teamname, 20%x, 10%y, 60%x, 10";
Debug.ShouldStop(32768);
__ref.getField(false,"_finalpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teamname").getObject())),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 17;BA.debugLine="teamname.Hint = \"Team Name\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_teamname").runMethod(true,"setHint",BA.ObjectToString("Team Name"));
 BA.debugLineNum = 18;BA.debugLine="teamname.SingleLine = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_teamname").runVoidMethod ("setSingleLine",sendscore.__c.getField(true,"True"));
 BA.debugLineNum = 20;BA.debugLine="finalPanel.AddView(teamscore, 20%x, 35%y, 60%x, 1";
Debug.ShouldStop(524288);
__ref.getField(false,"_finalpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teamscore").getObject())),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 21;BA.debugLine="teamscore.Text = \"0.00\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_teamscore").runMethod(true,"setText",BA.ObjectToCharSequence("0.00"));
 BA.debugLineNum = 22;BA.debugLine="teamscore.Gravity = Gravity.CENTER";
Debug.ShouldStop(2097152);
__ref.getField(false,"_teamscore").runMethod(true,"setGravity",sendscore.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 24;BA.debugLine="finalPanel.AddView(SendBtn, 20%x, 55%y, 60%x, 10%";
Debug.ShouldStop(8388608);
__ref.getField(false,"_finalpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sendbtn").getObject())),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 55)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 25;BA.debugLine="SendBtn.Text = \"Send\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sendbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Send"));
 BA.debugLineNum = 26;BA.debugLine="SendBtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sendbtn").runMethod(true,"setGravity",sendscore.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _send_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("send_Click (sendscore) ","sendscore",4,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("send_click")) return __ref.runUserSub(false, "sendscore","send_click", __ref);
 BA.debugLineNum = 33;BA.debugLine="Private Sub send_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}