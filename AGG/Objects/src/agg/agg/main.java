package agg.agg;


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
			processBA = new BA(this.getApplicationContext(), null, null, "agg.agg", "agg.agg.main");
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
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, true))
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
		activityBA = new BA(this, layout, processBA, "agg.agg", "agg.agg.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "agg.agg.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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

public anywheresoftware.b4a.keywords.Common __c = null;
public static agg.agg.translator _translate = null;
public static String _selectedlanguage = "";
public static int _intfonttransfer = 0;
public static boolean _basenotaccessible = false;
public static String _primecurrency = "";
public agg.agg.loginscreen _login = null;
public agg.agg.typejudge _typej = null;
public agg.agg.av_judge _avj = null;
public agg.agg.tv_judge _tvj = null;
public agg.agg.exe_judging _exej = null;
public agg.agg.connector _conn = null;
public agg.agg.sendscore _final = null;
public static double _score = 0;
public static int _scactive = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
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
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 38;BA.debugLine="translate.Initialize";
_translate._initialize(processBA);
 //BA.debugLineNum = 39;BA.debugLine="intFontTransfer = UISizes.DefaultFont";
_intfonttransfer = mostCurrent._uisizes._defaultfont;
 //BA.debugLineNum = 41;BA.debugLine="Load_Language";
_load_language();
 //BA.debugLineNum = 43;BA.debugLine="Login.Initialize";
mostCurrent._login._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 44;BA.debugLine="Activity.AddView(Login.asView, 0, 0, 100%x, 100%y";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._login._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 45;BA.debugLine="Login.build_Screen";
mostCurrent._login._build_screen();
 //BA.debugLineNum = 47;BA.debugLine="typeJ.Initialize";
mostCurrent._typej._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 48;BA.debugLine="Activity.AddView(typeJ.asView, 0, 0, 100%x, 100%y";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._typej._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 49;BA.debugLine="typeJ.asView.Visible = False";
mostCurrent._typej._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 50;BA.debugLine="typeJ.asView.Enabled = False";
mostCurrent._typej._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 52;BA.debugLine="avJ.Initialize";
mostCurrent._avj._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 53;BA.debugLine="Activity.AddView(avJ.asView, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._avj._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 54;BA.debugLine="avJ.asView.Visible = False";
mostCurrent._avj._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 55;BA.debugLine="avJ.asView.Enabled = False";
mostCurrent._avj._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 56;BA.debugLine="avJ.BuildUi";
mostCurrent._avj._buildui();
 //BA.debugLineNum = 58;BA.debugLine="tvJ.Initialize";
mostCurrent._tvj._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 59;BA.debugLine="Activity.AddView(tvJ.asView, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._tvj._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 60;BA.debugLine="tvJ.asView.Visible = False";
mostCurrent._tvj._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 61;BA.debugLine="tvJ.asView.Enabled = False";
mostCurrent._tvj._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 62;BA.debugLine="tvJ.BuildUi";
mostCurrent._tvj._buildui();
 //BA.debugLineNum = 64;BA.debugLine="exeJ.Initialize";
mostCurrent._exej._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 65;BA.debugLine="Activity.AddView(exeJ.asView, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._exej._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 66;BA.debugLine="exeJ.asView.Visible = False";
mostCurrent._exej._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 67;BA.debugLine="exeJ.asView.Enabled = False";
mostCurrent._exej._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 68;BA.debugLine="exeJ.BuildUi";
mostCurrent._exej._buildui();
 //BA.debugLineNum = 70;BA.debugLine="final.Initialize";
mostCurrent._final._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 71;BA.debugLine="Activity.AddView(final.asView, 0, 0, 100%x, 100%y";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._final._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 72;BA.debugLine="final.asView.Visible = False";
mostCurrent._final._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 73;BA.debugLine="final.asView.Enabled = False";
mostCurrent._final._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 75;BA.debugLine="conn.Initialize";
mostCurrent._conn._initialize(processBA);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 155;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 156;BA.debugLine="If avJ.asView.Visible = True Then";
if (mostCurrent._avj._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 157;BA.debugLine="typeJ.asView.Visible = True";
mostCurrent._typej._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 158;BA.debugLine="avJ.asView.Visible = False";
mostCurrent._avj._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else if(mostCurrent._tvj._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 160;BA.debugLine="tvJ.asView.Visible = False";
mostCurrent._tvj._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 161;BA.debugLine="typeJ.asView.Visible = True";
mostCurrent._typej._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else if(mostCurrent._exej._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 163;BA.debugLine="exeJ.asView.Visible = False";
mostCurrent._exej._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 164;BA.debugLine="typeJ.asView.Visible = True";
mostCurrent._typej._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else if(mostCurrent._typej._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 166;BA.debugLine="typeJ.asView.Visible = False";
mostCurrent._typej._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 167;BA.debugLine="Login.asView.Visible = True";
mostCurrent._login._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 168;BA.debugLine="Login.btnloginPanel.Enabled = True";
mostCurrent._login._btnloginpanel.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else if(mostCurrent._final._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 170;BA.debugLine="Select scActive";
switch (_scactive) {
case 1: {
 //BA.debugLineNum = 172;BA.debugLine="avJ.asView.Visible = True";
mostCurrent._avj._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 173;BA.debugLine="final.asView.Visible = False";
mostCurrent._final._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 break; }
case 2: {
 //BA.debugLineNum = 175;BA.debugLine="tvJ.asView.Visible = True";
mostCurrent._tvj._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 176;BA.debugLine="final.asView.Visible = False";
mostCurrent._final._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 break; }
case 3: {
 //BA.debugLineNum = 178;BA.debugLine="exeJ.asView.Visible = True";
mostCurrent._exej._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 179;BA.debugLine="final.asView.Visible = False";
mostCurrent._final._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 break; }
}
;
 };
 //BA.debugLineNum = 182;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 184;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return false;
}
public static String  _av_click() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub AV_Click";
 //BA.debugLineNum = 107;BA.debugLine="typeJ.asView.Visible = False";
mostCurrent._typej._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 108;BA.debugLine="typeJ.asView.Enabled = False";
mostCurrent._typej._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 110;BA.debugLine="avJ.asView.Visible = True";
mostCurrent._avj._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 111;BA.debugLine="avJ.asView.Enabled = True";
mostCurrent._avj._asview().setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 112;BA.debugLine="scActive = 1";
_scactive = (int) (1);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public static String  _connect() throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Public Sub Connect";
 //BA.debugLineNum = 151;BA.debugLine="conn.PerformUpload()";
mostCurrent._conn._performupload();
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public static String  _exe_click() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub EXE_Click";
 //BA.debugLineNum = 125;BA.debugLine="typeJ.asView.Visible = False";
mostCurrent._typej._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 126;BA.debugLine="typeJ.asView.Enabled = False";
mostCurrent._typej._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 128;BA.debugLine="exeJ.asView.Visible = True";
mostCurrent._exej._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 129;BA.debugLine="exeJ.asView.Enabled = True";
mostCurrent._exej._asview().setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 130;BA.debugLine="scActive = 3";
_scactive = (int) (3);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _finalclick() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub FinalClick";
 //BA.debugLineNum = 134;BA.debugLine="If avJ.asView.Visible = True Then";
if (mostCurrent._avj._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 135;BA.debugLine="avJ.asView.Visible = False";
mostCurrent._avj._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 136;BA.debugLine="avJ.asView.Enabled = False";
mostCurrent._avj._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else if(mostCurrent._tvj._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 138;BA.debugLine="tvJ.asView.Visible = False";
mostCurrent._tvj._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 139;BA.debugLine="tvJ.asView.Enabled = False";
mostCurrent._tvj._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else if(mostCurrent._exej._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 141;BA.debugLine="exeJ.asView.Visible = False";
mostCurrent._exej._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 142;BA.debugLine="exeJ.asView.Enabled = False";
mostCurrent._exej._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 145;BA.debugLine="final.asView.Visible = True";
mostCurrent._final._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 146;BA.debugLine="final.asView.Enabled = True";
mostCurrent._final._asview().setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 147;BA.debugLine="final.finalScore";
mostCurrent._final._finalscore();
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public static double  _finalscore() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub finalScore As Double";
 //BA.debugLineNum = 84;BA.debugLine="Select scActive";
switch (_scactive) {
case 1: {
 //BA.debugLineNum = 86;BA.debugLine="score = avJ.finalAVscore";
_score = mostCurrent._avj._finalavscore();
 //BA.debugLineNum = 87;BA.debugLine="HelperFunctions.avResult = score";
mostCurrent._helperfunctions._avresult = BA.NumberToString(_score);
 break; }
case 2: {
 //BA.debugLineNum = 89;BA.debugLine="score = tvJ.finalTVscore";
_score = mostCurrent._tvj._finaltvscore();
 //BA.debugLineNum = 90;BA.debugLine="HelperFunctions.tvResult = score";
mostCurrent._helperfunctions._tvresult = BA.NumberToString(_score);
 break; }
case 3: {
 //BA.debugLineNum = 92;BA.debugLine="score = exeJ.finalEXEscore";
_score = mostCurrent._exej._finalexescore();
 //BA.debugLineNum = 93;BA.debugLine="HelperFunctions.exeResult = score";
mostCurrent._helperfunctions._exeresult = BA.NumberToString(_score);
 break; }
}
;
 //BA.debugLineNum = 95;BA.debugLine="Return score";
if (true) return _score;
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return 0;
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private Login As LoginScreen";
mostCurrent._login = new agg.agg.loginscreen();
 //BA.debugLineNum = 27;BA.debugLine="Private typeJ As typeJudge";
mostCurrent._typej = new agg.agg.typejudge();
 //BA.debugLineNum = 28;BA.debugLine="Private avJ As AV_judge";
mostCurrent._avj = new agg.agg.av_judge();
 //BA.debugLineNum = 29;BA.debugLine="Private tvJ As TV_Judge";
mostCurrent._tvj = new agg.agg.tv_judge();
 //BA.debugLineNum = 30;BA.debugLine="Private exeJ As EXE_Judging";
mostCurrent._exej = new agg.agg.exe_judging();
 //BA.debugLineNum = 31;BA.debugLine="Private conn As Connector";
mostCurrent._conn = new agg.agg.connector();
 //BA.debugLineNum = 32;BA.debugLine="Private final As SendScore";
mostCurrent._final = new agg.agg.sendscore();
 //BA.debugLineNum = 33;BA.debugLine="Public score As Double";
_score = 0;
 //BA.debugLineNum = 34;BA.debugLine="Private scActive As Int";
_scactive = 0;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _load_language() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Private Sub Load_Language";
 //BA.debugLineNum = 79;BA.debugLine="translate.SetLanguage(SelectedLanguage)";
_translate._setlanguage(_selectedlanguage);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public static String  _loginscreen_loginclick() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub LoginScreen_LoginClick";
 //BA.debugLineNum = 99;BA.debugLine="Login.asView.Visible = False";
mostCurrent._login._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 100;BA.debugLine="Login.asView.Enabled = False";
mostCurrent._login._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 102;BA.debugLine="typeJ.asView.Visible = True";
mostCurrent._typej._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 103;BA.debugLine="typeJ.asView.Enabled = True";
mostCurrent._typej._asview().setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        anywheresoftware.b4a.samples.httputils2.httputils2service._process_globals();
main._process_globals();
helperfunctions._process_globals();
programdata._process_globals();
uisizes._process_globals();
version._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Public translate As Translator";
_translate = new agg.agg.translator();
 //BA.debugLineNum = 18;BA.debugLine="Public SelectedLanguage As String = \"BG\"";
_selectedlanguage = "BG";
 //BA.debugLineNum = 19;BA.debugLine="Public intFontTransfer As Int";
_intfonttransfer = 0;
 //BA.debugLineNum = 20;BA.debugLine="Type Report(ChartType As String,Title As String,X";
;
 //BA.debugLineNum = 21;BA.debugLine="Public BaseNotAccessible As Boolean";
_basenotaccessible = false;
 //BA.debugLineNum = 22;BA.debugLine="Public PrimeCurrency As String";
_primecurrency = "";
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static String  _tv_click() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub TV_Click";
 //BA.debugLineNum = 116;BA.debugLine="typeJ.asView.Visible = False";
mostCurrent._typej._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 117;BA.debugLine="typeJ.asView.Enabled = False";
mostCurrent._typej._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 119;BA.debugLine="tvJ.asView.Visible = True";
mostCurrent._tvj._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 120;BA.debugLine="tvJ.asView.Enabled = True";
mostCurrent._tvj._asview().setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 121;BA.debugLine="scActive = 2";
_scactive = (int) (2);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
}
