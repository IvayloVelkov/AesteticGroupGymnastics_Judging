package agg.agg;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class typejudge_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("asView (typejudge) ","typejudge",8,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "typejudge","asview", __ref);
 BA.debugLineNum = 42;BA.debugLine="Public Sub asView As Panel";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Return typePanel";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_typepanel");
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _avtypebtn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AVtypeBtn_Click (typejudge) ","typejudge",8,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("avtypebtn_click")) return __ref.runUserSub(false, "typejudge","avtypebtn_click", __ref);
 BA.debugLineNum = 46;BA.debugLine="Private Sub AVtypeBtn_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="CallSub(Main, \"AV_Click\")";
Debug.ShouldStop(16384);
typejudge.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((typejudge._main.getObject())),(Object)(RemoteObject.createImmutable("AV_Click")));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
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
 //BA.debugLineNum = 7;BA.debugLine="Private Padding As Int";
typejudge._padding = RemoteObject.createImmutable(0);__ref.setField("_padding",typejudge._padding);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _exetypebtn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EXEtypeBtn_Click (typejudge) ","typejudge",8,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("exetypebtn_click")) return __ref.runUserSub(false, "typejudge","exetypebtn_click", __ref);
 BA.debugLineNum = 54;BA.debugLine="Private Sub EXEtypeBtn_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="CallSub(Main, \"EXE_Click\")";
Debug.ShouldStop(4194304);
typejudge.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((typejudge._main.getObject())),(Object)(RemoteObject.createImmutable("EXE_Click")));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Initialize (typejudge) ","typejudge",8,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "typejudge","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="typePanel.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_typepanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 14;BA.debugLine="btnAv.Initialize(\"AVtypeBtn\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_btnav").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AVtypeBtn")));
 BA.debugLineNum = 15;BA.debugLine="btnTv.Initialize(\"TVtypeBtn\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_btntv").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TVtypeBtn")));
 BA.debugLineNum = 16;BA.debugLine="btnExe.Initialize(\"EXEtypeBtn\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnexe").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("EXEtypeBtn")));
 BA.debugLineNum = 18;BA.debugLine="Padding = UISizes.DefaultPadding";
Debug.ShouldStop(131072);
__ref.setField ("_padding",typejudge._uisizes._defaultpadding);
 BA.debugLineNum = 22;BA.debugLine="typePanel.AddView(btnAv,35%x, 20%y, 30%x, 10%y)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_typepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnav").getObject())),(Object)(typejudge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(typejudge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(typejudge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(typejudge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 23;BA.debugLine="typePanel.AddView(btnTv, 35%x, btnAv.Top+btnAv.He";
Debug.ShouldStop(4194304);
__ref.getField(false,"_typepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btntv").getObject())),(Object)(typejudge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_btnav").runMethod(true,"getTop"),__ref.getField(false,"_btnav").runMethod(true,"getHeight"),RemoteObject.createImmutable(1.5),__ref.getField(true,"_padding")}, "+*+",2, 0))),(Object)(typejudge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(typejudge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 24;BA.debugLine="typePanel.AddView(btnExe, 35%x, btnTv.Top+btnTv.H";
Debug.ShouldStop(8388608);
__ref.getField(false,"_typepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnexe").getObject())),(Object)(typejudge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_btntv").runMethod(true,"getTop"),__ref.getField(false,"_btntv").runMethod(true,"getHeight"),RemoteObject.createImmutable(1.5),__ref.getField(true,"_padding")}, "+*+",2, 0))),(Object)(typejudge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(typejudge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 26;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnAv,Colors.Blac";
Debug.ShouldStop(33554432);
typejudge._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnav").getObject()),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"Black")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 60)));
 BA.debugLineNum = 27;BA.debugLine="btnAv.Text = Main.translate.GetString(\"AVbtn\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btnav").runMethod(true,"setText",BA.ObjectToCharSequence(typejudge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AVbtn")))));
 BA.debugLineNum = 28;BA.debugLine="btnAv.Padding = Array As Int(15,0,0,0)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnav").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 15),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 29;BA.debugLine="btnAv.TextSize = 14";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnav").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 31;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnTv,Colors.Blac";
Debug.ShouldStop(1073741824);
typejudge._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btntv").getObject()),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"Black")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 60)));
 BA.debugLineNum = 32;BA.debugLine="btnTv.Text = Main.translate.GetString(\"TVbtn\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btntv").runMethod(true,"setText",BA.ObjectToCharSequence(typejudge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("TVbtn")))));
 BA.debugLineNum = 33;BA.debugLine="btnTv.Padding = Array As Int(15,0,0,0)";
Debug.ShouldStop(1);
__ref.getField(false,"_btntv").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 15),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 34;BA.debugLine="btnTv.TextSize = 14";
Debug.ShouldStop(2);
__ref.getField(false,"_btntv").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 36;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnExe,Colors.Bla";
Debug.ShouldStop(8);
typejudge._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnexe").getObject()),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"Black")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(typejudge.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 60)));
 BA.debugLineNum = 37;BA.debugLine="btnExe.Text = Main.translate.GetString(\"EXEbtn\")";
Debug.ShouldStop(16);
__ref.getField(false,"_btnexe").runMethod(true,"setText",BA.ObjectToCharSequence(typejudge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("EXEbtn")))));
 BA.debugLineNum = 38;BA.debugLine="btnExe.Padding = Array As Int(15,0,0,0)";
Debug.ShouldStop(32);
__ref.getField(false,"_btnexe").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 15),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 39;BA.debugLine="btnExe.TextSize = 14";
Debug.ShouldStop(64);
__ref.getField(false,"_btnexe").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tvtypebtn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TVtypeBtn_Click (typejudge) ","typejudge",8,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("tvtypebtn_click")) return __ref.runUserSub(false, "typejudge","tvtypebtn_click", __ref);
 BA.debugLineNum = 50;BA.debugLine="Private Sub TVtypeBtn_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="CallSub(Main, \"TV_Click\")";
Debug.ShouldStop(262144);
typejudge.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((typejudge._main.getObject())),(Object)(RemoteObject.createImmutable("TV_Click")));
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