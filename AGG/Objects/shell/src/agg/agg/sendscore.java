
package agg.agg;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class sendscore {
    public static RemoteObject myClass;
	public sendscore() {
	}
    public static PCBA staticBA = new PCBA(null, sendscore.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _finalpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _teamname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _teamscore = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _sendbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static agg.agg.main _main = null;
public static agg.agg.starter _starter = null;
public static agg.agg.programdata _programdata = null;
public static agg.agg.uisizes _uisizes = null;
public static agg.agg.version _version = null;
public static agg.agg.helperfunctions _helperfunctions = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"finalPanel",_ref.getField(false, "_finalpanel"),"SendBtn",_ref.getField(false, "_sendbtn"),"teamname",_ref.getField(false, "_teamname"),"teamscore",_ref.getField(false, "_teamscore")};
}
}