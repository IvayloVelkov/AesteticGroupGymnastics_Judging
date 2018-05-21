package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tv_judge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "agg.agg.tv_judge");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", agg.agg.tv_judge.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox = null;
public agg.agg.main _main = null;
public agg.agg.starter _starter = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public agg.agg.helperfunctions _helperfunctions = null;
public String  _initialize(agg.agg.tv_judge __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="tv_judge";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
int _i = 0;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="tvPanel.Initialize(\"\")";
__ref._tvpanel.Initialize(ba,"");
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="For i = 0 To 1";
{
final int step2 = 1;
final int limit2 = (int) (1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="page(i).Initialize(\"\")";
__ref._page[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="For i = 0 To 11";
{
final int step5 = 1;
final int limit5 = (int) (11);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="label(i).Initialize(\"\")";
__ref._label[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="For i = 0 To 29";
{
final int step8 = 1;
final int limit8 = (int) (29);
_i = (int) (0) ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="chekpointbox(i).Initialize(\"check\")";
__ref._chekpointbox[_i].Initialize(ba,"check");
 }
};
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="downPanel.Initialize(\"\")";
__ref._downpanel.Initialize(ba,"");
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="btnready.Initialize(\"ready\")";
__ref._btnready.Initialize(ba,"ready");
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(agg.agg.tv_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tv_judge";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Return tvPanel";
if (true) return __ref._tvpanel;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return null;
}
public String  _buildui(agg.agg.tv_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tv_judge";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
int _i = 0;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub BuildUi";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Container.Initialize";
__ref._container.Initialize(ba);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (0)].getObject()),_main._translate._getstring(null,"AvPage0"));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (1)].getObject()),_main._translate._getstring(null,"AvPage1"));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
__ref._pager.Initialize(ba,__ref._container,"MPager");
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Tabs.Initialize(Pager)";
__ref._tabs.Initialize(ba,__ref._pager);
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Tabs.LineHeight = 5dip";
__ref._tabs.setLineHeight(__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
__ref._tabs.setLineColorCenter(__c.Colors.Red);
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Tabs.TextColor = Colors.Gray";
__ref._tabs.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
__ref._tabs.setTextColorCenter(__c.Colors.Yellow);
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="tvPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
__ref._tvpanel.AddView((android.view.View)(__ref._tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="Line.Initialize(\"\")";
__ref._line.Initialize(ba,"");
RDebugUtils.currentLine=1310742;
 //BA.debugLineNum = 1310742;BA.debugLine="Line.Background = Col";
__ref._line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="Line2.Initialize(\"\")";
__ref._line2.Initialize(ba,"");
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="Line2.Background = Col";
__ref._line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="tvPanel.AddView(Line, 0dip, 35dip, tvPanel.Width,";
__ref._tvpanel.AddView((android.view.View)(__ref._line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__ref._tvpanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="tvPanel.AddView(Pager, 0dip, 35dip + 2dip, tvPane";
__ref._tvpanel.AddView((android.view.View)(__ref._pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),__ref._tvpanel.getWidth(),(int) (__ref._tvpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="tvPanel.AddView(downPanel, 0, tvPanel.Height - 35";
__ref._tvpanel.AddView((android.view.View)(__ref._downpanel.getObject()),(int) (0),(int) (__ref._tvpanel.getHeight()-__c.DipToCurrent((int) (35))),__ref._tvpanel.getWidth(),(int) (__ref._tvpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=1310753;
 //BA.debugLineNum = 1310753;BA.debugLine="tvPanel.AddView(Line2, 0dip, tvPanel.Height - (35";
__ref._tvpanel.AddView((android.view.View)(__ref._line2.getObject()),__c.DipToCurrent((int) (0)),(int) (__ref._tvpanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),__ref._tvpanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=1310755;
 //BA.debugLineNum = 1310755;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
__ref._downpanel.AddView((android.view.View)(__ref._btnready.getObject()),(int) (__ref._downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
RDebugUtils.currentLine=1310758;
 //BA.debugLineNum = 1310758;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310759;
 //BA.debugLineNum = 1310759;BA.debugLine="label(0).Text = Main.translate.GetString(\"TVlabel";
__ref._label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"TVlabel0")));
RDebugUtils.currentLine=1310760;
 //BA.debugLineNum = 1310760;BA.debugLine="label(0).TextColor = Colors.White";
__ref._label[(int) (0)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1310762;
 //BA.debugLineNum = 1310762;BA.debugLine="page(0).AddView(chekpointbox(0), label(0).left +";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[(int) (0)].getObject()),(int) (__ref._label[(int) (0)].getLeft()+__ref._label[(int) (0)].getWidth()),__ref._label[(int) (0)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310763;
 //BA.debugLineNum = 1310763;BA.debugLine="chekpointbox(0).Text = Main.translate.GetString(\"";
__ref._chekpointbox[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check0")));
RDebugUtils.currentLine=1310764;
 //BA.debugLineNum = 1310764;BA.debugLine="page(0).AddView(chekpointbox(13), chekpointbox(0)";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[(int) (13)].getObject()),(int) (__ref._chekpointbox[(int) (0)].getLeft()+__ref._chekpointbox[(int) (0)].getWidth()),__ref._chekpointbox[(int) (0)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310765;
 //BA.debugLineNum = 1310765;BA.debugLine="chekpointbox(13).Text = Main.translate.GetString(";
__ref._chekpointbox[(int) (13)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check14")));
RDebugUtils.currentLine=1310768;
 //BA.debugLineNum = 1310768;BA.debugLine="For i = 1 To 5";
{
final int step29 = 1;
final int limit29 = (int) (5);
_i = (int) (1) ;
for (;(step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29) ;_i = ((int)(0 + _i + step29))  ) {
RDebugUtils.currentLine=1310769;
 //BA.debugLineNum = 1310769;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310770;
 //BA.debugLineNum = 1310770;BA.debugLine="label(i).Text = Main.translate.GetString(\"TVlabe";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"TVlabel"+BA.NumberToString(_i))));
RDebugUtils.currentLine=1310771;
 //BA.debugLineNum = 1310771;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1310772;
 //BA.debugLineNum = 1310772;BA.debugLine="page(0).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310773;
 //BA.debugLineNum = 1310773;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=1310776;
 //BA.debugLineNum = 1310776;BA.debugLine="page(0).AddView(chekpointbox(6), chekpointbox(5).";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[(int) (6)].getObject()),(int) (__ref._chekpointbox[(int) (5)].getLeft()+__ref._chekpointbox[(int) (5)].getWidth()),__ref._chekpointbox[(int) (5)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310777;
 //BA.debugLineNum = 1310777;BA.debugLine="chekpointbox(7).Text = Main.translate.GetString(\"";
__ref._chekpointbox[(int) (7)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check6")));
RDebugUtils.currentLine=1310778;
 //BA.debugLineNum = 1310778;BA.debugLine="page(0).AddView(chekpointbox(7), chekpointbox(6).";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[(int) (7)].getObject()),(int) (__ref._chekpointbox[(int) (6)].getLeft()+__ref._chekpointbox[(int) (6)].getWidth()),__ref._chekpointbox[(int) (6)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310779;
 //BA.debugLineNum = 1310779;BA.debugLine="chekpointbox(7).Text = Main.translate.GetString(\"";
__ref._chekpointbox[(int) (7)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check12")));
RDebugUtils.currentLine=1310781;
 //BA.debugLineNum = 1310781;BA.debugLine="For i = 8 To 12";
{
final int step40 = 1;
final int limit40 = (int) (12);
_i = (int) (8) ;
for (;(step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40) ;_i = ((int)(0 + _i + step40))  ) {
RDebugUtils.currentLine=1310782;
 //BA.debugLineNum = 1310782;BA.debugLine="page(0).AddView(chekpointbox(i), chekpointbox(i";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._chekpointbox[(int) (_i-7)].getLeft()+__ref._chekpointbox[(int) (_i-7)].getWidth()),__ref._chekpointbox[(int) (_i-7)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310783;
 //BA.debugLineNum = 1310783;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=1310790;
 //BA.debugLineNum = 1310790;BA.debugLine="page(1).AddView(label(6), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[(int) (6)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310791;
 //BA.debugLineNum = 1310791;BA.debugLine="label(6).Text = Main.translate.GetString(\"TVlabel";
__ref._label[(int) (6)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"TVlabel6")));
RDebugUtils.currentLine=1310792;
 //BA.debugLineNum = 1310792;BA.debugLine="label(6).TextColor = Colors.White";
__ref._label[(int) (6)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1310794;
 //BA.debugLineNum = 1310794;BA.debugLine="page(1).AddView(chekpointbox(14), label(6).left +";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[(int) (14)].getObject()),(int) (__ref._label[(int) (6)].getLeft()+__ref._label[(int) (6)].getWidth()),__ref._label[(int) (6)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310795;
 //BA.debugLineNum = 1310795;BA.debugLine="chekpointbox(14).Text = Main.translate.GetString(";
__ref._chekpointbox[(int) (14)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl6")));
RDebugUtils.currentLine=1310796;
 //BA.debugLineNum = 1310796;BA.debugLine="page(1).AddView(chekpointbox(15), chekpointbox(14";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[(int) (15)].getObject()),(int) (__ref._chekpointbox[(int) (14)].getLeft()+__ref._chekpointbox[(int) (14)].getWidth()),__ref._chekpointbox[(int) (14)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310797;
 //BA.debugLineNum = 1310797;BA.debugLine="chekpointbox(15).Text = Main.translate.GetString(";
__ref._chekpointbox[(int) (15)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl6")));
RDebugUtils.currentLine=1310799;
 //BA.debugLineNum = 1310799;BA.debugLine="For i = 7 To 11";
{
final int step51 = 1;
final int limit51 = (int) (11);
_i = (int) (7) ;
for (;(step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51) ;_i = ((int)(0 + _i + step51))  ) {
RDebugUtils.currentLine=1310800;
 //BA.debugLineNum = 1310800;BA.debugLine="page(1).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310801;
 //BA.debugLineNum = 1310801;BA.debugLine="label(i).Text = Main.translate.GetString(\"TVlabe";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"TVlabel"+BA.NumberToString(_i))));
RDebugUtils.currentLine=1310802;
 //BA.debugLineNum = 1310802;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
 }
};
RDebugUtils.currentLine=1310805;
 //BA.debugLineNum = 1310805;BA.debugLine="For i = 16 To 20";
{
final int step56 = 1;
final int limit56 = (int) (20);
_i = (int) (16) ;
for (;(step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56) ;_i = ((int)(0 + _i + step56))  ) {
RDebugUtils.currentLine=1310806;
 //BA.debugLineNum = 1310806;BA.debugLine="page(1).AddView(chekpointbox(i),label(i - 9).lef";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[(int) (_i-9)].getLeft()+__ref._label[(int) (_i-9)].getWidth()),__ref._label[(int) (_i-9)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310807;
 //BA.debugLineNum = 1310807;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=1310810;
 //BA.debugLineNum = 1310810;BA.debugLine="For i = 21 To 25";
{
final int step60 = 1;
final int limit60 = (int) (25);
_i = (int) (21) ;
for (;(step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60) ;_i = ((int)(0 + _i + step60))  ) {
RDebugUtils.currentLine=1310811;
 //BA.debugLineNum = 1310811;BA.debugLine="page(1).AddView(chekpointbox(i), chekpointbox(i";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._chekpointbox[(int) (_i-5)].getLeft()+__ref._chekpointbox[(int) (_i-5)].getWidth()),__ref._chekpointbox[(int) (_i-5)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1310812;
 //BA.debugLineNum = 1310812;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Check"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=1310817;
 //BA.debugLineNum = 1310817;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.tv_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tv_judge";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Public tvPanel As Panel";
_tvpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Private page(2) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (2)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Private label(12) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (12)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="Private chekpointbox(30) As CheckBox";
_chekpointbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (30)];
{
int d0 = _chekpointbox.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="End Sub";
return "";
}
public String  _ready_click(agg.agg.tv_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tv_judge";
if (Debug.shouldDelegate(ba, "ready_click"))
	return (String) Debug.delegate(ba, "ready_click", null);
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub ready_Click";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"FinalClick");
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
}