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
public String  _initialize(b4a.example.initialsettings __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Initialize			'Инициализира обекта / Ini";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="pnlBase.Initialize(\"Hiding\")";
__ref._pnlbase.Initialize(ba,"Hiding");
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="pnlMenu.Initialize(\"InitialSetMenuFake\")";
__ref._pnlmenu.Initialize(ba,"InitialSetMenuFake");
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="lblSettings.Initialize(\"\")";
__ref._lblsettings.Initialize(ba,"");
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="lblLanguage.Initialize(\"\")";
__ref._lbllanguage.Initialize(ba,"");
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="SpnLanguage.Initialize(\"spnLang\")";
__ref._spnlanguage.Initialize(ba,"spnLang");
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="InitialSetAddLanguages";
__ref._initialsetaddlanguages(null);
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _initsetasview(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initsetasview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "initsetasview", null);
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub InitSetAsView As Panel";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Return pnlBase";
if (true) return __ref._pnlbase;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub InitSettingsBuildScreen				'Построява е";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="intLanguageIndex = 0						'Български език / Langu";
__ref._intlanguageindex = (int) (0);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="pnlBase.Color = Colors.Transparent 			'База за па";
__ref._pnlbase.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="pnlMenu.Color = Colors.ARGB(255, 50, 50, 50)	'Осн";
__ref._pnlmenu.setColor(__c.Colors.ARGB((int) (255),(int) (50),(int) (50),(int) (50)));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="pnlBase.AddView(pnlMenu, 0, 0, UISizes.initSettin";
__ref._pnlbase.AddView((android.view.View)(__ref._pnlmenu.getObject()),(int) (0),(int) (0),_uisizes._initsettingswidth,__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Private labelWidth,labelHeight,paddingHeight As I";
_labelwidth = 0;
_labelheight = 0;
_paddingheight = 0;
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="labelWidth = pnlMenu.Width * 0.5";
_labelwidth = (int) (__ref._pnlmenu.getWidth()*0.5);
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="labelHeight = pnlMenu.Height * 0.06";
_labelheight = (int) (__ref._pnlmenu.getHeight()*0.06);
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="paddingHeight = UISizes.DefaultPadding";
_paddingheight = _uisizes._defaultpadding;
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="lblSettings.TextSize = Main.intFontTransfer + 6";
__ref._lblsettings.setTextSize((float) (_main._intfonttransfer+6));
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="lblSettings.Typeface = Typeface.DEFAULT_BOLD";
__ref._lblsettings.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="lblSettings.Gravity = Gravity.CENTER";
__ref._lblsettings.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="pnlMenu.AddView(lblSettings, 0, paddingHeight * 2";
__ref._pnlmenu.AddView((android.view.View)(__ref._lblsettings.getObject()),(int) (0),(int) (_paddingheight*2),__ref._pnlmenu.getWidth(),_labelheight);
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="lblLanguage.TextSize = Main.intFontTransfer - 2";
__ref._lbllanguage.setTextSize((float) (_main._intfonttransfer-2));
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="lblLanguage.Gravity = Gravity.CENTER_VERTICAL + G";
__ref._lbllanguage.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.LEFT));
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="pnlMenu.AddView(lblLanguage, pnlMenu.Width * 0.05";
__ref._pnlmenu.AddView((android.view.View)(__ref._lbllanguage.getObject()),(int) (__ref._pnlmenu.getWidth()*0.05),(int) (__ref._lblsettings.getTop()+__ref._lblsettings.getHeight()*2+_paddingheight),_labelwidth,_labelheight);
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="SpnLanguage.TextSize = Main.intFontTransfer - 2";
__ref._spnlanguage.setTextSize((float) (_main._intfonttransfer-2));
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="SpnLanguage.SelectedIndex = SpnLanguage.IndexOf(M";
__ref._spnlanguage.setSelectedIndex(__ref._spnlanguage.IndexOf(_main._selectedlanguage));
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="HelperFunctions.Remove_Padding(SpnLanguage)";
_helperfunctions._remove_padding(ba,(Object)(__ref._spnlanguage.getObject()));
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="pnlMenu.AddView(SpnLanguage, lblLanguage.Left + l";
__ref._pnlmenu.AddView((android.view.View)(__ref._spnlanguage.getObject()),(int) (__ref._lbllanguage.getLeft()+__ref._lbllanguage.getWidth()),__ref._lbllanguage.getTop(),(int) (__ref._pnlmenu.getWidth()-__ref._lbllanguage.getWidth()-__ref._lbllanguage.getLeft()*2),_labelheight);
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="InitialSetSignsRefresh";
__ref._initialsetsignsrefresh(null);
RDebugUtils.currentLine=2883606;
 //BA.debugLineNum = 2883606;BA.debugLine="End Sub";
return "";
}
public String  _initialsetshow(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initialsetshow"))
	return (String) Debug.delegate(ba, "initialsetshow", null);
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub InitialSetShow			'Визуализира на началн";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="pnlBase.BringToFront";
__ref._pnlbase.BringToFront();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="pnlMenu.SetLayoutAnimated(200, 0, pnlMenu.Top, pn";
__ref._pnlmenu.SetLayoutAnimated((int) (200),(int) (0),__ref._pnlmenu.getTop(),__ref._pnlmenu.getWidth(),__ref._pnlmenu.getHeight());
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="booVisible = True";
__ref._boovisible = __c.True;
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Public pnlBase, pnlMenu As Panel";
_pnlbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlmenu = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Public lblSettings, lblLanguage As Label";
_lblsettings = new anywheresoftware.b4a.objects.LabelWrapper();
_lbllanguage = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Public SpnLanguage As Spinner";
_spnlanguage = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Public intLanguageIndex As Int";
_intlanguageindex = 0;
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Public booVisible As Boolean";
_boovisible = false;
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="End Sub";
return "";
}
public String  _hiding_click(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "hiding_click"))
	return (String) Debug.delegate(ba, "hiding_click", null);
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Hiding_Click					'Скриване на панела /";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="InitSettingsHide";
__ref._initsettingshide(null);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public String  _initsettingshide(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initsettingshide"))
	return (String) Debug.delegate(ba, "initsettingshide", null);
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub InitSettingsHide			'Скриване на панел/м";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="If pnlMenu.IsInitialized Then pnlMenu.SetLayoutAn";
if (__ref._pnlmenu.IsInitialized()) { 
__ref._pnlmenu.SetLayoutAnimated((int) (200),(int) (-__ref._pnlmenu.getWidth()),__ref._pnlmenu.getTop(),__ref._pnlmenu.getWidth(),__ref._pnlmenu.getHeight());};
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="pnlBase.SendToBack";
__ref._pnlbase.SendToBack();
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="booVisible = False";
__ref._boovisible = __c.False;
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="WriteInitialSettings";
__ref._writeinitialsettings(null);
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="End Sub";
return "";
}
public String  _initialsetaddlanguages(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initialsetaddlanguages"))
	return (String) Debug.delegate(ba, "initialsetaddlanguages", null);
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub InitialSetAddLanguages		'Добавяне на е";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="SpnLanguage.Clear";
__ref._spnlanguage.Clear();
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="SpnLanguage.AddAll(Main.translate.Get_LanguageLis";
__ref._spnlanguage.AddAll(_main._translate._get_languagelist(null));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public boolean  _initialsetmenufake_click(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initialsetmenufake_click"))
	return (Boolean) Debug.delegate(ba, "initialsetmenufake_click", null);
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub InitialSetMenuFake_Click As Boolean	'С";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return false;
}
public String  _initialsetsignsrefresh(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "initialsetsignsrefresh"))
	return (String) Debug.delegate(ba, "initialsetsignsrefresh", null);
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub InitialSetSignsRefresh		'Опресняване н";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="lblSettings.TextSize = UISizes.DefaultFont";
__ref._lblsettings.setTextSize((float) (_uisizes._defaultfont));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="lblSettings.Text = Main.translate.GetString(\"lblS";
__ref._lblsettings.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"lblSettings")));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="lblLanguage.TextSize = UISizes.DefaultFont";
__ref._lbllanguage.setTextSize((float) (_uisizes._defaultfont));
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="lblLanguage.Text = Main.translate.GetString(\"lblL";
__ref._lbllanguage.setText(BA.ObjectToCharSequence(_main._translate._getstring(null,"lblLanguage")));
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="SpnLanguage.TextSize = UISizes.DefaultFont";
__ref._spnlanguage.setTextSize((float) (_uisizes._defaultfont));
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="End Sub";
return "";
}
public String  _writeinitialsettings(b4a.example.initialsettings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "writeinitialsettings"))
	return (String) Debug.delegate(ba, "writeinitialsettings", null);
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _randomfile = null;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub WriteInitialSettings	'Записва първонач";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Private randomFile As RandomAccessFile";
_randomfile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="randomFile.Initialize(File.DirDefaultExternal, \"i";
_randomfile.Initialize(__c.File.getDirDefaultExternal(),"initialSetting.config",__c.False);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="randomFile.WriteEncryptedObject(Main.SelectedLang";
_randomfile.WriteEncryptedObject((Object)(_main._selectedlanguage),BA.NumberToString(_programdata._rafencpass),_randomfile.CurrentPosition);
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="End Sub";
return "";
}
public String  _spnlang_itemclick(b4a.example.initialsettings __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="initialsettings";
if (Debug.shouldDelegate(ba, "spnlang_itemclick"))
	return (String) Debug.delegate(ba, "spnlang_itemclick", new Object[] {_position,_value});
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub spnLang_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="intLanguageIndex = Position";
__ref._intlanguageindex = _position;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Main.SelectedLanguage = Value";
_main._selectedlanguage = BA.ObjectToString(_value);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Main.translate.SetLanguage(Value)";
_main._translate._setlanguage(null,BA.ObjectToString(_value));
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="InitialSetSignsRefresh";
__ref._initialsetsignsrefresh(null);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="End Sub";
return "";
}
}