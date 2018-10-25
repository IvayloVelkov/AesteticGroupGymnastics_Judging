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
public anywheresoftware.b4a.objects.LabelWrapper[] _label2 = null;
public de.amberhome.viewpager.AHViewPagerTabs _tabs = null;
public anywheresoftware.b4a.objects.PanelWrapper _line = null;
public anywheresoftware.b4a.objects.PanelWrapper _line2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _downpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnready = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox2 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox22 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox3 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _chekpointbox32 = null;
public double _tvscore = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Public Sub asView As Panel";
 //BA.debugLineNum = 271;BA.debugLine="Return tvPanel";
if (true) return _tvpanel;
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _col = null;
int _i = 0;
 //BA.debugLineNum = 58;BA.debugLine="Public Sub BuildUi";
 //BA.debugLineNum = 59;BA.debugLine="Container.Initialize";
_container.Initialize(ba);
 //BA.debugLineNum = 61;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
_container.AddPage((android.view.View)(_page[(int) (0)].getObject()),_main._translate._getstring("TvPage0"));
 //BA.debugLineNum = 62;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
_container.AddPage((android.view.View)(_page[(int) (1)].getObject()),_main._translate._getstring("TvPage1"));
 //BA.debugLineNum = 64;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
_pager.Initialize(ba,_container,"MPager");
 //BA.debugLineNum = 66;BA.debugLine="Tabs.Initialize(Pager)";
_tabs.Initialize(ba,_pager);
 //BA.debugLineNum = 67;BA.debugLine="Tabs.LineHeight = 5dip";
_tabs.setLineHeight(__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 68;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
_tabs.setLineColorCenter(__c.Colors.Red);
 //BA.debugLineNum = 69;BA.debugLine="Tabs.TextColor = Colors.Gray";
_tabs.setTextColor(__c.Colors.Gray);
 //BA.debugLineNum = 70;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
_tabs.setTextColorCenter(__c.Colors.Yellow);
 //BA.debugLineNum = 72;BA.debugLine="tvPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
_tvpanel.AddView((android.view.View)(_tabs.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 75;BA.debugLine="Dim Col As ColorDrawable";
_col = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 77;BA.debugLine="Col.Initialize(0xff149be0, 0)";
_col.Initialize((int) (0xff149be0),(int) (0));
 //BA.debugLineNum = 79;BA.debugLine="Line.Initialize(\"\")";
_line.Initialize(ba,"");
 //BA.debugLineNum = 80;BA.debugLine="Line.Background = Col";
_line.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
 //BA.debugLineNum = 82;BA.debugLine="Line2.Initialize(\"\")";
_line2.Initialize(ba,"");
 //BA.debugLineNum = 83;BA.debugLine="Line2.Background = Col";
_line2.setBackground((android.graphics.drawable.Drawable)(_col.getObject()));
 //BA.debugLineNum = 85;BA.debugLine="tvPanel.AddView(Line, 0dip, 35dip, tvPanel.Width,";
_tvpanel.AddView((android.view.View)(_line.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),_tvpanel.getWidth(),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 88;BA.debugLine="tvPanel.AddView(Pager, 0dip, 35dip + 2dip, tvPane";
_tvpanel.AddView((android.view.View)(_pager.getObject()),__c.DipToCurrent((int) (0)),(int) (__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2))),_tvpanel.getWidth(),(int) (_tvpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 90;BA.debugLine="tvPanel.AddView(downPanel, 0, tvPanel.Height - 35";
_tvpanel.AddView((android.view.View)(_downpanel.getObject()),(int) (0),(int) (_tvpanel.getHeight()-__c.DipToCurrent((int) (35))),_tvpanel.getWidth(),(int) (_tvpanel.getHeight()-__c.DipToCurrent((int) (35))-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 91;BA.debugLine="tvPanel.AddView(Line2, 0dip, tvPanel.Height - (35";
_tvpanel.AddView((android.view.View)(_line2.getObject()),__c.DipToCurrent((int) (0)),(int) (_tvpanel.getHeight()-(__c.DipToCurrent((int) (35))+__c.DipToCurrent((int) (2)))),_tvpanel.getWidth(),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 93;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
_downpanel.AddView((android.view.View)(_btnready.getObject()),(int) (_downpanel.getWidth()-__c.PerXToCurrent((float) (12),ba)),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (33)));
 //BA.debugLineNum = 96;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
_page[(int) (0)].AddView((android.view.View)(_label[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 97;BA.debugLine="label(0).Text = Main.translate.GetString(\"TVlabel";
_label[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring("TVlabel0")));
 //BA.debugLineNum = 98;BA.debugLine="label(0).TextColor = Colors.White";
_label[(int) (0)].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 100;BA.debugLine="page(0).AddView(chekpointbox1(0), label(0).left +";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox1[(int) (0)].getObject()),(int) (_label[(int) (0)].getLeft()+_label[(int) (0)].getWidth()),_label[(int) (0)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 102;BA.debugLine="chekpointbox1(0).Text = HelperFunctions.TvScore1";
_chekpointbox1[(int) (0)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 //BA.debugLineNum = 103;BA.debugLine="chekpointbox1(0).Tag = 0";
_chekpointbox1[(int) (0)].setTag((Object)(0));
 //BA.debugLineNum = 104;BA.debugLine="page(0).AddView(chekpointbox2(0), chekpointbox1(0";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox2[(int) (0)].getObject()),(int) (_chekpointbox1[(int) (0)].getLeft()+_chekpointbox1[(int) (0)].getWidth()),_chekpointbox1[(int) (0)].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 106;BA.debugLine="chekpointbox2(0).Tag = 0";
_chekpointbox2[(int) (0)].setTag((Object)(0));
 //BA.debugLineNum = 107;BA.debugLine="chekpointbox2(0).Text = HelperFunctions.TvScore2";
_chekpointbox2[(int) (0)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore2));
 //BA.debugLineNum = 109;BA.debugLine="For i = 1 To 5";
{
final int step31 = 1;
final int limit31 = (int) (5);
_i = (int) (1) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
 //BA.debugLineNum = 110;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
_page[(int) (0)].AddView((android.view.View)(_label[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (_label[(int) (_i-1)].getTop()+_label[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 111;BA.debugLine="label(i).Text = Main.translate.GetString(\"TVlabe";
_label[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring("TVlabel"+BA.NumberToString(_i))));
 //BA.debugLineNum = 112;BA.debugLine="label(i).TextColor = Colors.White";
_label[_i].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 114;BA.debugLine="page(0).AddView(chekpointbox1(i), label(i).left";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox1[_i].getObject()),(int) (_label[_i].getLeft()+_label[_i].getWidth()),_label[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 116;BA.debugLine="chekpointbox1(i).Text = HelperFunctions.TvScore1";
_chekpointbox1[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore1));
 //BA.debugLineNum = 117;BA.debugLine="chekpointbox1(i).Tag = i";
_chekpointbox1[_i].setTag((Object)(_i));
 //BA.debugLineNum = 119;BA.debugLine="page(0).AddView(chekpointbox2(i), chekpointbox1(";
_page[(int) (0)].AddView((android.view.View)(_chekpointbox2[_i].getObject()),(int) (_chekpointbox1[_i].getLeft()+_chekpointbox1[_i].getWidth()),_chekpointbox1[_i].getTop(),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 121;BA.debugLine="chekpointbox2(i).Text = HelperFunctions.TvScore2";
_chekpointbox2[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore2));
 //BA.debugLineNum = 122;BA.debugLine="chekpointbox2(i).Tag = i";
_chekpointbox2[_i].setTag((Object)(_i));
 }
};
 //BA.debugLineNum = 127;BA.debugLine="page(1).AddView(label2(0), 2%x, 5%y, 50%x, 10%y)";
_page[(int) (1)].AddView((android.view.View)(_label2[(int) (0)].getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 128;BA.debugLine="label2(0).Text = Main.translate.GetString(\"TVlabe";
_label2[(int) (0)].setText(BA.ObjectToCharSequence(_main._translate._getstring("TVlabel6")));
 //BA.debugLineNum = 129;BA.debugLine="label2(0).TextColor = Colors.White";
_label2[(int) (0)].setTextColor(__c.Colors.White);
 //BA.debugLineNum = 131;BA.debugLine="page(1).AddView(chekpointbox22(0), label2(0).left";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox22[(int) (0)].getObject()),(int) (_label2[(int) (0)].getLeft()+_label2[(int) (0)].getWidth()),_label2[(int) (0)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 133;BA.debugLine="chekpointbox22(0).Text = HelperFunctions.TvScore2";
_chekpointbox22[(int) (0)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore2));
 //BA.debugLineNum = 134;BA.debugLine="chekpointbox22(0).Tag = 0";
_chekpointbox22[(int) (0)].setTag((Object)(0));
 //BA.debugLineNum = 136;BA.debugLine="page(1).AddView(chekpointbox3(0), chekpointbox22(";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox3[(int) (0)].getObject()),(int) (_chekpointbox22[(int) (0)].getLeft()+_chekpointbox22[(int) (0)].getWidth()),_chekpointbox22[(int) (0)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 138;BA.debugLine="chekpointbox3(0).Text = HelperFunctions.TvScore3";
_chekpointbox3[(int) (0)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore3));
 //BA.debugLineNum = 139;BA.debugLine="chekpointbox3(0).Tag = 0";
_chekpointbox3[(int) (0)].setTag((Object)(0));
 //BA.debugLineNum = 142;BA.debugLine="page(1).AddView(chekpointbox32(0), chekpointbox3(";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox32[(int) (0)].getObject()),(int) (_chekpointbox3[(int) (0)].getLeft()+_chekpointbox3[(int) (0)].getWidth()),_chekpointbox3[(int) (0)].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 144;BA.debugLine="chekpointbox32(0).Text = HelperFunctions.TvScore5";
_chekpointbox32[(int) (0)].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore5));
 //BA.debugLineNum = 145;BA.debugLine="chekpointbox32(0).Tag = 0";
_chekpointbox32[(int) (0)].setTag((Object)(0));
 //BA.debugLineNum = 148;BA.debugLine="For i = 1 To 5";
{
final int step54 = 1;
final int limit54 = (int) (5);
_i = (int) (1) ;
for (;_i <= limit54 ;_i = _i + step54 ) {
 //BA.debugLineNum = 149;BA.debugLine="page(1).AddView(label2(i), 2%x, label2(i - 1).To";
_page[(int) (1)].AddView((android.view.View)(_label2[_i].getObject()),__c.PerXToCurrent((float) (2),ba),(int) (_label2[(int) (_i-1)].getTop()+_label2[(int) (_i-1)].getHeight()+__c.DipToCurrent((int) (3))),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 150;BA.debugLine="label2(i).Text = Main.translate.GetString(\"TVlab";
_label2[_i].setText(BA.ObjectToCharSequence(_main._translate._getstring("TVlabel"+BA.NumberToString(_i))));
 //BA.debugLineNum = 151;BA.debugLine="label2(i).TextColor = Colors.White";
_label2[_i].setTextColor(__c.Colors.White);
 }
};
 //BA.debugLineNum = 154;BA.debugLine="For i = 1 To 5";
{
final int step59 = 1;
final int limit59 = (int) (5);
_i = (int) (1) ;
for (;_i <= limit59 ;_i = _i + step59 ) {
 //BA.debugLineNum = 155;BA.debugLine="page(1).AddView(chekpointbox22(i),label2(i).left";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox22[_i].getObject()),(int) (_label2[_i].getLeft()+_label2[_i].getWidth()),_label2[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 157;BA.debugLine="chekpointbox22(i).Text = HelperFunctions.TvScore";
_chekpointbox22[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore2));
 //BA.debugLineNum = 158;BA.debugLine="chekpointbox22(i).Tag = i";
_chekpointbox22[_i].setTag((Object)(_i));
 //BA.debugLineNum = 160;BA.debugLine="page(1).AddView(chekpointbox3(i),chekpointbox22(";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox3[_i].getObject()),(int) (_chekpointbox22[_i].getLeft()+_chekpointbox22[_i].getWidth()),_chekpointbox22[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 162;BA.debugLine="chekpointbox3(i).Text = HelperFunctions.TvScore3";
_chekpointbox3[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore3));
 //BA.debugLineNum = 163;BA.debugLine="chekpointbox3(i).Tag = i";
_chekpointbox3[_i].setTag((Object)(_i));
 //BA.debugLineNum = 165;BA.debugLine="page(1).AddView(chekpointbox32(i), chekpointbox3";
_page[(int) (1)].AddView((android.view.View)(_chekpointbox32[_i].getObject()),(int) (_chekpointbox3[_i].getLeft()+_chekpointbox3[_i].getWidth()),_chekpointbox3[_i].getTop(),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 167;BA.debugLine="chekpointbox32(i).Text = HelperFunctions.TvScore";
_chekpointbox32[_i].setText(BA.ObjectToCharSequence(_helperfunctions._tvscore5));
 //BA.debugLineNum = 168;BA.debugLine="chekpointbox32(i).Tag = i";
_chekpointbox32[_i].setTag((Object)(_i));
 }
};
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public String  _check1_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chek1 = null;
 //BA.debugLineNum = 174;BA.debugLine="Private Sub check1_CheckedChange(checked As Boolea";
 //BA.debugLineNum = 175;BA.debugLine="Private chek1 As CheckBox = Sender";
_chek1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_chek1.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 176;BA.debugLine="chek1 = Sender";
_chek1.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 177;BA.debugLine="If chek1.Checked = True Then";
if (_chek1.getChecked()==__c.True) { 
 //BA.debugLineNum = 178;BA.debugLine="tvScore = tvScore + 0.1";
_tvscore = _tvscore+0.1;
 //BA.debugLineNum = 179;BA.debugLine="If chekpointbox2(chek1.Tag).Checked = True Then";
if (_chekpointbox2[(int)(BA.ObjectToNumber(_chek1.getTag()))].getChecked()==__c.True) { 
 //BA.debugLineNum = 180;BA.debugLine="tvScore = tvScore - 0.2";
_tvscore = _tvscore-0.2;
 //BA.debugLineNum = 181;BA.debugLine="chekpointbox2(chek1.Tag).Checked = False";
_chekpointbox2[(int)(BA.ObjectToNumber(_chek1.getTag()))].setChecked(__c.False);
 };
 }else {
 //BA.debugLineNum = 185;BA.debugLine="tvScore = tvScore - 0.1";
_tvscore = _tvscore-0.1;
 };
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _check2_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chek2 = null;
 //BA.debugLineNum = 189;BA.debugLine="Private Sub check2_CheckedChange(checked As Boolea";
 //BA.debugLineNum = 190;BA.debugLine="Private chek2 As CheckBox";
_chek2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 191;BA.debugLine="chek2 = Sender";
_chek2.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 193;BA.debugLine="If chek2.Checked = True Then";
if (_chek2.getChecked()==__c.True) { 
 //BA.debugLineNum = 194;BA.debugLine="tvScore = tvScore + 0.2";
_tvscore = _tvscore+0.2;
 //BA.debugLineNum = 195;BA.debugLine="If chekpointbox1(chek2.Tag).Checked = True Then";
if (_chekpointbox1[(int)(BA.ObjectToNumber(_chek2.getTag()))].getChecked()==__c.True) { 
 //BA.debugLineNum = 196;BA.debugLine="tvScore = tvScore - 0.1";
_tvscore = _tvscore-0.1;
 //BA.debugLineNum = 197;BA.debugLine="chekpointbox1(chek2.Tag).Checked = False";
_chekpointbox1[(int)(BA.ObjectToNumber(_chek2.getTag()))].setChecked(__c.False);
 };
 }else {
 //BA.debugLineNum = 200;BA.debugLine="tvScore = tvScore - 0.2";
_tvscore = _tvscore-0.2;
 };
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public String  _check22_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chek22 = null;
 //BA.debugLineNum = 222;BA.debugLine="Private Sub check22_CheckedChange(checked As Boole";
 //BA.debugLineNum = 223;BA.debugLine="Private chek22 As CheckBox = Sender";
_chek22 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_chek22.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 224;BA.debugLine="chek22 = Sender";
_chek22.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 225;BA.debugLine="If chek22.Checked = True Then";
if (_chek22.getChecked()==__c.True) { 
 //BA.debugLineNum = 226;BA.debugLine="tvScore = tvScore + 0.3";
_tvscore = _tvscore+0.3;
 //BA.debugLineNum = 227;BA.debugLine="If chekpointbox3(chek22.Tag).Checked = True Then";
if (_chekpointbox3[(int)(BA.ObjectToNumber(_chek22.getTag()))].getChecked()==__c.True) { 
 //BA.debugLineNum = 228;BA.debugLine="tvScore = tvScore - 0.2";
_tvscore = _tvscore-0.2;
 //BA.debugLineNum = 229;BA.debugLine="chekpointbox3(chek22.Tag).Checked = False";
_chekpointbox3[(int)(BA.ObjectToNumber(_chek22.getTag()))].setChecked(__c.False);
 };
 //BA.debugLineNum = 231;BA.debugLine="If chekpointbox32(chek22.Tag).Checked = True The";
if (_chekpointbox32[(int)(BA.ObjectToNumber(_chek22.getTag()))].getChecked()==__c.True) { 
 //BA.debugLineNum = 232;BA.debugLine="tvScore = tvScore - 0.5";
_tvscore = _tvscore-0.5;
 //BA.debugLineNum = 233;BA.debugLine="chekpointbox32(chek22.Tag).Checked = False";
_chekpointbox32[(int)(BA.ObjectToNumber(_chek22.getTag()))].setChecked(__c.False);
 };
 }else {
 //BA.debugLineNum = 237;BA.debugLine="tvScore = tvScore - 0.3";
_tvscore = _tvscore-0.3;
 };
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public String  _check3_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chek3 = null;
 //BA.debugLineNum = 204;BA.debugLine="Private Sub check3_CheckedChange(checked As Boolea";
 //BA.debugLineNum = 205;BA.debugLine="Private chek3 As CheckBox = Sender";
_chek3 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_chek3.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 206;BA.debugLine="chek3 = Sender";
_chek3.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 207;BA.debugLine="If chek3.Checked = True Then";
if (_chek3.getChecked()==__c.True) { 
 //BA.debugLineNum = 208;BA.debugLine="tvScore = tvScore + 0.2";
_tvscore = _tvscore+0.2;
 //BA.debugLineNum = 209;BA.debugLine="If chekpointbox22(chek3.Tag).Checked = True Then";
if (_chekpointbox22[(int)(BA.ObjectToNumber(_chek3.getTag()))].getChecked()==__c.True) { 
 //BA.debugLineNum = 210;BA.debugLine="tvScore = tvScore - 0.3";
_tvscore = _tvscore-0.3;
 //BA.debugLineNum = 211;BA.debugLine="chekpointbox22(chek3.Tag).Checked = False";
_chekpointbox22[(int)(BA.ObjectToNumber(_chek3.getTag()))].setChecked(__c.False);
 };
 //BA.debugLineNum = 213;BA.debugLine="If chekpointbox32(chek3.Tag).Checked = True Then";
if (_chekpointbox32[(int)(BA.ObjectToNumber(_chek3.getTag()))].getChecked()==__c.True) { 
 //BA.debugLineNum = 214;BA.debugLine="tvScore = tvScore - 0.5";
_tvscore = _tvscore-0.5;
 //BA.debugLineNum = 215;BA.debugLine="chekpointbox32(chek3.Tag).Checked = False";
_chekpointbox32[(int)(BA.ObjectToNumber(_chek3.getTag()))].setChecked(__c.False);
 };
 }else {
 //BA.debugLineNum = 218;BA.debugLine="tvScore = tvScore - 0.3";
_tvscore = _tvscore-0.3;
 };
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public String  _check32_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chek32 = null;
 //BA.debugLineNum = 241;BA.debugLine="Private Sub check32_CheckedChange(checked As Boole";
 //BA.debugLineNum = 242;BA.debugLine="Private chek32 As CheckBox = Sender";
_chek32 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_chek32.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 243;BA.debugLine="chek32 = Sender";
_chek32.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 244;BA.debugLine="If chek32.Checked = True Then";
if (_chek32.getChecked()==__c.True) { 
 //BA.debugLineNum = 245;BA.debugLine="tvScore = tvScore + 0.5";
_tvscore = _tvscore+0.5;
 //BA.debugLineNum = 246;BA.debugLine="If chekpointbox22(chek32.Tag).Checked = True The";
if (_chekpointbox22[(int)(BA.ObjectToNumber(_chek32.getTag()))].getChecked()==__c.True) { 
 //BA.debugLineNum = 247;BA.debugLine="tvScore = tvScore - 0.3";
_tvscore = _tvscore-0.3;
 //BA.debugLineNum = 248;BA.debugLine="chekpointbox22(chek32.Tag).Checked = False";
_chekpointbox22[(int)(BA.ObjectToNumber(_chek32.getTag()))].setChecked(__c.False);
 };
 //BA.debugLineNum = 250;BA.debugLine="If chekpointbox3(chek32.Tag).Checked = True Then";
if (_chekpointbox3[(int)(BA.ObjectToNumber(_chek32.getTag()))].getChecked()==__c.True) { 
 //BA.debugLineNum = 251;BA.debugLine="tvScore = tvScore - 0.2";
_tvscore = _tvscore-0.2;
 //BA.debugLineNum = 252;BA.debugLine="chekpointbox3(chek32.Tag).Checked = False";
_chekpointbox3[(int)(BA.ObjectToNumber(_chek32.getTag()))].setChecked(__c.False);
 };
 }else {
 //BA.debugLineNum = 256;BA.debugLine="tvScore = tvScore - 0.5";
_tvscore = _tvscore-0.5;
 };
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Private label(6) As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper[(int) (6)];
{
int d0 = _label.length;
for (int i0 = 0;i0 < d0;i0++) {
_label[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 7;BA.debugLine="Private label2(6) As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper[(int) (6)];
{
int d0 = _label2.length;
for (int i0 = 0;i0 < d0;i0++) {
_label2[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
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
 //BA.debugLineNum = 13;BA.debugLine="Private chekpointbox1(6) As CheckBox";
_chekpointbox1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (6)];
{
int d0 = _chekpointbox1.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox1[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
 //BA.debugLineNum = 14;BA.debugLine="Private chekpointbox2(6) As CheckBox";
_chekpointbox2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (6)];
{
int d0 = _chekpointbox2.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox2[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
 //BA.debugLineNum = 15;BA.debugLine="Private chekpointbox22(6) As CheckBox";
_chekpointbox22 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (6)];
{
int d0 = _chekpointbox22.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox22[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
 //BA.debugLineNum = 16;BA.debugLine="Private chekpointbox3(6) As CheckBox";
_chekpointbox3 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (6)];
{
int d0 = _chekpointbox3.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox3[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
 //BA.debugLineNum = 17;BA.debugLine="Private chekpointbox32(6) As CheckBox";
_chekpointbox32 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[(int) (6)];
{
int d0 = _chekpointbox32.length;
for (int i0 = 0;i0 < d0;i0++) {
_chekpointbox32[i0] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
}
}
;
 //BA.debugLineNum = 18;BA.debugLine="Public tvScore As Double";
_tvscore = 0;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public double  _finaltvscore() throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Public Sub finalTVscore As Double";
 //BA.debugLineNum = 261;BA.debugLine="Log(\"AVSCORE:\"&tvScore)";
__c.Log("AVSCORE:"+BA.NumberToString(_tvscore));
 //BA.debugLineNum = 262;BA.debugLine="Return tvScore";
if (true) return _tvscore;
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
int _i = 0;
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 23;BA.debugLine="tvPanel.Initialize(\"\")";
_tvpanel.Initialize(ba,"");
 //BA.debugLineNum = 24;BA.debugLine="For i = 0 To 1";
{
final int step2 = 1;
final int limit2 = (int) (1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 25;BA.debugLine="page(i).Initialize(\"\")";
_page[_i].Initialize(ba,"");
 }
};
 //BA.debugLineNum = 27;BA.debugLine="For i = 0 To 5";
{
final int step5 = 1;
final int limit5 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 28;BA.debugLine="label(i).Initialize(\"\")";
_label[_i].Initialize(ba,"");
 }
};
 //BA.debugLineNum = 31;BA.debugLine="For i = 0 To 5";
{
final int step8 = 1;
final int limit8 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 32;BA.debugLine="label2(i).Initialize(\"\")";
_label2[_i].Initialize(ba,"");
 }
};
 //BA.debugLineNum = 35;BA.debugLine="For i = 0 To 5";
{
final int step11 = 1;
final int limit11 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 36;BA.debugLine="chekpointbox1(i).Initialize(\"check1\")";
_chekpointbox1[_i].Initialize(ba,"check1");
 }
};
 //BA.debugLineNum = 38;BA.debugLine="For i = 0 To 5";
{
final int step14 = 1;
final int limit14 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 39;BA.debugLine="chekpointbox2(i).Initialize(\"check2\")";
_chekpointbox2[_i].Initialize(ba,"check2");
 }
};
 //BA.debugLineNum = 41;BA.debugLine="For i = 0 To 5";
{
final int step17 = 1;
final int limit17 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
 //BA.debugLineNum = 42;BA.debugLine="chekpointbox22(i).Initialize(\"check22\")";
_chekpointbox22[_i].Initialize(ba,"check22");
 }
};
 //BA.debugLineNum = 44;BA.debugLine="For i = 0 To 5";
{
final int step20 = 1;
final int limit20 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 45;BA.debugLine="chekpointbox3(i).Initialize(\"check3\")";
_chekpointbox3[_i].Initialize(ba,"check3");
 }
};
 //BA.debugLineNum = 47;BA.debugLine="For i = 0 To 5";
{
final int step23 = 1;
final int limit23 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
 //BA.debugLineNum = 48;BA.debugLine="chekpointbox32(i).Initialize(\"check32\")";
_chekpointbox32[_i].Initialize(ba,"check32");
 }
};
 //BA.debugLineNum = 51;BA.debugLine="downPanel.Initialize(\"\")";
_downpanel.Initialize(ba,"");
 //BA.debugLineNum = 52;BA.debugLine="btnready.Initialize(\"ready\")";
_btnready.Initialize(ba,"ready");
 //BA.debugLineNum = 53;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnready,Colors.W";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnready.getObject())),__c.Colors.White,(int) (0xff4ac2ff),(int) (0xff149be0),(int) (0xff2cb7ff),(int) (0xff2cb7ff),(int) (0x66040509),(int) (0x66040509),(int) (20));
 //BA.debugLineNum = 54;BA.debugLine="btnready.Text = Main.translate.GetString(\"readyBt";
_btnready.setText(BA.ObjectToCharSequence(_main._translate._getstring("readyBtn")));
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _ready_click() throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Private Sub ready_Click";
 //BA.debugLineNum = 266;BA.debugLine="CallSub(Main, \"FinalClick\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"FinalClick");
 //BA.debugLineNum = 267;BA.debugLine="finalTVscore";
_finaltvscore();
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
