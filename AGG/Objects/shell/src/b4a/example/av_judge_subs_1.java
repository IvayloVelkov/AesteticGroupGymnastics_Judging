package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class av_judge_subs_1 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("asView (av_judge) ","av_judge",3,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "av_judge","asview", __ref);
 BA.debugLineNum = 141;BA.debugLine="Public Sub asView As Panel";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Return avPanel";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_avpanel");
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("BuildUi (av_judge) ","av_judge",3,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "av_judge","buildui", __ref);
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lblheigh = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 31;BA.debugLine="Public Sub BuildUi";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Container.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_container").runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="Container.AddPage(page(0), Main.translate.GetStri";
Debug.ShouldStop(2);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AvPage0")))));
 BA.debugLineNum = 35;BA.debugLine="Container.AddPage(page(1), Main.translate.GetStri";
Debug.ShouldStop(4);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).getObject())),(Object)(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AvPage1")))));
 BA.debugLineNum = 36;BA.debugLine="Container.AddPage(page(2), Main.translate.GetStri";
Debug.ShouldStop(8);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 2)).getObject())),(Object)(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AvPage2")))));
 BA.debugLineNum = 37;BA.debugLine="Container.AddPage(page(3), Main.translate.GetStri";
Debug.ShouldStop(16);
__ref.getField(false,"_container").runVoidMethod ("AddPage",(Object)((__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 3)).getObject())),(Object)(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AvPage3")))));
 BA.debugLineNum = 39;BA.debugLine="Pager.Initialize(Container, \"MPager\")";
Debug.ShouldStop(64);
__ref.getField(false,"_pager").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_container")),(Object)(RemoteObject.createImmutable("MPager")));
 BA.debugLineNum = 41;BA.debugLine="Tabs.Initialize(Pager)";
Debug.ShouldStop(256);
__ref.getField(false,"_tabs").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_pager")));
 BA.debugLineNum = 42;BA.debugLine="Tabs.LineHeight = 5dip";
Debug.ShouldStop(512);
__ref.getField(false,"_tabs").runMethod(true,"setLineHeight",av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 43;BA.debugLine="Tabs.LineColorCenter = Colors.Red";
Debug.ShouldStop(1024);
__ref.getField(false,"_tabs").runMethod(true,"setLineColorCenter",av_judge.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 44;BA.debugLine="Tabs.TextColor = Colors.Gray";
Debug.ShouldStop(2048);
__ref.getField(false,"_tabs").runMethod(true,"setTextColor",av_judge.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 45;BA.debugLine="Tabs.TextColorCenter = Colors.Yellow";
Debug.ShouldStop(4096);
__ref.getField(false,"_tabs").runMethod(true,"setTextColorCenter",av_judge.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 47;BA.debugLine="avPanel.AddView(Tabs, 0dip, 0dip, 100%x, 100%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_avpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tabs").getObject())),(Object)(av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 50;BA.debugLine="Dim Col As ColorDrawable";
Debug.ShouldStop(131072);
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("Col", _col);
 BA.debugLineNum = 52;BA.debugLine="Col.Initialize(Colors.Green, 0)";
Debug.ShouldStop(524288);
_col.runVoidMethod ("Initialize",(Object)(av_judge.__c.getField(false,"Colors").getField(true,"Green")),(Object)(BA.numberCast(int.class, 0)));
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
 BA.debugLineNum = 60;BA.debugLine="avPanel.AddView(Line, 0dip, 35dip, avPanel.Width,";
Debug.ShouldStop(134217728);
__ref.getField(false,"_avpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_line").getObject())),(Object)(av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))),(Object)(__ref.getField(false,"_avpanel").runMethod(true,"getWidth")),(Object)(av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 63;BA.debugLine="avPanel.AddView(Pager, 0dip, 35dip + 2dip, avPane";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_avpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pager").getObject())),(Object)(av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(__ref.getField(false,"_avpanel").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_avpanel").runMethod(true,"getHeight"),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "--",2, 1)));
 BA.debugLineNum = 65;BA.debugLine="avPanel.AddView(downPanel, 0, avPanel.Height - 35";
Debug.ShouldStop(1);
__ref.getField(false,"_avpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_downpanel").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_avpanel").runMethod(true,"getHeight"),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))}, "-",1, 1)),(Object)(__ref.getField(false,"_avpanel").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_avpanel").runMethod(true,"getHeight"),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "--",2, 1)));
 BA.debugLineNum = 66;BA.debugLine="avPanel.AddView(Line2, 0dip, avPanel.Height - (35";
Debug.ShouldStop(2);
__ref.getField(false,"_avpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_line2").getObject())),(Object)(av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_avpanel").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1))}, "-",1, 1)),(Object)(__ref.getField(false,"_avpanel").runMethod(true,"getWidth")),(Object)(av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 68;BA.debugLine="downPanel.AddView(btnready, downPanel.Width - 12%";
Debug.ShouldStop(8);
__ref.getField(false,"_downpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnready").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_downpanel").runMethod(true,"getWidth"),av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 33)))));
 BA.debugLineNum = 70;BA.debugLine="Dim lblHeigh As Int = (avPanel.Height - downPanel";
Debug.ShouldStop(32);
_lblheigh = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_avpanel").runMethod(true,"getHeight"),__ref.getField(false,"_downpanel").runMethod(true,"getHeight")}, "-",1, 1)),RemoteObject.createImmutable(7)}, "/",0, 0));Debug.locals.put("lblHeigh", _lblheigh);Debug.locals.put("lblHeigh", _lblheigh);
 BA.debugLineNum = 71;BA.debugLine="Log(lblHeigh)";
Debug.ShouldStop(64);
av_judge.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_lblheigh)));
 BA.debugLineNum = 72;BA.debugLine="page(0).AddView(label(0), 2%x, 5%y, 50%x, 10%y)";
Debug.ShouldStop(128);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 73;BA.debugLine="label(0).Text = Main.translate.GetString(\"AVlabal";
Debug.ShouldStop(256);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AVlabal0")))));
 BA.debugLineNum = 74;BA.debugLine="label(0).TextColor = Colors.White";
Debug.ShouldStop(512);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setTextColor",av_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 76;BA.debugLine="page(0).AddView(chekpointbox(0), label(0).left +";
Debug.ShouldStop(2048);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getWidth"),av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"getTop")),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 77;BA.debugLine="chekpointbox(0).Text = Main.translate.GetString(\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Checkl0")))));
 BA.debugLineNum = 80;BA.debugLine="For i = 1 To 7";
Debug.ShouldStop(32768);
{
final int step31 = 1;
final int limit31 = 7;
_i = 1 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 81;BA.debugLine="page(0).AddView(label(i), 2%x, label(i - 1).Top";
Debug.ShouldStop(65536);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getTop"),__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getHeight"),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "++",2, 1)),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 82;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
Debug.ShouldStop(131072);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("AVlabal"),RemoteObject.createImmutable(_i))))));
 BA.debugLineNum = 83;BA.debugLine="label(i).TextColor = Colors.White";
Debug.ShouldStop(262144);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",av_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 84;BA.debugLine="page(0).AddView(chekpointbox(i), label(i).left +";
Debug.ShouldStop(524288);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 85;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
Debug.ShouldStop(1048576);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Checkl"),RemoteObject.createImmutable(_i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 89;BA.debugLine="page(1).AddView(label(8), 2%x, 5%y, 50%x, 10%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 8)).getObject())),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 90;BA.debugLine="label(8).Text = Main.translate.GetString(\"AVlabal";
Debug.ShouldStop(33554432);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AVlabal8")))));
 BA.debugLineNum = 91;BA.debugLine="label(8).TextColor = Colors.White";
Debug.ShouldStop(67108864);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(true,"setTextColor",av_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 93;BA.debugLine="page(1).AddView(chekpointbox(8), label(8).left +";
Debug.ShouldStop(268435456);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 8)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(true,"getWidth"),av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(true,"getTop")),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 94;BA.debugLine="chekpointbox(8).Text = Main.translate.GetString(\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Checkl8")))));
 BA.debugLineNum = 96;BA.debugLine="For i = 9 To 15";
Debug.ShouldStop(-2147483648);
{
final int step43 = 1;
final int limit43 = 15;
_i = 9 ;
for (;(step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43) ;_i = ((int)(0 + _i + step43))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 97;BA.debugLine="page(1).AddView(label(i), 2%x, label(i - 1).Top";
Debug.ShouldStop(1);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getTop"),__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getHeight"),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "++",2, 1)),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 98;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
Debug.ShouldStop(2);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("AVlabal"),RemoteObject.createImmutable(_i))))));
 BA.debugLineNum = 99;BA.debugLine="label(i).TextColor = Colors.White";
Debug.ShouldStop(4);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",av_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 100;BA.debugLine="page(1).AddView(chekpointbox(i), label(i).left +";
Debug.ShouldStop(8);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 101;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
Debug.ShouldStop(16);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Checkl"),RemoteObject.createImmutable(_i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 105;BA.debugLine="page(2).AddView(label(16),2%x, 5%y, 50%x, 10%y)";
Debug.ShouldStop(256);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 16)).getObject())),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 106;BA.debugLine="label(16).Text = Main.translate.GetString(\"AVlaba";
Debug.ShouldStop(512);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 16)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AVlabal17")))));
 BA.debugLineNum = 107;BA.debugLine="label(16).TextColor = Colors.White";
Debug.ShouldStop(1024);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 16)).runMethod(true,"setTextColor",av_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 108;BA.debugLine="page(2).AddView(chekpointbox(16), label(16).left";
Debug.ShouldStop(2048);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 16)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 16)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 16)).runMethod(true,"getWidth"),av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 16)).runMethod(true,"getTop")),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 109;BA.debugLine="chekpointbox(16).Text = Main.translate.GetString(";
Debug.ShouldStop(4096);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 16)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Checkl8")))));
 BA.debugLineNum = 112;BA.debugLine="For i = 17 To 23";
Debug.ShouldStop(32768);
{
final int step55 = 1;
final int limit55 = 23;
_i = 17 ;
for (;(step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55) ;_i = ((int)(0 + _i + step55))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 113;BA.debugLine="page(2).AddView(label(i), 2%x, label(i - 1).Top";
Debug.ShouldStop(65536);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getTop"),__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getHeight"),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "++",2, 1)),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 114;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
Debug.ShouldStop(131072);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("AVlabal"),RemoteObject.createImmutable(_i))))));
 BA.debugLineNum = 115;BA.debugLine="label(i).TextColor = Colors.White";
Debug.ShouldStop(262144);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",av_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 116;BA.debugLine="page(2).AddView(chekpointbox(i), label(i).left +";
Debug.ShouldStop(524288);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 117;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
Debug.ShouldStop(1048576);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Checkl"),RemoteObject.createImmutable(_i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 121;BA.debugLine="page(3).AddView(label(24), 2%x, 5%y, 50%x, 10%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 24)).getObject())),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 122;BA.debugLine="label(24).Text = Main.translate.GetString(\"AVlaba";
Debug.ShouldStop(33554432);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 24)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("AVlabal26")))));
 BA.debugLineNum = 123;BA.debugLine="label(24).TextColor = Colors.White";
Debug.ShouldStop(67108864);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 24)).runMethod(true,"setTextColor",av_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 124;BA.debugLine="page(3).AddView(chekpointbox(24), label(24).left";
Debug.ShouldStop(134217728);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 24)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 24)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 24)).runMethod(true,"getWidth"),av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, 24)).runMethod(true,"getTop")),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 125;BA.debugLine="chekpointbox(24).Text = Main.translate.GetString(";
Debug.ShouldStop(268435456);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, 24)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("Checkl8")))));
 BA.debugLineNum = 127;BA.debugLine="For i = 25 To 31";
Debug.ShouldStop(1073741824);
{
final int step67 = 1;
final int limit67 = 31;
_i = 25 ;
for (;(step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67) ;_i = ((int)(0 + _i + step67))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 128;BA.debugLine="page(3).AddView(label(i), 2%x, label(i - 1).Top";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getTop"),__ref.getField(false,"_label").getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).runMethod(true,"getHeight"),av_judge.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "++",2, 1)),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 129;BA.debugLine="label(i).Text = Main.translate.GetString(\"AVlaba";
Debug.ShouldStop(1);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("AVlabal"),RemoteObject.createImmutable(_i))))));
 BA.debugLineNum = 130;BA.debugLine="label(i).TextColor = Colors.White";
Debug.ShouldStop(2);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",av_judge.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 131;BA.debugLine="page(3).AddView(chekpointbox(i), label(i).left +";
Debug.ShouldStop(4);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getLeft"),__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTop")),(Object)(av_judge.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(av_judge.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 132;BA.debugLine="chekpointbox(i).Text = Main.translate.GetString(";
Debug.ShouldStop(8);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(av_judge._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Checkl"),RemoteObject.createImmutable(_i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2;BA.debugLine="Public avPanel As Panel";
av_judge._avpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_avpanel",av_judge._avpanel);
 //BA.debugLineNum = 3;BA.debugLine="Public Pager As AHViewPager";
av_judge._pager = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPager");__ref.setField("_pager",av_judge._pager);
 //BA.debugLineNum = 4;BA.debugLine="Public Container As AHPageContainer";
av_judge._container = RemoteObject.createNew ("de.amberhome.viewpager.AHPageContainer");__ref.setField("_container",av_judge._container);
 //BA.debugLineNum = 5;BA.debugLine="Private page(4) As Panel";
av_judge._page = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {4}, new Object[]{});__ref.setField("_page",av_judge._page);
 //BA.debugLineNum = 6;BA.debugLine="Private label(35) As Label";
av_judge._label = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {35}, new Object[]{});__ref.setField("_label",av_judge._label);
 //BA.debugLineNum = 7;BA.debugLine="Private chekpointbox(35) As CheckBox";
av_judge._chekpointbox = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper", new int[] {35}, new Object[]{});__ref.setField("_chekpointbox",av_judge._chekpointbox);
 //BA.debugLineNum = 8;BA.debugLine="Dim Tabs As AHViewPagerTabs";
av_judge._tabs = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPagerTabs");__ref.setField("_tabs",av_judge._tabs);
 //BA.debugLineNum = 9;BA.debugLine="Dim Line As Panel";
av_judge._line = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_line",av_judge._line);
 //BA.debugLineNum = 10;BA.debugLine="Dim Line2 As Panel";
av_judge._line2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_line2",av_judge._line2);
 //BA.debugLineNum = 11;BA.debugLine="Dim downPanel As Panel";
av_judge._downpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_downpanel",av_judge._downpanel);
 //BA.debugLineNum = 12;BA.debugLine="Dim btnready As Button";
av_judge._btnready = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnready",av_judge._btnready);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (av_judge) ","av_judge",3,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "av_judge","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
int _i = 0;
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="avPanel.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_avpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 18;BA.debugLine="For i = 0 To 3";
Debug.ShouldStop(131072);
{
final int step2 = 1;
final int limit2 = 3;
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 19;BA.debugLine="page(i).Initialize(\"\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_page").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 21;BA.debugLine="For i = 0 To 34";
Debug.ShouldStop(1048576);
{
final int step5 = 1;
final int limit5 = 34;
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 22;BA.debugLine="label(i).Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_label").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 24;BA.debugLine="For i = 0 To 34";
Debug.ShouldStop(8388608);
{
final int step8 = 1;
final int limit8 = 34;
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 25;BA.debugLine="chekpointbox(i).Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_chekpointbox").getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 27;BA.debugLine="downPanel.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_downpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="btnready.Initialize(\"ready\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnready").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ready")));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("ready_Click (av_judge) ","av_judge",3,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("ready_click")) return __ref.runUserSub(false, "av_judge","ready_click", __ref);
 BA.debugLineNum = 137;BA.debugLine="Private Sub ready_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="CallSub(Main, \"FinalClick\")";
Debug.ShouldStop(512);
av_judge.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((av_judge._main.getObject())),(Object)(RemoteObject.createImmutable("FinalClick")));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}