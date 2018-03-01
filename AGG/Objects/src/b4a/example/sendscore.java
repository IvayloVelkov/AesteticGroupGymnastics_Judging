package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sendscore extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.sendscore");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.sendscore.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _finalpanel = null;
public anywheresoftware.b4a.objects.EditTextWrapper _teamname = null;
public anywheresoftware.b4a.objects.LabelWrapper _teamscore = null;
public double _score = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _sendbtn = null;
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public String  _initialize(b4a.example.sendscore __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sendscore";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="finalPanel.Initialize(\"\")";
__ref._finalpanel.Initialize(ba,"");
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="teamname.Initialize(\"\")";
__ref._teamname.Initialize(ba,"");
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="teamscore.Initialize(\"\")";
__ref._teamscore.Initialize(ba,"");
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="SendBtn.Initialize(\"send\")";
__ref._sendbtn.Initialize(ba,"send");
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="finalPanel.AddView(teamname, 20%x, 10%y, 60%x, 10";
__ref._finalpanel.AddView((android.view.View)(__ref._teamname.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="teamname.Hint = \"Team Name\"";
__ref._teamname.setHint("Team Name");
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="teamname.SingleLine = True";
__ref._teamname.setSingleLine(__c.True);
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="finalPanel.AddView(teamscore, 20%x, 35%y, 60%x, 1";
__ref._finalpanel.AddView((android.view.View)(__ref._teamscore.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (35),ba),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="teamscore.Text = \"0.00\"";
__ref._teamscore.setText(BA.ObjectToCharSequence("0.00"));
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="teamscore.Gravity = Gravity.CENTER";
__ref._teamscore.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="finalPanel.AddView(SendBtn, 20%x, 55%y, 60%x, 10%";
__ref._finalpanel.AddView((android.view.View)(__ref._sendbtn.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (55),ba),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="SendBtn.Text = \"Send\"";
__ref._sendbtn.setText(BA.ObjectToCharSequence("Send"));
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="SendBtn.Gravity = Gravity.CENTER";
__ref._sendbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.sendscore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sendscore";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return finalPanel";
if (true) return __ref._finalpanel;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.sendscore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sendscore";
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Public finalPanel As Panel";
_finalpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Private teamname As EditText";
_teamname = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Private teamscore As Label";
_teamscore = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Private score As Double";
_score = 0;
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Private SendBtn As Button";
_sendbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="End Sub";
return "";
}
public String  _send_click(b4a.example.sendscore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sendscore";
if (Debug.shouldDelegate(ba, "send_click"))
	return (String) Debug.delegate(ba, "send_click", null);
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub send_Click";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
}