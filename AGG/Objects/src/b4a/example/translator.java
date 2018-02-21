package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class translator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.translator");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.translator.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _product{
public boolean IsInitialized;
public String productName;
public anywheresoftware.b4a.objects.collections.Map languageMap;
public anywheresoftware.b4a.objects.collections.List languageList;
public anywheresoftware.b4a.objects.collections.Map languagesDisplayNames;
public int dictionaryVersion;
public anywheresoftware.b4a.objects.collections.Map dictionary;
public anywheresoftware.b4a.objects.collections.Map languagesBeforeUpdate;
public int languageCounter;
public int selectedLanguage;
public void Initialize() {
IsInitialized = true;
productName = "";
languageMap = new anywheresoftware.b4a.objects.collections.Map();
languageList = new anywheresoftware.b4a.objects.collections.List();
languagesDisplayNames = new anywheresoftware.b4a.objects.collections.Map();
dictionaryVersion = 0;
dictionary = new anywheresoftware.b4a.objects.collections.Map();
languagesBeforeUpdate = new anywheresoftware.b4a.objects.collections.Map();
languageCounter = 0;
selectedLanguage = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.translator._product _workingproduct = null;
public int _dictionaryversion = 0;
public int _en = 0;
public anywheresoftware.b4a.objects.collections.Map _productsversionsmap = null;
public String _selectedproduct = "";
public anywheresoftware.b4a.objects.collections.Map _alldictionaries = null;
public anywheresoftware.b4a.objects.collections.Map _dictionary = null;
public String _filedirpath = "";
public anywheresoftware.b4a.objects.SaxParser _xmlparser = null;
public anywheresoftware.b4a.objects.collections.List _xmlitemvalues = null;
public String _languageforparsing = "";
public String _displaynameforparsing = "";
public String _keyforparsing = "";
public String _productnameforparsing = "";
public boolean _isimporting = false;
public int _indexoflanguagetoupdate = 0;
public String _unknownabbreviature = "";
public String _langabbreviature = "";
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public String  _initialize(b4a.example.translator __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub Initialize()";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="fileDirPath = File.DirRootExternal";
__ref._filedirpath = __c.File.getDirRootExternal();
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="workingProduct.Initialize";
__ref._workingproduct.Initialize();
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Try";
try {RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="If Version.ProductID > 99 Then";
if (_version._productid>99) { 
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="If File.Exists(fileDirPath, Version.Path & \"/di";
if (__c.File.Exists(__ref._filedirpath,_version._path(getActivityBA())+"/dictionary.xml")) { 
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="Open_XML(fileDirPath,  Version.Path & \"/dictio";
__ref._open_xml(null,__ref._filedirpath,_version._path(getActivityBA())+"/dictionary.xml");
 }else {
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="Open_XML(File.DirAssets, \"dictionary.xml\")";
__ref._open_xml(null,__c.File.getDirAssets(),"dictionary.xml");
 };
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=3342351;
 //BA.debugLineNum = 3342351;BA.debugLine="Log(LastException.Message)";
__c.Log(__c.LastException(getActivityBA()).getMessage());
 };
RDebugUtils.currentLine=3342353;
 //BA.debugLineNum = 3342353;BA.debugLine="unknownAbbreviature = \"UNKNOWN ABBREVIATION\"";
__ref._unknownabbreviature = "UNKNOWN ABBREVIATION";
RDebugUtils.currentLine=3342354;
 //BA.debugLineNum = 3342354;BA.debugLine="End Sub";
return "";
}
public String  _getstring(b4a.example.translator __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "getstring"))
	return (String) Debug.delegate(ba, "getstring", new Object[] {_key});
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub GetString(key As String) As String";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="If (dictionary.ContainsKey(key)) Then";
if ((__ref._dictionary.ContainsKey((Object)(_key)))) { 
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Return Get_Translation(key)";
if (true) return __ref._get_translation(null,_key);
 }else {
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="Return Get_Translation(\"strStringNotFound\")";
if (true) return __ref._get_translation(null,"strStringNotFound");
 };
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _get_languagelist(b4a.example.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_languagelist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "get_languagelist", null);
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub Get_LanguageList() As List";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Return workingProduct.languageList";
if (true) return __ref._workingproduct.languageList;
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return null;
}
public String  _setlanguage(b4a.example.translator __ref,String _lang) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "setlanguage"))
	return (String) Debug.delegate(ba, "setlanguage", new Object[] {_lang});
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub SetLanguage(lang As String)";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="lang = lang.ToUpperCase";
_lang = _lang.toUpperCase();
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="If (workingProduct.languageMap.ContainsKey(lang))";
if ((__ref._workingproduct.languageMap.ContainsKey((Object)(_lang)))) { 
__ref._workingproduct.selectedLanguage = (int)(BA.ObjectToNumber(__ref._workingproduct.languageMap.Get((Object)(_lang))));};
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Type Product(productName As String, languageMap A";
;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Private workingProduct As Product";
_workingproduct = new b4a.example.translator._product();
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Private dictionaryVersion, EN As Int		'Ignore (th";
_dictionaryversion = 0;
_en = 0;
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Private productsVersionsMap As Map 'productName i";
_productsversionsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="Private selectedProduct As String 'choosed produc";
_selectedproduct = "";
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="Private allDictionaries As Map 'all products and";
_alldictionaries = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Private dictionary As Map 'loaded dictionary for";
_dictionary = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="Private fileDirPath As String 'path to dictionary";
_filedirpath = "";
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="Private xmlParser As SaxParser";
_xmlparser = new anywheresoftware.b4a.objects.SaxParser();
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="Private xmlItemValues As List";
_xmlitemvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="Private languageForParsing, displayNameForParsing";
_languageforparsing = "";
_displaynameforparsing = "";
_keyforparsing = "";
_productnameforparsing = "";
RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="Private isImporting As Boolean = False 'Flag rais";
_isimporting = __c.False;
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="Private indexOfLanguageToUpdate As Int 'id of lan";
_indexoflanguagetoupdate = 0;
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="Private unknownAbbreviature As String 'For import";
_unknownabbreviature = "";
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="Private langAbbreviature As String 'saves last it";
_langabbreviature = "";
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _duplicate_map(b4a.example.translator __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "duplicate_map"))
	return (anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "duplicate_map", new Object[] {_source});
anywheresoftware.b4a.objects.collections.Map _copymap = null;
String _key = "";
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub Duplicate_Map (source As Map) As Map";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Private copyMap As Map";
_copymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="copyMap.Initialize";
_copymap.Initialize();
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="For Each key As String In  source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _source.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="copyMap.Put(key,source.Get(key))";
_copymap.Put((Object)(_key),_source.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="Return copyMap";
if (true) return _copymap;
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="End Sub";
return null;
}
public String  _generate_languagelist(b4a.example.translator __ref,String _langabbreviation) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "generate_languagelist"))
	return (String) Debug.delegate(ba, "generate_languagelist", new Object[] {_langabbreviation});
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub Generate_LanguageList(langAbbreviation";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="langAbbreviation = langAbbreviation.ToUpperCase";
_langabbreviation = _langabbreviation.toUpperCase();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="If Not(workingProduct.languageMap.ContainsKey(lan";
if (__c.Not(__ref._workingproduct.languageMap.ContainsKey((Object)(_langabbreviation)))) { 
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="workingProduct.languageMap.Put(langAbbreviation,";
__ref._workingproduct.languageMap.Put((Object)(_langabbreviation),(Object)(__ref._workingproduct.languageCounter));
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="If Not (workingProduct.languagesDisplayNames.IsI";
if (__c.Not(__ref._workingproduct.languagesDisplayNames.IsInitialized())) { 
__ref._workingproduct.languagesDisplayNames.Initialize();};
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="workingProduct.languagesDisplayNames.Put(langAbb";
__ref._workingproduct.languagesDisplayNames.Put((Object)(_langabbreviation),(Object)(__ref._displaynameforparsing));
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="workingProduct.languageList.Add(langAbbreviation";
__ref._workingproduct.languageList.Add((Object)(_langabbreviation));
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="workingProduct.languageCounter = workingProduct.";
__ref._workingproduct.languageCounter = (int) (__ref._workingproduct.languageCounter+1);
 };
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="End Sub";
return "";
}
public String  _generate_maprow(b4a.example.translator __ref,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text,String _language) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "generate_maprow"))
	return (String) Debug.delegate(ba, "generate_maprow", new Object[] {_name,_text,_language});
anywheresoftware.b4a.objects.collections.List _newrecords = null;
String _keytranslation = "";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub Generate_MapRow(Name As String, Text A";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If(Name.Length <> 2) Then";
if ((_name.length()!=2)) { 
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Private newRecords As List";
_newrecords = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="newRecords.Initialize";
_newrecords.Initialize();
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="newRecords.AddAll(xmlItemValues)";
_newrecords.AddAll(__ref._xmlitemvalues);
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="If isImporting Then";
if (__ref._isimporting) { 
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="If workingProduct.languagesBeforeUpdate.Contain";
if (__ref._workingproduct.languagesBeforeUpdate.ContainsKey((Object)(_language)) && (_language).equals("EN") == false && (_language).equals(__ref._unknownabbreviature) == false) { 
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="Dim keyTranslation As String = xmlItemValues.G";
_keytranslation = BA.ObjectToString(__ref._xmlitemvalues.Get((int) (__ref._xmlitemvalues.getSize()-1)));
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="Update_ExistingLanguage(Name, keyTranslation)";
__ref._update_existinglanguage(null,_name,_keytranslation);
 }else {
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="Import_NewLanguage(Name, newRecords)";
__ref._import_newlanguage(null,_name,_newrecords);
 };
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="dictionary.Put(Name, newRecords)";
__ref._dictionary.Put((Object)(_name),(Object)(_newrecords.getObject()));
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="xmlItemValues.Clear";
__ref._xmlitemvalues.Clear();
RDebugUtils.currentLine=3866640;
 //BA.debugLineNum = 3866640;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="If Not(xmlItemValues.isInitialized) Then xmlItemV";
if (__c.Not(__ref._xmlitemvalues.IsInitialized())) { 
__ref._xmlitemvalues.Initialize();};
RDebugUtils.currentLine=3866643;
 //BA.debugLineNum = 3866643;BA.debugLine="xmlItemValues.Add(Text.ToString)";
__ref._xmlitemvalues.Add((Object)(_text.ToString()));
RDebugUtils.currentLine=3866644;
 //BA.debugLineNum = 3866644;BA.debugLine="End Sub";
return "";
}
public String  _update_existinglanguage(b4a.example.translator __ref,String _key,String _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "update_existinglanguage"))
	return (String) Debug.delegate(ba, "update_existinglanguage", new Object[] {_key,_data});
anywheresoftware.b4a.objects.collections.List _updatelist = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub Update_ExistingLanguage(key As String,";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If(dictionary.ContainsKey(key)) Then";
if ((__ref._dictionary.ContainsKey((Object)(_key)))) { 
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Private updateList As List = dictionary.Get(key)";
_updatelist = new anywheresoftware.b4a.objects.collections.List();
_updatelist.setObject((java.util.List)(__ref._dictionary.Get((Object)(_key))));
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="dictionary.Remove(key)";
__ref._dictionary.Remove((Object)(_key));
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="updateList.Set(indexOfLanguageToUpdate, data)";
_updatelist.Set(__ref._indexoflanguagetoupdate,(Object)(_data));
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="dictionary.Put(key, updateList)";
__ref._dictionary.Put((Object)(_key),(Object)(_updatelist.getObject()));
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="xmlItemValues.Clear";
__ref._xmlitemvalues.Clear();
 };
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="End Sub";
return "";
}
public String  _import_newlanguage(b4a.example.translator __ref,String _key,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "import_newlanguage"))
	return (String) Debug.delegate(ba, "import_newlanguage", new Object[] {_key,_values});
anywheresoftware.b4a.objects.collections.List _updatelist = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub Import_NewLanguage(key As String, valu";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If(dictionary.ContainsKey(key)) Then";
if ((__ref._dictionary.ContainsKey((Object)(_key)))) { 
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="If productNameForParsing = selectedProduct Then";
if ((__ref._productnameforparsing).equals(__ref._selectedproduct)) { 
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Private updateList As List = dictionary.Get(key";
_updatelist = new anywheresoftware.b4a.objects.collections.List();
_updatelist.setObject((java.util.List)(__ref._dictionary.Get((Object)(_key))));
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="updateList.Add(values.Get(values.Size-1))";
_updatelist.Add(_values.Get((int) (_values.getSize()-1)));
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="dictionary.Put(key, updateList)";
__ref._dictionary.Put((Object)(_key),(Object)(_updatelist.getObject()));
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="xmlItemValues.Clear";
__ref._xmlitemvalues.Clear();
 };
 };
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="End Sub";
return "";
}
public String  _get_language(b4a.example.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_language"))
	return (String) Debug.delegate(ba, "get_language", null);
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub Get_Language() As String";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Return workingProduct.selectedLanguage";
if (true) return BA.NumberToString(__ref._workingproduct.selectedLanguage);
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return "";
}
public String  _get_translatedstring(b4a.example.translator __ref,String _key,int _language) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_translatedstring"))
	return (String) Debug.delegate(ba, "get_translatedstring", new Object[] {_key,_language});
anywheresoftware.b4a.objects.collections.List _strtranslationlist = null;
String _translatedstring = "";
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub Get_TranslatedString(key As String, la";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Try";
try {RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Private strTranslationList As List = dictionary.";
_strtranslationlist = new anywheresoftware.b4a.objects.collections.List();
_strtranslationlist.setObject((java.util.List)(__ref._dictionary.Get((Object)(_key))));
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="If language < strTranslationList.Size Then";
if (_language<_strtranslationlist.getSize()) { 
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Private translatedString As String = strTransla";
_translatedstring = BA.ObjectToString(_strtranslationlist.Get(_language));
 };
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="Return translatedString";
if (true) return _translatedstring;
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="translatedString = \"NOT TRANSLATED\"";
_translatedstring = "NOT TRANSLATED";
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="Log(\"ERROR IN KEY: \" & key)";
__c.Log("ERROR IN KEY: "+_key);
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="Return translatedString";
if (true) return _translatedstring;
 };
RDebugUtils.currentLine=4456460;
 //BA.debugLineNum = 4456460;BA.debugLine="End Sub";
return "";
}
public String  _get_translation(b4a.example.translator __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_translation"))
	return (String) Debug.delegate(ba, "get_translation", new Object[] {_key});
String _translationstring = "";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Private Sub Get_Translation(key As String) As Stri";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Try";
try {RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Private translationString As String = Get_Transl";
_translationstring = __ref._get_translatedstring(null,_key,__ref._workingproduct.selectedLanguage);
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="If(translationString <> \"\") Then";
if (((_translationstring).equals("") == false)) { 
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Return translationString";
if (true) return _translationstring;
 }else {
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Return Get_TranslatedString(key, EN)";
if (true) return __ref._get_translatedstring(null,_key,__ref._en);
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="translationString = \"NOT TRANSLATED\"";
_translationstring = "NOT TRANSLATED";
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="Log(\"ERROR IN KEY: \" & key)";
__c.Log("ERROR IN KEY: "+_key);
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="Return translationString";
if (true) return _translationstring;
 };
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="End Sub";
return "";
}
public String  _open_xml(b4a.example.translator __ref,String _filepath,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "open_xml"))
	return (String) Debug.delegate(ba, "open_xml", new Object[] {_filepath,_filename});
b4a.example.translator._product _currentproduct = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub Open_XML(filePath As String, fileName";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="ResetVariables";
__ref._resetvariables(null);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="productsVersionsMap.Initialize";
__ref._productsversionsmap.Initialize();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="allDictionaries.Initialize";
__ref._alldictionaries.Initialize();
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Parse_XML(filePath, fileName)";
__ref._parse_xml(null,_filepath,_filename);
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="SetProduct(selectedProduct)";
__ref._setproduct(null,__ref._selectedproduct);
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="If workingProduct.IsInitialized And workingProduc";
if (__ref._workingproduct.IsInitialized && __ref._workingproduct.languagesBeforeUpdate.getSize()>0) { 
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Private currentProduct As Product = allDictionar";
_currentproduct = (b4a.example.translator._product)(__ref._alldictionaries.Get((Object)(__ref._workingproduct.productName)));
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="currentProduct.languagesBeforeUpdate = workingPr";
_currentproduct.languagesBeforeUpdate = __ref._workingproduct.languagesBeforeUpdate;
 };
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="End Sub";
return "";
}
public String  _resetvariables(b4a.example.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "resetvariables"))
	return (String) Debug.delegate(ba, "resetvariables", null);
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub ResetVariables";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="dictionary.Initialize";
__ref._dictionary.Initialize();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="workingProduct.Initialize";
__ref._workingproduct.Initialize();
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="workingProduct.languageMap.Initialize";
__ref._workingproduct.languageMap.Initialize();
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="workingProduct.languagesDisplayNames.Initialize";
__ref._workingproduct.languagesDisplayNames.Initialize();
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="workingProduct.languagesBeforeUpdate.Initialize";
__ref._workingproduct.languagesBeforeUpdate.Initialize();
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="workingProduct.languageList.Initialize";
__ref._workingproduct.languageList.Initialize();
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="workingProduct.languageCounter = 0";
__ref._workingproduct.languageCounter = (int) (0);
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="End Sub";
return "";
}
public String  _parse_xml(b4a.example.translator __ref,String _filepath,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "parse_xml"))
	return (String) Debug.delegate(ba, "parse_xml", new Object[] {_filepath,_filename});
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _xmltext = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub Parse_XML(filePath As String, fileName";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Private xmlText As InputStream";
_xmltext = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="xmlText = File.OpenInput(filePath, fileName)";
_xmltext = __c.File.OpenInput(_filepath,_filename);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="xmlParser.Initialize";
__ref._xmlparser.Initialize(ba);
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="xmlParser.parse(xmlText, \"xmlParser\")";
__ref._xmlparser.Parse((java.io.InputStream)(_xmltext.getObject()),"xmlParser");
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="xmlText.Close";
_xmltext.Close();
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="End Sub";
return "";
}
public String  _setproduct(b4a.example.translator __ref,String _productname) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "setproduct"))
	return (String) Debug.delegate(ba, "setproduct", new Object[] {_productname});
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub SetProduct(productName As String)";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="If allDictionaries.ContainsKey(productName) Then";
if (__ref._alldictionaries.ContainsKey((Object)(_productname))) { 
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="workingProduct = allDictionaries.Get(productName";
__ref._workingproduct = (b4a.example.translator._product)(__ref._alldictionaries.Get((Object)(_productname)));
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="dictionary.Clear";
__ref._dictionary.Clear();
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="dictionary = Duplicate_Map(workingProduct.dictio";
__ref._dictionary = __ref._duplicate_map(null,__ref._workingproduct.dictionary);
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="selectedProduct = productName";
__ref._selectedproduct = _productname;
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="dictionaryVersion = workingProduct.dictionaryVer";
__ref._dictionaryversion = __ref._workingproduct.dictionaryVersion;
 };
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="End Sub";
return "";
}
public String  _xmlparser_endelement(b4a.example.translator __ref,String _uri,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "xmlparser_endelement"))
	return (String) Debug.delegate(ba, "xmlparser_endelement", new Object[] {_uri,_name,_text});
b4a.example.translator._product _currentproduct = null;
String _key = "";
int _value = 0;
int _languagekey = 0;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub xmlParser_EndElement (Uri As String, N";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If xmlParser.Parents.IndexOf(\"TranslationDictiona";
if (__ref._xmlparser.Parents.IndexOf((Object)("TranslationDictionaries"))>-1) { 
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="If Name = \"Dictionary\" And dictionary.Size > 0 T";
if ((_name).equals("Dictionary") && __ref._dictionary.getSize()>0) { 
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="If isImporting And workingProduct.productName <";
if (__ref._isimporting && (__ref._workingproduct.productName).equals(__ref._productnameforparsing) == false) { 
if (true) return "";};
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="Private currentProduct As Product";
_currentproduct = new b4a.example.translator._product();
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="currentProduct.Initialize";
_currentproduct.Initialize();
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="currentProduct.languageList.Initialize";
_currentproduct.languageList.Initialize();
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="currentProduct.languageMap = Duplicate_Map (wor";
_currentproduct.languageMap = __ref._duplicate_map(null,__ref._workingproduct.languageMap);
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="currentProduct.languageList.AddAll(workingProdu";
_currentproduct.languageList.AddAll(__ref._workingproduct.languageList);
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="currentProduct.languagesDisplayNames = Duplicat";
_currentproduct.languagesDisplayNames = __ref._duplicate_map(null,__ref._workingproduct.languagesDisplayNames);
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="currentProduct.dictionaryVersion = dictionaryVe";
_currentproduct.dictionaryVersion = __ref._dictionaryversion;
RDebugUtils.currentLine=3670028;
 //BA.debugLineNum = 3670028;BA.debugLine="currentProduct.dictionary = Duplicate_Map(dicti";
_currentproduct.dictionary = __ref._duplicate_map(null,__ref._dictionary);
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="currentProduct.productName = productNameForPars";
_currentproduct.productName = __ref._productnameforparsing;
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="currentProduct.languagesBeforeUpdate = Duplicat";
_currentproduct.languagesBeforeUpdate = __ref._duplicate_map(null,__ref._workingproduct.languagesBeforeUpdate);
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="currentProduct.languageCounter = workingProduct";
_currentproduct.languageCounter = __ref._workingproduct.languageCounter;
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="currentProduct.selectedLanguage = workingProduc";
_currentproduct.selectedLanguage = __ref._workingproduct.selectedLanguage;
RDebugUtils.currentLine=3670033;
 //BA.debugLineNum = 3670033;BA.debugLine="allDictionaries.Put(productNameForParsing, curr";
__ref._alldictionaries.Put((Object)(__ref._productnameforparsing),(Object)(_currentproduct));
RDebugUtils.currentLine=3670034;
 //BA.debugLineNum = 3670034;BA.debugLine="If productNameForParsing = \"TranslationTool\" Or";
if ((__ref._productnameforparsing).equals("TranslationTool") || (__ref._productnameforparsing).equals(_version._productindictionary)) { 
RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="allDictionaries.Put(productNameForParsing, cur";
__ref._alldictionaries.Put((Object)(__ref._productnameforparsing),(Object)(_currentproduct));
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="selectedProduct = Version.ProductInDictionary";
__ref._selectedproduct = _version._productindictionary;
 };
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="ResetVariables";
__ref._resetvariables(null);
RDebugUtils.currentLine=3670039;
 //BA.debugLineNum = 3670039;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3670041;
 //BA.debugLineNum = 3670041;BA.debugLine="langAbbreviature = languageForParsing";
__ref._langabbreviature = __ref._languageforparsing;
RDebugUtils.currentLine=3670042;
 //BA.debugLineNum = 3670042;BA.debugLine="If Name = \"Language\" Then";
if ((_name).equals("Language")) { 
RDebugUtils.currentLine=3670043;
 //BA.debugLineNum = 3670043;BA.debugLine="Generate_LanguageList(Text)";
__ref._generate_languagelist(null,BA.ObjectToString(_text));
 };
RDebugUtils.currentLine=3670045;
 //BA.debugLineNum = 3670045;BA.debugLine="If Name = \"Data\" Or Name = \"Value\" Then";
if ((_name).equals("Data") || (_name).equals("Value")) { 
RDebugUtils.currentLine=3670046;
 //BA.debugLineNum = 3670046;BA.debugLine="If workingProduct.languagesBeforeUpdate.Contain";
if (__ref._workingproduct.languagesBeforeUpdate.ContainsKey((Object)(__ref._languageforparsing))) { 
RDebugUtils.currentLine=3670047;
 //BA.debugLineNum = 3670047;BA.debugLine="For Each key As String In workingProduct.langu";
{
final anywheresoftware.b4a.BA.IterableList group30 = __ref._workingproduct.languagesBeforeUpdate.Keys();
final int groupLen30 = group30.getSize()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_key = BA.ObjectToString(group30.Get(index30));
RDebugUtils.currentLine=3670048;
 //BA.debugLineNum = 3670048;BA.debugLine="Private value As Int = workingProduct.languag";
_value = (int)(BA.ObjectToNumber(__ref._workingproduct.languagesBeforeUpdate.Get((Object)(_key))));
RDebugUtils.currentLine=3670049;
 //BA.debugLineNum = 3670049;BA.debugLine="Private languageKey As Int = workingProduct.l";
_languagekey = (int)(BA.ObjectToNumber(__ref._workingproduct.languageMap.Get((Object)(__ref._languageforparsing))));
RDebugUtils.currentLine=3670050;
 //BA.debugLineNum = 3670050;BA.debugLine="If languageKey = value Then";
if (_languagekey==_value) { 
RDebugUtils.currentLine=3670051;
 //BA.debugLineNum = 3670051;BA.debugLine="indexOfLanguageToUpdate = value";
__ref._indexoflanguagetoupdate = _value;
RDebugUtils.currentLine=3670052;
 //BA.debugLineNum = 3670052;BA.debugLine="langAbbreviature = key";
__ref._langabbreviature = _key;
RDebugUtils.currentLine=3670053;
 //BA.debugLineNum = 3670053;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=3670056;
 //BA.debugLineNum = 3670056;BA.debugLine="If isImporting And indexOfLanguageToUpdate = E";
if (__ref._isimporting && __ref._indexoflanguagetoupdate==__ref._en) { 
if (true) return "";};
 }else {
RDebugUtils.currentLine=3670058;
 //BA.debugLineNum = 3670058;BA.debugLine="If Not(workingProduct.languagesBeforeUpdate.Co";
if (__c.Not(__ref._workingproduct.languagesBeforeUpdate.ContainsKey((Object)(__ref._langabbreviature)))) { 
RDebugUtils.currentLine=3670059;
 //BA.debugLineNum = 3670059;BA.debugLine="langAbbreviature = unknownAbbreviature";
__ref._langabbreviature = __ref._unknownabbreviature;
 };
 };
RDebugUtils.currentLine=3670062;
 //BA.debugLineNum = 3670062;BA.debugLine="If Name = \"Value\" Then Name = languageForParsin";
if ((_name).equals("Value")) { 
_name = __ref._languageforparsing;};
RDebugUtils.currentLine=3670063;
 //BA.debugLineNum = 3670063;BA.debugLine="If Name = \"Data\" Then Name = keyForParsing";
if ((_name).equals("Data")) { 
_name = __ref._keyforparsing;};
RDebugUtils.currentLine=3670064;
 //BA.debugLineNum = 3670064;BA.debugLine="Generate_MapRow(Name, Text, langAbbreviature)";
__ref._generate_maprow(null,_name,_text,__ref._langabbreviature);
 };
 };
RDebugUtils.currentLine=3670067;
 //BA.debugLineNum = 3670067;BA.debugLine="End Sub";
return "";
}
public String  _xmlparser_startelement(b4a.example.translator __ref,String _uri,String _name,anywheresoftware.b4a.objects.SaxParser.AttributesWrapper _attributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "xmlparser_startelement"))
	return (String) Debug.delegate(ba, "xmlparser_startelement", new Object[] {_uri,_name,_attributes});
String _productname = "";
int _productversion = 0;
int _i = 0;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub xmlParser_StartElement (Uri As String,";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If Not (productsVersionsMap.IsInitialized) Then p";
if (__c.Not(__ref._productsversionsmap.IsInitialized())) { 
__ref._productsversionsmap.Initialize();};
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Private productName As String";
_productname = "";
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Private productVersion As Int";
_productversion = 0;
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="For i = 0 To Attributes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_attributes.getSize()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="If Attributes.GetName(i) = \"Version\" Then produc";
if ((_attributes.GetName(_i)).equals("Version")) { 
_productversion = (int)(Double.parseDouble(_attributes.GetValue(_i)));};
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="If Attributes.GetName(i) = \"Product\" Then produc";
if ((_attributes.GetName(_i)).equals("Product")) { 
_productname = _attributes.GetValue(_i);};
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="If Attributes.GetName(i) = \"Lang\" Then languageF";
if ((_attributes.GetName(_i)).equals("Lang")) { 
__ref._languageforparsing = _attributes.GetValue(_i);};
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="If Attributes.GetName(i) = \"Key\" Then keyForPars";
if ((_attributes.GetName(_i)).equals("Key")) { 
__ref._keyforparsing = _attributes.GetValue(_i);};
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="If Attributes.GetName(i) = \"DisplayName\" Then di";
if ((_attributes.GetName(_i)).equals("DisplayName")) { 
__ref._displaynameforparsing = _attributes.GetValue(_i);};
 }
};
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="If productName.Length > 0 Then";
if (_productname.length()>0) { 
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="productsVersionsMap.Put(productName, productVers";
__ref._productsversionsmap.Put((Object)(_productname),(Object)(_productversion));
RDebugUtils.currentLine=3538957;
 //BA.debugLineNum = 3538957;BA.debugLine="productNameForParsing = productName";
__ref._productnameforparsing = _productname;
RDebugUtils.currentLine=3538958;
 //BA.debugLineNum = 3538958;BA.debugLine="dictionaryVersion = productVersion";
__ref._dictionaryversion = _productversion;
 };
RDebugUtils.currentLine=3538960;
 //BA.debugLineNum = 3538960;BA.debugLine="End Sub";
return "";
}
}