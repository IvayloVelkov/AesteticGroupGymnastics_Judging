package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tv_judge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.tv_judge");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.tv_judge.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _tvpanel = null;
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
public String  _initialize(b4a.example.tv_judge __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="tv_judge";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
int _i = 0;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="tvPanel.Initialize(\"\")";
__ref._tvpanel.Initialize(ba,"");
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="page(i).Initialize(\"\")";
__ref._page[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="For i = 0 To 34";
{
final int step5 = 1;
final int limit5 = (int) (34);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="label(i).Initialize(\"\")";
__ref._label[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="downPanel.Initialize(\"\")";
__ref._downpanel.Initialize(ba,"");
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="btnready.Initialize(\"ready\")";
__ref._btnready.Initialize(ba,"ready");
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.tv_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tv_judge";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Return tvPanel";
if (true) return __ref._tvpanel;
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return null;
}
public String  _buildui(b4a.example.tv_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tv_judge";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub BuildUi";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Container.Initialize";
__ref._container.Initialize(ba);
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (0)].getObject()),_main._translate._getstring(null,"AvPage0"));
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (1)].getObject()),_main._translate._getstring(null,"AvPage1"));
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Container.AddPage(page(2), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (2)].getObject()),_main._translate._getstring(null,"AvPage2"));
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="Container.AddPage(page(3), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (3)].getObject()),_main._translate._getstring(null,"AvPage3"));
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
__ref._pager.Initialize(ba,__ref._container,"MPager");
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="Tabs.Initialize(Pager)";
__ref._tabs.Initialize(ba,__ref._pager);
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="Tabs.LineHeight = 5dip";
__ref._tabs.setLineHeight(__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
__ref._tabs.setLineColorCenter(__c.Colors.Red);
RDebugUtils.currentLine=7012365;
 //BA.debugLineNum = 7012365;BA.debugLine="Tabs.TextColor = Colors.Gray";
__ref._tabs.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=7012366;
 //BA.debugLineNum = 7012366;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
__ref._tabs.setTextColorCenter(__c.Colors.Yellow);
RDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="tvPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
__ref._tvpanel.AddView((android.view.View)(__ref._tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=7012371;
 //BA.debugLineNum = 7012371;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=7012373;
 //BA.debugLineNum = 7012373;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
RDebugUtils.currentLine=7012375;
 //BA.debugLineNum = 7012375;BA.debugLine="Line.Initialize(\"\")";
__ref._line.Initialize(ba,"");
RDebugUtils.currentLine=7012376;
 //BA.debugLineNum = 7012376;BA.debugLine="Line.Background = Col";
__ref._line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=7012378;
 //BA.debugLineNum = 7012378;BA.debugLine="Line2.Initialize(\"\")";
__ref._line2.Initialize(ba,"");
RDebugUtils.currentLine=7012379;
 //BA.debugLineNum = 7012379;BA.debugLine="Line2.Background = Col";
__ref._line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=7012381;
 //BA.debugLineNum = 7012381;BA.debugLine="tvPanel.AddView(Line, 0dip, 35dip, tvPanel.Width,";
__ref._tvpanel.AddView((android.view.View)(__ref._line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__ref._tvpanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=7012384;
 //BA.debugLineNum = 7012384;BA.debugLine="tvPanel.AddView(Pager, 0dip, 35dip + 2dip, tvPane";
__ref._tvpanel.AddView((android.view.View)(__ref._pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),__ref._tvpanel.getWidth(),(int) (__ref._tvpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=7012386;
 //BA.debugLineNum = 7012386;BA.debugLine="tvPanel.AddView(downPanel, 0, tvPanel.Height - 35";
__ref._tvpanel.AddView((android.view.View)(__ref._downpanel.getObject()),(int) (0),(int) (__ref._tvpanel.getHeight()-__c.DipToCurrent((int) (35))),__ref._tvpanel.getWidth(),(int) (__ref._tvpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=7012387;
 //BA.debugLineNum = 7012387;BA.debugLine="tvPanel.AddView(Line2, 0dip, tvPanel.Height - (35";
__ref._tvpanel.AddView((android.view.View)(__ref._line2.getObject()),__c.DipToCurrent((int) (0)),(int) (__ref._tvpanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),__ref._tvpanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=7012389;
 //BA.debugLineNum = 7012389;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
__ref._downpanel.AddView((android.view.View)(__ref._btnready.getObject()),(int) (__ref._downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
RDebugUtils.currentLine=7012392;
 //BA.debugLineNum = 7012392;BA.debugLine="page(0).AddView(label(0), 0, 11%y, 50%x, 15%y)";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[(int) (0)].getObject()),(int) (0),__c.PerYToCurrent((float) (11),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=7012393;
 //BA.debugLineNum = 7012393;BA.debugLine="label(0).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal1")));
RDebugUtils.currentLine=7012394;
 //BA.debugLineNum = 7012394;BA.debugLine="label(0).TextColor = Colors.White";
__ref._label[(int) (0)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7012396;
 //BA.debugLineNum = 7012396;BA.debugLine="page(1).AddView(label(1), 0, 11%y, 50%x, 15%y)";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[(int) (1)].getObject()),(int) (0),__c.PerYToCurrent((float) (11),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=7012397;
 //BA.debugLineNum = 7012397;BA.debugLine="label(1).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (1)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal1")));
RDebugUtils.currentLine=7012398;
 //BA.debugLineNum = 7012398;BA.debugLine="label(1).TextColor = Colors.White";
__ref._label[(int) (1)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7012400;
 //BA.debugLineNum = 7012400;BA.debugLine="page(2).AddView(label(2), 0, 11%y, 50%x, 15%y)";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._label[(int) (2)].getObject()),(int) (0),__c.PerYToCurrent((float) (11),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=7012401;
 //BA.debugLineNum = 7012401;BA.debugLine="label(2).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (2)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal1")));
RDebugUtils.currentLine=7012402;
 //BA.debugLineNum = 7012402;BA.debugLine="label(2).TextColor = Colors.White";
__ref._label[(int) (2)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7012404;
 //BA.debugLineNum = 7012404;BA.debugLine="page(3).AddView(label(3), 0, 11%y, 50%x, 15%y)";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._label[(int) (3)].getObject()),(int) (0),__c.PerYToCurrent((float) (11),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=7012405;
 //BA.debugLineNum = 7012405;BA.debugLine="label(3).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (3)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal1")));
RDebugUtils.currentLine=7012406;
 //BA.debugLineNum = 7012406;BA.debugLine="label(3).TextColor = Colors.White";
__ref._label[(int) (3)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7012408;
 //BA.debugLineNum = 7012408;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.tv_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tv_judge";
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Public tvPanel As Panel";
_tvpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="Private page(4) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (4)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="Private label(35) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (35)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="End Sub";
return "";
}
public String  _ready_click(b4a.example.tv_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tv_judge";
if (Debug.shouldDelegate(ba, "ready_click"))
	return (String) Debug.delegate(ba, "ready_click", null);
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub ready_Click";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"FinalClick");
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
}