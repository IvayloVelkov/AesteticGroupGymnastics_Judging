package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class translator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "agg.agg.translator");
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
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Type Product(productName As String, languageMap A";
;
 //BA.debugLineNum = 6;BA.debugLine="Private workingProduct As Product";
_workingproduct = new agg.agg.translator._product();
 //BA.debugLineNum = 7;BA.debugLine="Private dictionaryVersion, EN As Int		'Ignore (th";
_dictionaryversion = 0;
_en = 0;
 //BA.debugLineNum = 8;BA.debugLine="Private productsVersionsMap As Map 'productName i";
_productsversionsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Private selectedProduct As String 'choosed produc";
_selectedproduct = "";
 //BA.debugLineNum = 11;BA.debugLine="Private allDictionaries As Map 'all products and";
_alldictionaries = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Private dictionary As Map 'loaded dictionary for";
_dictionary = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Private fileDirPath As String 'path to dictionary";
_filedirpath = "";
 //BA.debugLineNum = 15;BA.debugLine="Private xmlParser As SaxParser";
_xmlparser = new anywheresoftware.b4a.objects.SaxParser();
 //BA.debugLineNum = 17;BA.debugLine="Private xmlItemValues As List";
_xmlitemvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 19;BA.debugLine="Private languageForParsing, displayNameForParsing";
_languageforparsing = "";
_displaynameforparsing = "";
_keyforparsing = "";
_productnameforparsing = "";
 //BA.debugLineNum = 20;BA.debugLine="Private isImporting As Boolean = False 'Flag rais";
_isimporting = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Private indexOfLanguageToUpdate As Int 'id of lan";
_indexoflanguagetoupdate = 0;
 //BA.debugLineNum = 22;BA.debugLine="Private unknownAbbreviature As String 'For import";
_unknownabbreviature = "";
 //BA.debugLineNum = 23;BA.debugLine="Private langAbbreviature As String 'saves last it";
_langabbreviature = "";
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _duplicate_map(anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
anywheresoftware.b4a.objects.collections.Map _copymap = null;
String _key = "";
 //BA.debugLineNum = 158;BA.debugLine="Private Sub Duplicate_Map (source As Map) As Map";
 //BA.debugLineNum = 159;BA.debugLine="Private copyMap As Map";
_copymap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 160;BA.debugLine="copyMap.Initialize";
_copymap.Initialize();
 //BA.debugLineNum = 161;BA.debugLine="For Each key As String In  source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _source.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 162;BA.debugLine="copyMap.Put(key,source.Get(key))";
_copymap.Put((Object)(_key),_source.Get((Object)(_key)));
 }
};
 //BA.debugLineNum = 164;BA.debugLine="Return copyMap";
if (true) return _copymap;
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public String  _generate_languagelist(String _langabbreviation) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Private Sub Generate_LanguageList(langAbbreviation";
 //BA.debugLineNum = 170;BA.debugLine="langAbbreviation = langAbbreviation.ToUpperCase";
_langabbreviation = _langabbreviation.toUpperCase();
 //BA.debugLineNum = 171;BA.debugLine="If Not(workingProduct.languageMap.ContainsKey(lan";
if (__c.Not(_workingproduct.languageMap.ContainsKey((Object)(_langabbreviation)))) { 
 //BA.debugLineNum = 172;BA.debugLine="workingProduct.languageMap.Put(langAbbreviation,";
_workingproduct.languageMap.Put((Object)(_langabbreviation),(Object)(_workingproduct.languageCounter));
 //BA.debugLineNum = 173;BA.debugLine="If Not (workingProduct.languagesDisplayNames.IsI";
if (__c.Not(_workingproduct.languagesDisplayNames.IsInitialized())) { 
_workingproduct.languagesDisplayNames.Initialize();};
 //BA.debugLineNum = 174;BA.debugLine="workingProduct.languagesDisplayNames.Put(langAbb";
_workingproduct.languagesDisplayNames.Put((Object)(_langabbreviation),(Object)(_displaynameforparsing));
 //BA.debugLineNum = 175;BA.debugLine="workingProduct.languageList.Add(langAbbreviation";
_workingproduct.languageList.Add((Object)(_langabbreviation));
 //BA.debugLineNum = 176;BA.debugLine="workingProduct.languageCounter = workingProduct.";
_workingproduct.languageCounter = (int) (_workingproduct.languageCounter+1);
 };
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _generate_maprow(String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text,String _language) throws Exception{
anywheresoftware.b4a.objects.collections.List _newrecords = null;
String _keytranslation = "";
 //BA.debugLineNum = 183;BA.debugLine="Private Sub Generate_MapRow(Name As String, Text A";
 //BA.debugLineNum = 184;BA.debugLine="If(Name.Length <> 2) Then";
if ((_name.length()!=2)) { 
 //BA.debugLineNum = 185;BA.debugLine="Private newRecords As List";
_newrecords = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 186;BA.debugLine="newRecords.Initialize";
_newrecords.Initialize();
 //BA.debugLineNum = 187;BA.debugLine="newRecords.AddAll(xmlItemValues)";
_newrecords.AddAll(_xmlitemvalues);
 //BA.debugLineNum = 188;BA.debugLine="If isImporting Then";
if (_isimporting) { 
 //BA.debugLineNum = 189;BA.debugLine="If workingProduct.languagesBeforeUpdate.Contain";
if (_workingproduct.languagesBeforeUpdate.ContainsKey((Object)(_language)) && (_language).equals("EN") == false && (_language).equals(_unknownabbreviature) == false) { 
 //BA.debugLineNum = 190;BA.debugLine="Dim keyTranslation As String = xmlItemValues.G";
_keytranslation = BA.ObjectToString(_xmlitemvalues.Get((int) (_xmlitemvalues.getSize()-1)));
 //BA.debugLineNum = 191;BA.debugLine="Update_ExistingLanguage(Name, keyTranslation)";
_update_existinglanguage(_name,_keytranslation);
 }else {
 //BA.debugLineNum = 193;BA.debugLine="Import_NewLanguage(Name, newRecords)";
_import_newlanguage(_name,_newrecords);
 };
 //BA.debugLineNum = 195;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 197;BA.debugLine="dictionary.Put(Name, newRecords)";
_dictionary.Put((Object)(_name),(Object)(_newrecords.getObject()));
 //BA.debugLineNum = 198;BA.debugLine="xmlItemValues.Clear";
_xmlitemvalues.Clear();
 //BA.debugLineNum = 199;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 201;BA.debugLine="If Not(xmlItemValues.isInitialized) Then xmlItemV";
if (__c.Not(_xmlitemvalues.IsInitialized())) { 
_xmlitemvalues.Initialize();};
 //BA.debugLineNum = 202;BA.debugLine="xmlItemValues.Add(Text.ToString)";
_xmlitemvalues.Add((Object)(_text.ToString()));
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public String  _get_language() throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Private Sub Get_Language() As String";
 //BA.debugLineNum = 254;BA.debugLine="Return workingProduct.selectedLanguage";
if (true) return BA.NumberToString(_workingproduct.selectedLanguage);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _get_languagelist() throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Public Sub Get_LanguageList() As List";
 //BA.debugLineNum = 232;BA.debugLine="Return workingProduct.languageList";
if (true) return _workingproduct.languageList;
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public String  _get_translatedstring(String _key,int _language) throws Exception{
anywheresoftware.b4a.objects.collections.List _strtranslationlist = null;
String _translatedstring = "";
 //BA.debugLineNum = 285;BA.debugLine="Private Sub Get_TranslatedString(key As String, la";
 //BA.debugLineNum = 286;BA.debugLine="Try";
try { //BA.debugLineNum = 287;BA.debugLine="Private strTranslationList As List = dictionary.";
_strtranslationlist = new anywheresoftware.b4a.objects.collections.List();
_strtranslationlist.setObject((java.util.List)(_dictionary.Get((Object)(_key))));
 //BA.debugLineNum = 288;BA.debugLine="If language < strTranslationList.Size Then";
if (_language<_strtranslationlist.getSize()) { 
 //BA.debugLineNum = 289;BA.debugLine="Private translatedString As String = strTransla";
_translatedstring = BA.ObjectToString(_strtranslationlist.Get(_language));
 };
 //BA.debugLineNum = 291;BA.debugLine="Return translatedString";
if (true) return _translatedstring;
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 293;BA.debugLine="translatedString = \"NOT TRANSLATED\"";
_translatedstring = "NOT TRANSLATED";
 //BA.debugLineNum = 294;BA.debugLine="Log(\"ERROR IN KEY: \" & key)";
__c.Log("ERROR IN KEY: "+_key);
 //BA.debugLineNum = 295;BA.debugLine="Return translatedString";
if (true) return _translatedstring;
 };
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return "";
}
public String  _get_translation(String _key) throws Exception{
String _translationstring = "";
 //BA.debugLineNum = 268;BA.debugLine="Private Sub Get_Translation(key As String) As Stri";
 //BA.debugLineNum = 269;BA.debugLine="Try";
try { //BA.debugLineNum = 270;BA.debugLine="Private translationString As String = Get_Transl";
_translationstring = _get_translatedstring(_key,_workingproduct.selectedLanguage);
 //BA.debugLineNum = 271;BA.debugLine="If(translationString <> \"\") Then";
if (((_translationstring).equals("") == false)) { 
 //BA.debugLineNum = 272;BA.debugLine="Return translationString";
if (true) return _translationstring;
 }else {
 //BA.debugLineNum = 274;BA.debugLine="Return Get_TranslatedString(key, EN)";
if (true) return _get_translatedstring(_key,_en);
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 277;BA.debugLine="translationString = \"NOT TRANSLATED\"";
_translationstring = "NOT TRANSLATED";
 //BA.debugLineNum = 278;BA.debugLine="Log(\"ERROR IN KEY: \" & key)";
__c.Log("ERROR IN KEY: "+_key);
 //BA.debugLineNum = 279;BA.debugLine="Return translationString";
if (true) return _translationstring;
 };
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return "";
}
public String  _getstring(String _key) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Public Sub GetString(key As String) As String";
 //BA.debugLineNum = 260;BA.debugLine="If (dictionary.ContainsKey(key)) Then";
if ((_dictionary.ContainsKey((Object)(_key)))) { 
 //BA.debugLineNum = 261;BA.debugLine="Return Get_Translation(key)";
if (true) return _get_translation(_key);
 }else {
 //BA.debugLineNum = 263;BA.debugLine="Return Get_Translation(\"strStringNotFound\")";
if (true) return _get_translation("strStringNotFound");
 };
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public String  _import_newlanguage(String _key,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
anywheresoftware.b4a.objects.collections.List _updatelist = null;
 //BA.debugLineNum = 208;BA.debugLine="Private Sub Import_NewLanguage(key As String, valu";
 //BA.debugLineNum = 209;BA.debugLine="If(dictionary.ContainsKey(key)) Then";
if ((_dictionary.ContainsKey((Object)(_key)))) { 
 //BA.debugLineNum = 210;BA.debugLine="If productNameForParsing = selectedProduct Then";
if ((_productnameforparsing).equals(_selectedproduct)) { 
 //BA.debugLineNum = 211;BA.debugLine="Private updateList As List = dictionary.Get(key";
_updatelist = new anywheresoftware.b4a.objects.collections.List();
_updatelist.setObject((java.util.List)(_dictionary.Get((Object)(_key))));
 //BA.debugLineNum = 212;BA.debugLine="updateList.Add(values.Get(values.Size-1))";
_updatelist.Add(_values.Get((int) (_values.getSize()-1)));
 //BA.debugLineNum = 213;BA.debugLine="dictionary.Put(key, updateList)";
_dictionary.Put((Object)(_key),(Object)(_updatelist.getObject()));
 //BA.debugLineNum = 214;BA.debugLine="xmlItemValues.Clear";
_xmlitemvalues.Clear();
 };
 };
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize()";
 //BA.debugLineNum = 29;BA.debugLine="fileDirPath = File.DirRootExternal";
_filedirpath = __c.File.getDirRootExternal();
 //BA.debugLineNum = 31;BA.debugLine="workingProduct.Initialize";
_workingproduct.Initialize();
 //BA.debugLineNum = 32;BA.debugLine="Try";
try { //BA.debugLineNum = 33;BA.debugLine="If Version.ProductID > 99 Then";
if (_version._productid>99) { 
 //BA.debugLineNum = 34;BA.debugLine="If File.Exists(fileDirPath, Version.Path & \"/di";
if (__c.File.Exists(_filedirpath,_version._path(getActivityBA())+"/dictionary.xml")) { 
 //BA.debugLineNum = 35;BA.debugLine="Open_XML(fileDirPath,  Version.Path & \"/dictio";
_open_xml(_filedirpath,_version._path(getActivityBA())+"/dictionary.xml");
 }else {
 //BA.debugLineNum = 37;BA.debugLine="Open_XML(File.DirAssets, \"dictionary.xml\")";
_open_xml(__c.File.getDirAssets(),"dictionary.xml");
 };
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 42;BA.debugLine="Log(LastException.Message)";
__c.Log(__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 44;BA.debugLine="unknownAbbreviature = \"UNKNOWN ABBREVIATION\"";
_unknownabbreviature = "UNKNOWN ABBREVIATION";
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _open_xml(String _filepath,String _filename) throws Exception{
agg.agg.translator._product _currentproduct = null;
 //BA.debugLineNum = 51;BA.debugLine="Private Sub Open_XML(filePath As String, fileName";
 //BA.debugLineNum = 52;BA.debugLine="ResetVariables";
_resetvariables();
 //BA.debugLineNum = 53;BA.debugLine="productsVersionsMap.Initialize";
_productsversionsmap.Initialize();
 //BA.debugLineNum = 54;BA.debugLine="allDictionaries.Initialize";
_alldictionaries.Initialize();
 //BA.debugLineNum = 55;BA.debugLine="Parse_XML(filePath, fileName)";
_parse_xml(_filepath,_filename);
 //BA.debugLineNum = 56;BA.debugLine="SetProduct(selectedProduct)";
_setproduct(_selectedproduct);
 //BA.debugLineNum = 57;BA.debugLine="If workingProduct.IsInitialized And workingProduc";
if (_workingproduct.IsInitialized && _workingproduct.languagesBeforeUpdate.getSize()>0) { 
 //BA.debugLineNum = 58;BA.debugLine="Private currentProduct As Product = allDictionar";
_currentproduct = (agg.agg.translator._product)(_alldictionaries.Get((Object)(_workingproduct.productName)));
 //BA.debugLineNum = 59;BA.debugLine="currentProduct.languagesBeforeUpdate = workingPr";
_currentproduct.languagesBeforeUpdate = _workingproduct.languagesBeforeUpdate;
 };
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _parse_xml(String _filepath,String _filename) throws Exception{
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _xmltext = null;
 //BA.debugLineNum = 65;BA.debugLine="Private Sub Parse_XML(filePath As String, fileName";
 //BA.debugLineNum = 66;BA.debugLine="Private xmlText As InputStream";
_xmltext = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 67;BA.debugLine="xmlText = File.OpenInput(filePath, fileName)";
_xmltext = __c.File.OpenInput(_filepath,_filename);
 //BA.debugLineNum = 68;BA.debugLine="xmlParser.Initialize";
_xmlparser.Initialize(ba);
 //BA.debugLineNum = 69;BA.debugLine="xmlParser.parse(xmlText, \"xmlParser\")";
_xmlparser.Parse((java.io.InputStream)(_xmltext.getObject()),"xmlParser");
 //BA.debugLineNum = 70;BA.debugLine="xmlText.Close";
_xmltext.Close();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _resetvariables() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Private Sub ResetVariables";
 //BA.debugLineNum = 94;BA.debugLine="dictionary.Initialize";
_dictionary.Initialize();
 //BA.debugLineNum = 95;BA.debugLine="workingProduct.Initialize";
_workingproduct.Initialize();
 //BA.debugLineNum = 96;BA.debugLine="workingProduct.languageMap.Initialize";
_workingproduct.languageMap.Initialize();
 //BA.debugLineNum = 97;BA.debugLine="workingProduct.languagesDisplayNames.Initialize";
_workingproduct.languagesDisplayNames.Initialize();
 //BA.debugLineNum = 98;BA.debugLine="workingProduct.languagesBeforeUpdate.Initialize";
_workingproduct.languagesBeforeUpdate.Initialize();
 //BA.debugLineNum = 99;BA.debugLine="workingProduct.languageList.Initialize";
_workingproduct.languageList.Initialize();
 //BA.debugLineNum = 100;BA.debugLine="workingProduct.languageCounter = 0";
_workingproduct.languageCounter = (int) (0);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _setlanguage(String _lang) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Public Sub SetLanguage(lang As String)";
 //BA.debugLineNum = 248;BA.debugLine="lang = lang.ToUpperCase";
_lang = _lang.toUpperCase();
 //BA.debugLineNum = 249;BA.debugLine="If (workingProduct.languageMap.ContainsKey(lang))";
if ((_workingproduct.languageMap.ContainsKey((Object)(_lang)))) { 
_workingproduct.selectedLanguage = (int)(BA.ObjectToNumber(_workingproduct.languageMap.Get((Object)(_lang))));};
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public String  _setproduct(String _productname) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Private Sub SetProduct(productName As String)";
 //BA.debugLineNum = 237;BA.debugLine="If allDictionaries.ContainsKey(productName) Then";
if (_alldictionaries.ContainsKey((Object)(_productname))) { 
 //BA.debugLineNum = 238;BA.debugLine="workingProduct = allDictionaries.Get(productName";
_workingproduct = (agg.agg.translator._product)(_alldictionaries.Get((Object)(_productname)));
 //BA.debugLineNum = 239;BA.debugLine="dictionary.Clear";
_dictionary.Clear();
 //BA.debugLineNum = 240;BA.debugLine="dictionary = Duplicate_Map(workingProduct.dictio";
_dictionary = _duplicate_map(_workingproduct.dictionary);
 //BA.debugLineNum = 241;BA.debugLine="selectedProduct = productName";
_selectedproduct = _productname;
 //BA.debugLineNum = 242;BA.debugLine="dictionaryVersion = workingProduct.dictionaryVer";
_dictionaryversion = _workingproduct.dictionaryVersion;
 };
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public String  _update_existinglanguage(String _key,String _data) throws Exception{
anywheresoftware.b4a.objects.collections.List _updatelist = null;
 //BA.debugLineNum = 220;BA.debugLine="Private Sub Update_ExistingLanguage(key As String,";
 //BA.debugLineNum = 221;BA.debugLine="If(dictionary.ContainsKey(key)) Then";
if ((_dictionary.ContainsKey((Object)(_key)))) { 
 //BA.debugLineNum = 222;BA.debugLine="Private updateList As List = dictionary.Get(key)";
_updatelist = new anywheresoftware.b4a.objects.collections.List();
_updatelist.setObject((java.util.List)(_dictionary.Get((Object)(_key))));
 //BA.debugLineNum = 223;BA.debugLine="dictionary.Remove(key)";
_dictionary.Remove((Object)(_key));
 //BA.debugLineNum = 224;BA.debugLine="updateList.Set(indexOfLanguageToUpdate, data)";
_updatelist.Set(_indexoflanguagetoupdate,(Object)(_data));
 //BA.debugLineNum = 225;BA.debugLine="dictionary.Put(key, updateList)";
_dictionary.Put((Object)(_key),(Object)(_updatelist.getObject()));
 //BA.debugLineNum = 226;BA.debugLine="xmlItemValues.Clear";
_xmlitemvalues.Clear();
 };
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public String  _xmlparser_endelement(String _uri,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text) throws Exception{
agg.agg.translator._product _currentproduct = null;
String _key = "";
int _value = 0;
int _languagekey = 0;
 //BA.debugLineNum = 104;BA.debugLine="Private Sub xmlParser_EndElement (Uri As String, N";
 //BA.debugLineNum = 105;BA.debugLine="If xmlParser.Parents.IndexOf(\"TranslationDictiona";
if (_xmlparser.Parents.IndexOf((Object)("TranslationDictionaries"))>-1) { 
 //BA.debugLineNum = 106;BA.debugLine="If Name = \"Dictionary\" And dictionary.Size > 0 T";
if ((_name).equals("Dictionary") && _dictionary.getSize()>0) { 
 //BA.debugLineNum = 107;BA.debugLine="If isImporting And workingProduct.productName <";
if (_isimporting && (_workingproduct.productName).equals(_productnameforparsing) == false) { 
if (true) return "";};
 //BA.debugLineNum = 109;BA.debugLine="Private currentProduct As Product";
_currentproduct = new agg.agg.translator._product();
 //BA.debugLineNum = 110;BA.debugLine="currentProduct.Initialize";
_currentproduct.Initialize();
 //BA.debugLineNum = 111;BA.debugLine="currentProduct.languageList.Initialize";
_currentproduct.languageList.Initialize();
 //BA.debugLineNum = 112;BA.debugLine="currentProduct.languageMap = Duplicate_Map (wor";
_currentproduct.languageMap = _duplicate_map(_workingproduct.languageMap);
 //BA.debugLineNum = 113;BA.debugLine="currentProduct.languageList.AddAll(workingProdu";
_currentproduct.languageList.AddAll(_workingproduct.languageList);
 //BA.debugLineNum = 114;BA.debugLine="currentProduct.languagesDisplayNames = Duplicat";
_currentproduct.languagesDisplayNames = _duplicate_map(_workingproduct.languagesDisplayNames);
 //BA.debugLineNum = 115;BA.debugLine="currentProduct.dictionaryVersion = dictionaryVe";
_currentproduct.dictionaryVersion = _dictionaryversion;
 //BA.debugLineNum = 116;BA.debugLine="currentProduct.dictionary = Duplicate_Map(dicti";
_currentproduct.dictionary = _duplicate_map(_dictionary);
 //BA.debugLineNum = 117;BA.debugLine="currentProduct.productName = productNameForPars";
_currentproduct.productName = _productnameforparsing;
 //BA.debugLineNum = 118;BA.debugLine="currentProduct.languagesBeforeUpdate = Duplicat";
_currentproduct.languagesBeforeUpdate = _duplicate_map(_workingproduct.languagesBeforeUpdate);
 //BA.debugLineNum = 119;BA.debugLine="currentProduct.languageCounter = workingProduct";
_currentproduct.languageCounter = _workingproduct.languageCounter;
 //BA.debugLineNum = 120;BA.debugLine="currentProduct.selectedLanguage = workingProduc";
_currentproduct.selectedLanguage = _workingproduct.selectedLanguage;
 //BA.debugLineNum = 121;BA.debugLine="allDictionaries.Put(productNameForParsing, curr";
_alldictionaries.Put((Object)(_productnameforparsing),(Object)(_currentproduct));
 //BA.debugLineNum = 122;BA.debugLine="If productNameForParsing = \"TranslationTool\" Or";
if ((_productnameforparsing).equals("TranslationTool") || (_productnameforparsing).equals(_version._productindictionary)) { 
 //BA.debugLineNum = 123;BA.debugLine="allDictionaries.Put(productNameForParsing, cur";
_alldictionaries.Put((Object)(_productnameforparsing),(Object)(_currentproduct));
 //BA.debugLineNum = 124;BA.debugLine="selectedProduct = Version.ProductInDictionary";
_selectedproduct = _version._productindictionary;
 };
 //BA.debugLineNum = 126;BA.debugLine="ResetVariables";
_resetvariables();
 //BA.debugLineNum = 127;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 129;BA.debugLine="langAbbreviature = languageForParsing";
_langabbreviature = _languageforparsing;
 //BA.debugLineNum = 130;BA.debugLine="If Name = \"Language\" Then";
if ((_name).equals("Language")) { 
 //BA.debugLineNum = 131;BA.debugLine="Generate_LanguageList(Text)";
_generate_languagelist(BA.ObjectToString(_text));
 };
 //BA.debugLineNum = 133;BA.debugLine="If Name = \"Data\" Or Name = \"Value\" Then";
if ((_name).equals("Data") || (_name).equals("Value")) { 
 //BA.debugLineNum = 134;BA.debugLine="If workingProduct.languagesBeforeUpdate.Contain";
if (_workingproduct.languagesBeforeUpdate.ContainsKey((Object)(_languageforparsing))) { 
 //BA.debugLineNum = 135;BA.debugLine="For Each key As String In workingProduct.langu";
{
final anywheresoftware.b4a.BA.IterableList group30 = _workingproduct.languagesBeforeUpdate.Keys();
final int groupLen30 = group30.getSize()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_key = BA.ObjectToString(group30.Get(index30));
 //BA.debugLineNum = 136;BA.debugLine="Private value As Int = workingProduct.languag";
_value = (int)(BA.ObjectToNumber(_workingproduct.languagesBeforeUpdate.Get((Object)(_key))));
 //BA.debugLineNum = 137;BA.debugLine="Private languageKey As Int = workingProduct.l";
_languagekey = (int)(BA.ObjectToNumber(_workingproduct.languageMap.Get((Object)(_languageforparsing))));
 //BA.debugLineNum = 138;BA.debugLine="If languageKey = value Then";
if (_languagekey==_value) { 
 //BA.debugLineNum = 139;BA.debugLine="indexOfLanguageToUpdate = value";
_indexoflanguagetoupdate = _value;
 //BA.debugLineNum = 140;BA.debugLine="langAbbreviature = key";
_langabbreviature = _key;
 //BA.debugLineNum = 141;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 144;BA.debugLine="If isImporting And indexOfLanguageToUpdate = E";
if (_isimporting && _indexoflanguagetoupdate==_en) { 
if (true) return "";};
 }else {
 //BA.debugLineNum = 146;BA.debugLine="If Not(workingProduct.languagesBeforeUpdate.Co";
if (__c.Not(_workingproduct.languagesBeforeUpdate.ContainsKey((Object)(_langabbreviature)))) { 
 //BA.debugLineNum = 147;BA.debugLine="langAbbreviature = unknownAbbreviature";
_langabbreviature = _unknownabbreviature;
 };
 };
 //BA.debugLineNum = 150;BA.debugLine="If Name = \"Value\" Then Name = languageForParsin";
if ((_name).equals("Value")) { 
_name = _languageforparsing;};
 //BA.debugLineNum = 151;BA.debugLine="If Name = \"Data\" Then Name = keyForParsing";
if ((_name).equals("Data")) { 
_name = _keyforparsing;};
 //BA.debugLineNum = 152;BA.debugLine="Generate_MapRow(Name, Text, langAbbreviature)";
_generate_maprow(_name,_text,_langabbreviature);
 };
 };
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _xmlparser_startelement(String _uri,String _name,anywheresoftware.b4a.objects.SaxParser.AttributesWrapper _attributes) throws Exception{
String _productname = "";
int _productversion = 0;
int _i = 0;
 //BA.debugLineNum = 74;BA.debugLine="Private Sub xmlParser_StartElement (Uri As String,";
 //BA.debugLineNum = 75;BA.debugLine="If Not (productsVersionsMap.IsInitialized) Then p";
if (__c.Not(_productsversionsmap.IsInitialized())) { 
_productsversionsmap.Initialize();};
 //BA.debugLineNum = 76;BA.debugLine="Private productName As String";
_productname = "";
 //BA.debugLineNum = 77;BA.debugLine="Private productVersion As Int";
_productversion = 0;
 //BA.debugLineNum = 78;BA.debugLine="For i = 0 To Attributes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_attributes.getSize()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
 //BA.debugLineNum = 79;BA.debugLine="If Attributes.GetName(i) = \"Version\" Then produc";
if ((_attributes.GetName(_i)).equals("Version")) { 
_productversion = (int)(Double.parseDouble(_attributes.GetValue(_i)));};
 //BA.debugLineNum = 80;BA.debugLine="If Attributes.GetName(i) = \"Product\" Then produc";
if ((_attributes.GetName(_i)).equals("Product")) { 
_productname = _attributes.GetValue(_i);};
 //BA.debugLineNum = 81;BA.debugLine="If Attributes.GetName(i) = \"Lang\" Then languageF";
if ((_attributes.GetName(_i)).equals("Lang")) { 
_languageforparsing = _attributes.GetValue(_i);};
 //BA.debugLineNum = 82;BA.debugLine="If Attributes.GetName(i) = \"Key\" Then keyForPars";
if ((_attributes.GetName(_i)).equals("Key")) { 
_keyforparsing = _attributes.GetValue(_i);};
 //BA.debugLineNum = 83;BA.debugLine="If Attributes.GetName(i) = \"DisplayName\" Then di";
if ((_attributes.GetName(_i)).equals("DisplayName")) { 
_displaynameforparsing = _attributes.GetValue(_i);};
 }
};
 //BA.debugLineNum = 85;BA.debugLine="If productName.Length > 0 Then";
if (_productname.length()>0) { 
 //BA.debugLineNum = 86;BA.debugLine="productsVersionsMap.Put(productName, productVers";
_productsversionsmap.Put((Object)(_productname),(Object)(_productversion));
 //BA.debugLineNum = 87;BA.debugLine="productNameForParsing = productName";
_productnameforparsing = _productname;
 //BA.debugLineNum = 88;BA.debugLine="dictionaryVersion = productVersion";
_dictionaryversion = _productversion;
 };
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
