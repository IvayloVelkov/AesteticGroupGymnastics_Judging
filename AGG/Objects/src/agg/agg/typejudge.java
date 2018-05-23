package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class typejudge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "agg.agg.typejudge");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", agg.agg.typejudge.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _typepanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnav = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntv = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnexe = null;
public int _padding = 0;
public agg.agg.main _main = null;
public agg.agg.starter _starter = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public agg.agg.helperfunctions _helperfunctions = null;
public String  _initialize(agg.agg.typejudge __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="typePanel.Initialize(\"\")";
__ref._typepanel.Initialize(ba,"");
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="btnAv.Initialize(\"AVtypeBtn\")";
__ref._btnav.Initialize(ba,"AVtypeBtn");
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="btnTv.Initialize(\"TVtypeBtn\")";
__ref._btntv.Initialize(ba,"TVtypeBtn");
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="btnExe.Initialize(\"EXEtypeBtn\")";
__ref._btnexe.Initialize(ba,"EXEtypeBtn");
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="Padding = UISizes.DefaultPadding";
__ref._padding = _uisizes._defaultpadding;
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="typePanel.AddView(btnAv,35%x, 20%y, 30%x, 10%y)";
__ref._typepanel.AddView((android.view.View)(__ref._btnav.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="typePanel.AddView(btnTv, 35%x, btnAv.Top+btnAv.He";
__ref._typepanel.AddView((android.view.View)(__ref._btntv.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (__ref._btnav.getTop()+__ref._btnav.getHeight()*1.5+__ref._padding),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="typePanel.AddView(btnExe, 35%x, btnTv.Top+btnTv.H";
__ref._typepanel.AddView((android.view.View)(__ref._btnexe.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (__ref._btntv.getTop()+__ref._btntv.getHeight()*1.5+__ref._padding),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnAv,Colors.Blac";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnav.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="btnAv.Text = Main.translate.GetString(\"AVbtn\")";
__ref._btnav.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVbtn")));
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="btnAv.Padding = Array As Int(15,0,0,0)";
__ref._btnav.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=4915217;
 //BA.debugLineNum = 4915217;BA.debugLine="btnAv.TextSize = 14";
__ref._btnav.setTextSize((float) (14));
RDebugUtils.currentLine=4915219;
 //BA.debugLineNum = 4915219;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnTv,Colors.Blac";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btntv.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=4915220;
 //BA.debugLineNum = 4915220;BA.debugLine="btnTv.Text = Main.translate.GetString(\"TVbtn\")";
__ref._btntv.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"TVbtn")));
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="btnTv.Padding = Array As Int(15,0,0,0)";
__ref._btntv.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=4915222;
 //BA.debugLineNum = 4915222;BA.debugLine="btnTv.TextSize = 14";
__ref._btntv.setTextSize((float) (14));
RDebugUtils.currentLine=4915224;
 //BA.debugLineNum = 4915224;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnExe,Colors.Bla";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnexe.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=4915225;
 //BA.debugLineNum = 4915225;BA.debugLine="btnExe.Text = Main.translate.GetString(\"EXEbtn\")";
__ref._btnexe.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"EXEbtn")));
RDebugUtils.currentLine=4915226;
 //BA.debugLineNum = 4915226;BA.debugLine="btnExe.Padding = Array As Int(15,0,0,0)";
__ref._btnexe.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=4915227;
 //BA.debugLineNum = 4915227;BA.debugLine="btnExe.TextSize = 14";
__ref._btnexe.setTextSize((float) (14));
RDebugUtils.currentLine=4915228;
 //BA.debugLineNum = 4915228;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(agg.agg.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return typePanel";
if (true) return __ref._typepanel;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return null;
}
public String  _avtypebtn_click(agg.agg.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "avtypebtn_click"))
	return (String) Debug.delegate(ba, "avtypebtn_click", null);
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub AVtypeBtn_Click";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="CallSub(Main, \"AV_Click\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"AV_Click");
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Public typePanel As Panel";
_typepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Private btnAv As Button";
_btnav = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Private btnTv As Button";
_btntv = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Private btnExe As Button";
_btnexe = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="Private Padding As Int";
_padding = 0;
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="End Sub";
return "";
}
public String  _exetypebtn_click(agg.agg.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "exetypebtn_click"))
	return (String) Debug.delegate(ba, "exetypebtn_click", null);
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub EXEtypeBtn_Click";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="CallSub(Main, \"EXE_Click\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"EXE_Click");
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return "";
}
public String  _tvtypebtn_click(agg.agg.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "tvtypebtn_click"))
	return (String) Debug.delegate(ba, "tvtypebtn_click", null);
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub TVtypeBtn_Click";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="CallSub(Main, \"TV_Click\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"TV_Click");
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
}