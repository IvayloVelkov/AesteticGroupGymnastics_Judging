package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class translator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "agg.agg.translator");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", agg.agg.translator.class).invoke(this, new Object[] {null});
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
public agg.agg.translator._product _workingproduct = null;
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
public agg.agg.main _main = null;
public agg.agg.starter _starter = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public agg.agg.helperfunctions _helperfunctions = null;
public String  _initialize(agg.agg.translator __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Initialize()";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="fileDirPath = File.DirRootExternal";
__ref._filedirpath = __c.File.getDirRootExternal();
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="workingProduct.Initialize";
__ref._workingproduct.Initialize();
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Try";
try {RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="If Version.ProductID > 99 Then";
if (_version._productid>99) { 
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="If File.Exists(fileDirPath, Version.Path & \"/di";
if (__c.File.Exists(__ref._filedirpath,_version._path(getActivityBA())+"/dictionary.xml")) { 
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Open_XML(fileDirPath,  Version.Path & \"/dictio";
__ref._open_xml(null,__ref._filedirpath,_version._path(getActivityBA())+"/dictionary.xml");
 }else {
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="Open_XML(File.DirAssets, \"dictionary.xml\")";
__ref._open_xml(null,__c.File.getDirAssets(),"dictionary.xml");
 };
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="Log(LastException.Message)";
__c.Log(__c.LastException(getActivityBA()).getMessage());
 };
RDebugUtils.currentLine=2686993;
 //BA.debugLineNum = 2686993;BA.debugLine="unknownAbbreviature = \"UNKNOWN ABBREVIATION\"";
__ref._unknownabbreviature = "UNKNOWN ABBREVIATION";
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="End Sub";
return "";
}
public String  _getstring(agg.agg.translator __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "getstring"))
	return (String) Debug.delegate(ba, "getstring", new Object[] {_key});
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub GetString(key As String) As String";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If (dictionary.ContainsKey(key)) Then";
if ((__ref._dictionary.ContainsKey((Object)(_key)))) { 
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Return Get_Translation(key)";
if (true) return __ref._get_translation(null,_key);
 }else {
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Return Get_Translation(\"strStringNotFound\")";
if (true) return __ref._get_translation(null,"strStringNotFound");
 };
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Type Product(productName As String, languageMap A";
;
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Private workingProduct As Product";
_workingproduct = new agg.agg.translator._product();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Private dictionaryVersion, EN As Int		'Ignore (th";
_dictionaryversion = 0;
_en = 0;
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Private productsVersionsMap As Map 'productName i";
_productsversionsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Private selectedProduct As String 'choosed produc";
_selectedproduct = "";
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Private allDictionaries As Map 'all products and";
_alldictionaries = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Private dictionary As Map 'loaded dictionary for";
_dictionary = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="Private fileDirPath As String 'path to dictionary";
_filedirpath = "";
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="Private xmlParser As SaxParser";
_xmlparser = new anywheresoftware.b4a.objects.SaxParser();
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="Private xmlItemValues As List";
_xmlitemvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="Private languageForParsing, displayNameForParsing";
_languageforparsing = "";
_displaynameforparsing = "";
_keyforparsing = "";
_productnameforparsing = "";
RDebugUtils.currentLine=2621456;
 //BA.debugLineNum = 2621456;BA.debugLine="Private isImporting As Boolean = False 'Flag rais";
_isimporting = __c.False;
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="Private indexOfLanguageToUpdate As Int 'id of lan";
_indexoflanguagetoupdate = 0;
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="Private unknownAbbreviature As String 'For import";
_unknownabbreviature = "";
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="Private langAbbreviature As String 'saves last it";
_langabbreviature = "";
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _duplicate_map(agg.agg.translator __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "duplicate_map"))
	return (anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "duplicate_map", new Object[] {_source});
anywheresoftware.b4a.objects.collections.Map _copymap = null;
String _key = "";
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub Duplicate_Map (source As Map) As Map";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Private copyMap As Map";
_copymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="copyMap.Initialize";
_copymap.Initialize();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="For Each key As String In  source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _source.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="copyMap.Put(key,source.Get(key))";
_copymap.Put((Object)(_key),_source.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="Return copyMap";
if (true) return _copymap;
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="End Sub";
return null;
}
public String  _generate_languagelist(agg.agg.translator __ref,String _langabbreviation) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "generate_languagelist"))
	return (String) Debug.delegate(ba, "generate_languagelist", new Object[] {_langabbreviation});
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub Generate_LanguageList(langAbbreviation";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="langAbbreviation = langAbbreviation.ToUpperCase";
_langabbreviation = _langabbreviation.toUpperCase();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If Not(workingProduct.languageMap.ContainsKey(lan";
if (__c.Not(__ref._workingproduct.languageMap.ContainsKey((Object)(_langabbreviation)))) { 
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="workingProduct.languageMap.Put(langAbbreviation,";
__ref._workingproduct.languageMap.Put((Object)(_langabbreviation),(Object)(__ref._workingproduct.languageCounter));
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="If Not (workingProduct.languagesDisplayNames.IsI";
if (__c.Not(__ref._workingproduct.languagesDisplayNames.IsInitialized())) { 
__ref._workingproduct.languagesDisplayNames.Initialize();};
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="workingProduct.languagesDisplayNames.Put(langAbb";
__ref._workingproduct.languagesDisplayNames.Put((Object)(_langabbreviation),(Object)(__ref._displaynameforparsing));
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="workingProduct.languageList.Add(langAbbreviation";
__ref._workingproduct.languageList.Add((Object)(_langabbreviation));
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="workingProduct.languageCounter = workingProduct.";
__ref._workingproduct.languageCounter = (int) (__ref._workingproduct.languageCounter+1);
 };
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="End Sub";
return "";
}
public String  _generate_maprow(agg.agg.translator __ref,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text,String _language) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "generate_maprow"))
	return (String) Debug.delegate(ba, "generate_maprow", new Object[] {_name,_text,_language});
anywheresoftware.b4a.objects.collections.List _newrecords = null;
String _keytranslation = "";
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub Generate_MapRow(Name As String, Text A";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If(Name.Length <> 2) Then";
if ((_name.length()!=2)) { 
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Private newRecords As List";
_newrecords = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="newRecords.Initialize";
_newrecords.Initialize();
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="newRecords.AddAll(xmlItemValues)";
_newrecords.AddAll(__ref._xmlitemvalues);
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="If isImporting Then";
if (__ref._isimporting) { 
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="If workingProduct.languagesBeforeUpdate.Contain";
if (__ref._workingproduct.languagesBeforeUpdate.ContainsKey((Object)(_language)) && (_language).equals("EN") == false && (_language).equals(__ref._unknownabbreviature) == false) { 
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="Dim keyTranslation As String = xmlItemValues.G";
_keytranslation = BA.ObjectToString(__ref._xmlitemvalues.Get((int) (__ref._xmlitemvalues.getSize()-1)));
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="Update_ExistingLanguage(Name, keyTranslation)";
__ref._update_existinglanguage(null,_name,_keytranslation);
 }else {
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="Import_NewLanguage(Name, newRecords)";
__ref._import_newlanguage(null,_name,_newrecords);
 };
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="dictionary.Put(Name, newRecords)";
__ref._dictionary.Put((Object)(_name),(Object)(_newrecords.getObject()));
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="xmlItemValues.Clear";
__ref._xmlitemvalues.Clear();
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3211282;
 //BA.debugLineNum = 3211282;BA.debugLine="If Not(xmlItemValues.isInitialized) Then xmlItemV";
if (__c.Not(__ref._xmlitemvalues.IsInitialized())) { 
__ref._xmlitemvalues.Initialize();};
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="xmlItemValues.Add(Text.ToString)";
__ref._xmlitemvalues.Add((Object)(_text.ToString()));
RDebugUtils.currentLine=3211284;
 //BA.debugLineNum = 3211284;BA.debugLine="End Sub";
return "";
}
public String  _update_existinglanguage(agg.agg.translator __ref,String _key,String _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "update_existinglanguage"))
	return (String) Debug.delegate(ba, "update_existinglanguage", new Object[] {_key,_data});
anywheresoftware.b4a.objects.collections.List _updatelist = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub Update_ExistingLanguage(key As String,";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="If(dictionary.ContainsKey(key)) Then";
if ((__ref._dictionary.ContainsKey((Object)(_key)))) { 
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Private updateList As List = dictionary.Get(key)";
_updatelist = new anywheresoftware.b4a.objects.collections.List();
_updatelist.setObject((java.util.List)(__ref._dictionary.Get((Object)(_key))));
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="dictionary.Remove(key)";
__ref._dictionary.Remove((Object)(_key));
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="updateList.Set(indexOfLanguageToUpdate, data)";
_updatelist.Set(__ref._indexoflanguagetoupdate,(Object)(_data));
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="dictionary.Put(key, updateList)";
__ref._dictionary.Put((Object)(_key),(Object)(_updatelist.getObject()));
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="xmlItemValues.Clear";
__ref._xmlitemvalues.Clear();
 };
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="End Sub";
return "";
}
public String  _import_newlanguage(agg.agg.translator __ref,String _key,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "import_newlanguage"))
	return (String) Debug.delegate(ba, "import_newlanguage", new Object[] {_key,_values});
anywheresoftware.b4a.objects.collections.List _updatelist = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub Import_NewLanguage(key As String, valu";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If(dictionary.ContainsKey(key)) Then";
if ((__ref._dictionary.ContainsKey((Object)(_key)))) { 
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="If productNameForParsing = selectedProduct Then";
if ((__ref._productnameforparsing).equals(__ref._selectedproduct)) { 
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Private updateList As List = dictionary.Get(key";
_updatelist = new anywheresoftware.b4a.objects.collections.List();
_updatelist.setObject((java.util.List)(__ref._dictionary.Get((Object)(_key))));
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="updateList.Add(values.Get(values.Size-1))";
_updatelist.Add(_values.Get((int) (_values.getSize()-1)));
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="dictionary.Put(key, updateList)";
__ref._dictionary.Put((Object)(_key),(Object)(_updatelist.getObject()));
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="xmlItemValues.Clear";
__ref._xmlitemvalues.Clear();
 };
 };
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="End Sub";
return "";
}
public String  _get_language(agg.agg.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_language"))
	return (String) Debug.delegate(ba, "get_language", null);
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub Get_Language() As String";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Return workingProduct.selectedLanguage";
if (true) return BA.NumberToString(__ref._workingproduct.selectedLanguage);
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _get_languagelist(agg.agg.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_languagelist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "get_languagelist", null);
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub Get_LanguageList() As List";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Return workingProduct.languageList";
if (true) return __ref._workingproduct.languageList;
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return null;
}
public String  _get_translatedstring(agg.agg.translator __ref,String _key,int _language) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_translatedstring"))
	return (String) Debug.delegate(ba, "get_translatedstring", new Object[] {_key,_language});
anywheresoftware.b4a.objects.collections.List _strtranslationlist = null;
String _translatedstring = "";
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub Get_TranslatedString(key As String, la";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Try";
try {RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Private strTranslationList As List = dictionary.";
_strtranslationlist = new anywheresoftware.b4a.objects.collections.List();
_strtranslationlist.setObject((java.util.List)(__ref._dictionary.Get((Object)(_key))));
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="If language < strTranslationList.Size Then";
if (_language<_strtranslationlist.getSize()) { 
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Private translatedString As String = strTransla";
_translatedstring = BA.ObjectToString(_strtranslationlist.Get(_language));
 };
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Return translatedString";
if (true) return _translatedstring;
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="translatedString = \"NOT TRANSLATED\"";
_translatedstring = "NOT TRANSLATED";
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="Log(\"ERROR IN KEY: \" & key)";
__c.Log("ERROR IN KEY: "+_key);
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="Return translatedString";
if (true) return _translatedstring;
 };
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="End Sub";
return "";
}
public String  _get_translation(agg.agg.translator __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_translation"))
	return (String) Debug.delegate(ba, "get_translation", new Object[] {_key});
String _translationstring = "";
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub Get_Translation(key As String) As Stri";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Try";
try {RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Private translationString As String = Get_Transl";
_translationstring = __ref._get_translatedstring(null,_key,__ref._workingproduct.selectedLanguage);
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="If(translationString <> \"\") Then";
if (((_translationstring).equals("") == false)) { 
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Return translationString";
if (true) return _translationstring;
 }else {
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="Return Get_TranslatedString(key, EN)";
if (true) return __ref._get_translatedstring(null,_key,__ref._en);
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="translationString = \"NOT TRANSLATED\"";
_translationstring = "NOT TRANSLATED";
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="Log(\"ERROR IN KEY: \" & key)";
__c.Log("ERROR IN KEY: "+_key);
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="Return translationString";
if (true) return _translationstring;
 };
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="End Sub";
return "";
}
public String  _open_xml(agg.agg.translator __ref,String _filepath,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "open_xml"))
	return (String) Debug.delegate(ba, "open_xml", new Object[] {_filepath,_filename});
agg.agg.translator._product _currentproduct = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub Open_XML(filePath As String, fileName";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="ResetVariables";
__ref._resetvariables(null);
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="productsVersionsMap.Initialize";
__ref._productsversionsmap.Initialize();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="allDictionaries.Initialize";
__ref._alldictionaries.Initialize();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Parse_XML(filePath, fileName)";
__ref._parse_xml(null,_filepath,_filename);
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="SetProduct(selectedProduct)";
__ref._setproduct(null,__ref._selectedproduct);
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="If workingProduct.IsInitialized And workingProduc";
if (__ref._workingproduct.IsInitialized && __ref._workingproduct.languagesBeforeUpdate.getSize()>0) { 
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Private currentProduct As Product = allDictionar";
_currentproduct = (agg.agg.translator._product)(__ref._alldictionaries.Get((Object)(__ref._workingproduct.productName)));
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="currentProduct.languagesBeforeUpdate = workingPr";
_currentproduct.languagesBeforeUpdate = __ref._workingproduct.languagesBeforeUpdate;
 };
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="End Sub";
return "";
}
public String  _resetvariables(agg.agg.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "resetvariables"))
	return (String) Debug.delegate(ba, "resetvariables", null);
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub ResetVariables";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="dictionary.Initialize";
__ref._dictionary.Initialize();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="workingProduct.Initialize";
__ref._workingproduct.Initialize();
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="workingProduct.languageMap.Initialize";
__ref._workingproduct.languageMap.Initialize();
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="workingProduct.languagesDisplayNames.Initialize";
__ref._workingproduct.languagesDisplayNames.Initialize();
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="workingProduct.languagesBeforeUpdate.Initialize";
__ref._workingproduct.languagesBeforeUpdate.Initialize();
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="workingProduct.languageList.Initialize";
__ref._workingproduct.languageList.Initialize();
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="workingProduct.languageCounter = 0";
__ref._workingproduct.languageCounter = (int) (0);
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="End Sub";
return "";
}
public String  _parse_xml(agg.agg.translator __ref,String _filepath,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "parse_xml"))
	return (String) Debug.delegate(ba, "parse_xml", new Object[] {_filepath,_filename});
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _xmltext = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub Parse_XML(filePath As String, fileName";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Private xmlText As InputStream";
_xmltext = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="xmlText = File.OpenInput(filePath, fileName)";
_xmltext = __c.File.OpenInput(_filepath,_filename);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="xmlParser.Initialize";
__ref._xmlparser.Initialize(ba);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="xmlParser.parse(xmlText, \"xmlParser\")";
__ref._xmlparser.Parse((java.io.InputStream)(_xmltext.getObject()),"xmlParser");
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="xmlText.Close";
_xmltext.Close();
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
return "";
}
public String  _setproduct(agg.agg.translator __ref,String _productname) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "setproduct"))
	return (String) Debug.delegate(ba, "setproduct", new Object[] {_productname});
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub SetProduct(productName As String)";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="If allDictionaries.ContainsKey(productName) Then";
if (__ref._alldictionaries.ContainsKey((Object)(_productname))) { 
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="workingProduct = allDictionaries.Get(productName";
__ref._workingproduct = (agg.agg.translator._product)(__ref._alldictionaries.Get((Object)(_productname)));
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="dictionary.Clear";
__ref._dictionary.Clear();
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="dictionary = Duplicate_Map(workingProduct.dictio";
__ref._dictionary = __ref._duplicate_map(null,__ref._workingproduct.dictionary);
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="selectedProduct = productName";
__ref._selectedproduct = _productname;
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="dictionaryVersion = workingProduct.dictionaryVer";
__ref._dictionaryversion = __ref._workingproduct.dictionaryVersion;
 };
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="End Sub";
return "";
}
public String  _setlanguage(agg.agg.translator __ref,String _lang) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "setlanguage"))
	return (String) Debug.delegate(ba, "setlanguage", new Object[] {_lang});
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub SetLanguage(lang As String)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="lang = lang.ToUpperCase";
_lang = _lang.toUpperCase();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="If (workingProduct.languageMap.ContainsKey(lang))";
if ((__ref._workingproduct.languageMap.ContainsKey((Object)(_lang)))) { 
__ref._workingproduct.selectedLanguage = (int)(BA.ObjectToNumber(__ref._workingproduct.languageMap.Get((Object)(_lang))));};
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="End Sub";
return "";
}
public String  _xmlparser_endelement(agg.agg.translator __ref,String _uri,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "xmlparser_endelement"))
	return (String) Debug.delegate(ba, "xmlparser_endelement", new Object[] {_uri,_name,_text});
agg.agg.translator._product _currentproduct = null;
String _key = "";
int _value = 0;
int _languagekey = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub xmlParser_EndElement (Uri As String, N";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If xmlParser.Parents.IndexOf(\"TranslationDictiona";
if (__ref._xmlparser.Parents.IndexOf((Object)("TranslationDictionaries"))>-1) { 
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="If Name = \"Dictionary\" And dictionary.Size > 0 T";
if ((_name).equals("Dictionary") && __ref._dictionary.getSize()>0) { 
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="If isImporting And workingProduct.productName <";
if (__ref._isimporting && (__ref._workingproduct.productName).equals(__ref._productnameforparsing) == false) { 
if (true) return "";};
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Private currentProduct As Product";
_currentproduct = new agg.agg.translator._product();
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="currentProduct.Initialize";
_currentproduct.Initialize();
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="currentProduct.languageList.Initialize";
_currentproduct.languageList.Initialize();
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="currentProduct.languageMap = Duplicate_Map (wor";
_currentproduct.languageMap = __ref._duplicate_map(null,__ref._workingproduct.languageMap);
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="currentProduct.languageList.AddAll(workingProdu";
_currentproduct.languageList.AddAll(__ref._workingproduct.languageList);
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="currentProduct.languagesDisplayNames = Duplicat";
_currentproduct.languagesDisplayNames = __ref._duplicate_map(null,__ref._workingproduct.languagesDisplayNames);
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="currentProduct.dictionaryVersion = dictionaryVe";
_currentproduct.dictionaryVersion = __ref._dictionaryversion;
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="currentProduct.dictionary = Duplicate_Map(dicti";
_currentproduct.dictionary = __ref._duplicate_map(null,__ref._dictionary);
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="currentProduct.productName = productNameForPars";
_currentproduct.productName = __ref._productnameforparsing;
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="currentProduct.languagesBeforeUpdate = Duplicat";
_currentproduct.languagesBeforeUpdate = __ref._duplicate_map(null,__ref._workingproduct.languagesBeforeUpdate);
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="currentProduct.languageCounter = workingProduct";
_currentproduct.languageCounter = __ref._workingproduct.languageCounter;
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="currentProduct.selectedLanguage = workingProduc";
_currentproduct.selectedLanguage = __ref._workingproduct.selectedLanguage;
RDebugUtils.currentLine=3014673;
 //BA.debugLineNum = 3014673;BA.debugLine="allDictionaries.Put(productNameForParsing, curr";
__ref._alldictionaries.Put((Object)(__ref._productnameforparsing),(Object)(_currentproduct));
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="If productNameForParsing = \"TranslationTool\" Or";
if ((__ref._productnameforparsing).equals("TranslationTool") || (__ref._productnameforparsing).equals(_version._productindictionary)) { 
RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="allDictionaries.Put(productNameForParsing, cur";
__ref._alldictionaries.Put((Object)(__ref._productnameforparsing),(Object)(_currentproduct));
RDebugUtils.currentLine=3014676;
 //BA.debugLineNum = 3014676;BA.debugLine="selectedProduct = Version.ProductInDictionary";
__ref._selectedproduct = _version._productindictionary;
 };
RDebugUtils.currentLine=3014678;
 //BA.debugLineNum = 3014678;BA.debugLine="ResetVariables";
__ref._resetvariables(null);
RDebugUtils.currentLine=3014679;
 //BA.debugLineNum = 3014679;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3014681;
 //BA.debugLineNum = 3014681;BA.debugLine="langAbbreviature = languageForParsing";
__ref._langabbreviature = __ref._languageforparsing;
RDebugUtils.currentLine=3014682;
 //BA.debugLineNum = 3014682;BA.debugLine="If Name = \"Language\" Then";
if ((_name).equals("Language")) { 
RDebugUtils.currentLine=3014683;
 //BA.debugLineNum = 3014683;BA.debugLine="Generate_LanguageList(Text)";
__ref._generate_languagelist(null,BA.ObjectToString(_text));
 };
RDebugUtils.currentLine=3014685;
 //BA.debugLineNum = 3014685;BA.debugLine="If Name = \"Data\" Or Name = \"Value\" Then";
if ((_name).equals("Data") || (_name).equals("Value")) { 
RDebugUtils.currentLine=3014686;
 //BA.debugLineNum = 3014686;BA.debugLine="If workingProduct.languagesBeforeUpdate.Contain";
if (__ref._workingproduct.languagesBeforeUpdate.ContainsKey((Object)(__ref._languageforparsing))) { 
RDebugUtils.currentLine=3014687;
 //BA.debugLineNum = 3014687;BA.debugLine="For Each key As String In workingProduct.langu";
{
final anywheresoftware.b4a.BA.IterableList group30 = __ref._workingproduct.languagesBeforeUpdate.Keys();
final int groupLen30 = group30.getSize()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_key = BA.ObjectToString(group30.Get(index30));
RDebugUtils.currentLine=3014688;
 //BA.debugLineNum = 3014688;BA.debugLine="Private value As Int = workingProduct.languag";
_value = (int)(BA.ObjectToNumber(__ref._workingproduct.languagesBeforeUpdate.Get((Object)(_key))));
RDebugUtils.currentLine=3014689;
 //BA.debugLineNum = 3014689;BA.debugLine="Private languageKey As Int = workingProduct.l";
_languagekey = (int)(BA.ObjectToNumber(__ref._workingproduct.languageMap.Get((Object)(__ref._languageforparsing))));
RDebugUtils.currentLine=3014690;
 //BA.debugLineNum = 3014690;BA.debugLine="If languageKey = value Then";
if (_languagekey==_value) { 
RDebugUtils.currentLine=3014691;
 //BA.debugLineNum = 3014691;BA.debugLine="indexOfLanguageToUpdate = value";
__ref._indexoflanguagetoupdate = _value;
RDebugUtils.currentLine=3014692;
 //BA.debugLineNum = 3014692;BA.debugLine="langAbbreviature = key";
__ref._langabbreviature = _key;
RDebugUtils.currentLine=3014693;
 //BA.debugLineNum = 3014693;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=3014696;
 //BA.debugLineNum = 3014696;BA.debugLine="If isImporting And indexOfLanguageToUpdate = E";
if (__ref._isimporting && __ref._indexoflanguagetoupdate==__ref._en) { 
if (true) return "";};
 }else {
RDebugUtils.currentLine=3014698;
 //BA.debugLineNum = 3014698;BA.debugLine="If Not(workingProduct.languagesBeforeUpdate.Co";
if (__c.Not(__ref._workingproduct.languagesBeforeUpdate.ContainsKey((Object)(__ref._langabbreviature)))) { 
RDebugUtils.currentLine=3014699;
 //BA.debugLineNum = 3014699;BA.debugLine="langAbbreviature = unknownAbbreviature";
__ref._langabbreviature = __ref._unknownabbreviature;
 };
 };
RDebugUtils.currentLine=3014702;
 //BA.debugLineNum = 3014702;BA.debugLine="If Name = \"Value\" Then Name = languageForParsin";
if ((_name).equals("Value")) { 
_name = __ref._languageforparsing;};
RDebugUtils.currentLine=3014703;
 //BA.debugLineNum = 3014703;BA.debugLine="If Name = \"Data\" Then Name = keyForParsing";
if ((_name).equals("Data")) { 
_name = __ref._keyforparsing;};
RDebugUtils.currentLine=3014704;
 //BA.debugLineNum = 3014704;BA.debugLine="Generate_MapRow(Name, Text, langAbbreviature)";
__ref._generate_maprow(null,_name,_text,__ref._langabbreviature);
 };
 };
RDebugUtils.currentLine=3014707;
 //BA.debugLineNum = 3014707;BA.debugLine="End Sub";
return "";
}
public String  _xmlparser_startelement(agg.agg.translator __ref,String _uri,String _name,anywheresoftware.b4a.objects.SaxParser.AttributesWrapper _attributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "xmlparser_startelement"))
	return (String) Debug.delegate(ba, "xmlparser_startelement", new Object[] {_uri,_name,_attributes});
String _productname = "";
int _productversion = 0;
int _i = 0;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub xmlParser_StartElement (Uri As String,";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="If Not (productsVersionsMap.IsInitialized) Then p";
if (__c.Not(__ref._productsversionsmap.IsInitialized())) { 
__ref._productsversionsmap.Initialize();};
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Private productName As String";
_productname = "";
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Private productVersion As Int";
_productversion = 0;
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="For i = 0 To Attributes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_attributes.getSize()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="If Attributes.GetName(i) = \"Version\" Then produc";
if ((_attributes.GetName(_i)).equals("Version")) { 
_productversion = (int)(Double.parseDouble(_attributes.GetValue(_i)));};
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="If Attributes.GetName(i) = \"Product\" Then produc";
if ((_attributes.GetName(_i)).equals("Product")) { 
_productname = _attributes.GetValue(_i);};
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="If Attributes.GetName(i) = \"Lang\" Then languageF";
if ((_attributes.GetName(_i)).equals("Lang")) { 
__ref._languageforparsing = _attributes.GetValue(_i);};
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="If Attributes.GetName(i) = \"Key\" Then keyForPars";
if ((_attributes.GetName(_i)).equals("Key")) { 
__ref._keyforparsing = _attributes.GetValue(_i);};
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="If Attributes.GetName(i) = \"DisplayName\" Then di";
if ((_attributes.GetName(_i)).equals("DisplayName")) { 
__ref._displaynameforparsing = _attributes.GetValue(_i);};
 }
};
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="If productName.Length > 0 Then";
if (_productname.length()>0) { 
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="productsVersionsMap.Put(productName, productVers";
__ref._productsversionsmap.Put((Object)(_productname),(Object)(_productversion));
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="productNameForParsing = productName";
__ref._productnameforparsing = _productname;
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="dictionaryVersion = productVersion";
__ref._dictionaryversion = _productversion;
 };
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="End Sub";
return "";
}
}