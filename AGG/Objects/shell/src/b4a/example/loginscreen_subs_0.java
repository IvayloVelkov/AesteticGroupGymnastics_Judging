package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("asView (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "loginscreen","asview", __ref);
 BA.debugLineNum = 187;BA.debugLine="Public Sub asView As Panel";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="Return loginPanel";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(false,"_loginpanel");
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _build_screen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("build_Screen (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("build_screen")) return __ref.runUserSub(false, "loginscreen","build_screen", __ref);
RemoteObject _edtwidth = RemoteObject.createImmutable(0);
RemoteObject _edtheight = RemoteObject.createImmutable(0);
RemoteObject _btnwidth = RemoteObject.createImmutable(0);
RemoteObject _btnheight = RemoteObject.createImmutable(0);
RemoteObject _settingswidth = RemoteObject.createImmutable(0);
RemoteObject _settingsheight = RemoteObject.createImmutable(0);
RemoteObject _padding = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
 BA.debugLineNum = 41;BA.debugLine="Public Sub build_Screen";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="loginPanel_Configurations";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.loginscreen.class, "_loginpanel_configurations");
 BA.debugLineNum = 43;BA.debugLine="start_up";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.loginscreen.class, "_start_up");
 BA.debugLineNum = 45;BA.debugLine="Private edtWidth,edtHeight As Int";
Debug.ShouldStop(4096);
_edtwidth = RemoteObject.createImmutable(0);Debug.locals.put("edtWidth", _edtwidth);
_edtheight = RemoteObject.createImmutable(0);Debug.locals.put("edtHeight", _edtheight);
 BA.debugLineNum = 46;BA.debugLine="Private btnWidth,btnHeight As Int";
Debug.ShouldStop(8192);
_btnwidth = RemoteObject.createImmutable(0);Debug.locals.put("btnWidth", _btnwidth);
_btnheight = RemoteObject.createImmutable(0);Debug.locals.put("btnHeight", _btnheight);
 BA.debugLineNum = 47;BA.debugLine="Private settingsWidth,settingsHeight As Int";
Debug.ShouldStop(16384);
_settingswidth = RemoteObject.createImmutable(0);Debug.locals.put("settingsWidth", _settingswidth);
_settingsheight = RemoteObject.createImmutable(0);Debug.locals.put("settingsHeight", _settingsheight);
 BA.debugLineNum = 48;BA.debugLine="Private Padding,left As Int";
Debug.ShouldStop(32768);
_padding = RemoteObject.createImmutable(0);Debug.locals.put("Padding", _padding);
_left = RemoteObject.createImmutable(0);Debug.locals.put("left", _left);
 BA.debugLineNum = 51;BA.debugLine="Padding = UISizes.DefaultPadding";
Debug.ShouldStop(262144);
_padding = loginscreen._uisizes._defaultpadding;Debug.locals.put("Padding", _padding);
 BA.debugLineNum = 52;BA.debugLine="edtWidth = loginPanel.Width*0.7";
Debug.ShouldStop(524288);
_edtwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginpanel").runMethod(true,"getWidth"),RemoteObject.createImmutable(0.7)}, "*",0, 0));Debug.locals.put("edtWidth", _edtwidth);
 BA.debugLineNum = 53;BA.debugLine="edtHeight = loginPanel.Height*0.08";
Debug.ShouldStop(1048576);
_edtheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginpanel").runMethod(true,"getHeight"),RemoteObject.createImmutable(0.08)}, "*",0, 0));Debug.locals.put("edtHeight", _edtheight);
 BA.debugLineNum = 54;BA.debugLine="btnHeight = loginPanel.Height*0.08";
Debug.ShouldStop(2097152);
_btnheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginpanel").runMethod(true,"getHeight"),RemoteObject.createImmutable(0.08)}, "*",0, 0));Debug.locals.put("btnHeight", _btnheight);
 BA.debugLineNum = 55;BA.debugLine="btnWidth = edtWidth/2 - Padding";
Debug.ShouldStop(4194304);
_btnwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_edtwidth,RemoteObject.createImmutable(2),_padding}, "/-",1, 0));Debug.locals.put("btnWidth", _btnwidth);
 BA.debugLineNum = 56;BA.debugLine="left = (loginPanel.Width - edtWidth)/2";
Debug.ShouldStop(8388608);
_left = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginpanel").runMethod(true,"getWidth"),_edtwidth}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("left", _left);
 BA.debugLineNum = 57;BA.debugLine="settingsWidth = loginPanel.Width*0.06";
Debug.ShouldStop(16777216);
_settingswidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginpanel").runMethod(true,"getWidth"),RemoteObject.createImmutable(0.06)}, "*",0, 0));Debug.locals.put("settingsWidth", _settingswidth);
 BA.debugLineNum = 58;BA.debugLine="settingsHeight = settingsWidth' loginPanel.Heigh";
Debug.ShouldStop(33554432);
_settingsheight = _settingswidth;Debug.locals.put("settingsHeight", _settingsheight);
 BA.debugLineNum = 61;BA.debugLine="loginPanel.AddView(user,left, loginPanel.Height*(";
Debug.ShouldStop(268435456);
__ref.getField(false,"_loginpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_user").getObject())),(Object)(_left),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginpanel").runMethod(true,"getHeight"),RemoteObject.createImmutable((0.3))}, "*",0, 0))),(Object)(_edtwidth),(Object)(_edtheight));
 BA.debugLineNum = 62;BA.debugLine="loginPanel.AddView(pass, left, user.Top+user.Heig";
Debug.ShouldStop(536870912);
__ref.getField(false,"_loginpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pass").getObject())),(Object)(_left),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_user").runMethod(true,"getTop"),__ref.getField(false,"_user").runMethod(true,"getHeight"),RemoteObject.createImmutable(1.5),_padding}, "+*+",2, 0))),(Object)(_edtwidth),(Object)(_edtheight));
 BA.debugLineNum = 64;BA.debugLine="loginPanel.AddView(checkloginPanel, left + Paddin";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_loginpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_checkloginpanel").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_left,_padding}, "+",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pass").runMethod(true,"getTop"),_edtheight,RemoteObject.createImmutable(1.5)}, "+*",1, 0))),(Object)(_btnwidth),(Object)(_btnheight));
 BA.debugLineNum = 65;BA.debugLine="loginPanel.AddView(btnloginPanel, checkloginPanel";
Debug.ShouldStop(1);
__ref.getField(false,"_loginpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnloginpanel").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_checkloginpanel").runMethod(true,"getLeft"),__ref.getField(false,"_checkloginpanel").runMethod(true,"getWidth"),_padding}, "++",2, 1)),(Object)(__ref.getField(false,"_checkloginpanel").runMethod(true,"getTop")),(Object)(_btnwidth),(Object)(_btnheight));
 BA.debugLineNum = 68;BA.debugLine="btnSettings.SetBackgroundImage(LoadBitmap(File.Di";
Debug.ShouldStop(8);
__ref.getField(false,"_btnsettings").runVoidMethod ("SetBackgroundImageNew",(Object)((loginscreen.__c.runMethod(false,"LoadBitmap",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("initial_options_icon.png"))).getObject())));
 BA.debugLineNum = 69;BA.debugLine="loginPanel.AddView(btnSettings, loginPanel.Width";
Debug.ShouldStop(16);
__ref.getField(false,"_loginpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnsettings").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginpanel").runMethod(true,"getWidth"),RemoteObject.createImmutable(0.01)}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginpanel").runMethod(true,"getHeight"),RemoteObject.createImmutable(0.01)}, "*",0, 0))),(Object)(_settingswidth),(Object)(_settingsheight));
 BA.debugLineNum = 71;BA.debugLine="btnExit.SetBackgroundImage(LoadBitmap(File.DirAss";
Debug.ShouldStop(64);
__ref.getField(false,"_btnexit").runVoidMethod ("SetBackgroundImageNew",(Object)((loginscreen.__c.runMethod(false,"LoadBitmap",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("exit_program_x.png"))).getObject())));
 BA.debugLineNum = 72;BA.debugLine="loginPanel.AddView(btnExit, loginPanel.width - se";
Debug.ShouldStop(128);
__ref.getField(false,"_loginpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnexit").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginpanel").runMethod(true,"getWidth"),_settingswidth,__ref.getField(false,"_loginpanel").runMethod(true,"getWidth"),RemoteObject.createImmutable(0.01)}, "--*",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginpanel").runMethod(true,"getHeight"),RemoteObject.createImmutable(0.01)}, "*",0, 0))),(Object)(_settingswidth),(Object)(_settingsheight));
 BA.debugLineNum = 74;BA.debugLine="btnloginPanel.Enabled=True";
Debug.ShouldStop(512);
__ref.getField(false,"_btnloginpanel").runMethod(true,"setEnabled",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonloginpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonloginPanel_Click (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("buttonloginpanel_click")) return __ref.runUserSub(false, "loginscreen","buttonloginpanel_click", __ref);
 BA.debugLineNum = 136;BA.debugLine="Private Sub ButtonloginPanel_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 138;BA.debugLine="btnloginPanel.Enabled=False";
Debug.ShouldStop(512);
__ref.getField(false,"_btnloginpanel").runMethod(true,"setEnabled",loginscreen.__c.getField(true,"False"));
 BA.debugLineNum = 141;BA.debugLine="usrString = user.Text.ToLowerCase";
Debug.ShouldStop(4096);
__ref.setField ("_usrstring",__ref.getField(false,"_user").runMethod(true,"getText").runMethod(true,"toLowerCase"));
 BA.debugLineNum = 142;BA.debugLine="passString = pass.Text";
Debug.ShouldStop(8192);
__ref.setField ("_passstring",__ref.getField(false,"_pass").runMethod(true,"getText"));
 BA.debugLineNum = 144;BA.debugLine="If check_User(usrString) And check_Pass(passStrin";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",__ref.runClassMethod (b4a.example.loginscreen.class, "_check_user",(Object)(__ref.getField(true,"_usrstring")))) && RemoteObject.solveBoolean(".",__ref.runClassMethod (b4a.example.loginscreen.class, "_check_pass",(Object)(__ref.getField(true,"_passstring"))))) { 
 BA.debugLineNum = 146;BA.debugLine="If checkloginPanel.Checked Then";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_checkloginpanel").runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 147;BA.debugLine="write_Usrs";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.loginscreen.class, "_write_usrs");
 }else {
 BA.debugLineNum = 149;BA.debugLine="File.Delete(File.DirDefaultExternal, \"users.co";
Debug.ShouldStop(1048576);
loginscreen.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("users.config")));
 };
 BA.debugLineNum = 152;BA.debugLine="If usrString = ProgramData.strUser And ProgramD";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_usrstring"),loginscreen._programdata._struser) && RemoteObject.solveBoolean("=",loginscreen._programdata._strpass,__ref.getField(true,"_passstring"))) { 
 BA.debugLineNum = 153;BA.debugLine="ProgramData.sameUser = True";
Debug.ShouldStop(16777216);
loginscreen._programdata._sameuser = loginscreen.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 155;BA.debugLine="ProgramData.sameUser = False";
Debug.ShouldStop(67108864);
loginscreen._programdata._sameuser = loginscreen.__c.getField(true,"False");
 };
 }else {
 BA.debugLineNum = 158;BA.debugLine="ProgramData.sameUser = False";
Debug.ShouldStop(536870912);
loginscreen._programdata._sameuser = loginscreen.__c.getField(true,"False");
 };
 BA.debugLineNum = 161;BA.debugLine="ProgramData.strUser = usrString";
Debug.ShouldStop(1);
loginscreen._programdata._struser = __ref.getField(true,"_usrstring");
 BA.debugLineNum = 162;BA.debugLine="ProgramData.strPass = passString";
Debug.ShouldStop(2);
loginscreen._programdata._strpass = __ref.getField(true,"_passstring");
 BA.debugLineNum = 164;BA.debugLine="CallSub(Main, \"LoginScreen_LoginClick\")";
Debug.ShouldStop(8);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("LoginScreen_LoginClick")));
 BA.debugLineNum = 166;BA.debugLine="btnloginPanelTimer.Enabled = True";
Debug.ShouldStop(32);
__ref.getField(false,"_btnloginpaneltimer").runMethod(true,"setEnabled",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check_pass(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("check_Pass (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("check_pass")) return __ref.runUserSub(false, "loginscreen","check_pass", __ref, _text);
Debug.locals.put("text", _text);
 BA.debugLineNum = 178;BA.debugLine="Private Sub check_Pass(text As String) As Boolean";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) return loginscreen.__c.getField(true,"True");
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check_user(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("check_User (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("check_user")) return __ref.runUserSub(false, "loginscreen","check_user", __ref, _text);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
Debug.locals.put("text", _text);
 BA.debugLineNum = 170;BA.debugLine="Private Sub check_User(text As String) As Boolean";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Private m As Matcher";
Debug.ShouldStop(1024);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");Debug.locals.put("m", _m);
 BA.debugLineNum = 172;BA.debugLine="m = Regex.Matcher(\"[a-z0-9]+[_a-z0-9\\.-]*[a-z0-9]";
Debug.ShouldStop(2048);
_m = loginscreen.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("[a-z0-9]+[_a-z0-9\\.-]*[a-z0-9]+@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})")),(Object)(_text));Debug.locals.put("m", _m);
 BA.debugLineNum = 173;BA.debugLine="If m.Find Then Return True";
Debug.ShouldStop(4096);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
if (true) return loginscreen.__c.getField(true,"True");};
 BA.debugLineNum = 174;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) return loginscreen.__c.getField(true,"False");
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private raf As RandomAccessFile";
loginscreen._raf = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");__ref.setField("_raf",loginscreen._raf);
 //BA.debugLineNum = 3;BA.debugLine="Private loginPanel As Panel";
loginscreen._loginpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_loginpanel",loginscreen._loginpanel);
 //BA.debugLineNum = 4;BA.debugLine="Private user, pass As EditText";
loginscreen._user = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_user",loginscreen._user);
loginscreen._pass = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_pass",loginscreen._pass);
 //BA.debugLineNum = 5;BA.debugLine="Public btnloginPanel, btnSettings, btnExit As But";
loginscreen._btnloginpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnloginpanel",loginscreen._btnloginpanel);
loginscreen._btnsettings = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnsettings",loginscreen._btnsettings);
loginscreen._btnexit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnexit",loginscreen._btnexit);
 //BA.debugLineNum = 6;BA.debugLine="Public CAD As CustomAlertDialog";
loginscreen._cad = RemoteObject.createNew ("def.CustomAlertDialog");__ref.setField("_cad",loginscreen._cad);
 //BA.debugLineNum = 7;BA.debugLine="Private checkloginPanel As CheckBox";
loginscreen._checkloginpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_checkloginpanel",loginscreen._checkloginpanel);
 //BA.debugLineNum = 8;BA.debugLine="Private usrString, passString As String";
loginscreen._usrstring = RemoteObject.createImmutable("");__ref.setField("_usrstring",loginscreen._usrstring);
loginscreen._passstring = RemoteObject.createImmutable("");__ref.setField("_passstring",loginscreen._passstring);
 //BA.debugLineNum = 9;BA.debugLine="Private btnloginPanelTimer As Timer";
loginscreen._btnloginpaneltimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_btnloginpaneltimer",loginscreen._btnloginpaneltimer);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "loginscreen","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="loginPanel.Initialize(\"loginPanelPanelsFake\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_loginpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("loginPanelPanelsFake")));
 BA.debugLineNum = 31;BA.debugLine="user.Initialize(\"userName\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_user").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("userName")));
 BA.debugLineNum = 32;BA.debugLine="pass.Initialize(\"Pass\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pass").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Pass")));
 BA.debugLineNum = 33;BA.debugLine="checkloginPanel.Initialize(\"Remember\")";
Debug.ShouldStop(1);
__ref.getField(false,"_checkloginpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Remember")));
 BA.debugLineNum = 34;BA.debugLine="btnloginPanel.Initialize(\"ButtonloginPanel\")";
Debug.ShouldStop(2);
__ref.getField(false,"_btnloginpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ButtonloginPanel")));
 BA.debugLineNum = 35;BA.debugLine="btnSettings.Initialize(\"loginPanelSettings\")	'Бут";
Debug.ShouldStop(4);
__ref.getField(false,"_btnsettings").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("loginPanelSettings")));
 BA.debugLineNum = 36;BA.debugLine="btnExit.Initialize(\"loginPanelExit\")";
Debug.ShouldStop(8);
__ref.getField(false,"_btnexit").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("loginPanelExit")));
 BA.debugLineNum = 37;BA.debugLine="btnloginPanelTimer.Initialize(\"btnloginPanelTimer";
Debug.ShouldStop(16);
__ref.getField(false,"_btnloginpaneltimer").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("btnloginPanelTimer")),(Object)(BA.numberCast(long.class, 200)));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loginpanel_configurations(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loginPanel_Configurations (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("loginpanel_configurations")) return __ref.runUserSub(false, "loginscreen","loginpanel_configurations", __ref);
 BA.debugLineNum = 79;BA.debugLine="Private Sub loginPanel_Configurations";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="loginPanel.SetBackgroundImage(LoadBitmap(File.Dir";
Debug.ShouldStop(32768);
__ref.getField(false,"_loginpanel").runVoidMethod ("SetBackgroundImageNew",(Object)((loginscreen.__c.runMethod(false,"LoadBitmap",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("login_background.jpg"))).getObject())));
 BA.debugLineNum = 83;BA.debugLine="HelperFunctions.Apply_ViewStyle(user,Colors.Black";
Debug.ShouldStop(262144);
loginscreen._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_user").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 60)));
 BA.debugLineNum = 84;BA.debugLine="user.Padding = Array As Int(15,0,0,0)";
Debug.ShouldStop(524288);
__ref.getField(false,"_user").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 15),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 85;BA.debugLine="user.SingleLine = True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_user").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 86;BA.debugLine="user.Hint = Main.translate.GetString(\"hintMail\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_user").runMethod(true,"setHint",loginscreen._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("hintMail"))));
 BA.debugLineNum = 87;BA.debugLine="user.TextSize = 14";
Debug.ShouldStop(4194304);
__ref.getField(false,"_user").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 89;BA.debugLine="HelperFunctions.Apply_ViewStyle(pass,Colors.Black";
Debug.ShouldStop(16777216);
loginscreen._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_pass").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 60)));
 BA.debugLineNum = 90;BA.debugLine="pass.Padding = Array As Int(15,0,0,0)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pass").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 15),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 91;BA.debugLine="pass.SingleLine = True";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pass").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 92;BA.debugLine="pass.PasswordMode = True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pass").runVoidMethod ("setPasswordMode",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 93;BA.debugLine="pass.Hint = Main.translate.GetString(\"lblPassword";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pass").runMethod(true,"setHint",loginscreen._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("lblPassword"))));
 BA.debugLineNum = 94;BA.debugLine="pass.TextSize = 14";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pass").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 96;BA.debugLine="checkloginPanel.TextColor=Colors.White";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_checkloginpanel").runMethod(true,"setTextColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 97;BA.debugLine="checkloginPanel.TextSize = 14";
Debug.ShouldStop(1);
__ref.getField(false,"_checkloginpanel").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 98;BA.debugLine="checkloginPanel.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(2);
__ref.getField(false,"_checkloginpanel").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 99;BA.debugLine="checkloginPanel.Text = Main.translate.GetString(\"";
Debug.ShouldStop(4);
__ref.getField(false,"_checkloginpanel").runMethod(true,"setText",BA.ObjectToCharSequence(loginscreen._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("rememberMe")))));
 BA.debugLineNum = 102;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnloginPanel,Col";
Debug.ShouldStop(32);
loginscreen._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnloginpanel").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 0xff4ac2ff)),(Object)(BA.numberCast(int.class, 0xff149be0)),(Object)(BA.numberCast(int.class, 0xff2cb7ff)),(Object)(BA.numberCast(int.class, 0xff2cb7ff)),(Object)(BA.numberCast(int.class, 0x66040509)),(Object)(BA.numberCast(int.class, 0x66040509)),(Object)(BA.numberCast(int.class, 60)));
 BA.debugLineNum = 103;BA.debugLine="btnloginPanel.TextSize = 14";
Debug.ShouldStop(64);
__ref.getField(false,"_btnloginpanel").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 104;BA.debugLine="btnloginPanel.Gravity = Gravity.CENTER";
Debug.ShouldStop(128);
__ref.getField(false,"_btnloginpanel").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 105;BA.debugLine="btnloginPanel.Text = Main.translate.GetString(\"bt";
Debug.ShouldStop(256);
__ref.getField(false,"_btnloginpanel").runMethod(true,"setText",BA.ObjectToCharSequence(loginscreen._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("btnloginPanel")))));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loginpanelsettings_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loginPanelSettings_Click (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("loginpanelsettings_click")) return __ref.runUserSub(false, "loginscreen","loginpanelsettings_click", __ref);
 BA.debugLineNum = 183;BA.debugLine="Public Sub loginPanelSettings_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="CallSub(Main, \"showSettings\")";
Debug.ShouldStop(8388608);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("showSettings")));
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pass_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("pass_FocusChanged (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("pass_focuschanged")) return __ref.runUserSub(false, "loginscreen","pass_focuschanged", __ref, _hasfocus);
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 110;BA.debugLine="Private Sub pass_FocusChanged (HasFocus As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(16384);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 112;BA.debugLine="pass.Text=\"\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_pass").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_savedusrs(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_SavedUsrs (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("read_savedusrs")) return __ref.runUserSub(false, "loginscreen","read_savedusrs", __ref);
 BA.debugLineNum = 125;BA.debugLine="Private Sub Read_SavedUsrs";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.co";
Debug.ShouldStop(536870912);
__ref.getField(false,"_raf").runVoidMethod ("Initialize",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("users.config")),(Object)(loginscreen.__c.getField(true,"False")));
 BA.debugLineNum = 127;BA.debugLine="usrString = raf.ReadEncryptedObject(ProgramData.r";
Debug.ShouldStop(1073741824);
__ref.setField ("_usrstring",BA.ObjectToString(__ref.getField(false,"_raf").runMethod(false,"ReadEncryptedObject",(Object)(BA.NumberToString(loginscreen._programdata._rafencpass)),(Object)(__ref.getField(false,"_raf").getField(true,"CurrentPosition")))));
 BA.debugLineNum = 128;BA.debugLine="passString = raf.ReadEncryptedObject(ProgramData.";
Debug.ShouldStop(-2147483648);
__ref.setField ("_passstring",BA.ObjectToString(__ref.getField(false,"_raf").runMethod(false,"ReadEncryptedObject",(Object)(BA.NumberToString(loginscreen._programdata._rafencpass)),(Object)(__ref.getField(false,"_raf").getField(true,"CurrentPosition")))));
 BA.debugLineNum = 130;BA.debugLine="ProgramData.strUser = usrString";
Debug.ShouldStop(2);
loginscreen._programdata._struser = __ref.getField(true,"_usrstring");
 BA.debugLineNum = 131;BA.debugLine="ProgramData.strPass = passString";
Debug.ShouldStop(4);
loginscreen._programdata._strpass = __ref.getField(true,"_passstring");
 BA.debugLineNum = 132;BA.debugLine="raf.Close";
Debug.ShouldStop(8);
__ref.getField(false,"_raf").runVoidMethod ("Close");
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start_up(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("start_up (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("start_up")) return __ref.runUserSub(false, "loginscreen","start_up", __ref);
 BA.debugLineNum = 13;BA.debugLine="Private Sub start_up";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="If File.Exists(File.DirDefaultExternal , \"users.c";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",loginscreen.__c.getField(false,"File").runMethod(true,"Exists",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("users.config"))),loginscreen.__c.getField(true,"True")) && RemoteObject.solveBoolean(">",loginscreen.__c.getField(false,"File").runMethod(true,"Size",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("users.config"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 15;BA.debugLine="checkloginPanel.Checked = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_checkloginpanel").runMethodAndSync(true,"setChecked",loginscreen.__c.getField(true,"True"));
 };
 BA.debugLineNum = 18;BA.debugLine="If checkloginPanel.Checked Then";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_checkloginpanel").runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 19;BA.debugLine="Read_SavedUsrs";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.loginscreen.class, "_read_savedusrs");
 BA.debugLineNum = 20;BA.debugLine="user.Text = usrString";
Debug.ShouldStop(524288);
__ref.getField(false,"_user").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_usrstring")));
 BA.debugLineNum = 21;BA.debugLine="pass.Text = passString";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pass").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_passstring")));
 }else {
 BA.debugLineNum = 23;BA.debugLine="user.Text = \"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_user").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 24;BA.debugLine="pass.Text = \"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pass").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
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
public static RemoteObject  _write_usrs(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("write_Usrs (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("write_usrs")) return __ref.runUserSub(false, "loginscreen","write_usrs", __ref);
 BA.debugLineNum = 117;BA.debugLine="Private Sub write_Usrs";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.co";
Debug.ShouldStop(2097152);
__ref.getField(false,"_raf").runVoidMethod ("Initialize",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("users.config")),(Object)(loginscreen.__c.getField(true,"False")));
 BA.debugLineNum = 119;BA.debugLine="raf.WriteEncryptedObject(usrString, ProgramData.r";
Debug.ShouldStop(4194304);
__ref.getField(false,"_raf").runVoidMethod ("WriteEncryptedObject",(Object)((__ref.getField(true,"_usrstring"))),(Object)(BA.NumberToString(loginscreen._programdata._rafencpass)),(Object)(__ref.getField(false,"_raf").getField(true,"CurrentPosition")));
 BA.debugLineNum = 120;BA.debugLine="raf.WriteEncryptedObject(passString, ProgramData.";
Debug.ShouldStop(8388608);
__ref.getField(false,"_raf").runVoidMethod ("WriteEncryptedObject",(Object)((__ref.getField(true,"_passstring"))),(Object)(BA.NumberToString(loginscreen._programdata._rafencpass)),(Object)(__ref.getField(false,"_raf").getField(true,"CurrentPosition")));
 BA.debugLineNum = 121;BA.debugLine="raf.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_raf").runVoidMethod ("Close");
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}