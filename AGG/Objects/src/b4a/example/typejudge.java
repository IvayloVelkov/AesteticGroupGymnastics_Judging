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
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="typePanel.Initialize(\"\")";
__ref._typepanel.Initialize(ba,"");
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="btnAv.Initialize(\"AVtypeBtn\")";
__ref._btnav.Initialize(ba,"AVtypeBtn");
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="btnTv.Initialize(\"TVtypeBtn\")";
__ref._btntv.Initialize(ba,"TVtypeBtn");
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="btnExe.Initialize(\"EXEtypeBtn\")";
__ref._btnexe.Initialize(ba,"EXEtypeBtn");
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Return typePanel";
if (true) return __ref._typepanel;
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.typejudge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="typejudge";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Public typePanel As Panel";
_typepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Private btnAv As Button";
_btnav = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Private btnTv As Button";
_btntv = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Private btnExe As Button";
_btnexe = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="End Sub";
return "";
}
}