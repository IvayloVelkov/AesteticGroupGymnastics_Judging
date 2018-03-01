package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class av_judge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.av_judge");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.av_judge.class).invoke(this, new Object[] {null});
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
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public String  _initialize(b4a.example.av_judge __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
int _i = 0;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="avPanel.Initialize(\"\")";
__ref._avpanel.Initialize(ba,"");
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="page(i).Initialize(\"\")";
__ref._page[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="For i = 0 To 34";
{
final int step5 = 1;
final int limit5 = (int) (34);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="label(i).Initialize(\"\")";
__ref._label[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="For i = 0 To 34";
{
final int step8 = 1;
final int limit8 = (int) (34);
_i = (int) (0) ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="chekpointbox(i).Initialize(\"\")";
__ref._chekpointbox[_i].Initialize(ba,"");
 }
};
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="downPanel.Initialize(\"\")";
__ref._downpanel.Initialize(ba,"");
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="btnready.Initialize(\"ready\")";
__ref._btnready.Initialize(ba,"ready");
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub asView As Panel";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Return avPanel";
if (true) return __ref._avpanel;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return null;
}
public String  _buildui(b4a.example.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
int _lblheigh = 0;
int _i = 0;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub BuildUi";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Container.Initialize";
__ref._container.Initialize(ba);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (0)].getObject()),_main._translate._getstring(null,"AvPage0"));
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (1)].getObject()),_main._translate._getstring(null,"AvPage1"));
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Container.AddPage(page(2), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (2)].getObject()),_main._translate._getstring(null,"AvPage2"));
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Container.AddPage(page(3), Main.translate.GetStri";
__ref._container.AddPage((android.view.View)(__ref._page[(int) (3)].getObject()),_main._translate._getstring(null,"AvPage3"));
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
__ref._pager.Initialize(ba,__ref._container,"MPager");
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="Tabs.Initialize(Pager)";
__ref._tabs.Initialize(ba,__ref._pager);
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="Tabs.LineHeight = 5dip";
__ref._tabs.setLineHeight(__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
__ref._tabs.setLineColorCenter(__c.Colors.Red);
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Tabs.TextColor = Colors.Gray";
__ref._tabs.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
__ref._tabs.setTextColorCenter(__c.Colors.Yellow);
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="avPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
__ref._avpanel.AddView((android.view.View)(__ref._tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2162709;
 //BA.debugLineNum = 2162709;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
RDebugUtils.currentLine=2162711;
 //BA.debugLineNum = 2162711;BA.debugLine="Line.Initialize(\"\")";
__ref._line.Initialize(ba,"");
RDebugUtils.currentLine=2162712;
 //BA.debugLineNum = 2162712;BA.debugLine="Line.Background = Col";
__ref._line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=2162714;
 //BA.debugLineNum = 2162714;BA.debugLine="Line2.Initialize(\"\")";
__ref._line2.Initialize(ba,"");
RDebugUtils.currentLine=2162715;
 //BA.debugLineNum = 2162715;BA.debugLine="Line2.Background = Col";
__ref._line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
RDebugUtils.currentLine=2162717;
 //BA.debugLineNum = 2162717;BA.debugLine="avPanel.AddView(Line, 0dip, 35dip, avPanel.Width,";
__ref._avpanel.AddView((android.view.View)(__ref._line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__ref._avpanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=2162720;
 //BA.debugLineNum = 2162720;BA.debugLine="avPanel.AddView(Pager, 0dip, 35dip + 2dip, avPane";
__ref._avpanel.AddView((android.view.View)(__ref._pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),__ref._avpanel.getWidth(),(int) (__ref._avpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2162722;
 //BA.debugLineNum = 2162722;BA.debugLine="avPanel.AddView(downPanel, 0, avPanel.Height - 35";
__ref._avpanel.AddView((android.view.View)(__ref._downpanel.getObject()),(int) (0),(int) (__ref._avpanel.getHeight()-__c.DipToCurrent((int) (35))),__ref._avpanel.getWidth(),(int) (__ref._avpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2162723;
 //BA.debugLineNum = 2162723;BA.debugLine="avPanel.AddView(Line2, 0dip, avPanel.Height - (35";
__ref._avpanel.AddView((android.view.View)(__ref._line2.getObject()),__c.DipToCurrent((int) (0)),(int) (__ref._avpanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),__ref._avpanel.getWidth(),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=2162725;
 //BA.debugLineNum = 2162725;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
__ref._downpanel.AddView((android.view.View)(__ref._btnready.getObject()),(int) (__ref._downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
RDebugUtils.currentLine=2162727;
 //BA.debugLineNum = 2162727;BA.debugLine="Dim lblHeigh As Int = (avPanel.Height - downPanel";
_lblheigh = (int) ((__ref._avpanel.getHeight()-__ref._downpanel.getHeight())/(double)7);
RDebugUtils.currentLine=2162728;
 //BA.debugLineNum = 2162728;BA.debugLine="Log(lblHeigh)";
__c.Log(BA.NumberToString(_lblheigh));
RDebugUtils.currentLine=2162729;
 //BA.debugLineNum = 2162729;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162730;
 //BA.debugLineNum = 2162730;BA.debugLine="label(0).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal0")));
RDebugUtils.currentLine=2162731;
 //BA.debugLineNum = 2162731;BA.debugLine="label(0).TextColor = Colors.White";
__ref._label[(int) (0)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2162733;
 //BA.debugLineNum = 2162733;BA.debugLine="page(0).AddView(chekpointbox(0), label(0).left +";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[(int) (0)].getObject()),(int) (__ref._label[(int) (0)].getLeft()+__ref._label[(int) (0)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (0)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162734;
 //BA.debugLineNum = 2162734;BA.debugLine="chekpointbox(0).Text = Main.translate.GetString(\"";
__ref._chekpointbox[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl0")));
RDebugUtils.currentLine=2162737;
 //BA.debugLineNum = 2162737;BA.debugLine="For i = 1 To 7";
{
final int step31 = 1;
final int limit31 = (int) (7);
_i = (int) (1) ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
RDebugUtils.currentLine=2162738;
 //BA.debugLineNum = 2162738;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162739;
 //BA.debugLineNum = 2162739;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2162740;
 //BA.debugLineNum = 2162740;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2162741;
 //BA.debugLineNum = 2162741;BA.debugLine="page(0).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (0)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162742;
 //BA.debugLineNum = 2162742;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=2162746;
 //BA.debugLineNum = 2162746;BA.debugLine="page(1).AddView(label(8), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[(int) (8)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162747;
 //BA.debugLineNum = 2162747;BA.debugLine="label(8).Text = Main.translate.GetString(\"AVlabal";
__ref._label[(int) (8)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal8")));
RDebugUtils.currentLine=2162748;
 //BA.debugLineNum = 2162748;BA.debugLine="label(8).TextColor = Colors.White";
__ref._label[(int) (8)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2162750;
 //BA.debugLineNum = 2162750;BA.debugLine="page(1).AddView(chekpointbox(8), label(8).left +";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[(int) (8)].getObject()),(int) (__ref._label[(int) (8)].getLeft()+__ref._label[(int) (8)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (8)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162751;
 //BA.debugLineNum = 2162751;BA.debugLine="chekpointbox(8).Text = Main.translate.GetString(\"";
__ref._chekpointbox[(int) (8)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl8")));
RDebugUtils.currentLine=2162753;
 //BA.debugLineNum = 2162753;BA.debugLine="For i = 9 To 15";
{
final int step43 = 1;
final int limit43 = (int) (15);
_i = (int) (9) ;
for (;(step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43) ;_i = ((int)(0 + _i + step43))  ) {
RDebugUtils.currentLine=2162754;
 //BA.debugLineNum = 2162754;BA.debugLine="page(1).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162755;
 //BA.debugLineNum = 2162755;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2162756;
 //BA.debugLineNum = 2162756;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2162757;
 //BA.debugLineNum = 2162757;BA.debugLine="page(1).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (1)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162758;
 //BA.debugLineNum = 2162758;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=2162762;
 //BA.debugLineNum = 2162762;BA.debugLine="page(2).AddView(label(16),2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._label[(int) (16)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162763;
 //BA.debugLineNum = 2162763;BA.debugLine="label(16).Text = Main.translate.GetString(\"AVlaba";
__ref._label[(int) (16)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal17")));
RDebugUtils.currentLine=2162764;
 //BA.debugLineNum = 2162764;BA.debugLine="label(16).TextColor = Colors.White";
__ref._label[(int) (16)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2162765;
 //BA.debugLineNum = 2162765;BA.debugLine="page(2).AddView(chekpointbox(16), label(16).left";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._chekpointbox[(int) (16)].getObject()),(int) (__ref._label[(int) (16)].getLeft()+__ref._label[(int) (16)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (16)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162766;
 //BA.debugLineNum = 2162766;BA.debugLine="chekpointbox(16).Text = Main.translate.GetString(";
__ref._chekpointbox[(int) (16)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl8")));
RDebugUtils.currentLine=2162769;
 //BA.debugLineNum = 2162769;BA.debugLine="For i = 17 To 23";
{
final int step55 = 1;
final int limit55 = (int) (23);
_i = (int) (17) ;
for (;(step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55) ;_i = ((int)(0 + _i + step55))  ) {
RDebugUtils.currentLine=2162770;
 //BA.debugLineNum = 2162770;BA.debugLine="page(2).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162771;
 //BA.debugLineNum = 2162771;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2162772;
 //BA.debugLineNum = 2162772;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2162773;
 //BA.debugLineNum = 2162773;BA.debugLine="page(2).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (2)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162774;
 //BA.debugLineNum = 2162774;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=2162778;
 //BA.debugLineNum = 2162778;BA.debugLine="page(3).AddView(label(24), 2%x, 5%y, 50%x, 10%y)";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._label[(int) (24)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162779;
 //BA.debugLineNum = 2162779;BA.debugLine="label(24).Text = Main.translate.GetString(\"AVlaba";
__ref._label[(int) (24)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal26")));
RDebugUtils.currentLine=2162780;
 //BA.debugLineNum = 2162780;BA.debugLine="label(24).TextColor = Colors.White";
__ref._label[(int) (24)].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2162781;
 //BA.debugLineNum = 2162781;BA.debugLine="page(3).AddView(chekpointbox(24), label(24).left";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._chekpointbox[(int) (24)].getObject()),(int) (__ref._label[(int) (24)].getLeft()+__ref._label[(int) (24)].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[(int) (24)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162782;
 //BA.debugLineNum = 2162782;BA.debugLine="chekpointbox(24).Text = Main.translate.GetString(";
__ref._chekpointbox[(int) (24)].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl8")));
RDebugUtils.currentLine=2162784;
 //BA.debugLineNum = 2162784;BA.debugLine="For i = 25 To 31";
{
final int step67 = 1;
final int limit67 = (int) (31);
_i = (int) (25) ;
for (;(step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67) ;_i = ((int)(0 + _i + step67))  ) {
RDebugUtils.currentLine=2162785;
 //BA.debugLineNum = 2162785;BA.debugLine="page(3).AddView(label(i), 2%x, label(i - 1).Top";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (__ref._label[(int) (_i-1)].getTop()+__ref._label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162786;
 //BA.debugLineNum = 2162786;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
__ref._label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"AVlabal"+BA.NumberToString(_i))));
RDebugUtils.currentLine=2162787;
 //BA.debugLineNum = 2162787;BA.debugLine="label(i).TextColor = Colors.White";
__ref._label[_i].setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2162788;
 //BA.debugLineNum = 2162788;BA.debugLine="page(3).AddView(chekpointbox(i), label(i).left +";
__ref._page[(int) (3)].AddView((android.view.View)(__ref._chekpointbox[_i].getObject()),(int) (__ref._label[_i].getLeft()+__ref._label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),__ref._label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162789;
 //BA.debugLineNum = 2162789;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
__ref._chekpointbox[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"Checkl"+BA.NumberToString(_i))));
 }
};
RDebugUtils.currentLine=2162792;
 //BA.debugLineNum = 2162792;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Public avPanel As Panel";
_avpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Private page(4) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (4)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Private label(35) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (35)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Private chekpointbox(35) As CheckBox";
_chekpointbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (35)];
{
int d0 = _chekpointbox.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="End Sub";
return "";
}
public String  _ready_click(b4a.example.av_judge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="av_judge";
if (Debug.shouldDelegate(ba, "ready_click"))
	return (String) Debug.delegate(ba, "ready_click", null);
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub ready_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"FinalClick");
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
}