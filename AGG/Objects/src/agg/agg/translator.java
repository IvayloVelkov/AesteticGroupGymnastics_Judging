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
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub Initialize()";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="fileDirPath = File.DirRootExternal";
__ref._filedirpath = __c.File.getDirRootExternal();
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="workingProduct.Initialize";
__ref._workingproduct.Initialize();
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Try";
try {RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="If Version.ProductID > 99 Then";
if (_version._productid>99) { 
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="If File.Exists(fileDirPath, Version.Path & \"/di";
if (__c.File.Exists(__ref._filedirpath,_version._path(getActivityBA())+"/dictionary.xml")) { 
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="Open_XML(fileDirPath,  Version.Path & \"/dictio";
__ref._open_xml(null,__ref._filedirpath,_version._path(getActivityBA())+"/dictionary.xml");
 }else {
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="Open_XML(File.DirAssets, \"dictionary.xml\")";
__ref._open_xml(null,__c.File.getDirAssets(),"dictionary.xml");
 };
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=4325391;
 //BA.debugLineNum = 4325391;BA.debugLine="Log(LastException.Message)";
__c.Log(__c.LastException(getActivityBA()).getMessage());
 };
RDebugUtils.currentLine=4325393;
 //BA.debugLineNum = 4325393;BA.debugLine="unknownAbbreviature = \"UNKNOWN ABBREVIATION\"";
__ref._unknownabbreviature = "UNKNOWN ABBREVIATION";
RDebugUtils.currentLine=4325394;
 //BA.debugLineNum = 4325394;BA.debugLine="End Sub";
return "";
}
public String  _setlanguage(agg.agg.translator __ref,String _lang) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "setlanguage"))
	return (String) Debug.delegate(ba, "setlanguage", new Object[] {_lang});
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub SetLanguage(lang As String)";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="lang = lang.ToUpperCase";
_lang = _lang.toUpperCase();
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="If (workingProduct.languageMap.ContainsKey(lang))";
if ((__ref._workingproduct.languageMap.ContainsKey((Object)(_lang)))) { 
__ref._workingproduct.selectedLanguage = (int)(BA.ObjectToNumber(__ref._workingproduct.languageMap.Get((Object)(_lang))));};
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="End Sub";
return "";
}
public String  _getstring(agg.agg.translator __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "getstring"))
	return (String) Debug.delegate(ba, "getstring", new Object[] {_key});
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub GetString(key As String) As String";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="If (dictionary.ContainsKey(key)) Then";
if ((__ref._dictionary.ContainsKey((Object)(_key)))) { 
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Return Get_Translation(key)";
if (true) return __ref._get_translation(null,_key);
 }else {
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="Return Get_Translation(\"strStringNotFound\")";
if (true) return __ref._get_translation(null,"strStringNotFound");
 };
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(agg.agg.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Type Product(productName As String, languageMap A";
;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Private workingProduct As Product";
_workingproduct = new agg.agg.translator._product();
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Private dictionaryVersion, EN As Int		'Ignore (th";
_dictionaryversion = 0;
_en = 0;
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="Private productsVersionsMap As Map 'productName i";
_productsversionsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="Private selectedProduct As String 'choosed produc";
_selectedproduct = "";
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="Private allDictionaries As Map 'all products and";
_alldictionaries = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="Private dictionary As Map 'loaded dictionary for";
_dictionary = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="Private fileDirPath As String 'path to dictionary";
_filedirpath = "";
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="Private xmlParser As SaxParser";
_xmlparser = new anywheresoftware.b4a.objects.SaxParser();
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="Private xmlItemValues As List";
_xmlitemvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="Private languageForParsing, displayNameForParsing";
_languageforparsing = "";
_displaynameforparsing = "";
_keyforparsing = "";
_productnameforparsing = "";
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="Private isImporting As Boolean = False 'Flag rais";
_isimporting = __c.False;
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="Private indexOfLanguageToUpdate As Int 'id of lan";
_indexoflanguagetoupdate = 0;
RDebugUtils.currentLine=4259858;
 //BA.debugLineNum = 4259858;BA.debugLine="Private unknownAbbreviature As String 'For import";
_unknownabbreviature = "";
RDebugUtils.currentLine=4259859;
 //BA.debugLineNum = 4259859;BA.debugLine="Private langAbbreviature As String 'saves last it";
_langabbreviature = "";
RDebugUtils.currentLine=4259860;
 //BA.debugLineNum = 4259860;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _duplicate_map(agg.agg.translator __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "duplicate_map"))
	return (anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "duplicate_map", new Object[] {_source});
anywheresoftware.b4a.objects.collections.Map _copymap = null;
String _key = "";
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub Duplicate_Map (source As Map) As Map";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Private copyMap As Map";
_copymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="copyMap.Initialize";
_copymap.Initialize();
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="For Each key As String In  source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _source.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="copyMap.Put(key,source.Get(key))";
_copymap.Put((Object)(_key),_source.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="Return copyMap";
if (true) return _copymap;
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="End Sub";
return null;
}
public String  _generate_languagelist(agg.agg.translator __ref,String _langabbreviation) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "generate_languagelist"))
	return (String) Debug.delegate(ba, "generate_languagelist", new Object[] {_langabbreviation});
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub Generate_LanguageList(langAbbreviation";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="langAbbreviation = langAbbreviation.ToUpperCase";
_langabbreviation = _langabbreviation.toUpperCase();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="If Not(workingProduct.languageMap.ContainsKey(lan";
if (__c.Not(__ref._workingproduct.languageMap.ContainsKey((Object)(_langabbreviation)))) { 
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="workingProduct.languageMap.Put(langAbbreviation,";
__ref._workingproduct.languageMap.Put((Object)(_langabbreviation),(Object)(__ref._workingproduct.languageCounter));
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="If Not (workingProduct.languagesDisplayNames.IsI";
if (__c.Not(__ref._workingproduct.languagesDisplayNames.IsInitialized())) { 
__ref._workingproduct.languagesDisplayNames.Initialize();};
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="workingProduct.languagesDisplayNames.Put(langAbb";
__ref._workingproduct.languagesDisplayNames.Put((Object)(_langabbreviation),(Object)(__ref._displaynameforparsing));
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="workingProduct.languageList.Add(langAbbreviation";
__ref._workingproduct.languageList.Add((Object)(_langabbreviation));
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="workingProduct.languageCounter = workingProduct.";
__ref._workingproduct.languageCounter = (int) (__ref._workingproduct.languageCounter+1);
 };
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="End Sub";
return "";
}
public String  _generate_maprow(agg.agg.translator __ref,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text,String _language) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "generate_maprow"))
	return (String) Debug.delegate(ba, "generate_maprow", new Object[] {_name,_text,_language});
anywheresoftware.b4a.objects.collections.List _newrecords = null;
String _keytranslation = "";
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub Generate_MapRow(Name As String, Text A";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="If(Name.Length <> 2) Then";
if ((_name.length()!=2)) { 
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Private newRecords As List";
_newrecords = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="newRecords.Initialize";
_newrecords.Initialize();
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="newRecords.AddAll(xmlItemValues)";
_newrecords.AddAll(__ref._xmlitemvalues);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="If isImporting Then";
if (__ref._isimporting) { 
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="If workingProduct.languagesBeforeUpdate.Contain";
if (__ref._workingproduct.languagesBeforeUpdate.ContainsKey((Object)(_language)) && (_language).equals("EN") == false && (_language).equals(__ref._unknownabbreviature) == false) { 
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="Dim keyTranslation As String = xmlItemValues.G";
_keytranslation = BA.ObjectToString(__ref._xmlitemvalues.Get((int) (__ref._xmlitemvalues.getSize()-1)));
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="Update_ExistingLanguage(Name, keyTranslation)";
__ref._update_existinglanguage(null,_name,_keytranslation);
 }else {
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="Import_NewLanguage(Name, newRecords)";
__ref._import_newlanguage(null,_name,_newrecords);
 };
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="dictionary.Put(Name, newRecords)";
__ref._dictionary.Put((Object)(_name),(Object)(_newrecords.getObject()));
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="xmlItemValues.Clear";
__ref._xmlitemvalues.Clear();
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="If Not(xmlItemValues.isInitialized) Then xmlItemV";
if (__c.Not(__ref._xmlitemvalues.IsInitialized())) { 
__ref._xmlitemvalues.Initialize();};
RDebugUtils.currentLine=4849683;
 //BA.debugLineNum = 4849683;BA.debugLine="xmlItemValues.Add(Text.ToString)";
__ref._xmlitemvalues.Add((Object)(_text.ToString()));
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="End Sub";
return "";
}
public String  _update_existinglanguage(agg.agg.translator __ref,String _key,String _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "update_existinglanguage"))
	return (String) Debug.delegate(ba, "update_existinglanguage", new Object[] {_key,_data});
anywheresoftware.b4a.objects.collections.List _updatelist = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub Update_ExistingLanguage(key As String,";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="If(dictionary.ContainsKey(key)) Then";
if ((__ref._dictionary.ContainsKey((Object)(_key)))) { 
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Private updateList As List = dictionary.Get(key)";
_updatelist = new anywheresoftware.b4a.objects.collections.List();
_updatelist.setObject((java.util.List)(__ref._dictionary.Get((Object)(_key))));
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="dictionary.Remove(key)";
__ref._dictionary.Remove((Object)(_key));
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="updateList.Set(indexOfLanguageToUpdate, data)";
_updatelist.Set(__ref._indexoflanguagetoupdate,(Object)(_data));
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="dictionary.Put(key, updateList)";
__ref._dictionary.Put((Object)(_key),(Object)(_updatelist.getObject()));
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="xmlItemValues.Clear";
__ref._xmlitemvalues.Clear();
 };
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="End Sub";
return "";
}
public String  _import_newlanguage(agg.agg.translator __ref,String _key,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "import_newlanguage"))
	return (String) Debug.delegate(ba, "import_newlanguage", new Object[] {_key,_values});
anywheresoftware.b4a.objects.collections.List _updatelist = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub Import_NewLanguage(key As String, valu";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="If(dictionary.ContainsKey(key)) Then";
if ((__ref._dictionary.ContainsKey((Object)(_key)))) { 
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="If productNameForParsing = selectedProduct Then";
if ((__ref._productnameforparsing).equals(__ref._selectedproduct)) { 
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Private updateList As List = dictionary.Get(key";
_updatelist = new anywheresoftware.b4a.objects.collections.List();
_updatelist.setObject((java.util.List)(__ref._dictionary.Get((Object)(_key))));
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="updateList.Add(values.Get(values.Size-1))";
_updatelist.Add(_values.Get((int) (_values.getSize()-1)));
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="dictionary.Put(key, updateList)";
__ref._dictionary.Put((Object)(_key),(Object)(_updatelist.getObject()));
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="xmlItemValues.Clear";
__ref._xmlitemvalues.Clear();
 };
 };
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="End Sub";
return "";
}
public String  _get_language(agg.agg.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_language"))
	return (String) Debug.delegate(ba, "get_language", null);
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub Get_Language() As String";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Return workingProduct.selectedLanguage";
if (true) return BA.NumberToString(__ref._workingproduct.selectedLanguage);
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _get_languagelist(agg.agg.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_languagelist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "get_languagelist", null);
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub Get_LanguageList() As List";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Return workingProduct.languageList";
if (true) return __ref._workingproduct.languageList;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return null;
}
public String  _get_translatedstring(agg.agg.translator __ref,String _key,int _language) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_translatedstring"))
	return (String) Debug.delegate(ba, "get_translatedstring", new Object[] {_key,_language});
anywheresoftware.b4a.objects.collections.List _strtranslationlist = null;
String _translatedstring = "";
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub Get_TranslatedString(key As String, la";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Try";
try {RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Private strTranslationList As List = dictionary.";
_strtranslationlist = new anywheresoftware.b4a.objects.collections.List();
_strtranslationlist.setObject((java.util.List)(__ref._dictionary.Get((Object)(_key))));
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="If language < strTranslationList.Size Then";
if (_language<_strtranslationlist.getSize()) { 
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Private translatedString As String = strTransla";
_translatedstring = BA.ObjectToString(_strtranslationlist.Get(_language));
 };
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="Return translatedString";
if (true) return _translatedstring;
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="translatedString = \"NOT TRANSLATED\"";
_translatedstring = "NOT TRANSLATED";
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="Log(\"ERROR IN KEY: \" & key)";
__c.Log("ERROR IN KEY: "+_key);
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="Return translatedString";
if (true) return _translatedstring;
 };
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="End Sub";
return "";
}
public String  _get_translation(agg.agg.translator __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "get_translation"))
	return (String) Debug.delegate(ba, "get_translation", new Object[] {_key});
String _translationstring = "";
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub Get_Translation(key As String) As Stri";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Try";
try {RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Private translationString As String = Get_Transl";
_translationstring = __ref._get_translatedstring(null,_key,__ref._workingproduct.selectedLanguage);
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="If(translationString <> \"\") Then";
if (((_translationstring).equals("") == false)) { 
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Return translationString";
if (true) return _translationstring;
 }else {
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="Return Get_TranslatedString(key, EN)";
if (true) return __ref._get_translatedstring(null,_key,__ref._en);
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="translationString = \"NOT TRANSLATED\"";
_translationstring = "NOT TRANSLATED";
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="Log(\"ERROR IN KEY: \" & key)";
__c.Log("ERROR IN KEY: "+_key);
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="Return translationString";
if (true) return _translationstring;
 };
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="End Sub";
return "";
}
public String  _open_xml(agg.agg.translator __ref,String _filepath,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "open_xml"))
	return (String) Debug.delegate(ba, "open_xml", new Object[] {_filepath,_filename});
agg.agg.translator._product _currentproduct = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Private Sub Open_XML(filePath As String, fileName";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="ResetVariables";
__ref._resetvariables(null);
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="productsVersionsMap.Initialize";
__ref._productsversionsmap.Initialize();
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="allDictionaries.Initialize";
__ref._alldictionaries.Initialize();
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Parse_XML(filePath, fileName)";
__ref._parse_xml(null,_filepath,_filename);
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="SetProduct(selectedProduct)";
__ref._setproduct(null,__ref._selectedproduct);
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="If workingProduct.IsInitialized And workingProduc";
if (__ref._workingproduct.IsInitialized && __ref._workingproduct.languagesBeforeUpdate.getSize()>0) { 
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="Private currentProduct As Product = allDictionar";
_currentproduct = (agg.agg.translator._product)(__ref._alldictionaries.Get((Object)(__ref._workingproduct.productName)));
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="currentProduct.languagesBeforeUpdate = workingPr";
_currentproduct.languagesBeforeUpdate = __ref._workingproduct.languagesBeforeUpdate;
 };
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="End Sub";
return "";
}
public String  _resetvariables(agg.agg.translator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "resetvariables"))
	return (String) Debug.delegate(ba, "resetvariables", null);
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Private Sub ResetVariables";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="dictionary.Initialize";
__ref._dictionary.Initialize();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="workingProduct.Initialize";
__ref._workingproduct.Initialize();
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="workingProduct.languageMap.Initialize";
__ref._workingproduct.languageMap.Initialize();
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="workingProduct.languagesDisplayNames.Initialize";
__ref._workingproduct.languagesDisplayNames.Initialize();
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="workingProduct.languagesBeforeUpdate.Initialize";
__ref._workingproduct.languagesBeforeUpdate.Initialize();
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="workingProduct.languageList.Initialize";
__ref._workingproduct.languageList.Initialize();
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="workingProduct.languageCounter = 0";
__ref._workingproduct.languageCounter = (int) (0);
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="End Sub";
return "";
}
public String  _parse_xml(agg.agg.translator __ref,String _filepath,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "parse_xml"))
	return (String) Debug.delegate(ba, "parse_xml", new Object[] {_filepath,_filename});
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _xmltext = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub Parse_XML(filePath As String, fileName";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Private xmlText As InputStream";
_xmltext = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="xmlText = File.OpenInput(filePath, fileName)";
_xmltext = __c.File.OpenInput(_filepath,_filename);
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="xmlParser.Initialize";
__ref._xmlparser.Initialize(ba);
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="xmlParser.parse(xmlText, \"xmlParser\")";
__ref._xmlparser.Parse((java.io.InputStream)(_xmltext.getObject()),"xmlParser");
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="xmlText.Close";
_xmltext.Close();
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="End Sub";
return "";
}
public String  _setproduct(agg.agg.translator __ref,String _productname) throws Exception{
__ref = this;
RDebugUtils.currentModule="translator";
if (Debug.shouldDelegate(ba, "setproduct"))
	return (String) Debug.delegate(ba, "setproduct", new Object[] {_productname});
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub SetProduct(productName As String)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="If allDictionaries.ContainsKey(productName) Then";
if (__ref._alldictionaries.ContainsKey((Object)(_productname))) { 
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="workingProduct = allDictionaries.Get(productName";
__ref._workingproduct = (agg.agg.translator._product)(__ref._alldictionaries.Get((Object)(_productname)));
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="dictionary.Clear";
__ref._dictionary.Clear();
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="dictionary = Duplicate_Map(workingProduct.dictio";
__ref._dictionary = __ref._duplicate_map(null,__ref._workingproduct.dictionary);
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="selectedProduct = productName";
__ref._selectedproduct = _productname;
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="dictionaryVersion = workingProduct.dictionaryVer";
__ref._dictionaryversion = __ref._workingproduct.dictionaryVersion;
 };
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Private Sub xmlParser_EndElement (Uri As String, N";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="If xmlParser.Parents.IndexOf(\"TranslationDictiona";
if (__ref._xmlparser.Parents.IndexOf((Object)("TranslationDictionaries"))>-1) { 
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="If Name = \"Dictionary\" And dictionary.Size > 0 T";
if ((_name).equals("Dictionary") && __ref._dictionary.getSize()>0) { 
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="If isImporting And workingProduct.productName <";
if (__ref._isimporting && (__ref._workingproduct.productName).equals(__ref._productnameforparsing) == false) { 
if (true) return "";};
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="Private currentProduct As Product";
_currentproduct = new agg.agg.translator._product();
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="currentProduct.Initialize";
_currentproduct.Initialize();
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="currentProduct.languageList.Initialize";
_currentproduct.languageList.Initialize();
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="currentProduct.languageMap = Duplicate_Map (wor";
_currentproduct.languageMap = __ref._duplicate_map(null,__ref._workingproduct.languageMap);
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="currentProduct.languageList.AddAll(workingProdu";
_currentproduct.languageList.AddAll(__ref._workingproduct.languageList);
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="currentProduct.languagesDisplayNames = Duplicat";
_currentproduct.languagesDisplayNames = __ref._duplicate_map(null,__ref._workingproduct.languagesDisplayNames);
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="currentProduct.dictionaryVersion = dictionaryVe";
_currentproduct.dictionaryVersion = __ref._dictionaryversion;
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="currentProduct.dictionary = Duplicate_Map(dicti";
_currentproduct.dictionary = __ref._duplicate_map(null,__ref._dictionary);
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="currentProduct.productName = productNameForPars";
_currentproduct.productName = __ref._productnameforparsing;
RDebugUtils.currentLine=4653070;
 //BA.debugLineNum = 4653070;BA.debugLine="currentProduct.languagesBeforeUpdate = Duplicat";
_currentproduct.languagesBeforeUpdate = __ref._duplicate_map(null,__ref._workingproduct.languagesBeforeUpdate);
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="currentProduct.languageCounter = workingProduct";
_currentproduct.languageCounter = __ref._workingproduct.languageCounter;
RDebugUtils.currentLine=4653072;
 //BA.debugLineNum = 4653072;BA.debugLine="currentProduct.selectedLanguage = workingProduc";
_currentproduct.selectedLanguage = __ref._workingproduct.selectedLanguage;
RDebugUtils.currentLine=4653073;
 //BA.debugLineNum = 4653073;BA.debugLine="allDictionaries.Put(productNameForParsing, curr";
__ref._alldictionaries.Put((Object)(__ref._productnameforparsing),(Object)(_currentproduct));
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="If productNameForParsing = \"TranslationTool\" Or";
if ((__ref._productnameforparsing).equals("TranslationTool") || (__ref._productnameforparsing).equals(_version._productindictionary)) { 
RDebugUtils.currentLine=4653075;
 //BA.debugLineNum = 4653075;BA.debugLine="allDictionaries.Put(productNameForParsing, cur";
__ref._alldictionaries.Put((Object)(__ref._productnameforparsing),(Object)(_currentproduct));
RDebugUtils.currentLine=4653076;
 //BA.debugLineNum = 4653076;BA.debugLine="selectedProduct = Version.ProductInDictionary";
__ref._selectedproduct = _version._productindictionary;
 };
RDebugUtils.currentLine=4653078;
 //BA.debugLineNum = 4653078;BA.debugLine="ResetVariables";
__ref._resetvariables(null);
RDebugUtils.currentLine=4653079;
 //BA.debugLineNum = 4653079;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4653081;
 //BA.debugLineNum = 4653081;BA.debugLine="langAbbreviature = languageForParsing";
__ref._langabbreviature = __ref._languageforparsing;
RDebugUtils.currentLine=4653082;
 //BA.debugLineNum = 4653082;BA.debugLine="If Name = \"Language\" Then";
if ((_name).equals("Language")) { 
RDebugUtils.currentLine=4653083;
 //BA.debugLineNum = 4653083;BA.debugLine="Generate_LanguageList(Text)";
__ref._generate_languagelist(null,BA.ObjectToString(_text));
 };
RDebugUtils.currentLine=4653085;
 //BA.debugLineNum = 4653085;BA.debugLine="If Name = \"Data\" Or Name = \"Value\" Then";
if ((_name).equals("Data") || (_name).equals("Value")) { 
RDebugUtils.currentLine=4653086;
 //BA.debugLineNum = 4653086;BA.debugLine="If workingProduct.languagesBeforeUpdate.Contain";
if (__ref._workingproduct.languagesBeforeUpdate.ContainsKey((Object)(__ref._languageforparsing))) { 
RDebugUtils.currentLine=4653087;
 //BA.debugLineNum = 4653087;BA.debugLine="For Each key As String In workingProduct.langu";
{
final anywheresoftware.b4a.BA.IterableList group30 = __ref._workingproduct.languagesBeforeUpdate.Keys();
final int groupLen30 = group30.getSize()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_key = BA.ObjectToString(group30.Get(index30));
RDebugUtils.currentLine=4653088;
 //BA.debugLineNum = 4653088;BA.debugLine="Private value As Int = workingProduct.languag";
_value = (int)(BA.ObjectToNumber(__ref._workingproduct.languagesBeforeUpdate.Get((Object)(_key))));
RDebugUtils.currentLine=4653089;
 //BA.debugLineNum = 4653089;BA.debugLine="Private languageKey As Int = workingProduct.l";
_languagekey = (int)(BA.ObjectToNumber(__ref._workingproduct.languageMap.Get((Object)(__ref._languageforparsing))));
RDebugUtils.currentLine=4653090;
 //BA.debugLineNum = 4653090;BA.debugLine="If languageKey = value Then";
if (_languagekey==_value) { 
RDebugUtils.currentLine=4653091;
 //BA.debugLineNum = 4653091;BA.debugLine="indexOfLanguageToUpdate = value";
__ref._indexoflanguagetoupdate = _value;
RDebugUtils.currentLine=4653092;
 //BA.debugLineNum = 4653092;BA.debugLine="langAbbreviature = key";
__ref._langabbreviature = _key;
RDebugUtils.currentLine=4653093;
 //BA.debugLineNum = 4653093;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=4653096;
 //BA.debugLineNum = 4653096;BA.debugLine="If isImporting And indexOfLanguageToUpdate = E";
if (__ref._isimporting && __ref._indexoflanguagetoupdate==__ref._en) { 
if (true) return "";};
 }else {
RDebugUtils.currentLine=4653098;
 //BA.debugLineNum = 4653098;BA.debugLine="If Not(workingProduct.languagesBeforeUpdate.Co";
if (__c.Not(__ref._workingproduct.languagesBeforeUpdate.ContainsKey((Object)(__ref._langabbreviature)))) { 
RDebugUtils.currentLine=4653099;
 //BA.debugLineNum = 4653099;BA.debugLine="langAbbreviature = unknownAbbreviature";
__ref._langabbreviature = __ref._unknownabbreviature;
 };
 };
RDebugUtils.currentLine=4653102;
 //BA.debugLineNum = 4653102;BA.debugLine="If Name = \"Value\" Then Name = languageForParsin";
if ((_name).equals("Value")) { 
_name = __ref._languageforparsing;};
RDebugUtils.currentLine=4653103;
 //BA.debugLineNum = 4653103;BA.debugLine="If Name = \"Data\" Then Name = keyForParsing";
if ((_name).equals("Data")) { 
_name = __ref._keyforparsing;};
RDebugUtils.currentLine=4653104;
 //BA.debugLineNum = 4653104;BA.debugLine="Generate_MapRow(Name, Text, langAbbreviature)";
__ref._generate_maprow(null,_name,_text,__ref._langabbreviature);
 };
 };
RDebugUtils.currentLine=4653107;
 //BA.debugLineNum = 4653107;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Private Sub xmlParser_StartElement (Uri As String,";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If Not (productsVersionsMap.IsInitialized) Then p";
if (__c.Not(__ref._productsversionsmap.IsInitialized())) { 
__ref._productsversionsmap.Initialize();};
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Private productName As String";
_productname = "";
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Private productVersion As Int";
_productversion = 0;
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="For i = 0 To Attributes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_attributes.getSize()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="If Attributes.GetName(i) = \"Version\" Then produc";
if ((_attributes.GetName(_i)).equals("Version")) { 
_productversion = (int)(Double.parseDouble(_attributes.GetValue(_i)));};
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="If Attributes.GetName(i) = \"Product\" Then produc";
if ((_attributes.GetName(_i)).equals("Product")) { 
_productname = _attributes.GetValue(_i);};
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="If Attributes.GetName(i) = \"Lang\" Then languageF";
if ((_attributes.GetName(_i)).equals("Lang")) { 
__ref._languageforparsing = _attributes.GetValue(_i);};
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="If Attributes.GetName(i) = \"Key\" Then keyForPars";
if ((_attributes.GetName(_i)).equals("Key")) { 
__ref._keyforparsing = _attributes.GetValue(_i);};
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="If Attributes.GetName(i) = \"DisplayName\" Then di";
if ((_attributes.GetName(_i)).equals("DisplayName")) { 
__ref._displaynameforparsing = _attributes.GetValue(_i);};
 }
};
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="If productName.Length > 0 Then";
if (_productname.length()>0) { 
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="productsVersionsMap.Put(productName, productVers";
__ref._productsversionsmap.Put((Object)(_productname),(Object)(_productversion));
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="productNameForParsing = productName";
__ref._productnameforparsing = _productname;
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="dictionaryVersion = productVersion";
__ref._dictionaryversion = _productversion;
 };
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="End Sub";
return "";
}
}