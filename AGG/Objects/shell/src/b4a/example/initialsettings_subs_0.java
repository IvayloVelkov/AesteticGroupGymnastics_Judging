package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class initialsettings_subs_0 {


public static RemoteObject  _calculatefontsizesinitialsettings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CalculateFontSizesInitialSettings (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("calculatefontsizesinitialsettings")) return __ref.runUserSub(false, "initialsettings","calculatefontsizesinitialsettings", __ref);
 BA.debugLineNum = 103;BA.debugLine="Private Sub CalculateFontSizesInitialSettings";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="ProgramData.Tile_Small = UISizes.DefaultFont * 0.";
Debug.ShouldStop(128);
initialsettings._programdata._tile_small = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {initialsettings._uisizes._defaultfont,RemoteObject.createImmutable(0.71)}, "*",0, 0));
 BA.debugLineNum = 105;BA.debugLine="ProgramData.Tile_Large =  UISizes.DefaultFont * 0";
Debug.ShouldStop(256);
initialsettings._programdata._tile_large = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {initialsettings._uisizes._defaultfont,RemoteObject.createImmutable(0.83)}, "*",0, 0));
 BA.debugLineNum = 106;BA.debugLine="ProgramData.TextSize_Small = UISizes.DefaultFont";
Debug.ShouldStop(512);
initialsettings._programdata._textsize_small = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {initialsettings._uisizes._defaultfont,RemoteObject.createImmutable(0.71)}, "*",0, 0));
 BA.debugLineNum = 107;BA.debugLine="ProgramData.TextSize_Large = UISizes.DefaultFont";
Debug.ShouldStop(1024);
initialsettings._programdata._textsize_large = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {initialsettings._uisizes._defaultfont,RemoteObject.createImmutable(0.83)}, "*",0, 0));
 BA.debugLineNum = 108;BA.debugLine="ProgramData.TextSize_ExtraLarge = UISizes.Default";
Debug.ShouldStop(2048);
initialsettings._programdata._textsize_extralarge = initialsettings._uisizes._defaultfont;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public pnlBase, pnlMenu As Panel";
initialsettings._pnlbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlbase",initialsettings._pnlbase);
initialsettings._pnlmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlmenu",initialsettings._pnlmenu);
 //BA.debugLineNum = 3;BA.debugLine="Public lblSettings, lblLanguage As Label";
initialsettings._lblsettings = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsettings",initialsettings._lblsettings);
initialsettings._lbllanguage = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbllanguage",initialsettings._lbllanguage);
 //BA.debugLineNum = 4;BA.debugLine="Public SpnLanguage As Spinner";
initialsettings._spnlanguage = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_spnlanguage",initialsettings._spnlanguage);
 //BA.debugLineNum = 5;BA.debugLine="Public intLanguageIndex As Int";
initialsettings._intlanguageindex = RemoteObject.createImmutable(0);__ref.setField("_intlanguageindex",initialsettings._intlanguageindex);
 //BA.debugLineNum = 6;BA.debugLine="Public booVisible As Boolean";
initialsettings._boovisible = RemoteObject.createImmutable(false);__ref.setField("_boovisible",initialsettings._boovisible);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hiding_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hiding_Click (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("hiding_click")) return __ref.runUserSub(false, "initialsettings","hiding_click", __ref);
 BA.debugLineNum = 66;BA.debugLine="Public Sub Hiding_Click					'Скриване на панела /";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="InitSettingsHide";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.initialsettings.class, "_initsettingshide");
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "initialsettings","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize			'Инициализира обекта / Ini";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="pnlBase.Initialize(\"Hiding\")";
Debug.ShouldStop(512);
__ref.getField(false,"_pnlbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Hiding")));
 BA.debugLineNum = 11;BA.debugLine="pnlMenu.Initialize(\"InitialSetMenuFake\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_pnlmenu").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("InitialSetMenuFake")));
 BA.debugLineNum = 12;BA.debugLine="lblSettings.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblsettings").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 13;BA.debugLine="lblLanguage.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbllanguage").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 14;BA.debugLine="SpnLanguage.Initialize(\"spnLang\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_spnlanguage").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("spnLang")));
 BA.debugLineNum = 15;BA.debugLine="InitialSetAddLanguages";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.initialsettings.class, "_initialsetaddlanguages");
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialsetaddlanguages(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitialSetAddLanguages (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("initialsetaddlanguages")) return __ref.runUserSub(false, "initialsettings","initialsetaddlanguages", __ref);
 BA.debugLineNum = 79;BA.debugLine="Private Sub InitialSetAddLanguages		'Добавяне на е";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="SpnLanguage.Clear";
Debug.ShouldStop(32768);
__ref.getField(false,"_spnlanguage").runVoidMethod ("Clear");
 BA.debugLineNum = 81;BA.debugLine="SpnLanguage.AddAll(Main.translate.Get_LanguageLis";
Debug.ShouldStop(65536);
__ref.getField(false,"_spnlanguage").runVoidMethod ("AddAll",(Object)(initialsettings._main._translate.runClassMethod (b4a.example.translator.class, "_get_languagelist")));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialsetmenufake_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitialSetMenuFake_Click (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("initialsetmenufake_click")) return __ref.runUserSub(false, "initialsettings","initialsetmenufake_click", __ref);
 BA.debugLineNum = 111;BA.debugLine="Private Sub InitialSetMenuFake_Click As Boolean	'С";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return initialsettings.__c.getField(true,"True");
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialsetshow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitialSetShow (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialsetshow")) return __ref.runUserSub(false, "initialsettings","initialsetshow", __ref);
 BA.debugLineNum = 23;BA.debugLine="Public Sub InitialSetShow			'Визуализира на началн";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="pnlBase.BringToFront";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlbase").runVoidMethod ("BringToFront");
 BA.debugLineNum = 25;BA.debugLine="pnlMenu.SetLayoutAnimated(200, 0, pnlMenu.Top, pn";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlmenu").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_pnlmenu").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pnlmenu").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnlmenu").runMethod(true,"getHeight")));
 BA.debugLineNum = 26;BA.debugLine="booVisible = True";
Debug.ShouldStop(33554432);
__ref.setField ("_boovisible",initialsettings.__c.getField(true,"True"));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialsetsignsrefresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitialSetSignsRefresh (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("initialsetsignsrefresh")) return __ref.runUserSub(false, "initialsettings","initialsetsignsrefresh", __ref);
 BA.debugLineNum = 70;BA.debugLine="Private Sub InitialSetSignsRefresh		'Опресняване н";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="lblSettings.TextSize = UISizes.DefaultFont";
Debug.ShouldStop(64);
__ref.getField(false,"_lblsettings").runMethod(true,"setTextSize",BA.numberCast(float.class, initialsettings._uisizes._defaultfont));
 BA.debugLineNum = 72;BA.debugLine="lblSettings.Text = Main.translate.GetString(\"lblS";
Debug.ShouldStop(128);
__ref.getField(false,"_lblsettings").runMethod(true,"setText",BA.ObjectToCharSequence(initialsettings._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("lblSettings")))));
 BA.debugLineNum = 73;BA.debugLine="lblLanguage.TextSize = UISizes.DefaultFont";
Debug.ShouldStop(256);
__ref.getField(false,"_lbllanguage").runMethod(true,"setTextSize",BA.numberCast(float.class, initialsettings._uisizes._defaultfont));
 BA.debugLineNum = 74;BA.debugLine="lblLanguage.Text = Main.translate.GetString(\"lblL";
Debug.ShouldStop(512);
__ref.getField(false,"_lbllanguage").runMethod(true,"setText",BA.ObjectToCharSequence(initialsettings._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("lblLanguage")))));
 BA.debugLineNum = 75;BA.debugLine="SpnLanguage.TextSize = UISizes.DefaultFont";
Debug.ShouldStop(1024);
__ref.getField(false,"_spnlanguage").runMethod(true,"setTextSize",BA.numberCast(float.class, initialsettings._uisizes._defaultfont));
 BA.debugLineNum = 76;BA.debugLine="CallSub(Main,\"Login_SignsRefresh\")	' Когато опрес";
Debug.ShouldStop(2048);
initialsettings.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((initialsettings._main.getObject())),(Object)(RemoteObject.createImmutable("Login_SignsRefresh")));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initsetasview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitSetAsView (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initsetasview")) return __ref.runUserSub(false, "initialsettings","initsetasview", __ref);
 BA.debugLineNum = 19;BA.debugLine="Public Sub InitSetAsView As View";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Return pnlBase";
Debug.ShouldStop(524288);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_pnlbase").getObject());
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initsettingsbuildscreen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitSettingsBuildScreen (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initsettingsbuildscreen")) return __ref.runUserSub(false, "initialsettings","initsettingsbuildscreen", __ref);
RemoteObject _labelwidth = RemoteObject.createImmutable(0);
RemoteObject _labelheight = RemoteObject.createImmutable(0);
RemoteObject _paddingheight = RemoteObject.createImmutable(0);
 BA.debugLineNum = 29;BA.debugLine="Public Sub InitSettingsBuildScreen				'Построява е";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="intLanguageIndex = 0						'Български език / Langu";
Debug.ShouldStop(536870912);
__ref.setField ("_intlanguageindex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 31;BA.debugLine="pnlBase.Color = Colors.Transparent 			'База за па";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlbase").runVoidMethod ("setColor",initialsettings.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 32;BA.debugLine="pnlMenu.Color = Colors.ARGB(255, 50, 50, 50)	'Осн";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlmenu").runVoidMethod ("setColor",initialsettings.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 33;BA.debugLine="pnlBase.AddView(pnlMenu, 0, 0, UISizes.initSettin";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlmenu").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(initialsettings._uisizes._initsettingswidth),(Object)(initialsettings.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 34;BA.debugLine="Private labelWidth,labelHeight,paddingHeight As I";
Debug.ShouldStop(2);
_labelwidth = RemoteObject.createImmutable(0);Debug.locals.put("labelWidth", _labelwidth);
_labelheight = RemoteObject.createImmutable(0);Debug.locals.put("labelHeight", _labelheight);
_paddingheight = RemoteObject.createImmutable(0);Debug.locals.put("paddingHeight", _paddingheight);
 BA.debugLineNum = 35;BA.debugLine="labelWidth = pnlMenu.Width * 0.5";
Debug.ShouldStop(4);
_labelwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlmenu").runMethod(true,"getWidth"),RemoteObject.createImmutable(0.5)}, "*",0, 0));Debug.locals.put("labelWidth", _labelwidth);
 BA.debugLineNum = 36;BA.debugLine="labelHeight = pnlMenu.Height * 0.06";
Debug.ShouldStop(8);
_labelheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlmenu").runMethod(true,"getHeight"),RemoteObject.createImmutable(0.06)}, "*",0, 0));Debug.locals.put("labelHeight", _labelheight);
 BA.debugLineNum = 37;BA.debugLine="paddingHeight = UISizes.DefaultPadding";
Debug.ShouldStop(16);
_paddingheight = initialsettings._uisizes._defaultpadding;Debug.locals.put("paddingHeight", _paddingheight);
 BA.debugLineNum = 39;BA.debugLine="lblSettings.TextSize = Main.intFontTransfer + 6";
Debug.ShouldStop(64);
__ref.getField(false,"_lblsettings").runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {initialsettings._main._intfonttransfer,RemoteObject.createImmutable(6)}, "+",1, 1)));
 BA.debugLineNum = 40;BA.debugLine="lblSettings.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(128);
__ref.getField(false,"_lblsettings").runMethod(false,"setTypeface",initialsettings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 41;BA.debugLine="lblSettings.Gravity = Gravity.CENTER";
Debug.ShouldStop(256);
__ref.getField(false,"_lblsettings").runMethod(true,"setGravity",initialsettings.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 42;BA.debugLine="pnlMenu.AddView(lblSettings, 0, paddingHeight * 2";
Debug.ShouldStop(512);
__ref.getField(false,"_pnlmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblsettings").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_paddingheight,RemoteObject.createImmutable(2)}, "*",0, 1)),(Object)(__ref.getField(false,"_pnlmenu").runMethod(true,"getWidth")),(Object)(_labelheight));
 BA.debugLineNum = 43;BA.debugLine="lblLanguage.TextSize = Main.intFontTransfer - 2";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbllanguage").runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {initialsettings._main._intfonttransfer,RemoteObject.createImmutable(2)}, "-",1, 1)));
 BA.debugLineNum = 44;BA.debugLine="lblLanguage.Gravity = Gravity.CENTER_VERTICAL + G";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbllanguage").runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {initialsettings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),initialsettings.__c.getField(false,"Gravity").getField(true,"LEFT")}, "+",1, 1));
 BA.debugLineNum = 45;BA.debugLine="pnlMenu.AddView(lblLanguage, pnlMenu.Width * 0.05";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbllanguage").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlmenu").runMethod(true,"getWidth"),RemoteObject.createImmutable(0.05)}, "*",0, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblsettings").runMethod(true,"getTop"),__ref.getField(false,"_lblsettings").runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_paddingheight}, "+*+",2, 1)),(Object)(_labelwidth),(Object)(_labelheight));
 BA.debugLineNum = 46;BA.debugLine="SpnLanguage.TextSize = Main.intFontTransfer - 2";
Debug.ShouldStop(8192);
__ref.getField(false,"_spnlanguage").runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {initialsettings._main._intfonttransfer,RemoteObject.createImmutable(2)}, "-",1, 1)));
 BA.debugLineNum = 47;BA.debugLine="SpnLanguage.SelectedIndex = SpnLanguage.IndexOf(M";
Debug.ShouldStop(16384);
__ref.getField(false,"_spnlanguage").runMethod(true,"setSelectedIndex",__ref.getField(false,"_spnlanguage").runMethod(true,"IndexOf",(Object)(initialsettings._main._selectedlanguage)));
 BA.debugLineNum = 48;BA.debugLine="HelperFunctions.Remove_Padding(SpnLanguage)";
Debug.ShouldStop(32768);
initialsettings._helperfunctions.runVoidMethod ("_remove_padding",__ref.getField(false, "ba"),(Object)((__ref.getField(false,"_spnlanguage").getObject())));
 BA.debugLineNum = 49;BA.debugLine="pnlMenu.AddView(SpnLanguage, lblLanguage.Left + l";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_spnlanguage").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lbllanguage").runMethod(true,"getLeft"),__ref.getField(false,"_lbllanguage").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_lbllanguage").runMethod(true,"getTop")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlmenu").runMethod(true,"getWidth"),__ref.getField(false,"_lbllanguage").runMethod(true,"getWidth"),__ref.getField(false,"_lbllanguage").runMethod(true,"getLeft"),RemoteObject.createImmutable(2)}, "--*",2, 1)),(Object)(_labelheight));
 BA.debugLineNum = 50;BA.debugLine="InitialSetSignsRefresh";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.initialsettings.class, "_initialsetsignsrefresh");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initsettingshide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitSettingsHide (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("initsettingshide")) return __ref.runUserSub(false, "initialsettings","initsettingshide", __ref);
 BA.debugLineNum = 53;BA.debugLine="Public Sub InitSettingsHide			'Скриване на панел/м";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="If pnlMenu.IsInitialized Then pnlMenu.SetLayoutAn";
Debug.ShouldStop(2097152);
if (__ref.getField(false,"_pnlmenu").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_pnlmenu").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, -(double) (0 + __ref.getField(false,"_pnlmenu").runMethod(true,"getWidth").<Integer>get().intValue()))),(Object)(__ref.getField(false,"_pnlmenu").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pnlmenu").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnlmenu").runMethod(true,"getHeight")));};
 BA.debugLineNum = 55;BA.debugLine="pnlBase.SendToBack";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlbase").runVoidMethod ("SendToBack");
 BA.debugLineNum = 56;BA.debugLine="booVisible = False";
Debug.ShouldStop(8388608);
__ref.setField ("_boovisible",initialsettings.__c.getField(true,"False"));
 BA.debugLineNum = 57;BA.debugLine="WriteInitialSettings";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.initialsettings.class, "_writeinitialsettings");
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spnfont_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpnFont_ItemClick (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("spnfont_itemclick")) return __ref.runUserSub(false, "initialsettings","spnfont_itemclick", __ref, _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 93;BA.debugLine="Private Sub SpnFont_ItemClick (Position As Int, Va";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="UISizes.DefaultFont = Value";
Debug.ShouldStop(536870912);
initialsettings._uisizes._defaultfont = BA.numberCast(int.class, _value);
 BA.debugLineNum = 95;BA.debugLine="CalculateFontSizesInitialSettings";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.initialsettings.class, "_calculatefontsizesinitialsettings");
 BA.debugLineNum = 96;BA.debugLine="SpnLanguage.Clear";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_spnlanguage").runVoidMethod ("Clear");
 BA.debugLineNum = 98;BA.debugLine="InitialSetAddLanguages";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.initialsettings.class, "_initialsetaddlanguages");
 BA.debugLineNum = 99;BA.debugLine="InitialSetSignsRefresh";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.initialsettings.class, "_initialsetsignsrefresh");
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spnlang_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spnLang_ItemClick (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("spnlang_itemclick")) return __ref.runUserSub(false, "initialsettings","spnlang_itemclick", __ref, _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 85;BA.debugLine="Private Sub spnLang_ItemClick (Position As Int, Va";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="intLanguageIndex = Position";
Debug.ShouldStop(2097152);
__ref.setField ("_intlanguageindex",_position);
 BA.debugLineNum = 87;BA.debugLine="Main.SelectedLanguage = Value";
Debug.ShouldStop(4194304);
initialsettings._main._selectedlanguage = BA.ObjectToString(_value);
 BA.debugLineNum = 88;BA.debugLine="Main.translate.SetLanguage(Value)";
Debug.ShouldStop(8388608);
initialsettings._main._translate.runClassMethod (b4a.example.translator.class, "_setlanguage",(Object)(BA.ObjectToString(_value)));
 BA.debugLineNum = 89;BA.debugLine="InitialSetSignsRefresh";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.initialsettings.class, "_initialsetsignsrefresh");
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writeinitialsettings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("WriteInitialSettings (initialsettings) ","initialsettings",3,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("writeinitialsettings")) return __ref.runUserSub(false, "initialsettings","writeinitialsettings", __ref);
RemoteObject _randomfile = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
 BA.debugLineNum = 60;BA.debugLine="Private Sub WriteInitialSettings	'Записва първонач";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Private randomFile As RandomAccessFile";
Debug.ShouldStop(268435456);
_randomfile = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");Debug.locals.put("randomFile", _randomfile);
 BA.debugLineNum = 62;BA.debugLine="randomFile.Initialize(File.DirDefaultExternal, \"i";
Debug.ShouldStop(536870912);
_randomfile.runVoidMethod ("Initialize",(Object)(initialsettings.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("initialSetting.config")),(Object)(initialsettings.__c.getField(true,"False")));
 BA.debugLineNum = 63;BA.debugLine="randomFile.WriteEncryptedObject(Main.SelectedLang";
Debug.ShouldStop(1073741824);
_randomfile.runVoidMethod ("WriteEncryptedObject",(Object)((initialsettings._main._selectedlanguage)),(Object)(BA.NumberToString(initialsettings._programdata._rafencpass)),(Object)(_randomfile.getField(true,"CurrentPosition")));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}