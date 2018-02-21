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
public anywheresoftware.b4a.objects.ImageViewWrapper _usericon = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _passicon = null;
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
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="loginPanel.Initialize(\"loginPanelPanelsFake\")";
__ref._loginpanel.Initialize(ba,"loginPanelPanelsFake");
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="user.Initialize(\"userName\")";
__ref._user.Initialize(ba,"userName");
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="pass.Initialize(\"Pass\")";
__ref._pass.Initialize(ba,"Pass");
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="checkloginPanel.Initialize(\"Remember\")";
__ref._checkloginpanel.Initialize(ba,"Remember");
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="btnloginPanel.Initialize(\"ButtonloginPanel\")";
__ref._btnloginpanel.Initialize(ba,"ButtonloginPanel");
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="btnSettings.Initialize(\"loginPanelSettings\")	'Бут";
__ref._btnsettings.Initialize(ba,"loginPanelSettings");
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="btnExit.Initialize(\"loginPanelExit\")";
__ref._btnexit.Initialize(ba,"loginPanelExit");
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="userIcon.Initialize(\"\")";
__ref._usericon.Initialize(ba,"");
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="passIcon.Initialize(\"\")";
__ref._passicon.Initialize(ba,"");
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="btnloginPanelTimer.Initialize(\"btnloginPanelTimer";
__ref._btnloginpaneltimer.Initialize(ba,"btnloginPanelTimer",(long) (200));
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Return loginPanel";
if (true) return __ref._loginpanel;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub build_Screen";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="loginPanel_Configurations";
__ref._loginpanel_configurations(null);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="start_up";
__ref._start_up(null);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private edtWidth,edtHeight As Int";
_edtwidth = 0;
_edtheight = 0;
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private btnWidth,btnHeight As Int";
_btnwidth = 0;
_btnheight = 0;
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private settingsWidth,settingsHeight As Int";
_settingswidth = 0;
_settingsheight = 0;
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private Padding,left As Int";
_padding = 0;
_left = 0;
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Padding = UISizes.DefaultPadding";
_padding = _uisizes._defaultpadding;
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="edtWidth = loginPanel.Width*0.7";
_edtwidth = (int) (__ref._loginpanel.getWidth()*0.7);
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="edtHeight = loginPanel.Height*0.08";
_edtheight = (int) (__ref._loginpanel.getHeight()*0.08);
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="btnHeight = loginPanel.Height*0.08";
_btnheight = (int) (__ref._loginpanel.getHeight()*0.08);
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="btnWidth = edtWidth/2 - Padding";
_btnwidth = (int) (_edtwidth/(double)2-_padding);
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="left = (loginPanel.Width - edtWidth)/2";
_left = (int) ((__ref._loginpanel.getWidth()-_edtwidth)/(double)2);
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="settingsWidth = loginPanel.Width*0.06";
_settingswidth = (int) (__ref._loginpanel.getWidth()*0.06);
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="settingsHeight = settingsWidth' loginPanel.Height";
_settingsheight = _settingswidth;
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="loginPanel.AddView(user,left, loginPanel.Height*(";
__ref._loginpanel.AddView((android.view.View)(__ref._user.getObject()),_left,(int) (__ref._loginpanel.getHeight()*(0.4)),_edtwidth,_edtheight);
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="loginPanel.AddView(pass, left, user.Top + user.He";
__ref._loginpanel.AddView((android.view.View)(__ref._pass.getObject()),_left,(int) (__ref._user.getTop()+__ref._user.getHeight()*1.5+_padding),_edtwidth,_edtheight);
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="loginPanel.AddView(userIcon,left - edtHeight + Pa";
__ref._loginpanel.AddView((android.view.View)(__ref._usericon.getObject()),(int) (_left-_edtheight+_padding),__ref._user.getTop(),_edtheight,_edtheight);
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="loginPanel.AddView(passIcon,left - edtHeight + Pa";
__ref._loginpanel.AddView((android.view.View)(__ref._passicon.getObject()),(int) (_left-_edtheight+_padding),__ref._pass.getTop(),_edtheight,_edtheight);
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="loginPanel.AddView(checkloginPanel, passIcon.Left";
__ref._loginpanel.AddView((android.view.View)(__ref._checkloginpanel.getObject()),(int) (__ref._passicon.getLeft()+_padding),(int) (__ref._passicon.getTop()+_edtheight*1.1+_padding),_btnwidth,_btnheight);
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="loginPanel.AddView(btnloginPanel, checkloginPanel";
__ref._loginpanel.AddView((android.view.View)(__ref._btnloginpanel.getObject()),(int) (__ref._checkloginpanel.getLeft()+__ref._checkloginpanel.getWidth()+_padding),__ref._checkloginpanel.getTop(),_btnwidth,_btnheight);
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="btnSettings.SetBackgroundImage(LoadBitmap(File.Di";
__ref._btnsettings.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"initial_options_icon.png").getObject()));
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="loginPanel.AddView(btnSettings, loginPanel.Width";
__ref._loginpanel.AddView((android.view.View)(__ref._btnsettings.getObject()),(int) (__ref._loginpanel.getWidth()*0.01),(int) (__ref._loginpanel.getHeight()*0.01),_settingswidth,_settingsheight);
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="btnExit.SetBackgroundImage(LoadBitmap(File.DirAss";
__ref._btnexit.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"exit_program_x.png").getObject()));
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="loginPanel.AddView(btnExit, loginPanel.width - se";
__ref._loginpanel.AddView((android.view.View)(__ref._btnexit.getObject()),(int) (__ref._loginpanel.getWidth()-_settingswidth-__ref._loginpanel.getWidth()*0.01),(int) (__ref._loginpanel.getHeight()*0.01),_settingswidth,_settingsheight);
RDebugUtils.currentLine=458786;
 //BA.debugLineNum = 458786;BA.debugLine="btnloginPanel.Enabled=True";
__ref._btnloginpanel.setEnabled(__c.True);
RDebugUtils.currentLine=458788;
 //BA.debugLineNum = 458788;BA.debugLine="End Sub";
return "";
}
public String  _loginpanel_configurations(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "loginpanel_configurations"))
	return (String) Debug.delegate(ba, "loginpanel_configurations", null);
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub loginPanel_Configurations";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="loginPanel.SetBackgroundImage(LoadBitmap(File.Dir";
__ref._loginpanel.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"login_background.jpg").getObject()));
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="userIcon.SetBackgroundImage(LoadBitmap(File.DirAs";
__ref._usericon.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"login_username_icon.png").getObject()));
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="userIcon.Gravity=Gravity.FILL";
__ref._usericon.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="passIcon.SetBackgroundImage(LoadBitmap(File.DirAs";
__ref._passicon.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"login_password_icon.png").getObject()));
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="passIcon.Gravity=Gravity.FILL";
__ref._passicon.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="HelperFunctions.Apply_ViewStyle(user,Colors.Black";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._user.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="user.Padding = Array As Int(15,0,0,0)";
__ref._user.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="user.SingleLine = True";
__ref._user.setSingleLine(__c.True);
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="user.Hint = Main.translate.GetString(\"hintMail\")";
__ref._user.setHint(_main._translate._getstring(null,"hintMail"));
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="user.TextSize = ProgramData.TextSize_ExtraLarge";
__ref._user.setTextSize((float) (_programdata._textsize_extralarge));
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="HelperFunctions.Apply_ViewStyle(pass,Colors.Black";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pass.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="pass.Padding = Array As Int(15,0,0,0)";
__ref._pass.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="pass.SingleLine = True";
__ref._pass.setSingleLine(__c.True);
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="pass.PasswordMode = True";
__ref._pass.setPasswordMode(__c.True);
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="pass.Hint = Main.translate.GetString(\"lblPassword";
__ref._pass.setHint(_main._translate._getstring(null,"lblPassword"));
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="pass.TextSize = ProgramData.TextSize_ExtraLarge";
__ref._pass.setTextSize((float) (_programdata._textsize_extralarge));
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="checkloginPanel.TextColor=Colors.White";
__ref._checkloginpanel.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="checkloginPanel.TextSize = ProgramData.TextSize_E";
__ref._checkloginpanel.setTextSize((float) (_programdata._textsize_extralarge));
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="checkloginPanel.Gravity = Gravity.CENTER_VERTICAL";
__ref._checkloginpanel.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="checkloginPanel.Text = Main.translate.GetString(\"";
__ref._checkloginpanel.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"rememberMe")));
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnloginPanel,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnloginpanel.getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="btnloginPanel.TextSize = ProgramData.TextSize_Ext";
__ref._btnloginpanel.setTextSize((float) (_programdata._textsize_extralarge+2));
RDebugUtils.currentLine=524318;
 //BA.debugLineNum = 524318;BA.debugLine="btnloginPanel.Gravity = Gravity.CENTER";
__ref._btnloginpanel.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="btnloginPanel.Text = Main.translate.GetString(\"bt";
__ref._btnloginpanel.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"btnloginPanel")));
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="End Sub";
return "";
}
public String  _start_up(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "start_up"))
	return (String) Debug.delegate(ba, "start_up", null);
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub start_up";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If File.Exists(File.DirDefaultExternal , \"users.c";
if (__c.File.Exists(__c.File.getDirDefaultExternal(),"users.config")==__c.True && __c.File.Size(__c.File.getDirDefaultExternal(),"users.config")>0) { 
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="checkloginPanel.Checked = True";
__ref._checkloginpanel.setChecked(__c.True);
 };
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="If checkloginPanel.Checked Then";
if (__ref._checkloginpanel.getChecked()) { 
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="Read_SavedUsrs";
__ref._read_savedusrs(null);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="user.Text = usrString";
__ref._user.setText(BA.ObjectToCharSequence(__ref._usrstring));
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="pass.Text = passString";
__ref._pass.setText(BA.ObjectToCharSequence(__ref._passstring));
 }else {
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="user.Text = \"\"";
__ref._user.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="pass.Text = \"\"";
__ref._pass.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="End Sub";
return "";
}
public String  _buttonloginpanel_click(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "buttonloginpanel_click"))
	return (String) Debug.delegate(ba, "buttonloginpanel_click", null);
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub ButtonloginPanel_Click";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="btnloginPanel.Enabled=False";
__ref._btnloginpanel.setEnabled(__c.False);
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="usrString = user.Text.ToLowerCase";
__ref._usrstring = __ref._user.getText().toLowerCase();
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="passString = pass.Text";
__ref._passstring = __ref._pass.getText();
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="If check_User(usrString) And check_Pass(passStrin";
if (__ref._check_user(null,__ref._usrstring) && __ref._check_pass(null,__ref._passstring)) { 
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="If checkloginPanel.Checked Then";
if (__ref._checkloginpanel.getChecked()) { 
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="write_Usrs";
__ref._write_usrs(null);
 }else {
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="File.Delete(File.DirDefaultExternal, \"users.co";
__c.File.Delete(__c.File.getDirDefaultExternal(),"users.config");
 };
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="If usrString = ProgramData.strUser And ProgramD";
if ((__ref._usrstring).equals(_programdata._struser) && (_programdata._strpass).equals(__ref._passstring)) { 
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="ProgramData.sameUser = True";
_programdata._sameuser = __c.True;
 }else {
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="ProgramData.sameUser = False";
_programdata._sameuser = __c.False;
 };
 }else {
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="ProgramData.sameUser = False";
_programdata._sameuser = __c.False;
 };
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="ProgramData.strUser = usrString";
_programdata._struser = __ref._usrstring;
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="ProgramData.strPass = passString";
_programdata._strpass = __ref._passstring;
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="CallSub(Main, \"LoginScreen_LoginClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"LoginScreen_LoginClick");
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="btnloginPanelTimer.Enabled = True";
__ref._btnloginpaneltimer.setEnabled(__c.True);
RDebugUtils.currentLine=786463;
 //BA.debugLineNum = 786463;BA.debugLine="End Sub";
return "";
}
public boolean  _check_user(b4a.example.loginscreen __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "check_user"))
	return (Boolean) Debug.delegate(ba, "check_user", new Object[] {_text});
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub check_User(text As String) As Boolean";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="m = Regex.Matcher(\"[a-z0-9]+[_a-z0-9\\.-]*[a-z0-9]";
_m = __c.Regex.Matcher("[a-z0-9]+[_a-z0-9\\.-]*[a-z0-9]+@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})",_text);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="If m.Find Then Return True";
if (_m.Find()) { 
if (true) return __c.True;};
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return false;
}
public boolean  _check_pass(b4a.example.loginscreen __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "check_pass"))
	return (Boolean) Debug.delegate(ba, "check_pass", new Object[] {_text});
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub check_Pass(text As String) As Boolean";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return false;
}
public String  _write_usrs(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "write_usrs"))
	return (String) Debug.delegate(ba, "write_usrs", null);
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub write_Usrs";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.co";
__ref._raf.Initialize(__c.File.getDirDefaultExternal(),"users.config",__c.False);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="raf.WriteEncryptedObject(usrString, ProgramData.r";
__ref._raf.WriteEncryptedObject((Object)(__ref._usrstring),BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="raf.WriteEncryptedObject(passString, ProgramData.";
__ref._raf.WriteEncryptedObject((Object)(__ref._passstring),BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="raf.Close";
__ref._raf.Close();
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Private raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Private loginPanel As Panel";
_loginpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Private user, pass As EditText";
_user = new anywheresoftware.b4a.objects.EditTextWrapper();
_pass = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Public btnloginPanel, btnSettings, btnExit As But";
_btnloginpanel = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnsettings = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnexit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Public CAD As CustomAlertDialog";
_cad = new def.CustomAlertDialog();
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Private checkloginPanel As CheckBox";
_checkloginpanel = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="Private usrString, passString As String";
_usrstring = "";
_passstring = "";
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="Private userIcon,passIcon As ImageView";
_usericon = new anywheresoftware.b4a.objects.ImageViewWrapper();
_passicon = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="Private btnloginPanelTimer As Timer";
_btnloginpaneltimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="End Sub";
return "";
}
public String  _pass_focuschanged(b4a.example.loginscreen __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "pass_focuschanged"))
	return (String) Debug.delegate(ba, "pass_focuschanged", new Object[] {_hasfocus});
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub pass_FocusChanged (HasFocus As Boolean";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="pass.Text=\"\"";
__ref._pass.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="End Sub";
return "";
}
public String  _read_savedusrs(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "read_savedusrs"))
	return (String) Debug.delegate(ba, "read_savedusrs", null);
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub Read_SavedUsrs";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.co";
__ref._raf.Initialize(__c.File.getDirDefaultExternal(),"users.config",__c.False);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="usrString = raf.ReadEncryptedObject(ProgramData.r";
__ref._usrstring = BA.ObjectToString(__ref._raf.ReadEncryptedObject(BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition));
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="passString = raf.ReadEncryptedObject(ProgramData.";
__ref._passstring = BA.ObjectToString(__ref._raf.ReadEncryptedObject(BA.NumberToString(_programdata._rafencpass),__ref._raf.CurrentPosition));
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="ProgramData.strUser = usrString";
_programdata._struser = __ref._usrstring;
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="ProgramData.strPass = passString";
_programdata._strpass = __ref._passstring;
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="raf.Close";
__ref._raf.Close();
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="End Sub";
return "";
}
}