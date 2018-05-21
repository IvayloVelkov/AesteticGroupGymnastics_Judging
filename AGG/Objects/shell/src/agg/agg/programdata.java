
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

public class programdata implements IRemote{
	public static programdata mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public programdata() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, programdata.class);
    static {
		mostCurrent = new programdata();
        remoteMe = RemoteObject.declareNull("agg.agg.programdata");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("programdata"), "agg.agg.programdata");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("agg.agg.programdata"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _struser = RemoteObject.createImmutable("");
public static RemoteObject _strpass = RemoteObject.createImmutable("");
public static RemoteObject _rafencpass = RemoteObject.createImmutable(0);
public static RemoteObject _sameuser = RemoteObject.createImmutable(false);
public static RemoteObject _defaultfont = RemoteObject.createImmutable(0);
public static RemoteObject _finalscore = RemoteObject.createImmutable(0);
public static agg.agg.main _main = null;
public static agg.agg.starter _starter = null;
public static agg.agg.uisizes _uisizes = null;
public static agg.agg.version _version = null;
public static agg.agg.helperfunctions _helperfunctions = null;
  public Object[] GetGlobals() {
		return new Object[] {"DefaultFont",programdata._defaultfont,"finalScore",programdata._finalscore,"HelperFunctions",Debug.moduleToString(agg.agg.helperfunctions.class),"Main",Debug.moduleToString(agg.agg.main.class),"rafEncPass",programdata._rafencpass,"sameUser",programdata._sameuser,"Starter",Debug.moduleToString(agg.agg.starter.class),"strPass",programdata._strpass,"strUser",programdata._struser,"UISizes",Debug.moduleToString(agg.agg.uisizes.class),"Version",Debug.moduleToString(agg.agg.version.class)};
}
}