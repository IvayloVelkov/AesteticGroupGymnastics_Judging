package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "agg.agg.loginscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", agg.agg.loginscreen.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
public anywheresoftware.b4a.objects.PanelWrapper _loginpanel = null;
public anywheresoftware.b4a.objects.EditTextWrapper _user = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pass = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnloginpanel = null;
public def.CustomAlertDialog _cad = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkloginpanel = null;
public String _usrstring = "";
public String _passstring = "";
public agg.agg.main _main = null;
public agg.agg.starter _starter = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public agg.agg.helperfunctions _helperfunctions = null;
public String  _initialize(agg.agg.loginscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="loginPanel.Initialize(\"loginPanelPanelsFake\")";
__ref._loginpanel.Initialize(ba,"loginPanelPanelsFake");
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="user.Initialize(\"userName\")";
__ref._user.Initialize(ba,"userName");
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="pass.Initialize(\"Pass\")";
__ref._pass.Initialize(ba,"Pass");
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="checkloginPanel.Initialize(\"Remember\")";
__ref._checkloginpanel.Initialize(ba,"Remember");
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="btnloginPanel.Initialize(\"ButtonloginPanel\")";
__ref._btnloginpanel.Initialize(ba,"ButtonloginPanel");
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(agg.agg.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Return loginPanel";
if (true) return __ref._loginpanel;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return null;
}
public String  _build_screen(agg.agg.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "build_screen"))
	return (String) Debug.delegate(ba, "build_screen", null);
int _edtwidth = 0;
int _edtheight = 0;
int _btnwidth = 0;
int _btnheight = 0;
int _padding = 0;
int _left = 0;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub build_Screen";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="loginPanel_Configurations";
__ref._loginpanel_configurations(null);
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="start_up";
__ref._start_up(null);
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="Private edtWidth,edtHeight As Int";
_edtwidth = 0;
_edtheight = 0;
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="Private btnWidth,btnHeight As Int";
_btnwidth = 0;
_btnheight = 0;
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="Private Padding,left As Int";
_padding = 0;
_left = 0;
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="Padding = UISizes.DefaultPadding";
_padding = _uisizes._defaultpadding;
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="edtWidth = loginPanel.Width*0.7";
_edtwidth = (int) (__ref._loginpanel.getWidth()*0.7);
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="edtHeight = loginPanel.Height*0.08";
_edtheight = (int) (__ref._loginpanel.getHeight()*0.08);
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="btnHeight = loginPanel.Height*0.08";
_btnheight = (int) (__ref._loginpanel.getHeight()*0.08);
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="btnWidth = edtWidth/2 - Padding";
_btnwidth = (int) (_edtwidth/(double)2-_padding);
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="left = (loginPanel.Width - edtWidth)/2";
_left = (int) ((__ref._loginpanel.getWidth()-_edtwidth)/(double)2);
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="loginPanel.AddView(user,left, loginPanel.Height*(";
__ref._loginpanel.AddView((android.view.View)(__ref._user.getObject()),_left,(int) (__ref._loginpanel.getHeight()*(0.3)),_edtwidth,_edtheight);
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="loginPanel.AddView(pass, left, user.Top+user.Heig";
__ref._loginpanel.AddView((android.view.View)(__ref._pass.getObject()),_left,(int) (__ref._user.getTop()+__ref._user.getHeight()*1.5+_padding),_edtwidth,_edtheight);
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="loginPanel.AddView(checkloginPanel, left + Paddin";
__ref._loginpanel.AddView((android.view.View)(__ref._checkloginpanel.getObject()),(int) (_left+_padding),(int) (__ref._pass.getTop()+_edtheight*1.5),_btnwidth,_btnheight);
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="loginPanel.AddView(btnloginPanel, checkloginPanel";
__ref._loginpanel.AddView((android.view.View)(__ref._btnloginpanel.getObject()),(int) (__ref._checkloginpanel.getLeft()+__ref._checkloginpanel.getWidth()+_padding),__ref._checkloginpanel.getTop(),_btnwidth,_btnheight);
RDebugUtils.currentLine=4522008;
 //BA.debugLineNum = 4522008;BA.debugLine="btnloginPanel.Enabled=True";
__ref._btnloginpanel.setEnabled(__c.True);
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="End Sub";
return "";
}
public String  _loginpanel_configurations(agg.agg.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "loginpanel_configurations"))
	return (String) Debug.delegate(ba, "loginpanel_configurations", null);
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Private Sub loginPanel_Configurations";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="loginPanel.SetBackgroundImage(LoadBitmap(File.Dir";
__ref._loginpanel.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"login_background.jpg").getObject()));
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="HelperFunctions.Apply_ViewStyle(user,Colors.Black";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._user.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="user.Padding = Array As Int(15,0,0,0)";
__ref._user.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="user.SingleLine = True";
__ref._user.setSingleLine(__c.True);
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="user.Hint = Main.translate.GetString(\"hintMail\")";
__ref._user.setHint(_main._translate._getstring(null,"hintMail"));
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="user.HintColor = Colors.Gray";
__ref._user.setHintColor(__c.Colors.Gray);
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="user.TextSize = 14";
__ref._user.setTextSize((float) (14));
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="HelperFunctions.Apply_ViewStyle(pass,Colors.Black";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pass.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="pass.Padding = Array As Int(15,0,0,0)";
__ref._pass.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=4587534;
 //BA.debugLineNum = 4587534;BA.debugLine="pass.SingleLine = True";
__ref._pass.setSingleLine(__c.True);
RDebugUtils.currentLine=4587535;
 //BA.debugLineNum = 4587535;BA.debugLine="pass.PasswordMode = True";
__ref._pass.setPasswordMode(__c.True);
RDebugUtils.currentLine=4587536;
 //BA.debugLineNum = 4587536;BA.debugLine="pass.Hint = Main.translate.GetString(\"lblPassword";
__ref._pass.setHint(_main._translate._getstring(null,"lblPassword"));
RDebugUtils.currentLine=4587537;
 //BA.debugLineNum = 4587537;BA.debugLine="pass.HintColor = Colors.Gray";
__ref._pass.setHintColor(__c.Colors.Gray);
RDebugUtils.currentLine=4587538;
 //BA.debugLineNum = 4587538;BA.debugLine="pass.TextSize = 14";
__ref._pass.setTextSize((float) (14));
RDebugUtils.currentLine=4587540;
 //BA.debugLineNum = 4587540;BA.debugLine="checkloginPanel.TextColor=Colors.White";
__ref._checkloginpanel.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4587541;
 //BA.debugLineNum = 4587541;BA.debugLine="checkloginPanel.TextSize = 14";
__ref._checkloginpanel.setTextSize((float) (14));
RDebugUtils.currentLine=4587542;
 //BA.debugLineNum = 4587542;BA.debugLine="checkloginPanel.Gravity = Gravity.CENTER_VERTICAL";
__ref._checkloginpanel.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=4587543;
 //BA.debugLineNum = 4587543;BA.debugLine="checkloginPanel.Text = Main.translate.GetString(\"";
__ref._checkloginpanel.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"rememberMe")));
RDebugUtils.currentLine=4587546;
 //BA.debugLineNum = 4587546;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnloginPanel,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnloginpanel.getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
RDebugUtils.currentLine=4587547;
 //BA.debugLineNum = 4587547;BA.debugLine="btnloginPanel.TextSize = 14";
__ref._btnloginpanel.setTextSize((float) (14));
RDebugUtils.currentLine=4587548;
 //BA.debugLineNum = 4587548;BA.debugLine="btnloginPanel.Gravity = Gravity.CENTER";
__ref._btnloginpanel.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4587549;
 //BA.debugLineNum = 4587549;BA.debugLine="btnloginPanel.Text = Main.translate.GetString(\"bt";
__ref._btnloginpanel.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"btnloginPanel")));
RDebugUtils.currentLine=4587551;
 //BA.debugLineNum = 4587551;BA.debugLine="End Sub";
return "";
}
public String  _start_up(agg.agg.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "start_up"))
	return (String) Debug.delegate(ba, "start_up", null);
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Private Sub start_up";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="If File.Exists(File.DirDefaultExternal , \"users.c";
if (__c.File.Exists(__c.File.getDirDefaultExternal(),"users.config")==__c.True && __c.File.Size(__c.File.getDirDefaultExternal(),"users.config")>0) { 
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="checkloginPanel.Checked = True";
__ref._checkloginpanel.setChecked(__c.True);
 };
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="If checkloginPanel.Checked Then";
if (__ref._checkloginpanel.getChecked()) { 
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Read_SavedUsrs";
__ref._read_savedusrs(null);
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="user.Text = usrString";
__ref._user.setText(BA.ObjectToCharSequence(__ref._usrstring));
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="pass.Text = passString";
__ref._pass.setText(BA.ObjectToCharSequence(__ref._passstring));
 }else {
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="user.Text = \"\"";
__ref._user.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="pass.Text = \"\"";
__ref._pass.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="End Sub";
return "";
}
public String  _buttonloginpanel_click(agg.agg.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "buttonloginpanel_click"))
	return (String) Debug.delegate(ba, "buttonloginpanel_click", null);
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub ButtonloginPanel_Click";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="btnloginPanel.Enabled=False";
__ref._btnloginpanel.setEnabled(__c.False);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="usrString = user.Text.ToLowerCase";
__ref._usrstring = __ref._user.getText().toLowerCase();
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="passString = pass.Text";
__ref._passstring = __ref._pass.getText();
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="If check_User(usrString) And check_Pass(passStrin";
if (__ref._check_user(null,__ref._usrstring) && __ref._check_pass(null,__ref._passstring)) { 
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="If checkloginPanel.Checked Then";
if (__ref._checkloginpanel.getChecked()) { 
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="write_Usrs";
__ref._write_usrs(null);
 }else {
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="File.Delete(File.DirDefaultExternal, \"users.co";
__c.File.Delete(__c.File.getDirDefaultExternal(),"users.config");
 };
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="If usrString = ProgramData.strUser And ProgramD";
if ((__ref._usrstring).equals(_programdata._struser) && (_programdata._strpass).equals(__ref._passstring)) { 
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="ProgramData.sameUser = True";
_programdata._sameuser = __c.True;
 }else {
RDebugUtils.currentLine=4849683;
 //BA.debugLineNum = 4849683;BA.debugLine="ProgramData.sameUser = False";
_programdata._sameuser = __c.False;
 };
 }else {
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="ProgramData.sameUser = False";
_programdata._sameuser = __c.False;
 };
RDebugUtils.currentLine=4849689;
 //BA.debugLineNum = 4849689;BA.debugLine="ProgramData.strUser = usrString";
_programdata._struser = __ref._usrstring;
RDebugUtils.currentLine=4849690;
 //BA.debugLineNum = 4849690;BA.debugLine="ProgramData.strPass = passString";
_programdata._strpass = __ref._passstring;
RDebugUtils.currentLine=4849692;
 //BA.debugLineNum = 4849692;BA.debugLine="CallSub(Main, \"LoginScreen_LoginClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"LoginScreen_LoginClick");
RDebugUtils.currentLine=4849694;
 //BA.debugLineNum = 4849694;BA.debugLine="End Sub";
return "";
}
public boolean  _check_user(agg.agg.loginscreen __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "check_user"))
	return (Boolean) Debug.delegate(ba, "check_user", new Object[] {_text});
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub check_User(text As String) As Boolean";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Private m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="m = Regex.Matcher(\"[a-z0-9]+[_a-z0-9\\.-]*[a-z0-9]";
_m = __c.Regex.Matcher("[a-z0-9]+[_a-z0-9\\.-]*[a-z0-9]+@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})",_text);
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="If m.Find Then Return True";
if (_m.Find()) { 
if (true) return __c.True;};
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="End Sub";
return false;
}
public boolean  _check_pass(agg.agg.loginscreen __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "check_pass"))
	return (Boolean) Debug.delegate(ba, "check_pass", new Object[] {_text});
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub check_Pass(text As String) As Boolean";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return false;
}
public String  _write_usrs(agg.agg.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "write_usrs"))
	return (String) Debug.delegate(ba, "write_usrs", null);
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub write_Usrs";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.co";
__ref._raf.Initialize(__c.File.getDirDefaultExternal(),"users.config",__c.False);
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="raf.WriteEncryptedObject(usrString, ProgramData.r";
__ref._raf.WriteEncryptedObject((Object)(__ref._usrstring),BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition);
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="raf.WriteEncryptedObject(passString, ProgramData.";
__ref._raf.WriteEncryptedObject((Object)(__ref._passstring),BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition);
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="raf.Close";
__ref._raf.Close();
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Private raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Private loginPanel As Panel";
_loginpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Private user, pass As EditText";
_user = new anywheresoftware.b4a.objects.EditTextWrapper();
_pass = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="Public btnloginPanel As Button";
_btnloginpanel = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Public CAD As CustomAlertDialog";
_cad = new def.CustomAlertDialog();
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="Private checkloginPanel As CheckBox";
_checkloginpanel = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="Private usrString, passString As String";
_usrstring = "";
_passstring = "";
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="End Sub";
return "";
}
public String  _pass_focuschanged(agg.agg.loginscreen __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "pass_focuschanged"))
	return (String) Debug.delegate(ba, "pass_focuschanged", new Object[] {_hasfocus});
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Private Sub pass_FocusChanged (HasFocus As Boolean";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="pass.Text=\"\"";
__ref._pass.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="End Sub";
return "";
}
public String  _read_savedusrs(agg.agg.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "read_savedusrs"))
	return (String) Debug.delegate(ba, "read_savedusrs", null);
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub Read_SavedUsrs";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.co";
__ref._raf.Initialize(__c.File.getDirDefaultExternal(),"users.config",__c.False);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="usrString = raf.ReadEncryptedObject(ProgramData.r";
__ref._usrstring = BA.ObjectToString(__ref._raf.ReadEncryptedObject(BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition));
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="passString = raf.ReadEncryptedObject(ProgramData.";
__ref._passstring = BA.ObjectToString(__ref._raf.ReadEncryptedObject(BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition));
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="ProgramData.strUser = usrString";
_programdata._struser = __ref._usrstring;
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="ProgramData.strPass = passString";
_programdata._strpass = __ref._passstring;
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="raf.Close";
__ref._raf.Close();
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="End Sub";
return "";
}
}