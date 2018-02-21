
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class initialsettings {
    public static RemoteObject myClass;
	public initialsettings() {
	}
    public static PCBA staticBA = new PCBA(null, initialsettings.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pnlbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblsettings = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbllanguage = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _spnlanguage = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _intlanguageindex = RemoteObject.createImmutable(0);
public static RemoteObject _boovisible = RemoteObject.createImmutable(false);
public static b4a.example.main _main = null;
public static b4a.example.programdata _programdata = null;
public static b4a.example.uisizes _uisizes = null;
public static b4a.example.version _version = null;
public static b4a.example.starter _starter = null;
public static b4a.example.helperfunctions _helperfunctions = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"booVisible",_ref.getField(false, "_boovisible"),"intLanguageIndex",_ref.getField(false, "_intlanguageindex"),"lblLanguage",_ref.getField(false, "_lbllanguage"),"lblSettings",_ref.getField(false, "_lblsettings"),"pnlBase",_ref.getField(false, "_pnlbase"),"pnlMenu",_ref.getField(false, "_pnlmenu"),"SpnLanguage",_ref.getField(false, "_spnlanguage")};
}
}