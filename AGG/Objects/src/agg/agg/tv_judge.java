package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tv_judge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "agg.agg.tv_judge");
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
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox2 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox3 = null;
public double _tvscore = 0;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Public Sub asView As Panel";
 //BA.debugLineNum = 197;BA.debugLine="Return tvPanel";
if (true) return _tvpanel;
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
int _i = 0;
 //BA.debugLineNum = 41;BA.debugLine="Public Sub BuildUi";
 //BA.debugLineNum = 42;BA.debugLine="Container.Initialize";
_container.Initialize(ba);
 //BA.debugLineNum = 44;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
_container.AddPage((android.view.View)(_page[(int) (0)].getObject()),_main._translate._getstring("TvPage0"));
 //BA.debugLineNum = 45;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
_container.AddPage((android.view.View)(_page[(int) (1)].getObject()),_main._translate._getstring("TvPage1"));
 //BA.debugLineNum = 47;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
_pager.Initialize(ba,_container,"MPager");
 //BA.debugLineNum = 49;BA.debugLine="Tabs.Initialize(Pager)";
_tabs.Initialize(ba,_pager);
 //BA.debugLineNum = 50;BA.debugLine="Tabs.LineHeight = 5dip";
_tabs.setLineHeight(__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 51;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
_tabs.setLineColorCenter(__c.Colors.Red);
 //BA.debugLineNum = 52;BA.debugLine="Tabs.TextColor = Colors.Gray";
_tabs.setTextColor(__c.Colors.Gray);
 //BA.debugLineNum = 53;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
_tabs.setTextColorCenter(__c.Colors.Yellow);
 //BA.debugLineNum = 55;BA.debugLine="tvPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
_tvpanel.AddView((android.view.View)(_tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 58;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 60;BA.debugLine="Col.Initialize(Colors.Green, 0)";
_col.Initialize(__c.Colors.Green,(int) (0));
 //BA.debugLineNum = 62;BA.debugLine="Line.Initialize(\"\")";
_line.Initialize(ba,"");
 //BA.debugLineNum = 63;BA.debugLine="Line.Background = Col";
_line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
 //BA.debugLineNum = 65;BA.debugLine="Line2.Initialize(\"\")";
_line2.Initialize(ba,"");
 //BA.debugLineNum = 66;BA.debugLine="Line2.Background = Col";
_line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
 //BA.debugLineNum = 68;BA.debugLine="tvPanel.AddView(Line, 0dip, 35dip, tvPanel.Width,";
_tvpanel.AddView((android.view.View)(_line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),_tvpanel.getWidth(),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 71;BA.debugLine="tvPanel.AddView(Pager, 0dip, 35dip + 2dip, tvPane";
_tvpanel.AddView((android.view.View)(_pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),_tvpanel.getWidth(),(int) (_tvpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 73;BA.debugLine="tvPanel.AddView(downPanel, 0, tvPanel.Height - 35";
_tvpanel.AddView((android.view.View)(_downpanel.getObject()),(int) (0),(int) (_tvpanel.getHeight()-__c.DipToCurrent((int) (35))),_tvpanel.getWidth(),(int) (_tvpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 74;BA.debugLine="tvPanel.AddView(Line2, 0dip, tvPanel.Height - (35";
_tvpanel.AddView((android.view.View)(_line2.getObject()),__c.DipToCurrent((int) (0)),(int) (_tvpanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),_tvpanel.getWidth(),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 76;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
_downpanel.AddView((android.view.View)(_btnready.getObject()),(int) (_downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
 //BA.debugLineNum = 79;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
_page[(int) (0)].AddView((android.view.View)(_label[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 80;BA.debugLine="label(0).Text = Main.translate.GetString(\"TVlabel";
_label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring("TVlabel0")));
 //BA.debugLineNum = 81;BA.debugLine="label(0).TextColor = Colors.White";
_label[(int) (0)].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 83;BA.debugLine="page(0).AddView(chekpointbox1(0), label(0).left +";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox1[(int) (0)].getObject()),(int) (_label[(int) (0)].getLeft()+_label[(int) (0)].getWidth()),_label[(int) (0)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 85;BA.debugLine="chekpointbox1(0).Text = HelperFunctions.TvScore1";
_chekpointbox1[(int) (0)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 //BA.debugLineNum = 86;BA.debugLine="chekpointbox1(0).Tag = 0";
_chekpointbox1[(int) (0)].setTag((Object)(0));
 //BA.debugLineNum = 87;BA.debugLine="page(0).AddView(chekpointbox2(0), chekpointbox1(0";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox2[(int) (0)].getObject()),(int) (_chekpointbox1[(int) (0)].getLeft()+_chekpointbox1[(int) (0)].getWidth()),_chekpointbox1[(int) (0)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 89;BA.debugLine="chekpointbox2(0).Tag = 0";
_chekpointbox2[(int) (0)].setTag((Object)(0));
 //BA.debugLineNum = 90;BA.debugLine="chekpointbox2(0).Text = HelperFunctions.TvScore2";
_chekpointbox2[(int) (0)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore2));
 //BA.debugLineNum = 92;BA.debugLine="For i = 1 To 5";
{
final int step31 = 1;
final int limit31 = (int) (5);
_i = (int) (1) ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
 //BA.debugLineNum = 93;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
_page[(int) (0)].AddView((android.view.View)(_label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (_label[(int) (_i-1)].getTop()+_label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 94;BA.debugLine="label(i).Text = Main.translate.GetString(\"TVlabe";
_label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring("TVlabel"+BA.NumberToString(_i))));
 //BA.debugLineNum = 95;BA.debugLine="label(i).TextColor = Colors.White";
_label[_i].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 97;BA.debugLine="page(0).AddView(chekpointbox1(i), label(i).left";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox1[_i].getObject()),(int) (_label[_i].getLeft()+_label[_i].getWidth()),_label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 99;BA.debugLine="chekpointbox1(i).Text = HelperFunctions.TvScore1";
_chekpointbox1[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 //BA.debugLineNum = 100;BA.debugLine="chekpointbox1(i).Tag = i";
_chekpointbox1[_i].setTag((Object)(_i));
 //BA.debugLineNum = 102;BA.debugLine="page(0).AddView(chekpointbox2(i), chekpointbox1(";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox2[_i].getObject()),(int) (_chekpointbox1[_i].getLeft()+_chekpointbox1[_i].getWidth()),_chekpointbox1[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 104;BA.debugLine="chekpointbox2(i).Text = HelperFunctions.TvScore2";
_chekpointbox2[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore2));
 //BA.debugLineNum = 105;BA.debugLine="chekpointbox2(i).Tag = i";
_chekpointbox2[_i].setTag((Object)(_i));
 }
};
 //BA.debugLineNum = 110;BA.debugLine="page(1).AddView(label(6), 2%x, 5%y, 50%x, 10%y)";
_page[(int) (1)].AddView((android.view.View)(_label[(int) (6)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 111;BA.debugLine="label(6).Text = Main.translate.GetString(\"TVlabel";
_label[(int) (6)].setText(BA.ObjectToCharSequence(_main._translate._getstring("TVlabel6")));
 //BA.debugLineNum = 112;BA.debugLine="label(6).TextColor = Colors.White";
_label[(int) (6)].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 114;BA.debugLine="page(1).AddView(chekpointbox1(6), label(6).left +";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox1[(int) (6)].getObject()),(int) (_label[(int) (6)].getLeft()+_label[(int) (6)].getWidth()),_label[(int) (6)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 116;BA.debugLine="chekpointbox1(6).Text = HelperFunctions.TvScore2";
_chekpointbox1[(int) (6)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore2));
 //BA.debugLineNum = 117;BA.debugLine="chekpointbox1(6).Tag = 6";
_chekpointbox1[(int) (6)].setTag((Object)(6));
 //BA.debugLineNum = 119;BA.debugLine="page(1).AddView(chekpointbox2(6), chekpointbox1(6";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox2[(int) (6)].getObject()),(int) (_chekpointbox1[(int) (6)].getLeft()+_chekpointbox1[(int) (6)].getWidth()),_chekpointbox1[(int) (6)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 121;BA.debugLine="chekpointbox2(6).Text = HelperFunctions.TvScore3";
_chekpointbox2[(int) (6)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore3));
 //BA.debugLineNum = 122;BA.debugLine="chekpointbox2(6).Tag = 6";
_chekpointbox2[(int) (6)].setTag((Object)(6));
 //BA.debugLineNum = 125;BA.debugLine="page(1).AddView(chekpointbox3(6), chekpointbox2(6";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox3[(int) (6)].getObject()),(int) (_chekpointbox2[(int) (6)].getLeft()+_chekpointbox2[(int) (6)].getWidth()),_chekpointbox2[(int) (6)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 127;BA.debugLine="chekpointbox3(6).Text = HelperFunctions.TvScore5";
_chekpointbox3[(int) (6)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore5));
 //BA.debugLineNum = 128;BA.debugLine="chekpointbox3(6).Tag = 6";
_chekpointbox3[(int) (6)].setTag((Object)(6));
 //BA.debugLineNum = 131;BA.debugLine="For i = 7 To 11";
{
final int step54 = 1;
final int limit54 = (int) (11);
_i = (int) (7) ;
for (;(step54 > 0 && _i <= limit54) || (step54 < 0 && _i >= limit54) ;_i = ((int)(0 + _i + step54))  ) {
 //BA.debugLineNum = 132;BA.debugLine="page(1).AddView(label(i), 2%x, label(i - 1).Top";
_page[(int) (1)].AddView((android.view.View)(_label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (_label[(int) (_i-1)].getTop()+_label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 133;BA.debugLine="label(i).Text = Main.translate.GetString(\"TVlabe";
_label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring("TVlabel"+BA.NumberToString(_i))));
 //BA.debugLineNum = 134;BA.debugLine="label(i).TextColor = Colors.White";
_label[_i].setTextColor(__c.Colors.White);
 }
};
 //BA.debugLineNum = 137;BA.debugLine="For i = 7 To 11";
{
final int step59 = 1;
final int limit59 = (int) (11);
_i = (int) (7) ;
for (;(step59 > 0 && _i <= limit59) || (step59 < 0 && _i >= limit59) ;_i = ((int)(0 + _i + step59))  ) {
 //BA.debugLineNum = 138;BA.debugLine="page(1).AddView(chekpointbox1(i),label(i).left +";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox1[_i].getObject()),(int) (_label[_i].getLeft()+_label[_i].getWidth()),_label[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 140;BA.debugLine="chekpointbox1(i).Text = HelperFunctions.TvScore2";
_chekpointbox1[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore2));
 //BA.debugLineNum = 141;BA.debugLine="chekpointbox1(i).Tag = i";
_chekpointbox1[_i].setTag((Object)(_i));
 //BA.debugLineNum = 143;BA.debugLine="page(1).AddView(chekpointbox2(i),chekpointbox1(i";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox2[_i].getObject()),(int) (_chekpointbox1[_i].getLeft()+_chekpointbox1[_i].getWidth()),_chekpointbox1[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 145;BA.debugLine="chekpointbox2(i).Text = HelperFunctions.TvScore3";
_chekpointbox2[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore3));
 //BA.debugLineNum = 146;BA.debugLine="chekpointbox2(i).Tag = i";
_chekpointbox2[_i].setTag((Object)(_i));
 //BA.debugLineNum = 148;BA.debugLine="page(1).AddView(chekpointbox3(i), chekpointbox2(";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox3[_i].getObject()),(int) (_chekpointbox2[_i].getLeft()+_chekpointbox2[_i].getWidth()),_chekpointbox2[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 150;BA.debugLine="chekpointbox3(i).Text = HelperFunctions.TvScore5";
_chekpointbox3[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore5));
 //BA.debugLineNum = 151;BA.debugLine="chekpointbox3(i).Tag = i";
_chekpointbox3[_i].setTag((Object)(_i));
 }
};
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _check1_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chek1 = null;
 //BA.debugLineNum = 157;BA.debugLine="Private Sub check1_CheckedChange(Checked As Boolea";
 //BA.debugLineNum = 158;BA.debugLine="Private chek1 As CheckBox = Sender";
_chek1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_chek1.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 159;BA.debugLine="chek1 = Sender";
_chek1.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 160;BA.debugLine="If chek1.Checked = True Then";
if (_chek1.getChecked()==__c.True) { 
 //BA.debugLineNum = 161;BA.debugLine="tvScore = tvScore + 0.1";
_tvscore = _tvscore+0.1;
 }else {
 //BA.debugLineNum = 163;BA.debugLine="tvScore = tvScore - 0.1";
_tvscore = _tvscore-0.1;
 };
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _check2_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chek2 = null;
 //BA.debugLineNum = 167;BA.debugLine="Private Sub check2_CheckedChange(Checked As Boolea";
 //BA.debugLineNum = 168;BA.debugLine="Private chek2 As CheckBox";
_chek2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 169;BA.debugLine="chek2 = Sender";
_chek2.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 170;BA.debugLine="If chek2.Checked = True Then";
if (_chek2.getChecked()==__c.True) { 
 //BA.debugLineNum = 171;BA.debugLine="tvScore = tvScore + 0.2";
_tvscore = _tvscore+0.2;
 }else {
 //BA.debugLineNum = 173;BA.debugLine="tvScore = tvScore - 0.2";
_tvscore = _tvscore-0.2;
 };
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _check3_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chek3 = null;
 //BA.debugLineNum = 177;BA.debugLine="Private Sub check3_CheckedChange(Checked As Boolea";
 //BA.debugLineNum = 178;BA.debugLine="Private chek3 As CheckBox = Sender";
_chek3 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_chek3.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 179;BA.debugLine="chek3 = Sender";
_chek3.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 180;BA.debugLine="If chek3.Checked = True Then";
if (_chek3.getChecked()==__c.True) { 
 //BA.debugLineNum = 181;BA.debugLine="tvScore = tvScore + 0.3";
_tvscore = _tvscore+0.3;
 }else {
 //BA.debugLineNum = 183;BA.debugLine="tvScore = tvScore - 0.3";
_tvscore = _tvscore-0.3;
 };
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public tvPanel As Panel";
_tvpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Public Pager As AHViewPager";
_pager = new de.amberhome.viewpager.AHViewPager();
 //BA.debugLineNum = 4;BA.debugLine="Public Container As AHPageContainer";
_container = new de.amberhome.viewpager.AHPageContainer();
 //BA.debugLineNum = 5;BA.debugLine="Private page(2) As Panel";
_page = new anywheresoftware.b4a.objects.PanelWrapper[(int) (2)];
{
int d0 = _page.length;
for (int i0 = 0;i0 < d0;i0++) {
_page[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
 //BA.debugLineNum = 6;BA.debugLine="Private label(12) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (12)];
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
 //BA.debugLineNum = 12;BA.debugLine="Private chekpointbox1(12) As CheckBox";
_chekpointbox1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (12)];
{
int d0 = _chekpointbox1.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox1[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
 //BA.debugLineNum = 13;BA.debugLine="Private chekpointbox2(12) As CheckBox";
_chekpointbox2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (12)];
{
int d0 = _chekpointbox2.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox2[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
 //BA.debugLineNum = 14;BA.debugLine="Private chekpointbox3(12) As CheckBox";
_chekpointbox3 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (12)];
{
int d0 = _chekpointbox3.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox3[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
 //BA.debugLineNum = 15;BA.debugLine="Public tvScore As Double";
_tvscore = 0;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public double  _finaltvscore() throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Public Sub finalTVscore As Double";
 //BA.debugLineNum = 187;BA.debugLine="Log(\"AVSCORE:\"&tvScore)";
__c.Log("AVSCORE:"+BA.NumberToString(_tvscore));
 //BA.debugLineNum = 188;BA.debugLine="Return tvScore";
if (true) return _tvscore;
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
int _i = 0;
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 20;BA.debugLine="tvPanel.Initialize(\"\")";
_tvpanel.Initialize(ba,"");
 //BA.debugLineNum = 21;BA.debugLine="For i = 0 To 1";
{
final int step2 = 1;
final int limit2 = (int) (1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
 //BA.debugLineNum = 22;BA.debugLine="page(i).Initialize(\"\")";
_page[_i].Initialize(ba,"");
 }
};
 //BA.debugLineNum = 24;BA.debugLine="For i = 0 To 11";
{
final int step5 = 1;
final int limit5 = (int) (11);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
 //BA.debugLineNum = 25;BA.debugLine="label(i).Initialize(\"\")";
_label[_i].Initialize(ba,"");
 }
};
 //BA.debugLineNum = 27;BA.debugLine="For i = 0 To 11";
{
final int step8 = 1;
final int limit8 = (int) (11);
_i = (int) (0) ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
 //BA.debugLineNum = 28;BA.debugLine="chekpointbox1(i).Initialize(\"check1\")";
_chekpointbox1[_i].Initialize(ba,"check1");
 }
};
 //BA.debugLineNum = 30;BA.debugLine="For i = 0 To 11";
{
final int step11 = 1;
final int limit11 = (int) (11);
_i = (int) (0) ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
 //BA.debugLineNum = 31;BA.debugLine="chekpointbox2(i).Initialize(\"check2\")";
_chekpointbox2[_i].Initialize(ba,"check2");
 }
};
 //BA.debugLineNum = 33;BA.debugLine="For i = 0 To 11";
{
final int step14 = 1;
final int limit14 = (int) (11);
_i = (int) (0) ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
 //BA.debugLineNum = 34;BA.debugLine="chekpointbox3(i).Initialize(\"check3\")";
_chekpointbox3[_i].Initialize(ba,"check3");
 }
};
 //BA.debugLineNum = 37;BA.debugLine="downPanel.Initialize(\"\")";
_downpanel.Initialize(ba,"");
 //BA.debugLineNum = 38;BA.debugLine="btnready.Initialize(\"ready\")";
_btnready.Initialize(ba,"ready");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _ready_click() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Private Sub ready_Click";
 //BA.debugLineNum = 192;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"FinalClick");
 //BA.debugLineNum = 193;BA.debugLine="finalTVscore";
_finaltvscore();
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
