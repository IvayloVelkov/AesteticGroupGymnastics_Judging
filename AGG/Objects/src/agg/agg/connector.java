package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class connector extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "agg.agg.connector");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", agg.agg.connector.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _sendorderstodatabase() throws Exception{
String _s = "";
String _sql = "";
 //BA.debugLineNum = 15;BA.debugLine="Private Sub SendOrdersToDatabase";
 //BA.debugLineNum = 16;BA.debugLine="Dim s As String";
_s = "";
 //BA.debugLineNum = 17;BA.debugLine="Dim SQL As String";
_sql = "";
 //BA.debugLineNum = 19;BA.debugLine="SQL = \"\"";
_sql = "";
 //BA.debugLineNum = 20;BA.debugLine="s = \"INSERT INTO Results \"";
_s = "INSERT INTO Results ";
 //BA.debugLineNum = 21;BA.debugLine="s = s & \"(teamname\"";
_s = _s+"(teamname";
 //BA.debugLineNum = 22;BA.debugLine="s = s & \",avResult\"";
_s = _s+",avResult";
 //BA.debugLineNum = 23;BA.debugLine="s = s & \",tvResult\"";
_s = _s+",tvResult";
 //BA.debugLineNum = 24;BA.debugLine="s = s & \",exeResult\"";
_s = _s+",exeResult";
 //BA.debugLineNum = 25;BA.debugLine="s = s & \" VALUES\"";
_s = _s+" VALUES";
 //BA.debugLineNum = 26;BA.debugLine="s = s & \"('\" & HelperFunctions.TeamName & \"'\"";
_s = _s+"('"+_helperfunctions._teamname+"'";
 //BA.debugLineNum = 27;BA.debugLine="s = s & \",'\" & CallSub(Main, \"finalScore\") & \"'";
_s = _s+",'"+BA.ObjectToString(__c.CallSubNew(ba,(Object)(_main.getObject()),"finalScore"))+"')";
 //BA.debugLineNum = 29;BA.debugLine="SQL = SQL & s";
_sql = _sql+_s;
 //BA.debugLineNum = 31;BA.debugLine="If SQL.Length > 0 Then";
if (_sql.length()>0) { 
 //BA.debugLineNum = 32;BA.debugLine="Main.DataBaseSQL.ExecuteNonQuery(SQL)";
_main._databasesql._executenonquery(_sql);
 };
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _sendtodatabase() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Public Sub SendToDatabase";
 //BA.debugLineNum = 12;BA.debugLine="SendOrdersToDatabase";
_sendorderstodatabase();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
