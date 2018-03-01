package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.loginscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.loginscreen.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ButtonWrapper _btnsettings = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnexit = null;
public def.CustomAlertDialog _cad = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkloginpanel = null;
public String _usrstring = "";
public String _passstring = "";
public anywheresoftware.b4a.objects.Timer _btnloginpaneltimer = null;
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public String  _initialize(b4a.example.loginscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="loginPanel.Initialize(\"loginPanelPanelsFake\")";
__ref._loginpanel.Initialize(ba,"loginPanelPanelsFake");
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="user.Initialize(\"userName\")";
__ref._user.Initialize(ba,"userName");
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="pass.Initialize(\"Pass\")";
__ref._pass.Initialize(ba,"Pass");
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="checkloginPanel.Initialize(\"Remember\")";
__ref._checkloginpanel.Initialize(ba,"Remember");
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="btnloginPanel.Initialize(\"ButtonloginPanel\")";
__ref._btnloginpanel.Initialize(ba,"ButtonloginPanel");
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="btnSettings.Initialize(\"loginPanelSettings\")	'Бут";
__ref._btnsettings.Initialize(ba,"loginPanelSettings");
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="btnExit.Initialize(\"loginPanelExit\")";
__ref._btnexit.Initialize(ba,"loginPanelExit");
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="btnloginPanelTimer.Initialize(\"btnloginPanelTimer";
__ref._btnloginpaneltimer.Initialize(ba,"btnloginPanelTimer",(long) (200));
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Return loginPanel";
if (true) return __ref._loginpanel;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return null;
}
public String  _build_screen(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "build_screen"))
	return (String) Debug.delegate(ba, "build_screen", null);
int _edtwidth = 0;
int _edtheight = 0;
int _btnwidth = 0;
int _btnheight = 0;
int _settingswidth = 0;
int _settingsheight = 0;
int _padding = 0;
int _left = 0;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub build_Screen";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="loginPanel_Configurations";
__ref._loginpanel_configurations(null);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="start_up";
__ref._start_up(null);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Private edtWidth,edtHeight As Int";
_edtwidth = 0;
_edtheight = 0;
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Private btnWidth,btnHeight As Int";
_btnwidth = 0;
_btnheight = 0;
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Private settingsWidth,settingsHeight As Int";
_settingswidth = 0;
_settingsheight = 0;
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Private Padding,left As Int";
_padding = 0;
_left = 0;
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Padding = UISizes.DefaultPadding";
_padding = _uisizes._defaultpadding;
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="edtWidth = loginPanel.Width*0.7";
_edtwidth = (int) (__ref._loginpanel.getWidth()*0.7);
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="edtHeight = loginPanel.Height*0.08";
_edtheight = (int) (__ref._loginpanel.getHeight()*0.08);
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="btnHeight = loginPanel.Height*0.08";
_btnheight = (int) (__ref._loginpanel.getHeight()*0.08);
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="btnWidth = edtWidth/2 - Padding";
_btnwidth = (int) (_edtwidth/(double)2-_padding);
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="left = (loginPanel.Width - edtWidth)/2";
_left = (int) ((__ref._loginpanel.getWidth()-_edtwidth)/(double)2);
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="settingsWidth = loginPanel.Width*0.06";
_settingswidth = (int) (__ref._loginpanel.getWidth()*0.06);
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="settingsHeight = settingsWidth' loginPanel.Heigh";
_settingsheight = _settingswidth;
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="loginPanel.AddView(user,left, loginPanel.Height*(";
__ref._loginpanel.AddView((android.view.View)(__ref._user.getObject()),_left,(int) (__ref._loginpanel.getHeight()*(0.3)),_edtwidth,_edtheight);
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="loginPanel.AddView(pass, left, user.Top+user.Heig";
__ref._loginpanel.AddView((android.view.View)(__ref._pass.getObject()),_left,(int) (__ref._user.getTop()+__ref._user.getHeight()*1.5+_padding),_edtwidth,_edtheight);
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="loginPanel.AddView(checkloginPanel, left + Paddin";
__ref._loginpanel.AddView((android.view.View)(__ref._checkloginpanel.getObject()),(int) (_left+_padding),(int) (__ref._pass.getTop()+_edtheight*1.5),_btnwidth,_btnheight);
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="loginPanel.AddView(btnloginPanel, checkloginPanel";
__ref._loginpanel.AddView((android.view.View)(__ref._btnloginpanel.getObject()),(int) (__ref._checkloginpanel.getLeft()+__ref._checkloginpanel.getWidth()+_padding),__ref._checkloginpanel.getTop(),_btnwidth,_btnheight);
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="btnSettings.SetBackgroundImage(LoadBitmap(File.Di";
__ref._btnsettings.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"initial_options_icon.png").getObject()));
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="loginPanel.AddView(btnSettings, loginPanel.Width";
__ref._loginpanel.AddView((android.view.View)(__ref._btnsettings.getObject()),(int) (__ref._loginpanel.getWidth()*0.01),(int) (__ref._loginpanel.getHeight()*0.01),_settingswidth,_settingsheight);
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="btnExit.SetBackgroundImage(LoadBitmap(File.DirAss";
__ref._btnexit.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"exit_program_x.png").getObject()));
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="loginPanel.AddView(btnExit, loginPanel.width - se";
__ref._loginpanel.AddView((android.view.View)(__ref._btnexit.getObject()),(int) (__ref._loginpanel.getWidth()-_settingswidth-__ref._loginpanel.getWidth()*0.01),(int) (__ref._loginpanel.getHeight()*0.01),_settingswidth,_settingsheight);
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="btnloginPanel.Enabled=True";
__ref._btnloginpanel.setEnabled(__c.True);
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="End Sub";
return "";
}
public String  _loginpanel_configurations(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "loginpanel_configurations"))
	return (String) Debug.delegate(ba, "loginpanel_configurations", null);
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub loginPanel_Configurations";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="loginPanel.SetBackgroundImage(LoadBitmap(File.Dir";
__ref._loginpanel.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"login_background.jpg").getObject()));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="HelperFunctions.Apply_ViewStyle(user,Colors.Black";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._user.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="user.Padding = Array As Int(15,0,0,0)";
__ref._user.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="user.SingleLine = True";
__ref._user.setSingleLine(__c.True);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="user.Hint = Main.translate.GetString(\"hintMail\")";
__ref._user.setHint(_main._translate._getstring(null,"hintMail"));
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="user.TextSize = 14";
__ref._user.setTextSize((float) (14));
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="HelperFunctions.Apply_ViewStyle(pass,Colors.Black";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pass.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="pass.Padding = Array As Int(15,0,0,0)";
__ref._pass.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="pass.SingleLine = True";
__ref._pass.setSingleLine(__c.True);
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="pass.PasswordMode = True";
__ref._pass.setPasswordMode(__c.True);
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="pass.Hint = Main.translate.GetString(\"lblPassword";
__ref._pass.setHint(_main._translate._getstring(null,"lblPassword"));
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="pass.TextSize = 14";
__ref._pass.setTextSize((float) (14));
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="checkloginPanel.TextColor=Colors.White";
__ref._checkloginpanel.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="checkloginPanel.TextSize = 14";
__ref._checkloginpanel.setTextSize((float) (14));
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="checkloginPanel.Gravity = Gravity.CENTER_VERTICAL";
__ref._checkloginpanel.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="checkloginPanel.Text = Main.translate.GetString(\"";
__ref._checkloginpanel.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"rememberMe")));
RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnloginPanel,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnloginpanel.getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="btnloginPanel.TextSize = 14";
__ref._btnloginpanel.setTextSize((float) (14));
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="btnloginPanel.Gravity = Gravity.CENTER";
__ref._btnloginpanel.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="btnloginPanel.Text = Main.translate.GetString(\"bt";
__ref._btnloginpanel.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"btnloginPanel")));
RDebugUtils.currentLine=1048604;
 //BA.debugLineNum = 1048604;BA.debugLine="End Sub";
return "";
}
public String  _start_up(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "start_up"))
	return (String) Debug.delegate(ba, "start_up", null);
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub start_up";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If File.Exists(File.DirDefaultExternal , \"users.c";
if (__c.File.Exists(__c.File.getDirDefaultExternal(),"users.config")==__c.True && __c.File.Size(__c.File.getDirDefaultExternal(),"users.config")>0) { 
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="checkloginPanel.Checked = True";
__ref._checkloginpanel.setChecked(__c.True);
 };
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="If checkloginPanel.Checked Then";
if (__ref._checkloginpanel.getChecked()) { 
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Read_SavedUsrs";
__ref._read_savedusrs(null);
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="user.Text = usrString";
__ref._user.setText(BA.ObjectToCharSequence(__ref._usrstring));
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="pass.Text = passString";
__ref._pass.setText(BA.ObjectToCharSequence(__ref._passstring));
 }else {
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="user.Text = \"\"";
__ref._user.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="pass.Text = \"\"";
__ref._pass.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="End Sub";
return "";
}
public String  _buttonloginpanel_click(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "buttonloginpanel_click"))
	return (String) Debug.delegate(ba, "buttonloginpanel_click", null);
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub ButtonloginPanel_Click";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="btnloginPanel.Enabled=False";
__ref._btnloginpanel.setEnabled(__c.False);
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="usrString = user.Text.ToLowerCase";
__ref._usrstring = __ref._user.getText().toLowerCase();
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="passString = pass.Text";
__ref._passstring = __ref._pass.getText();
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="If check_User(usrString) And check_Pass(passStrin";
if (__ref._check_user(null,__ref._usrstring) && __ref._check_pass(null,__ref._passstring)) { 
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="If checkloginPanel.Checked Then";
if (__ref._checkloginpanel.getChecked()) { 
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="write_Usrs";
__ref._write_usrs(null);
 }else {
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="File.Delete(File.DirDefaultExternal, \"users.co";
__c.File.Delete(__c.File.getDirDefaultExternal(),"users.config");
 };
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="If usrString = ProgramData.strUser And ProgramD";
if ((__ref._usrstring).equals(_programdata._struser) && (_programdata._strpass).equals(__ref._passstring)) { 
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="ProgramData.sameUser = True";
_programdata._sameuser = __c.True;
 }else {
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="ProgramData.sameUser = False";
_programdata._sameuser = __c.False;
 };
 }else {
RDebugUtils.currentLine=1310742;
 //BA.debugLineNum = 1310742;BA.debugLine="ProgramData.sameUser = False";
_programdata._sameuser = __c.False;
 };
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="ProgramData.strUser = usrString";
_programdata._struser = __ref._usrstring;
RDebugUtils.currentLine=1310746;
 //BA.debugLineNum = 1310746;BA.debugLine="ProgramData.strPass = passString";
_programdata._strpass = __ref._passstring;
RDebugUtils.currentLine=1310748;
 //BA.debugLineNum = 1310748;BA.debugLine="CallSub(Main, \"LoginScreen_LoginClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"LoginScreen_LoginClick");
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="btnloginPanelTimer.Enabled = True";
__ref._btnloginpaneltimer.setEnabled(__c.True);
RDebugUtils.currentLine=1310751;
 //BA.debugLineNum = 1310751;BA.debugLine="End Sub";
return "";
}
public boolean  _check_user(b4a.example.loginscreen __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "check_user"))
	return (Boolean) Debug.delegate(ba, "check_user", new Object[] {_text});
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub check_User(text As String) As Boolean";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Private m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="m = Regex.Matcher(\"[a-z0-9]+[_a-z0-9\\.-]*[a-z0-9]";
_m = __c.Regex.Matcher("[a-z0-9]+[_a-z0-9\\.-]*[a-z0-9]+@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})",_text);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="If m.Find Then Return True";
if (_m.Find()) { 
if (true) return __c.True;};
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="End Sub";
return false;
}
public boolean  _check_pass(b4a.example.loginscreen __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "check_pass"))
	return (Boolean) Debug.delegate(ba, "check_pass", new Object[] {_text});
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub check_Pass(text As String) As Boolean";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return false;
}
public String  _write_usrs(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "write_usrs"))
	return (String) Debug.delegate(ba, "write_usrs", null);
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub write_Usrs";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.co";
__ref._raf.Initialize(__c.File.getDirDefaultExternal(),"users.config",__c.False);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="raf.WriteEncryptedObject(usrString, ProgramData.r";
__ref._raf.WriteEncryptedObject((Object)(__ref._usrstring),BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="raf.WriteEncryptedObject(passString, ProgramData.";
__ref._raf.WriteEncryptedObject((Object)(__ref._passstring),BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="raf.Close";
__ref._raf.Close();
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Private raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Private loginPanel As Panel";
_loginpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Private user, pass As EditText";
_user = new anywheresoftware.b4a.objects.EditTextWrapper();
_pass = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Public btnloginPanel, btnSettings, btnExit As But";
_btnloginpanel = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnsettings = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnexit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Public CAD As CustomAlertDialog";
_cad = new def.CustomAlertDialog();
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Private checkloginPanel As CheckBox";
_checkloginpanel = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="Private usrString, passString As String";
_usrstring = "";
_passstring = "";
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Private btnloginPanelTimer As Timer";
_btnloginpaneltimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="End Sub";
return "";
}
public String  _loginpanelsettings_click(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "loginpanelsettings_click"))
	return (String) Debug.delegate(ba, "loginpanelsettings_click", null);
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub loginPanelSettings_Click";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="CallSub(Main, \"showSettings\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"showSettings");
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public String  _pass_focuschanged(b4a.example.loginscreen __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "pass_focuschanged"))
	return (String) Debug.delegate(ba, "pass_focuschanged", new Object[] {_hasfocus});
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub pass_FocusChanged (HasFocus As Boolean";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="pass.Text=\"\"";
__ref._pass.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return "";
}
public String  _read_savedusrs(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "read_savedusrs"))
	return (String) Debug.delegate(ba, "read_savedusrs", null);
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub Read_SavedUsrs";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.co";
__ref._raf.Initialize(__c.File.getDirDefaultExternal(),"users.config",__c.False);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="usrString = raf.ReadEncryptedObject(ProgramData.r";
__ref._usrstring = BA.ObjectToString(__ref._raf.ReadEncryptedObject(BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition));
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="passString = raf.ReadEncryptedObject(ProgramData.";
__ref._passstring = BA.ObjectToString(__ref._raf.ReadEncryptedObject(BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition));
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="ProgramData.strUser = usrString";
_programdata._struser = __ref._usrstring;
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="ProgramData.strPass = passString";
_programdata._strpass = __ref._passstring;
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="raf.Close";
__ref._raf.Close();
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="End Sub";
return "";
}
}