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
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="exePanel.Initialize(\"\")";
__ref._exepanel.Initialize(ba,"");
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="page(0).Initialize(\"\")";
__ref._page[(int) (0)].Initialize(ba,"");
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="For i = 0 To 7";
{
final int step3 = 1;
final int limit3 = (int) (7);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="label(i).Initialize(\"\")";
__ref._label[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="chekpointbox.Initialize(\"check\")";
__ref._chekpointbox.Initialize(ba,"check");
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="For i = 0 To 6";
{
final int step7 = 1;
final int limit7 = (int) (6);
_i = (int) (0) ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="btnPoints(i).Initialize(\"addPan\")";
__ref._btnpoints[_i].Initialize(ba,"addPan");
 }
};
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="downPanel.Initialize(\"\")";
__ref._downpanel.Initialize(ba,"");
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="btnready.Initialize(\"ready\")";
__ref._btnready.Initialize(ba,"ready");
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Return exePanel";
if (true) return __ref._exepanel;
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return null;
}
public String  _buildui(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
int _i = 0;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub BuildUi";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Container.Initialize";
__ref._container.Initialize(ba);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (0)].getObject()),_main._translate._getstring(null,"AvPage0"));
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
__ref._pager.Initialize(ba,__ref._container,"MPager");
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="Tabs.Initialize(Pager)";
__ref._tabs.Initialize(ba,__ref._pager);
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="Tabs.LineHeight = 5dip";
__ref._tabs.setLineHeight(__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
__ref._tabs.setLineColorCenter(__c.Colors.Red);
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="Tabs.TextColor = Colors.Gray";
__ref._tabs.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
__ref._tabs.setTextColorCenter(__c.Colors.Yellow);
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="exePanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
__ref._exepanel.AddView((android.view.View)(__ref._tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="Line.Initialize(\"\")";
__ref._line.Initialize(ba,"");
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="Line.Background = Col";
__ref._line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="Line2.Initialize(\"\")";
__ref._line2.Initialize(ba,"");
RDebugUtils.currentLine=2293784;
 //BA.debugLineNum = 2293784;BA.debugLine="Line2.Background = Col";
__ref._line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=2293786;
 //BA.debugLineNum = 2293786;BA.debugLine="exePanel.AddView(Line, 0dip, 35dip, exePanel.Widt";
__ref._exepanel.AddView((android.view.View)(__ref._line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__ref._exepanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=2293789;
 //BA.debugLineNum = 2293789;BA.debugLine="exePanel.AddView(Pager, 0dip, 35dip + 2dip, exePa";
__ref._exepanel.AddView((android.view.View)(__ref._pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),__ref._exepanel.getWidth(),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2293791;
 //BA.debugLineNum = 2293791;BA.debugLine="exePanel.AddView(downPanel, 0, exePanel.Height -";
__ref._exepanel.AddView((android.view.View)(__ref._downpanel.getObject()),(int) (0),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))),__ref._exepanel.getWidth(),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2293792;
 //BA.debugLineNum = 2293792;BA.debugLine="exePanel.AddView(Line2, 0dip, exePanel.Height - (";
__ref._exepanel.AddView((android.view.View)(__ref._line2.getObject()),__c.DipToCurrent((int) (0)),(int) (__ref._exepanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),__ref._exepanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=2293794;
 //BA.debugLineNum = 2293794;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
__ref._downpanel.AddView((android.view.View)(__ref._btnready.getObject()),(int) (__ref._downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
RDebugUtils.currentLine=2293796;
 //BA.debugLineNum = 2293796;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2293797;
 //BA.debugLineNum = 2293797;BA.debugLine="label(0).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal0")));
RDebugUtils.currentLine=2293798;
 //BA.debugLineNum = 2293798;BA.debugLine="label(0).TextColor = Colors.White";
__ref._label[(int) (0)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2293800;
 //BA.debugLineNum = 2293800;BA.debugLine="page(0).AddView(btnPoints(0), label(0).left + lab";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._btnpoints[(int) (0)].getObject()),(int) (__ref._label[(int) (0)].getLeft()+__ref._label[(int) (0)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (0)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2293801;
 //BA.debugLineNum = 2293801;BA.debugLine="btnPoints(0).Text = Main.translate.GetString(\"Che";
__ref._btnpoints[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl0")));
RDebugUtils.currentLine=2293803;
 //BA.debugLineNum = 2293803;BA.debugLine="For i = 1 To 7";
{
final int step26 = 1;
final int limit26 = (int) (7);
_i = (int) (1) ;
for (;(step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26) ;_i = ((int)(0 + _i + step26))  ) {
RDebugUtils.currentLine=2293804;
 //BA.debugLineNum = 2293804;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2293805;
 //BA.debugLineNum = 2293805;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2293806;
 //BA.debugLineNum = 2293806;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
 }
};
RDebugUtils.currentLine=2293809;
 //BA.debugLineNum = 2293809;BA.debugLine="For i = 1 To 6";
{
final int step31 = 1;
final int limit31 = (int) (6);
_i = (int) (1) ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
RDebugUtils.currentLine=2293810;
 //BA.debugLineNum = 2293810;BA.debugLine="page(0).AddView(btnPoints(i), label(i).left + la";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._btnpoints[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2293811;
 //BA.debugLineNum = 2293811;BA.debugLine="btnPoints(i).Text = Main.translate.GetString(\"ad";
__ref._btnpoints[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"addPan"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=2293814;
 //BA.debugLineNum = 2293814;BA.debugLine="page(0).AddView(chekpointbox, label(7).left + lab";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox.getObject()),(int) (__ref._label[(int) (7)].getLeft()+__ref._label[(int) (7)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (7)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2293815;
 //BA.debugLineNum = 2293815;BA.debugLine="chekpointbox.Text = Main.translate.GetString(\"add";
__ref._chekpointbox.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"addPan"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2293816;
 //BA.debugLineNum = 2293816;BA.debugLine="End Sub";
return "";
}
public double  _finalexescore(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "finalexescore"))
	return (Double) Debug.delegate(ba, "finalexescore", null);
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub finalEXEscore As Double";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="exeScore = maxValue - exeScore";
__ref._exescore = __ref._maxvalue-__ref._exescore;
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Log(\"EXESCORE:\"&exeScore)";
__c.Log("EXESCORE:"+BA.NumberToString(__ref._exescore));
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Return exeScore";
if (true) return __ref._exescore;
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="End Sub";
return 0;
}
public String  _addpan_click(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "addpan_click"))
	return (String) Debug.delegate(ba, "addpan_click", null);
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub addPan_Click";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="exeScore = exeScore + 0.1";
__ref._exescore = __ref._exescore+0.1;
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Log(exeScore)";
__c.Log(BA.NumberToString(__ref._exescore));
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="End Sub";
return "";
}
public String  _check_checkedchange(agg.agg.exe_judging __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "check_checkedchange"))
	return (String) Debug.delegate(ba, "check_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub check_CheckedChange(Checked As Boolean";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="exeScore = exeScore + 0.1";
__ref._exescore = __ref._exescore+0.1;
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Log(exeScore)";
__c.Log(BA.NumberToString(__ref._exescore));
 }else {
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="exeScore = exeScore - 0.1";
__ref._exescore = __ref._exescore-0.1;
 };
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Public exePanel As Panel";
_exepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Private page(1) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (1)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Private label(8) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (8)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="Private chekpointbox As CheckBox";
_chekpointbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="Private btnPoints(7) As Button";
_btnpoints = new anywheresoftware.b4a.objects.ButtonWrapper[(int) (7)];
{
int d0 = _btnpoints.length;
for (int i0 = 0;i0 < d0;i0++) {
_btnpoints[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Public maxValue As Double = 10.00";
_maxvalue = 10.00;
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="Public exeScore As Double";
_exescore = 0;
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="End Sub";
return "";
}
public String  _ready_click(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
if (Debug.shouldDelegate(ba, "ready_click"))
	return (String) Debug.delegate(ba, "ready_click", null);
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub ready_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"FinalClick");
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="finalEXEscore";
__ref._finalexescore(null);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
return "";
}
}