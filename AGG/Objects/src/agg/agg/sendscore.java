package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sendscore extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "agg.agg.sendscore");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", agg.agg.sendscore.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _finalpanel = null;
public anywheresoftware.b4a.objects.EditTextWrapper _teamname = null;
public anywheresoftware.b4a.objects.LabelWrapper _teamscore = null;
public anywheresoftware.b4a.objects.ButtonWrapper _sendbtn = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub asView As Panel";
 //BA.debugLineNum = 36;BA.debugLine="Return finalPanel";
if (true) return _finalpanel;
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public finalPanel As Panel";
_finalpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Public teamname As EditText";
_teamname = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Public teamscore As Label";
_teamscore = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Public SendBtn As Button";
_sendbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _finalscore() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub finalScore";
 //BA.debugLineNum = 30;BA.debugLine="teamscore.Text = Main.translate.GetString(\"Score\"";
_teamscore.setText(BA.ObjectToCharSequence(_main._translate._getstring("Score")+": "+BA.ObjectToString(__c.CallSubNew(ba,(Object)(_main.getObject()),"finalScore"))));
 //BA.debugLineNum = 32;BA.debugLine="Log(\"FINAL\"&teamscore.Text)";
__c.Log("FINAL"+_teamscore.getText());
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _getteamname() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub getTeamname";
 //BA.debugLineNum = 49;BA.debugLine="HelperFunctions.TeamName = teamname.Text";
_helperfunctions._teamname = _teamname.getText();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="finalPanel.Initialize(\"\")";
_finalpanel.Initialize(ba,"");
 //BA.debugLineNum = 11;BA.debugLine="teamname.Initialize(\"\")";
_teamname.Initialize(ba,"");
 //BA.debugLineNum = 12;BA.debugLine="teamscore.Initialize(\"\")";
_teamscore.Initialize(ba,"");
 //BA.debugLineNum = 13;BA.debugLine="SendBtn.Initialize(\"send\")";
_sendbtn.Initialize(ba,"send");
 //BA.debugLineNum = 15;BA.debugLine="finalPanel.AddView(teamname, 20%x, 10%y, 60%x, 10";
_finalpanel.AddView((android.view.View)(_teamname.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 16;BA.debugLine="teamname.Hint = Main.translate.GetString(\"TeamNam";
_teamname.setHint(_main._translate._getstring("TeamName"));
 //BA.debugLineNum = 17;BA.debugLine="teamname.SingleLine = True";
_teamname.setSingleLine(__c.True);
 //BA.debugLineNum = 19;BA.debugLine="finalPanel.AddView(teamscore, 20%x, 35%y, 60%x, 1";
_finalpanel.AddView((android.view.View)(_teamscore.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (35),ba),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 20;BA.debugLine="teamscore.Gravity = Gravity.CENTER";
_teamscore.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 22;BA.debugLine="finalPanel.AddView(SendBtn, 20%x, 55%y, 60%x, 10%";
_finalpanel.AddView((android.view.View)(_sendbtn.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (55),ba),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 23;BA.debugLine="SendBtn.Text = Main.translate.GetString(\"SendBtn\"";
_sendbtn.setText(BA.ObjectToCharSequence(_main._translate._getstring("SendBtn")));
 //BA.debugLineNum = 24;BA.debugLine="HelperFunctions.Apply_ViewStyle(SendBtn,Colors.Wh";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_sendbtn.getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
 //BA.debugLineNum = 25;BA.debugLine="SendBtn.Padding = Array As Int(15,0,0,0)";
_sendbtn.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 26;BA.debugLine="SendBtn.SingleLine = True";
_sendbtn.setSingleLine(__c.True);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _send_click() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Private Sub send_Click";
 //BA.debugLineNum = 40;BA.debugLine="If teamname.Text = \"\" Then";
if ((_teamname.getText()).equals("")) { 
 //BA.debugLineNum = 41;BA.debugLine="Msgbox(\"Добавате име на отбора.\",\"Липсва име.\")";
__c.Msgbox(BA.ObjectToCharSequence("Добавате име на отбора."),BA.ObjectToCharSequence("Липсва име."),ba);
 }else {
 //BA.debugLineNum = 43;BA.debugLine="getTeamname";
_getteamname();
 //BA.debugLineNum = 44;BA.debugLine="CallSub(Main, \"connect\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"connect");
 };
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "FINALSCORE"))
	return _finalscore();
return BA.SubDelegator.SubNotFound;
}
}
