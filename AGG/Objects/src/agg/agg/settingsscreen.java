package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class settingsscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "agg.agg.settingsscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", agg.agg.settingsscreen.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlsettings = null;
public int _backgroundcolor = 0;
public int _vleft = 0;
public int _vleft1 = 0;
public int _vtop = 0;
public int _vtop1 = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lbserveradress = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbdatabasename = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbusername = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbpassword = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etserveradress = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etdatabasename = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etpassword = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblanguage = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbfontsize = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _splanguage = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spfontsize = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbconfigtitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbinterfacetitle = null;
public int _langselectedindex = 0;
public String _langselectedabb = "";
public int _fontsize = 0;
public int _fontsizeindex = 0;
public int _dbengineindex = 0;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntestconnection = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public String  _addfontsizes() throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Private Sub AddFontSizes";
 //BA.debugLineNum = 229;BA.debugLine="spFontSize.Clear";
_spfontsize.Clear();
 //BA.debugLineNum = 230;BA.debugLine="spFontSize.Add(\"6\")";
_spfontsize.Add("6");
 //BA.debugLineNum = 231;BA.debugLine="spFontSize.Add(\"7\")";
_spfontsize.Add("7");
 //BA.debugLineNum = 232;BA.debugLine="spFontSize.Add(\"8\")";
_spfontsize.Add("8");
 //BA.debugLineNum = 233;BA.debugLine="spFontSize.Add(\"9\")";
_spfontsize.Add("9");
 //BA.debugLineNum = 234;BA.debugLine="spFontSize.Add(\"10\")";
_spfontsize.Add("10");
 //BA.debugLineNum = 235;BA.debugLine="spFontSize.Add(\"11\")";
_spfontsize.Add("11");
 //BA.debugLineNum = 236;BA.debugLine="spFontSize.Add(\"12\")";
_spfontsize.Add("12");
 //BA.debugLineNum = 237;BA.debugLine="spFontSize.Add(\"13\")";
_spfontsize.Add("13");
 //BA.debugLineNum = 238;BA.debugLine="spFontSize.Add(\"14\")";
_spfontsize.Add("14");
 //BA.debugLineNum = 239;BA.debugLine="spFontSize.Add(\"15\")";
_spfontsize.Add("15");
 //BA.debugLineNum = 240;BA.debugLine="spFontSize.Add(\"16\")";
_spfontsize.Add("16");
 //BA.debugLineNum = 241;BA.debugLine="spFontSize.Add(\"17\")";
_spfontsize.Add("17");
 //BA.debugLineNum = 242;BA.debugLine="spFontSize.Add(\"18\")";
_spfontsize.Add("18");
 //BA.debugLineNum = 243;BA.debugLine="spFontSize.Add(\"19\")";
_spfontsize.Add("19");
 //BA.debugLineNum = 244;BA.debugLine="spFontSize.Add(\"20\")";
_spfontsize.Add("20");
 //BA.debugLineNum = 245;BA.debugLine="spFontSize.Add(\"21\")";
_spfontsize.Add("21");
 //BA.debugLineNum = 246;BA.debugLine="spFontSize.Add(\"22\")";
_spfontsize.Add("22");
 //BA.debugLineNum = 247;BA.debugLine="spFontSize.Add(\"23\")";
_spfontsize.Add("23");
 //BA.debugLineNum = 248;BA.debugLine="spFontSize.Add(\"24\")";
_spfontsize.Add("24");
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public String  _addlanguages() throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Public Sub AddLanguages";
 //BA.debugLineNum = 252;BA.debugLine="spLanguage.Clear";
_splanguage.Clear();
 //BA.debugLineNum = 253;BA.debugLine="spLanguage.AddAll(Main.translate.Get_LanguageList";
_splanguage.AddAll(_main._translate._get_languagelist());
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Public Sub asView As Panel";
 //BA.debugLineNum = 326;BA.debugLine="Return pnlSettings";
if (true) return _pnlsettings;
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private pnlSettings As Panel";
_pnlsettings = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim backgroundColor As Int = Colors.ARGB(255, 180";
_backgroundcolor = __c.Colors.ARGB((int) (255),(int) (180),(int) (180),(int) (180));
 //BA.debugLineNum = 4;BA.debugLine="Dim vLeft, vLeft1, vTop, vTop1 As Int";
_vleft = 0;
_vleft1 = 0;
_vtop = 0;
_vtop1 = 0;
 //BA.debugLineNum = 7;BA.debugLine="Dim lbServerAdress, lbDatabaseName, lbUserName, l";
_lbserveradress = new anywheresoftware.b4a.objects.LabelWrapper();
_lbdatabasename = new anywheresoftware.b4a.objects.LabelWrapper();
_lbusername = new anywheresoftware.b4a.objects.LabelWrapper();
_lbpassword = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim etServerAdress, etDatabaseName, etUserName, e";
_etserveradress = new anywheresoftware.b4a.objects.EditTextWrapper();
_etdatabasename = new anywheresoftware.b4a.objects.EditTextWrapper();
_etusername = new anywheresoftware.b4a.objects.EditTextWrapper();
_etpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim lbLanguage, lbFontSize As Label";
_lblanguage = new anywheresoftware.b4a.objects.LabelWrapper();
_lbfontsize = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim spLanguage, spFontSize As Spinner";
_splanguage = new anywheresoftware.b4a.objects.SpinnerWrapper();
_spfontsize = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim lbConfigTitle, lbInterfaceTitle As Label";
_lbconfigtitle = new anywheresoftware.b4a.objects.LabelWrapper();
_lbinterfacetitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim LangSelectedIndex As Int = 0";
_langselectedindex = (int) (0);
 //BA.debugLineNum = 17;BA.debugLine="Dim LangSelectedAbb As String = \"EN\"";
_langselectedabb = "EN";
 //BA.debugLineNum = 18;BA.debugLine="Dim FontSize, FontSizeIndex, DBEngineIndex As Int";
_fontsize = 0;
_fontsizeindex = 0;
_dbengineindex = (int) (0);
 //BA.debugLineNum = 20;BA.debugLine="Dim bitmap As Bitmap";
_bitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim btnTestConnection As Button";
_btntestconnection = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _datafromconfig() throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Private Sub DataFromConfig";
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public String  _datatoconfig() throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Public Sub DataToConfig";
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 27;BA.debugLine="pnlSettings.Initialize(\"\")";
_pnlsettings.Initialize(ba,"");
 //BA.debugLineNum = 28;BA.debugLine="pnlSettings.Color = backgroundColor";
_pnlsettings.setColor(_backgroundcolor);
 //BA.debugLineNum = 30;BA.debugLine="vLeft = 2%x";
_vleft = __c.PerXToCurrent((float) (2),ba);
 //BA.debugLineNum = 31;BA.debugLine="vTop1 = 50%y";
_vtop1 = __c.PerYToCurrent((float) (50),ba);
 //BA.debugLineNum = 32;BA.debugLine="vLeft1 = vLeft";
_vleft1 = _vleft;
 //BA.debugLineNum = 35;BA.debugLine="lbConfigTitle.Initialize(\"\")";
_lbconfigtitle.Initialize(ba,"");
 //BA.debugLineNum = 36;BA.debugLine="lbConfigTitle.Gravity = Gravity.CENTER_VERTICAL";
_lbconfigtitle.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 37;BA.debugLine="lbConfigTitle.TextColor = Colors.RGB(0, 0, 0)";
_lbconfigtitle.setTextColor(__c.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 38;BA.debugLine="lbConfigTitle.TextSize = UISizes.DefaultBigTitleS";
_lbconfigtitle.setTextSize((float) (_uisizes._defaultbigtitlesize));
 //BA.debugLineNum = 41;BA.debugLine="etServerAdress.Initialize(\"\")";
_etserveradress.Initialize(ba,"");
 //BA.debugLineNum = 43;BA.debugLine="etServerAdress.Gravity = Gravity.CENTER_VERTICAL";
_etserveradress.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 44;BA.debugLine="etServerAdress.SingleLine = True";
_etserveradress.setSingleLine(__c.True);
 //BA.debugLineNum = 45;BA.debugLine="etServerAdress.TextColor = Colors.Black";
_etserveradress.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 46;BA.debugLine="etServerAdress.TextSize = UISizes.DefaultTextSize";
_etserveradress.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 47;BA.debugLine="etServerAdress.HintColor = Colors.RGB(180, 180, 1";
_etserveradress.setHintColor(__c.Colors.RGB((int) (180),(int) (180),(int) (180)));
 //BA.debugLineNum = 49;BA.debugLine="etDatabaseName.Initialize(\"\")";
_etdatabasename.Initialize(ba,"");
 //BA.debugLineNum = 51;BA.debugLine="etDatabaseName.Gravity = Gravity.CENTER_VERTICAL";
_etdatabasename.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 52;BA.debugLine="etDatabaseName.SingleLine = True";
_etdatabasename.setSingleLine(__c.True);
 //BA.debugLineNum = 53;BA.debugLine="etDatabaseName.TextColor = Colors.Black";
_etdatabasename.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 54;BA.debugLine="etDatabaseName.TextSize = UISizes.DefaultTextSize";
_etdatabasename.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 55;BA.debugLine="etDatabaseName.HintColor = Colors.RGB(180, 180, 1";
_etdatabasename.setHintColor(__c.Colors.RGB((int) (180),(int) (180),(int) (180)));
 //BA.debugLineNum = 57;BA.debugLine="etUserName.Initialize(\"\")";
_etusername.Initialize(ba,"");
 //BA.debugLineNum = 59;BA.debugLine="etUserName.Gravity = Gravity.CENTER_VERTICAL";
_etusername.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 60;BA.debugLine="etUserName.SingleLine = True";
_etusername.setSingleLine(__c.True);
 //BA.debugLineNum = 61;BA.debugLine="etUserName.TextColor = Colors.Black";
_etusername.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 62;BA.debugLine="etUserName.TextSize = UISizes.DefaultTextSize";
_etusername.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 63;BA.debugLine="etUserName.HintColor = Colors.RGB(180, 180, 180)";
_etusername.setHintColor(__c.Colors.RGB((int) (180),(int) (180),(int) (180)));
 //BA.debugLineNum = 66;BA.debugLine="etPassword.Initialize(\"etPassword\")";
_etpassword.Initialize(ba,"etPassword");
 //BA.debugLineNum = 68;BA.debugLine="etPassword.Gravity = Gravity.CENTER_VERTICAL";
_etpassword.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 69;BA.debugLine="etPassword.SingleLine = True";
_etpassword.setSingleLine(__c.True);
 //BA.debugLineNum = 70;BA.debugLine="etPassword.PasswordMode = True";
_etpassword.setPasswordMode(__c.True);
 //BA.debugLineNum = 71;BA.debugLine="etPassword.TextColor = Colors.Black";
_etpassword.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 72;BA.debugLine="etPassword.TextSize = UISizes.DefaultTextSize";
_etpassword.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 73;BA.debugLine="etPassword.HintColor = Colors.RGB(180, 180, 180)";
_etpassword.setHintColor(__c.Colors.RGB((int) (180),(int) (180),(int) (180)));
 //BA.debugLineNum = 77;BA.debugLine="lbServerAdress.Initialize(\"\")";
_lbserveradress.Initialize(ba,"");
 //BA.debugLineNum = 78;BA.debugLine="lbServerAdress.Gravity = Gravity.CENTER_VERTICAL";
_lbserveradress.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 79;BA.debugLine="lbServerAdress.TextColor = Colors.RGB(0, 0, 0)";
_lbserveradress.setTextColor(__c.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 80;BA.debugLine="lbServerAdress.TextSize = UISizes.DefaultTextSize";
_lbserveradress.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 82;BA.debugLine="lbDatabaseName.Initialize(\"\")";
_lbdatabasename.Initialize(ba,"");
 //BA.debugLineNum = 83;BA.debugLine="lbDatabaseName.Gravity = Gravity.CENTER_VERTICAL";
_lbdatabasename.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 84;BA.debugLine="lbDatabaseName.TextColor = Colors.RGB(0, 0, 0)";
_lbdatabasename.setTextColor(__c.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 85;BA.debugLine="lbDatabaseName.TextSize = UISizes.DefaultTextSize";
_lbdatabasename.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 87;BA.debugLine="lbUserName.Initialize(\"\")";
_lbusername.Initialize(ba,"");
 //BA.debugLineNum = 88;BA.debugLine="lbUserName.Gravity = Gravity.CENTER_VERTICAL";
_lbusername.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 89;BA.debugLine="lbUserName.TextColor = Colors.RGB(0, 0, 0)";
_lbusername.setTextColor(__c.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 90;BA.debugLine="lbUserName.TextSize = UISizes.DefaultTextSize";
_lbusername.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 92;BA.debugLine="lbPassword.Initialize(\"\")";
_lbpassword.Initialize(ba,"");
 //BA.debugLineNum = 93;BA.debugLine="lbPassword.Gravity = Gravity.CENTER_VERTICAL";
_lbpassword.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 94;BA.debugLine="lbPassword.TextColor = Colors.RGB(0, 0, 0)";
_lbpassword.setTextColor(__c.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 95;BA.debugLine="lbPassword.TextSize = UISizes.DefaultTextSize";
_lbpassword.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 98;BA.debugLine="lbInterfaceTitle.Initialize(\"\")";
_lbinterfacetitle.Initialize(ba,"");
 //BA.debugLineNum = 99;BA.debugLine="lbInterfaceTitle.TextSize = UISizes.DefaultBigTit";
_lbinterfacetitle.setTextSize((float) (_uisizes._defaultbigtitlesize));
 //BA.debugLineNum = 100;BA.debugLine="lbInterfaceTitle.TextColor = Colors.RGB(0, 0, 0)";
_lbinterfacetitle.setTextColor(__c.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 101;BA.debugLine="lbInterfaceTitle.Gravity = Gravity.CENTER_VERTICA";
_lbinterfacetitle.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 103;BA.debugLine="lbLanguage.Initialize(\"\")";
_lblanguage.Initialize(ba,"");
 //BA.debugLineNum = 104;BA.debugLine="lbLanguage.TextSize = UISizes.DefaultTextSize";
_lblanguage.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 105;BA.debugLine="lbLanguage.Gravity = Gravity.CENTER_VERTICAL";
_lblanguage.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 106;BA.debugLine="lbLanguage.TextColor = Colors.RGB(0, 0, 0)";
_lblanguage.setTextColor(__c.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 108;BA.debugLine="lbFontSize.Initialize(\"\")";
_lbfontsize.Initialize(ba,"");
 //BA.debugLineNum = 109;BA.debugLine="lbFontSize.TextColor = Colors.RGB(0, 0, 0)";
_lbfontsize.setTextColor(__c.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 110;BA.debugLine="lbFontSize.Gravity = Gravity.CENTER_VERTICAL";
_lbfontsize.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 111;BA.debugLine="lbFontSize.TextColor = Colors.RGB(0, 0, 0)";
_lbfontsize.setTextColor(__c.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 112;BA.debugLine="lbFontSize.TextSize = UISizes.DefaultTextSize";
_lbfontsize.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 115;BA.debugLine="spLanguage.Initialize(\"spLang\")";
_splanguage.Initialize(ba,"spLang");
 //BA.debugLineNum = 116;BA.debugLine="spLanguage.TextSize = UISizes.DefaultTextSize";
_splanguage.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 117;BA.debugLine="spLanguage.TextColor = Colors.Black";
_splanguage.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 121;BA.debugLine="spFontSize.Initialize(\"spFontSize\")";
_spfontsize.Initialize(ba,"spFontSize");
 //BA.debugLineNum = 122;BA.debugLine="spFontSize.TextSize = UISizes.DefaultTextSize";
_spfontsize.setTextSize((float) (_uisizes._defaulttextsize));
 //BA.debugLineNum = 123;BA.debugLine="spFontSize.TextColor = Colors.Black";
_spfontsize.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 128;BA.debugLine="btnTestConnection.Initialize(\"TestConnection\")";
_btntestconnection.Initialize(ba,"TestConnection");
 //BA.debugLineNum = 131;BA.debugLine="SetLabelText";
_setlabeltext();
 //BA.debugLineNum = 133;BA.debugLine="bitmap = LoadBitmapSample(File.DirAssets, \"Settin";
_bitmap = __c.LoadBitmapSample(__c.File.getDirAssets(),"SettingsP.jpg",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 135;BA.debugLine="pnlSettings.SetBackgroundImage(bitmap)";
_pnlsettings.SetBackgroundImageNew((android.graphics.Bitmap)(_bitmap.getObject()));
 //BA.debugLineNum = 138;BA.debugLine="MakeScreen";
_makescreen();
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public boolean  _isvalidip(String _ip) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _n = null;
int _i = 0;
 //BA.debugLineNum = 291;BA.debugLine="Sub IsValidIp(ip As String) As Boolean";
 //BA.debugLineNum = 292;BA.debugLine="Dim m, n As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_n = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
 //BA.debugLineNum = 293;BA.debugLine="m = Regex.Matcher(\"^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$\",";
_m = __c.Regex.Matcher("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$",_ip);
 //BA.debugLineNum = 294;BA.debugLine="n = Regex.Matcher(\"^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+):(\\";
_n = __c.Regex.Matcher("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+):(\\d+)$",_ip);
 //BA.debugLineNum = 296;BA.debugLine="If m.Find = False Then";
if (_m.Find()==__c.False) { 
 //BA.debugLineNum = 297;BA.debugLine="If n.Find = False Then";
if (_n.Find()==__c.False) { 
 //BA.debugLineNum = 298;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
 //BA.debugLineNum = 300;BA.debugLine="For i = 1 To 4";
{
final int step8 = 1;
final int limit8 = (int) (4);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 301;BA.debugLine="If n.Group(i) > 255 Or n.Group(i) < 0 Then Ret";
if ((double)(Double.parseDouble(_n.Group(_i)))>255 || (double)(Double.parseDouble(_n.Group(_i)))<0) { 
if (true) return __c.False;};
 }
};
 //BA.debugLineNum = 303;BA.debugLine="If n.Group(5) > 49151 Or n.Group(5) < 1024 Then";
if ((double)(Double.parseDouble(_n.Group((int) (5))))>49151 || (double)(Double.parseDouble(_n.Group((int) (5))))<1024) { 
if (true) return __c.False;};
 //BA.debugLineNum = 304;BA.debugLine="Return True";
if (true) return __c.True;
 };
 }else {
 //BA.debugLineNum = 307;BA.debugLine="For i = 1 To 4";
{
final int step15 = 1;
final int limit15 = (int) (4);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 308;BA.debugLine="If m.Group(i) > 255 Or m.Group(i) < 0 Then Retu";
if ((double)(Double.parseDouble(_m.Group(_i)))>255 || (double)(Double.parseDouble(_m.Group(_i)))<0) { 
if (true) return __c.False;};
 }
};
 //BA.debugLineNum = 310;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return false;
}
public String  _makescreen() throws Exception{
int _top1 = 0;
 //BA.debugLineNum = 163;BA.debugLine="Public Sub MakeScreen";
 //BA.debugLineNum = 164;BA.debugLine="vTop = 13%y";
_vtop = __c.PerYToCurrent((float) (13),ba);
 //BA.debugLineNum = 167;BA.debugLine="pnlSettings.AddView(lbInterfaceTitle, vLeft, vTop";
_pnlsettings.AddView((android.view.View)(_lbinterfacetitle.getObject()),_vleft,(int) (_vtop/(double)2),(int) (-1),(int) (_uisizes._defaultbigtitlesize*__c.DipToCurrent((int) (3))));
 //BA.debugLineNum = 168;BA.debugLine="vTop = (lbInterfaceTitle.Top + lbInterfaceTitle.H";
_vtop = (int) ((_lbinterfacetitle.getTop()+_lbinterfacetitle.getHeight()));
 //BA.debugLineNum = 170;BA.debugLine="pnlSettings.AddView(lbLanguage, vLeft, vTop + UIS";
_pnlsettings.AddView((android.view.View)(_lblanguage.getObject()),_vleft,(int) (_vtop+_uisizes._objectvseperation),_uisizes._defaultlabelwidth,_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 171;BA.debugLine="pnlSettings.AddView(spLanguage, lbLanguage.Left +";
_pnlsettings.AddView((android.view.View)(_splanguage.getObject()),(int) (_lblanguage.getLeft()+_lblanguage.getWidth()+_uisizes._labeleditspacing),_lblanguage.getTop(),(int) ((_uisizes._defaulteditwidth/(double)2)),_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 173;BA.debugLine="AddLanguages";
_addlanguages();
 //BA.debugLineNum = 176;BA.debugLine="pnlSettings.AddView(lbFontSize, vLeft, vTop + (UI";
_pnlsettings.AddView((android.view.View)(_lbfontsize.getObject()),_vleft,(int) (_vtop+(_uisizes._defaultcontrolheight)+_uisizes._objectvseperation),_uisizes._defaultlabelwidth,(int) (_uisizes._defaultcontrolheight+_lbfontsize.getTextSize()));
 //BA.debugLineNum = 177;BA.debugLine="pnlSettings.AddView(spFontSize, lbFontSize.Left +";
_pnlsettings.AddView((android.view.View)(_spfontsize.getObject()),(int) (_lbfontsize.getLeft()+_lbfontsize.getWidth()+_uisizes._labeleditspacing),_lbfontsize.getTop(),(int) ((_uisizes._defaulteditwidth/(double)2)),_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 178;BA.debugLine="AddFontSizes";
_addfontsizes();
 //BA.debugLineNum = 182;BA.debugLine="Dim top1 As Int";
_top1 = 0;
 //BA.debugLineNum = 183;BA.debugLine="top1 = vTop1 / 1.5";
_top1 = (int) (_vtop1/(double)1.5);
 //BA.debugLineNum = 184;BA.debugLine="If top1 <= 0 Then top1 = vTop1";
if (_top1<=0) { 
_top1 = _vtop1;};
 //BA.debugLineNum = 186;BA.debugLine="pnlSettings.AddView(lbConfigTitle, vLeft1, top1,";
_pnlsettings.AddView((android.view.View)(_lbconfigtitle.getObject()),_vleft1,_top1,(int) (-1),(int) (_uisizes._defaultbigtitlesize*__c.DipToCurrent((int) (3))));
 //BA.debugLineNum = 187;BA.debugLine="vTop1 = (lbConfigTitle.Top + lbConfigTitle.Height";
_vtop1 = (int) ((_lbconfigtitle.getTop()+_lbconfigtitle.getHeight()));
 //BA.debugLineNum = 189;BA.debugLine="pnlSettings.AddView(lbServerAdress, vLeft1, vTop1";
_pnlsettings.AddView((android.view.View)(_lbserveradress.getObject()),_vleft1,(int) (_vtop1+_uisizes._objectvseperation),_uisizes._defaultlabelwidth,_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 190;BA.debugLine="pnlSettings.AddView(etServerAdress, lbServerAdres";
_pnlsettings.AddView((android.view.View)(_etserveradress.getObject()),(int) (_lbserveradress.getLeft()+_lbserveradress.getWidth()+_uisizes._labeleditspacing),_lbserveradress.getTop(),_uisizes._defaulteditwidth,_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 193;BA.debugLine="pnlSettings.AddView(lbDatabaseName, vLeft1, vTop1";
_pnlsettings.AddView((android.view.View)(_lbdatabasename.getObject()),_vleft1,(int) (_vtop1+_uisizes._defaultcontrolheight+_uisizes._objectvseperation),_uisizes._defaultlabelwidth,_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 194;BA.debugLine="pnlSettings.AddView(etDatabaseName, lbDatabaseNam";
_pnlsettings.AddView((android.view.View)(_etdatabasename.getObject()),(int) (_lbdatabasename.getLeft()+_lbdatabasename.getWidth()+_uisizes._labeleditspacing),_lbdatabasename.getTop(),_uisizes._defaulteditwidth,_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 197;BA.debugLine="pnlSettings.AddView(lbUserName, vLeft1, vTop1+ (U";
_pnlsettings.AddView((android.view.View)(_lbusername.getObject()),_vleft1,(int) (_vtop1+(_uisizes._defaultcontrolheight*2)+_uisizes._objectvseperation),_uisizes._defaultlabelwidth,_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 198;BA.debugLine="pnlSettings.AddView(etUserName, lbUserName.Left +";
_pnlsettings.AddView((android.view.View)(_etusername.getObject()),(int) (_lbusername.getLeft()+_lbusername.getWidth()+_uisizes._labeleditspacing),_lbusername.getTop(),_uisizes._defaulteditwidth,_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 201;BA.debugLine="pnlSettings.AddView(lbPassword, vLeft1, vTop1 + (";
_pnlsettings.AddView((android.view.View)(_lbpassword.getObject()),_vleft1,(int) (_vtop1+(_uisizes._defaultcontrolheight*3)+_uisizes._objectvseperation),_uisizes._defaultlabelwidth,_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 202;BA.debugLine="pnlSettings.AddView(etPassword, lbPassword.Left +";
_pnlsettings.AddView((android.view.View)(_etpassword.getObject()),(int) (_lbpassword.getLeft()+_lbpassword.getWidth()+_uisizes._labeleditspacing),_lbpassword.getTop(),_uisizes._defaulteditwidth,_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 205;BA.debugLine="pnlSettings.AddView(btnTestConnection, etPassword";
_pnlsettings.AddView((android.view.View)(_btntestconnection.getObject()),(int) (_etpassword.getLeft()+_uisizes._labeleditspacing),(int) (_etpassword.getTop()+_etpassword.getHeight()+__c.PerYToCurrent((float) (2),ba)),_uisizes._defaulteditwidth,_uisizes._defaultcontrolheight);
 //BA.debugLineNum = 207;BA.debugLine="DataFromConfig";
_datafromconfig();
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public String  _setlabeltext() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub SetLabelText";
 //BA.debugLineNum = 144;BA.debugLine="lbConfigTitle.Text = Main.translate.GetString(\"lb";
_lbconfigtitle.setText(BA.ObjectToCharSequence(_main._translate._getstring("lblConnectionSettings")));
 //BA.debugLineNum = 146;BA.debugLine="lbServerAdress.Text = Main.translate.GetString(\"l";
_lbserveradress.setText(BA.ObjectToCharSequence(_main._translate._getstring("lblServer")+":"));
 //BA.debugLineNum = 147;BA.debugLine="lbDatabaseName.Text = Main.translate.GetString(\"l";
_lbdatabasename.setText(BA.ObjectToCharSequence(_main._translate._getstring("lblDatabaseName")+":"));
 //BA.debugLineNum = 148;BA.debugLine="lbUserName.Text = Main.translate.GetString(\"lblUs";
_lbusername.setText(BA.ObjectToCharSequence(_main._translate._getstring("lblUserName")+":"));
 //BA.debugLineNum = 149;BA.debugLine="lbPassword.Text = Main.translate.GetString(\"lblPa";
_lbpassword.setText(BA.ObjectToCharSequence(_main._translate._getstring("lblPassword")+":"));
 //BA.debugLineNum = 151;BA.debugLine="etServerAdress.Hint = Main.translate.GetString(\"l";
_etserveradress.setHint(_main._translate._getstring("lblServer"));
 //BA.debugLineNum = 152;BA.debugLine="etDatabaseName.Hint = Main.translate.GetString(\"l";
_etdatabasename.setHint(_main._translate._getstring("lblDatabaseName"));
 //BA.debugLineNum = 153;BA.debugLine="etUserName.Hint = Main.translate.GetString(\"lblUs";
_etusername.setHint(_main._translate._getstring("lblUserName"));
 //BA.debugLineNum = 154;BA.debugLine="etPassword.Hint = Main.translate.GetString(\"lblPa";
_etpassword.setHint(_main._translate._getstring("lblPassword"));
 //BA.debugLineNum = 156;BA.debugLine="lbInterfaceTitle.Text = Main.translate.GetString(";
_lbinterfacetitle.setText(BA.ObjectToCharSequence(_main._translate._getstring("lblProgramSettings")));
 //BA.debugLineNum = 157;BA.debugLine="lbLanguage.Text = Main.translate.GetString(\"lblLa";
_lblanguage.setText(BA.ObjectToCharSequence(_main._translate._getstring("lblLanguage")+":"));
 //BA.debugLineNum = 158;BA.debugLine="lbFontSize.Text = Main.translate.GetString(\"lblFo";
_lbfontsize.setText(BA.ObjectToCharSequence(_main._translate._getstring("lblFontSize")+":"));
 //BA.debugLineNum = 160;BA.debugLine="btnTestConnection.Text = Main.translate.GetString";
_btntestconnection.setText(BA.ObjectToCharSequence(_main._translate._getstring("btnTestConnection")));
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public String  _testconnection_click() throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Private Sub TestConnection_Click";
 //BA.debugLineNum = 257;BA.debugLine="If etServerAdress.Text == \"\" Then";
if ((_etserveradress.getText()).equals("")) { 
 //BA.debugLineNum = 259;BA.debugLine="ToastMessageShow(\"Enter Address\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Address"),__c.False);
 }else if((_etdatabasename.getText()).equals("")) { 
 //BA.debugLineNum = 262;BA.debugLine="ToastMessageShow(\"Enter Name\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Name"),__c.False);
 }else if((_etusername.getText()).equals("")) { 
 //BA.debugLineNum = 265;BA.debugLine="ToastMessageShow(\"Enter User\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Enter User"),__c.False);
 }else if((_etpassword.getText()).equals("")) { 
 //BA.debugLineNum = 268;BA.debugLine="ToastMessageShow(\"Enter Password\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Password"),__c.False);
 }else {
 //BA.debugLineNum = 270;BA.debugLine="DataToConfig";
_datatoconfig();
 //BA.debugLineNum = 271;BA.debugLine="TestConnectionMethod(True)";
_testconnectionmethod(__c.True);
 };
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return "";
}
public String  _testconnectionmethod(boolean _showlogs) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Public Sub TestConnectionMethod(showLogs As Boolea";
 //BA.debugLineNum = 277;BA.debugLine="Try";
try { //BA.debugLineNum = 278;BA.debugLine="btnTestConnection.Enabled = False";
_btntestconnection.setEnabled(__c.False);
 //BA.debugLineNum = 279;BA.debugLine="If IsValidIp(etServerAdress.Text) Then";
if (_isvalidip(_etserveradress.getText())) { 
 //BA.debugLineNum = 280;BA.debugLine="CallSub(Main, \"ConnectToDatabase\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ConnectToDatabase");
 }else {
 //BA.debugLineNum = 282;BA.debugLine="ToastMessageShow(\"Your IP is invalid.\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Your IP is invalid."),__c.False);
 //BA.debugLineNum = 283;BA.debugLine="btnTestConnection.Enabled = True";
_btntestconnection.setEnabled(__c.True);
 //BA.debugLineNum = 284;BA.debugLine="Return";
if (true) return "";
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 287;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
