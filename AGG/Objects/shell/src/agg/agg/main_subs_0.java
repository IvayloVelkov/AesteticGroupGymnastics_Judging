package agg.agg;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) return agg.agg.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="translate.Initialize";
Debug.ShouldStop(32);
main._translate.runClassMethod (agg.agg.translator.class, "_initialize",main.processBA);
 BA.debugLineNum = 39;BA.debugLine="intFontTransfer = UISizes.DefaultFont";
Debug.ShouldStop(64);
main._intfonttransfer = main.mostCurrent._uisizes._defaultfont;
 BA.debugLineNum = 41;BA.debugLine="Login.Initialize";
Debug.ShouldStop(256);
main.mostCurrent._login.runClassMethod (agg.agg.loginscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="Activity.AddView(Login.asView, 0, 0, 100%x, 100%y";
Debug.ShouldStop(512);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._login.runClassMethod (agg.agg.loginscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 43;BA.debugLine="Login.build_Screen";
Debug.ShouldStop(1024);
main.mostCurrent._login.runClassMethod (agg.agg.loginscreen.class, "_build_screen");
 BA.debugLineNum = 45;BA.debugLine="typeJ.Initialize";
Debug.ShouldStop(4096);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="Activity.AddView(typeJ.asView, 0, 0, 100%x, 100%y";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 47;BA.debugLine="typeJ.asView.Visible = False";
Debug.ShouldStop(16384);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="typeJ.asView.Enabled = False";
Debug.ShouldStop(32768);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 50;BA.debugLine="avJ.Initialize";
Debug.ShouldStop(131072);
main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 51;BA.debugLine="Activity.AddView(avJ.asView, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 52;BA.debugLine="avJ.asView.Visible = False";
Debug.ShouldStop(524288);
main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 53;BA.debugLine="avJ.asView.Enabled = False";
Debug.ShouldStop(1048576);
main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 54;BA.debugLine="avJ.BuildUi";
Debug.ShouldStop(2097152);
main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_buildui");
 BA.debugLineNum = 56;BA.debugLine="tvJ.Initialize";
Debug.ShouldStop(8388608);
main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="Activity.AddView(tvJ.asView, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 58;BA.debugLine="tvJ.asView.Visible = False";
Debug.ShouldStop(33554432);
main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="tvJ.asView.Enabled = False";
Debug.ShouldStop(67108864);
main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="tvJ.BuildUi";
Debug.ShouldStop(134217728);
main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_buildui");
 BA.debugLineNum = 62;BA.debugLine="exeJ.Initialize";
Debug.ShouldStop(536870912);
main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 63;BA.debugLine="Activity.AddView(exeJ.asView, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 64;BA.debugLine="exeJ.asView.Visible = False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 65;BA.debugLine="exeJ.asView.Enabled = False";
Debug.ShouldStop(1);
main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 66;BA.debugLine="exeJ.BuildUi";
Debug.ShouldStop(2);
main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_buildui");
 BA.debugLineNum = 68;BA.debugLine="final.Initialize";
Debug.ShouldStop(8);
main.mostCurrent._final.runClassMethod (agg.agg.sendscore.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 69;BA.debugLine="Activity.AddView(final.asView, 0, 0, 100%x, 100%y";
Debug.ShouldStop(16);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._final.runClassMethod (agg.agg.sendscore.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 70;BA.debugLine="final.asView.Visible = False";
Debug.ShouldStop(32);
main.mostCurrent._final.runClassMethod (agg.agg.sendscore.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="final.asView.Enabled = False";
Debug.ShouldStop(64);
main.mostCurrent._final.runClassMethod (agg.agg.sendscore.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,130);
if (RapidSub.canDelegate("activity_keypress")) return agg.agg.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 130;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 132;BA.debugLine="If avJ.asView.Visible = True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 133;BA.debugLine="Login.asView.Visible = True";
Debug.ShouldStop(16);
main.mostCurrent._login.runClassMethod (agg.agg.loginscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 134;BA.debugLine="avJ.asView.Visible = False";
Debug.ShouldStop(32);
main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 135;BA.debugLine="Else If tvJ.asView.Visible = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 136;BA.debugLine="tvJ.asView.Visible = False";
Debug.ShouldStop(128);
main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 137;BA.debugLine="Login.asView.Visible = True";
Debug.ShouldStop(256);
main.mostCurrent._login.runClassMethod (agg.agg.loginscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 138;BA.debugLine="Else If exeJ.asView.Visible = True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 139;BA.debugLine="exeJ.asView.Visible = False";
Debug.ShouldStop(1024);
main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 140;BA.debugLine="Login.asView.Visible = True";
Debug.ShouldStop(2048);
main.mostCurrent._login.runClassMethod (agg.agg.loginscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 141;BA.debugLine="Else If final.asView.Visible = True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",main.mostCurrent._final.runClassMethod (agg.agg.sendscore.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 }}}}
;
 };
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _av_click() throws Exception{
try {
		Debug.PushSubsStack("AV_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,89);
if (RapidSub.canDelegate("av_click")) return agg.agg.main.remoteMe.runUserSub(false, "main","av_click");
 BA.debugLineNum = 89;BA.debugLine="Public Sub AV_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="typeJ.asView.Visible = False";
Debug.ShouldStop(33554432);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 91;BA.debugLine="typeJ.asView.Enabled = False";
Debug.ShouldStop(67108864);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 93;BA.debugLine="avJ.asView.Visible = True";
Debug.ShouldStop(268435456);
main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 94;BA.debugLine="avJ.asView.Enabled = True";
Debug.ShouldStop(536870912);
main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exe_click() throws Exception{
try {
		Debug.PushSubsStack("EXE_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,105);
if (RapidSub.canDelegate("exe_click")) return agg.agg.main.remoteMe.runUserSub(false, "main","exe_click");
 BA.debugLineNum = 105;BA.debugLine="Public Sub EXE_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="typeJ.asView.Visible = False";
Debug.ShouldStop(512);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 107;BA.debugLine="typeJ.asView.Enabled = False";
Debug.ShouldStop(1024);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 109;BA.debugLine="exeJ.asView.Visible = True";
Debug.ShouldStop(4096);
main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="exeJ.asView.Enabled = True";
Debug.ShouldStop(8192);
main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finalclick() throws Exception{
try {
		Debug.PushSubsStack("FinalClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,113);
if (RapidSub.canDelegate("finalclick")) return agg.agg.main.remoteMe.runUserSub(false, "main","finalclick");
 BA.debugLineNum = 113;BA.debugLine="Public Sub FinalClick";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="If avJ.asView.Visible = True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 115;BA.debugLine="avJ.asView.Visible = False";
Debug.ShouldStop(262144);
main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 116;BA.debugLine="avJ.asView.Enabled = False";
Debug.ShouldStop(524288);
main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 117;BA.debugLine="Else If tvJ.asView.Visible = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 118;BA.debugLine="tvJ.asView.Visible = False";
Debug.ShouldStop(2097152);
main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 119;BA.debugLine="tvJ.asView.Enabled = False";
Debug.ShouldStop(4194304);
main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 120;BA.debugLine="Else If exeJ.asView.Visible = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 121;BA.debugLine="exeJ.asView.Visible = False";
Debug.ShouldStop(16777216);
main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 122;BA.debugLine="exeJ.asView.Enabled = False";
Debug.ShouldStop(33554432);
main.mostCurrent._exej.runClassMethod (agg.agg.exe_judging.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 }}}
;
 BA.debugLineNum = 125;BA.debugLine="final.asView.Visible = True";
Debug.ShouldStop(268435456);
main.mostCurrent._final.runClassMethod (agg.agg.sendscore.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 126;BA.debugLine="final.asView.Enabled = True";
Debug.ShouldStop(536870912);
main.mostCurrent._final.runClassMethod (agg.agg.sendscore.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="final.finalScore";
Debug.ShouldStop(1073741824);
main.mostCurrent._final.runClassMethod (agg.agg.sendscore.class, "_finalscore");
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finalscore() throws Exception{
try {
		Debug.PushSubsStack("finalScore (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,76);
if (RapidSub.canDelegate("finalscore")) return agg.agg.main.remoteMe.runUserSub(false, "main","finalscore");
 BA.debugLineNum = 76;BA.debugLine="Public Sub finalScore As Double";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="score = avJ.finaAVscore";
Debug.ShouldStop(4096);
main._score = main.mostCurrent._avj.runClassMethod (agg.agg.av_judge.class, "_finaavscore");
 BA.debugLineNum = 78;BA.debugLine="Return score";
Debug.ShouldStop(8192);
if (true) return main._score;
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Private Login As LoginScreen";
main.mostCurrent._login = RemoteObject.createNew ("agg.agg.loginscreen");
 //BA.debugLineNum = 28;BA.debugLine="Private typeJ As typeJudge";
main.mostCurrent._typej = RemoteObject.createNew ("agg.agg.typejudge");
 //BA.debugLineNum = 29;BA.debugLine="Private avJ As AV_judge";
main.mostCurrent._avj = RemoteObject.createNew ("agg.agg.av_judge");
 //BA.debugLineNum = 30;BA.debugLine="Private tvJ As TV_Judge";
main.mostCurrent._tvj = RemoteObject.createNew ("agg.agg.tv_judge");
 //BA.debugLineNum = 31;BA.debugLine="Private exeJ As EXE_Judging";
main.mostCurrent._exej = RemoteObject.createNew ("agg.agg.exe_judging");
 //BA.debugLineNum = 32;BA.debugLine="Private final As SendScore";
main.mostCurrent._final = RemoteObject.createNew ("agg.agg.sendscore");
 //BA.debugLineNum = 33;BA.debugLine="Public score As Double";
main._score = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loginscreen_loginclick() throws Exception{
try {
		Debug.PushSubsStack("LoginScreen_LoginClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,81);
if (RapidSub.canDelegate("loginscreen_loginclick")) return agg.agg.main.remoteMe.runUserSub(false, "main","loginscreen_loginclick");
 BA.debugLineNum = 81;BA.debugLine="Public Sub LoginScreen_LoginClick";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Login.asView.Visible = False";
Debug.ShouldStop(131072);
main.mostCurrent._login.runClassMethod (agg.agg.loginscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 83;BA.debugLine="Login.asView.Enabled = False";
Debug.ShouldStop(262144);
main.mostCurrent._login.runClassMethod (agg.agg.loginscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 85;BA.debugLine="typeJ.asView.Visible = True";
Debug.ShouldStop(1048576);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 86;BA.debugLine="typeJ.asView.Enabled = True";
Debug.ShouldStop(2097152);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
programdata_subs_0._process_globals();
uisizes_subs_0._process_globals();
version_subs_0._process_globals();
helperfunctions_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("agg.agg.main");
tv_judge.myClass = BA.getDeviceClass ("agg.agg.tv_judge");
av_judge.myClass = BA.getDeviceClass ("agg.agg.av_judge");
exe_judging.myClass = BA.getDeviceClass ("agg.agg.exe_judging");
sendscore.myClass = BA.getDeviceClass ("agg.agg.sendscore");
translator.myClass = BA.getDeviceClass ("agg.agg.translator");
starter.myClass = BA.getDeviceClass ("agg.agg.starter");
loginscreen.myClass = BA.getDeviceClass ("agg.agg.loginscreen");
typejudge.myClass = BA.getDeviceClass ("agg.agg.typejudge");
programdata.myClass = BA.getDeviceClass ("agg.agg.programdata");
uisizes.myClass = BA.getDeviceClass ("agg.agg.uisizes");
version.myClass = BA.getDeviceClass ("agg.agg.version");
helperfunctions.myClass = BA.getDeviceClass ("agg.agg.helperfunctions");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public translate As Translator";
main._translate = RemoteObject.createNew ("agg.agg.translator");
 //BA.debugLineNum = 19;BA.debugLine="Public SelectedLanguage As String = \"BG\"";
main._selectedlanguage = BA.ObjectToString("BG");
 //BA.debugLineNum = 20;BA.debugLine="Public intFontTransfer As Int";
main._intfonttransfer = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 21;BA.debugLine="Type Report(ChartType As String,Title As String,X";
;
 //BA.debugLineNum = 22;BA.debugLine="Public BaseNotAccessible As Boolean";
main._basenotaccessible = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 23;BA.debugLine="Public PrimeCurrency As String";
main._primecurrency = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tv_click() throws Exception{
try {
		Debug.PushSubsStack("TV_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,97);
if (RapidSub.canDelegate("tv_click")) return agg.agg.main.remoteMe.runUserSub(false, "main","tv_click");
 BA.debugLineNum = 97;BA.debugLine="Public Sub TV_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="typeJ.asView.Visible = False";
Debug.ShouldStop(2);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 99;BA.debugLine="typeJ.asView.Enabled = False";
Debug.ShouldStop(4);
main.mostCurrent._typej.runClassMethod (agg.agg.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 101;BA.debugLine="tvJ.asView.Visible = True";
Debug.ShouldStop(16);
main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="tvJ.asView.Enabled = True";
Debug.ShouldStop(32);
main.mostCurrent._tvj.runClassMethod (agg.agg.tv_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}