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
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="typePanel.Initialize(\"\")";
__ref._typepanel.Initialize(ba,"");
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="btnAv.Initialize(\"AVtypeBtn\")";
__ref._btnav.Initialize(ba,"AVtypeBtn");
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="btnTv.Initialize(\"TVtypeBtn\")";
__ref._btntv.Initialize(ba,"TVtypeBtn");
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="btnExe.Initialize(\"EXEtypeBtn\")";
__ref._btnexe.Initialize(ba,"EXEtypeBtn");
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="Padding = UISizes.DefaultPadding";
__ref._padding = _uisizes._defaultpadding;
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="typePanel.AddView(btnAv,35%x, 20%y, 30%x, 10%y)";
__ref._typepanel.AddView((android.view.View)(__ref._btnav.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="typePanel.AddView(btnTv, 35%x, btnAv.Top+btnAv.He";
__ref._typepanel.AddView((android.view.View)(__ref._btntv.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (__ref._btnav.getTop()+__ref._btnav.getHeight()*1.5+__ref._padding),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="typePanel.AddView(btnExe, 35%x, btnTv.Top+btnTv.H";
__ref._typepanel.AddView((android.view.View)(__ref._btnexe.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (__ref._btntv.getTop()+__ref._btntv.getHeight()*1.5+__ref._padding),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnAv,Colors.Blac";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnav.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=5177359;
 //BA.debugLineNum = 5177359;BA.debugLine="btnAv.Text = Main.translate.GetString(\"AVbtn\")";
__ref._btnav.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVbtn")));
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="btnAv.Padding = Array As Int(15,0,0,0)";
__ref._btnav.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="btnAv.TextSize = 14";
__ref._btnav.setTextSize((float) (14));
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnTv,Colors.Blac";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btntv.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="btnTv.Text = Main.translate.GetString(\"TVbtn\")";
__ref._btntv.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"TVbtn")));
RDebugUtils.currentLine=5177365;
 //BA.debugLineNum = 5177365;BA.debugLine="btnTv.Padding = Array As Int(15,0,0,0)";
__ref._btntv.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="btnTv.TextSize = 14";
__ref._btntv.setTextSize((float) (14));
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnExe,Colors.Bla";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnexe.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=5177369;
 //BA.debugLineNum = 5177369;BA.debugLine="btnExe.Text = Main.translate.GetString(\"EXEbtn\")";
__ref._btnexe.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"EXEbtn")));
RDebugUtils.currentLine=5177370;
 //BA.debugLineNum = 5177370;BA.debugLine="btnExe.Padding = Array As Int(15,0,0,0)";
__ref._btnexe.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=5177371;
 //BA.debugLineNum = 5177371;BA.debugLine="btnExe.TextSize = 14";
__ref._btnexe.setTextSize((float) (14));
RDebugUtils.currentLine=5177372;
 //BA.debugLineNum = 5177372;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(agg.agg.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Return typePanel";
if (true) return __ref._typepanel;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return null;
}
public String  _avtypebtn_click(agg.agg.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "avtypebtn_click"))
	return (String) Debug.delegate(ba, "avtypebtn_click", null);
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Private Sub AVtypeBtn_Click";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="CallSub(Main, \"AV_Click\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"AV_Click");
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Public typePanel As Panel";
_typepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Private btnAv As Button";
_btnav = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="Private btnTv As Button";
_btntv = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Private btnExe As Button";
_btnexe = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="Private Padding As Int";
_padding = 0;
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="End Sub";
return "";
}
public String  _exetypebtn_click(agg.agg.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "exetypebtn_click"))
	return (String) Debug.delegate(ba, "exetypebtn_click", null);
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub EXEtypeBtn_Click";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="CallSub(Main, \"EXE_Click\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"EXE_Click");
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return "";
}
public String  _tvtypebtn_click(agg.agg.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "tvtypebtn_click"))
	return (String) Debug.delegate(ba, "tvtypebtn_click", null);
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub TVtypeBtn_Click";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="CallSub(Main, \"TV_Click\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"TV_Click");
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
}