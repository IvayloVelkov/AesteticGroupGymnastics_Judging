package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class typejudge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "agg.agg.typejudge");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _typepanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnav = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntv = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnexe = null;
public int _padding = 0;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub asView As Panel";
 //BA.debugLineNum = 43;BA.debugLine="Return typePanel";
if (true) return _typepanel;
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public String  _avtypebtn_click() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Private Sub AVtypeBtn_Click";
 //BA.debugLineNum = 47;BA.debugLine="CallSub(Main, \"AV_Click\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"AV_Click");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public typePanel As Panel";
_typepanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private btnAv As Button";
_btnav = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private btnTv As Button";
_btntv = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private btnExe As Button";
_btnexe = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private Padding As Int";
_padding = 0;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _exetypebtn_click() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Private Sub EXEtypeBtn_Click";
 //BA.debugLineNum = 55;BA.debugLine="CallSub(Main, \"EXE_Click\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"EXE_Click");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 13;BA.debugLine="typePanel.Initialize(\"\")";
_typepanel.Initialize(ba,"");
 //BA.debugLineNum = 14;BA.debugLine="btnAv.Initialize(\"AVtypeBtn\")";
_btnav.Initialize(ba,"AVtypeBtn");
 //BA.debugLineNum = 15;BA.debugLine="btnTv.Initialize(\"TVtypeBtn\")";
_btntv.Initialize(ba,"TVtypeBtn");
 //BA.debugLineNum = 16;BA.debugLine="btnExe.Initialize(\"EXEtypeBtn\")";
_btnexe.Initialize(ba,"EXEtypeBtn");
 //BA.debugLineNum = 18;BA.debugLine="Padding = UISizes.DefaultPadding";
_padding = _uisizes._defaultpadding;
 //BA.debugLineNum = 22;BA.debugLine="typePanel.AddView(btnAv,35%x, 20%y, 30%x, 10%y)";
_typepanel.AddView((android.view.View)(_btnav.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 23;BA.debugLine="typePanel.AddView(btnTv, 35%x, btnAv.Top+btnAv.He";
_typepanel.AddView((android.view.View)(_btntv.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (_btnav.getTop()+_btnav.getHeight()*1.5+_padding),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 24;BA.debugLine="typePanel.AddView(btnExe, 35%x, btnTv.Top+btnTv.H";
_typepanel.AddView((android.view.View)(_btnexe.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (_btntv.getTop()+_btntv.getHeight()*1.5+_padding),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 26;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnAv,Colors.Whit";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnav.getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
 //BA.debugLineNum = 27;BA.debugLine="btnAv.Text = Main.translate.GetString(\"AVbtn\")";
_btnav.setText(BA.ObjectToCharSequence(_main._translate._getstring("AVbtn")));
 //BA.debugLineNum = 28;BA.debugLine="btnAv.Padding = Array As Int(15,0,0,0)";
_btnav.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 29;BA.debugLine="btnAv.TextSize = 14";
_btnav.setTextSize((float) (14));
 //BA.debugLineNum = 31;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnTv,Colors.Whit";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btntv.getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
 //BA.debugLineNum = 32;BA.debugLine="btnTv.Text = Main.translate.GetString(\"TVbtn\")";
_btntv.setText(BA.ObjectToCharSequence(_main._translate._getstring("TVbtn")));
 //BA.debugLineNum = 33;BA.debugLine="btnTv.Padding = Array As Int(15,0,0,0)";
_btntv.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 34;BA.debugLine="btnTv.TextSize = 14";
_btntv.setTextSize((float) (14));
 //BA.debugLineNum = 36;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnExe,Colors.Whi";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnexe.getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
 //BA.debugLineNum = 37;BA.debugLine="btnExe.Text = Main.translate.GetString(\"EXEbtn\")";
_btnexe.setText(BA.ObjectToCharSequence(_main._translate._getstring("EXEbtn")));
 //BA.debugLineNum = 38;BA.debugLine="btnExe.Padding = Array As Int(15,0,0,0)";
_btnexe.setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 39;BA.debugLine="btnExe.TextSize = 14";
_btnexe.setTextSize((float) (14));
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _tvtypebtn_click() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Private Sub TVtypeBtn_Click";
 //BA.debugLineNum = 51;BA.debugLine="CallSub(Main, \"TV_Click\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"TV_Click");
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
