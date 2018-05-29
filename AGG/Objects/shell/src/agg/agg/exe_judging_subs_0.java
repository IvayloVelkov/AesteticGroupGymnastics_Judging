package agg.agg;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class exe_judging_subs_0 {


public static RemoteObject  _addpan_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("addPan_Click (exe_judging) ","exe_judging",2,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("addpan_click")) return __ref.runUserSub(false, "exe_judging","addpan_click", __ref);
 BA.debugLineNum = 91;BA.debugLine="Public Sub addPan_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="exeScore = exeScore + 0.1";
Debug.ShouldStop(134217728);
__ref.setField ("_exescore",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_exescore"),RemoteObject.createImmutable(0.1)}, "+",1, 0));
 BA.debugLineNum = 93;BA.debugLine="Log(exeScore)";
Debug.ShouldStop(268435456);
exe_judging.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_exescore"))));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("asView (exe_judging) ","exe_judging",2,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "exe_judging","asview", __ref);
 BA.debugLineNum = 116;BA.debugLine="Public Sub asView As Panel";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Return exePanel";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(false,"_exepanel");
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("BuildUi (exe_judging) ","exe_judging",2,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "exe_judging","buildui", __ref);
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
int _i = 0;
 BA.debugLineNum = 33;BA.debugLine="Public Sub BuildUi";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Container.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_container").runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 36;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
Debug.ShouldStop(8);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(exe_judging._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("ExePage0")))));
 BA.debugLineNum = 38;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
Debug.ShouldStop(32);
__ref.getField(false,"_pager").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_container")),(Object)(RemoteObject.createImmutable("MPager")));
 BA.debugLineNum = 40;BA.debugLine="Tabs.Initialize(Pager)";
Debug.ShouldStop(128);
__ref.getField(false,"_tabs").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_pager")));
 BA.debugLineNum = 41;BA.debugLine="Tabs.LineHeight = 5dip";
Debug.ShouldStop(256);
__ref.getField(false,"_tabs").runMethod(true,"setLineHeight",exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 42;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
Debug.ShouldStop(512);
__ref.getField(false,"_tabs").runMethod(true,"setLineColorCenter",exe_judging.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 43;BA.debugLine="Tabs.TextColor = Colors.Gray";
Debug.ShouldStop(1024);
__ref.getField(false,"_tabs").runMethod(true,"setTextColor",exe_judging.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 44;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
Debug.ShouldStop(2048);
__ref.getField(false,"_tabs").runMethod(true,"setTextColorCenter",exe_judging.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 46;BA.debugLine="exePanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
Debug.ShouldStop(8192);
__ref.getField(false,"_exepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tabs").getObject())),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 49;BA.debugLine="Dim Col As ColorDrawable";
Debug.ShouldStop(65536);
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("Col", _col);
 BA.debugLineNum = 51;BA.debugLine="Col.Initialize(Colors.Green, 0)";
Debug.ShouldStop(262144);
_col.runVoidMethod ("Initialize",(Object)(exe_judging.__c.getField(false,"Colors").getField(true,"Green")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 53;BA.debugLine="Line.Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_line").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 54;BA.debugLine="Line.Background = Col";
Debug.ShouldStop(2097152);
__ref.getField(false,"_line").runMethod(false,"setBackground",(_col.getObject()));
 BA.debugLineNum = 56;BA.debugLine="Line2.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_line2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 57;BA.debugLine="Line2.Background = Col";
Debug.ShouldStop(16777216);
__ref.getField(false,"_line2").runMethod(false,"setBackground",(_col.getObject()));
 BA.debugLineNum = 59;BA.debugLine="exePanel.AddView(Line, 0dip, 35dip, exePanel.Widt";
Debug.ShouldStop(67108864);
__ref.getField(false,"_exepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_line").getObject())),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))),(Object)(__ref.getField(false,"_exepanel").runMethod(true,"getWidth")),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 62;BA.debugLine="exePanel.AddView(Pager, 0dip, 35dip + 2dip, exePa";
Debug.ShouldStop(536870912);
__ref.getField(false,"_exepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pager").getObject())),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(__ref.getField(false,"_exepanel").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_exepanel").runMethod(true,"getHeight"),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "--",2, 1)));
 BA.debugLineNum = 64;BA.debugLine="exePanel.AddView(downPanel, 0, exePanel.Height -";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_exepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_downpanel").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_exepanel").runMethod(true,"getHeight"),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))}, "-",1, 1)),(Object)(__ref.getField(false,"_exepanel").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_exepanel").runMethod(true,"getHeight"),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "--",2, 1)));
 BA.debugLineNum = 65;BA.debugLine="exePanel.AddView(Line2, 0dip, exePanel.Height - (";
Debug.ShouldStop(1);
__ref.getField(false,"_exepanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_line2").getObject())),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_exepanel").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1))}, "-",1, 1)),(Object)(__ref.getField(false,"_exepanel").runMethod(true,"getWidth")),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 67;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
Debug.ShouldStop(4);
__ref.getField(false,"_downpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnready").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_downpanel").runMethod(true,"getWidth"),exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 33)))));
 BA.debugLineNum = 69;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
Debug.ShouldStop(16);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 70;BA.debugLine="label(0).Text = Main.translate.GetString(\"Exelaba";
Debug.ShouldStop(32);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence(exe_judging._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Exelabal0")))));
 BA.debugLineNum = 71;BA.debugLine="label(0).TextColor = Colors.White";
Debug.ShouldStop(64);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setTextColor",exe_judging.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 73;BA.debugLine="page(0).AddView(btnPoints(0), label(0).left + lab";
Debug.ShouldStop(256);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnpoints").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getWidth"),exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getTop")),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 74;BA.debugLine="btnPoints(0).Text = Main.translate.GetString(\"Che";
Debug.ShouldStop(512);
__ref.getField(false,"_btnpoints").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence(exe_judging._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Checkl0")))));
 BA.debugLineNum = 76;BA.debugLine="For i = 1 To 7";
Debug.ShouldStop(2048);
{
final int step26 = 1;
final int limit26 = 7;
_i = 1 ;
for (;(step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26) ;_i = ((int)(0 + _i + step26))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 77;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
Debug.ShouldStop(4096);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getTop"),__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getHeight"),exe_judging.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "++",2, 1)),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 78;BA.debugLine="label(i).Text = Main.translate.GetString(\"Exelab";
Debug.ShouldStop(8192);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(exe_judging._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Exelabal"),RemoteObject.createImmutable(_i))))));
 BA.debugLineNum = 79;BA.debugLine="label(i).TextColor = Colors.White";
Debug.ShouldStop(16384);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",exe_judging.__c.getField(false,"Colors").getField(true,"White"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 82;BA.debugLine="For i = 1 To 6";
Debug.ShouldStop(131072);
{
final int step31 = 1;
final int limit31 = 6;
_i = 1 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 83;BA.debugLine="page(0).AddView(btnPoints(i), label(i).left + la";
Debug.ShouldStop(262144);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnpoints").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 84;BA.debugLine="btnPoints(i).Text = Main.translate.GetString(\"ad";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnpoints").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(exe_judging._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("addPan"),RemoteObject.createImmutable(_i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 87;BA.debugLine="page(0).AddView(chekpointbox, label(7).left + lab";
Debug.ShouldStop(4194304);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(true,"getWidth"),exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(true,"getTop")),(Object)(exe_judging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(exe_judging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 88;BA.debugLine="chekpointbox.Text = Main.translate.GetString(\"add";
Debug.ShouldStop(8388608);
__ref.getField(false,"_chekpointbox").runMethod(true,"setText",BA.ObjectToCharSequence(exe_judging._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("addPan"),RemoteObject.createImmutable(_i))))));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("check_CheckedChange (exe_judging) ","exe_judging",2,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("check_checkedchange")) return __ref.runUserSub(false, "exe_judging","check_checkedchange", __ref, _checked);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 96;BA.debugLine="Private Sub check_CheckedChange(Checked As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="If Checked = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_checked,exe_judging.__c.getField(true,"True"))) { 
 BA.debugLineNum = 98;BA.debugLine="exeScore = exeScore + 0.1";
Debug.ShouldStop(2);
__ref.setField ("_exescore",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_exescore"),RemoteObject.createImmutable(0.1)}, "+",1, 0));
 BA.debugLineNum = 99;BA.debugLine="Log(exeScore)";
Debug.ShouldStop(4);
exe_judging.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_exescore"))));
 }else {
 BA.debugLineNum = 101;BA.debugLine="exeScore = exeScore - 0.1";
Debug.ShouldStop(16);
__ref.setField ("_exescore",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_exescore"),RemoteObject.createImmutable(0.1)}, "-",1, 0));
 };
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 5;BA.debugLine="Private page(1) As Panel";
exe_judging._page = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {1}, new Object[]{});__ref.setField("_page",exe_judging._page);
 //BA.debugLineNum = 6;BA.debugLine="Private label(8) As Label";
exe_judging._label = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {8}, new Object[]{});__ref.setField("_label",exe_judging._label);
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
 //BA.debugLineNum = 12;BA.debugLine="Private chekpointbox As CheckBox";
exe_judging._chekpointbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_chekpointbox",exe_judging._chekpointbox);
 //BA.debugLineNum = 13;BA.debugLine="Private btnPoints(7) As Button";
exe_judging._btnpoints = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {7}, new Object[]{});__ref.setField("_btnpoints",exe_judging._btnpoints);
 //BA.debugLineNum = 14;BA.debugLine="Public maxValue As Double = 10.00";
exe_judging._maxvalue = BA.numberCast(double.class, 10.00);__ref.setField("_maxvalue",exe_judging._maxvalue);
 //BA.debugLineNum = 15;BA.debugLine="Public exeScore As Double";
exe_judging._exescore = RemoteObject.createImmutable(0);__ref.setField("_exescore",exe_judging._exescore);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _finalexescore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("finalEXEscore (exe_judging) ","exe_judging",2,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("finalexescore")) return __ref.runUserSub(false, "exe_judging","finalexescore", __ref);
 BA.debugLineNum = 105;BA.debugLine="Public Sub finalEXEscore As Double";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="exeScore = maxValue - exeScore";
Debug.ShouldStop(512);
__ref.setField ("_exescore",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue"),__ref.getField(true,"_exescore")}, "-",1, 0));
 BA.debugLineNum = 107;BA.debugLine="Log(\"EXESCORE:\"&exeScore)";
Debug.ShouldStop(1024);
exe_judging.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("EXESCORE:"),__ref.getField(true,"_exescore"))));
 BA.debugLineNum = 108;BA.debugLine="Return exeScore";
Debug.ShouldStop(2048);
if (true) return __ref.getField(true,"_exescore");
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (exe_judging) ","exe_judging",2,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "exe_judging","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
int _i = 0;
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="exePanel.Initialize(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_exepanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="page(0).Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 22;BA.debugLine="For i = 0 To 7";
Debug.ShouldStop(2097152);
{
final int step3 = 1;
final int limit3 = 7;
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 23;BA.debugLine="label(i).Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 25;BA.debugLine="chekpointbox.Initialize(\"check\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_chekpointbox").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("check")));
 BA.debugLineNum = 26;BA.debugLine="For i = 0 To 6";
Debug.ShouldStop(33554432);
{
final int step7 = 1;
final int limit7 = 6;
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 27;BA.debugLine="btnPoints(i).Initialize(\"addPan\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btnpoints").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("addPan")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 29;BA.debugLine="downPanel.Initialize(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_downpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 30;BA.debugLine="btnready.Initialize(\"ready\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btnready").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ready")));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("ready_Click (exe_judging) ","exe_judging",2,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("ready_click")) return __ref.runUserSub(false, "exe_judging","ready_click", __ref);
 BA.debugLineNum = 111;BA.debugLine="Private Sub ready_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="CallSub(Main, \"FinalClick\")";
Debug.ShouldStop(32768);
exe_judging.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((exe_judging._main.getObject())),(Object)(RemoteObject.createImmutable("FinalClick")));
 BA.debugLineNum = 113;BA.debugLine="finalEXEscore";
Debug.ShouldStop(65536);
__ref.runClassMethod (agg.agg.exe_judging.class, "_finalexescore");
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}