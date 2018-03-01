
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class config {
    public static RemoteObject myClass;
	public config() {
	}
    public static PCBA staticBA = new PCBA(null, config.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dbserveraddress = RemoteObject.createImmutable("");
public static RemoteObject _dbbasename = RemoteObject.createImmutable("");
public static RemoteObject _dbusername = RemoteObject.createImmutable("");
public static RemoteObject _dbpassword = RemoteObject.createImmutable("");
public static RemoteObject _dbengine = RemoteObject.createImmutable("");
public static RemoteObject _configfilename = RemoteObject.createImmutable("");
public static RemoteObject _cfgmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _sellanguage = RemoteObject.createImmutable("");
public static RemoteObject _sellangindex = RemoteObject.createImmutable(0);
public static RemoteObject _selfontsize = RemoteObject.createImmutable(0);
public static RemoteObject _selfontsizeindex = RemoteObject.createImmutable(0);
public static RemoteObject _seldbengineindex = RemoteObject.createImmutable(0);
public static RemoteObject _logfilename = RemoteObject.createImmutable("");
public static RemoteObject _reportsfolder = RemoteObject.createImmutable("");
public static RemoteObject _default_currency = RemoteObject.createImmutable("");
public static RemoteObject _currencyname = RemoteObject.createImmutable("");
public static RemoteObject _currencyleftprefix = RemoteObject.createImmutable("");
public static RemoteObject _currencyrightprefix = RemoteObject.createImmutable("");
public static RemoteObject _currencydisplay = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.programdata _programdata = null;
public static b4a.example.uisizes _uisizes = null;
public static b4a.example.version _version = null;
public static b4a.example.starter _starter = null;
public static b4a.example.helperfunctions _helperfunctions = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"cfgMap",_ref.getField(false, "_cfgmap"),"configFileName",_ref.getField(false, "_configfilename"),"CurrencyDisplay",_ref.getField(false, "_currencydisplay"),"CurrencyLeftPrefix",_ref.getField(false, "_currencyleftprefix"),"CurrencyName",_ref.getField(false, "_currencyname"),"CurrencyRightPrefix",_ref.getField(false, "_currencyrightprefix"),"dbBaseName",_ref.getField(false, "_dbbasename"),"dbEngine",_ref.getField(false, "_dbengine"),"dbPassword",_ref.getField(false, "_dbpassword"),"dbServerAddress",_ref.getField(false, "_dbserveraddress"),"dbUserName",_ref.getField(false, "_dbusername"),"DEFAULT_CURRENCY",_ref.getField(false, "_default_currency"),"logFileName",_ref.getField(false, "_logfilename"),"ReportsFolder",_ref.getField(false, "_reportsfolder"),"selDBEngineIndex",_ref.getField(false, "_seldbengineindex"),"selFontSize",_ref.getField(false, "_selfontsize"),"selFontSizeIndex",_ref.getField(false, "_selfontsizeindex"),"selLangIndex",_ref.getField(false, "_sellangindex"),"selLanguage",_ref.getField(false, "_sellanguage")};
}
}