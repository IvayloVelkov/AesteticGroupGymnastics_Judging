package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class translator_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Type Product(productName As String, languageMap A";
;
 //BA.debugLineNum = 6;BA.debugLine="Private workingProduct As Product";
translator._workingproduct = RemoteObject.createNew ("b4a.example.translator._product");__ref.setField("_workingproduct",translator._workingproduct);
 //BA.debugLineNum = 7;BA.debugLine="Private dictionaryVersion, EN As Int		'Ignore (th";
translator._dictionaryversion = RemoteObject.createImmutable(0);__ref.setField("_dictionaryversion",translator._dictionaryversion);
translator._en = RemoteObject.createImmutable(0);__ref.setField("_en",translator._en);
 //BA.debugLineNum = 8;BA.debugLine="Private productsVersionsMap As Map 'productName i";
translator._productsversionsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_productsversionsmap",translator._productsversionsmap);
 //BA.debugLineNum = 9;BA.debugLine="Private selectedProduct As String 'choosed produc";
translator._selectedproduct = RemoteObject.createImmutable("");__ref.setField("_selectedproduct",translator._selectedproduct);
 //BA.debugLineNum = 11;BA.debugLine="Private allDictionaries As Map 'all products and";
translator._alldictionaries = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_alldictionaries",translator._alldictionaries);
 //BA.debugLineNum = 12;BA.debugLine="Private dictionary As Map 'loaded dictionary for";
translator._dictionary = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_dictionary",translator._dictionary);
 //BA.debugLineNum = 13;BA.debugLine="Private fileDirPath As String 'path to dictionary";
translator._filedirpath = RemoteObject.createImmutable("");__ref.setField("_filedirpath",translator._filedirpath);
 //BA.debugLineNum = 15;BA.debugLine="Private xmlParser As SaxParser";
translator._xmlparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.SaxParser");__ref.setField("_xmlparser",translator._xmlparser);
 //BA.debugLineNum = 17;BA.debugLine="Private xmlItemValues As List";
translator._xmlitemvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_xmlitemvalues",translator._xmlitemvalues);
 //BA.debugLineNum = 19;BA.debugLine="Private languageForParsing, displayNameForParsing";
translator._languageforparsing = RemoteObject.createImmutable("");__ref.setField("_languageforparsing",translator._languageforparsing);
translator._displaynameforparsing = RemoteObject.createImmutable("");__ref.setField("_displaynameforparsing",translator._displaynameforparsing);
translator._keyforparsing = RemoteObject.createImmutable("");__ref.setField("_keyforparsing",translator._keyforparsing);
translator._productnameforparsing = RemoteObject.createImmutable("");__ref.setField("_productnameforparsing",translator._productnameforparsing);
 //BA.debugLineNum = 20;BA.debugLine="Private isImporting As Boolean = False 'Flag rais";
translator._isimporting = translator.__c.getField(true,"False");__ref.setField("_isimporting",translator._isimporting);
 //BA.debugLineNum = 21;BA.debugLine="Private indexOfLanguageToUpdate As Int 'id of lan";
translator._indexoflanguagetoupdate = RemoteObject.createImmutable(0);__ref.setField("_indexoflanguagetoupdate",translator._indexoflanguagetoupdate);
 //BA.debugLineNum = 22;BA.debugLine="Private unknownAbbreviature As String 'For import";
translator._unknownabbreviature = RemoteObject.createImmutable("");__ref.setField("_unknownabbreviature",translator._unknownabbreviature);
 //BA.debugLineNum = 23;BA.debugLine="Private langAbbreviature As String 'saves last it";
translator._langabbreviature = RemoteObject.createImmutable("");__ref.setField("_langabbreviature",translator._langabbreviature);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _duplicate_map(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("Duplicate_Map (translator) ","translator",9,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("duplicate_map")) return __ref.runUserSub(false, "translator","duplicate_map", __ref, _source);
RemoteObject _copymap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("source", _source);
 BA.debugLineNum = 158;BA.debugLine="Private Sub Duplicate_Map (source As Map) As Map";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Private copyMap As Map";
Debug.ShouldStop(1073741824);
_copymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("copyMap", _copymap);
 BA.debugLineNum = 160;BA.debugLine="copyMap.Initialize";
Debug.ShouldStop(-2147483648);
_copymap.runVoidMethod ("Initialize");
 BA.debugLineNum = 161;BA.debugLine="For Each key As String In  source.Keys";
Debug.ShouldStop(1);
{
final RemoteObject group3 = _source.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 162;BA.debugLine="copyMap.Put(key,source.Get(key))";
Debug.ShouldStop(2);
_copymap.runVoidMethod ("Put",(Object)((_key)),(Object)(_source.runMethod(false,"Get",(Object)((_key)))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 164;BA.debugLine="Return copyMap";
Debug.ShouldStop(8);
if (true) return _copymap;
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generate_languagelist(RemoteObject __ref,RemoteObject _langabbreviation) throws Exception{
try {
		Debug.PushSubsStack("Generate_LanguageList (translator) ","translator",9,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("generate_languagelist")) return __ref.runUserSub(false, "translator","generate_languagelist", __ref, _langabbreviation);
Debug.locals.put("langAbbreviation", _langabbreviation);
 BA.debugLineNum = 169;BA.debugLine="Private Sub Generate_LanguageList(langAbbreviation";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="langAbbreviation = langAbbreviation.ToUpperCase";
Debug.ShouldStop(512);
_langabbreviation = _langabbreviation.runMethod(true,"toUpperCase");Debug.locals.put("langAbbreviation", _langabbreviation);
 BA.debugLineNum = 171;BA.debugLine="If Not(workingProduct.languageMap.ContainsKey(lan";
Debug.ShouldStop(1024);
if (translator.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_workingproduct").getField(false,"languageMap").runMethod(true,"ContainsKey",(Object)((_langabbreviation))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 172;BA.debugLine="workingProduct.languageMap.Put(langAbbreviation,";
Debug.ShouldStop(2048);
__ref.getField(false,"_workingproduct").getField(false,"languageMap").runVoidMethod ("Put",(Object)((_langabbreviation)),(Object)((__ref.getField(false,"_workingproduct").getField(true,"languageCounter"))));
 BA.debugLineNum = 173;BA.debugLine="If Not (workingProduct.languagesDisplayNames.IsI";
Debug.ShouldStop(4096);
if (translator.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_workingproduct").getField(false,"languagesDisplayNames").runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_workingproduct").getField(false,"languagesDisplayNames").runVoidMethod ("Initialize");};
 BA.debugLineNum = 174;BA.debugLine="workingProduct.languagesDisplayNames.Put(langAbb";
Debug.ShouldStop(8192);
__ref.getField(false,"_workingproduct").getField(false,"languagesDisplayNames").runVoidMethod ("Put",(Object)((_langabbreviation)),(Object)((__ref.getField(true,"_displaynameforparsing"))));
 BA.debugLineNum = 175;BA.debugLine="workingProduct.languageList.Add(langAbbreviation";
Debug.ShouldStop(16384);
__ref.getField(false,"_workingproduct").getField(false,"languageList").runVoidMethod ("Add",(Object)((_langabbreviation)));
 BA.debugLineNum = 176;BA.debugLine="workingProduct.languageCounter = workingProduct.";
Debug.ShouldStop(32768);
__ref.getField(false,"_workingproduct").setField ("languageCounter",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_workingproduct").getField(true,"languageCounter"),RemoteObject.createImmutable(1)}, "+",1, 1));
 };
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generate_maprow(RemoteObject __ref,RemoteObject _name,RemoteObject _text,RemoteObject _language) throws Exception{
try {
		Debug.PushSubsStack("Generate_MapRow (translator) ","translator",9,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("generate_maprow")) return __ref.runUserSub(false, "translator","generate_maprow", __ref, _name, _text, _language);
RemoteObject _newrecords = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _keytranslation = RemoteObject.createImmutable("");
Debug.locals.put("Name", _name);
Debug.locals.put("Text", _text);
Debug.locals.put("Language", _language);
 BA.debugLineNum = 183;BA.debugLine="Private Sub Generate_MapRow(Name As String, Text A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="If(Name.Length <> 2) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("!",_name.runMethod(true,"length"),BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 185;BA.debugLine="Private newRecords As List";
Debug.ShouldStop(16777216);
_newrecords = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("newRecords", _newrecords);
 BA.debugLineNum = 186;BA.debugLine="newRecords.Initialize";
Debug.ShouldStop(33554432);
_newrecords.runVoidMethod ("Initialize");
 BA.debugLineNum = 187;BA.debugLine="newRecords.AddAll(xmlItemValues)";
Debug.ShouldStop(67108864);
_newrecords.runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_xmlitemvalues")));
 BA.debugLineNum = 188;BA.debugLine="If isImporting Then";
Debug.ShouldStop(134217728);
if (__ref.getField(true,"_isimporting").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 189;BA.debugLine="If workingProduct.languagesBeforeUpdate.Contain";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_workingproduct").getField(false,"languagesBeforeUpdate").runMethod(true,"ContainsKey",(Object)((_language)))) && RemoteObject.solveBoolean("!",_language,BA.ObjectToString("EN")) && RemoteObject.solveBoolean("!",_language,__ref.getField(true,"_unknownabbreviature"))) { 
 BA.debugLineNum = 190;BA.debugLine="Dim keyTranslation As String = xmlItemValues.G";
Debug.ShouldStop(536870912);
_keytranslation = BA.ObjectToString(__ref.getField(false,"_xmlitemvalues").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xmlitemvalues").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("keyTranslation", _keytranslation);Debug.locals.put("keyTranslation", _keytranslation);
 BA.debugLineNum = 191;BA.debugLine="Update_ExistingLanguage(Name, keyTranslation)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.translator.class, "_update_existinglanguage",(Object)(_name),(Object)(_keytranslation));
 }else {
 BA.debugLineNum = 193;BA.debugLine="Import_NewLanguage(Name, newRecords)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.translator.class, "_import_newlanguage",(Object)(_name),(Object)(_newrecords));
 };
 BA.debugLineNum = 195;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 197;BA.debugLine="dictionary.Put(Name, newRecords)";
Debug.ShouldStop(16);
__ref.getField(false,"_dictionary").runVoidMethod ("Put",(Object)((_name)),(Object)((_newrecords.getObject())));
 BA.debugLineNum = 198;BA.debugLine="xmlItemValues.Clear";
Debug.ShouldStop(32);
__ref.getField(false,"_xmlitemvalues").runVoidMethod ("Clear");
 BA.debugLineNum = 199;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 201;BA.debugLine="If Not(xmlItemValues.isInitialized) Then xmlItemV";
Debug.ShouldStop(256);
if (translator.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_xmlitemvalues").runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_xmlitemvalues").runVoidMethod ("Initialize");};
 BA.debugLineNum = 202;BA.debugLine="xmlItemValues.Add(Text.ToString)";
Debug.ShouldStop(512);
__ref.getField(false,"_xmlitemvalues").runVoidMethod ("Add",(Object)((_text.runMethod(true,"ToString"))));
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_language(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Get_Language (translator) ","translator",9,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("get_language")) return __ref.runUserSub(false, "translator","get_language", __ref);
 BA.debugLineNum = 253;BA.debugLine="Private Sub Get_Language() As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="Return workingProduct.selectedLanguage";
Debug.ShouldStop(536870912);
if (true) return BA.NumberToString(__ref.getField(false,"_workingproduct").getField(true,"selectedLanguage"));
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_languagelist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Get_LanguageList (translator) ","translator",9,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("get_languagelist")) return __ref.runUserSub(false, "translator","get_languagelist", __ref);
 BA.debugLineNum = 231;BA.debugLine="Public Sub Get_LanguageList() As List";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="Return workingProduct.languageList";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_workingproduct").getField(false,"languageList");
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_translatedstring(RemoteObject __ref,RemoteObject _key,RemoteObject _language) throws Exception{
try {
		Debug.PushSubsStack("Get_TranslatedString (translator) ","translator",9,__ref.getField(false, "ba"),__ref,285);
if (RapidSub.canDelegate("get_translatedstring")) return __ref.runUserSub(false, "translator","get_translatedstring", __ref, _key, _language);
RemoteObject _strtranslationlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _translatedstring = RemoteObject.createImmutable("");
Debug.locals.put("key", _key);
Debug.locals.put("language", _language);
 BA.debugLineNum = 285;BA.debugLine="Private Sub Get_TranslatedString(key As String, la";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 286;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 287;BA.debugLine="Private strTranslationList As List = dictionary.";
Debug.ShouldStop(1073741824);
_strtranslationlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_strtranslationlist.setObject(__ref.getField(false,"_dictionary").runMethod(false,"Get",(Object)((_key))));Debug.locals.put("strTranslationList", _strtranslationlist);
 BA.debugLineNum = 288;BA.debugLine="If language < strTranslationList.Size Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",_language,BA.numberCast(double.class, _strtranslationlist.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 289;BA.debugLine="Private translatedString As String = strTransla";
Debug.ShouldStop(1);
_translatedstring = BA.ObjectToString(_strtranslationlist.runMethod(false,"Get",(Object)(_language)));Debug.locals.put("translatedString", _translatedstring);Debug.locals.put("translatedString", _translatedstring);
 };
 BA.debugLineNum = 291;BA.debugLine="Return translatedString";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return _translatedstring;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 293;BA.debugLine="translatedString = \"NOT TRANSLATED\"";
Debug.ShouldStop(16);
_translatedstring = BA.ObjectToString("NOT TRANSLATED");Debug.locals.put("translatedString", _translatedstring);
 BA.debugLineNum = 294;BA.debugLine="Log(\"ERROR IN KEY: \" & key)";
Debug.ShouldStop(32);
translator.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR IN KEY: "),_key)));
 BA.debugLineNum = 295;BA.debugLine="Return translatedString";
Debug.ShouldStop(64);
if (true) return _translatedstring;
 };
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_translation(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("Get_Translation (translator) ","translator",9,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("get_translation")) return __ref.runUserSub(false, "translator","get_translation", __ref, _key);
RemoteObject _translationstring = RemoteObject.createImmutable("");
Debug.locals.put("key", _key);
 BA.debugLineNum = 268;BA.debugLine="Private Sub Get_Translation(key As String) As Stri";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 270;BA.debugLine="Private translationString As String = Get_Transl";
Debug.ShouldStop(8192);
_translationstring = __ref.runClassMethod (b4a.example.translator.class, "_get_translatedstring",(Object)(_key),(Object)(__ref.getField(false,"_workingproduct").getField(true,"selectedLanguage")));Debug.locals.put("translationString", _translationstring);Debug.locals.put("translationString", _translationstring);
 BA.debugLineNum = 271;BA.debugLine="If(translationString <> \"\") Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("!",_translationstring,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 272;BA.debugLine="Return translationString";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return _translationstring;
 }else {
 BA.debugLineNum = 274;BA.debugLine="Return Get_TranslatedString(key, EN)";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (b4a.example.translator.class, "_get_translatedstring",(Object)(_key),(Object)(__ref.getField(true,"_en")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 277;BA.debugLine="translationString = \"NOT TRANSLATED\"";
Debug.ShouldStop(1048576);
_translationstring = BA.ObjectToString("NOT TRANSLATED");Debug.locals.put("translationString", _translationstring);
 BA.debugLineNum = 278;BA.debugLine="Log(\"ERROR IN KEY: \" & key)";
Debug.ShouldStop(2097152);
translator.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR IN KEY: "),_key)));
 BA.debugLineNum = 279;BA.debugLine="Return translationString";
Debug.ShouldStop(4194304);
if (true) return _translationstring;
 };
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstring(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetString (translator) ","translator",9,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("getstring")) return __ref.runUserSub(false, "translator","getstring", __ref, _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 259;BA.debugLine="Public Sub GetString(key As String) As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="If (dictionary.ContainsKey(key)) Then";
Debug.ShouldStop(8);
if ((__ref.getField(false,"_dictionary").runMethod(true,"ContainsKey",(Object)((_key)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 261;BA.debugLine="Return Get_Translation(key)";
Debug.ShouldStop(16);
if (true) return __ref.runClassMethod (b4a.example.translator.class, "_get_translation",(Object)(_key));
 }else {
 BA.debugLineNum = 263;BA.debugLine="Return Get_Translation(\"strStringNotFound\")";
Debug.ShouldStop(64);
if (true) return __ref.runClassMethod (b4a.example.translator.class, "_get_translation",(Object)(RemoteObject.createImmutable("strStringNotFound")));
 };
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _import_newlanguage(RemoteObject __ref,RemoteObject _key,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("Import_NewLanguage (translator) ","translator",9,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("import_newlanguage")) return __ref.runUserSub(false, "translator","import_newlanguage", __ref, _key, _values);
RemoteObject _updatelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("key", _key);
Debug.locals.put("values", _values);
 BA.debugLineNum = 208;BA.debugLine="Private Sub Import_NewLanguage(key As String, valu";
Debug.ShouldStop(32768);
 BA.debugLineNum = 209;BA.debugLine="If(dictionary.ContainsKey(key)) Then";
Debug.ShouldStop(65536);
if ((__ref.getField(false,"_dictionary").runMethod(true,"ContainsKey",(Object)((_key)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 210;BA.debugLine="If productNameForParsing = selectedProduct Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_productnameforparsing"),__ref.getField(true,"_selectedproduct"))) { 
 BA.debugLineNum = 211;BA.debugLine="Private updateList As List = dictionary.Get(key";
Debug.ShouldStop(262144);
_updatelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_updatelist.setObject(__ref.getField(false,"_dictionary").runMethod(false,"Get",(Object)((_key))));Debug.locals.put("updateList", _updatelist);
 BA.debugLineNum = 212;BA.debugLine="updateList.Add(values.Get(values.Size-1))";
Debug.ShouldStop(524288);
_updatelist.runVoidMethod ("Add",(Object)(_values.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_values.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 213;BA.debugLine="dictionary.Put(key, updateList)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dictionary").runVoidMethod ("Put",(Object)((_key)),(Object)((_updatelist.getObject())));
 BA.debugLineNum = 214;BA.debugLine="xmlItemValues.Clear";
Debug.ShouldStop(2097152);
__ref.getField(false,"_xmlitemvalues").runVoidMethod ("Clear");
 };
 };
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Initialize (translator) ","translator",9,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "translator","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize()";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="fileDirPath = File.DirRootExternal";
Debug.ShouldStop(268435456);
__ref.setField ("_filedirpath",translator.__c.getField(false,"File").runMethod(true,"getDirRootExternal"));
 BA.debugLineNum = 31;BA.debugLine="workingProduct.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_workingproduct").runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 33;BA.debugLine="If Version.ProductID > 99 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",translator._version._productid,BA.numberCast(double.class, 99))) { 
 BA.debugLineNum = 34;BA.debugLine="If File.Exists(fileDirPath, Version.Path & \"/di";
Debug.ShouldStop(2);
if (translator.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_filedirpath")),(Object)(RemoteObject.concat(translator._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")),RemoteObject.createImmutable("/dictionary.xml")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 35;BA.debugLine="Open_XML(fileDirPath,  Version.Path & \"/dictio";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.translator.class, "_open_xml",(Object)(__ref.getField(true,"_filedirpath")),(Object)(RemoteObject.concat(translator._version.runMethod(true,"_path",__ref.runMethod(false,"getActivityBA")),RemoteObject.createImmutable("/dictionary.xml"))));
 }else {
 BA.debugLineNum = 37;BA.debugLine="Open_XML(File.DirAssets, \"dictionary.xml\")";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.translator.class, "_open_xml",(Object)(translator.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("dictionary.xml")));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 42;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(512);
translator.__c.runVoidMethod ("Log",(Object)(translator.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")).runMethod(true,"getMessage")));
 };
 BA.debugLineNum = 44;BA.debugLine="unknownAbbreviature = \"UNKNOWN ABBREVIATION\"";
Debug.ShouldStop(2048);
__ref.setField ("_unknownabbreviature",BA.ObjectToString("UNKNOWN ABBREVIATION"));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _open_xml(RemoteObject __ref,RemoteObject _filepath,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Open_XML (translator) ","translator",9,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("open_xml")) return __ref.runUserSub(false, "translator","open_xml", __ref, _filepath, _filename);
RemoteObject _currentproduct = RemoteObject.declareNull("b4a.example.translator._product");
Debug.locals.put("filePath", _filepath);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 51;BA.debugLine="Private Sub Open_XML(filePath As String, fileName";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="ResetVariables";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.translator.class, "_resetvariables");
 BA.debugLineNum = 53;BA.debugLine="productsVersionsMap.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_productsversionsmap").runVoidMethod ("Initialize");
 BA.debugLineNum = 54;BA.debugLine="allDictionaries.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_alldictionaries").runVoidMethod ("Initialize");
 BA.debugLineNum = 55;BA.debugLine="Parse_XML(filePath, fileName)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.translator.class, "_parse_xml",(Object)(_filepath),(Object)(_filename));
 BA.debugLineNum = 56;BA.debugLine="SetProduct(selectedProduct)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.translator.class, "_setproduct",(Object)(__ref.getField(true,"_selectedproduct")));
 BA.debugLineNum = 57;BA.debugLine="If workingProduct.IsInitialized And workingProduc";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_workingproduct").getField(true,"IsInitialized")) && RemoteObject.solveBoolean(">",__ref.getField(false,"_workingproduct").getField(false,"languagesBeforeUpdate").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 58;BA.debugLine="Private currentProduct As Product = allDictionar";
Debug.ShouldStop(33554432);
_currentproduct = (__ref.getField(false,"_alldictionaries").runMethod(false,"Get",(Object)((__ref.getField(false,"_workingproduct").getField(true,"productName")))));Debug.locals.put("currentProduct", _currentproduct);Debug.locals.put("currentProduct", _currentproduct);
 BA.debugLineNum = 59;BA.debugLine="currentProduct.languagesBeforeUpdate = workingPr";
Debug.ShouldStop(67108864);
_currentproduct.setField ("languagesBeforeUpdate",__ref.getField(false,"_workingproduct").getField(false,"languagesBeforeUpdate"));
 };
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parse_xml(RemoteObject __ref,RemoteObject _filepath,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Parse_XML (translator) ","translator",9,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("parse_xml")) return __ref.runUserSub(false, "translator","parse_xml", __ref, _filepath, _filename);
RemoteObject _xmltext = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
Debug.locals.put("filePath", _filepath);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 65;BA.debugLine="Private Sub Parse_XML(filePath As String, fileName";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Private xmlText As InputStream";
Debug.ShouldStop(2);
_xmltext = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("xmlText", _xmltext);
 BA.debugLineNum = 67;BA.debugLine="xmlText = File.OpenInput(filePath, fileName)";
Debug.ShouldStop(4);
_xmltext = translator.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_filepath),(Object)(_filename));Debug.locals.put("xmlText", _xmltext);
 BA.debugLineNum = 68;BA.debugLine="xmlParser.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_xmlparser").runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 69;BA.debugLine="xmlParser.parse(xmlText, \"xmlParser\")";
Debug.ShouldStop(16);
__ref.getField(false,"_xmlparser").runVoidMethodAndSync ("Parse",(Object)((_xmltext.getObject())),(Object)(RemoteObject.createImmutable("xmlParser")));
 BA.debugLineNum = 70;BA.debugLine="xmlText.Close";
Debug.ShouldStop(32);
_xmltext.runVoidMethod ("Close");
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetvariables(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetVariables (translator) ","translator",9,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("resetvariables")) return __ref.runUserSub(false, "translator","resetvariables", __ref);
 BA.debugLineNum = 93;BA.debugLine="Private Sub ResetVariables";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="dictionary.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dictionary").runVoidMethod ("Initialize");
 BA.debugLineNum = 95;BA.debugLine="workingProduct.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_workingproduct").runVoidMethod ("Initialize");
 BA.debugLineNum = 96;BA.debugLine="workingProduct.languageMap.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_workingproduct").getField(false,"languageMap").runVoidMethod ("Initialize");
 BA.debugLineNum = 97;BA.debugLine="workingProduct.languagesDisplayNames.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_workingproduct").getField(false,"languagesDisplayNames").runVoidMethod ("Initialize");
 BA.debugLineNum = 98;BA.debugLine="workingProduct.languagesBeforeUpdate.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_workingproduct").getField(false,"languagesBeforeUpdate").runVoidMethod ("Initialize");
 BA.debugLineNum = 99;BA.debugLine="workingProduct.languageList.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_workingproduct").getField(false,"languageList").runVoidMethod ("Initialize");
 BA.debugLineNum = 100;BA.debugLine="workingProduct.languageCounter = 0";
Debug.ShouldStop(8);
__ref.getField(false,"_workingproduct").setField ("languageCounter",BA.numberCast(int.class, 0));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlanguage(RemoteObject __ref,RemoteObject _lang) throws Exception{
try {
		Debug.PushSubsStack("SetLanguage (translator) ","translator",9,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("setlanguage")) return __ref.runUserSub(false, "translator","setlanguage", __ref, _lang);
Debug.locals.put("lang", _lang);
 BA.debugLineNum = 247;BA.debugLine="Public Sub SetLanguage(lang As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="lang = lang.ToUpperCase";
Debug.ShouldStop(8388608);
_lang = _lang.runMethod(true,"toUpperCase");Debug.locals.put("lang", _lang);
 BA.debugLineNum = 249;BA.debugLine="If (workingProduct.languageMap.ContainsKey(lang))";
Debug.ShouldStop(16777216);
if ((__ref.getField(false,"_workingproduct").getField(false,"languageMap").runMethod(true,"ContainsKey",(Object)((_lang)))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_workingproduct").setField ("selectedLanguage",BA.numberCast(int.class, __ref.getField(false,"_workingproduct").getField(false,"languageMap").runMethod(false,"Get",(Object)((_lang)))));};
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setproduct(RemoteObject __ref,RemoteObject _productname) throws Exception{
try {
		Debug.PushSubsStack("SetProduct (translator) ","translator",9,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("setproduct")) return __ref.runUserSub(false, "translator","setproduct", __ref, _productname);
Debug.locals.put("productName", _productname);
 BA.debugLineNum = 236;BA.debugLine="Private Sub SetProduct(productName As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="If allDictionaries.ContainsKey(productName) Then";
Debug.ShouldStop(4096);
if (__ref.getField(false,"_alldictionaries").runMethod(true,"ContainsKey",(Object)((_productname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 238;BA.debugLine="workingProduct = allDictionaries.Get(productName";
Debug.ShouldStop(8192);
__ref.setField ("_workingproduct",(__ref.getField(false,"_alldictionaries").runMethod(false,"Get",(Object)((_productname)))));
 BA.debugLineNum = 239;BA.debugLine="dictionary.Clear";
Debug.ShouldStop(16384);
__ref.getField(false,"_dictionary").runVoidMethod ("Clear");
 BA.debugLineNum = 240;BA.debugLine="dictionary = Duplicate_Map(workingProduct.dictio";
Debug.ShouldStop(32768);
__ref.setField ("_dictionary",__ref.runClassMethod (b4a.example.translator.class, "_duplicate_map",(Object)(__ref.getField(false,"_workingproduct").getField(false,"dictionary"))));
 BA.debugLineNum = 241;BA.debugLine="selectedProduct = productName";
Debug.ShouldStop(65536);
__ref.setField ("_selectedproduct",_productname);
 BA.debugLineNum = 242;BA.debugLine="dictionaryVersion = workingProduct.dictionaryVer";
Debug.ShouldStop(131072);
__ref.setField ("_dictionaryversion",__ref.getField(false,"_workingproduct").getField(true,"dictionaryVersion"));
 };
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update_existinglanguage(RemoteObject __ref,RemoteObject _key,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Update_ExistingLanguage (translator) ","translator",9,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("update_existinglanguage")) return __ref.runUserSub(false, "translator","update_existinglanguage", __ref, _key, _data);
RemoteObject _updatelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("key", _key);
Debug.locals.put("data", _data);
 BA.debugLineNum = 220;BA.debugLine="Private Sub Update_ExistingLanguage(key As String,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="If(dictionary.ContainsKey(key)) Then";
Debug.ShouldStop(268435456);
if ((__ref.getField(false,"_dictionary").runMethod(true,"ContainsKey",(Object)((_key)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 222;BA.debugLine="Private updateList As List = dictionary.Get(key)";
Debug.ShouldStop(536870912);
_updatelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_updatelist.setObject(__ref.getField(false,"_dictionary").runMethod(false,"Get",(Object)((_key))));Debug.locals.put("updateList", _updatelist);
 BA.debugLineNum = 223;BA.debugLine="dictionary.Remove(key)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dictionary").runVoidMethod ("Remove",(Object)((_key)));
 BA.debugLineNum = 224;BA.debugLine="updateList.Set(indexOfLanguageToUpdate, data)";
Debug.ShouldStop(-2147483648);
_updatelist.runVoidMethod ("Set",(Object)(__ref.getField(true,"_indexoflanguagetoupdate")),(Object)((_data)));
 BA.debugLineNum = 225;BA.debugLine="dictionary.Put(key, updateList)";
Debug.ShouldStop(1);
__ref.getField(false,"_dictionary").runVoidMethod ("Put",(Object)((_key)),(Object)((_updatelist.getObject())));
 BA.debugLineNum = 226;BA.debugLine="xmlItemValues.Clear";
Debug.ShouldStop(2);
__ref.getField(false,"_xmlitemvalues").runVoidMethod ("Clear");
 };
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xmlparser_endelement(RemoteObject __ref,RemoteObject _uri,RemoteObject _name,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("xmlParser_EndElement (translator) ","translator",9,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("xmlparser_endelement")) return __ref.runUserSub(false, "translator","xmlparser_endelement", __ref, _uri, _name, _text);
RemoteObject _currentproduct = RemoteObject.declareNull("b4a.example.translator._product");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable(0);
RemoteObject _languagekey = RemoteObject.createImmutable(0);
Debug.locals.put("Uri", _uri);
Debug.locals.put("Name", _name);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 104;BA.debugLine="Private Sub xmlParser_EndElement (Uri As String, N";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="If xmlParser.Parents.IndexOf(\"TranslationDictiona";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_xmlparser").getField(false,"Parents").runMethod(true,"IndexOf",(Object)((RemoteObject.createImmutable("TranslationDictionaries")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 106;BA.debugLine="If Name = \"Dictionary\" And dictionary.Size > 0 T";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_name,BA.ObjectToString("Dictionary")) && RemoteObject.solveBoolean(">",__ref.getField(false,"_dictionary").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 107;BA.debugLine="If isImporting And workingProduct.productName <";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_isimporting")) && RemoteObject.solveBoolean("!",__ref.getField(false,"_workingproduct").getField(true,"productName"),__ref.getField(true,"_productnameforparsing"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 109;BA.debugLine="Private currentProduct As Product";
Debug.ShouldStop(4096);
_currentproduct = RemoteObject.createNew ("b4a.example.translator._product");Debug.locals.put("currentProduct", _currentproduct);
 BA.debugLineNum = 110;BA.debugLine="currentProduct.Initialize";
Debug.ShouldStop(8192);
_currentproduct.runVoidMethod ("Initialize");
 BA.debugLineNum = 111;BA.debugLine="currentProduct.languageList.Initialize";
Debug.ShouldStop(16384);
_currentproduct.getField(false,"languageList").runVoidMethod ("Initialize");
 BA.debugLineNum = 112;BA.debugLine="currentProduct.languageMap = Duplicate_Map (wor";
Debug.ShouldStop(32768);
_currentproduct.setField ("languageMap",__ref.runClassMethod (b4a.example.translator.class, "_duplicate_map",(Object)(__ref.getField(false,"_workingproduct").getField(false,"languageMap"))));
 BA.debugLineNum = 113;BA.debugLine="currentProduct.languageList.AddAll(workingProdu";
Debug.ShouldStop(65536);
_currentproduct.getField(false,"languageList").runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_workingproduct").getField(false,"languageList")));
 BA.debugLineNum = 114;BA.debugLine="currentProduct.languagesDisplayNames = Duplicat";
Debug.ShouldStop(131072);
_currentproduct.setField ("languagesDisplayNames",__ref.runClassMethod (b4a.example.translator.class, "_duplicate_map",(Object)(__ref.getField(false,"_workingproduct").getField(false,"languagesDisplayNames"))));
 BA.debugLineNum = 115;BA.debugLine="currentProduct.dictionaryVersion = dictionaryVe";
Debug.ShouldStop(262144);
_currentproduct.setField ("dictionaryVersion",__ref.getField(true,"_dictionaryversion"));
 BA.debugLineNum = 116;BA.debugLine="currentProduct.dictionary = Duplicate_Map(dicti";
Debug.ShouldStop(524288);
_currentproduct.setField ("dictionary",__ref.runClassMethod (b4a.example.translator.class, "_duplicate_map",(Object)(__ref.getField(false,"_dictionary"))));
 BA.debugLineNum = 117;BA.debugLine="currentProduct.productName = productNameForPars";
Debug.ShouldStop(1048576);
_currentproduct.setField ("productName",__ref.getField(true,"_productnameforparsing"));
 BA.debugLineNum = 118;BA.debugLine="currentProduct.languagesBeforeUpdate = Duplicat";
Debug.ShouldStop(2097152);
_currentproduct.setField ("languagesBeforeUpdate",__ref.runClassMethod (b4a.example.translator.class, "_duplicate_map",(Object)(__ref.getField(false,"_workingproduct").getField(false,"languagesBeforeUpdate"))));
 BA.debugLineNum = 119;BA.debugLine="currentProduct.languageCounter = workingProduct";
Debug.ShouldStop(4194304);
_currentproduct.setField ("languageCounter",__ref.getField(false,"_workingproduct").getField(true,"languageCounter"));
 BA.debugLineNum = 120;BA.debugLine="currentProduct.selectedLanguage = workingProduc";
Debug.ShouldStop(8388608);
_currentproduct.setField ("selectedLanguage",__ref.getField(false,"_workingproduct").getField(true,"selectedLanguage"));
 BA.debugLineNum = 121;BA.debugLine="allDictionaries.Put(productNameForParsing, curr";
Debug.ShouldStop(16777216);
__ref.getField(false,"_alldictionaries").runVoidMethod ("Put",(Object)((__ref.getField(true,"_productnameforparsing"))),(Object)((_currentproduct)));
 BA.debugLineNum = 122;BA.debugLine="If productNameForParsing = \"TranslationTool\" Or";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_productnameforparsing"),BA.ObjectToString("TranslationTool")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_productnameforparsing"),translator._version._productindictionary)) { 
 BA.debugLineNum = 123;BA.debugLine="allDictionaries.Put(productNameForParsing, cur";
Debug.ShouldStop(67108864);
__ref.getField(false,"_alldictionaries").runVoidMethod ("Put",(Object)((__ref.getField(true,"_productnameforparsing"))),(Object)((_currentproduct)));
 BA.debugLineNum = 124;BA.debugLine="selectedProduct = Version.ProductInDictionary";
Debug.ShouldStop(134217728);
__ref.setField ("_selectedproduct",translator._version._productindictionary);
 };
 BA.debugLineNum = 126;BA.debugLine="ResetVariables";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.translator.class, "_resetvariables");
 BA.debugLineNum = 127;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 129;BA.debugLine="langAbbreviature = languageForParsing";
Debug.ShouldStop(1);
__ref.setField ("_langabbreviature",__ref.getField(true,"_languageforparsing"));
 BA.debugLineNum = 130;BA.debugLine="If Name = \"Language\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_name,BA.ObjectToString("Language"))) { 
 BA.debugLineNum = 131;BA.debugLine="Generate_LanguageList(Text)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.translator.class, "_generate_languagelist",(Object)(BA.ObjectToString(_text)));
 };
 BA.debugLineNum = 133;BA.debugLine="If Name = \"Data\" Or Name = \"Value\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_name,BA.ObjectToString("Data")) || RemoteObject.solveBoolean("=",_name,BA.ObjectToString("Value"))) { 
 BA.debugLineNum = 134;BA.debugLine="If workingProduct.languagesBeforeUpdate.Contain";
Debug.ShouldStop(32);
if (__ref.getField(false,"_workingproduct").getField(false,"languagesBeforeUpdate").runMethod(true,"ContainsKey",(Object)((__ref.getField(true,"_languageforparsing")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 135;BA.debugLine="For Each key As String In workingProduct.langu";
Debug.ShouldStop(64);
{
final RemoteObject group30 = __ref.getField(false,"_workingproduct").getField(false,"languagesBeforeUpdate").runMethod(false,"Keys");
final int groupLen30 = group30.runMethod(true,"getSize").<Integer>get()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_key = BA.ObjectToString(group30.runMethod(false,"Get",index30));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 136;BA.debugLine="Private value As Int = workingProduct.languag";
Debug.ShouldStop(128);
_value = BA.numberCast(int.class, __ref.getField(false,"_workingproduct").getField(false,"languagesBeforeUpdate").runMethod(false,"Get",(Object)((_key))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 137;BA.debugLine="Private languageKey As Int = workingProduct.l";
Debug.ShouldStop(256);
_languagekey = BA.numberCast(int.class, __ref.getField(false,"_workingproduct").getField(false,"languageMap").runMethod(false,"Get",(Object)((__ref.getField(true,"_languageforparsing")))));Debug.locals.put("languageKey", _languagekey);Debug.locals.put("languageKey", _languagekey);
 BA.debugLineNum = 138;BA.debugLine="If languageKey = value Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_languagekey,BA.numberCast(double.class, _value))) { 
 BA.debugLineNum = 139;BA.debugLine="indexOfLanguageToUpdate = value";
Debug.ShouldStop(1024);
__ref.setField ("_indexoflanguagetoupdate",_value);
 BA.debugLineNum = 140;BA.debugLine="langAbbreviature = key";
Debug.ShouldStop(2048);
__ref.setField ("_langabbreviature",_key);
 BA.debugLineNum = 141;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 };
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 144;BA.debugLine="If isImporting And indexOfLanguageToUpdate = E";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_isimporting")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_indexoflanguagetoupdate"),BA.numberCast(double.class, __ref.getField(true,"_en")))) { 
if (true) return RemoteObject.createImmutable("");};
 }else {
 BA.debugLineNum = 146;BA.debugLine="If Not(workingProduct.languagesBeforeUpdate.Co";
Debug.ShouldStop(131072);
if (translator.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_workingproduct").getField(false,"languagesBeforeUpdate").runMethod(true,"ContainsKey",(Object)((__ref.getField(true,"_langabbreviature")))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 147;BA.debugLine="langAbbreviature = unknownAbbreviature";
Debug.ShouldStop(262144);
__ref.setField ("_langabbreviature",__ref.getField(true,"_unknownabbreviature"));
 };
 };
 BA.debugLineNum = 150;BA.debugLine="If Name = \"Value\" Then Name = languageForParsin";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_name,BA.ObjectToString("Value"))) { 
_name = __ref.getField(true,"_languageforparsing");Debug.locals.put("Name", _name);};
 BA.debugLineNum = 151;BA.debugLine="If Name = \"Data\" Then Name = keyForParsing";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_name,BA.ObjectToString("Data"))) { 
_name = __ref.getField(true,"_keyforparsing");Debug.locals.put("Name", _name);};
 BA.debugLineNum = 152;BA.debugLine="Generate_MapRow(Name, Text, langAbbreviature)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.translator.class, "_generate_maprow",(Object)(_name),(Object)(_text),(Object)(__ref.getField(true,"_langabbreviature")));
 };
 };
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xmlparser_startelement(RemoteObject __ref,RemoteObject _uri,RemoteObject _name,RemoteObject _attributes) throws Exception{
try {
		Debug.PushSubsStack("xmlParser_StartElement (translator) ","translator",9,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("xmlparser_startelement")) return __ref.runUserSub(false, "translator","xmlparser_startelement", __ref, _uri, _name, _attributes);
RemoteObject _productname = RemoteObject.createImmutable("");
RemoteObject _productversion = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("Uri", _uri);
Debug.locals.put("Name", _name);
Debug.locals.put("Attributes", _attributes);
 BA.debugLineNum = 74;BA.debugLine="Private Sub xmlParser_StartElement (Uri As String,";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="If Not (productsVersionsMap.IsInitialized) Then p";
Debug.ShouldStop(1024);
if (translator.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_productsversionsmap").runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_productsversionsmap").runVoidMethod ("Initialize");};
 BA.debugLineNum = 76;BA.debugLine="Private productName As String";
Debug.ShouldStop(2048);
_productname = RemoteObject.createImmutable("");Debug.locals.put("productName", _productname);
 BA.debugLineNum = 77;BA.debugLine="Private productVersion As Int";
Debug.ShouldStop(4096);
_productversion = RemoteObject.createImmutable(0);Debug.locals.put("productVersion", _productversion);
 BA.debugLineNum = 78;BA.debugLine="For i = 0 To Attributes.Size - 1";
Debug.ShouldStop(8192);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_attributes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="If Attributes.GetName(i) = \"Version\" Then produc";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_attributes.runMethod(true,"GetName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("Version"))) { 
_productversion = BA.numberCast(int.class, _attributes.runMethod(true,"GetValue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("productVersion", _productversion);};
 BA.debugLineNum = 80;BA.debugLine="If Attributes.GetName(i) = \"Product\" Then produc";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_attributes.runMethod(true,"GetName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("Product"))) { 
_productname = _attributes.runMethod(true,"GetValue",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("productName", _productname);};
 BA.debugLineNum = 81;BA.debugLine="If Attributes.GetName(i) = \"Lang\" Then languageF";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_attributes.runMethod(true,"GetName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("Lang"))) { 
__ref.setField ("_languageforparsing",_attributes.runMethod(true,"GetValue",(Object)(BA.numberCast(int.class, _i))));};
 BA.debugLineNum = 82;BA.debugLine="If Attributes.GetName(i) = \"Key\" Then keyForPars";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_attributes.runMethod(true,"GetName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("Key"))) { 
__ref.setField ("_keyforparsing",_attributes.runMethod(true,"GetValue",(Object)(BA.numberCast(int.class, _i))));};
 BA.debugLineNum = 83;BA.debugLine="If Attributes.GetName(i) = \"DisplayName\" Then di";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_attributes.runMethod(true,"GetName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("DisplayName"))) { 
__ref.setField ("_displaynameforparsing",_attributes.runMethod(true,"GetValue",(Object)(BA.numberCast(int.class, _i))));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 85;BA.debugLine="If productName.Length > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_productname.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 86;BA.debugLine="productsVersionsMap.Put(productName, productVers";
Debug.ShouldStop(2097152);
__ref.getField(false,"_productsversionsmap").runVoidMethod ("Put",(Object)((_productname)),(Object)((_productversion)));
 BA.debugLineNum = 87;BA.debugLine="productNameForParsing = productName";
Debug.ShouldStop(4194304);
__ref.setField ("_productnameforparsing",_productname);
 BA.debugLineNum = 88;BA.debugLine="dictionaryVersion = productVersion";
Debug.ShouldStop(8388608);
__ref.setField ("_dictionaryversion",_productversion);
 };
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
}