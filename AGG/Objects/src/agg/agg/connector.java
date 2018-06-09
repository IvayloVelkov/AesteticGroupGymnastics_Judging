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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
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
public String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
String _res = "";
 //BA.debugLineNum = 39;BA.debugLine="Sub JobDone (Job As HttpJob)";
 //BA.debugLineNum = 40;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 41;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
__c.Log("JobName = "+_job._jobname+", Success = "+BA.ObjectToString(_job._success));
 //BA.debugLineNum = 42;BA.debugLine="If Job.Success = True Then";
if (_job._success==__c.True) { 
 //BA.debugLineNum = 43;BA.debugLine="res = Job.GetString";
_res = _job._getstring();
 //BA.debugLineNum = 44;BA.debugLine="Log(res)";
__c.Log(_res);
 }else {
 //BA.debugLineNum = 46;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
__c.Log("Error: "+_job._errormessage);
 //BA.debugLineNum = 47;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
__c.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),__c.True);
 };
 //BA.debugLineNum = 49;BA.debugLine="Job.Release";
_job._release();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _performupload() throws Exception{
anywheresoftware.b4a.objects.collections.List _mylist = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _j = null;
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub PerformUpload ()";
 //BA.debugLineNum = 11;BA.debugLine="Dim mylist As List";
_mylist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="mylist.Initialize";
_mylist.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="m.Put(\"teamname\", HelperFunctions.TeamName)";
_m.Put((Object)("teamname"),(Object)(_helperfunctions._teamname));
 //BA.debugLineNum = 18;BA.debugLine="m.Put(\"avResult\", HelperFunctions.avResult)";
_m.Put((Object)("avResult"),(Object)(_helperfunctions._avresult));
 //BA.debugLineNum = 19;BA.debugLine="m.Put(\"tvResult\", HelperFunctions.tvResult)";
_m.Put((Object)("tvResult"),(Object)(_helperfunctions._tvresult));
 //BA.debugLineNum = 20;BA.debugLine="m.Put(\"exeResult\", HelperFunctions.exeResult)";
_m.Put((Object)("exeResult"),(Object)(_helperfunctions._exeresult));
 //BA.debugLineNum = 22;BA.debugLine="Log(m)";
__c.Log(BA.ObjectToString(_m));
 //BA.debugLineNum = 23;BA.debugLine="mylist.Add(m)";
_mylist.Add((Object)(_m.getObject()));
 //BA.debugLineNum = 24;BA.debugLine="Log(mylist)";
__c.Log(BA.ObjectToString(_mylist));
 //BA.debugLineNum = 25;BA.debugLine="Dim j As JSONGenerator";
_j = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 27;BA.debugLine="j.Initialize(m)";
_j.Initialize(_m);
 //BA.debugLineNum = 28;BA.debugLine="Log(j.ToPrettyString(1))";
__c.Log(_j.ToPrettyString((int) (1)));
 //BA.debugLineNum = 30;BA.debugLine="Dim job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 31;BA.debugLine="job.Initialize(\"SendResults\", Me)";
_job._initialize(ba,"SendResults",this);
 //BA.debugLineNum = 32;BA.debugLine="job.PostString(\"http://192.168.97.33:8080/results";
_job._poststring("http://192.168.97.33:8080/results",_j.ToString());
 //BA.debugLineNum = 33;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 36;BA.debugLine="ToastMessageShow(\"Sending...\", True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Sending..."),__c.True);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
