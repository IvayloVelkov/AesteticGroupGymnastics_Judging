
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class dbsqlconnector {
    public static RemoteObject myClass;
	public dbsqlconnector() {
	}
    public static PCBA staticBA = new PCBA(null, dbsqlconnector.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _connection_mode = RemoteObject.createImmutable(0);
public static RemoteObject _connection_mysql = RemoteObject.createImmutable(0);
public static RemoteObject _ip = RemoteObject.createImmutable("");
public static RemoteObject _database = RemoteObject.createImmutable("");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _dbmysql = RemoteObject.declareNull("classes.MYSQL");
public static RemoteObject _queryresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _repreference = RemoteObject.declareNull("b4a.example.main._report");
public static RemoteObject _currencies = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _databasetimeout = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.programdata _programdata = null;
public static b4a.example.uisizes _uisizes = null;
public static b4a.example.version _version = null;
public static b4a.example.starter _starter = null;
public static b4a.example.helperfunctions _helperfunctions = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CONNECTION_MODE",_ref.getField(false, "_connection_mode"),"CONNECTION_MYSQL",_ref.getField(false, "_connection_mysql"),"Currencies",_ref.getField(false, "_currencies"),"Database",_ref.getField(false, "_database"),"DatabaseTimeout",_ref.getField(false, "_databasetimeout"),"DBMySQL",_ref.getField(false, "_dbmysql"),"IP",_ref.getField(false, "_ip"),"Password",_ref.getField(false, "_password"),"QueryResult",_ref.getField(false, "_queryresult"),"RepReference",_ref.getField(false, "_repreference"),"UserName",_ref.getField(false, "_username")};
}
}