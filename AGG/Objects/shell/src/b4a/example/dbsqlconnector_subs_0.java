package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dbsqlconnector_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public CONNECTION_MODE As Int";
dbsqlconnector._connection_mode = RemoteObject.createImmutable(0);__ref.setField("_connection_mode",dbsqlconnector._connection_mode);
 //BA.debugLineNum = 3;BA.debugLine="Public CONNECTION_MYSQL As Int = 0";
dbsqlconnector._connection_mysql = BA.numberCast(int.class, 0);__ref.setField("_connection_mysql",dbsqlconnector._connection_mysql);
 //BA.debugLineNum = 5;BA.debugLine="Private IP, Database, UserName, Password As Strin";
dbsqlconnector._ip = RemoteObject.createImmutable("");__ref.setField("_ip",dbsqlconnector._ip);
dbsqlconnector._database = RemoteObject.createImmutable("");__ref.setField("_database",dbsqlconnector._database);
dbsqlconnector._username = RemoteObject.createImmutable("");__ref.setField("_username",dbsqlconnector._username);
dbsqlconnector._password = RemoteObject.createImmutable("");__ref.setField("_password",dbsqlconnector._password);
 //BA.debugLineNum = 6;BA.debugLine="Private DBMySQL As MYSQL";
dbsqlconnector._dbmysql = RemoteObject.createNew ("classes.MYSQL");__ref.setField("_dbmysql",dbsqlconnector._dbmysql);
 //BA.debugLineNum = 7;BA.debugLine="Private QueryResult As List";
dbsqlconnector._queryresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_queryresult",dbsqlconnector._queryresult);
 //BA.debugLineNum = 8;BA.debugLine="Private RepReference As Report";
dbsqlconnector._repreference = RemoteObject.createNew ("b4a.example.main._report");__ref.setField("_repreference",dbsqlconnector._repreference);
 //BA.debugLineNum = 9;BA.debugLine="Private Currencies As List";
dbsqlconnector._currencies = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_currencies",dbsqlconnector._currencies);
 //BA.debugLineNum = 10;BA.debugLine="Private DatabaseTimeout As Int = 10000	'10 second";
dbsqlconnector._databasetimeout = BA.numberCast(int.class, 10000);__ref.setField("_databasetimeout",dbsqlconnector._databasetimeout);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _currencythread_ended(RemoteObject __ref,RemoteObject _endedok,RemoteObject _error) throws Exception{
try {
		Debug.PushSubsStack("CurrencyThread_Ended (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("currencythread_ended")) return __ref.runUserSub(false, "dbsqlconnector","currencythread_ended", __ref, _endedok, _error);
Debug.locals.put("endedOK", _endedok);
Debug.locals.put("error", _error);
 BA.debugLineNum = 210;BA.debugLine="Private Sub CurrencyThread_Ended(endedOK As Boolea";
Debug.ShouldStop(131072);
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datareportthread_ended(RemoteObject __ref,RemoteObject _endedok,RemoteObject _error) throws Exception{
try {
		Debug.PushSubsStack("DataReportThread_Ended (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("datareportthread_ended")) return __ref.runUserSub(false, "dbsqlconnector","datareportthread_ended", __ref, _endedok, _error);
RemoteObject _rep = RemoteObject.declareNull("b4a.example.main._report");
Debug.locals.put("endedOK", _endedok);
Debug.locals.put("error", _error);
 BA.debugLineNum = 145;BA.debugLine="private Sub DataReportThread_Ended(endedOK As Bool";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(131072);
dbsqlconnector.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 147;BA.debugLine="Log(\"Inner report query result: \" & QueryResult)";
Debug.ShouldStop(262144);
dbsqlconnector.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Inner report query result: "),__ref.getField(false,"_queryresult"))));
 BA.debugLineNum = 148;BA.debugLine="If SubExists(Main,\"Handle_DBReportResults\") Then";
Debug.ShouldStop(524288);
if (dbsqlconnector.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)((dbsqlconnector._main.getObject())),(Object)(RemoteObject.createImmutable("Handle_DBReportResults"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 149;BA.debugLine="If Not (QueryResult.IsInitialized) Then QueryResu";
Debug.ShouldStop(1048576);
if (dbsqlconnector.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_queryresult").runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_queryresult").runVoidMethod ("Initialize");};
 BA.debugLineNum = 150;BA.debugLine="Dim rep As Report";
Debug.ShouldStop(2097152);
_rep = RemoteObject.createNew ("b4a.example.main._report");Debug.locals.put("rep", _rep);
 BA.debugLineNum = 151;BA.debugLine="rep.Initialize";
Debug.ShouldStop(4194304);
_rep.runVoidMethod ("Initialize");
 BA.debugLineNum = 152;BA.debugLine="rep.Data.Initialize";
Debug.ShouldStop(8388608);
_rep.getField(false,"Data").runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="rep.ChartType = RepReference.ChartType";
Debug.ShouldStop(16777216);
_rep.setField ("ChartType",__ref.getField(false,"_repreference").getField(true,"ChartType"));
 BA.debugLineNum = 154;BA.debugLine="rep.curveType = RepReference.curveType";
Debug.ShouldStop(33554432);
_rep.setField ("curveType",__ref.getField(false,"_repreference").getField(true,"curveType"));
 BA.debugLineNum = 155;BA.debugLine="rep.Data.AddAll(QueryResult)";
Debug.ShouldStop(67108864);
_rep.getField(false,"Data").runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_queryresult")));
 BA.debugLineNum = 156;BA.debugLine="rep.Limit = RepReference.Limit";
Debug.ShouldStop(134217728);
_rep.setField ("Limit",__ref.getField(false,"_repreference").getField(true,"Limit"));
 BA.debugLineNum = 157;BA.debugLine="rep.Query = RepReference.Query";
Debug.ShouldStop(268435456);
_rep.setField ("Query",__ref.getField(false,"_repreference").getField(true,"Query"));
 BA.debugLineNum = 158;BA.debugLine="rep.sliceText = RepReference.sliceText";
Debug.ShouldStop(536870912);
_rep.setField ("sliceText",__ref.getField(false,"_repreference").getField(true,"sliceText"));
 BA.debugLineNum = 159;BA.debugLine="rep.Title = RepReference.Title";
Debug.ShouldStop(1073741824);
_rep.setField ("Title",__ref.getField(false,"_repreference").getField(true,"Title"));
 BA.debugLineNum = 160;BA.debugLine="rep.X = RepReference.x";
Debug.ShouldStop(-2147483648);
_rep.setField ("X",__ref.getField(false,"_repreference").getField(true,"X"));
 BA.debugLineNum = 161;BA.debugLine="rep.y = RepReference.y";
Debug.ShouldStop(1);
_rep.setField ("Y",__ref.getField(false,"_repreference").getField(true,"Y"));
 };
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datathread_ended(RemoteObject __ref,RemoteObject _endedok,RemoteObject _error) throws Exception{
try {
		Debug.PushSubsStack("DataThread_Ended (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("datathread_ended")) return __ref.runUserSub(false, "dbsqlconnector","datathread_ended", __ref, _endedok, _error);
Debug.locals.put("endedOK", _endedok);
Debug.locals.put("error", _error);
 BA.debugLineNum = 127;BA.debugLine="private Sub DataThread_Ended(endedOK As Boolean, e";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(-2147483648);
dbsqlconnector.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 129;BA.debugLine="If Not (QueryResult.IsInitialized) Then QueryResu";
Debug.ShouldStop(1);
if (dbsqlconnector.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_queryresult").runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_queryresult").runVoidMethod ("Initialize");};
 BA.debugLineNum = 130;BA.debugLine="Log(\"Inner query result: \" & QueryResult.Size)";
Debug.ShouldStop(2);
dbsqlconnector.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Inner query result: "),__ref.getField(false,"_queryresult").runMethod(true,"getSize"))));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disablestrictmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DisableStrictMode (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("disablestrictmode")) return __ref.runUserSub(false, "dbsqlconnector","disablestrictmode", __ref);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _policy = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _sm = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 167;BA.debugLine="Public Sub DisableStrictMode";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(128);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 169;BA.debugLine="jo.InitializeStatic(\"android.os.Build.VERSION\")";
Debug.ShouldStop(256);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build.VERSION")));
 BA.debugLineNum = 171;BA.debugLine="If jo.GetField(\"SDK_INT\") > 9 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("SDK_INT")))),BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 172;BA.debugLine="Dim policy As JavaObject";
Debug.ShouldStop(2048);
_policy = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("policy", _policy);
 BA.debugLineNum = 173;BA.debugLine="policy = policy.InitializeNewInstance(\"androi";
Debug.ShouldStop(4096);
_policy = _policy.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("android.os.StrictMode.ThreadPolicy.Builder")),(Object)((dbsqlconnector.__c.getField(false,"Null"))));Debug.locals.put("policy", _policy);
 BA.debugLineNum = 174;BA.debugLine="policy = policy.RunMethodJO(\"permitAll\", Null";
Debug.ShouldStop(8192);
_policy = _policy.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("permitAll")),(Object)((dbsqlconnector.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("build")),(Object)((dbsqlconnector.__c.getField(false,"Null"))));Debug.locals.put("policy", _policy);
 BA.debugLineNum = 175;BA.debugLine="Dim sm As JavaObject";
Debug.ShouldStop(16384);
_sm = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("sm", _sm);
 BA.debugLineNum = 176;BA.debugLine="sm.InitializeStatic(\"android.os.StrictMode\").";
Debug.ShouldStop(32768);
_sm.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.StrictMode"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setThreadPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_policy.getObject())})));
 };
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exec_query(RemoteObject __ref,RemoteObject _sql,RemoteObject _skiperrormessage) throws Exception{
try {
		Debug.PushSubsStack("Exec_Query (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("exec_query")) return __ref.runUserSub(false, "dbsqlconnector","exec_query", __ref, _sql, _skiperrormessage);
RemoteObject _ex = RemoteObject.createImmutable("");
Debug.locals.put("sql", _sql);
Debug.locals.put("SkipErrorMessage", _skiperrormessage);
 BA.debugLineNum = 76;BA.debugLine="Public Sub Exec_Query(sql As String, SkipErrorMess";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="QueryResult.Clear";
Debug.ShouldStop(4096);
__ref.getField(false,"_queryresult").runVoidMethod ("Clear");
 BA.debugLineNum = 78;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 80;BA.debugLine="QueryResult = DBMySQL.Query(sql)";
Debug.ShouldStop(32768);
__ref.getField(false,"_queryresult").setObject (__ref.getField(false,"_dbmysql").runMethod(false,"Query",(Object)(_sql)));
 BA.debugLineNum = 83;BA.debugLine="If QueryResult.Size = 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_queryresult").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 84;BA.debugLine="If Not (QueryResult.IsInitialized) Then QueryRe";
Debug.ShouldStop(524288);
if (dbsqlconnector.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_queryresult").runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_queryresult").runVoidMethod ("Initialize");};
 BA.debugLineNum = 85;BA.debugLine="Log(\"Error! No data from query!\")";
Debug.ShouldStop(1048576);
dbsqlconnector.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error! No data from query!")));
 BA.debugLineNum = 86;BA.debugLine="Msgbox(Main.translate.GetString(\"errNoData\"),Ma";
Debug.ShouldStop(2097152);
dbsqlconnector.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(dbsqlconnector._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("errNoData"))))),(Object)(BA.ObjectToCharSequence(dbsqlconnector._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("errError"))))),__ref.runMethod(false,"getActivityBA"));
 };
 BA.debugLineNum = 90;BA.debugLine="Return QueryResult";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) return __ref.getField(false,"_queryresult");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 92;BA.debugLine="Dim ex As String = LastException";
Debug.ShouldStop(134217728);
_ex = BA.ObjectToString(dbsqlconnector.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")));Debug.locals.put("ex", _ex);Debug.locals.put("ex", _ex);
 BA.debugLineNum = 93;BA.debugLine="Log(\"QUERY Exception (connection error?): \" & La";
Debug.ShouldStop(268435456);
dbsqlconnector.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("QUERY Exception (connection error?): "),dbsqlconnector.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")).runMethod(true,"getMessage"))));
 BA.debugLineNum = 95;BA.debugLine="If ex.Contains(\"rollback\") Then";
Debug.ShouldStop(1073741824);
if (_ex.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("rollback"))).<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 98;BA.debugLine="If Not (SkipErrorMessage) Then";
Debug.ShouldStop(2);
if (dbsqlconnector.__c.runMethod(true,"Not",(Object)(_skiperrormessage)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 100;BA.debugLine="If ex.Contains(\"sql\") Then";
Debug.ShouldStop(8);
if (_ex.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("sql"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 101;BA.debugLine="Msgbox(Main.translate.GetString(\"errSQLError\")";
Debug.ShouldStop(16);
dbsqlconnector.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(dbsqlconnector._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("errSQLError"))),dbsqlconnector.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))),dbsqlconnector.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))),dbsqlconnector.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))))),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(dbsqlconnector._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("lblSQL"))),RemoteObject.createImmutable(" "),dbsqlconnector._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("lblError"))))))),__ref.runMethod(false,"getActivityBA"));
 }else {
 BA.debugLineNum = 104;BA.debugLine="Msgbox(Main.translate.GetString(\"errUnexpected";
Debug.ShouldStop(128);
dbsqlconnector.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(dbsqlconnector._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("errUnexpected"))))),(Object)(BA.ObjectToCharSequence(dbsqlconnector._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("errError"))))),__ref.runMethod(false,"getActivityBA"));
 };
 };
 BA.debugLineNum = 110;BA.debugLine="Return QueryResult";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_queryresult");
 };
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_currency(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Get_Currency (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("get_currency")) return __ref.runUserSub(false, "dbsqlconnector","get_currency", __ref);
RemoteObject _s = RemoteObject.createImmutable("");
 BA.debugLineNum = 182;BA.debugLine="Public Sub Get_Currency As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 184;BA.debugLine="Currencies.Clear";
Debug.ShouldStop(8388608);
__ref.getField(false,"_currencies").runVoidMethod ("Clear");
 BA.debugLineNum = 187;BA.debugLine="Dim s As String = Currencies.Get(1)";
Debug.ShouldStop(67108864);
_s = BA.ObjectToString(__ref.getField(false,"_currencies").runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 189;BA.debugLine="s = s.Replace(\"[\",\"\")";
Debug.ShouldStop(268435456);
_s = _s.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s", _s);
 BA.debugLineNum = 190;BA.debugLine="s = s.Replace(\"]\",\"\")";
Debug.ShouldStop(536870912);
_s = _s.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s", _s);
 BA.debugLineNum = 192;BA.debugLine="Return s";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return _s;
 BA.debugLineNum = 193;BA.debugLine="Log(\"Currency PRIME!: \" & s)";
Debug.ShouldStop(1);
dbsqlconnector.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Currency PRIME!: "),_s)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 196;BA.debugLine="Main.BaseNotAccessible = True";
Debug.ShouldStop(8);
dbsqlconnector._main._basenotaccessible = dbsqlconnector.__c.getField(true,"True");
 BA.debugLineNum = 197;BA.debugLine="Log(\"Failed to get currency from DB. Currency se";
Debug.ShouldStop(16);
dbsqlconnector.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Failed to get currency from DB. Currency set to default: BGN")));
 BA.debugLineNum = 198;BA.debugLine="Return Main.cfg.DEFAULT_CURRENCY";
Debug.ShouldStop(32);
if (true) return dbsqlconnector._main._cfg.getField(true,"_default_currency");
 };
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_currencythread(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Get_CurrencyThread (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("get_currencythread")) return __ref.runUserSub(false, "dbsqlconnector","get_currencythread", __ref);
RemoteObject _currencythread = RemoteObject.declareNull("anywheresoftware.b4a.agraham.threading.Threading");
 BA.debugLineNum = 202;BA.debugLine="Public Sub Get_CurrencyThread";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="Dim CurrencyThread As Thread";
Debug.ShouldStop(1024);
_currencythread = RemoteObject.createNew ("anywheresoftware.b4a.agraham.threading.Threading");Debug.locals.put("CurrencyThread", _currencythread);
 BA.debugLineNum = 204;BA.debugLine="Log(\"Attempt to get currency form DB\")";
Debug.ShouldStop(2048);
dbsqlconnector.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Attempt to get currency form DB")));
 BA.debugLineNum = 205;BA.debugLine="CurrencyThread.Initialise(\"CurrencyThread\")";
Debug.ShouldStop(4096);
_currencythread.runVoidMethod ("Initialise",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CurrencyThread")));
 BA.debugLineNum = 206;BA.debugLine="CurrencyThread.Start(Me,\"Get_Currency\",Null)";
Debug.ShouldStop(8192);
_currencythread.runVoidMethod ("Start",(Object)(__ref),(Object)(BA.ObjectToString("Get_Currency")),(Object)((dbsqlconnector.__c.getField(false,"Null"))));
 BA.debugLineNum = 207;BA.debugLine="CurrencyThread.priority = CurrencyThread.MaxPrior";
Debug.ShouldStop(16384);
_currencythread.runMethod(true,"setPriority",_currencythread.runMethod(true,"getMaxPriority"));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdatabase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDatabase (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("getdatabase")) return __ref.runUserSub(false, "dbsqlconnector","getdatabase", __ref);
 BA.debugLineNum = 43;BA.debugLine="public Sub GetDatabase As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Return Database";
Debug.ShouldStop(2048);
if (true) return __ref.getField(true,"_database");
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpassword(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPassword (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getpassword")) return __ref.runUserSub(false, "dbsqlconnector","getpassword", __ref);
 BA.debugLineNum = 51;BA.debugLine="public Sub GetPassword As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Return Password";
Debug.ShouldStop(524288);
if (true) return __ref.getField(true,"_password");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getserveraddress(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetServerAddress (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("getserveraddress")) return __ref.runUserSub(false, "dbsqlconnector","getserveraddress", __ref);
 BA.debugLineNum = 39;BA.debugLine="public Sub GetServerAddress As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Return IP";
Debug.ShouldStop(128);
if (true) return __ref.getField(true,"_ip");
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getusername(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetUserName (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("getusername")) return __ref.runUserSub(false, "dbsqlconnector","getusername", __ref);
 BA.debugLineNum = 47;BA.debugLine="public Sub GetUserName As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Return UserName";
Debug.ShouldStop(32768);
if (true) return __ref.getField(true,"_username");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "dbsqlconnector","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="DisableStrictMode";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.dbsqlconnector.class, "_disablestrictmode");
 BA.debugLineNum = 15;BA.debugLine="QueryResult.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_queryresult").runVoidMethod ("Initialize");
 BA.debugLineNum = 16;BA.debugLine="RepReference.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_repreference").runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="Currencies.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_currencies").runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _queryreportthread(RemoteObject __ref,RemoteObject _pos,RemoteObject _rep,RemoteObject _skiperrors) throws Exception{
try {
		Debug.PushSubsStack("QueryReportThread (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("queryreportthread")) return __ref.runUserSub(false, "dbsqlconnector","queryreportthread", __ref, _pos, _rep, _skiperrors);
RemoteObject _datathread = RemoteObject.declareNull("anywheresoftware.b4a.agraham.threading.Threading");
Debug.locals.put("pos", _pos);
Debug.locals.put("rep", _rep);
Debug.locals.put("skipErrors", _skiperrors);
 BA.debugLineNum = 133;BA.debugLine="Public Sub QueryReportThread(pos As Int, rep As Re";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Private DataThread As Thread";
Debug.ShouldStop(32);
_datathread = RemoteObject.createNew ("anywheresoftware.b4a.agraham.threading.Threading");Debug.locals.put("DataThread", _datathread);
 BA.debugLineNum = 135;BA.debugLine="ProgressDialogShow2(Main.translate.GetString(\"lbl";
Debug.ShouldStop(64);
dbsqlconnector.__c.runVoidMethod ("ProgressDialogShow2",__ref.runMethod(false,"getActivityBA"),(Object)(BA.ObjectToCharSequence(dbsqlconnector._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("lblLoading"))))),(Object)(dbsqlconnector.__c.getField(true,"True")));
 BA.debugLineNum = 136;BA.debugLine="RepReference.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_repreference").runVoidMethod ("Initialize");
 BA.debugLineNum = 137;BA.debugLine="RepReference.Data.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_repreference").getField(false,"Data").runVoidMethod ("Initialize");
 BA.debugLineNum = 138;BA.debugLine="RepReference = rep";
Debug.ShouldStop(512);
__ref.setField ("_repreference",_rep);
 BA.debugLineNum = 139;BA.debugLine="DataThread.Initialise(\"DataReportThread\")";
Debug.ShouldStop(1024);
_datathread.runVoidMethod ("Initialise",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DataReportThread")));
 BA.debugLineNum = 140;BA.debugLine="DataThread.priority = DataThread.NormalPriority";
Debug.ShouldStop(2048);
_datathread.runMethod(true,"setPriority",_datathread.runMethod(true,"getNormalPriority"));
 BA.debugLineNum = 141;BA.debugLine="DataThread.Start(Me,\"Exec_Query\",Array As Object(";
Debug.ShouldStop(4096);
_datathread.runVoidMethod ("Start",(Object)(__ref),(Object)(BA.ObjectToString("Exec_Query")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rep.getField(true,"Query")),(_skiperrors)})));
 BA.debugLineNum = 142;BA.debugLine="DataThread.Yield";
Debug.ShouldStop(8192);
_datathread.runVoidMethod ("Yield");
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _querythread(RemoteObject __ref,RemoteObject _sql,RemoteObject _skiperrors) throws Exception{
try {
		Debug.PushSubsStack("QueryThread (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("querythread")) return __ref.runUserSub(false, "dbsqlconnector","querythread", __ref, _sql, _skiperrors);
RemoteObject _datathread = RemoteObject.declareNull("anywheresoftware.b4a.agraham.threading.Threading");
Debug.locals.put("sql", _sql);
Debug.locals.put("skipErrors", _skiperrors);
 BA.debugLineNum = 120;BA.debugLine="Public Sub QueryThread(sql As String, skipErrors A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="Private DataThread As Thread";
Debug.ShouldStop(16777216);
_datathread = RemoteObject.createNew ("anywheresoftware.b4a.agraham.threading.Threading");Debug.locals.put("DataThread", _datathread);
 BA.debugLineNum = 122;BA.debugLine="ProgressDialogShow2(Main.translate.GetString(\"msg";
Debug.ShouldStop(33554432);
dbsqlconnector.__c.runVoidMethod ("ProgressDialogShow2",__ref.runMethod(false,"getActivityBA"),(Object)(BA.ObjectToCharSequence(dbsqlconnector._main._translate.runClassMethod (b4a.example.translator.class, "_getstring",(Object)(RemoteObject.createImmutable("msgTestConnection"))))),(Object)(dbsqlconnector.__c.getField(true,"True")));
 BA.debugLineNum = 123;BA.debugLine="DataThread.Initialise(\"DataThread\")";
Debug.ShouldStop(67108864);
_datathread.runVoidMethod ("Initialise",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DataThread")));
 BA.debugLineNum = 124;BA.debugLine="DataThread.Start(Me,\"Exec_Query\",Array As Object(";
Debug.ShouldStop(134217728);
_datathread.runVoidMethod ("Start",(Object)(__ref),(Object)(BA.ObjectToString("Exec_Query")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_sql),(_skiperrors)})));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdatabase(RemoteObject __ref,RemoteObject _address,RemoteObject _base,RemoteObject _user,RemoteObject _pass) throws Exception{
try {
		Debug.PushSubsStack("SetDatabase (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("setdatabase")) return __ref.runUserSub(false, "dbsqlconnector","setdatabase", __ref, _address, _base, _user, _pass);
Debug.locals.put("address", _address);
Debug.locals.put("base", _base);
Debug.locals.put("user", _user);
Debug.locals.put("pass", _pass);
 BA.debugLineNum = 27;BA.debugLine="Public Sub SetDatabase(address As String, base As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="IP = address";
Debug.ShouldStop(268435456);
__ref.setField ("_ip",_address);
 BA.debugLineNum = 30;BA.debugLine="Database = base";
Debug.ShouldStop(536870912);
__ref.setField ("_database",_base);
 BA.debugLineNum = 31;BA.debugLine="UserName = user";
Debug.ShouldStop(1073741824);
__ref.setField ("_username",_user);
 BA.debugLineNum = 32;BA.debugLine="Password = pass";
Debug.ShouldStop(-2147483648);
__ref.setField ("_password",_pass);
 BA.debugLineNum = 34;BA.debugLine="DBMySQL.setDatabase(IP,Database,UserName,Password";
Debug.ShouldStop(2);
__ref.getField(false,"_dbmysql").runVoidMethod ("setDatabase",(Object)(__ref.getField(true,"_ip")),(Object)(__ref.getField(true,"_database")),(Object)(__ref.getField(true,"_username")),(Object)(__ref.getField(true,"_password")),(Object)(BA.NumberToString(__ref.getField(true,"_databasetimeout"))));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdbengine(RemoteObject __ref,RemoteObject _connection) throws Exception{
try {
		Debug.PushSubsStack("SetDBEngine (dbsqlconnector) ","dbsqlconnector",7,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("setdbengine")) return __ref.runUserSub(false, "dbsqlconnector","setdbengine", __ref, _connection);
Debug.locals.put("Connection", _connection);
 BA.debugLineNum = 21;BA.debugLine="Public Sub SetDBEngine (Connection As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="CONNECTION_MODE = Connection";
Debug.ShouldStop(2097152);
__ref.setField ("_connection_mode",_connection);
 BA.debugLineNum = 23;BA.debugLine="Log(\"Connection Mode: \" & Connection)";
Debug.ShouldStop(4194304);
dbsqlconnector.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Connection Mode: "),_connection)));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}