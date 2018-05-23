package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class av_judge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "agg.agg.av_judge");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", agg.agg.av_judge.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _avpanel = null;
public de.amberhome.viewpager.AHViewPager _pager = null;
public de.amberhome.viewpager.AHPageContainer _container = null;
public anywheresoftware.b4a.objects.PanelWrapper[] _page = null;
public anywheresoftware.b4a.objects.LabelWrapper[] _label = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox = null;
public de.amberhome.viewpager.AHViewPagerTabs _tabs = null;
public anywheresoftware.b4a.objects.PanelWrapper _line = null;
public anywheresoftware.b4a.objects.PanelWrapper _line2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _downpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnready = null;
public double _avscore = 0;
public agg.agg.main _main = null;
public agg.agg.starter _starter = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public agg.agg.helperfunctions _helperfunctions = null;
public String  _initialize(agg.agg.av_judge __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
int _i = 0;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="avPanel.Initialize(\"\")";
__ref._avpanel.Initialize(ba,"");
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="page(i).Initialize(\"\")";
__ref._page[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="For i = 0 To 34";
{
final int step5 = 1;
final int limit5 = (int) (34);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="label(i).Initialize(\"\")";
__ref._label[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="For i = 0 To 34";
{
final int step8 = 1;
final int limit8 = (int) (34);
_i = (int) (0) ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="chekpointbox(i).Initialize(\"check\")";
__ref._chekpointbox[_i].Initialize(ba,"check");
 }
};
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="downPanel.Initialize(\"\")";
__ref._downpanel.Initialize(ba,"");
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="btnready.Initialize(\"ready\")";
__ref._btnready.Initialize(ba,"ready");
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(agg.agg.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Return avPanel";
if (true) return __ref._avpanel;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return null;
}
public String  _buildui(agg.agg.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
int _lblheigh = 0;
int _i = 0;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub BuildUi";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Container.Initialize";
__ref._container.Initialize(ba);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (0)].getObject()),_main._translate._getstring(null,"AvPage0"));
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (1)].getObject()),_main._translate._getstring(null,"AvPage1"));
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Container.AddPage(page(2), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (2)].getObject()),_main._translate._getstring(null,"AvPage2"));
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Container.AddPage(page(3), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (3)].getObject()),_main._translate._getstring(null,"AvPage3"));
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
__ref._pager.Initialize(ba,__ref._container,"MPager");
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="Tabs.Initialize(Pager)";
__ref._tabs.Initialize(ba,__ref._pager);
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="Tabs.LineHeight = 5dip";
__ref._tabs.setLineHeight(__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
__ref._tabs.setLineColorCenter(__c.Colors.Red);
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="Tabs.TextColor = Colors.Gray";
__ref._tabs.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
__ref._tabs.setTextColorCenter(__c.Colors.Yellow);
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="avPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
__ref._avpanel.AddView((android.view.View)(__ref._tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=1835027;
 //BA.debugLineNum = 1835027;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1835029;
 //BA.debugLineNum = 1835029;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
RDebugUtils.currentLine=1835031;
 //BA.debugLineNum = 1835031;BA.debugLine="Line.Initialize(\"\")";
__ref._line.Initialize(ba,"");
RDebugUtils.currentLine=1835032;
 //BA.debugLineNum = 1835032;BA.debugLine="Line.Background = Col";
__ref._line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=1835034;
 //BA.debugLineNum = 1835034;BA.debugLine="Line2.Initialize(\"\")";
__ref._line2.Initialize(ba,"");
RDebugUtils.currentLine=1835035;
 //BA.debugLineNum = 1835035;BA.debugLine="Line2.Background = Col";
__ref._line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=1835037;
 //BA.debugLineNum = 1835037;BA.debugLine="avPanel.AddView(Line, 0dip, 35dip, avPanel.Width,";
__ref._avpanel.AddView((android.view.View)(__ref._line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__ref._avpanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=1835040;
 //BA.debugLineNum = 1835040;BA.debugLine="avPanel.AddView(Pager, 0dip, 35dip + 2dip, avPane";
__ref._avpanel.AddView((android.view.View)(__ref._pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),__ref._avpanel.getWidth(),(int) (__ref._avpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=1835042;
 //BA.debugLineNum = 1835042;BA.debugLine="avPanel.AddView(downPanel, 0, avPanel.Height - 35";
__ref._avpanel.AddView((android.view.View)(__ref._downpanel.getObject()),(int) (0),(int) (__ref._avpanel.getHeight()-__c.DipToCurrent((int) (35))),__ref._avpanel.getWidth(),(int) (__ref._avpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=1835043;
 //BA.debugLineNum = 1835043;BA.debugLine="avPanel.AddView(Line2, 0dip, avPanel.Height - (35";
__ref._avpanel.AddView((android.view.View)(__ref._line2.getObject()),__c.DipToCurrent((int) (0)),(int) (__ref._avpanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),__ref._avpanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=1835045;
 //BA.debugLineNum = 1835045;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
__ref._downpanel.AddView((android.view.View)(__ref._btnready.getObject()),(int) (__ref._downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
RDebugUtils.currentLine=1835047;
 //BA.debugLineNum = 1835047;BA.debugLine="Dim lblHeigh As Int = (avPanel.Height - downPanel";
_lblheigh = (int) ((__ref._avpanel.getHeight()-__ref._downpanel.getHeight())/(double)7);
RDebugUtils.currentLine=1835048;
 //BA.debugLineNum = 1835048;BA.debugLine="Log(lblHeigh)";
__c.Log(BA.NumberToString(_lblheigh));
RDebugUtils.currentLine=1835049;
 //BA.debugLineNum = 1835049;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835050;
 //BA.debugLineNum = 1835050;BA.debugLine="label(0).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal0")));
RDebugUtils.currentLine=1835051;
 //BA.debugLineNum = 1835051;BA.debugLine="label(0).TextColor = Colors.White";
__ref._label[(int) (0)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1835053;
 //BA.debugLineNum = 1835053;BA.debugLine="page(0).AddView(chekpointbox(0), label(0).left +";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[(int) (0)].getObject()),(int) (__ref._label[(int) (0)].getLeft()+__ref._label[(int) (0)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (0)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835054;
 //BA.debugLineNum = 1835054;BA.debugLine="chekpointbox(0).Text = Main.translate.GetString(\"";
__ref._chekpointbox[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl0")));
RDebugUtils.currentLine=1835057;
 //BA.debugLineNum = 1835057;BA.debugLine="For i = 1 To 7";
{
final int step31 = 1;
final int limit31 = (int) (7);
_i = (int) (1) ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
RDebugUtils.currentLine=1835058;
 //BA.debugLineNum = 1835058;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835059;
 //BA.debugLineNum = 1835059;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=1835060;
 //BA.debugLineNum = 1835060;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1835061;
 //BA.debugLineNum = 1835061;BA.debugLine="page(0).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835062;
 //BA.debugLineNum = 1835062;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=1835066;
 //BA.debugLineNum = 1835066;BA.debugLine="page(1).AddView(label(8), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[(int) (8)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835067;
 //BA.debugLineNum = 1835067;BA.debugLine="label(8).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (8)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal8")));
RDebugUtils.currentLine=1835068;
 //BA.debugLineNum = 1835068;BA.debugLine="label(8).TextColor = Colors.White";
__ref._label[(int) (8)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1835070;
 //BA.debugLineNum = 1835070;BA.debugLine="page(1).AddView(chekpointbox(8), label(8).left +";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[(int) (8)].getObject()),(int) (__ref._label[(int) (8)].getLeft()+__ref._label[(int) (8)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (8)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835071;
 //BA.debugLineNum = 1835071;BA.debugLine="chekpointbox(8).Text = Main.translate.GetString(\"";
__ref._chekpointbox[(int) (8)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl8")));
RDebugUtils.currentLine=1835073;
 //BA.debugLineNum = 1835073;BA.debugLine="For i = 9 To 15";
{
final int step43 = 1;
final int limit43 = (int) (15);
_i = (int) (9) ;
for (;(step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43) ;_i = ((int)(0 + _i + step43))  ) {
RDebugUtils.currentLine=1835074;
 //BA.debugLineNum = 1835074;BA.debugLine="page(1).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835075;
 //BA.debugLineNum = 1835075;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=1835076;
 //BA.debugLineNum = 1835076;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1835077;
 //BA.debugLineNum = 1835077;BA.debugLine="page(1).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835078;
 //BA.debugLineNum = 1835078;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=1835082;
 //BA.debugLineNum = 1835082;BA.debugLine="page(2).AddView(label(16),2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._label[(int) (16)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835083;
 //BA.debugLineNum = 1835083;BA.debugLine="label(16).Text = Main.translate.GetString(\"AVlaba";
__ref._label[(int) (16)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal17")));
RDebugUtils.currentLine=1835084;
 //BA.debugLineNum = 1835084;BA.debugLine="label(16).TextColor = Colors.White";
__ref._label[(int) (16)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1835085;
 //BA.debugLineNum = 1835085;BA.debugLine="page(2).AddView(chekpointbox(16), label(16).left";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._chekpointbox[(int) (16)].getObject()),(int) (__ref._label[(int) (16)].getLeft()+__ref._label[(int) (16)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (16)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835086;
 //BA.debugLineNum = 1835086;BA.debugLine="chekpointbox(16).Text = Main.translate.GetString(";
__ref._chekpointbox[(int) (16)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl8")));
RDebugUtils.currentLine=1835089;
 //BA.debugLineNum = 1835089;BA.debugLine="For i = 17 To 23";
{
final int step55 = 1;
final int limit55 = (int) (23);
_i = (int) (17) ;
for (;(step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55) ;_i = ((int)(0 + _i + step55))  ) {
RDebugUtils.currentLine=1835090;
 //BA.debugLineNum = 1835090;BA.debugLine="page(2).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835091;
 //BA.debugLineNum = 1835091;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=1835092;
 //BA.debugLineNum = 1835092;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1835093;
 //BA.debugLineNum = 1835093;BA.debugLine="page(2).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835094;
 //BA.debugLineNum = 1835094;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=1835098;
 //BA.debugLineNum = 1835098;BA.debugLine="page(3).AddView(label(24), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._label[(int) (24)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835099;
 //BA.debugLineNum = 1835099;BA.debugLine="label(24).Text = Main.translate.GetString(\"AVlaba";
__ref._label[(int) (24)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal26")));
RDebugUtils.currentLine=1835100;
 //BA.debugLineNum = 1835100;BA.debugLine="label(24).TextColor = Colors.White";
__ref._label[(int) (24)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1835101;
 //BA.debugLineNum = 1835101;BA.debugLine="page(3).AddView(chekpointbox(24), label(24).left";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._chekpointbox[(int) (24)].getObject()),(int) (__ref._label[(int) (24)].getLeft()+__ref._label[(int) (24)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (24)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835102;
 //BA.debugLineNum = 1835102;BA.debugLine="chekpointbox(24).Text = Main.translate.GetString(";
__ref._chekpointbox[(int) (24)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl8")));
RDebugUtils.currentLine=1835104;
 //BA.debugLineNum = 1835104;BA.debugLine="For i = 25 To 31";
{
final int step67 = 1;
final int limit67 = (int) (31);
_i = (int) (25) ;
for (;(step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67) ;_i = ((int)(0 + _i + step67))  ) {
RDebugUtils.currentLine=1835105;
 //BA.debugLineNum = 1835105;BA.debugLine="page(3).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835106;
 //BA.debugLineNum = 1835106;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=1835107;
 //BA.debugLineNum = 1835107;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1835108;
 //BA.debugLineNum = 1835108;BA.debugLine="page(3).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835109;
 //BA.debugLineNum = 1835109;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=1835112;
 //BA.debugLineNum = 1835112;BA.debugLine="End Sub";
return "";
}
public double  _finalavscore(agg.agg.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "finalavscore"))
	return (Double) Debug.delegate(ba, "finalavscore", null);
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub finalAVscore As Double";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Log(\"AVSCORE:\"&avScore)";
__c.Log("AVSCORE:"+BA.NumberToString(__ref._avscore));
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Return avScore";
if (true) return __ref._avscore;
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="End Sub";
return 0;
}
public String  _check_checkedchange(agg.agg.av_judge __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "check_checkedchange"))
	return (String) Debug.delegate(ba, "check_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub check_CheckedChange(Checked As Boolean";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="avScore = avScore + 0.1";
__ref._avscore = __ref._avscore+0.1;
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Log(avScore)";
__c.Log(BA.NumberToString(__ref._avscore));
 }else {
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="avScore = avScore - 0.1";
__ref._avscore = __ref._avscore-0.1;
 };
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Public avPanel As Panel";
_avpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Private page(4) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (4)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Private label(35) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (35)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Private chekpointbox(35) As CheckBox";
_chekpointbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (35)];
{
int d0 = _chekpointbox.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="Public avScore As Double";
_avscore = 0;
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="End Sub";
return "";
}
public String  _ready_click(agg.agg.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "ready_click"))
	return (String) Debug.delegate(ba, "ready_click", null);
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub ready_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"FinalClick");
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="finalAVscore";
__ref._finalavscore(null);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="End Sub";
return "";
}
}