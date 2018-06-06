package agg.agg;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbsqlconn extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "agg.agg.dbsqlconn");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", agg.agg.dbsqlconn.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _ip = "";
public String _databases = "";
public String _username = "";
public String _password = "";
public classes.MYSQL _dbmysql = null;
public int _connection_mode = 0;
public int _connection_mssql = 0;
public int _connection_mysql = 0;
public agg.agg.main _main = null;
public agg.agg.helperfunctions _helperfunctions = null;
public agg.agg.programdata _programdata = null;
public agg.agg.uisizes _uisizes = null;
public agg.agg.version _version = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim IP, Databases As String";
_ip = "";
_databases = "";
 //BA.debugLineNum = 3;BA.debugLine="Dim UserName, Password As String";
_username = "";
_password = "";
 //BA.debugLineNum = 4;BA.debugLine="Dim DBMySQL As MYSQL";
_dbmysql = new classes.MYSQL();
 //BA.debugLineNum = 6;BA.debugLine="Public CONNECTION_MODE As Int";
_connection_mode = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public CONNECTION_MSSQL As Int = 0";
_connection_mssql = (int) (0);
 //BA.debugLineNum = 8;BA.debugLine="Public CONNECTION_MYSQL As Int = 1";
_connection_mysql = (int) (1);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _disablestrictmode() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _policy = null;
anywheresoftware.b4j.object.JavaObject _sm = null;
 //BA.debugLineNum = 84;BA.debugLine="Public Sub DisableStrictMode 'Disables Strict Netw";
 //BA.debugLineNum = 85;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 86;BA.debugLine="jo.InitializeStatic(\"android.os.Build.VERSION\")";
_jo.InitializeStatic("android.os.Build.VERSION");
 //BA.debugLineNum = 87;BA.debugLine="If jo.GetField(\"SDK_INT\") > 9 Then";
if ((double)(BA.ObjectToNumber(_jo.GetField("SDK_INT")))>9) { 
 //BA.debugLineNum = 88;BA.debugLine="Dim policy As JavaObject";
_policy = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 89;BA.debugLine="policy = policy.InitializeNewInstance(\"android.o";
_policy = _policy.InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder",(Object[])(__c.Null));
 //BA.debugLineNum = 90;BA.debugLine="policy = policy.RunMethodJO(\"permitAll\", Null).R";
_policy = _policy.RunMethodJO("permitAll",(Object[])(__c.Null)).RunMethodJO("build",(Object[])(__c.Null));
 //BA.debugLineNum = 91;BA.debugLine="Dim sm As JavaObject";
_sm = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 92;BA.debugLine="sm.InitializeStatic(\"android.os.StrictMode\").Run";
_sm.InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy",new Object[]{(Object)(_policy.getObject())});
 };
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _executenonquery(String _sql) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub ExecuteNonQuery(sql As String)";
 //BA.debugLineNum = 53;BA.debugLine="DBMySQL.ExecuteNonQuery(sql)";
_dbmysql.ExecuteNonQuery(_sql);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _getdatabase() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="public Sub GetDatabase As String";
 //BA.debugLineNum = 29;BA.debugLine="Return Databases";
if (true) return _databases;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _getpassword() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="public Sub GetPassword As String";
 //BA.debugLineNum = 37;BA.debugLine="Return Password";
if (true) return _password;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _getserveraddress() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="public Sub GetServerAddress As String";
 //BA.debugLineNum = 25;BA.debugLine="Return IP";
if (true) return _ip;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _getusername() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="public Sub GetUserName As String";
 //BA.debugLineNum = 33;BA.debugLine="Return UserName";
if (true) return _username;
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 13;BA.debugLine="DisableStrictMode";
_disablestrictmode();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _query(String _sql,boolean _skiperrormessage) throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
String _err = "";
 //BA.debugLineNum = 56;BA.debugLine="Public Sub Query(sql As String, SkipErrorMessage A";
 //BA.debugLineNum = 57;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 58;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="Log(\"Executing SQL: \" & sql)";
__c.Log("Executing SQL: "+_sql);
 //BA.debugLineNum = 60;BA.debugLine="Try";
try { //BA.debugLineNum = 61;BA.debugLine="result = DBMySQL.Query(sql)";
_result.setObject((java.util.List)(_dbmysql.Query(_sql)));
 //BA.debugLineNum = 62;BA.debugLine="Log(\"Result: \" & result)";
__c.Log("Result: "+BA.ObjectToString(_result));
 //BA.debugLineNum = 64;BA.debugLine="If result.Size = 0 Then";
if (_result.getSize()==0) { 
 //BA.debugLineNum = 66;BA.debugLine="Log(\"Error! No data from query!\")";
__c.Log("Error! No data from query!");
 //BA.debugLineNum = 67;BA.debugLine="Msgbox(\"errNoData\", \"Error\")";
__c.Msgbox(BA.ObjectToCharSequence("errNoData"),BA.ObjectToCharSequence("Error"),getActivityBA());
 };
 //BA.debugLineNum = 69;BA.debugLine="Return result";
if (true) return _result;
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 71;BA.debugLine="Dim err As String = LastException.Message";
_err = __c.LastException(getActivityBA()).getMessage();
 //BA.debugLineNum = 72;BA.debugLine="Log(err)";
__c.Log(_err);
 //BA.debugLineNum = 73;BA.debugLine="If Not (SkipErrorMessage) Then";
if (__c.Not(_skiperrormessage)) { 
 //BA.debugLineNum = 74;BA.debugLine="If err.Contains(\"sql\") Then";
if (_err.contains("sql")) { 
 //BA.debugLineNum = 75;BA.debugLine="Msgbox(\"errSQLError\" & Chr(10) & Chr(10) & Las";
__c.Msgbox(BA.ObjectToCharSequence("errSQLError"+BA.ObjectToString(__c.Chr((int) (10)))+BA.ObjectToString(__c.Chr((int) (10)))+BA.ObjectToString(__c.LastException(getActivityBA()))),BA.ObjectToCharSequence("Error"),getActivityBA());
 }else {
 //BA.debugLineNum = 77;BA.debugLine="Msgbox(\"ErrUnexpected\", \"Error\")";
__c.Msgbox(BA.ObjectToCharSequence("ErrUnexpected"),BA.ObjectToCharSequence("Error"),getActivityBA());
 };
 };
 //BA.debugLineNum = 80;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public String  _setdatabase(String _address,String _base,String _user,String _pass) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Public Sub setDatabase(address As String, base As";
 //BA.debugLineNum = 17;BA.debugLine="IP = address";
_ip = _address;
 //BA.debugLineNum = 18;BA.debugLine="Databases = base";
_databases = _base;
 //BA.debugLineNum = 19;BA.debugLine="UserName = user";
_username = _user;
 //BA.debugLineNum = 20;BA.debugLine="Password = pass";
_password = _pass;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _tablelist() throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
 //BA.debugLineNum = 41;BA.debugLine="Public Sub TableList As List";
 //BA.debugLineNum = 42;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 43;BA.debugLine="result = DBMySQL.TableList";
_result.setObject((java.util.List)(_dbmysql.TableList()));
 //BA.debugLineNum = 44;BA.debugLine="If Not (result.IsInitialized) Then";
if (__c.Not(_result.IsInitialized())) { 
 //BA.debugLineNum = 45;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="Log(\"Error! No tables found!\")";
__c.Log("Error! No tables found!");
 };
 //BA.debugLineNum = 48;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
