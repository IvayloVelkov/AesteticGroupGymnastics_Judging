package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class av_judge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "agg.agg.av_judge");
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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Public Sub asView As Panel";
 //BA.debugLineNum = 158;BA.debugLine="Return avPanel";
if (true) return _avpanel;
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
int _lblheigh = 0;
int _i = 0;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub BuildUi";
 //BA.debugLineNum = 33;BA.debugLine="Container.Initialize";
_container.Initialize(ba);
 //BA.debugLineNum = 35;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
_container.AddPage((android.view.View)(_page[(int) (0)].getObject()),_main._translate._getstring("AvPage0"));
 //BA.debugLineNum = 36;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
_container.AddPage((android.view.View)(_page[(int) (1)].getObject()),_main._translate._getstring("AvPage1"));
 //BA.debugLineNum = 37;BA.debugLine="Container.AddPage(page(2), Main.translate.GetStri";
_container.AddPage((android.view.View)(_page[(int) (2)].getObject()),_main._translate._getstring("AvPage2"));
 //BA.debugLineNum = 38;BA.debugLine="Container.AddPage(page(3), Main.translate.GetStri";
_container.AddPage((android.view.View)(_page[(int) (3)].getObject()),_main._translate._getstring("AvPage3"));
 //BA.debugLineNum = 40;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
_pager.Initialize(ba,_container,"MPager");
 //BA.debugLineNum = 42;BA.debugLine="Tabs.Initialize(Pager)";
_tabs.Initialize(ba,_pager);
 //BA.debugLineNum = 43;BA.debugLine="Tabs.LineHeight = 5dip";
_tabs.setLineHeight(__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 44;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
_tabs.setLineColorCenter(__c.Colors.Red);
 //BA.debugLineNum = 45;BA.debugLine="Tabs.TextColor = Colors.Gray";
_tabs.setTextColor(__c.Colors.Gray);
 //BA.debugLineNum = 46;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
_tabs.setTextColorCenter(__c.Colors.Yellow);
 //BA.debugLineNum = 48;BA.debugLine="avPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
_avpanel.AddView((android.view.View)(_tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 51;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 53;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
 //BA.debugLineNum = 55;BA.debugLine="Line.Initialize(\"\")";
_line.Initialize(ba,"");
 //BA.debugLineNum = 56;BA.debugLine="Line.Background = Col";
_line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
 //BA.debugLineNum = 58;BA.debugLine="Line2.Initialize(\"\")";
_line2.Initialize(ba,"");
 //BA.debugLineNum = 59;BA.debugLine="Line2.Background = Col";
_line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
 //BA.debugLineNum = 61;BA.debugLine="avPanel.AddView(Line, 0dip, 35dip, avPanel.Width,";
_avpanel.AddView((android.view.View)(_line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),_avpanel.getWidth(),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 64;BA.debugLine="avPanel.AddView(Pager, 0dip, 35dip + 2dip, avPane";
_avpanel.AddView((android.view.View)(_pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),_avpanel.getWidth(),(int) (_avpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 66;BA.debugLine="avPanel.AddView(downPanel, 0, avPanel.Height - 35";
_avpanel.AddView((android.view.View)(_downpanel.getObject()),(int) (0),(int) (_avpanel.getHeight()-__c.DipToCurrent((int) (35))),_avpanel.getWidth(),(int) (_avpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 67;BA.debugLine="avPanel.AddView(Line2, 0dip, avPanel.Height - (35";
_avpanel.AddView((android.view.View)(_line2.getObject()),__c.DipToCurrent((int) (0)),(int) (_avpanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),_avpanel.getWidth(),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 69;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
_downpanel.AddView((android.view.View)(_btnready.getObject()),(int) (_downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
 //BA.debugLineNum = 71;BA.debugLine="Dim lblHeigh As Int = (avPanel.Height - downPanel";
_lblheigh = (int) ((_avpanel.getHeight()-_downpanel.getHeight())/(double)7);
 //BA.debugLineNum = 72;BA.debugLine="Log(lblHeigh)";
__c.Log(BA.NumberToString(_lblheigh));
 //BA.debugLineNum = 73;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 7%y)";
_page[(int) (0)].AddView((android.view.View)(_label[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (7),ba));
 //BA.debugLineNum = 74;BA.debugLine="label(0).Text = Main.translate.GetString(\"AVlabal";
_label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring("AVlabal0")));
 //BA.debugLineNum = 75;BA.debugLine="label(0).TextColor = Colors.White";
_label[(int) (0)].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 77;BA.debugLine="page(0).AddView(chekpointbox(0), label(0).left +";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox[(int) (0)].getObject()),(int) (_label[(int) (0)].getLeft()+_label[(int) (0)].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[(int) (0)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 78;BA.debugLine="chekpointbox(0).Text = HelperFunctions.TvScore1";
_chekpointbox[(int) (0)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 //BA.debugLineNum = 81;BA.debugLine="For i = 1 To 3";
{
final int step31 = 1;
final int limit31 = (int) (3);
_i = (int) (1) ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
 //BA.debugLineNum = 82;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
_page[(int) (0)].AddView((android.view.View)(_label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (_label[(int) (_i-1)].getTop()+_label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 83;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
_label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring("AVlabal"+BA.NumberToString(_i))));
 //BA.debugLineNum = 84;BA.debugLine="label(i).TextColor = Colors.White";
_label[_i].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 85;BA.debugLine="page(0).AddView(chekpointbox(i), label(i).left +";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox[_i].getObject()),(int) (_label[_i].getLeft()+_label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 86;BA.debugLine="chekpointbox(i).Text = HelperFunctions.TvScore1";
_chekpointbox[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 }
};
 //BA.debugLineNum = 90;BA.debugLine="page(1).AddView(label(4), 2%x, 5%y, 50%x, 7%y)";
_page[(int) (1)].AddView((android.view.View)(_label[(int) (4)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (7),ba));
 //BA.debugLineNum = 91;BA.debugLine="label(4).Text = Main.translate.GetString(\"AVlabal";
_label[(int) (4)].setText(BA.ObjectToCharSequence(_main._translate._getstring("AVlabal4")));
 //BA.debugLineNum = 92;BA.debugLine="label(4).TextColor = Colors.White";
_label[(int) (4)].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 94;BA.debugLine="page(1).AddView(chekpointbox(4), label(4).left +";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox[(int) (4)].getObject()),(int) (_label[(int) (4)].getLeft()+_label[(int) (4)].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[(int) (4)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (7),ba));
 //BA.debugLineNum = 95;BA.debugLine="chekpointbox(4).Text = HelperFunctions.TvScore1";
_chekpointbox[(int) (4)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 //BA.debugLineNum = 97;BA.debugLine="For i = 5 To 15";
{
final int step43 = 1;
final int limit43 = (int) (15);
_i = (int) (5) ;
for (;(step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43) ;_i = ((int)(0 + _i + step43))  ) {
 //BA.debugLineNum = 98;BA.debugLine="page(1).AddView(label(i), 2%x, label(i - 1).Top";
_page[(int) (1)].AddView((android.view.View)(_label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (_label[(int) (_i-1)].getTop()+_label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (7),ba));
 //BA.debugLineNum = 99;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
_label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring("AVlabal"+BA.NumberToString(_i))));
 //BA.debugLineNum = 100;BA.debugLine="label(i).TextColor = Colors.White";
_label[_i].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 101;BA.debugLine="page(1).AddView(chekpointbox(i), label(i).left +";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox[_i].getObject()),(int) (_label[_i].getLeft()+_label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 102;BA.debugLine="chekpointbox(i).Text = HelperFunctions.TvScore1";
_chekpointbox[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 }
};
 //BA.debugLineNum = 106;BA.debugLine="page(2).AddView(label(16),2%x, 5%y, 50%x, 7%y)";
_page[(int) (2)].AddView((android.view.View)(_label[(int) (16)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (7),ba));
 //BA.debugLineNum = 107;BA.debugLine="label(16).Text = Main.translate.GetString(\"AVlaba";
_label[(int) (16)].setText(BA.ObjectToCharSequence(_main._translate._getstring("AVlabal16")));
 //BA.debugLineNum = 108;BA.debugLine="label(16).TextColor = Colors.White";
_label[(int) (16)].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 109;BA.debugLine="page(2).AddView(chekpointbox(16), label(16).left";
_page[(int) (2)].AddView((android.view.View)(_chekpointbox[(int) (16)].getObject()),(int) (_label[(int) (16)].getLeft()+_label[(int) (16)].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[(int) (16)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 110;BA.debugLine="chekpointbox(16).Text = HelperFunctions.TvScore1";
_chekpointbox[(int) (16)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 //BA.debugLineNum = 113;BA.debugLine="For i = 17 To 27";
{
final int step55 = 1;
final int limit55 = (int) (27);
_i = (int) (17) ;
for (;(step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55) ;_i = ((int)(0 + _i + step55))  ) {
 //BA.debugLineNum = 114;BA.debugLine="page(2).AddView(label(i), 2%x, label(i - 1).Top";
_page[(int) (2)].AddView((android.view.View)(_label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (_label[(int) (_i-1)].getTop()+_label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (7),ba));
 //BA.debugLineNum = 115;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
_label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring("AVlabal"+BA.NumberToString(_i))));
 //BA.debugLineNum = 116;BA.debugLine="label(i).TextColor = Colors.White";
_label[_i].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 117;BA.debugLine="page(2).AddView(chekpointbox(i), label(i).left +";
_page[(int) (2)].AddView((android.view.View)(_chekpointbox[_i].getObject()),(int) (_label[_i].getLeft()+_label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 118;BA.debugLine="chekpointbox(i).Text = HelperFunctions.TvScore1";
_chekpointbox[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 }
};
 //BA.debugLineNum = 122;BA.debugLine="page(3).AddView(label(28), 2%x, 5%y, 50%x, 10%y)";
_page[(int) (3)].AddView((android.view.View)(_label[(int) (28)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 123;BA.debugLine="label(28).Text = Main.translate.GetString(\"AVlaba";
_label[(int) (28)].setText(BA.ObjectToCharSequence(_main._translate._getstring("AVlabal28")));
 //BA.debugLineNum = 124;BA.debugLine="label(28).TextColor = Colors.White";
_label[(int) (28)].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 125;BA.debugLine="page(3).AddView(chekpointbox(28), label(28).left";
_page[(int) (3)].AddView((android.view.View)(_chekpointbox[(int) (28)].getObject()),(int) (_label[(int) (28)].getLeft()+_label[(int) (28)].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[(int) (28)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 126;BA.debugLine="chekpointbox(28).Text = HelperFunctions.TvScore1";
_chekpointbox[(int) (28)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 //BA.debugLineNum = 128;BA.debugLine="For i = 29 To 33";
{
final int step67 = 1;
final int limit67 = (int) (33);
_i = (int) (29) ;
for (;(step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67) ;_i = ((int)(0 + _i + step67))  ) {
 //BA.debugLineNum = 129;BA.debugLine="page(3).AddView(label(i), 2%x, label(i - 1).Top";
_page[(int) (3)].AddView((android.view.View)(_label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (_label[(int) (_i-1)].getTop()+_label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 130;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
_label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring("AVlabal"+BA.NumberToString(_i))));
 //BA.debugLineNum = 131;BA.debugLine="label(i).TextColor = Colors.White";
_label[_i].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 132;BA.debugLine="page(3).AddView(chekpointbox(i), label(i).left +";
_page[(int) (3)].AddView((android.view.View)(_chekpointbox[_i].getObject()),(int) (_label[_i].getLeft()+_label[_i].getWidth()+__c.PerXToCurrent((float) (10),ba)),_label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 133;BA.debugLine="chekpointbox(i).Text = HelperFunctions.TvScore1";
_chekpointbox[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 }
};
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _check_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Private Sub check_CheckedChange(Checked As Boolean";
 //BA.debugLineNum = 139;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
 //BA.debugLineNum = 140;BA.debugLine="avScore = avScore + 0.1";
_avscore = _avscore+0.1;
 //BA.debugLineNum = 141;BA.debugLine="Log(avScore)";
__c.Log(BA.NumberToString(_avscore));
 }else {
 //BA.debugLineNum = 143;BA.debugLine="avScore = avScore - 0.1";
_avscore = _avscore-0.1;
 };
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public avPanel As Panel";
_avpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
 //BA.debugLineNum = 4;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
 //BA.debugLineNum = 5;BA.debugLine="Private page(4) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (4)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
 //BA.debugLineNum = 6;BA.debugLine="Private label(35) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (35)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 7;BA.debugLine="Private chekpointbox(35) As CheckBox";
_chekpointbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (35)];
{
int d0 = _chekpointbox.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
 //BA.debugLineNum = 8;BA.debugLine="Dim Tabs As AHViewPagerTabs";
_tabs = new de.amberhome.viewpager.AHViewPagerTabs();
 //BA.debugLineNum = 9;BA.debugLine="Dim Line As Panel";
_line = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Dim Line2 As Panel";
_line2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim downPanel As Panel";
_downpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim btnready As Button";
_btnready = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Public avScore As Double";
_avscore = 0;
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public double  _finalavscore() throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub finalAVscore As Double";
 //BA.debugLineNum = 148;BA.debugLine="Log(\"AVSCORE:\"&avScore)";
__c.Log("AVSCORE:"+BA.NumberToString(_avscore));
 //BA.debugLineNum = 149;BA.debugLine="Return avScore";
if (true) return _avscore;
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
int _i = 0;
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 18;BA.debugLine="avPanel.Initialize(\"\")";
_avpanel.Initialize(ba,"");
 //BA.debugLineNum = 19;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
 //BA.debugLineNum = 20;BA.debugLine="page(i).Initialize(\"\")";
_page[_i].Initialize(ba,"");
 }
};
 //BA.debugLineNum = 22;BA.debugLine="For i = 0 To 34";
{
final int step5 = 1;
final int limit5 = (int) (34);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
 //BA.debugLineNum = 23;BA.debugLine="label(i).Initialize(\"\")";
_label[_i].Initialize(ba,"");
 }
};
 //BA.debugLineNum = 25;BA.debugLine="For i = 0 To 34";
{
final int step8 = 1;
final int limit8 = (int) (34);
_i = (int) (0) ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
 //BA.debugLineNum = 26;BA.debugLine="chekpointbox(i).Initialize(\"check\")";
_chekpointbox[_i].Initialize(ba,"check");
 }
};
 //BA.debugLineNum = 28;BA.debugLine="downPanel.Initialize(\"\")";
_downpanel.Initialize(ba,"");
 //BA.debugLineNum = 29;BA.debugLine="btnready.Initialize(\"ready\")";
_btnready.Initialize(ba,"ready");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _ready_click() throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Private Sub ready_Click";
 //BA.debugLineNum = 153;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"FinalClick");
 //BA.debugLineNum = 154;BA.debugLine="finalAVscore";
_finalavscore();
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
