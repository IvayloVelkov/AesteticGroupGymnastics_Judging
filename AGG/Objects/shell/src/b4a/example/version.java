
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

public class version implements IRemote{
	public static version mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public version() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, version.class);
    static {
		mostCurrent = new version();
        remoteMe = RemoteObject.declareNull("b4a.example.version");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("version"), "b4a.example.version");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.example.version"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static RemoteObject _productid = RemoteObject.createImmutable(0);
public static RemoteObject _programname = RemoteObject.createImmutable("");
public static RemoteObject _productindictionary = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.programdata _programdata = null;
public static b4a.example.uisizes _uisizes = null;
public static b4a.example.starter _starter = null;
public static b4a.example.helperfunctions _helperfunctions = null;
  public Object[] GetGlobals() {
		return new Object[] {"HelperFunctions",Debug.moduleToString(b4a.example.helperfunctions.class),"Main",Debug.moduleToString(b4a.example.main.class),"ProductID",version._productid,"ProductInDictionary",version._productindictionary,"ProgramData",Debug.moduleToString(b4a.example.programdata.class),"ProgramName",version._programname,"Starter",Debug.moduleToString(b4a.example.starter.class),"UISizes",Debug.moduleToString(b4a.example.uisizes.class)};
}
}