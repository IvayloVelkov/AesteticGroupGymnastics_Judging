package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class typejudge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.typejudge");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.typejudge.class).invoke(this, new Object[] {null});
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
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public String  _initialize(b4a.example.typejudge __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="typePanel.Initialize(\"\")";
__ref._typepanel.Initialize(ba,"");
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="btnAv.Initialize(\"AVtypeBtn\")";
__ref._btnav.Initialize(ba,"AVtypeBtn");
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="btnTv.Initialize(\"TVtypeBtn\")";
__ref._btntv.Initialize(ba,"TVtypeBtn");
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="btnExe.Initialize(\"EXEtypeBtn\")";
__ref._btnexe.Initialize(ba,"EXEtypeBtn");
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Padding = UISizes.DefaultPadding";
__ref._padding = _uisizes._defaultpadding;
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="typePanel.AddView(btnAv,35%x, 20%y, 30%x, 10%y)";
__ref._typepanel.AddView((android.view.View)(__ref._btnav.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="typePanel.AddView(btnTv, 35%x, btnAv.Top+btnAv.He";
__ref._typepanel.AddView((android.view.View)(__ref._btntv.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (__ref._btnav.getTop()+__ref._btnav.getHeight()*1.5+__ref._padding),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="typePanel.AddView(btnExe, 35%x, btnTv.Top+btnTv.H";
__ref._typepanel.AddView((android.view.View)(__ref._btnexe.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (__ref._btntv.getTop()+__ref._btntv.getHeight()*1.5+__ref._padding),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1703950;
 //BA.debugLineNum = 1703950;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnAv,Colors.Blac";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnav.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="btnAv.Text = Main.translate.GetString(\"AVbtn\")";
__ref._btnav.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVbtn")));
RDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="btnAv.Padding = Array As Int(15,0,0,0)";
__ref._btnav.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=1703953;
 //BA.debugLineNum = 1703953;BA.debugLine="btnAv.TextSize = 14";
__ref._btnav.setTextSize((float) (14));
RDebugUtils.currentLine=1703955;
 //BA.debugLineNum = 1703955;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnTv,Colors.Blac";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btntv.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=1703956;
 //BA.debugLineNum = 1703956;BA.debugLine="btnTv.Text = Main.translate.GetString(\"TVbtn\")";
__ref._btntv.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"TVbtn")));
RDebugUtils.currentLine=1703957;
 //BA.debugLineNum = 1703957;BA.debugLine="btnTv.Padding = Array As Int(15,0,0,0)";
__ref._btntv.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=1703958;
 //BA.debugLineNum = 1703958;BA.debugLine="btnTv.TextSize = 14";
__ref._btntv.setTextSize((float) (14));
RDebugUtils.currentLine=1703960;
 //BA.debugLineNum = 1703960;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnExe,Colors.Bla";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnexe.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (60));
RDebugUtils.currentLine=1703961;
 //BA.debugLineNum = 1703961;BA.debugLine="btnExe.Text = Main.translate.GetString(\"EXEbtn\")";
__ref._btnexe.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"EXEbtn")));
RDebugUtils.currentLine=1703962;
 //BA.debugLineNum = 1703962;BA.debugLine="btnExe.Padding = Array As Int(15,0,0,0)";
__ref._btnexe.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=1703963;
 //BA.debugLineNum = 1703963;BA.debugLine="btnExe.TextSize = 14";
__ref._btnexe.setTextSize((float) (14));
RDebugUtils.currentLine=1703964;
 //BA.debugLineNum = 1703964;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Return typePanel";
if (true) return __ref._typepanel;
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return null;
}
public String  _avtypebtn_click(b4a.example.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "avtypebtn_click"))
	return (String) Debug.delegate(ba, "avtypebtn_click", null);
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub AVtypeBtn_Click";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="CallSub(Main, \"AV_Click\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"AV_Click");
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Public typePanel As Panel";
_typepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Private btnAv As Button";
_btnav = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Private btnTv As Button";
_btntv = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Private btnExe As Button";
_btnexe = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Private Padding As Int";
_padding = 0;
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="End Sub";
return "";
}
public String  _exetypebtn_click(b4a.example.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "exetypebtn_click"))
	return (String) Debug.delegate(ba, "exetypebtn_click", null);
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub EXEtypeBtn_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="CallSub(Main, \"EXE_Click\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"EXE_Click");
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public String  _tvtypebtn_click(b4a.example.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "tvtypebtn_click"))
	return (String) Debug.delegate(ba, "tvtypebtn_click", null);
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub TVtypeBtn_Click";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="CallSub(Main, \"TV_Click\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"TV_Click");
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
}