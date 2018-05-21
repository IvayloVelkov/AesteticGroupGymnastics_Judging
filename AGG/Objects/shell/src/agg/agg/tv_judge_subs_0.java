package agg.agg;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tv_judge_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("asView (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "tv_judge","asview", __ref);
 BA.debugLineNum = 136;BA.debugLine="Public Sub asView As Panel";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Return tvPanel";
Debug.ShouldStop(256);
if (true) return __ref.getField(false,"_tvpanel");
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("BuildUi (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "tv_judge","buildui", __ref);
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
int _i = 0;
 BA.debugLineNum = 33;BA.debugLine="Public Sub BuildUi";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Container.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_container").runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 36;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
Debug.ShouldStop(8);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AvPage0")))));
 BA.debugLineNum = 37;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
Debug.ShouldStop(16);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).getObject())),(Object)(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AvPage1")))));
 BA.debugLineNum = 39;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
Debug.ShouldStop(64);
__ref.getField(false,"_pager").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_container")),(Object)(RemoteObject.createImmutable("MPager")));
 BA.debugLineNum = 41;BA.debugLine="Tabs.Initialize(Pager)";
Debug.ShouldStop(256);
__ref.getField(false,"_tabs").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_pager")));
 BA.debugLineNum = 42;BA.debugLine="Tabs.LineHeight = 5dip";
Debug.ShouldStop(512);
__ref.getField(false,"_tabs").runMethod(true,"setLineHeight",tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 43;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
Debug.ShouldStop(1024);
__ref.getField(false,"_tabs").runMethod(true,"setLineColorCenter",tv_judge.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 44;BA.debugLine="Tabs.TextColor = Colors.Gray";
Debug.ShouldStop(2048);
__ref.getField(false,"_tabs").runMethod(true,"setTextColor",tv_judge.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 45;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
Debug.ShouldStop(4096);
__ref.getField(false,"_tabs").runMethod(true,"setTextColorCenter",tv_judge.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 47;BA.debugLine="tvPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_tvpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tabs").getObject())),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 50;BA.debugLine="Dim Col As ColorDrawable";
Debug.ShouldStop(131072);
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("Col", _col);
 BA.debugLineNum = 52;BA.debugLine="Col.Initialize(Colors.Green, 0)";
Debug.ShouldStop(524288);
_col.runVoidMethod ("Initialize",(Object)(tv_judge.__c.getField(false,"Colors").getField(true,"Green")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 54;BA.debugLine="Line.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_line").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 55;BA.debugLine="Line.Background = Col";
Debug.ShouldStop(4194304);
__ref.getField(false,"_line").runMethod(false,"setBackground",(_col.getObject()));
 BA.debugLineNum = 57;BA.debugLine="Line2.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_line2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 58;BA.debugLine="Line2.Background = Col";
Debug.ShouldStop(33554432);
__ref.getField(false,"_line2").runMethod(false,"setBackground",(_col.getObject()));
 BA.debugLineNum = 60;BA.debugLine="tvPanel.AddView(Line, 0dip, 35dip, tvPanel.Width,";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tvpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_line").getObject())),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))),(Object)(__ref.getField(false,"_tvpanel").runMethod(true,"getWidth")),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 63;BA.debugLine="tvPanel.AddView(Pager, 0dip, 35dip + 2dip, tvPane";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tvpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pager").getObject())),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(__ref.getField(false,"_tvpanel").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tvpanel").runMethod(true,"getHeight"),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "--",2, 1)));
 BA.debugLineNum = 65;BA.debugLine="tvPanel.AddView(downPanel, 0, tvPanel.Height - 35";
Debug.ShouldStop(1);
__ref.getField(false,"_tvpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_downpanel").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tvpanel").runMethod(true,"getHeight"),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))}, "-",1, 1)),(Object)(__ref.getField(false,"_tvpanel").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tvpanel").runMethod(true,"getHeight"),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "--",2, 1)));
 BA.debugLineNum = 66;BA.debugLine="tvPanel.AddView(Line2, 0dip, tvPanel.Height - (35";
Debug.ShouldStop(2);
__ref.getField(false,"_tvpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_line2").getObject())),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tvpanel").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1))}, "-",1, 1)),(Object)(__ref.getField(false,"_tvpanel").runMethod(true,"getWidth")),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 68;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
Debug.ShouldStop(8);
__ref.getField(false,"_downpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnready").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_downpanel").runMethod(true,"getWidth"),tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 33)))));
 BA.debugLineNum = 71;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
Debug.ShouldStop(64);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 72;BA.debugLine="label(0).Text = Main.translate.GetString(\"TVlabel";
Debug.ShouldStop(128);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("TVlabel0")))));
 BA.debugLineNum = 73;BA.debugLine="label(0).TextColor = Colors.White";
Debug.ShouldStop(256);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setTextColor",tv_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 75;BA.debugLine="page(0).AddView(chekpointbox(0), label(0).left +";
Debug.ShouldStop(1024);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 76;BA.debugLine="chekpointbox(0).Text = Main.translate.GetString(\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Check0")))));
 BA.debugLineNum = 77;BA.debugLine="page(0).AddView(chekpointbox(13), chekpointbox(0)";
Debug.ShouldStop(4096);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 13)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 78;BA.debugLine="chekpointbox(13).Text = Main.translate.GetString(";
Debug.ShouldStop(8192);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 13)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Check14")))));
 BA.debugLineNum = 81;BA.debugLine="For i = 1 To 5";
Debug.ShouldStop(65536);
{
final int step29 = 1;
final int limit29 = 5;
_i = 1 ;
for (;(step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29) ;_i = ((int)(0 + _i + step29))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 82;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
Debug.ShouldStop(131072);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getTop"),__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getHeight"),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "++",2, 1)),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 83;BA.debugLine="label(i).Text = Main.translate.GetString(\"TVlabe";
Debug.ShouldStop(262144);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("TVlabel"),RemoteObject.createImmutable(_i))))));
 BA.debugLineNum = 84;BA.debugLine="label(i).TextColor = Colors.White";
Debug.ShouldStop(524288);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",tv_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 85;BA.debugLine="page(0).AddView(chekpointbox(i), label(i).left +";
Debug.ShouldStop(1048576);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 86;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
Debug.ShouldStop(2097152);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Check"),RemoteObject.createImmutable(_i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 89;BA.debugLine="page(0).AddView(chekpointbox(6), chekpointbox(5).";
Debug.ShouldStop(16777216);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 6)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 5)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 5)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 5)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 90;BA.debugLine="chekpointbox(7).Text = Main.translate.GetString(\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Check6")))));
 BA.debugLineNum = 91;BA.debugLine="page(0).AddView(chekpointbox(7), chekpointbox(6).";
Debug.ShouldStop(67108864);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 7)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 92;BA.debugLine="chekpointbox(7).Text = Main.translate.GetString(\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Check12")))));
 BA.debugLineNum = 94;BA.debugLine="For i = 8 To 12";
Debug.ShouldStop(536870912);
{
final int step40 = 1;
final int limit40 = 12;
_i = 8 ;
for (;(step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40) ;_i = ((int)(0 + _i + step40))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 95;BA.debugLine="page(0).AddView(chekpointbox(i), chekpointbox(i";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(7)}, "-",1, 1)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(7)}, "-",1, 1)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(7)}, "-",1, 1)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 96;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Check"),RemoteObject.createImmutable(_i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 103;BA.debugLine="page(1).AddView(label(6), 2%x, 5%y, 50%x, 10%y)";
Debug.ShouldStop(64);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).getObject())),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 104;BA.debugLine="label(6).Text = Main.translate.GetString(\"TVlabel";
Debug.ShouldStop(128);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("TVlabel6")))));
 BA.debugLineNum = 105;BA.debugLine="label(6).TextColor = Colors.White";
Debug.ShouldStop(256);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"setTextColor",tv_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 107;BA.debugLine="page(1).AddView(chekpointbox(14), label(6).left +";
Debug.ShouldStop(1024);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 14)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 108;BA.debugLine="chekpointbox(14).Text = Main.translate.GetString(";
Debug.ShouldStop(2048);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 14)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Checkl6")))));
 BA.debugLineNum = 109;BA.debugLine="page(1).AddView(chekpointbox(15), chekpointbox(14";
Debug.ShouldStop(4096);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 15)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 14)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 14)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 14)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 110;BA.debugLine="chekpointbox(15).Text = Main.translate.GetString(";
Debug.ShouldStop(8192);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 15)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Checkl6")))));
 BA.debugLineNum = 112;BA.debugLine="For i = 7 To 11";
Debug.ShouldStop(32768);
{
final int step51 = 1;
final int limit51 = 11;
_i = 7 ;
for (;(step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51) ;_i = ((int)(0 + _i + step51))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 113;BA.debugLine="page(1).AddView(label(i), 2%x, label(i - 1).Top";
Debug.ShouldStop(65536);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getTop"),__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getHeight"),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "++",2, 1)),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 114;BA.debugLine="label(i).Text = Main.translate.GetString(\"TVlabe";
Debug.ShouldStop(131072);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("TVlabel"),RemoteObject.createImmutable(_i))))));
 BA.debugLineNum = 115;BA.debugLine="label(i).TextColor = Colors.White";
Debug.ShouldStop(262144);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",tv_judge.__c.getField(false,"Colors").getField(true,"White"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 118;BA.debugLine="For i = 16 To 20";
Debug.ShouldStop(2097152);
{
final int step56 = 1;
final int limit56 = 20;
_i = 16 ;
for (;(step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56) ;_i = ((int)(0 + _i + step56))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 119;BA.debugLine="page(1).AddView(chekpointbox(i),label(i - 9).lef";
Debug.ShouldStop(4194304);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(9)}, "-",1, 1)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(9)}, "-",1, 1)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(9)}, "-",1, 1)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 120;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
Debug.ShouldStop(8388608);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Check"),RemoteObject.createImmutable(_i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 123;BA.debugLine="For i = 21 To 25";
Debug.ShouldStop(67108864);
{
final int step60 = 1;
final int limit60 = 25;
_i = 21 ;
for (;(step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60) ;_i = ((int)(0 + _i + step60))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 124;BA.debugLine="page(1).AddView(chekpointbox(i), chekpointbox(i";
Debug.ShouldStop(134217728);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(5)}, "-",1, 1)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(5)}, "-",1, 1)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(5)}, "-",1, 1)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 125;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
Debug.ShouldStop(268435456);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Check"),RemoteObject.createImmutable(_i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
 //BA.debugLineNum = 2;BA.debugLine="Public tvPanel As Panel";
tv_judge._tvpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_tvpanel",tv_judge._tvpanel);
 //BA.debugLineNum = 3;BA.debugLine="Public Pager As AHViewPager";
tv_judge._pager = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPager");__ref.setField("_pager",tv_judge._pager);
 //BA.debugLineNum = 4;BA.debugLine="Public Container As AHPageContainer";
tv_judge._container = RemoteObject.createNew ("de.amberhome.viewpager.AHPageContainer");__ref.setField("_container",tv_judge._container);
 //BA.debugLineNum = 5;BA.debugLine="Private page(2) As Panel";
tv_judge._page = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {2}, new Object[]{});__ref.setField("_page",tv_judge._page);
 //BA.debugLineNum = 6;BA.debugLine="Private label(12) As Label";
tv_judge._label = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {12}, new Object[]{});__ref.setField("_label",tv_judge._label);
 //BA.debugLineNum = 7;BA.debugLine="Dim Tabs As AHViewPagerTabs";
tv_judge._tabs = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPagerTabs");__ref.setField("_tabs",tv_judge._tabs);
 //BA.debugLineNum = 8;BA.debugLine="Dim Line As Panel";
tv_judge._line = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_line",tv_judge._line);
 //BA.debugLineNum = 9;BA.debugLine="Dim Line2 As Panel";
tv_judge._line2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_line2",tv_judge._line2);
 //BA.debugLineNum = 10;BA.debugLine="Dim downPanel As Panel";
tv_judge._downpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_downpanel",tv_judge._downpanel);
 //BA.debugLineNum = 11;BA.debugLine="Dim btnready As Button";
tv_judge._btnready = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnready",tv_judge._btnready);
 //BA.debugLineNum = 12;BA.debugLine="Private chekpointbox(30) As CheckBox";
tv_judge._chekpointbox = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper", new int[] {30}, new Object[]{});__ref.setField("_chekpointbox",tv_judge._chekpointbox);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "tv_judge","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
int _i = 0;
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="tvPanel.Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_tvpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 19;BA.debugLine="For i = 0 To 1";
Debug.ShouldStop(262144);
{
final int step2 = 1;
final int limit2 = 1;
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 20;BA.debugLine="page(i).Initialize(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 22;BA.debugLine="For i = 0 To 11";
Debug.ShouldStop(2097152);
{
final int step5 = 1;
final int limit5 = 11;
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 23;BA.debugLine="label(i).Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 25;BA.debugLine="For i = 0 To 29";
Debug.ShouldStop(16777216);
{
final int step8 = 1;
final int limit8 = 29;
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 26;BA.debugLine="chekpointbox(i).Initialize(\"check\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("check")));
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
		Debug.PushSubsStack("ready_Click (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("ready_click")) return __ref.runUserSub(false, "tv_judge","ready_click", __ref);
 BA.debugLineNum = 132;BA.debugLine="Private Sub ready_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="CallSub(Main, \"FinalClick\")";
Debug.ShouldStop(16);
tv_judge.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((tv_judge._main.getObject())),(Object)(RemoteObject.createImmutable("FinalClick")));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}