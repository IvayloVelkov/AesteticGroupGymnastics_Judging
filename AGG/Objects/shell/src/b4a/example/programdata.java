
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
        remoteMe = RemoteObject.declareNull("b4a.example.programdata");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("programdata"), "b4a.example.programdata");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.example.programdata"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static RemoteObject _tile_small = RemoteObject.createImmutable(0);
public static RemoteObject _tile_large = RemoteObject.createImmutable(0);
public static RemoteObject _textsize_extralarge = RemoteObject.createImmutable(0);
public static RemoteObject _textsize_large = RemoteObject.createImmutable(0);
public static RemoteObject _textsize_small = RemoteObject.createImmutable(0);
public static RemoteObject _textsize_huge = RemoteObject.createImmutable(0);
public static RemoteObject _color_uiholder_left = RemoteObject.createImmutable(0);
public static RemoteObject _color_uiholder_right = RemoteObject.createImmutable(0);
public static RemoteObject _color_uigroup_scroller = RemoteObject.createImmutable(0);
public static RemoteObject _color_header = RemoteObject.createImmutable(0);
public static RemoteObject _color_footor = RemoteObject.createImmutable(0);
public static RemoteObject _color_button_normal = RemoteObject.createImmutable(0);
public static RemoteObject _color_button_pressed = RemoteObject.createImmutable(0);
public static RemoteObject _color_button_disabled = RemoteObject.createImmutable(0);
public static RemoteObject _color_button_textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _button_rounding = RemoteObject.createImmutable(0);
public static RemoteObject _bmpprinterstatusicon_error = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmpprinterstatusicon_success = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static b4a.example.main _main = null;
public static b4a.example.uisizes _uisizes = null;
public static b4a.example.version _version = null;
public static b4a.example.starter _starter = null;
public static b4a.example.helperfunctions _helperfunctions = null;
  public Object[] GetGlobals() {
		return new Object[] {"bmpPrinterStatusIcon_Error",programdata._bmpprinterstatusicon_error,"bmpPrinterStatusIcon_Success",programdata._bmpprinterstatusicon_success,"BUTTON_ROUNDING",programdata._button_rounding,"COLOR_BUTTON_DISABLED",programdata._color_button_disabled,"COLOR_BUTTON_NORMAL",programdata._color_button_normal,"COLOR_BUTTON_PRESSED",programdata._color_button_pressed,"COLOR_BUTTON_TEXTCOLOR",programdata._color_button_textcolor,"COLOR_FOOTOR",programdata._color_footor,"COLOR_HEADER",programdata._color_header,"COLOR_UIGROUP_SCROLLER",programdata._color_uigroup_scroller,"COLOR_UIHOLDER_LEFT",programdata._color_uiholder_left,"COLOR_UIHOLDER_RIGHT",programdata._color_uiholder_right,"DefaultFont",programdata._defaultfont,"HelperFunctions",Debug.moduleToString(b4a.example.helperfunctions.class),"Main",Debug.moduleToString(b4a.example.main.class),"rafEncPass",programdata._rafencpass,"sameUser",programdata._sameuser,"Starter",Debug.moduleToString(b4a.example.starter.class),"strPass",programdata._strpass,"strUser",programdata._struser,"TextSize_ExtraLarge",programdata._textsize_extralarge,"TextSize_Huge",programdata._textsize_huge,"TextSize_Large",programdata._textsize_large,"TextSize_Small",programdata._textsize_small,"Tile_Large",programdata._tile_large,"Tile_Small",programdata._tile_small,"UISizes",Debug.moduleToString(b4a.example.uisizes.class),"Version",Debug.moduleToString(b4a.example.version.class)};
}
}