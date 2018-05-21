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
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox = null;
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
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="exePanel.Initialize(\"\")";
__ref._exepanel.Initialize(ba,"");
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="page(i).Initialize(\"\")";
__ref._page[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="For i = 0 To 34";
{
final int step5 = 1;
final int limit5 = (int) (34);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="label(i).Initialize(\"\")";
__ref._label[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="For i = 0 To 34";
{
final int step8 = 1;
final int limit8 = (int) (34);
_i = (int) (0) ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="chekpointbox(i).Initialize(\"check\")";
__ref._chekpointbox[_i].Initialize(ba,"check");
 }
};
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="downPanel.Initialize(\"\")";
__ref._downpanel.Initialize(ba,"");
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="btnready.Initialize(\"ready\")";
__ref._btnready.Initialize(ba,"ready");
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub BuildUi";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Container.Initialize";
__ref._container.Initialize(ba);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (0)].getObject()),_main._translate._getstring(null,"AvPage0"));
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (1)].getObject()),_main._translate._getstring(null,"AvPage1"));
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Container.AddPage(page(2), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (2)].getObject()),_main._translate._getstring(null,"AvPage2"));
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Container.AddPage(page(3), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (3)].getObject()),_main._translate._getstring(null,"AvPage3"));
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
__ref._pager.Initialize(ba,__ref._container,"MPager");
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="Tabs.Initialize(Pager)";
__ref._tabs.Initialize(ba,__ref._pager);
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Tabs.LineHeight = 5dip";
__ref._tabs.setLineHeight(__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
__ref._tabs.setLineColorCenter(__c.Colors.Red);
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="Tabs.TextColor = Colors.Gray";
__ref._tabs.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
__ref._tabs.setTextColorCenter(__c.Colors.Yellow);
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="exePanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
__ref._exepanel.AddView((android.view.View)(__ref._tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2097173;
 //BA.debugLineNum = 2097173;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
RDebugUtils.currentLine=2097175;
 //BA.debugLineNum = 2097175;BA.debugLine="Line.Initialize(\"\")";
__ref._line.Initialize(ba,"");
RDebugUtils.currentLine=2097176;
 //BA.debugLineNum = 2097176;BA.debugLine="Line.Background = Col";
__ref._line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=2097178;
 //BA.debugLineNum = 2097178;BA.debugLine="Line2.Initialize(\"\")";
__ref._line2.Initialize(ba,"");
RDebugUtils.currentLine=2097179;
 //BA.debugLineNum = 2097179;BA.debugLine="Line2.Background = Col";
__ref._line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=2097181;
 //BA.debugLineNum = 2097181;BA.debugLine="exePanel.AddView(Line, 0dip, 35dip, exePanel.Widt";
__ref._exepanel.AddView((android.view.View)(__ref._line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__ref._exepanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=2097184;
 //BA.debugLineNum = 2097184;BA.debugLine="exePanel.AddView(Pager, 0dip, 35dip + 2dip, exePa";
__ref._exepanel.AddView((android.view.View)(__ref._pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),__ref._exepanel.getWidth(),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2097186;
 //BA.debugLineNum = 2097186;BA.debugLine="exePanel.AddView(downPanel, 0, exePanel.Height -";
__ref._exepanel.AddView((android.view.View)(__ref._downpanel.getObject()),(int) (0),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))),__ref._exepanel.getWidth(),(int) (__ref._exepanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2097187;
 //BA.debugLineNum = 2097187;BA.debugLine="exePanel.AddView(Line2, 0dip, exePanel.Height - (";
__ref._exepanel.AddView((android.view.View)(__ref._line2.getObject()),__c.DipToCurrent((int) (0)),(int) (__ref._exepanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),__ref._exepanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=2097189;
 //BA.debugLineNum = 2097189;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
__ref._downpanel.AddView((android.view.View)(__ref._btnready.getObject()),(int) (__ref._downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
RDebugUtils.currentLine=2097192;
 //BA.debugLineNum = 2097192;BA.debugLine="For i = 1 To 7";
{
final int step24 = 1;
final int limit24 = (int) (7);
_i = (int) (1) ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
RDebugUtils.currentLine=2097193;
 //BA.debugLineNum = 2097193;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097194;
 //BA.debugLineNum = 2097194;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2097195;
 //BA.debugLineNum = 2097195;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2097196;
 //BA.debugLineNum = 2097196;BA.debugLine="page(0).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097197;
 //BA.debugLineNum = 2097197;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=2097201;
 //BA.debugLineNum = 2097201;BA.debugLine="page(1).AddView(label(8), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[(int) (8)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097202;
 //BA.debugLineNum = 2097202;BA.debugLine="label(8).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (8)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal8")));
RDebugUtils.currentLine=2097203;
 //BA.debugLineNum = 2097203;BA.debugLine="label(8).TextColor = Colors.White";
__ref._label[(int) (8)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2097205;
 //BA.debugLineNum = 2097205;BA.debugLine="page(1).AddView(chekpointbox(8), label(8).left +";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[(int) (8)].getObject()),(int) (__ref._label[(int) (8)].getLeft()+__ref._label[(int) (8)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (8)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097206;
 //BA.debugLineNum = 2097206;BA.debugLine="chekpointbox(8).Text = Main.translate.GetString(\"";
__ref._chekpointbox[(int) (8)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl8")));
RDebugUtils.currentLine=2097208;
 //BA.debugLineNum = 2097208;BA.debugLine="For i = 9 To 15";
{
final int step36 = 1;
final int limit36 = (int) (15);
_i = (int) (9) ;
for (;(step36 > 0 && _i <= limit36) || (step36 < 0 && _i >= limit36) ;_i = ((int)(0 + _i + step36))  ) {
RDebugUtils.currentLine=2097209;
 //BA.debugLineNum = 2097209;BA.debugLine="page(1).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097210;
 //BA.debugLineNum = 2097210;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2097211;
 //BA.debugLineNum = 2097211;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2097212;
 //BA.debugLineNum = 2097212;BA.debugLine="page(1).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097213;
 //BA.debugLineNum = 2097213;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=2097217;
 //BA.debugLineNum = 2097217;BA.debugLine="page(2).AddView(label(16),2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._label[(int) (16)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097218;
 //BA.debugLineNum = 2097218;BA.debugLine="label(16).Text = Main.translate.GetString(\"AVlaba";
__ref._label[(int) (16)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal17")));
RDebugUtils.currentLine=2097219;
 //BA.debugLineNum = 2097219;BA.debugLine="label(16).TextColor = Colors.White";
__ref._label[(int) (16)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2097220;
 //BA.debugLineNum = 2097220;BA.debugLine="page(2).AddView(chekpointbox(16), label(16).left";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._chekpointbox[(int) (16)].getObject()),(int) (__ref._label[(int) (16)].getLeft()+__ref._label[(int) (16)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (16)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097221;
 //BA.debugLineNum = 2097221;BA.debugLine="chekpointbox(16).Text = Main.translate.GetString(";
__ref._chekpointbox[(int) (16)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl8")));
RDebugUtils.currentLine=2097224;
 //BA.debugLineNum = 2097224;BA.debugLine="For i = 17 To 23";
{
final int step48 = 1;
final int limit48 = (int) (23);
_i = (int) (17) ;
for (;(step48 > 0 && _i <= limit48) || (step48 < 0 && _i >= limit48) ;_i = ((int)(0 + _i + step48))  ) {
RDebugUtils.currentLine=2097225;
 //BA.debugLineNum = 2097225;BA.debugLine="page(2).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097226;
 //BA.debugLineNum = 2097226;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2097227;
 //BA.debugLineNum = 2097227;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2097228;
 //BA.debugLineNum = 2097228;BA.debugLine="page(2).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097229;
 //BA.debugLineNum = 2097229;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=2097233;
 //BA.debugLineNum = 2097233;BA.debugLine="page(3).AddView(label(24), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._label[(int) (24)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097234;
 //BA.debugLineNum = 2097234;BA.debugLine="label(24).Text = Main.translate.GetString(\"AVlaba";
__ref._label[(int) (24)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal26")));
RDebugUtils.currentLine=2097235;
 //BA.debugLineNum = 2097235;BA.debugLine="label(24).TextColor = Colors.White";
__ref._label[(int) (24)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2097236;
 //BA.debugLineNum = 2097236;BA.debugLine="page(3).AddView(chekpointbox(24), label(24).left";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._chekpointbox[(int) (24)].getObject()),(int) (__ref._label[(int) (24)].getLeft()+__ref._label[(int) (24)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (24)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097237;
 //BA.debugLineNum = 2097237;BA.debugLine="chekpointbox(24).Text = Main.translate.GetString(";
__ref._chekpointbox[(int) (24)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl8")));
RDebugUtils.currentLine=2097239;
 //BA.debugLineNum = 2097239;BA.debugLine="For i = 25 To 31";
{
final int step60 = 1;
final int limit60 = (int) (31);
_i = (int) (25) ;
for (;(step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60) ;_i = ((int)(0 + _i + step60))  ) {
RDebugUtils.currentLine=2097240;
 //BA.debugLineNum = 2097240;BA.debugLine="page(3).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097241;
 //BA.debugLineNum = 2097241;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2097242;
 //BA.debugLineNum = 2097242;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2097243;
 //BA.debugLineNum = 2097243;BA.debugLine="page(3).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097244;
 //BA.debugLineNum = 2097244;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=2097246;
 //BA.debugLineNum = 2097246;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.exe_judging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="exe_judging";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Public exePanel As Panel";
_exepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Private page(4) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (4)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Private label(35) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (35)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="Private chekpointbox(35) As CheckBox";
_chekpointbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (35)];
{
int d0 = _chekpointbox.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
}