package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public static class _report{
public boolean IsInitialized;
public String ChartType;
public String Title;
public String X;
public String Y;
public int Limit;
public String curveType;
public String sliceText;
public String Query;
public anywheresoftware.b4a.objects.collections.List Data;
public void Initialize() {
IsInitialized = true;
ChartType = "";
Title = "";
X = "";
Y = "";
Limit = 0;
curveType = "";
sliceText = "";
Query = "";
Data = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static b4a.example.translator _translate = null;
public static String _selectedlanguage = "";
public static int _intfonttransfer = 0;
public static boolean _basenotaccessible = false;
public static b4a.example.dbsqlconnector _db = null;
public static b4a.example.config _cfg = null;
public static String _primecurrency = "";
public b4a.example.loginscreen _login = null;
public b4a.example.typejudge _typej = null;
public b4a.example.av_judge _avj = null;
public b4a.example.tv_judge _tvj = null;
public b4a.example.exe_judging _exej = null;
public b4a.example.sendscore _final = null;
public b4a.example.initialsettings _insettings = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="translate.Initialize";
_translate._initialize(null,processBA);
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="intFontTransfer = UISizes.DefaultFont";
_intfonttransfer = mostCurrent._uisizes._defaultfont;
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="Login.Initialize";
mostCurrent._login._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Activity.AddView(Login.asView, 0, 0, 100%x, 100%y";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._login._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="Login.build_Screen";
mostCurrent._login._build_screen(null);
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="typeJ.Initialize";
mostCurrent._typej._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="Activity.AddView(typeJ.asView, 0, 0, 100%x, 100%y";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._typej._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="typeJ.asView.Visible = False";
mostCurrent._typej._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="typeJ.asView.Enabled = False";
mostCurrent._typej._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="avJ.Initialize";
mostCurrent._avj._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Activity.AddView(avJ.asView, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._avj._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="avJ.asView.Visible = False";
mostCurrent._avj._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="avJ.asView.Enabled = False";
mostCurrent._avj._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="avJ.BuildUi";
mostCurrent._avj._buildui(null);
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="tvJ.Initialize";
mostCurrent._tvj._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="Activity.AddView(tvJ.asView, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._tvj._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131093;
 //BA.debugLineNum = 131093;BA.debugLine="tvJ.asView.Visible = False";
mostCurrent._tvj._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="tvJ.asView.Enabled = False";
mostCurrent._tvj._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="tvJ.BuildUi";
mostCurrent._tvj._buildui(null);
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="exeJ.Initialize";
mostCurrent._exej._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131098;
 //BA.debugLineNum = 131098;BA.debugLine="Activity.AddView(exeJ.asView, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._exej._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="exeJ.asView.Visible = False";
mostCurrent._exej._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="exeJ.asView.Enabled = False";
mostCurrent._exej._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="exeJ.BuildUi";
mostCurrent._exej._buildui(null);
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="final.Initialize";
mostCurrent._final._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131104;
 //BA.debugLineNum = 131104;BA.debugLine="Activity.AddView(final.asView, 0, 0, 100%x, 100%y";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._final._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="final.asView.Visible = False";
mostCurrent._final._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131106;
 //BA.debugLineNum = 131106;BA.debugLine="final.asView.Enabled = False";
mostCurrent._final._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131108;
 //BA.debugLineNum = 131108;BA.debugLine="insettings.Initialize";
mostCurrent._insettings._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131109;
 //BA.debugLineNum = 131109;BA.debugLine="Activity.AddView(insettings.InitSetAsView, 0, 0,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._insettings._initsetasview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (40),mostCurrent.activityBA));
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="insettings.InitSettingsBuildScreen";
mostCurrent._insettings._initsettingsbuildscreen(null);
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="End Sub";
return "";
}
public static String  _av_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "av_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "av_click", null);
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub AV_Click";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="typeJ.asView.Visible = False";
mostCurrent._typej._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="typeJ.asView.Enabled = False";
mostCurrent._typej._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="avJ.asView.Visible = True";
mostCurrent._avj._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="avJ.asView.Enabled = True";
mostCurrent._avj._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="End Sub";
return "";
}
public static String  _connecttodatabase() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "connecttodatabase"))
	return (String) Debug.delegate(mostCurrent.activityBA, "connecttodatabase", null);
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub ConnectToDatabase";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Log(\"Database SET: \" & Cfg.dbServerAddress & \", \"";
anywheresoftware.b4a.keywords.Common.Log("Database SET: "+_cfg._dbserveraddress+", "+_cfg._dbbasename+", "+_cfg._dbusername+", "+_cfg._dbpassword);
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="DB.setDatabase(Cfg.dbServerAddress,Cfg.dbBaseName";
_db._setdatabase(null,_cfg._dbserveraddress,_cfg._dbbasename,_cfg._dbusername,_cfg._dbpassword);
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="End Sub";
return "";
}
public static String  _exe_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "exe_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "exe_click", null);
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub EXE_Click";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="typeJ.asView.Visible = False";
mostCurrent._typej._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="typeJ.asView.Enabled = False";
mostCurrent._typej._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="exeJ.asView.Visible = True";
mostCurrent._exej._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="exeJ.asView.Enabled = True";
mostCurrent._exej._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="End Sub";
return "";
}
public static String  _finalclick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "finalclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "finalclick", null);
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub FinalClick";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="If avJ.asView.Visible = True Then";
if (mostCurrent._avj._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="avJ.asView.Visible = False";
mostCurrent._avj._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="avJ.asView.Enabled = False";
mostCurrent._avj._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Else If tvJ.asView.Visible = True Then";
if (mostCurrent._tvj._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="tvJ.asView.Visible = False";
mostCurrent._tvj._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="tvJ.asView.Enabled = False";
mostCurrent._tvj._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="Else If exeJ.asView.Visible = True Then";
if (mostCurrent._exej._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="exeJ.asView.Visible = False";
mostCurrent._exej._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="exeJ.asView.Enabled = False";
mostCurrent._exej._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }}}
;
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="final.asView.Visible = True";
mostCurrent._final._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="final.asView.Enabled = True";
mostCurrent._final._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="End Sub";
return "";
}
public static String  _loginscreen_loginclick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loginscreen_loginclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "loginscreen_loginclick", null);
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub LoginScreen_LoginClick";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Login.asView.Visible = False";
mostCurrent._login._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Login.asView.Enabled = False";
mostCurrent._login._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="typeJ.asView.Visible = True";
mostCurrent._typej._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="typeJ.asView.Enabled = True";
mostCurrent._typej._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="End Sub";
return "";
}
public static String  _showsettings() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showsettings"))
	return (String) Debug.delegate(mostCurrent.activityBA, "showsettings", null);
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub showSettings";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="insettings.InitialSetShow";
mostCurrent._insettings._initialsetshow(null);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _tv_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tv_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "tv_click", null);
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub TV_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="typeJ.asView.Visible = False";
mostCurrent._typej._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="typeJ.asView.Enabled = False";
mostCurrent._typej._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="tvJ.asView.Visible = True";
mostCurrent._tvj._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="tvJ.asView.Enabled = True";
mostCurrent._tvj._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="End Sub";
return "";
}
}