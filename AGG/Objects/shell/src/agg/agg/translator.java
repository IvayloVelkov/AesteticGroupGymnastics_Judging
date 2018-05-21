
package agg.agg;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class translator {
    public static RemoteObject myClass;
	public translator() {
	}
    public static PCBA staticBA = new PCBA(null, translator.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _workingproduct = RemoteObject.declareNull("agg.agg.translator._product");
public static RemoteObject _dictionaryversion = RemoteObject.createImmutable(0);
public static RemoteObject _en = RemoteObject.createImmutable(0);
public static RemoteObject _productsversionsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _selectedproduct = RemoteObject.createImmutable("");
public static RemoteObject _alldictionaries = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _dictionary = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _filedirpath = RemoteObject.createImmutable("");
public static RemoteObject _xmlparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.SaxParser");
public static RemoteObject _xmlitemvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _languageforparsing = RemoteObject.createImmutable("");
public static RemoteObject _displaynameforparsing = RemoteObject.createImmutable("");
public static RemoteObject _keyforparsing = RemoteObject.createImmutable("");
public static RemoteObject _productnameforparsing = RemoteObject.createImmutable("");
public static RemoteObject _isimporting = RemoteObject.createImmutable(false);
public static RemoteObject _indexoflanguagetoupdate = RemoteObject.createImmutable(0);
public static RemoteObject _unknownabbreviature = RemoteObject.createImmutable("");
public static RemoteObject _langabbreviature = RemoteObject.createImmutable("");
public static agg.agg.main _main = null;
public static agg.agg.starter _starter = null;
public static agg.agg.programdata _programdata = null;
public static agg.agg.uisizes _uisizes = null;
public static agg.agg.version _version = null;
public static agg.agg.helperfunctions _helperfunctions = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"allDictionaries",_ref.getField(false, "_alldictionaries"),"dictionary",_ref.getField(false, "_dictionary"),"dictionaryVersion",_ref.getField(false, "_dictionaryversion"),"displayNameForParsing",_ref.getField(false, "_displaynameforparsing"),"EN",_ref.getField(false, "_en"),"fileDirPath",_ref.getField(false, "_filedirpath"),"indexOfLanguageToUpdate",_ref.getField(false, "_indexoflanguagetoupdate"),"isImporting",_ref.getField(false, "_isimporting"),"keyForParsing",_ref.getField(false, "_keyforparsing"),"langAbbreviature",_ref.getField(false, "_langabbreviature"),"languageForParsing",_ref.getField(false, "_languageforparsing"),"productNameForParsing",_ref.getField(false, "_productnameforparsing"),"productsVersionsMap",_ref.getField(false, "_productsversionsmap"),"selectedProduct",_ref.getField(false, "_selectedproduct"),"unknownAbbreviature",_ref.getField(false, "_unknownabbreviature"),"workingProduct",_ref.getField(false, "_workingproduct"),"xmlItemValues",_ref.getField(false, "_xmlitemvalues"),"xmlParser",_ref.getField(false, "_xmlparser")};
}
}