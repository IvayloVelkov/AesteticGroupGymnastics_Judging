
package b4a.example;

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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
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
public static RemoteObject _translate = RemoteObject.declareNull("b4a.example.translator");
public static RemoteObject _selectedlanguage = RemoteObject.createImmutable("");
public static RemoteObject _intfonttransfer = RemoteObject.createImmutable(0);
public static RemoteObject _basenotaccessible = RemoteObject.createImmutable(false);
public static RemoteObject _db = RemoteObject.declareNull("b4a.example.dbsqlconnector");
public static RemoteObject _cfg = RemoteObject.declareNull("b4a.example.config");
public static RemoteObject _primecurrency = RemoteObject.createImmutable("");
public static RemoteObject _login = RemoteObject.declareNull("b4a.example.loginscreen");
public static RemoteObject _typej = RemoteObject.declareNull("b4a.example.typejudge");
public static RemoteObject _avj = RemoteObject.declareNull("b4a.example.av_judge");
public static RemoteObject _tvj = RemoteObject.declareNull("b4a.example.tv_judge");
public static RemoteObject _exej = RemoteObject.declareNull("b4a.example.exe_judging");
public static RemoteObject _final = RemoteObject.declareNull("b4a.example.sendscore");
public static RemoteObject _insettings = RemoteObject.declareNull("b4a.example.initialsettings");
public static b4a.example.programdata _programdata = null;
public static b4a.example.uisizes _uisizes = null;
public static b4a.example.version _version = null;
public static b4a.example.starter _starter = null;
public static b4a.example.helperfunctions _helperfunctions = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"avJ",main.mostCurrent._avj,"BaseNotAccessible",main._basenotaccessible,"Cfg",main._cfg,"DB",main._db,"exeJ",main.mostCurrent._exej,"final",main.mostCurrent._final,"HelperFunctions",Debug.moduleToString(b4a.example.helperfunctions.class),"insettings",main.mostCurrent._insettings,"intFontTransfer",main._intfonttransfer,"Login",main.mostCurrent._login,"PrimeCurrency",main._primecurrency,"ProgramData",Debug.moduleToString(b4a.example.programdata.class),"SelectedLanguage",main._selectedlanguage,"Starter",Debug.moduleToString(b4a.example.starter.class),"translate",main._translate,"tvJ",main.mostCurrent._tvj,"typeJ",main.mostCurrent._typej,"UISizes",Debug.moduleToString(b4a.example.uisizes.class),"Version",Debug.moduleToString(b4a.example.version.class)};
}
}