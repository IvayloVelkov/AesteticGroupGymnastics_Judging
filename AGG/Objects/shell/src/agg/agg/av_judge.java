
package agg.agg;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class av_judge {
    public static RemoteObject myClass;
	public av_judge() {
	}
    public static PCBA staticBA = new PCBA(null, av_judge.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _avpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pager = RemoteObject.declareNull("de.amberhome.viewpager.AHViewPager");
public static RemoteObject _container = RemoteObject.declareNull("de.amberhome.viewpager.AHPageContainer");
public static RemoteObject _page = null;
public static RemoteObject _label = null;
public static RemoteObject _chekpointbox = null;
public static RemoteObject _tabs = RemoteObject.declareNull("de.amberhome.viewpager.AHViewPagerTabs");
public static RemoteObject _line = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _line2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _downpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnready = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _avscore = RemoteObject.createImmutable(0);
public static agg.agg.main _main = null;
public static agg.agg.starter _starter = null;
public static agg.agg.programdata _programdata = null;
public static agg.agg.uisizes _uisizes = null;
public static agg.agg.version _version = null;
public static agg.agg.helperfunctions _helperfunctions = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"avPanel",_ref.getField(false, "_avpanel"),"avScore",_ref.getField(false, "_avscore"),"btnready",_ref.getField(false, "_btnready"),"chekpointbox",_ref.getField(false, "_chekpointbox"),"Container",_ref.getField(false, "_container"),"downPanel",_ref.getField(false, "_downpanel"),"label",_ref.getField(false, "_label"),"Line",_ref.getField(false, "_line"),"Line2",_ref.getField(false, "_line2"),"page",_ref.getField(false, "_page"),"Pager",_ref.getField(false, "_pager"),"Tabs",_ref.getField(false, "_tabs")};
}
}