package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class exe_judging_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("asView (exe_judging) ","exe_judging",14,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "exe_judging","asview", __ref);
 BA.debugLineNum = 89;BA.debugLine="Public Sub asView As Panel";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Return exePanel";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(false,"_exepanel");
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUi (exe_judging) ","exe_judging",14,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "exe_judging","buildui", __ref);
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
 BA.debugLineNum = 27;BA.debugLine="Public Sub BuildUi";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Container.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_container").runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
Debug.ShouldStop(536870912);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(exe_judging._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AvPage0")))));
 BA.debugLineNum = 31;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).getObject())),(Object)(exe_judging._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AvPage1")))));
 BA.debugLineNum = 32;BA.debugLine="Container.AddPage(page(2), Main.translate.GetStri";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 2)).getObject())),(Object)(exe_judging._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AvPage2")))));
 BA.debugLineNum = 33;BA.debugLine="Container.AddPage(page(3), Main.translate.GetStri";
Debug.ShouldStop(1);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 3)).getObject())),(Object)(exe_judging._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AvPage3")))));
 BA.debugLineNum = 35;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
Debug.ShouldStop(4);
__ref.getField(false,"_pager").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_container")),(Object)(RemoteObject.createImmutable("MPager")));
 BA.debugLineNum = 37;BA.debugLine="Tabs.Initialize(Pager)";
Debug.ShouldStop(16);
__ref.getField(false,"_tabs").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_pager")));
 BA.debugLineNum = 38;BA.debugLine="Tabs.LineHeight = 5dip";
Debug.ShouldStop(32);
__ref.getField(false,"_tabs").runMethod(true,"setLineHeight",exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 39;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
Debug.ShouldStop(64);
__ref.getField(false,"_tabs").runMethod(true,"setLineColorCenter",exe_judging.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 40;BA.debugLine="Tabs.TextColor = Colors.Gray";
Debug.ShouldStop(128);
__ref.getField(false,"_tabs").runMethod(true,"setTextColor",exe_judging.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 41;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
Debug.ShouldStop(256);
__ref.getField(false,"_tabs").runMethod(true,"setTextColorCenter",exe_judging.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 43;BA.debugLine="exePanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
Debug.ShouldStop(1024);
__ref.getField(false,"_exepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tabs").getObject())),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 46;BA.debugLine="Dim Col As ColorDrawable";
Debug.ShouldStop(8192);
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("Col", _col);
 BA.debugLineNum = 48;BA.debugLine="Col.Initialize(Colors.Green, 0)";
Debug.ShouldStop(32768);
_col.runVoidMethod ("Initialize",(Object)(exe_judging.__c.getField(false,"Colors").getField(true,"Green")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 50;BA.debugLine="Line.Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_line").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 51;BA.debugLine="Line.Background = Col";
Debug.ShouldStop(262144);
__ref.getField(false,"_line").runMethod(false,"setBackground",(_col.getObject()));
 BA.debugLineNum = 53;BA.debugLine="Line2.Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_line2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 54;BA.debugLine="Line2.Background = Col";
Debug.ShouldStop(2097152);
__ref.getField(false,"_line2").runMethod(false,"setBackground",(_col.getObject()));
 BA.debugLineNum = 56;BA.debugLine="exePanel.AddView(Line, 0dip, 35dip, exePanel.Widt";
Debug.ShouldStop(8388608);
__ref.getField(false,"_exepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_line").getObject())),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))),(Object)(__ref.getField(false,"_exepanel").runMethod(true,"getWidth")),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 59;BA.debugLine="exePanel.AddView(Pager, 0dip, 35dip + 2dip, exePa";
Debug.ShouldStop(67108864);
__ref.getField(false,"_exepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pager").getObject())),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(__ref.getField(false,"_exepanel").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_exepanel").runMethod(true,"getHeight"),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "--",2, 1)));
 BA.debugLineNum = 61;BA.debugLine="exePanel.AddView(downPanel, 0, exePanel.Height -";
Debug.ShouldStop(268435456);
__ref.getField(false,"_exepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_downpanel").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_exepanel").runMethod(true,"getHeight"),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))}, "-",1, 1)),(Object)(__ref.getField(false,"_exepanel").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_exepanel").runMethod(true,"getHeight"),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "--",2, 1)));
 BA.debugLineNum = 62;BA.debugLine="exePanel.AddView(Line2, 0dip, exePanel.Height - (";
Debug.ShouldStop(536870912);
__ref.getField(false,"_exepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_line2").getObject())),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_exepanel").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1))}, "-",1, 1)),(Object)(__ref.getField(false,"_exepanel").runMethod(true,"getWidth")),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 64;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_downpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnready").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_downpanel").runMethod(true,"getWidth"),exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 33)))));
 BA.debugLineNum = 67;BA.debugLine="page(0).AddView(label(0), 0, 11%y, 50%x, 15%y)";
Debug.ShouldStop(4);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 11)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 68;BA.debugLine="label(0).Text = Main.translate.GetString(\"AVlabal";
Debug.ShouldStop(8);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence(exe_judging._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AVlabal1")))));
 BA.debugLineNum = 69;BA.debugLine="label(0).TextColor = Colors.White";
Debug.ShouldStop(16);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setTextColor",exe_judging.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 71;BA.debugLine="page(1).AddView(label(1), 0, 11%y, 50%x, 15%y)";
Debug.ShouldStop(64);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 1)).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 11)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 72;BA.debugLine="label(1).Text = Main.translate.GetString(\"AVlabal";
Debug.ShouldStop(128);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(true,"setText",BA.ObjectToCharSequence(exe_judging._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AVlabal1")))));
 BA.debugLineNum = 73;BA.debugLine="label(1).TextColor = Colors.White";
Debug.ShouldStop(256);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(true,"setTextColor",exe_judging.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 75;BA.debugLine="page(2).AddView(label(2), 0, 11%y, 50%x, 15%y)";
Debug.ShouldStop(1024);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 2)).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 11)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 76;BA.debugLine="label(2).Text = Main.translate.GetString(\"AVlabal";
Debug.ShouldStop(2048);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(true,"setText",BA.ObjectToCharSequence(exe_judging._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AVlabal1")))));
 BA.debugLineNum = 77;BA.debugLine="label(2).TextColor = Colors.White";
Debug.ShouldStop(4096);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(true,"setTextColor",exe_judging.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 79;BA.debugLine="page(3).AddView(label(3), 0, 11%y, 50%x, 15%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 3)).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 11)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 80;BA.debugLine="label(3).Text = Main.translate.GetString(\"AVlabal";
Debug.ShouldStop(32768);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(true,"setText",BA.ObjectToCharSequence(exe_judging._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AVlabal1")))));
 BA.debugLineNum = 81;BA.debugLine="label(3).TextColor = Colors.White";
Debug.ShouldStop(65536);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(true,"setTextColor",exe_judging.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public exePanel As Panel";
exe_judging._exepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_exepanel",exe_judging._exepanel);
 //BA.debugLineNum = 3;BA.debugLine="Public Pager As AHViewPager";
exe_judging._pager = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPager");__ref.setField("_pager",exe_judging._pager);
 //BA.debugLineNum = 4;BA.debugLine="Public Container As AHPageContainer";
exe_judging._container = RemoteObject.createNew ("de.amberhome.viewpager.AHPageContainer");__ref.setField("_container",exe_judging._container);
 //BA.debugLineNum = 5;BA.debugLine="Private page(4) As Panel";
exe_judging._page = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {4}, new Object[]{});__ref.setField("_page",exe_judging._page);
 //BA.debugLineNum = 6;BA.debugLine="Private label(35) As Label";
exe_judging._label = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {35}, new Object[]{});__ref.setField("_label",exe_judging._label);
 //BA.debugLineNum = 7;BA.debugLine="Dim Tabs As AHViewPagerTabs";
exe_judging._tabs = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPagerTabs");__ref.setField("_tabs",exe_judging._tabs);
 //BA.debugLineNum = 8;BA.debugLine="Dim Line As Panel";
exe_judging._line = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_line",exe_judging._line);
 //BA.debugLineNum = 9;BA.debugLine="Dim Line2 As Panel";
exe_judging._line2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_line2",exe_judging._line2);
 //BA.debugLineNum = 10;BA.debugLine="Dim downPanel As Panel";
exe_judging._downpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_downpanel",exe_judging._downpanel);
 //BA.debugLineNum = 11;BA.debugLine="Dim btnready As Button";
exe_judging._btnready = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnready",exe_judging._btnready);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (exe_judging) ","exe_judging",14,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "exe_judging","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
int _i = 0;
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="exePanel.Initialize(\"\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_exepanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 17;BA.debugLine="For i = 0 To 3";
Debug.ShouldStop(65536);
{
final int step2 = 1;
final int limit2 = 3;
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 18;BA.debugLine="page(i).Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 20;BA.debugLine="For i = 0 To 34";
Debug.ShouldStop(524288);
{
final int step5 = 1;
final int limit5 = 34;
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 21;BA.debugLine="label(i).Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 23;BA.debugLine="downPanel.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_downpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="btnready.Initialize(\"ready\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnready").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ready")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ready_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ready_Click (exe_judging) ","exe_judging",14,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("ready_click")) return __ref.runUserSub(false, "exe_judging","ready_click", __ref);
 BA.debugLineNum = 85;BA.debugLine="Private Sub ready_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="CallSub(Main, \"FinalClick\")";
Debug.ShouldStop(2097152);
exe_judging.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((exe_judging._main.getObject())),(Object)(RemoteObject.createImmutable("FinalClick")));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}