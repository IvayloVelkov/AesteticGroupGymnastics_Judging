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
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="avPanel.Initialize(\"\")";
__ref._avpanel.Initialize(ba,"");
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="page(i).Initialize(\"\")";
__ref._page[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="For i = 0 To 34";
{
final int step5 = 1;
final int limit5 = (int) (34);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="label(i).Initialize(\"\")";
__ref._label[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="For i = 0 To 34";
{
final int step8 = 1;
final int limit8 = (int) (34);
_i = (int) (0) ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="chekpointbox(i).Initialize(\"check\")";
__ref._chekpointbox[_i].Initialize(ba,"check");
 }
};
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="downPanel.Initialize(\"\")";
__ref._downpanel.Initialize(ba,"");
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="btnready.Initialize(\"ready\")";
__ref._btnready.Initialize(ba,"ready");
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(agg.agg.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Return avPanel";
if (true) return __ref._avpanel;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub BuildUi";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Container.Initialize";
__ref._container.Initialize(ba);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (0)].getObject()),_main._translate._getstring(null,"AvPage0"));
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (1)].getObject()),_main._translate._getstring(null,"AvPage1"));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Container.AddPage(page(2), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (2)].getObject()),_main._translate._getstring(null,"AvPage2"));
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Container.AddPage(page(3), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (3)].getObject()),_main._translate._getstring(null,"AvPage3"));
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
__ref._pager.Initialize(ba,__ref._container,"MPager");
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Tabs.Initialize(Pager)";
__ref._tabs.Initialize(ba,__ref._pager);
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Tabs.LineHeight = 5dip";
__ref._tabs.setLineHeight(__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
__ref._tabs.setLineColorCenter(__c.Colors.Red);
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="Tabs.TextColor = Colors.Gray";
__ref._tabs.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
__ref._tabs.setTextColorCenter(__c.Colors.Yellow);
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="avPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
__ref._avpanel.AddView((android.view.View)(__ref._tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
RDebugUtils.currentLine=2752535;
 //BA.debugLineNum = 2752535;BA.debugLine="Line.Initialize(\"\")";
__ref._line.Initialize(ba,"");
RDebugUtils.currentLine=2752536;
 //BA.debugLineNum = 2752536;BA.debugLine="Line.Background = Col";
__ref._line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=2752538;
 //BA.debugLineNum = 2752538;BA.debugLine="Line2.Initialize(\"\")";
__ref._line2.Initialize(ba,"");
RDebugUtils.currentLine=2752539;
 //BA.debugLineNum = 2752539;BA.debugLine="Line2.Background = Col";
__ref._line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=2752541;
 //BA.debugLineNum = 2752541;BA.debugLine="avPanel.AddView(Line, 0dip, 35dip, avPanel.Width,";
__ref._avpanel.AddView((android.view.View)(__ref._line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__ref._avpanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=2752544;
 //BA.debugLineNum = 2752544;BA.debugLine="avPanel.AddView(Pager, 0dip, 35dip + 2dip, avPane";
__ref._avpanel.AddView((android.view.View)(__ref._pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),__ref._avpanel.getWidth(),(int) (__ref._avpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2752546;
 //BA.debugLineNum = 2752546;BA.debugLine="avPanel.AddView(downPanel, 0, avPanel.Height - 35";
__ref._avpanel.AddView((android.view.View)(__ref._downpanel.getObject()),(int) (0),(int) (__ref._avpanel.getHeight()-__c.DipToCurrent((int) (35))),__ref._avpanel.getWidth(),(int) (__ref._avpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2752547;
 //BA.debugLineNum = 2752547;BA.debugLine="avPanel.AddView(Line2, 0dip, avPanel.Height - (35";
__ref._avpanel.AddView((android.view.View)(__ref._line2.getObject()),__c.DipToCurrent((int) (0)),(int) (__ref._avpanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),__ref._avpanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=2752549;
 //BA.debugLineNum = 2752549;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
__ref._downpanel.AddView((android.view.View)(__ref._btnready.getObject()),(int) (__ref._downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
RDebugUtils.currentLine=2752551;
 //BA.debugLineNum = 2752551;BA.debugLine="Dim lblHeigh As Int = (avPanel.Height - downPanel";
_lblheigh = (int) ((__ref._avpanel.getHeight()-__ref._downpanel.getHeight())/(double)7);
RDebugUtils.currentLine=2752552;
 //BA.debugLineNum = 2752552;BA.debugLine="Log(lblHeigh)";
__c.Log(BA.NumberToString(_lblheigh));
RDebugUtils.currentLine=2752553;
 //BA.debugLineNum = 2752553;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 7%y)";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (7),ba));
RDebugUtils.currentLine=2752554;
 //BA.debugLineNum = 2752554;BA.debugLine="label(0).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal0")));
RDebugUtils.currentLine=2752555;
 //BA.debugLineNum = 2752555;BA.debugLine="label(0).TextColor = Colors.White";
__ref._label[(int) (0)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752557;
 //BA.debugLineNum = 2752557;BA.debugLine="page(0).AddView(chekpointbox(0), label(0).left +";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[(int) (0)].getObject()),(int) (__ref._label[(int) (0)].getLeft()+__ref._label[(int) (0)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (0)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752558;
 //BA.debugLineNum = 2752558;BA.debugLine="chekpointbox(0).Text = HelperFunctions.TvScore1";
__ref._chekpointbox[(int) (0)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
RDebugUtils.currentLine=2752561;
 //BA.debugLineNum = 2752561;BA.debugLine="For i = 1 To 3";
{
final int step31 = 1;
final int limit31 = (int) (3);
_i = (int) (1) ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
RDebugUtils.currentLine=2752562;
 //BA.debugLineNum = 2752562;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2752563;
 //BA.debugLineNum = 2752563;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2752564;
 //BA.debugLineNum = 2752564;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752565;
 //BA.debugLineNum = 2752565;BA.debugLine="page(0).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752566;
 //BA.debugLineNum = 2752566;BA.debugLine="chekpointbox(i).Text = HelperFunctions.TvScore1";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 }
};
RDebugUtils.currentLine=2752570;
 //BA.debugLineNum = 2752570;BA.debugLine="page(1).AddView(label(4), 2%x, 5%y, 50%x, 7%y)";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[(int) (4)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (7),ba));
RDebugUtils.currentLine=2752571;
 //BA.debugLineNum = 2752571;BA.debugLine="label(4).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (4)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal4")));
RDebugUtils.currentLine=2752572;
 //BA.debugLineNum = 2752572;BA.debugLine="label(4).TextColor = Colors.White";
__ref._label[(int) (4)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752574;
 //BA.debugLineNum = 2752574;BA.debugLine="page(1).AddView(chekpointbox(4), label(4).left +";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[(int) (4)].getObject()),(int) (__ref._label[(int) (4)].getLeft()+__ref._label[(int) (4)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (4)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (7),ba));
RDebugUtils.currentLine=2752575;
 //BA.debugLineNum = 2752575;BA.debugLine="chekpointbox(4).Text = HelperFunctions.TvScore1";
__ref._chekpointbox[(int) (4)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
RDebugUtils.currentLine=2752577;
 //BA.debugLineNum = 2752577;BA.debugLine="For i = 5 To 15";
{
final int step43 = 1;
final int limit43 = (int) (15);
_i = (int) (5) ;
for (;(step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43) ;_i = ((int)(0 + _i + step43))  ) {
RDebugUtils.currentLine=2752578;
 //BA.debugLineNum = 2752578;BA.debugLine="page(1).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (7),ba));
RDebugUtils.currentLine=2752579;
 //BA.debugLineNum = 2752579;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2752580;
 //BA.debugLineNum = 2752580;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752581;
 //BA.debugLineNum = 2752581;BA.debugLine="page(1).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752582;
 //BA.debugLineNum = 2752582;BA.debugLine="chekpointbox(i).Text = HelperFunctions.TvScore1";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 }
};
RDebugUtils.currentLine=2752586;
 //BA.debugLineNum = 2752586;BA.debugLine="page(2).AddView(label(16),2%x, 5%y, 50%x, 7%y)";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._label[(int) (16)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (7),ba));
RDebugUtils.currentLine=2752587;
 //BA.debugLineNum = 2752587;BA.debugLine="label(16).Text = Main.translate.GetString(\"AVlaba";
__ref._label[(int) (16)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal16")));
RDebugUtils.currentLine=2752588;
 //BA.debugLineNum = 2752588;BA.debugLine="label(16).TextColor = Colors.White";
__ref._label[(int) (16)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752589;
 //BA.debugLineNum = 2752589;BA.debugLine="page(2).AddView(chekpointbox(16), label(16).left";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._chekpointbox[(int) (16)].getObject()),(int) (__ref._label[(int) (16)].getLeft()+__ref._label[(int) (16)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (16)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752590;
 //BA.debugLineNum = 2752590;BA.debugLine="chekpointbox(16).Text = HelperFunctions.TvScore1";
__ref._chekpointbox[(int) (16)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
RDebugUtils.currentLine=2752593;
 //BA.debugLineNum = 2752593;BA.debugLine="For i = 17 To 27";
{
final int step55 = 1;
final int limit55 = (int) (27);
_i = (int) (17) ;
for (;(step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55) ;_i = ((int)(0 + _i + step55))  ) {
RDebugUtils.currentLine=2752594;
 //BA.debugLineNum = 2752594;BA.debugLine="page(2).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (7),ba));
RDebugUtils.currentLine=2752595;
 //BA.debugLineNum = 2752595;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2752596;
 //BA.debugLineNum = 2752596;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752597;
 //BA.debugLineNum = 2752597;BA.debugLine="page(2).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752598;
 //BA.debugLineNum = 2752598;BA.debugLine="chekpointbox(i).Text = HelperFunctions.TvScore1";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 }
};
RDebugUtils.currentLine=2752602;
 //BA.debugLineNum = 2752602;BA.debugLine="page(3).AddView(label(28), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._label[(int) (28)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2752603;
 //BA.debugLineNum = 2752603;BA.debugLine="label(28).Text = Main.translate.GetString(\"AVlaba";
__ref._label[(int) (28)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal28")));
RDebugUtils.currentLine=2752604;
 //BA.debugLineNum = 2752604;BA.debugLine="label(28).TextColor = Colors.White";
__ref._label[(int) (28)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752605;
 //BA.debugLineNum = 2752605;BA.debugLine="page(3).AddView(chekpointbox(28), label(28).left";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._chekpointbox[(int) (28)].getObject()),(int) (__ref._label[(int) (28)].getLeft()+__ref._label[(int) (28)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (28)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2752606;
 //BA.debugLineNum = 2752606;BA.debugLine="chekpointbox(28).Text = HelperFunctions.TvScore1";
__ref._chekpointbox[(int) (28)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
RDebugUtils.currentLine=2752608;
 //BA.debugLineNum = 2752608;BA.debugLine="For i = 29 To 33";
{
final int step67 = 1;
final int limit67 = (int) (33);
_i = (int) (29) ;
for (;(step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67) ;_i = ((int)(0 + _i + step67))  ) {
RDebugUtils.currentLine=2752609;
 //BA.debugLineNum = 2752609;BA.debugLine="page(3).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2752610;
 //BA.debugLineNum = 2752610;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2752611;
 //BA.debugLineNum = 2752611;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752612;
 //BA.debugLineNum = 2752612;BA.debugLine="page(3).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752613;
 //BA.debugLineNum = 2752613;BA.debugLine="chekpointbox(i).Text = HelperFunctions.TvScore1";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 }
};
RDebugUtils.currentLine=2752616;
 //BA.debugLineNum = 2752616;BA.debugLine="End Sub";
return "";
}
public double  _finalavscore(agg.agg.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "finalavscore"))
	return (Double) Debug.delegate(ba, "finalavscore", null);
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub finalAVscore As Double";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Log(\"AVSCORE:\"&avScore)";
__c.Log("AVSCORE:"+BA.NumberToString(__ref._avscore));
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Return avScore";
if (true) return __ref._avscore;
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="End Sub";
return 0;
}
public String  _check_checkedchange(agg.agg.av_judge __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "check_checkedchange"))
	return (String) Debug.delegate(ba, "check_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub check_CheckedChange(Checked As Boolean";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="avScore = avScore + 0.1";
__ref._avscore = __ref._avscore+0.1;
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Log(avScore)";
__c.Log(BA.NumberToString(__ref._avscore));
 }else {
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="avScore = avScore - 0.1";
__ref._avscore = __ref._avscore-0.1;
 };
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Public avPanel As Panel";
_avpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Private page(4) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (4)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Private label(35) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (35)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Private chekpointbox(35) As CheckBox";
_chekpointbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (35)];
{
int d0 = _chekpointbox.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="Public avScore As Double";
_avscore = 0;
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="End Sub";
return "";
}
public String  _ready_click(agg.agg.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "ready_click"))
	return (String) Debug.delegate(ba, "ready_click", null);
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub ready_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"FinalClick");
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="finalAVscore";
__ref._finalavscore(null);
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="End Sub";
return "";
}
}