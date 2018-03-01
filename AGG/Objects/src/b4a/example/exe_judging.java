package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class exe_judging extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.exe_judging");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.exe_judging.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _exepanel = null;
public de.amberhome.viewpager.AHViewPager _pager = null;
public de.amberhome.viewpager.AHPageContainer _container = null;
public anywheresoftware.b4a.objects.PanelWrapper[] _page = null;
public anywheresoftware.b4a.objects.LabelWrapper[] _label = null;
public de.amberhome.viewpager.AHViewPagerTabs _tabs = null;
public anywheresoftware.b4a.objects.PanelWrapper _line = null;
public anywheresoftware.b4a.objects.PanelWrapper _line2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _downpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnready = null;
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public String  _initialize(b4a.example.exe_judging __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
int _i = 0;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="exePanel.Initialize(\"\")";
__ref._exepanel.Initialize(ba,"");
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="page(i).Initialize(\"\")";
__ref._page[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="For i = 0 To 34";
{
final int step5 = 1;
final int limit5 = (int) (34);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="label(i).Initialize(\"\")";
__ref._label[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="downPanel.Initialize(\"\")";
__ref._downpanel.Initialize(ba,"");
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="btnready.Initialize(\"ready\")";
__ref._btnready.Initialize(ba,"ready");
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Return exePanel";
if (true) return __ref._exepanel;
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="End Sub";
return null;
}
public String  _buildui(b4a.example.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub BuildUi";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Container.Initialize";
__ref._container.Initialize(ba);
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (0)].getObject()),_main._translate._getstring(null,"AvPage0"));
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (1)].getObject()),_main._translate._getstring(null,"AvPage1"));
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="Container.AddPage(page(2), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (2)].getObject()),_main._translate._getstring(null,"AvPage2"));
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Container.AddPage(page(3), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (3)].getObject()),_main._translate._getstring(null,"AvPage3"));
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
__ref._pager.Initialize(ba,__ref._container,"MPager");
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="Tabs.Initialize(Pager)";
__ref._tabs.Initialize(ba,__ref._pager);
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="Tabs.LineHeight = 5dip";
__ref._tabs.setLineHeight(__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
__ref._tabs.setLineColorCenter(__c.Colors.Red);
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="Tabs.TextColor = Colors.Gray";
__ref._tabs.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
__ref._tabs.setTextColorCenter(__c.Colors.Yellow);
RDebugUtils.currentLine=7340048;
 //BA.debugLineNum = 7340048;BA.debugLine="exePanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
__ref._exepanel.AddView((android.view.View)(__ref._tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=7340051;
 //BA.debugLineNum = 7340051;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=7340053;
 //BA.debugLineNum = 7340053;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
RDebugUtils.currentLine=7340055;
 //BA.debugLineNum = 7340055;BA.debugLine="Line.Initialize(\"\")";
__ref._line.Initialize(ba,"");
RDebugUtils.currentLine=7340056;
 //BA.debugLineNum = 7340056;BA.debugLine="Line.Background = Col";
__ref._line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=7340058;
 //BA.debugLineNum = 7340058;BA.debugLine="Line2.Initialize(\"\")";
__ref._line2.Initialize(ba,"");
RDebugUtils.currentLine=7340059;
 //BA.debugLineNum = 7340059;BA.debugLine="Line2.Background = Col";
__ref._line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=7340061;
 //BA.debugLineNum = 7340061;BA.debugLine="exePanel.AddView(Line, 0dip, 35dip, exePanel.Widt";
__ref._exepanel.AddView((android.view.View)(__ref._line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__ref._exepanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=7340064;
 //BA.debugLineNum = 7340064;BA.debugLine="exePanel.AddView(Pager, 0dip, 35dip + 2dip, exePa";
__ref._exepanel.AddView((android.view.View)(__ref._pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),__ref._exepanel.getWidth(),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=7340066;
 //BA.debugLineNum = 7340066;BA.debugLine="exePanel.AddView(downPanel, 0, exePanel.Height -";
__ref._exepanel.AddView((android.view.View)(__ref._downpanel.getObject()),(int) (0),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))),__ref._exepanel.getWidth(),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=7340067;
 //BA.debugLineNum = 7340067;BA.debugLine="exePanel.AddView(Line2, 0dip, exePanel.Height - (";
__ref._exepanel.AddView((android.view.View)(__ref._line2.getObject()),__c.DipToCurrent((int) (0)),(int) (__ref._exepanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),__ref._exepanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=7340069;
 //BA.debugLineNum = 7340069;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
__ref._downpanel.AddView((android.view.View)(__ref._btnready.getObject()),(int) (__ref._downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
RDebugUtils.currentLine=7340072;
 //BA.debugLineNum = 7340072;BA.debugLine="page(0).AddView(label(0), 0, 11%y, 50%x, 15%y)";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[(int) (0)].getObject()),(int) (0),__c.PerYToCurrent((float) (11),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=7340073;
 //BA.debugLineNum = 7340073;BA.debugLine="label(0).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal1")));
RDebugUtils.currentLine=7340074;
 //BA.debugLineNum = 7340074;BA.debugLine="label(0).TextColor = Colors.White";
__ref._label[(int) (0)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7340076;
 //BA.debugLineNum = 7340076;BA.debugLine="page(1).AddView(label(1), 0, 11%y, 50%x, 15%y)";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[(int) (1)].getObject()),(int) (0),__c.PerYToCurrent((float) (11),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=7340077;
 //BA.debugLineNum = 7340077;BA.debugLine="label(1).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (1)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal1")));
RDebugUtils.currentLine=7340078;
 //BA.debugLineNum = 7340078;BA.debugLine="label(1).TextColor = Colors.White";
__ref._label[(int) (1)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7340080;
 //BA.debugLineNum = 7340080;BA.debugLine="page(2).AddView(label(2), 0, 11%y, 50%x, 15%y)";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._label[(int) (2)].getObject()),(int) (0),__c.PerYToCurrent((float) (11),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=7340081;
 //BA.debugLineNum = 7340081;BA.debugLine="label(2).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (2)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal1")));
RDebugUtils.currentLine=7340082;
 //BA.debugLineNum = 7340082;BA.debugLine="label(2).TextColor = Colors.White";
__ref._label[(int) (2)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7340084;
 //BA.debugLineNum = 7340084;BA.debugLine="page(3).AddView(label(3), 0, 11%y, 50%x, 15%y)";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._label[(int) (3)].getObject()),(int) (0),__c.PerYToCurrent((float) (11),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=7340085;
 //BA.debugLineNum = 7340085;BA.debugLine="label(3).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (3)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal1")));
RDebugUtils.currentLine=7340086;
 //BA.debugLineNum = 7340086;BA.debugLine="label(3).TextColor = Colors.White";
__ref._label[(int) (3)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7340088;
 //BA.debugLineNum = 7340088;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Public exePanel As Panel";
_exepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="Private page(4) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (4)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="Private label(35) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (35)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="End Sub";
return "";
}
public String  _ready_click(b4a.example.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "ready_click"))
	return (String) Debug.delegate(ba, "ready_click", null);
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub ready_Click";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"FinalClick");
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return "";
}
}