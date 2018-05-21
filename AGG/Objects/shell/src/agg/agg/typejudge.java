
package agg.agg;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class typejudge {
    public static RemoteObject myClass;
	public typejudge() {
	}
    public static PCBA staticBA = new PCBA(null, typejudge.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _typepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnav = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btntv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnexe = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _padding = RemoteObject.createImmutable(0);
public static agg.agg.main _main = null;
public static agg.agg.starter _starter = null;
public static agg.agg.programdata _programdata = null;
public static agg.agg.uisizes _uisizes = null;
public static agg.agg.version _version = null;
public static agg.agg.helperfunctions _helperfunctions = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnAv",_ref.getField(false, "_btnav"),"btnExe",_ref.getField(false, "_btnexe"),"btnTv",_ref.getField(false, "_btntv"),"Padding",_ref.getField(false, "_padding"),"typePanel",_ref.getField(false, "_typepanel")};
}
}