package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="translate.Initialize";
Debug.ShouldStop(67108864);
main._translate.runClassMethod (b4a.example.translator.class, "_initialize",main.processBA);
 BA.debugLineNum = 28;BA.debugLine="intFontTransfer = UISizes.DefaultFont";
Debug.ShouldStop(134217728);
main._intfonttransfer = main.mostCurrent._uisizes._defaultfont;
 BA.debugLineNum = 30;BA.debugLine="Login.Initialize";
Debug.ShouldStop(536870912);
main.mostCurrent._login.runClassMethod (b4a.example.loginscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="Activity.AddView(Login.asView, 0, 0, 100%x, 100%y";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._login.runClassMethod (b4a.example.loginscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 33;BA.debugLine="Login.build_Screen";
Debug.ShouldStop(1);
main.mostCurrent._login.runClassMethod (b4a.example.loginscreen.class, "_build_screen");
 BA.debugLineNum = 34;BA.debugLine="typeJ.Initialize";
Debug.ShouldStop(2);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="Activity.AddView(typeJ.asView, 0, 0, 100%x, 100%y";
Debug.ShouldStop(4);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private Login As LoginScreen";
main.mostCurrent._login = RemoteObject.createNew ("b4a.example.loginscreen");
 //BA.debugLineNum = 23;BA.debugLine="Private typeJ As typeJudge";
main.mostCurrent._typej = RemoteObject.createNew ("b4a.example.typejudge");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loginscreen_loginclick() throws Exception{
try {
		Debug.PushSubsStack("LoginScreen_LoginClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("loginscreen_loginclick")) return b4a.example.main.remoteMe.runUserSub(false, "main","loginscreen_loginclick");
 BA.debugLineNum = 38;BA.debugLine="Public Sub LoginScreen_LoginClick";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Login.asView.Visible = False";
Debug.ShouldStop(64);
main.mostCurrent._login.runClassMethod (b4a.example.loginscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 40;BA.debugLine="Login.asView.Enabled = False";
Debug.ShouldStop(128);
main.mostCurrent._login.runClassMethod (b4a.example.loginscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 42;BA.debugLine="typeJ.asView.Visible = True";
Debug.ShouldStop(512);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 43;BA.debugLine="typeJ.asView.Enabled = True";
Debug.ShouldStop(1024);
main.mostCurrent._typej.runClassMethod (b4a.example.typejudge.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
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
initialsettings.myClass = BA.getDeviceClass ("b4a.example.initialsettings");
programdata.myClass = BA.getDeviceClass ("b4a.example.programdata");
uisizes.myClass = BA.getDeviceClass ("b4a.example.uisizes");
version.myClass = BA.getDeviceClass ("b4a.example.version");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
helperfunctions.myClass = BA.getDeviceClass ("b4a.example.helperfunctions");
translator.myClass = BA.getDeviceClass ("b4a.example.translator");
		
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
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}