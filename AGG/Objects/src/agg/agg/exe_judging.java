package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class exe_judging extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "agg.agg.exe_judging");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", agg.agg.exe_judging.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chekpointbox = null;
public anywheresoftware.b4a.objects.ButtonWrapper[] _btnpoints = null;
public double _maxvalue = 0;
public double _exescore = 0;
public agg.agg.main _main = null;
public agg.agg.starter _starter = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public agg.agg.helperfunctions _helperfunctions = null;
public String  _initialize(agg.agg.exe_judging __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
int _i = 0;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="exePanel.Initialize(\"\")";
__ref._exepanel.Initialize(ba,"");
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="page(0).Initialize(\"\")";
__ref._page[(int) (0)].Initialize(ba,"");
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="For i = 0 To 7";
{
final int step3 = 1;
final int limit3 = (int) (7);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="label(i).Initialize(\"\")";
__ref._label[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="chekpointbox.Initialize(\"check\")";
__ref._chekpointbox.Initialize(ba,"check");
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="For i = 0 To 6";
{
final int step7 = 1;
final int limit7 = (int) (6);
_i = (int) (0) ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="btnPoints(i).Initialize(\"addPan\")";
__ref._btnpoints[_i].Initialize(ba,"addPan");
 }
};
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="downPanel.Initialize(\"\")";
__ref._downpanel.Initialize(ba,"");
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="btnready.Initialize(\"ready\")";
__ref._btnready.Initialize(ba,"ready");
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Return exePanel";
if (true) return __ref._exepanel;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return null;
}
public String  _buildui(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
int _i = 0;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub BuildUi";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Container.Initialize";
__ref._container.Initialize(ba);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (0)].getObject()),_main._translate._getstring(null,"ExePage0"));
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
__ref._pager.Initialize(ba,__ref._container,"MPager");
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Tabs.Initialize(Pager)";
__ref._tabs.Initialize(ba,__ref._pager);
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Tabs.LineHeight = 5dip";
__ref._tabs.setLineHeight(__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
__ref._tabs.setLineColorCenter(__c.Colors.Red);
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="Tabs.TextColor = Colors.Gray";
__ref._tabs.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
__ref._tabs.setTextColorCenter(__c.Colors.Yellow);
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="exePanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
__ref._exepanel.AddView((android.view.View)(__ref._tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="Line.Initialize(\"\")";
__ref._line.Initialize(ba,"");
RDebugUtils.currentLine=1900565;
 //BA.debugLineNum = 1900565;BA.debugLine="Line.Background = Col";
__ref._line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=1900567;
 //BA.debugLineNum = 1900567;BA.debugLine="Line2.Initialize(\"\")";
__ref._line2.Initialize(ba,"");
RDebugUtils.currentLine=1900568;
 //BA.debugLineNum = 1900568;BA.debugLine="Line2.Background = Col";
__ref._line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=1900570;
 //BA.debugLineNum = 1900570;BA.debugLine="exePanel.AddView(Line, 0dip, 35dip, exePanel.Widt";
__ref._exepanel.AddView((android.view.View)(__ref._line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__ref._exepanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=1900573;
 //BA.debugLineNum = 1900573;BA.debugLine="exePanel.AddView(Pager, 0dip, 35dip + 2dip, exePa";
__ref._exepanel.AddView((android.view.View)(__ref._pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),__ref._exepanel.getWidth(),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=1900575;
 //BA.debugLineNum = 1900575;BA.debugLine="exePanel.AddView(downPanel, 0, exePanel.Height -";
__ref._exepanel.AddView((android.view.View)(__ref._downpanel.getObject()),(int) (0),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))),__ref._exepanel.getWidth(),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=1900576;
 //BA.debugLineNum = 1900576;BA.debugLine="exePanel.AddView(Line2, 0dip, exePanel.Height - (";
__ref._exepanel.AddView((android.view.View)(__ref._line2.getObject()),__c.DipToCurrent((int) (0)),(int) (__ref._exepanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),__ref._exepanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=1900578;
 //BA.debugLineNum = 1900578;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
__ref._downpanel.AddView((android.view.View)(__ref._btnready.getObject()),(int) (__ref._downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
RDebugUtils.currentLine=1900580;
 //BA.debugLineNum = 1900580;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1900581;
 //BA.debugLineNum = 1900581;BA.debugLine="label(0).Text = Main.translate.GetString(\"Exelaba";
__ref._label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Exelabal0")));
RDebugUtils.currentLine=1900582;
 //BA.debugLineNum = 1900582;BA.debugLine="label(0).TextColor = Colors.White";
__ref._label[(int) (0)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1900584;
 //BA.debugLineNum = 1900584;BA.debugLine="page(0).AddView(btnPoints(0), label(0).left + lab";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._btnpoints[(int) (0)].getObject()),(int) (__ref._label[(int) (0)].getLeft()+__ref._label[(int) (0)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (0)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1900585;
 //BA.debugLineNum = 1900585;BA.debugLine="btnPoints(0).Text = \"-\" & HelperFunctions.TvScore";
__ref._btnpoints[(int) (0)].setText(BA.ObjectToCharSequence("-"+_helperfunctions._tvscore1));
RDebugUtils.currentLine=1900586;
 //BA.debugLineNum = 1900586;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnPoints(0),Colo";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnpoints[(int) (0)].getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
RDebugUtils.currentLine=1900587;
 //BA.debugLineNum = 1900587;BA.debugLine="btnPoints(0).Padding = Array As Int(15,0,0,0)";
__ref._btnpoints[(int) (0)].setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=1900588;
 //BA.debugLineNum = 1900588;BA.debugLine="btnPoints(0).SingleLine = True";
__ref._btnpoints[(int) (0)].setSingleLine(__c.True);
RDebugUtils.currentLine=1900591;
 //BA.debugLineNum = 1900591;BA.debugLine="For i = 1 To 7";
{
final int step29 = 1;
final int limit29 = (int) (7);
_i = (int) (1) ;
for (;(step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29) ;_i = ((int)(0 + _i + step29))  ) {
RDebugUtils.currentLine=1900592;
 //BA.debugLineNum = 1900592;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1900593;
 //BA.debugLineNum = 1900593;BA.debugLine="label(i).Text = Main.translate.GetString(\"Exelab";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Exelabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=1900594;
 //BA.debugLineNum = 1900594;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
 }
};
RDebugUtils.currentLine=1900597;
 //BA.debugLineNum = 1900597;BA.debugLine="For i = 1 To 6";
{
final int step34 = 1;
final int limit34 = (int) (6);
_i = (int) (1) ;
for (;(step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34) ;_i = ((int)(0 + _i + step34))  ) {
RDebugUtils.currentLine=1900598;
 //BA.debugLineNum = 1900598;BA.debugLine="page(0).AddView(btnPoints(i), label(i).left + la";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._btnpoints[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1900599;
 //BA.debugLineNum = 1900599;BA.debugLine="btnPoints(i).Text = \"-\" & HelperFunctions.TvScor";
__ref._btnpoints[_i].setText(BA.ObjectToCharSequence("-"+_helperfunctions._tvscore1));
RDebugUtils.currentLine=1900600;
 //BA.debugLineNum = 1900600;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnPoints(i),Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnpoints[_i].getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
RDebugUtils.currentLine=1900601;
 //BA.debugLineNum = 1900601;BA.debugLine="btnPoints(i).Padding = Array As Int(15,0,0,0)";
__ref._btnpoints[_i].setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=1900602;
 //BA.debugLineNum = 1900602;BA.debugLine="btnPoints(i).SingleLine = True";
__ref._btnpoints[_i].setSingleLine(__c.True);
 }
};
RDebugUtils.currentLine=1900605;
 //BA.debugLineNum = 1900605;BA.debugLine="page(0).AddView(chekpointbox, label(7).left + lab";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox.getObject()),(int) (__ref._label[(int) (7)].getLeft()+__ref._label[(int) (7)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (7)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1900606;
 //BA.debugLineNum = 1900606;BA.debugLine="chekpointbox.Text = \"-\" & HelperFunctions.TvScore";
__ref._chekpointbox.setText(BA.ObjectToCharSequence("-"+_helperfunctions._tvscore3));
RDebugUtils.currentLine=1900607;
 //BA.debugLineNum = 1900607;BA.debugLine="End Sub";
return "";
}
public double  _finalexescore(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "finalexescore"))
	return (Double) Debug.delegate(ba, "finalexescore", null);
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub finalEXEscore As Double";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="exeScore = maxValue - exeScore";
__ref._exescore = __ref._maxvalue-__ref._exescore;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Log(\"EXESCORE:\"&exeScore)";
__c.Log("EXESCORE:"+BA.NumberToString(__ref._exescore));
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Return exeScore";
if (true) return __ref._exescore;
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="End Sub";
return 0;
}
public String  _addpan_click(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "addpan_click"))
	return (String) Debug.delegate(ba, "addpan_click", null);
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub addPan_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="exeScore = exeScore + 0.1";
__ref._exescore = __ref._exescore+0.1;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Log(exeScore)";
__c.Log(BA.NumberToString(__ref._exescore));
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="End Sub";
return "";
}
public String  _check_checkedchange(agg.agg.exe_judging __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "check_checkedchange"))
	return (String) Debug.delegate(ba, "check_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub check_CheckedChange(Checked As Boolean";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="exeScore = exeScore + 0.1";
__ref._exescore = __ref._exescore+0.1;
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Log(exeScore)";
__c.Log(BA.NumberToString(__ref._exescore));
 }else {
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="exeScore = exeScore - 0.1";
__ref._exescore = __ref._exescore-0.1;
 };
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Public exePanel As Panel";
_exepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Private page(1) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (1)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Private label(8) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (8)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Private chekpointbox As CheckBox";
_chekpointbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="Private btnPoints(7) As Button";
_btnpoints = new anywheresoftware.b4a.objects.ButtonWrapper[(int) (7)];
{
int d0 = _btnpoints.length;
for (int i0 = 0;i0 < d0;i0++) {
_btnpoints[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="Public maxValue As Double = 10.00";
_maxvalue = 10.00;
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="Public exeScore As Double";
_exescore = 0;
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="End Sub";
return "";
}
public String  _ready_click(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "ready_click"))
	return (String) Debug.delegate(ba, "ready_click", null);
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub ready_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"FinalClick");
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="finalEXEscore";
__ref._finalexescore(null);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="End Sub";
return "";
}
}