package agg.agg;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class version_subs_0 {


public static RemoteObject  _path(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Path (version) ","version",11,_ba,version.mostCurrent,8);
if (RapidSub.canDelegate("path")) return agg.agg.version.remoteMe.runUserSub(false, "version","path", _ba);
;
 BA.debugLineNum = 8;BA.debugLine="Public Sub Path As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="Return \"/Microinvest/\"&ProgramName";
Debug.ShouldStop(256);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("/Microinvest/"),version._programname);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public ProductID As Int = 301							'Product Iden";
version._productid = BA.numberCast(int.class, 301);
 //BA.debugLineNum = 3;BA.debugLine="Public ProgramName As String = \"AGG\"";
version._programname = BA.ObjectToString("AGG");
 //BA.debugLineNum = 4;BA.debugLine="Public ProductInDictionary As String = \"AndroidPr";
version._productindictionary = BA.ObjectToString("AndroidProjects");
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}