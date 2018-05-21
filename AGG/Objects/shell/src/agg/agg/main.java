
package agg.agg;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "agg.agg.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _translate = RemoteObject.declareNull("agg.agg.translator");
public static RemoteObject _selectedlanguage = RemoteObject.createImmutable("");
public static RemoteObject _intfonttransfer = RemoteObject.createImmutable(0);
public static RemoteObject _basenotaccessible = RemoteObject.createImmutable(false);
public static RemoteObject _primecurrency = RemoteObject.createImmutable("");
public static RemoteObject _login = RemoteObject.declareNull("agg.agg.loginscreen");
public static RemoteObject _typej = RemoteObject.declareNull("agg.agg.typejudge");
public static RemoteObject _avj = RemoteObject.declareNull("agg.agg.av_judge");
public static RemoteObject _tvj = RemoteObject.declareNull("agg.agg.tv_judge");
public static RemoteObject _exej = RemoteObject.declareNull("agg.agg.exe_judging");
public static RemoteObject _final = RemoteObject.declareNull("agg.agg.sendscore");
public static RemoteObject _score = RemoteObject.createImmutable(0);
public static agg.agg.starter _starter = null;
public static agg.agg.programdata _programdata = null;
public static agg.agg.uisizes _uisizes = null;
public static agg.agg.version _version = null;
public static agg.agg.helperfunctions _helperfunctions = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"avJ",main.mostCurrent._avj,"BaseNotAccessible",main._basenotaccessible,"exeJ",main.mostCurrent._exej,"final",main.mostCurrent._final,"HelperFunctions",Debug.moduleToString(agg.agg.helperfunctions.class),"intFontTransfer",main._intfonttransfer,"Login",main.mostCurrent._login,"PrimeCurrency",main._primecurrency,"ProgramData",Debug.moduleToString(agg.agg.programdata.class),"score",main._score,"SelectedLanguage",main._selectedlanguage,"Starter",Debug.moduleToString(agg.agg.starter.class),"translate",main._translate,"tvJ",main.mostCurrent._tvj,"typeJ",main.mostCurrent._typej,"UISizes",Debug.moduleToString(agg.agg.uisizes.class),"Version",Debug.moduleToString(agg.agg.version.class)};
}
}