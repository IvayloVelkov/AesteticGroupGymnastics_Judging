package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class initialsettings extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.initialsettings");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.initialsettings.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _pnlbase = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmenu = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsettings = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllanguage = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnlanguage = null;
public int _intlanguageindex = 0;
public boolean _boovisible = false;
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public String  _calculatefontsizesinitialsettings(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "calculatefontsizesinitialsettings"))
	return (String) Debug.delegate(ba, "calculatefontsizesinitialsettings", null);
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub CalculateFontSizesInitialSettings";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="ProgramData.Tile_Small = UISizes.DefaultFont * 0.";
_programdata._tile_small = (int) (_uisizes._defaultfont*0.71);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="ProgramData.Tile_Large =  UISizes.DefaultFont * 0";
_programdata._tile_large = (int) (_uisizes._defaultfont*0.83);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="ProgramData.TextSize_Small = UISizes.DefaultFont";
_programdata._textsize_small = (int) (_uisizes._defaultfont*0.71);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="ProgramData.TextSize_Large = UISizes.DefaultFont";
_programdata._textsize_large = (int) (_uisizes._defaultfont*0.83);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="ProgramData.TextSize_ExtraLarge = UISizes.Default";
_programdata._textsize_extralarge = _uisizes._defaultfont;
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Public pnlBase, pnlMenu As Panel";
_pnlbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlmenu = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Public lblSettings, lblLanguage As Label";
_lblsettings = new anywheresoftware.b4a.objects.LabelWrapper();
_lbllanguage = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Public SpnLanguage As Spinner";
_spnlanguage = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Public intLanguageIndex As Int";
_intlanguageindex = 0;
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Public booVisible As Boolean";
_boovisible = false;
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="End Sub";
return "";
}
public String  _hiding_click(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "hiding_click"))
	return (String) Debug.delegate(ba, "hiding_click", null);
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub Hiding_Click					'Скриване на панела /";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="InitSettingsHide";
__ref._initsettingshide(null);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public String  _initsettingshide(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initsettingshide"))
	return (String) Debug.delegate(ba, "initsettingshide", null);
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub InitSettingsHide			'Скриване на панел/м";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If pnlMenu.IsInitialized Then pnlMenu.SetLayoutAn";
if (__ref._pnlmenu.IsInitialized()) { 
__ref._pnlmenu.SetLayoutAnimated((int) (200),(int) (-__ref._pnlmenu.getWidth()),__ref._pnlmenu.getTop(),__ref._pnlmenu.getWidth(),__ref._pnlmenu.getHeight());};
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="pnlBase.SendToBack";
__ref._pnlbase.SendToBack();
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="booVisible = False";
__ref._boovisible = __c.False;
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="WriteInitialSettings";
__ref._writeinitialsettings(null);
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.initialsettings __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub Initialize			'Инициализира обекта / Ini";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="pnlBase.Initialize(\"Hiding\")";
__ref._pnlbase.Initialize(ba,"Hiding");
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="pnlMenu.Initialize(\"InitialSetMenuFake\")";
__ref._pnlmenu.Initialize(ba,"InitialSetMenuFake");
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="lblSettings.Initialize(\"\")";
__ref._lblsettings.Initialize(ba,"");
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="lblLanguage.Initialize(\"\")";
__ref._lbllanguage.Initialize(ba,"");
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="SpnLanguage.Initialize(\"spnLang\")";
__ref._spnlanguage.Initialize(ba,"spnLang");
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="InitialSetAddLanguages";
__ref._initialsetaddlanguages(null);
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="End Sub";
return "";
}
public String  _initialsetaddlanguages(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initialsetaddlanguages"))
	return (String) Debug.delegate(ba, "initialsetaddlanguages", null);
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub InitialSetAddLanguages		'Добавяне на е";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="SpnLanguage.Clear";
__ref._spnlanguage.Clear();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="SpnLanguage.AddAll(Main.translate.Get_LanguageLis";
__ref._spnlanguage.AddAll(_main._translate._get_languagelist(null));
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="End Sub";
return "";
}
public boolean  _initialsetmenufake_click(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initialsetmenufake_click"))
	return (Boolean) Debug.delegate(ba, "initialsetmenufake_click", null);
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub InitialSetMenuFake_Click As Boolean	'С";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return false;
}
public String  _initialsetshow(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initialsetshow"))
	return (String) Debug.delegate(ba, "initialsetshow", null);
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub InitialSetShow			'Визуализира на началн";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="pnlBase.BringToFront";
__ref._pnlbase.BringToFront();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="pnlMenu.SetLayoutAnimated(200, 0, pnlMenu.Top, pn";
__ref._pnlmenu.SetLayoutAnimated((int) (200),(int) (0),__ref._pnlmenu.getTop(),__ref._pnlmenu.getWidth(),__ref._pnlmenu.getHeight());
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="booVisible = True";
__ref._boovisible = __c.True;
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="End Sub";
return "";
}
public String  _initialsetsignsrefresh(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initialsetsignsrefresh"))
	return (String) Debug.delegate(ba, "initialsetsignsrefresh", null);
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub InitialSetSignsRefresh		'Опресняване н";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="lblSettings.TextSize = UISizes.DefaultFont";
__ref._lblsettings.setTextSize((float) (_uisizes._defaultfont));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="lblSettings.Text = Main.translate.GetString(\"lblS";
__ref._lblsettings.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"lblSettings")));
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="lblLanguage.TextSize = UISizes.DefaultFont";
__ref._lbllanguage.setTextSize((float) (_uisizes._defaultfont));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="lblLanguage.Text = Main.translate.GetString(\"lblL";
__ref._lbllanguage.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"lblLanguage")));
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="SpnLanguage.TextSize = UISizes.DefaultFont";
__ref._spnlanguage.setTextSize((float) (_uisizes._defaultfont));
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="CallSub(Main,\"Login_SignsRefresh\")	' Когато опрес";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"Login_SignsRefresh");
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _initsetasview(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initsetasview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "initsetasview", null);
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub InitSetAsView As View";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Return pnlBase";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pnlbase.getObject()));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return null;
}
public String  _initsettingsbuildscreen(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initsettingsbuildscreen"))
	return (String) Debug.delegate(ba, "initsettingsbuildscreen", null);
int _labelwidth = 0;
int _labelheight = 0;
int _paddingheight = 0;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub InitSettingsBuildScreen				'Построява е";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="intLanguageIndex = 0						'Български език / Langu";
__ref._intlanguageindex = (int) (0);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="pnlBase.Color = Colors.Transparent 			'База за па";
__ref._pnlbase.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="pnlMenu.Color = Colors.ARGB(255, 50, 50, 50)	'Осн";
__ref._pnlmenu.setColor(__c.Colors.ARGB((int) (255),(int) (50),(int) (50),(int) (50)));
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="pnlBase.AddView(pnlMenu, 0, 0, UISizes.initSettin";
__ref._pnlbase.AddView((android.view.View)(__ref._pnlmenu.getObject()),(int) (0),(int) (0),_uisizes._initsettingswidth,__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Private labelWidth,labelHeight,paddingHeight As I";
_labelwidth = 0;
_labelheight = 0;
_paddingheight = 0;
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="labelWidth = pnlMenu.Width * 0.5";
_labelwidth = (int) (__ref._pnlmenu.getWidth()*0.5);
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="labelHeight = pnlMenu.Height * 0.06";
_labelheight = (int) (__ref._pnlmenu.getHeight()*0.06);
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="paddingHeight = UISizes.DefaultPadding";
_paddingheight = _uisizes._defaultpadding;
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="lblSettings.TextSize = Main.intFontTransfer + 6";
__ref._lblsettings.setTextSize((float) (_main._intfonttransfer+6));
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="lblSettings.Typeface = Typeface.DEFAULT_BOLD";
__ref._lblsettings.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="lblSettings.Gravity = Gravity.CENTER";
__ref._lblsettings.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="pnlMenu.AddView(lblSettings, 0, paddingHeight * 2";
__ref._pnlmenu.AddView((android.view.View)(__ref._lblsettings.getObject()),(int) (0),(int) (_paddingheight*2),__ref._pnlmenu.getWidth(),_labelheight);
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="lblLanguage.TextSize = Main.intFontTransfer - 2";
__ref._lbllanguage.setTextSize((float) (_main._intfonttransfer-2));
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="lblLanguage.Gravity = Gravity.CENTER_VERTICAL + G";
__ref._lbllanguage.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.LEFT));
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="pnlMenu.AddView(lblLanguage, pnlMenu.Width * 0.05";
__ref._pnlmenu.AddView((android.view.View)(__ref._lbllanguage.getObject()),(int) (__ref._pnlmenu.getWidth()*0.05),(int) (__ref._lblsettings.getTop()+__ref._lblsettings.getHeight()*2+_paddingheight),_labelwidth,_labelheight);
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="SpnLanguage.TextSize = Main.intFontTransfer - 2";
__ref._spnlanguage.setTextSize((float) (_main._intfonttransfer-2));
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="SpnLanguage.SelectedIndex = SpnLanguage.IndexOf(M";
__ref._spnlanguage.setSelectedIndex(__ref._spnlanguage.IndexOf(_main._selectedlanguage));
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="HelperFunctions.Remove_Padding(SpnLanguage)";
_helperfunctions._remove_padding(ba,(Object)(__ref._spnlanguage.getObject()));
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="pnlMenu.AddView(SpnLanguage, lblLanguage.Left + l";
__ref._pnlmenu.AddView((android.view.View)(__ref._spnlanguage.getObject()),(int) (__ref._lbllanguage.getLeft()+__ref._lbllanguage.getWidth()),__ref._lbllanguage.getTop(),(int) (__ref._pnlmenu.getWidth()-__ref._lbllanguage.getWidth()-__ref._lbllanguage.getLeft()*2),_labelheight);
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="InitialSetSignsRefresh";
__ref._initialsetsignsrefresh(null);
RDebugUtils.currentLine=1507350;
 //BA.debugLineNum = 1507350;BA.debugLine="End Sub";
return "";
}
public String  _writeinitialsettings(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "writeinitialsettings"))
	return (String) Debug.delegate(ba, "writeinitialsettings", null);
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _randomfile = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub WriteInitialSettings	'Записва първонач";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Private randomFile As RandomAccessFile";
_randomfile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="randomFile.Initialize(File.DirDefaultExternal, \"i";
_randomfile.Initialize(__c.File.getDirDefaultExternal(),"initialSetting.config",__c.False);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="randomFile.WriteEncryptedObject(Main.SelectedLang";
_randomfile.WriteEncryptedObject((Object)(_main._selectedlanguage),BA.NumberToString(_programdata._rafencpass),_randomfile.CurrentPosition);
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="End Sub";
return "";
}
public String  _spnfont_itemclick(b4a.example.initialsettings __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "spnfont_itemclick"))
	return (String) Debug.delegate(ba, "spnfont_itemclick", new Object[] {_position,_value});
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub SpnFont_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="UISizes.DefaultFont = Value";
_uisizes._defaultfont = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="CalculateFontSizesInitialSettings";
__ref._calculatefontsizesinitialsettings(null);
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="SpnLanguage.Clear";
__ref._spnlanguage.Clear();
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="InitialSetAddLanguages";
__ref._initialsetaddlanguages(null);
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="InitialSetSignsRefresh";
__ref._initialsetsignsrefresh(null);
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="End Sub";
return "";
}
public String  _spnlang_itemclick(b4a.example.initialsettings __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "spnlang_itemclick"))
	return (String) Debug.delegate(ba, "spnlang_itemclick", new Object[] {_position,_value});
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub spnLang_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="intLanguageIndex = Position";
__ref._intlanguageindex = _position;
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Main.SelectedLanguage = Value";
_main._selectedlanguage = BA.ObjectToString(_value);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Main.translate.SetLanguage(Value)";
_main._translate._setlanguage(null,BA.ObjectToString(_value));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="InitialSetSignsRefresh";
__ref._initialsetsignsrefresh(null);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="End Sub";
return "";
}
}