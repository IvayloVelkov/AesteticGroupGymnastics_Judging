package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class exe_judging extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "agg.agg.exe_judging");
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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public String  _addpan_click() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub addPan_Click";
 //BA.debugLineNum = 99;BA.debugLine="exeScore = exeScore + 0.1";
_exescore = _exescore+0.1;
 //BA.debugLineNum = 100;BA.debugLine="Log(exeScore)";
__c.Log(BA.NumberToString(_exescore));
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Public Sub asView As Panel";
 //BA.debugLineNum = 124;BA.debugLine="Return exePanel";
if (true) return _exepanel;
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
int _i = 0;
 //BA.debugLineNum = 33;BA.debugLine="Public Sub BuildUi";
 //BA.debugLineNum = 34;BA.debugLine="Container.Initialize";
_container.Initialize(ba);
 //BA.debugLineNum = 36;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
_container.AddPage((android.view.View)(_page[(int) (0)].getObject()),_main._translate._getstring("ExePage0"));
 //BA.debugLineNum = 38;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
_pager.Initialize(ba,_container,"MPager");
 //BA.debugLineNum = 40;BA.debugLine="Tabs.Initialize(Pager)";
_tabs.Initialize(ba,_pager);
 //BA.debugLineNum = 41;BA.debugLine="Tabs.LineHeight = 5dip";
_tabs.setLineHeight(__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 42;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
_tabs.setLineColorCenter(__c.Colors.Red);
 //BA.debugLineNum = 43;BA.debugLine="Tabs.TextColor = Colors.Gray";
_tabs.setTextColor(__c.Colors.Gray);
 //BA.debugLineNum = 44;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
_tabs.setTextColorCenter(__c.Colors.Yellow);
 //BA.debugLineNum = 46;BA.debugLine="exePanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
_exepanel.AddView((android.view.View)(_tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 49;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 51;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
 //BA.debugLineNum = 53;BA.debugLine="Line.Initialize(\"\")";
_line.Initialize(ba,"");
 //BA.debugLineNum = 54;BA.debugLine="Line.Background = Col";
_line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
 //BA.debugLineNum = 56;BA.debugLine="Line2.Initialize(\"\")";
_line2.Initialize(ba,"");
 //BA.debugLineNum = 57;BA.debugLine="Line2.Background = Col";
_line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
 //BA.debugLineNum = 59;BA.debugLine="exePanel.AddView(Line, 0dip, 35dip, exePanel.Widt";
_exepanel.AddView((android.view.View)(_line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),_exepanel.getWidth(),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 62;BA.debugLine="exePanel.AddView(Pager, 0dip, 35dip + 2dip, exePa";
_exepanel.AddView((android.view.View)(_pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),_exepanel.getWidth(),(int) (_exepanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 64;BA.debugLine="exePanel.AddView(downPanel, 0, exePanel.Height -";
_exepanel.AddView((android.view.View)(_downpanel.getObject()),(int) (0),(int) (_exepanel.getHeight()-__c.DipToCurrent((int) (35))),_exepanel.getWidth(),(int) (_exepanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 65;BA.debugLine="exePanel.AddView(Line2, 0dip, exePanel.Height - (";
_exepanel.AddView((android.view.View)(_line2.getObject()),__c.DipToCurrent((int) (0)),(int) (_exepanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),_exepanel.getWidth(),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 67;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
_downpanel.AddView((android.view.View)(_btnready.getObject()),(int) (_downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
 //BA.debugLineNum = 69;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
_page[(int) (0)].AddView((android.view.View)(_label[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 70;BA.debugLine="label(0).Text = Main.translate.GetString(\"Exelaba";
_label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring("Exelabal0")));
 //BA.debugLineNum = 71;BA.debugLine="label(0).TextColor = Colors.White";
_label[(int) (0)].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 73;BA.debugLine="page(0).AddView(btnPoints(0), label(0).left + lab";
_page[(int) (0)].AddView((android.view.View)(_btnpoints[(int) (0)].getObject()),(int) (_label[(int) (0)].getLeft()+_label[(int) (0)].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[(int) (0)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 74;BA.debugLine="btnPoints(0).Text = \"-\" & HelperFunctions.TvScore";
_btnpoints[(int) (0)].setText(BA.ObjectToCharSequence("-"+_helperfunctions._tvscore1));
 //BA.debugLineNum = 75;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnPoints(0),Colo";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnpoints[(int) (0)].getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
 //BA.debugLineNum = 76;BA.debugLine="btnPoints(0).Padding = Array As Int(15,0,0,0)";
_btnpoints[(int) (0)].setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 77;BA.debugLine="btnPoints(0).SingleLine = True";
_btnpoints[(int) (0)].setSingleLine(__c.True);
 //BA.debugLineNum = 80;BA.debugLine="For i = 1 To 7";
{
final int step29 = 1;
final int limit29 = (int) (7);
_i = (int) (1) ;
for (;(step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29) ;_i = ((int)(0 + _i + step29))  ) {
 //BA.debugLineNum = 81;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
_page[(int) (0)].AddView((android.view.View)(_label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (_label[(int) (_i-1)].getTop()+_label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 82;BA.debugLine="label(i).Text = Main.translate.GetString(\"Exelab";
_label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring("Exelabal"+BA.NumberToString(_i))));
 //BA.debugLineNum = 83;BA.debugLine="label(i).TextColor = Colors.White";
_label[_i].setTextColor(__c.Colors.White);
 }
};
 //BA.debugLineNum = 86;BA.debugLine="For i = 1 To 6";
{
final int step34 = 1;
final int limit34 = (int) (6);
_i = (int) (1) ;
for (;(step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34) ;_i = ((int)(0 + _i + step34))  ) {
 //BA.debugLineNum = 87;BA.debugLine="page(0).AddView(btnPoints(i), label(i).left + la";
_page[(int) (0)].AddView((android.view.View)(_btnpoints[_i].getObject()),(int) (_label[_i].getLeft()+_label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 88;BA.debugLine="btnPoints(i).Text = \"-\" & HelperFunctions.TvScor";
_btnpoints[_i].setText(BA.ObjectToCharSequence("-"+_helperfunctions._tvscore1));
 //BA.debugLineNum = 89;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnPoints(i),Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnpoints[_i].getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (60));
 //BA.debugLineNum = 90;BA.debugLine="btnPoints(i).Padding = Array As Int(15,0,0,0)";
_btnpoints[_i].setPadding(new int[]{(int) (15),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 91;BA.debugLine="btnPoints(i).SingleLine = True";
_btnpoints[_i].setSingleLine(__c.True);
 }
};
 //BA.debugLineNum = 94;BA.debugLine="page(0).AddView(chekpointbox, label(7).left + lab";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox.getObject()),(int) (_label[(int) (7)].getLeft()+_label[(int) (7)].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[(int) (7)].getTop(),__c.PerXToCurrent((float) (25),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 95;BA.debugLine="chekpointbox.Text = \"-\" & HelperFunctions.TvScore";
_chekpointbox.setText(BA.ObjectToCharSequence("-"+_helperfunctions._tvscore3));
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _check_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Private Sub check_CheckedChange(Checked As Boolean";
 //BA.debugLineNum = 104;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
 //BA.debugLineNum = 105;BA.debugLine="exeScore = exeScore + 0.3";
_exescore = _exescore+0.3;
 //BA.debugLineNum = 106;BA.debugLine="Log(exeScore)";
__c.Log(BA.NumberToString(_exescore));
 }else {
 //BA.debugLineNum = 108;BA.debugLine="exeScore = exeScore - 0.3";
_exescore = _exescore-0.3;
 };
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public exePanel As Panel";
_exepanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
 //BA.debugLineNum = 4;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
 //BA.debugLineNum = 5;BA.debugLine="Private page(1) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (1)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
 //BA.debugLineNum = 6;BA.debugLine="Private label(8) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (8)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 7;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
 //BA.debugLineNum = 8;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private chekpointbox As CheckBox";
_chekpointbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private btnPoints(7) As Button";
_btnpoints = new anywheresoftware.b4a.objects.ButtonWrapper[(int) (7)];
{
int d0 = _btnpoints.length;
for (int i0 = 0;i0 < d0;i0++) {
_btnpoints[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
 //BA.debugLineNum = 14;BA.debugLine="Public maxValue As Double = 10.00";
_maxvalue = 10.00;
 //BA.debugLineNum = 15;BA.debugLine="Public exeScore As Double";
_exescore = 0;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public double  _finalexescore() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub finalEXEscore As Double";
 //BA.debugLineNum = 113;BA.debugLine="exeScore = maxValue - exeScore";
_exescore = _maxvalue-_exescore;
 //BA.debugLineNum = 114;BA.debugLine="Log(\"EXESCORE:\"&exeScore)";
__c.Log("EXESCORE:"+BA.NumberToString(_exescore));
 //BA.debugLineNum = 115;BA.debugLine="Return exeScore";
if (true) return _exescore;
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
int _i = 0;
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 20;BA.debugLine="exePanel.Initialize(\"\")";
_exepanel.Initialize(ba,"");
 //BA.debugLineNum = 21;BA.debugLine="page(0).Initialize(\"\")";
_page[(int) (0)].Initialize(ba,"");
 //BA.debugLineNum = 22;BA.debugLine="For i = 0 To 7";
{
final int step3 = 1;
final int limit3 = (int) (7);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
 //BA.debugLineNum = 23;BA.debugLine="label(i).Initialize(\"\")";
_label[_i].Initialize(ba,"");
 }
};
 //BA.debugLineNum = 25;BA.debugLine="chekpointbox.Initialize(\"check\")";
_chekpointbox.Initialize(ba,"check");
 //BA.debugLineNum = 26;BA.debugLine="For i = 0 To 6";
{
final int step7 = 1;
final int limit7 = (int) (6);
_i = (int) (0) ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
 //BA.debugLineNum = 27;BA.debugLine="btnPoints(i).Initialize(\"addPan\")";
_btnpoints[_i].Initialize(ba,"addPan");
 }
};
 //BA.debugLineNum = 29;BA.debugLine="downPanel.Initialize(\"\")";
_downpanel.Initialize(ba,"");
 //BA.debugLineNum = 30;BA.debugLine="btnready.Initialize(\"ready\")";
_btnready.Initialize(ba,"ready");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _ready_click() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Private Sub ready_Click";
 //BA.debugLineNum = 119;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"FinalClick");
 //BA.debugLineNum = 120;BA.debugLine="finalEXEscore";
_finalexescore();
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
