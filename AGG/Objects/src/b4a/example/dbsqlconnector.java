package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbsqlconnector extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.dbsqlconnector");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.dbsqlconnector.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public int _connection_mode = 0;
public int _connection_mysql = 0;
public String _ip = "";
public String _database = "";
public String _username = "";
public String _password = "";
public classes.MYSQL _dbmysql = null;
public anywheresoftware.b4a.objects.collections.List _queryresult = null;
public b4a.example.main._report _repreference = null;
public anywheresoftware.b4a.objects.collections.List _currencies = null;
public int _databasetimeout = 0;
public b4a.example.main _main = null;
public b4a.example.programdata _programdata = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.version _version = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions _helperfunctions = null;
public String  _setdatabase(b4a.example.dbsqlconnector __ref,String _address,String _base,String _user,String _pass) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "setdatabase"))
	return (String) Debug.delegate(ba, "setdatabase", new Object[] {_address,_base,_user,_pass});
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub SetDatabase(address As String, base As";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="IP = address";
__ref._ip = _address;
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Database = base";
__ref._database = _base;
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="UserName = user";
__ref._username = _user;
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Password = pass";
__ref._password = _pass;
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="DBMySQL.setDatabase(IP,Database,UserName,Password";
__ref._dbmysql.setDatabase(__ref._ip,__ref._database,__ref._username,__ref._password,BA.NumberToString(__ref._databasetimeout));
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.dbsqlconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Public CONNECTION_MODE As Int";
_connection_mode = 0;
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Public CONNECTION_MYSQL As Int = 0";
_connection_mysql = (int) (0);
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="Private IP, Database, UserName, Password As Strin";
_ip = "";
_database = "";
_username = "";
_password = "";
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="Private DBMySQL As MYSQL";
_dbmysql = new classes.MYSQL();
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Private QueryResult As List";
_queryresult = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="Private RepReference As Report";
_repreference = new b4a.example.main._report();
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="Private Currencies As List";
_currencies = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Private DatabaseTimeout As Int = 10000	'10 second";
_databasetimeout = (int) (10000);
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="End Sub";
return "";
}
public String  _currencythread_ended(b4a.example.dbsqlconnector __ref,boolean _endedok,String _error) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "currencythread_ended"))
	return (String) Debug.delegate(ba, "currencythread_ended", new Object[] {_endedok,_error});
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub CurrencyThread_Ended(endedOK As Boolea";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return "";
}
public String  _datareportthread_ended(b4a.example.dbsqlconnector __ref,boolean _endedok,String _error) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "datareportthread_ended"))
	return (String) Debug.delegate(ba, "datareportthread_ended", new Object[] {_endedok,_error});
b4a.example.main._report _rep = null;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="private Sub DataReportThread_Ended(endedOK As Bool";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Log(\"Inner report query result: \" & QueryResult)";
__c.Log("Inner report query result: "+BA.ObjectToString(__ref._queryresult));
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="If SubExists(Main,\"Handle_DBReportResults\") Then";
if (__c.SubExists(ba,(Object)(_main.getObject()),"Handle_DBReportResults")) { 
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="If Not (QueryResult.IsInitialized) Then QueryResu";
if (__c.Not(__ref._queryresult.IsInitialized())) { 
__ref._queryresult.Initialize();};
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Dim rep As Report";
_rep = new b4a.example.main._report();
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="rep.Initialize";
_rep.Initialize();
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="rep.Data.Initialize";
_rep.Data.Initialize();
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="rep.ChartType = RepReference.ChartType";
_rep.ChartType = __ref._repreference.ChartType;
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="rep.curveType = RepReference.curveType";
_rep.curveType = __ref._repreference.curveType;
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="rep.Data.AddAll(QueryResult)";
_rep.Data.AddAll(__ref._queryresult);
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="rep.Limit = RepReference.Limit";
_rep.Limit = __ref._repreference.Limit;
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="rep.Query = RepReference.Query";
_rep.Query = __ref._repreference.Query;
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="rep.sliceText = RepReference.sliceText";
_rep.sliceText = __ref._repreference.sliceText;
RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="rep.Title = RepReference.Title";
_rep.Title = __ref._repreference.Title;
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="rep.X = RepReference.x";
_rep.X = __ref._repreference.X;
RDebugUtils.currentLine=5439504;
 //BA.debugLineNum = 5439504;BA.debugLine="rep.y = RepReference.y";
_rep.Y = __ref._repreference.Y;
 };
RDebugUtils.currentLine=5439506;
 //BA.debugLineNum = 5439506;BA.debugLine="End Sub";
return "";
}
public String  _datathread_ended(b4a.example.dbsqlconnector __ref,boolean _endedok,String _error) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "datathread_ended"))
	return (String) Debug.delegate(ba, "datathread_ended", new Object[] {_endedok,_error});
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="private Sub DataThread_Ended(endedOK As Boolean, e";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="If Not (QueryResult.IsInitialized) Then QueryResu";
if (__c.Not(__ref._queryresult.IsInitialized())) { 
__ref._queryresult.Initialize();};
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="Log(\"Inner query result: \" & QueryResult.Size)";
__c.Log("Inner query result: "+BA.NumberToString(__ref._queryresult.getSize()));
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="End Sub";
return "";
}
public String  _disablestrictmode(b4a.example.dbsqlconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "disablestrictmode"))
	return (String) Debug.delegate(ba, "disablestrictmode", null);
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _policy = null;
anywheresoftware.b4j.object.JavaObject _sm = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub DisableStrictMode";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="jo.InitializeStatic(\"android.os.Build.VERSION\")";
_jo.InitializeStatic("android.os.Build.VERSION");
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="If jo.GetField(\"SDK_INT\") > 9 Then";
if ((double)(BA.ObjectToNumber(_jo.GetField("SDK_INT")))>9) { 
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="Dim policy As JavaObject";
_policy = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="policy = policy.InitializeNewInstance(\"androi";
_policy = _policy.InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder",(Object[])(__c.Null));
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="policy = policy.RunMethodJO(\"permitAll\", Null";
_policy = _policy.RunMethodJO("permitAll",(Object[])(__c.Null)).RunMethodJO("build",(Object[])(__c.Null));
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Dim sm As JavaObject";
_sm = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="sm.InitializeStatic(\"android.os.StrictMode\").";
_sm.InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy",new Object[]{(Object)(_policy.getObject())});
 };
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _exec_query(b4a.example.dbsqlconnector __ref,String _sql,boolean _skiperrormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "exec_query"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "exec_query", new Object[] {_sql,_skiperrormessage});
String _ex = "";
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub Exec_Query(sql As String, SkipErrorMess";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="QueryResult.Clear";
__ref._queryresult.Clear();
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Try";
try {RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="QueryResult = DBMySQL.Query(sql)";
__ref._queryresult.setObject((java.util.List)(__ref._dbmysql.Query(_sql)));
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="If QueryResult.Size = 0 Then";
if (__ref._queryresult.getSize()==0) { 
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="If Not (QueryResult.IsInitialized) Then QueryRe";
if (__c.Not(__ref._queryresult.IsInitialized())) { 
__ref._queryresult.Initialize();};
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="Log(\"Error! No data from query!\")";
__c.Log("Error! No data from query!");
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="Msgbox(Main.translate.GetString(\"errNoData\"),Ma";
__c.Msgbox(BA.ObjectToCharSequence(_main._translate._getstring(null,"errNoData")),BA.ObjectToCharSequence(_main._translate._getstring(null,"errError")),getActivityBA());
 };
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="Return QueryResult";
if (true) return __ref._queryresult;
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="Dim ex As String = LastException";
_ex = BA.ObjectToString(__c.LastException(getActivityBA()));
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="Log(\"QUERY Exception (connection error?): \" & La";
__c.Log("QUERY Exception (connection error?): "+__c.LastException(getActivityBA()).getMessage());
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="If ex.Contains(\"rollback\") Then";
if (_ex.contains("rollback")) { 
 };
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="If Not (SkipErrorMessage) Then";
if (__c.Not(_skiperrormessage)) { 
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="If ex.Contains(\"sql\") Then";
if (_ex.contains("sql")) { 
RDebugUtils.currentLine=5177369;
 //BA.debugLineNum = 5177369;BA.debugLine="Msgbox(Main.translate.GetString(\"errSQLError\")";
__c.Msgbox(BA.ObjectToCharSequence(_main._translate._getstring(null,"errSQLError")+BA.ObjectToString(__c.Chr((int) (10)))+BA.ObjectToString(__c.Chr((int) (10)))+BA.ObjectToString(__c.LastException(getActivityBA()))),BA.ObjectToCharSequence((_main._translate._getstring(null,"lblSQL")+" "+_main._translate._getstring(null,"lblError"))),getActivityBA());
 }else {
RDebugUtils.currentLine=5177372;
 //BA.debugLineNum = 5177372;BA.debugLine="Msgbox(Main.translate.GetString(\"errUnexpected";
__c.Msgbox(BA.ObjectToCharSequence(_main._translate._getstring(null,"errUnexpected")),BA.ObjectToCharSequence(_main._translate._getstring(null,"errError")),getActivityBA());
 };
 };
RDebugUtils.currentLine=5177378;
 //BA.debugLineNum = 5177378;BA.debugLine="Return QueryResult";
if (true) return __ref._queryresult;
 };
RDebugUtils.currentLine=5177380;
 //BA.debugLineNum = 5177380;BA.debugLine="End Sub";
return null;
}
public String  _get_currency(b4a.example.dbsqlconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "get_currency"))
	return (String) Debug.delegate(ba, "get_currency", null);
String _s = "";
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub Get_Currency As String";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Try";
try {RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Currencies.Clear";
__ref._currencies.Clear();
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="Dim s As String = Currencies.Get(1)";
_s = BA.ObjectToString(__ref._currencies.Get((int) (1)));
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="s = s.Replace(\"[\",\"\")";
_s = _s.replace("[","");
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="s = s.Replace(\"]\",\"\")";
_s = _s.replace("]","");
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="Log(\"Currency PRIME!: \" & s)";
__c.Log("Currency PRIME!: "+_s);
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="Main.BaseNotAccessible = True";
_main._basenotaccessible = __c.True;
RDebugUtils.currentLine=5570575;
 //BA.debugLineNum = 5570575;BA.debugLine="Log(\"Failed to get currency from DB. Currency se";
__c.Log("Failed to get currency from DB. Currency set to default: BGN");
RDebugUtils.currentLine=5570576;
 //BA.debugLineNum = 5570576;BA.debugLine="Return Main.cfg.DEFAULT_CURRENCY";
if (true) return _main._cfg._default_currency;
 };
RDebugUtils.currentLine=5570578;
 //BA.debugLineNum = 5570578;BA.debugLine="End Sub";
return "";
}
public String  _get_currencythread(b4a.example.dbsqlconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "get_currencythread"))
	return (String) Debug.delegate(ba, "get_currencythread", null);
anywheresoftware.b4a.agraham.threading.Threading _currencythread = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub Get_CurrencyThread";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim CurrencyThread As Thread";
_currencythread = new anywheresoftware.b4a.agraham.threading.Threading();
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Log(\"Attempt to get currency form DB\")";
__c.Log("Attempt to get currency form DB");
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="CurrencyThread.Initialise(\"CurrencyThread\")";
_currencythread.Initialise(ba,"CurrencyThread");
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="CurrencyThread.Start(Me,\"Get_Currency\",Null)";
_currencythread.Start(this,"Get_Currency",(Object[])(__c.Null));
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="CurrencyThread.priority = CurrencyThread.MaxPrior";
_currencythread.setPriority(_currencythread.getMaxPriority());
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="End Sub";
return "";
}
public String  _getdatabase(b4a.example.dbsqlconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "getdatabase"))
	return (String) Debug.delegate(ba, "getdatabase", null);
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="public Sub GetDatabase As String";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return Database";
if (true) return __ref._database;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return "";
}
public String  _getpassword(b4a.example.dbsqlconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "getpassword"))
	return (String) Debug.delegate(ba, "getpassword", null);
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="public Sub GetPassword As String";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Return Password";
if (true) return __ref._password;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
public String  _getserveraddress(b4a.example.dbsqlconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "getserveraddress"))
	return (String) Debug.delegate(ba, "getserveraddress", null);
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="public Sub GetServerAddress As String";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Return IP";
if (true) return __ref._ip;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return "";
}
public String  _getusername(b4a.example.dbsqlconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "getusername"))
	return (String) Debug.delegate(ba, "getusername", null);
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="public Sub GetUserName As String";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Return UserName";
if (true) return __ref._username;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.dbsqlconnector __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="DisableStrictMode";
__ref._disablestrictmode(null);
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="QueryResult.Initialize";
__ref._queryresult.Initialize();
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="RepReference.Initialize";
__ref._repreference.Initialize();
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="Currencies.Initialize";
__ref._currencies.Initialize();
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="End Sub";
return "";
}
public String  _queryreportthread(b4a.example.dbsqlconnector __ref,int _pos,b4a.example.main._report _rep,boolean _skiperrors) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "queryreportthread"))
	return (String) Debug.delegate(ba, "queryreportthread", new Object[] {_pos,_rep,_skiperrors});
anywheresoftware.b4a.agraham.threading.Threading _datathread = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub QueryReportThread(pos As Int, rep As Re";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Private DataThread As Thread";
_datathread = new anywheresoftware.b4a.agraham.threading.Threading();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="ProgressDialogShow2(Main.translate.GetString(\"lbl";
__c.ProgressDialogShow2(getActivityBA(),BA.ObjectToCharSequence(_main._translate._getstring(null,"lblLoading")),__c.True);
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="RepReference.Initialize";
__ref._repreference.Initialize();
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="RepReference.Data.Initialize";
__ref._repreference.Data.Initialize();
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="RepReference = rep";
__ref._repreference = _rep;
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="DataThread.Initialise(\"DataReportThread\")";
_datathread.Initialise(ba,"DataReportThread");
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="DataThread.priority = DataThread.NormalPriority";
_datathread.setPriority(_datathread.getNormalPriority());
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="DataThread.Start(Me,\"Exec_Query\",Array As Object(";
_datathread.Start(this,"Exec_Query",new Object[]{(Object)(_rep.Query),(Object)(_skiperrors)});
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="DataThread.Yield";
_datathread.Yield();
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="End Sub";
return "";
}
public String  _querythread(b4a.example.dbsqlconnector __ref,String _sql,boolean _skiperrors) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "querythread"))
	return (String) Debug.delegate(ba, "querythread", new Object[] {_sql,_skiperrors});
anywheresoftware.b4a.agraham.threading.Threading _datathread = null;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub QueryThread(sql As String, skipErrors A";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Private DataThread As Thread";
_datathread = new anywheresoftware.b4a.agraham.threading.Threading();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="ProgressDialogShow2(Main.translate.GetString(\"msg";
__c.ProgressDialogShow2(getActivityBA(),BA.ObjectToCharSequence(_main._translate._getstring(null,"msgTestConnection")),__c.True);
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="DataThread.Initialise(\"DataThread\")";
_datathread.Initialise(ba,"DataThread");
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="DataThread.Start(Me,\"Exec_Query\",Array As Object(";
_datathread.Start(this,"Exec_Query",new Object[]{(Object)(_sql),(Object)(_skiperrors)});
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="End Sub";
return "";
}
public String  _setdbengine(b4a.example.dbsqlconnector __ref,int _connection) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbsqlconnector";
if (Debug.shouldDelegate(ba, "setdbengine"))
	return (String) Debug.delegate(ba, "setdbengine", new Object[] {_connection});
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub SetDBEngine (Connection As Int)";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="CONNECTION_MODE = Connection";
__ref._connection_mode = _connection;
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Log(\"Connection Mode: \" & Connection)";
__c.Log("Connection Mode: "+BA.NumberToString(_connection));
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="End Sub";
return "";
}
}