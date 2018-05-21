
package agg.agg;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class loginscreen {
    public static RemoteObject myClass;
	public loginscreen() {
	}
    public static PCBA staticBA = new PCBA(null, loginscreen.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _raf = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
public static RemoteObject _loginpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _user = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _pass = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnloginpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _cad = RemoteObject.declareNull("def.CustomAlertDialog");
public static RemoteObject _checkloginpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _usrstring = RemoteObject.createImmutable("");
public static RemoteObject _passstring = RemoteObject.createImmutable("");
public static agg.agg.main _main = null;
public static agg.agg.starter _starter = null;
public static agg.agg.programdata _programdata = null;
public static agg.agg.uisizes _uisizes = null;
public static agg.agg.version _version = null;
public static agg.agg.helperfunctions _helperfunctions = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnloginPanel",_ref.getField(false, "_btnloginpanel"),"CAD",_ref.getField(false, "_cad"),"checkloginPanel",_ref.getField(false, "_checkloginpanel"),"loginPanel",_ref.getField(false, "_loginpanel"),"pass",_ref.getField(false, "_pass"),"passString",_ref.getField(false, "_passstring"),"raf",_ref.getField(false, "_raf"),"user",_ref.getField(false, "_user"),"usrString",_ref.getField(false, "_usrstring")};
}
}