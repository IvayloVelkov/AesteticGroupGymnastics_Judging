package agg.agg;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sendscore_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("asView (sendscore) ","sendscore",3,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "sendscore","asview", __ref);
 BA.debugLineNum = 35;BA.debugLine="Public Sub asView As Panel";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Return finalPanel";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_finalpanel");
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
 //BA.debugLineNum = 5;BA.debugLine="Private SendBtn As Button";
sendscore._sendbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_sendbtn",sendscore._sendbtn);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _finalscore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("finalScore (sendscore) ","sendscore",3,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("finalscore")) return __ref.runUserSub(false, "sendscore","finalscore", __ref);
 BA.debugLineNum = 29;BA.debugLine="Public Sub finalScore";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="teamscore.Text = Main.translate.GetString(\"Score\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_teamscore").runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(sendscore._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Score"))),RemoteObject.createImmutable(": "),sendscore.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((sendscore._main.getObject())),(Object)(RemoteObject.createImmutable("finalScore"))))));
 BA.debugLineNum = 32;BA.debugLine="Log(\"FINAL\"&teamscore.Text)";
Debug.ShouldStop(-2147483648);
sendscore.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FINAL"),__ref.getField(false,"_teamscore").runMethod(true,"getText"))));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sendscore) ","sendscore",3,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "sendscore","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="finalPanel.Initialize(\"\")";
Debug.ShouldStop(512);
__ref.getField(false,"_finalpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 11;BA.debugLine="teamname.Initialize(\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_teamname").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 12;BA.debugLine="teamscore.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_teamscore").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 13;BA.debugLine="SendBtn.Initialize(\"send\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_sendbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("send")));
 BA.debugLineNum = 15;BA.debugLine="finalPanel.AddView(teamname, 20%x, 10%y, 60%x, 10";
Debug.ShouldStop(16384);
__ref.getField(false,"_finalpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teamname").getObject())),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 16;BA.debugLine="teamname.Hint = Main.translate.GetString(\"TeamNam";
Debug.ShouldStop(32768);
__ref.getField(false,"_teamname").runMethod(true,"setHint",sendscore._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("TeamName"))));
 BA.debugLineNum = 17;BA.debugLine="teamname.SingleLine = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_teamname").runVoidMethod ("setSingleLine",sendscore.__c.getField(true,"True"));
 BA.debugLineNum = 19;BA.debugLine="finalPanel.AddView(teamscore, 20%x, 35%y, 60%x, 1";
Debug.ShouldStop(262144);
__ref.getField(false,"_finalpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teamscore").getObject())),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 20;BA.debugLine="teamscore.Gravity = Gravity.CENTER";
Debug.ShouldStop(524288);
__ref.getField(false,"_teamscore").runMethod(true,"setGravity",sendscore.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 22;BA.debugLine="finalPanel.AddView(SendBtn, 20%x, 55%y, 60%x, 10%";
Debug.ShouldStop(2097152);
__ref.getField(false,"_finalpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sendbtn").getObject())),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 55)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(sendscore.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 23;BA.debugLine="SendBtn.Text = Main.translate.GetString(\"SendBtn\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sendbtn").runMethod(true,"setText",BA.ObjectToCharSequence(sendscore._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("SendBtn")))));
 BA.debugLineNum = 24;BA.debugLine="HelperFunctions.Apply_ViewStyle(SendBtn,Colors.Wh";
Debug.ShouldStop(8388608);
sendscore._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_sendbtn").getObject()),(Object)(sendscore.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 0xff4ac2ff)),(Object)(BA.numberCast(int.class, 0xff149be0)),(Object)(BA.numberCast(int.class, 0xff2cb7ff)),(Object)(BA.numberCast(int.class, 0xff2cb7ff)),(Object)(BA.numberCast(int.class, 0x66040509)),(Object)(BA.numberCast(int.class, 0x66040509)),(Object)(BA.numberCast(int.class, 60)));
 BA.debugLineNum = 25;BA.debugLine="SendBtn.Padding = Array As Int(15,0,0,0)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sendbtn").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 15),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 26;BA.debugLine="SendBtn.SingleLine = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sendbtn").runVoidMethod ("setSingleLine",sendscore.__c.getField(true,"True"));
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
		Debug.PushSubsStack("send_Click (sendscore) ","sendscore",3,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("send_click")) return __ref.runUserSub(false, "sendscore","send_click", __ref);
 BA.debugLineNum = 39;BA.debugLine="Private Sub send_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If teamname.Text = \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_teamname").runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 41;BA.debugLine="Msgbox(\"Добавате име на отбора.\",\"Липсва име.\")";
Debug.ShouldStop(256);
sendscore.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Добавате име на отбора.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Липсва име."))),__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}