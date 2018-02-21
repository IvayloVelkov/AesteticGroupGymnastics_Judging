
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

public class uisizes implements IRemote{
	public static uisizes mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public uisizes() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, uisizes.class);
    static {
		mostCurrent = new uisizes();
        remoteMe = RemoteObject.declareNull("b4a.example.uisizes");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("uisizes"), "b4a.example.uisizes");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.example.uisizes"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static RemoteObject _headerheight = RemoteObject.createImmutable(0);
public static RemoteObject _footerheight = RemoteObject.createImmutable(0);
public static RemoteObject _leftpart = RemoteObject.createImmutable(0);
public static RemoteObject _groupscroller = RemoteObject.createImmutable(0);
public static RemoteObject _buttonleft = RemoteObject.createImmutable(0);
public static RemoteObject _settingswidth = RemoteObject.createImmutable(0);
public static RemoteObject _initsettingswidth = RemoteObject.createImmutable(0);
public static RemoteObject _keyboardwidth = RemoteObject.createImmutable(0);
public static RemoteObject _groupbuttonheight = RemoteObject.createImmutable(0);
public static RemoteObject _defaultfont = RemoteObject.createImmutable(0);
public static RemoteObject _headerlabelheight = RemoteObject.createImmutable(0);
public static RemoteObject _footerlabelheight = RemoteObject.createImmutable(0);
public static RemoteObject _defaultpadding = RemoteObject.createImmutable(0);
public static RemoteObject _pressedtextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _groupcolor_normal = RemoteObject.createImmutable("");
public static RemoteObject _groupcolor_pressed = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.programdata _programdata = null;
public static b4a.example.version _version = null;
public static b4a.example.starter _starter = null;
public static b4a.example.helperfunctions _helperfunctions = null;
  public Object[] GetGlobals() {
		return new Object[] {"ButtonLeft",uisizes._buttonleft,"DefaultFont",uisizes._defaultfont,"DefaultPadding",uisizes._defaultpadding,"FooterHeight",uisizes._footerheight,"FooterLabelHeight",uisizes._footerlabelheight,"GroupButtonHeight",uisizes._groupbuttonheight,"GroupColor_Normal",uisizes._groupcolor_normal,"GroupColor_Pressed",uisizes._groupcolor_pressed,"GroupScroller",uisizes._groupscroller,"HeaderHeight",uisizes._headerheight,"HeaderLabelHeight",uisizes._headerlabelheight,"HelperFunctions",Debug.moduleToString(b4a.example.helperfunctions.class),"initSettingsWidth",uisizes._initsettingswidth,"keyboardWidth",uisizes._keyboardwidth,"LeftPart",uisizes._leftpart,"Main",Debug.moduleToString(b4a.example.main.class),"PressedTextColor",uisizes._pressedtextcolor,"ProgramData",Debug.moduleToString(b4a.example.programdata.class),"settingsWidth",uisizes._settingswidth,"Starter",Debug.moduleToString(b4a.example.starter.class),"Version",Debug.moduleToString(b4a.example.version.class)};
}
}