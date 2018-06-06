package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "agg.agg.loginscreen");
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
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Public Sub asView As Panel";
 //BA.debugLineNum = 172;BA.debugLine="Return loginPanel";
if (true) return _loginpanel;
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public String  _build_screen() throws Exception{
int _edtwidth = 0;
int _edtheight = 0;
int _btnwidth = 0;
int _btnheight = 0;
int _padding = 0;
int _left = 0;
 //BA.debugLineNum = 37;BA.debugLine="Public Sub build_Screen";
 //BA.debugLineNum = 38;BA.debugLine="loginPanel_Configurations";
_loginpanel_configurations();
 //BA.debugLineNum = 39;BA.debugLine="start_up";
_start_up();
 //BA.debugLineNum = 41;BA.debugLine="Private edtWidth,edtHeight As Int";
_edtwidth = 0;
_edtheight = 0;
 //BA.debugLineNum = 42;BA.debugLine="Private btnWidth,btnHeight As Int";
_btnwidth = 0;
_btnheight = 0;
 //BA.debugLineNum = 43;BA.debugLine="Private Padding,left As Int";
_padding = 0;
_left = 0;
 //BA.debugLineNum = 46;BA.debugLine="Padding = UISizes.DefaultPadding";
_padding = _uisizes._defaultpadding;
 //BA.debugLineNum = 47;BA.debugLine="edtWidth = loginPanel.Width*0.7";
_edtwidth = (int) (_loginpanel.getWidth()*0.7);
 //BA.debugLineNum = 48;BA.debugLine="edtHeight = loginPanel.Height*0.08";
_edtheight = (int) (_loginpanel.getHeight()*0.08);
 //BA.debugLineNum = 49;BA.debugLine="btnHeight = loginPanel.Height*0.08";
_btnheight = (int) (_loginpanel.getHeight()*0.08);
 //BA.debugLineNum = 50;BA.debugLine="btnWidth = edtWidth/2 - Padding";
_btnwidth = (int) (_edtwidth/(double)2-_padding);
 //BA.debugLineNum = 51;BA.debugLine="left = (loginPanel.Width - edtWidth)/2";
_left = (int) ((_loginpanel.getWidth()-_edtwidth)/(double)2);
 //BA.debugLineNum = 53;BA.debugLine="loginPanel.AddView(user,left, loginPanel.Height*(";
_loginpanel.AddView((android.view.View)(_user.getObject()),_left,(int) (_loginpanel.getHeight()*(0.3)),_edtwidth,_edtheight);
 //BA.debugLineNum = 54;BA.debugLine="loginPanel.AddView(pass, left, user.Top+user.Heig";
_loginpanel.AddView((android.view.View)(_pass.getObject()),_left,(int) (_user.getTop()+_user.getHeight()*1.5+_padding),_edtwidth,_edtheight);
 //BA.debugLineNum = 56;BA.debugLine="loginPanel.AddView(checkloginPanel, left + Paddin";
_loginpanel.AddView((android.view.View)(_checkloginpanel.getObject()),(int) (_left+_padding),(int) (_pass.getTop()+_edtheight*1.5),_btnwidth,_btnheight);
 //BA.debugLineNum = 57;BA.debugLine="loginPanel.AddView(btnloginPanel, checkloginPanel";
_loginpanel.AddView((android.view.View)(_btnloginpanel.getObject()),(int) (_checkloginpanel.getLeft()+_checkloginpanel.getWidth()+_padding),_checkloginpanel.getTop(),_btnwidth,_btnheight);
 //BA.debugLineNum = 61;BA.debugLine="btnloginPanel.Enabled=True";
_btnloginpanel.setEnabled(__c.True);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _buttonloginpanel_click() throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Private Sub ButtonloginPanel_Click";
 //BA.debugLineNum = 128;BA.debugLine="btnloginPanel.Enabled=False";
_btnloginpanel.setEnabled(__c.False);
 //BA.debugLineNum = 131;BA.debugLine="usrString = user.Text.ToLowerCase";
_usrstring = _user.getText().toLowerCase();
 //BA.debugLineNum = 132;BA.debugLine="passString = pass.Text";
_passstring = _pass.getText();
 //BA.debugLineNum = 134;BA.debugLine="If check_User(usrString) And check_Pass(passStrin";
if (_check_user(_usrstring) && _check_pass(_passstring)) { 
 //BA.debugLineNum = 136;BA.debugLine="If checkloginPanel.Checked Then";
if (_checkloginpanel.getChecked()) { 
 //BA.debugLineNum = 137;BA.debugLine="write_Usrs";
_write_usrs();
 }else {
 //BA.debugLineNum = 139;BA.debugLine="File.Delete(File.DirDefaultExternal, \"users.co";
__c.File.Delete(__c.File.getDirDefaultExternal(),"users.config");
 };
 //BA.debugLineNum = 142;BA.debugLine="If usrString = ProgramData.strUser And ProgramD";
if ((_usrstring).equals(_programdata._struser) && (_programdata._strpass).equals(_passstring)) { 
 //BA.debugLineNum = 143;BA.debugLine="ProgramData.sameUser = True";
_programdata._sameuser = __c.True;
 }else {
 //BA.debugLineNum = 145;BA.debugLine="ProgramData.sameUser = False";
_programdata._sameuser = __c.False;
 };
 }else {
 //BA.debugLineNum = 148;BA.debugLine="ProgramData.sameUser = False";
_programdata._sameuser = __c.False;
 };
 //BA.debugLineNum = 151;BA.debugLine="ProgramData.strUser = usrString";
_programdata._struser = _usrstring;
 //BA.debugLineNum = 152;BA.debugLine="ProgramData.strPass = passString";
_programdata._strpass = _passstring;
 //BA.debugLineNum = 154;BA.debugLine="CallSub(Main, \"LoginScreen_LoginClick\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"LoginScreen_LoginClick");
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public boolean  _check_pass(String _text) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Private Sub check_Pass(text As String) As Boolean";
 //BA.debugLineNum = 168;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return false;
}
public boolean  _check_user(String _text) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
 //BA.debugLineNum = 159;BA.debugLine="Private Sub check_User(text As String) As Boolean";
 //BA.debugLineNum = 160;BA.debugLine="Private m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
 //BA.debugLineNum = 161;BA.debugLine="m = Regex.Matcher(\"[a-z0-9]+[_a-z0-9\\.-]*[a-z0-9]";
_m = __c.Regex.Matcher("[a-z0-9]+[_a-z0-9\\.-]*[a-z0-9]+@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})",_text);
 //BA.debugLineNum = 162;BA.debugLine="If m.Find Then Return True";
if (_m.Find()) { 
if (true) return __c.True;};
 //BA.debugLineNum = 163;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
 //BA.debugLineNum = 3;BA.debugLine="Private loginPanel As Panel";
_loginpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private user, pass As EditText";
_user = new anywheresoftware.b4a.objects.EditTextWrapper();
_pass = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Public btnloginPanel As Button";
_btnloginpanel = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Public CAD As CustomAlertDialog";
_cad = new def.CustomAlertDialog();
 //BA.debugLineNum = 7;BA.debugLine="Private checkloginPanel As CheckBox";
_checkloginpanel = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private usrString, passString As String";
_usrstring = "";
_passstring = "";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 29;BA.debugLine="loginPanel.Initialize(\"loginPanelPanelsFake\")";
_loginpanel.Initialize(ba,"loginPanelPanelsFake");
 //BA.debugLineNum = 30;BA.debugLine="user.Initialize(\"userName\")";
_user.Initialize(ba,"userName");
 //BA.debugLineNum = 31;BA.debugLine="pass.Initialize(\"Pass\")";
_pass.Initialize(ba,"Pass");
 //BA.debugLineNum = 32;BA.debugLine="checkloginPanel.Initialize(\"Remember\")";
_checkloginpanel.Initialize(ba,"Remember");
 //BA.debugLineNum = 33;BA.debugLine="btnloginPanel.Initialize(\"ButtonloginPanel\")";
_btnloginpanel.Initialize(ba,"ButtonloginPanel");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _loginpanel_configurations() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Private Sub loginPanel_Configurations";
 //BA.debugLineNum = 67;BA.debugLine="loginPanel.SetBackgroundImage(LoadBitmap(File.Dir";
_loginpanel.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"login_background.jpg").getObject()));
 //BA.debugLineNum = 70;BA.debugLine="HelperFunctions.Apply_ViewStyle(user,Colors.Black";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_user.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
 //BA.debugLineNum = 71;BA.debugLine="user.Padding = Array As Int(15,0,0,0)";
_user.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 72;BA.debugLine="user.SingleLine = True";
_user.setSingleLine(__c.True);
 //BA.debugLineNum = 74;BA.debugLine="user.Hint = Main.translate.GetString(\"hintMail\")";
_user.setHint(_main._translate._getstring("hintMail"));
 //BA.debugLineNum = 75;BA.debugLine="user.HintColor = Colors.Gray";
_user.setHintColor(__c.Colors.Gray);
 //BA.debugLineNum = 76;BA.debugLine="user.TextSize = 14";
_user.setTextSize((float) (14));
 //BA.debugLineNum = 78;BA.debugLine="HelperFunctions.Apply_ViewStyle(pass,Colors.Black";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_pass.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
 //BA.debugLineNum = 79;BA.debugLine="pass.Padding = Array As Int(15,0,0,0)";
_pass.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 80;BA.debugLine="pass.SingleLine = True";
_pass.setSingleLine(__c.True);
 //BA.debugLineNum = 81;BA.debugLine="pass.PasswordMode = True";
_pass.setPasswordMode(__c.True);
 //BA.debugLineNum = 82;BA.debugLine="pass.Hint = Main.translate.GetString(\"lblPassword";
_pass.setHint(_main._translate._getstring("lblPassword"));
 //BA.debugLineNum = 83;BA.debugLine="pass.HintColor = Colors.Gray";
_pass.setHintColor(__c.Colors.Gray);
 //BA.debugLineNum = 84;BA.debugLine="pass.TextSize = 14";
_pass.setTextSize((float) (14));
 //BA.debugLineNum = 86;BA.debugLine="checkloginPanel.TextColor=Colors.White";
_checkloginpanel.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 87;BA.debugLine="checkloginPanel.TextSize = 14";
_checkloginpanel.setTextSize((float) (14));
 //BA.debugLineNum = 88;BA.debugLine="checkloginPanel.Gravity = Gravity.CENTER_VERTICAL";
_checkloginpanel.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 89;BA.debugLine="checkloginPanel.Text = Main.translate.GetString(\"";
_checkloginpanel.setText(BA.ObjectToCharSequence(_main._translate._getstring("rememberMe")));
 //BA.debugLineNum = 92;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnloginPanel,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnloginpanel.getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
 //BA.debugLineNum = 93;BA.debugLine="btnloginPanel.TextSize = 14";
_btnloginpanel.setTextSize((float) (14));
 //BA.debugLineNum = 94;BA.debugLine="btnloginPanel.Gravity = Gravity.CENTER";
_btnloginpanel.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 95;BA.debugLine="btnloginPanel.Text = Main.translate.GetString(\"bt";
_btnloginpanel.setText(BA.ObjectToCharSequence(_main._translate._getstring("btnloginPanel")));
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _pass_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Private Sub pass_FocusChanged (HasFocus As Boolean";
 //BA.debugLineNum = 101;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
 //BA.debugLineNum = 102;BA.debugLine="pass.Text=\"\"";
_pass.setText(BA.ObjectToCharSequence(""));
 };
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _read_savedusrs() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Private Sub Read_SavedUsrs";
 //BA.debugLineNum = 116;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.co";
_raf.Initialize(__c.File.getDirDefaultExternal(),"users.config",__c.False);
 //BA.debugLineNum = 117;BA.debugLine="usrString = raf.ReadEncryptedObject(ProgramData.r";
_usrstring = BA.ObjectToString(_raf.ReadEncryptedObject(BA.NumberToString(_programdata._rafencpass),_raf.CurrentPosition));
 //BA.debugLineNum = 118;BA.debugLine="passString = raf.ReadEncryptedObject(ProgramData.";
_passstring = BA.ObjectToString(_raf.ReadEncryptedObject(BA.NumberToString(_programdata._rafencpass),_raf.CurrentPosition));
 //BA.debugLineNum = 120;BA.debugLine="ProgramData.strUser = usrString";
_programdata._struser = _usrstring;
 //BA.debugLineNum = 121;BA.debugLine="ProgramData.strPass = passString";
_programdata._strpass = _passstring;
 //BA.debugLineNum = 122;BA.debugLine="raf.Close";
_raf.Close();
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public String  _start_up() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Private Sub start_up";
 //BA.debugLineNum = 13;BA.debugLine="If File.Exists(File.DirDefaultExternal , \"users.c";
if (__c.File.Exists(__c.File.getDirDefaultExternal(),"users.config")==__c.True && __c.File.Size(__c.File.getDirDefaultExternal(),"users.config")>0) { 
 //BA.debugLineNum = 14;BA.debugLine="checkloginPanel.Checked = True";
_checkloginpanel.setChecked(__c.True);
 };
 //BA.debugLineNum = 17;BA.debugLine="If checkloginPanel.Checked Then";
if (_checkloginpanel.getChecked()) { 
 //BA.debugLineNum = 18;BA.debugLine="Read_SavedUsrs";
_read_savedusrs();
 //BA.debugLineNum = 19;BA.debugLine="user.Text = usrString";
_user.setText(BA.ObjectToCharSequence(_usrstring));
 //BA.debugLineNum = 20;BA.debugLine="pass.Text = passString";
_pass.setText(BA.ObjectToCharSequence(_passstring));
 }else {
 //BA.debugLineNum = 22;BA.debugLine="user.Text = \"\"";
_user.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 23;BA.debugLine="pass.Text = \"\"";
_pass.setText(BA.ObjectToCharSequence(""));
 };
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _write_usrs() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Private Sub write_Usrs";
 //BA.debugLineNum = 108;BA.debugLine="raf.Initialize(File.DirDefaultExternal, \"users.co";
_raf.Initialize(__c.File.getDirDefaultExternal(),"users.config",__c.False);
 //BA.debugLineNum = 109;BA.debugLine="raf.WriteEncryptedObject(usrString, ProgramData.r";
_raf.WriteEncryptedObject((Object)(_usrstring),BA.NumberToString(_programdata._rafencpass),_raf.CurrentPosition);
 //BA.debugLineNum = 110;BA.debugLine="raf.WriteEncryptedObject(passString, ProgramData.";
_raf.WriteEncryptedObject((Object)(_passstring),BA.NumberToString(_programdata._rafencpass),_raf.CurrentPosition);
 //BA.debugLineNum = 111;BA.debugLine="raf.Close";
_raf.Close();
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
