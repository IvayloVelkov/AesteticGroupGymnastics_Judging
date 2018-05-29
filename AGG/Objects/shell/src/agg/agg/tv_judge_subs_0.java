package agg.agg;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tv_judge_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("asView (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "tv_judge","asview", __ref);
 BA.debugLineNum = 196;BA.debugLine="Public Sub asView As Panel";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="Return tvPanel";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_tvpanel");
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("BuildUi (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "tv_judge","buildui", __ref);
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
int _i = 0;
 BA.debugLineNum = 41;BA.debugLine="Public Sub BuildUi";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Container.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_container").runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 44;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
Debug.ShouldStop(2048);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("TvPage0")))));
 BA.debugLineNum = 45;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
Debug.ShouldStop(4096);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).getObject())),(Object)(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("TvPage1")))));
 BA.debugLineNum = 47;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_pager").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_container")),(Object)(RemoteObject.createImmutable("MPager")));
 BA.debugLineNum = 49;BA.debugLine="Tabs.Initialize(Pager)";
Debug.ShouldStop(65536);
__ref.getField(false,"_tabs").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_pager")));
 BA.debugLineNum = 50;BA.debugLine="Tabs.LineHeight = 5dip";
Debug.ShouldStop(131072);
__ref.getField(false,"_tabs").runMethod(true,"setLineHeight",tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 51;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
Debug.ShouldStop(262144);
__ref.getField(false,"_tabs").runMethod(true,"setLineColorCenter",tv_judge.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 52;BA.debugLine="Tabs.TextColor = Colors.Gray";
Debug.ShouldStop(524288);
__ref.getField(false,"_tabs").runMethod(true,"setTextColor",tv_judge.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 53;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tabs").runMethod(true,"setTextColorCenter",tv_judge.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 55;BA.debugLine="tvPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tvpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tabs").getObject())),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 58;BA.debugLine="Dim Col As ColorDrawable";
Debug.ShouldStop(33554432);
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("Col", _col);
 BA.debugLineNum = 60;BA.debugLine="Col.Initialize(Colors.Green, 0)";
Debug.ShouldStop(134217728);
_col.runVoidMethod ("Initialize",(Object)(tv_judge.__c.getField(false,"Colors").getField(true,"Green")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 62;BA.debugLine="Line.Initialize(\"\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_line").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 63;BA.debugLine="Line.Background = Col";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_line").runMethod(false,"setBackground",(_col.getObject()));
 BA.debugLineNum = 65;BA.debugLine="Line2.Initialize(\"\")";
Debug.ShouldStop(1);
__ref.getField(false,"_line2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 66;BA.debugLine="Line2.Background = Col";
Debug.ShouldStop(2);
__ref.getField(false,"_line2").runMethod(false,"setBackground",(_col.getObject()));
 BA.debugLineNum = 68;BA.debugLine="tvPanel.AddView(Line, 0dip, 35dip, tvPanel.Width,";
Debug.ShouldStop(8);
__ref.getField(false,"_tvpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_line").getObject())),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))),(Object)(__ref.getField(false,"_tvpanel").runMethod(true,"getWidth")),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 71;BA.debugLine="tvPanel.AddView(Pager, 0dip, 35dip + 2dip, tvPane";
Debug.ShouldStop(64);
__ref.getField(false,"_tvpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pager").getObject())),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(__ref.getField(false,"_tvpanel").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tvpanel").runMethod(true,"getHeight"),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "--",2, 1)));
 BA.debugLineNum = 73;BA.debugLine="tvPanel.AddView(downPanel, 0, tvPanel.Height - 35";
Debug.ShouldStop(256);
__ref.getField(false,"_tvpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_downpanel").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tvpanel").runMethod(true,"getHeight"),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))}, "-",1, 1)),(Object)(__ref.getField(false,"_tvpanel").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tvpanel").runMethod(true,"getHeight"),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "--",2, 1)));
 BA.debugLineNum = 74;BA.debugLine="tvPanel.AddView(Line2, 0dip, tvPanel.Height - (35";
Debug.ShouldStop(512);
__ref.getField(false,"_tvpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_line2").getObject())),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tvpanel").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1))}, "-",1, 1)),(Object)(__ref.getField(false,"_tvpanel").runMethod(true,"getWidth")),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 76;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
Debug.ShouldStop(2048);
__ref.getField(false,"_downpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnready").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_downpanel").runMethod(true,"getWidth"),tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 33)))));
 BA.debugLineNum = 79;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 80;BA.debugLine="label(0).Text = Main.translate.GetString(\"TVlabel";
Debug.ShouldStop(32768);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("TVlabel0")))));
 BA.debugLineNum = 81;BA.debugLine="label(0).TextColor = Colors.White";
Debug.ShouldStop(65536);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setTextColor",tv_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 83;BA.debugLine="page(0).AddView(chekpointbox1(0), label(0).left +";
Debug.ShouldStop(262144);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 85;BA.debugLine="chekpointbox1(0).Text = \"001\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence("001"));
 BA.debugLineNum = 86;BA.debugLine="chekpointbox1(0).Tag = 0";
Debug.ShouldStop(2097152);
__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 87;BA.debugLine="page(0).AddView(chekpointbox2(0), chekpointbox1(0";
Debug.ShouldStop(4194304);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 89;BA.debugLine="chekpointbox2(0).Tag = 0";
Debug.ShouldStop(16777216);
__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 90;BA.debugLine="chekpointbox2(0).Text = \"002\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence("002"));
 BA.debugLineNum = 92;BA.debugLine="For i = 1 To 5";
Debug.ShouldStop(134217728);
{
final int step31 = 1;
final int limit31 = 5;
_i = 1 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 93;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
Debug.ShouldStop(268435456);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getTop"),__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getHeight"),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "++",2, 1)),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 94;BA.debugLine="label(i).Text = Main.translate.GetString(\"TVlabe";
Debug.ShouldStop(536870912);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("TVlabel"),RemoteObject.createImmutable(_i))))));
 BA.debugLineNum = 95;BA.debugLine="label(i).TextColor = Colors.White";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",tv_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 97;BA.debugLine="page(0).AddView(chekpointbox1(i), label(i).left";
Debug.ShouldStop(1);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 99;BA.debugLine="chekpointbox1(i).Text = i & \"1\"";
Debug.ShouldStop(4);
__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(_i),RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 100;BA.debugLine="chekpointbox1(i).Tag = i";
Debug.ShouldStop(8);
__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 102;BA.debugLine="page(0).AddView(chekpointbox2(i), chekpointbox1(";
Debug.ShouldStop(32);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 104;BA.debugLine="chekpointbox2(i).Text = i & \"2\"";
Debug.ShouldStop(128);
__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(_i),RemoteObject.createImmutable("2"))));
 BA.debugLineNum = 105;BA.debugLine="chekpointbox2(i).Tag = i";
Debug.ShouldStop(256);
__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 110;BA.debugLine="page(1).AddView(label(6), 2%x, 5%y, 50%x, 10%y)";
Debug.ShouldStop(8192);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).getObject())),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 111;BA.debugLine="label(6).Text = Main.translate.GetString(\"TVlabel";
Debug.ShouldStop(16384);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("TVlabel6")))));
 BA.debugLineNum = 112;BA.debugLine="label(6).TextColor = Colors.White";
Debug.ShouldStop(32768);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"setTextColor",tv_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 114;BA.debugLine="page(1).AddView(chekpointbox1(6), label(6).left +";
Debug.ShouldStop(131072);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 6)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 116;BA.debugLine="chekpointbox1(6).Text = \"001\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"setText",BA.ObjectToCharSequence("001"));
 BA.debugLineNum = 117;BA.debugLine="chekpointbox1(6).Tag = 6";
Debug.ShouldStop(1048576);
__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(false,"setTag",RemoteObject.createImmutable((6)));
 BA.debugLineNum = 119;BA.debugLine="page(1).AddView(chekpointbox2(6), chekpointbox1(6";
Debug.ShouldStop(4194304);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, 6)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 121;BA.debugLine="chekpointbox2(6).Text = \"002\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"setText",BA.ObjectToCharSequence("002"));
 BA.debugLineNum = 122;BA.debugLine="chekpointbox2(6).Tag = 6";
Debug.ShouldStop(33554432);
__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(false,"setTag",RemoteObject.createImmutable((6)));
 BA.debugLineNum = 125;BA.debugLine="page(1).AddView(chekpointbox3(6), chekpointbox2(6";
Debug.ShouldStop(268435456);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox3").getArrayElement(false,BA.numberCast(int.class, 6)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 127;BA.debugLine="chekpointbox3(6).Text = \"003\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_chekpointbox3").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(true,"setText",BA.ObjectToCharSequence("003"));
 BA.debugLineNum = 128;BA.debugLine="chekpointbox3(6).Tag = 6";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_chekpointbox3").getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(false,"setTag",RemoteObject.createImmutable((6)));
 BA.debugLineNum = 131;BA.debugLine="For i = 7 To 11";
Debug.ShouldStop(4);
{
final int step54 = 1;
final int limit54 = 11;
_i = 7 ;
for (;(step54 > 0 && _i <= limit54) || (step54 < 0 && _i >= limit54) ;_i = ((int)(0 + _i + step54))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 132;BA.debugLine="page(1).AddView(label(i), 2%x, label(i - 1).Top";
Debug.ShouldStop(8);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getTop"),__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getHeight"),tv_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "++",2, 1)),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 133;BA.debugLine="label(i).Text = Main.translate.GetString(\"TVlabe";
Debug.ShouldStop(16);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(tv_judge._main._translate.runClassMethod (agg.agg.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("TVlabel"),RemoteObject.createImmutable(_i))))));
 BA.debugLineNum = 134;BA.debugLine="label(i).TextColor = Colors.White";
Debug.ShouldStop(32);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",tv_judge.__c.getField(false,"Colors").getField(true,"White"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 137;BA.debugLine="For i = 7 To 11";
Debug.ShouldStop(256);
{
final int step59 = 1;
final int limit59 = 11;
_i = 7 ;
for (;(step59 > 0 && _i <= limit59) || (step59 < 0 && _i >= limit59) ;_i = ((int)(0 + _i + step59))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 138;BA.debugLine="page(1).AddView(chekpointbox1(i),label(i).left +";
Debug.ShouldStop(512);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 140;BA.debugLine="chekpointbox1(i).Text = i & \"1\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(_i),RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 141;BA.debugLine="chekpointbox1(i).Tag = i";
Debug.ShouldStop(4096);
__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 143;BA.debugLine="page(1).AddView(chekpointbox2(i),chekpointbox1(i";
Debug.ShouldStop(16384);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 145;BA.debugLine="chekpointbox2(i).Text = i & \"2\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(_i),RemoteObject.createImmutable("2"))));
 BA.debugLineNum = 146;BA.debugLine="chekpointbox2(i).Tag = i";
Debug.ShouldStop(131072);
__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 148;BA.debugLine="page(1).AddView(chekpointbox3(i), chekpointbox2(";
Debug.ShouldStop(524288);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox3").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(tv_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(tv_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 150;BA.debugLine="chekpointbox3(i).Text = i & \"3\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_chekpointbox3").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(_i),RemoteObject.createImmutable("3"))));
 BA.debugLineNum = 151;BA.debugLine="chekpointbox3(i).Tag = i";
Debug.ShouldStop(4194304);
__ref.getField(false,"_chekpointbox3").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check1_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("check1_CheckedChange (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("check1_checkedchange")) return __ref.runUserSub(false, "tv_judge","check1_checkedchange", __ref, _checked);
RemoteObject _chek1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 157;BA.debugLine="Private Sub check1_CheckedChange(Checked As Boolea";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Private chek1 As CheckBox = Sender";
Debug.ShouldStop(536870912);
_chek1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_chek1.setObject(tv_judge.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("chek1", _chek1);
 BA.debugLineNum = 159;BA.debugLine="chek1 = Sender";
Debug.ShouldStop(1073741824);
_chek1.setObject(tv_judge.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 160;BA.debugLine="If chek1.Checked = True Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_chek1.runMethod(true,"getChecked"),tv_judge.__c.getField(true,"True"))) { 
 BA.debugLineNum = 161;BA.debugLine="tvScore = tvScore + 0.1";
Debug.ShouldStop(1);
__ref.setField ("_tvscore",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tvscore"),RemoteObject.createImmutable(0.1)}, "+",1, 0));
 }else {
 BA.debugLineNum = 163;BA.debugLine="tvScore = tvScore - 0.1";
Debug.ShouldStop(4);
__ref.setField ("_tvscore",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tvscore"),RemoteObject.createImmutable(0.1)}, "-",1, 0));
 };
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check2_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("check2_CheckedChange (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("check2_checkedchange")) return __ref.runUserSub(false, "tv_judge","check2_checkedchange", __ref, _checked);
RemoteObject _chek2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 167;BA.debugLine="Private Sub check2_CheckedChange(Checked As Boolea";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="Private chek2 As CheckBox";
Debug.ShouldStop(128);
_chek2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chek2", _chek2);
 BA.debugLineNum = 169;BA.debugLine="chek2 = Sender";
Debug.ShouldStop(256);
_chek2.setObject(tv_judge.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 170;BA.debugLine="If chek2.Checked = True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_chek2.runMethod(true,"getChecked"),tv_judge.__c.getField(true,"True"))) { 
 BA.debugLineNum = 171;BA.debugLine="tvScore = tvScore + 0.2";
Debug.ShouldStop(1024);
__ref.setField ("_tvscore",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tvscore"),RemoteObject.createImmutable(0.2)}, "+",1, 0));
 }else {
 BA.debugLineNum = 173;BA.debugLine="tvScore = tvScore - 0.2";
Debug.ShouldStop(4096);
__ref.setField ("_tvscore",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tvscore"),RemoteObject.createImmutable(0.2)}, "-",1, 0));
 };
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check3_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("check3_CheckedChange (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("check3_checkedchange")) return __ref.runUserSub(false, "tv_judge","check3_checkedchange", __ref, _checked);
RemoteObject _chek3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 177;BA.debugLine="Private Sub check3_CheckedChange(Checked As Boolea";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Private chek3 As CheckBox = Sender";
Debug.ShouldStop(131072);
_chek3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_chek3.setObject(tv_judge.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("chek3", _chek3);
 BA.debugLineNum = 179;BA.debugLine="chek3 = Sender";
Debug.ShouldStop(262144);
_chek3.setObject(tv_judge.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 180;BA.debugLine="If chek3.Checked = True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_chek3.runMethod(true,"getChecked"),tv_judge.__c.getField(true,"True"))) { 
 BA.debugLineNum = 181;BA.debugLine="tvScore = tvScore + 0.3";
Debug.ShouldStop(1048576);
__ref.setField ("_tvscore",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tvscore"),RemoteObject.createImmutable(0.3)}, "+",1, 0));
 }else {
 BA.debugLineNum = 183;BA.debugLine="tvScore = tvScore - 0.3";
Debug.ShouldStop(4194304);
__ref.setField ("_tvscore",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tvscore"),RemoteObject.createImmutable(0.3)}, "-",1, 0));
 };
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
 //BA.debugLineNum = 12;BA.debugLine="Private chekpointbox1(12) As CheckBox";
tv_judge._chekpointbox1 = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper", new int[] {12}, new Object[]{});__ref.setField("_chekpointbox1",tv_judge._chekpointbox1);
 //BA.debugLineNum = 13;BA.debugLine="Private chekpointbox2(12) As CheckBox";
tv_judge._chekpointbox2 = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper", new int[] {12}, new Object[]{});__ref.setField("_chekpointbox2",tv_judge._chekpointbox2);
 //BA.debugLineNum = 14;BA.debugLine="Private chekpointbox3(12) As CheckBox";
tv_judge._chekpointbox3 = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper", new int[] {12}, new Object[]{});__ref.setField("_chekpointbox3",tv_judge._chekpointbox3);
 //BA.debugLineNum = 15;BA.debugLine="Public tvScore As Double";
tv_judge._tvscore = RemoteObject.createImmutable(0);__ref.setField("_tvscore",tv_judge._tvscore);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _finaltvscore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("finalTVscore (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("finaltvscore")) return __ref.runUserSub(false, "tv_judge","finaltvscore", __ref);
 BA.debugLineNum = 186;BA.debugLine="Public Sub finalTVscore As Double";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="Log(\"AVSCORE:\"&tvScore)";
Debug.ShouldStop(67108864);
tv_judge.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("AVSCORE:"),__ref.getField(true,"_tvscore"))));
 BA.debugLineNum = 188;BA.debugLine="Return tvScore";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(true,"_tvscore");
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Initialize (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "tv_judge","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
int _i = 0;
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="tvPanel.Initialize(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_tvpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="For i = 0 To 1";
Debug.ShouldStop(1048576);
{
final int step2 = 1;
final int limit2 = 1;
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 22;BA.debugLine="page(i).Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 24;BA.debugLine="For i = 0 To 11";
Debug.ShouldStop(8388608);
{
final int step5 = 1;
final int limit5 = 11;
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 25;BA.debugLine="label(i).Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 27;BA.debugLine="For i = 0 To 11";
Debug.ShouldStop(67108864);
{
final int step8 = 1;
final int limit8 = 11;
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 28;BA.debugLine="chekpointbox1(i).Initialize(\"check1\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_chekpointbox1").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("check1")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 30;BA.debugLine="For i = 0 To 11";
Debug.ShouldStop(536870912);
{
final int step11 = 1;
final int limit11 = 11;
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 31;BA.debugLine="chekpointbox2(i).Initialize(\"check2\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_chekpointbox2").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("check2")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 33;BA.debugLine="For i = 0 To 11";
Debug.ShouldStop(1);
{
final int step14 = 1;
final int limit14 = 11;
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 34;BA.debugLine="chekpointbox3(i).Initialize(\"check3\")";
Debug.ShouldStop(2);
__ref.getField(false,"_chekpointbox3").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("check3")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 37;BA.debugLine="downPanel.Initialize(\"\")";
Debug.ShouldStop(16);
__ref.getField(false,"_downpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 38;BA.debugLine="btnready.Initialize(\"ready\")";
Debug.ShouldStop(32);
__ref.getField(false,"_btnready").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ready")));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("ready_Click (tv_judge) ","tv_judge",1,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("ready_click")) return __ref.runUserSub(false, "tv_judge","ready_click", __ref);
 BA.debugLineNum = 191;BA.debugLine="Private Sub ready_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="CallSub(Main, \"FinalClick\")";
Debug.ShouldStop(-2147483648);
tv_judge.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((tv_judge._main.getObject())),(Object)(RemoteObject.createImmutable("FinalClick")));
 BA.debugLineNum = 193;BA.debugLine="finalTVscore";
Debug.ShouldStop(1);
__ref.runClassMethod (agg.agg.tv_judge.class, "_finaltvscore");
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}