package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="translate.Initialize";
Debug.ShouldStop(128);
main._translate.runClassMethod (b4a.example.translator.class, "_initialize",main.processBA);
 BA.debugLineNum = 41;BA.debugLine="intFontTransfer = UISizes.DefaultFont";
Debug.ShouldStop(256);
main._intfonttransfer = main.mostCurrent._uisizes._defaultfont;
 BA.debugLineNum = 43;BA.debugLine="Login.Initialize";
Debug.ShouldStop(1024);
main.mostCurrent._login.runClassMethod (b4a.example.loginscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="Activity.AddView(Login.asView, 0, 0, 100%x, 100%y";
Debug.ShouldStop(2048);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._login.runClassMethod (b4a.example.loginscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 45;BA.debugLine="Login.build_Screen";
Debug.ShouldStop(4096);
main.mostCurrent._login.runClassMethod (b4a.example.loginscreen.class, "_build_screen");
 BA.debugLineNum = 47;BA.debugLine="typeJ.Initialize";
Debug.ShouldStop(16384);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 48;BA.debugLine="Activity.AddView(typeJ.asView, 0, 0, 100%x, 100%y";
Debug.ShouldStop(32768);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 49;BA.debugLine="typeJ.asView.Visible = False";
Debug.ShouldStop(65536);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 50;BA.debugLine="typeJ.asView.Enabled = False";
Debug.ShouldStop(131072);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 52;BA.debugLine="avJ.Initialize";
Debug.ShouldStop(524288);
main.mostCurrent._avj.runClassMethod (b4a.example.av_judge.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 53;BA.debugLine="Activity.AddView(avJ.asView, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._avj.runClassMethod (b4a.example.av_judge.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 54;BA.debugLine="avJ.asView.Visible = False";
Debug.ShouldStop(2097152);
main.mostCurrent._avj.runClassMethod (b4a.example.av_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 55;BA.debugLine="avJ.asView.Enabled = False";
Debug.ShouldStop(4194304);
main.mostCurrent._avj.runClassMethod (b4a.example.av_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 56;BA.debugLine="avJ.BuildUi";
Debug.ShouldStop(8388608);
main.mostCurrent._avj.runClassMethod (b4a.example.av_judge.class, "_buildui");
 BA.debugLineNum = 58;BA.debugLine="tvJ.Initialize";
Debug.ShouldStop(33554432);
main.mostCurrent._tvj.runClassMethod (b4a.example.tv_judge.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="Activity.AddView(tvJ.asView, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._tvj.runClassMethod (b4a.example.tv_judge.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 60;BA.debugLine="tvJ.asView.Visible = False";
Debug.ShouldStop(134217728);
main.mostCurrent._tvj.runClassMethod (b4a.example.tv_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 61;BA.debugLine="tvJ.asView.Enabled = False";
Debug.ShouldStop(268435456);
main.mostCurrent._tvj.runClassMethod (b4a.example.tv_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="tvJ.BuildUi";
Debug.ShouldStop(536870912);
main.mostCurrent._tvj.runClassMethod (b4a.example.tv_judge.class, "_buildui");
 BA.debugLineNum = 64;BA.debugLine="exeJ.Initialize";
Debug.ShouldStop(-2147483648);
main.mostCurrent._exej.runClassMethod (b4a.example.exe_judging.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 65;BA.debugLine="Activity.AddView(exeJ.asView, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(1);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._exej.runClassMethod (b4a.example.exe_judging.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 66;BA.debugLine="exeJ.asView.Visible = False";
Debug.ShouldStop(2);
main.mostCurrent._exej.runClassMethod (b4a.example.exe_judging.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 67;BA.debugLine="exeJ.asView.Enabled = False";
Debug.ShouldStop(4);
main.mostCurrent._exej.runClassMethod (b4a.example.exe_judging.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 68;BA.debugLine="exeJ.BuildUi";
Debug.ShouldStop(8);
main.mostCurrent._exej.runClassMethod (b4a.example.exe_judging.class, "_buildui");
 BA.debugLineNum = 70;BA.debugLine="final.Initialize";
Debug.ShouldStop(32);
main.mostCurrent._final.runClassMethod (b4a.example.sendscore.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 71;BA.debugLine="Activity.AddView(final.asView, 0, 0, 100%x, 100%y";
Debug.ShouldStop(64);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._final.runClassMethod (b4a.example.sendscore.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 72;BA.debugLine="final.asView.Visible = False";
Debug.ShouldStop(128);
main.mostCurrent._final.runClassMethod (b4a.example.sendscore.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 73;BA.debugLine="final.asView.Enabled = False";
Debug.ShouldStop(256);
main.mostCurrent._final.runClassMethod (b4a.example.sendscore.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="insettings.Initialize";
Debug.ShouldStop(1024);
main.mostCurrent._insettings.runClassMethod (b4a.example.initialsettings.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 76;BA.debugLine="Activity.AddView(insettings.InitSetAsView, 0, 0,";
Debug.ShouldStop(2048);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._insettings.runClassMethod (b4a.example.initialsettings.class, "_initsetasview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 77;BA.debugLine="insettings.InitSettingsBuildScreen";
Debug.ShouldStop(4096);
main.mostCurrent._insettings.runClassMethod (b4a.example.initialsettings.class, "_initsettingsbuildscreen");
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _av_click() throws Exception{
try {
		Debug.PushSubsStack("AV_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,94);
if (RapidSub.canDelegate("av_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","av_click");
 BA.debugLineNum = 94;BA.debugLine="Public Sub AV_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="typeJ.asView.Visible = False";
Debug.ShouldStop(1073741824);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 96;BA.debugLine="typeJ.asView.Enabled = False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 98;BA.debugLine="avJ.asView.Visible = True";
Debug.ShouldStop(2);
main.mostCurrent._avj.runClassMethod (b4a.example.av_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 99;BA.debugLine="avJ.asView.Enabled = True";
Debug.ShouldStop(4);
main.mostCurrent._avj.runClassMethod (b4a.example.av_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _connecttodatabase() throws Exception{
try {
		Debug.PushSubsStack("ConnectToDatabase (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,81);
if (RapidSub.canDelegate("connecttodatabase")) return b4a.example.main.remoteMe.runUserSub(false, "main","connecttodatabase");
 BA.debugLineNum = 81;BA.debugLine="Public Sub ConnectToDatabase";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Log(\"Database SET: \" & Cfg.dbServerAddress & \", \"";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Database SET: "),main._cfg.getField(true,"_dbserveraddress"),RemoteObject.createImmutable(", "),main._cfg.getField(true,"_dbbasename"),RemoteObject.createImmutable(", "),main._cfg.getField(true,"_dbusername"),RemoteObject.createImmutable(", "),main._cfg.getField(true,"_dbpassword"))));
 BA.debugLineNum = 83;BA.debugLine="DB.setDatabase(Cfg.dbServerAddress,Cfg.dbBaseName";
Debug.ShouldStop(262144);
main._db.runClassMethod (b4a.example.dbsqlconnector.class, "_setdatabase",(Object)(main._cfg.getField(true,"_dbserveraddress")),(Object)(main._cfg.getField(true,"_dbbasename")),(Object)(main._cfg.getField(true,"_dbusername")),(Object)(main._cfg.getField(true,"_dbpassword")));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("EXE_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,110);
if (RapidSub.canDelegate("exe_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","exe_click");
 BA.debugLineNum = 110;BA.debugLine="Public Sub EXE_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="typeJ.asView.Visible = False";
Debug.ShouldStop(16384);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 112;BA.debugLine="typeJ.asView.Enabled = False";
Debug.ShouldStop(32768);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 114;BA.debugLine="exeJ.asView.Visible = True";
Debug.ShouldStop(131072);
main.mostCurrent._exej.runClassMethod (b4a.example.exe_judging.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 115;BA.debugLine="exeJ.asView.Enabled = True";
Debug.ShouldStop(262144);
main.mostCurrent._exej.runClassMethod (b4a.example.exe_judging.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("FinalClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,118);
if (RapidSub.canDelegate("finalclick")) return b4a.example.main.remoteMe.runUserSub(false, "main","finalclick");
 BA.debugLineNum = 118;BA.debugLine="Public Sub FinalClick";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="If avJ.asView.Visible = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.mostCurrent._avj.runClassMethod (b4a.example.av_judge.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 120;BA.debugLine="avJ.asView.Visible = False";
Debug.ShouldStop(8388608);
main.mostCurrent._avj.runClassMethod (b4a.example.av_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 121;BA.debugLine="avJ.asView.Enabled = False";
Debug.ShouldStop(16777216);
main.mostCurrent._avj.runClassMethod (b4a.example.av_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 122;BA.debugLine="Else If tvJ.asView.Visible = True Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",main.mostCurrent._tvj.runClassMethod (b4a.example.tv_judge.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 123;BA.debugLine="tvJ.asView.Visible = False";
Debug.ShouldStop(67108864);
main.mostCurrent._tvj.runClassMethod (b4a.example.tv_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 124;BA.debugLine="tvJ.asView.Enabled = False";
Debug.ShouldStop(134217728);
main.mostCurrent._tvj.runClassMethod (b4a.example.tv_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 125;BA.debugLine="Else If exeJ.asView.Visible = True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main.mostCurrent._exej.runClassMethod (b4a.example.exe_judging.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 126;BA.debugLine="exeJ.asView.Visible = False";
Debug.ShouldStop(536870912);
main.mostCurrent._exej.runClassMethod (b4a.example.exe_judging.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 127;BA.debugLine="exeJ.asView.Enabled = False";
Debug.ShouldStop(1073741824);
main.mostCurrent._exej.runClassMethod (b4a.example.exe_judging.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 }}}
;
 BA.debugLineNum = 130;BA.debugLine="final.asView.Visible = True";
Debug.ShouldStop(2);
main.mostCurrent._final.runClassMethod (b4a.example.sendscore.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 131;BA.debugLine="final.asView.Enabled = True";
Debug.ShouldStop(4);
main.mostCurrent._final.runClassMethod (b4a.example.sendscore.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 29;BA.debugLine="Private Login As LoginScreen";
main.mostCurrent._login = RemoteObject.createNew ("b4a.example.loginscreen");
 //BA.debugLineNum = 30;BA.debugLine="Private typeJ As typeJudge";
main.mostCurrent._typej = RemoteObject.createNew ("b4a.example.typejudge");
 //BA.debugLineNum = 31;BA.debugLine="Private avJ As AV_judge";
main.mostCurrent._avj = RemoteObject.createNew ("b4a.example.av_judge");
 //BA.debugLineNum = 32;BA.debugLine="Private tvJ As TV_Judge";
main.mostCurrent._tvj = RemoteObject.createNew ("b4a.example.tv_judge");
 //BA.debugLineNum = 33;BA.debugLine="Private exeJ As EXE_Judging";
main.mostCurrent._exej = RemoteObject.createNew ("b4a.example.exe_judging");
 //BA.debugLineNum = 34;BA.debugLine="Private final As SendScore";
main.mostCurrent._final = RemoteObject.createNew ("b4a.example.sendscore");
 //BA.debugLineNum = 35;BA.debugLine="Private insettings As InitialSettings";
main.mostCurrent._insettings = RemoteObject.createNew ("b4a.example.initialsettings");
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loginscreen_loginclick() throws Exception{
try {
		Debug.PushSubsStack("LoginScreen_LoginClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,86);
if (RapidSub.canDelegate("loginscreen_loginclick")) return b4a.example.main.remoteMe.runUserSub(false, "main","loginscreen_loginclick");
 BA.debugLineNum = 86;BA.debugLine="Public Sub LoginScreen_LoginClick";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Login.asView.Visible = False";
Debug.ShouldStop(4194304);
main.mostCurrent._login.runClassMethod (b4a.example.loginscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 88;BA.debugLine="Login.asView.Enabled = False";
Debug.ShouldStop(8388608);
main.mostCurrent._login.runClassMethod (b4a.example.loginscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 90;BA.debugLine="typeJ.asView.Visible = True";
Debug.ShouldStop(33554432);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 91;BA.debugLine="typeJ.asView.Enabled = True";
Debug.ShouldStop(67108864);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
programdata_subs_0._process_globals();
uisizes_subs_0._process_globals();
version_subs_0._process_globals();
starter_subs_0._process_globals();
helperfunctions_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
loginscreen.myClass = BA.getDeviceClass ("b4a.example.loginscreen");
typejudge.myClass = BA.getDeviceClass ("b4a.example.typejudge");
av_judge.myClass = BA.getDeviceClass ("b4a.example.av_judge");
sendscore.myClass = BA.getDeviceClass ("b4a.example.sendscore");
initialsettings.myClass = BA.getDeviceClass ("b4a.example.initialsettings");
translator.myClass = BA.getDeviceClass ("b4a.example.translator");
dbsqlconnector.myClass = BA.getDeviceClass ("b4a.example.dbsqlconnector");
programdata.myClass = BA.getDeviceClass ("b4a.example.programdata");
uisizes.myClass = BA.getDeviceClass ("b4a.example.uisizes");
version.myClass = BA.getDeviceClass ("b4a.example.version");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
helperfunctions.myClass = BA.getDeviceClass ("b4a.example.helperfunctions");
tv_judge.myClass = BA.getDeviceClass ("b4a.example.tv_judge");
exe_judging.myClass = BA.getDeviceClass ("b4a.example.exe_judging");
config.myClass = BA.getDeviceClass ("b4a.example.config");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Public translate As Translator";
main._translate = RemoteObject.createNew ("b4a.example.translator");
 //BA.debugLineNum = 17;BA.debugLine="Public SelectedLanguage As String = \"BG\"";
main._selectedlanguage = BA.ObjectToString("BG");
 //BA.debugLineNum = 18;BA.debugLine="Public intFontTransfer As Int";
main._intfonttransfer = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 19;BA.debugLine="Type Report(ChartType As String,Title As String,X";
;
 //BA.debugLineNum = 20;BA.debugLine="Public BaseNotAccessible As Boolean";
main._basenotaccessible = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 21;BA.debugLine="Public DB As DBSQLConnector";
main._db = RemoteObject.createNew ("b4a.example.dbsqlconnector");
 //BA.debugLineNum = 22;BA.debugLine="Public Cfg As Config";
main._cfg = RemoteObject.createNew ("b4a.example.config");
 //BA.debugLineNum = 23;BA.debugLine="Public PrimeCurrency As String";
main._primecurrency = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showsettings() throws Exception{
try {
		Debug.PushSubsStack("showSettings (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,134);
if (RapidSub.canDelegate("showsettings")) return b4a.example.main.remoteMe.runUserSub(false, "main","showsettings");
 BA.debugLineNum = 134;BA.debugLine="Public Sub showSettings";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="insettings.InitialSetShow";
Debug.ShouldStop(64);
main.mostCurrent._insettings.runClassMethod (b4a.example.initialsettings.class, "_initialsetshow");
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tv_click() throws Exception{
try {
		Debug.PushSubsStack("TV_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,102);
if (RapidSub.canDelegate("tv_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","tv_click");
 BA.debugLineNum = 102;BA.debugLine="Public Sub TV_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="typeJ.asView.Visible = False";
Debug.ShouldStop(64);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 104;BA.debugLine="typeJ.asView.Enabled = False";
Debug.ShouldStop(128);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 106;BA.debugLine="tvJ.asView.Visible = True";
Debug.ShouldStop(512);
main.mostCurrent._tvj.runClassMethod (b4a.example.tv_judge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 107;BA.debugLine="tvJ.asView.Enabled = True";
Debug.ShouldStop(1024);
main.mostCurrent._tvj.runClassMethod (b4a.example.tv_judge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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