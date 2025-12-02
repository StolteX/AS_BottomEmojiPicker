package com.stolte.bottomactionmenu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class asdraggablebottomcard_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "asdraggablebottomcard","base_resize", __ref, _width, _height);}
RemoteObject _tmp_left = RemoteObject.createImmutable(0f);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 137;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="Dim tmp_left As Float = 0";
Debug.JustUpdateDeviceLine();
_tmp_left = BA.numberCast(float.class, 0);Debug.locals.put("tmp_left", _tmp_left);Debug.locals.put("tmp_left", _tmp_left);
 BA.debugLineNum = 139;BA.debugLine="If g_orientation = Orientation_MIDDLE Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_orientation" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_orientation_middle" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 140;BA.debugLine="tmp_left = Width/2 - g_width/2";
Debug.JustUpdateDeviceLine();
_tmp_left = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2),__ref.getField(true,"_g_width" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0));Debug.locals.put("tmp_left", _tmp_left);
 }else 
{ BA.debugLineNum = 141;BA.debugLine="Else If g_orientation = Orientation_RIGHT Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_orientation" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_orientation_right" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 142;BA.debugLine="tmp_left = Width - g_width";
Debug.JustUpdateDeviceLine();
_tmp_left = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(true,"_g_width" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("tmp_left", _tmp_left);
 }}
;
 BA.debugLineNum = 145;BA.debugLine="mDarkPanel.SetLayoutAnimated(0,0,0,Width,Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 146;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(0,tmp_left,Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _tmp_left)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_g_first_height" /*RemoteObject*/ )}, "+",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_g_width" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_g_first_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 148;BA.debugLine="xpnl_CardHeader.SetLayoutAnimated(0,0,0,g_width,g";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardheader" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(true,"_g_width" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_g_header_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 150;BA.debugLine="xpnl_CardBody.SetLayoutAnimated(0,0,g_header_heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbody" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(true,"_g_header_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_g_width" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_g_first_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 58;BA.debugLine="Private mEventName As String 'ignore";
asdraggablebottomcard._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",asdraggablebottomcard._meventname);
 //BA.debugLineNum = 59;BA.debugLine="Private mCallBack As Object 'ignore";
asdraggablebottomcard._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",asdraggablebottomcard._mcallback);
 //BA.debugLineNum = 61;BA.debugLine="Private xui As XUI 'ignore";
asdraggablebottomcard._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",asdraggablebottomcard._xui);
 //BA.debugLineNum = 62;BA.debugLine="Private mDarkPanel As B4XView";
asdraggablebottomcard._mdarkpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mdarkpanel",asdraggablebottomcard._mdarkpanel);
 //BA.debugLineNum = 64;BA.debugLine="Private downy As Float";
asdraggablebottomcard._downy = RemoteObject.createImmutable(0f);__ref.setField("_downy",asdraggablebottomcard._downy);
 //BA.debugLineNum = 65;BA.debugLine="Private old_top As Float";
asdraggablebottomcard._old_top = RemoteObject.createImmutable(0f);__ref.setField("_old_top",asdraggablebottomcard._old_top);
 //BA.debugLineNum = 67;BA.debugLine="Private g_first_height,g_second_height,g_width,g_";
asdraggablebottomcard._g_first_height = RemoteObject.createImmutable(0f);__ref.setField("_g_first_height",asdraggablebottomcard._g_first_height);
asdraggablebottomcard._g_second_height = RemoteObject.createImmutable(0f);__ref.setField("_g_second_height",asdraggablebottomcard._g_second_height);
asdraggablebottomcard._g_width = RemoteObject.createImmutable(0f);__ref.setField("_g_width",asdraggablebottomcard._g_width);
asdraggablebottomcard._g_header_height = RemoteObject.createImmutable(0f);__ref.setField("_g_header_height",asdraggablebottomcard._g_header_height);
 //BA.debugLineNum = 68;BA.debugLine="Private g_orientation As Int";
asdraggablebottomcard._g_orientation = RemoteObject.createImmutable(0);__ref.setField("_g_orientation",asdraggablebottomcard._g_orientation);
 //BA.debugLineNum = 70;BA.debugLine="Public g_show_duration As Int = 250";
asdraggablebottomcard._g_show_duration = BA.numberCast(int.class, 250);__ref.setField("_g_show_duration",asdraggablebottomcard._g_show_duration);
 //BA.debugLineNum = 71;BA.debugLine="Public g_hide_duration As Int = 700";
asdraggablebottomcard._g_hide_duration = BA.numberCast(int.class, 700);__ref.setField("_g_hide_duration",asdraggablebottomcard._g_hide_duration);
 //BA.debugLineNum = 72;BA.debugLine="Private g_darkpanel_alpha As Int = 165";
asdraggablebottomcard._g_darkpanel_alpha = BA.numberCast(int.class, 165);__ref.setField("_g_darkpanel_alpha",asdraggablebottomcard._g_darkpanel_alpha);
 //BA.debugLineNum = 73;BA.debugLine="Private g_IsDraggable As Boolean = True";
asdraggablebottomcard._g_isdraggable = asdraggablebottomcard.__c.getField(true,"True");__ref.setField("_g_isdraggable",asdraggablebottomcard._g_isdraggable);
 //BA.debugLineNum = 74;BA.debugLine="Private mDarkPanelClickable As Boolean = True";
asdraggablebottomcard._mdarkpanelclickable = asdraggablebottomcard.__c.getField(true,"True");__ref.setField("_mdarkpanelclickable",asdraggablebottomcard._mdarkpanelclickable);
 //BA.debugLineNum = 75;BA.debugLine="Private mUserCanClose As Boolean = True";
asdraggablebottomcard._musercanclose = asdraggablebottomcard.__c.getField(true,"True");__ref.setField("_musercanclose",asdraggablebottomcard._musercanclose);
 //BA.debugLineNum = 78;BA.debugLine="Private m_BodyDrag As Boolean = False";
asdraggablebottomcard._m_bodydrag = asdraggablebottomcard.__c.getField(true,"False");__ref.setField("_m_bodydrag",asdraggablebottomcard._m_bodydrag);
 //BA.debugLineNum = 79;BA.debugLine="Private expand_state As Int = 0";
asdraggablebottomcard._expand_state = BA.numberCast(int.class, 0);__ref.setField("_expand_state",asdraggablebottomcard._expand_state);
 //BA.debugLineNum = 81;BA.debugLine="Private disable_touch As Boolean = False";
asdraggablebottomcard._disable_touch = asdraggablebottomcard.__c.getField(true,"False");__ref.setField("_disable_touch",asdraggablebottomcard._disable_touch);
 //BA.debugLineNum = 83;BA.debugLine="Private last_swipe2top As Boolean = False";
asdraggablebottomcard._last_swipe2top = asdraggablebottomcard.__c.getField(true,"False");__ref.setField("_last_swipe2top",asdraggablebottomcard._last_swipe2top);
 //BA.debugLineNum = 84;BA.debugLine="Private inClosingProcess As Boolean = False";
asdraggablebottomcard._inclosingprocess = asdraggablebottomcard.__c.getField(true,"False");__ref.setField("_inclosingprocess",asdraggablebottomcard._inclosingprocess);
 //BA.debugLineNum = 89;BA.debugLine="Private xpnl_CardBase As B4XView";
asdraggablebottomcard._xpnl_cardbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_cardbase",asdraggablebottomcard._xpnl_cardbase);
 //BA.debugLineNum = 90;BA.debugLine="Private xpnl_CardHeader As B4XView";
asdraggablebottomcard._xpnl_cardheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_cardheader",asdraggablebottomcard._xpnl_cardheader);
 //BA.debugLineNum = 91;BA.debugLine="Private xpnl_CardBody As B4XView";
asdraggablebottomcard._xpnl_cardbody = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_cardbody",asdraggablebottomcard._xpnl_cardbody);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _parent,RemoteObject _first_height,RemoteObject _second_height,RemoteObject _header_height,RemoteObject _width,RemoteObject _orientation) throws Exception{
try {
		Debug.PushSubsStack("Create (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "asdraggablebottomcard","create", __ref, _parent, _first_height, _second_height, _header_height, _width, _orientation);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("Parent", _parent);
Debug.locals.put("first_height", _first_height);
Debug.locals.put("second_height", _second_height);
Debug.locals.put("header_height", _header_height);
Debug.locals.put("width", _width);
Debug.locals.put("orientation", _orientation);
 BA.debugLineNum = 108;BA.debugLine="Public Sub Create (Parent As B4XView,first_height";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="g_first_height = first_height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_first_height" /*RemoteObject*/ ,_first_height);
 BA.debugLineNum = 111;BA.debugLine="g_second_height = second_height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_second_height" /*RemoteObject*/ ,_second_height);
 BA.debugLineNum = 112;BA.debugLine="g_width = width";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_width" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 113;BA.debugLine="g_orientation = orientation";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_orientation" /*RemoteObject*/ ,_orientation);
 BA.debugLineNum = 114;BA.debugLine="g_header_height = header_height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_header_height" /*RemoteObject*/ ,_header_height);
 BA.debugLineNum = 116;BA.debugLine="ini_views(Parent)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_ini_views" /*RemoteObject*/ ,(Object)(_parent));
 BA.debugLineNum = 119;BA.debugLine="Base_Resize(Parent.Width,Parent.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _parent.runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, _parent.runMethod(true,"getHeight"))));
 BA.debugLineNum = 120;BA.debugLine="Private r As Reflector";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 121;BA.debugLine="r.Target = xpnl_CardBase";
Debug.JustUpdateDeviceLine();
_r.setField ("Target",(__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 122;BA.debugLine="r.SetOnTouchListener(\"xpnl_CardHeader_Touch2\")";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("SetOnTouchListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_CardHeader_Touch2")));
 BA.debugLineNum = 134;BA.debugLine="Base_Resize(Parent.Width,Parent.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _parent.runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, _parent.runMethod(true,"getHeight"))));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expandfull(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExpandFull (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("expandfull")) { return __ref.runUserSub(false, "asdraggablebottomcard","expandfull", __ref);}
 BA.debugLineNum = 382;BA.debugLine="Public Sub ExpandFull";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 383;BA.debugLine="expand_state = 2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expand_state" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 384;BA.debugLine="ShowIntern(True,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_showintern" /*void*/ ,(Object)(asdraggablebottomcard.__c.getField(true,"True")),(Object)(asdraggablebottomcard.__c.getField(true,"True")));
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expandhalf(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExpandHalf (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("expandhalf")) { return __ref.runUserSub(false, "asdraggablebottomcard","expandhalf", __ref);}
 BA.debugLineNum = 387;BA.debugLine="Public Sub ExpandHalf";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 388;BA.debugLine="expand_state = 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expand_state" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 389;BA.debugLine="ShowIntern(True,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_showintern" /*void*/ ,(Object)(asdraggablebottomcard.__c.getField(true,"True")),(Object)(asdraggablebottomcard.__c.getField(true,"False")));
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodydrag(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBodyDrag (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,459);
if (RapidSub.canDelegate("getbodydrag")) { return __ref.runUserSub(false, "asdraggablebottomcard","getbodydrag", __ref);}
 BA.debugLineNum = 459;BA.debugLine="Public Sub getBodyDrag As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 460;BA.debugLine="Return m_BodyDrag";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_bodydrag" /*RemoteObject*/ );
 BA.debugLineNum = 461;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodypanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBodyPanel (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,401);
if (RapidSub.canDelegate("getbodypanel")) { return __ref.runUserSub(false, "asdraggablebottomcard","getbodypanel", __ref);}
 BA.debugLineNum = 401;BA.debugLine="Public Sub getBodyPanel As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 402;BA.debugLine="Return xpnl_CardBody";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_cardbody" /*RemoteObject*/ );
 BA.debugLineNum = 403;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcardbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCardBase (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("getcardbase")) { return __ref.runUserSub(false, "asdraggablebottomcard","getcardbase", __ref);}
 BA.debugLineNum = 341;BA.debugLine="Public Sub getCardBase As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 342;BA.debugLine="Return xpnl_CardBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ );
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdarkpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDarkPanel (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,337);
if (RapidSub.canDelegate("getdarkpanel")) { return __ref.runUserSub(false, "asdraggablebottomcard","getdarkpanel", __ref);}
 BA.debugLineNum = 337;BA.debugLine="Public Sub getDarkPanel As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 338;BA.debugLine="Return mDarkPanel";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mdarkpanel" /*RemoteObject*/ );
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdarkpanelalpha(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDarkPanelAlpha (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,441);
if (RapidSub.canDelegate("getdarkpanelalpha")) { return __ref.runUserSub(false, "asdraggablebottomcard","getdarkpanelalpha", __ref);}
 BA.debugLineNum = 441;BA.debugLine="Public Sub getDarkPanelAlpha As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 442;BA.debugLine="Return g_darkpanel_alpha";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_darkpanel_alpha" /*RemoteObject*/ );
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdarkpanelclickable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDarkPanelClickable (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,445);
if (RapidSub.canDelegate("getdarkpanelclickable")) { return __ref.runUserSub(false, "asdraggablebottomcard","getdarkpanelclickable", __ref);}
 BA.debugLineNum = 445;BA.debugLine="Public Sub getDarkPanelClickable As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 446;BA.debugLine="Return mDarkPanelClickable";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mdarkpanelclickable" /*RemoteObject*/ );
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfirstheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFirstHeight (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,345);
if (RapidSub.canDelegate("getfirstheight")) { return __ref.runUserSub(false, "asdraggablebottomcard","getfirstheight", __ref);}
 BA.debugLineNum = 345;BA.debugLine="Public Sub getFirstHeight As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 346;BA.debugLine="Return g_first_height";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_first_height" /*RemoteObject*/ );
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheaderheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderHeight (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,369);
if (RapidSub.canDelegate("getheaderheight")) { return __ref.runUserSub(false, "asdraggablebottomcard","getheaderheight", __ref);}
 BA.debugLineNum = 369;BA.debugLine="Public Sub getHeaderHeight As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 370;BA.debugLine="Return g_header_height";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_header_height" /*RemoteObject*/ );
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheaderpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderPanel (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,392);
if (RapidSub.canDelegate("getheaderpanel")) { return __ref.runUserSub(false, "asdraggablebottomcard","getheaderpanel", __ref);}
 BA.debugLineNum = 392;BA.debugLine="Public Sub getHeaderPanel As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 393;BA.debugLine="Return xpnl_CardHeader";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_cardheader" /*RemoteObject*/ );
 BA.debugLineNum = 394;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getisdraggable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIsDraggable (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,437);
if (RapidSub.canDelegate("getisdraggable")) { return __ref.runUserSub(false, "asdraggablebottomcard","getisdraggable", __ref);}
 BA.debugLineNum = 437;BA.debugLine="Public Sub getIsDraggable As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 438;BA.debugLine="Return g_IsDraggable";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_isdraggable" /*RemoteObject*/ );
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getisopen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIsOpen (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,421);
if (RapidSub.canDelegate("getisopen")) { return __ref.runUserSub(false, "asdraggablebottomcard","getisopen", __ref);}
 BA.debugLineNum = 421;BA.debugLine="Public Sub getIsOpen As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 422;BA.debugLine="If expand_state = 0 Then Return False Else Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_expand_state" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return asdraggablebottomcard.__c.getField(true,"False");}
else {
if (true) return asdraggablebottomcard.__c.getField(true,"True");};
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getisopenfull(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIsOpenFull (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,429);
if (RapidSub.canDelegate("getisopenfull")) { return __ref.runUserSub(false, "asdraggablebottomcard","getisopenfull", __ref);}
 BA.debugLineNum = 429;BA.debugLine="Public Sub getIsOpenFull As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 430;BA.debugLine="If expand_state = 2 Then Return True Else Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_expand_state" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
if (true) return asdraggablebottomcard.__c.getField(true,"True");}
else {
if (true) return asdraggablebottomcard.__c.getField(true,"False");};
 BA.debugLineNum = 431;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getisopenhalf(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIsOpenHalf (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,425);
if (RapidSub.canDelegate("getisopenhalf")) { return __ref.runUserSub(false, "asdraggablebottomcard","getisopenhalf", __ref);}
 BA.debugLineNum = 425;BA.debugLine="Public Sub getIsOpenHalf As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 426;BA.debugLine="If expand_state = 1 Then Return True Else Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_expand_state" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
if (true) return asdraggablebottomcard.__c.getField(true,"True");}
else {
if (true) return asdraggablebottomcard.__c.getField(true,"False");};
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsecondheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSecondHeight (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,357);
if (RapidSub.canDelegate("getsecondheight")) { return __ref.runUserSub(false, "asdraggablebottomcard","getsecondheight", __ref);}
 BA.debugLineNum = 357;BA.debugLine="Public Sub getSecondHeight As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 358;BA.debugLine="Return g_second_height";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_second_height" /*RemoteObject*/ );
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getusercanclose(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getUserCanClose (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("getusercanclose")) { return __ref.runUserSub(false, "asdraggablebottomcard","getusercanclose", __ref);}
 BA.debugLineNum = 329;BA.debugLine="Public Sub getUserCanClose As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 330;BA.debugLine="Return mUserCanClose";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_musercanclose" /*RemoteObject*/ );
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handletouch(RemoteObject __ref,RemoteObject _action,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("HandleTouch (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,282);
if (RapidSub.canDelegate("handletouch")) { return __ref.runUserSub(false, "asdraggablebottomcard","handletouch", __ref, _action, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("y", _y);
 BA.debugLineNum = 282;BA.debugLine="Private Sub HandleTouch(Action As Int,y As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 283;BA.debugLine="If g_IsDraggable = False Or disable_touch = True";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_isdraggable" /*RemoteObject*/ ),asdraggablebottomcard.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_disable_touch" /*RemoteObject*/ ),asdraggablebottomcard.__c.getField(true,"True"))) { 
if (true) return asdraggablebottomcard.__c.getField(true,"False");};
 BA.debugLineNum = 284;BA.debugLine="If Action = xpnl_CardBase.TOUCH_ACTION_DOWN Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 285;BA.debugLine="downy  = y";
Debug.JustUpdateDeviceLine();
__ref.setField ("_downy" /*RemoteObject*/ ,_y);
 };
 BA.debugLineNum = 288;BA.debugLine="VisibleBodyHeightChanged";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_visiblebodyheightchanged" /*RemoteObject*/ );
 BA.debugLineNum = 290;BA.debugLine="If Action = xpnl_CardBase.TOUCH_ACTION_DOWN Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 292;BA.debugLine="old_top = xpnl_CardBase.Top";
Debug.JustUpdateDeviceLine();
__ref.setField ("_old_top" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"getTop")));
 }else 
{ BA.debugLineNum = 294;BA.debugLine="Else if Action = xpnl_CardBase.TOUCH_ACTION_MOVE";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE")))) { 
 BA.debugLineNum = 295;BA.debugLine="If y < downy Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_y,BA.numberCast(double.class, __ref.getField(true,"_downy" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 296;BA.debugLine="last_swipe2top = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_last_swipe2top" /*RemoteObject*/ ,asdraggablebottomcard.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 298;BA.debugLine="last_swipe2top = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_last_swipe2top" /*RemoteObject*/ ,asdraggablebottomcard.__c.getField(true,"False"));
 };
 BA.debugLineNum = 301;BA.debugLine="If mUserCanClose = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_musercanclose" /*RemoteObject*/ ),asdraggablebottomcard.__c.getField(true,"True"))) { 
 BA.debugLineNum = 302;BA.debugLine="xpnl_CardBase.Top = Max(mDarkPanel.Height - g_s";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, asdraggablebottomcard.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_g_second_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "--",2, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"getTop"),_y,__ref.getField(true,"_downy" /*RemoteObject*/ )}, "+-",2, 0)))));
 }else {
 BA.debugLineNum = 304;BA.debugLine="xpnl_CardBase.Top = Min(mDarkPanel.Height - g_f";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, asdraggablebottomcard.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_g_first_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "--",2, 0)),(Object)(asdraggablebottomcard.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_g_second_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "--",2, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"getTop"),_y,__ref.getField(true,"_downy" /*RemoteObject*/ )}, "+-",2, 0)))))));
 };
 BA.debugLineNum = 307;BA.debugLine="If xpnl_CardBase.Top < (mDarkPanel.Height - g_fi";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_g_first_height" /*RemoteObject*/ )}, "-",1, 0)))) { 
 BA.debugLineNum = 308;BA.debugLine="expand_state = 2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expand_state" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 309;BA.debugLine="xpnl_CardBody.Height = g_second_height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbody" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, __ref.getField(true,"_g_second_height" /*RemoteObject*/ )));
 BA.debugLineNum = 310;BA.debugLine="xpnl_CardBase.Height = g_second_height + g_head";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_second_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "+",1, 0)));
 }else {
 BA.debugLineNum = 313;BA.debugLine="expand_state = 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expand_state" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 315;BA.debugLine="VisibleBodyHeightChanged";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_visiblebodyheightchanged" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 316;BA.debugLine="Else if Action = xpnl_CardBase.TOUCH_ACTION_UP Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 317;BA.debugLine="If expand_state = 1 And old_top < xpnl_CardBase.";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_expand_state" /*RemoteObject*/ ),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("<",__ref.getField(true,"_old_top" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"getTop"))) && RemoteObject.solveBoolean("=",__ref.getField(true,"_last_swipe2top" /*RemoteObject*/ ),asdraggablebottomcard.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_musercanclose" /*RemoteObject*/ ),asdraggablebottomcard.__c.getField(true,"True"))) { 
 BA.debugLineNum = 318;BA.debugLine="Hide(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_hide" /*void*/ ,(Object)(asdraggablebottomcard.__c.getField(true,"False")));
 }else 
{ BA.debugLineNum = 319;BA.debugLine="Else if expand_state = 2 And old_top < xpnl_Card";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_expand_state" /*RemoteObject*/ ),BA.numberCast(double.class, 2)) && RemoteObject.solveBoolean("<",__ref.getField(true,"_old_top" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"getTop")))) { 
 BA.debugLineNum = 320;BA.debugLine="expand_state = 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expand_state" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 321;BA.debugLine="ShowIntern(True,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_showintern" /*void*/ ,(Object)(asdraggablebottomcard.__c.getField(true,"True")),(Object)(asdraggablebottomcard.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 323;BA.debugLine="ShowIntern(True,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_showintern" /*void*/ ,(Object)(asdraggablebottomcard.__c.getField(true,"True")),(Object)(asdraggablebottomcard.__c.getField(true,"True")));
 }}
;
 }}}
;
 BA.debugLineNum = 326;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return asdraggablebottomcard.__c.getField(true,"True");
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _hide(RemoteObject __ref,RemoteObject _ignore_event) throws Exception{
try {
		Debug.PushSubsStack("Hide (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("hide")) { __ref.runUserSub(false, "asdraggablebottomcard","hide", __ref, _ignore_event); return;}
ResumableSub_Hide rsub = new ResumableSub_Hide(null,__ref,_ignore_event);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Hide extends BA.ResumableSub {
public ResumableSub_Hide(com.stolte.bottomactionmenu.asdraggablebottomcard parent,RemoteObject __ref,RemoteObject _ignore_event) {
this.parent = parent;
this.__ref = __ref;
this._ignore_event = _ignore_event;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.stolte.bottomactionmenu.asdraggablebottomcard parent;
RemoteObject _ignore_event;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Hide (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,231);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("ignore_event", _ignore_event);
 BA.debugLineNum = 232;BA.debugLine="If inClosingProcess Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_inclosingprocess" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 233;BA.debugLine="inClosingProcess = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_inclosingprocess" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 234;BA.debugLine="expand_state = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expand_state" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 235;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Close\",";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Close"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 236;BA.debugLine="CallSub(mCallBack,mEventName & \"_Close\")";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Close"))));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 239;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(g_hide_duration,x";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_g_hide_duration" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_g_first_height" /*RemoteObject*/ )}, "+",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_g_width" /*RemoteObject*/ ))),(Object)(__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 241;BA.debugLine="mDarkPanel.SetVisibleAnimated(g_hide_duration,Fal";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(__ref.getField(true,"_g_hide_duration" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 242;BA.debugLine="If ignore_event = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_ignore_event,parent.__c.getField(true,"False"))) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 243;BA.debugLine="Sleep(g_hide_duration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asdraggablebottomcard", "hide"),__ref.getField(true,"_g_hide_duration" /*RemoteObject*/ ));
this.state = 21;
return;
case 21:
//C
this.state = 14;
;
 BA.debugLineNum = 244;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Closed";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 17;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Closed"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 245;BA.debugLine="CallSub(mCallBack,mEventName & \"_Closed\")";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Closed"))));
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 248;BA.debugLine="Sleep(g_hide_duration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asdraggablebottomcard", "hide"),__ref.getField(true,"_g_hide_duration" /*RemoteObject*/ ));
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 250;BA.debugLine="xpnl_CardBase.Height = g_first_height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, __ref.getField(true,"_g_first_height" /*RemoteObject*/ )));
 BA.debugLineNum = 251;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asdraggablebottomcard", "hide"),BA.numberCast(int.class, 0));
this.state = 23;
return;
case 23:
//C
this.state = -1;
;
 BA.debugLineNum = 252;BA.debugLine="inClosingProcess = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_inclosingprocess" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _ini_views(RemoteObject __ref,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("ini_views (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("ini_views")) { return __ref.runUserSub(false, "asdraggablebottomcard","ini_views", __ref, _parent);}
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 176;BA.debugLine="Private Sub ini_views(Parent As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="xpnl_CardBase = xui.CreatePanel(\"xpnl_CardBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_cardbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_CardBase"))));
 BA.debugLineNum = 178;BA.debugLine="xpnl_CardHeader = xui.CreatePanel(\"xpnl_header\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_cardheader" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_header"))));
 BA.debugLineNum = 179;BA.debugLine="xpnl_CardBody = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_cardbody" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 180;BA.debugLine="mDarkPanel = xui.CreatePanel(\"mDarkPanel\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdarkpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mDarkPanel"))));
 BA.debugLineNum = 181;BA.debugLine="Parent.AddView(mDarkPanel,0,0,0,0)";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 182;BA.debugLine="Parent.AddView(xpnl_CardBase,0,0,0,0)";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 183;BA.debugLine="xpnl_CardBase.AddView(xpnl_CardHeader,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_cardheader" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 184;BA.debugLine="xpnl_CardBase.AddView(xpnl_CardBody,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_cardbody" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 186;BA.debugLine="mDarkPanel.Color = xui.Color_ARGB(g_darkpanel_alp";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(__ref.getField(true,"_g_darkpanel_alpha" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 187;BA.debugLine="mDarkPanel.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",asdraggablebottomcard.__c.getField(true,"False"));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "asdraggablebottomcard","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 102;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 104;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mdarkpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mDarkPanel_Click (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("mdarkpanel_click")) { return __ref.runUserSub(false, "asdraggablebottomcard","mdarkpanel_click", __ref);}
 BA.debugLineNum = 481;BA.debugLine="Private Sub mDarkPanel_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 482;BA.debugLine="If mDarkPanelClickable = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mdarkpanelclickable" /*RemoteObject*/ ),asdraggablebottomcard.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 483;BA.debugLine="mDarkPanel.Enabled = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"setEnabled",asdraggablebottomcard.__c.getField(true,"False"));
 BA.debugLineNum = 484;BA.debugLine="Hide(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_hide" /*void*/ ,(Object)(asdraggablebottomcard.__c.getField(true,"False")));
 BA.debugLineNum = 485;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _orientation_left(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Orientation_LEFT (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,409);
if (RapidSub.canDelegate("orientation_left")) { return __ref.runUserSub(false, "asdraggablebottomcard","orientation_left", __ref);}
 BA.debugLineNum = 409;BA.debugLine="Public Sub Orientation_LEFT As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 410;BA.debugLine="Return 0";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _orientation_middle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Orientation_MIDDLE (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,413);
if (RapidSub.canDelegate("orientation_middle")) { return __ref.runUserSub(false, "asdraggablebottomcard","orientation_middle", __ref);}
 BA.debugLineNum = 413;BA.debugLine="Public Sub Orientation_MIDDLE As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 414;BA.debugLine="Return 1";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, 1);
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _orientation_right(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Orientation_RIGHT (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,417);
if (RapidSub.canDelegate("orientation_right")) { return __ref.runUserSub(false, "asdraggablebottomcard","orientation_right", __ref);}
 BA.debugLineNum = 417;BA.debugLine="Public Sub Orientation_RIGHT As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 418;BA.debugLine="Return 2";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, 2);
 BA.debugLineNum = 419;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbodydrag(RemoteObject __ref,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("setBodyDrag (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,463);
if (RapidSub.canDelegate("setbodydrag")) { return __ref.runUserSub(false, "asdraggablebottomcard","setbodydrag", __ref, _enabled);}
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 463;BA.debugLine="Public Sub setBodyDrag(Enabled As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 464;BA.debugLine="m_BodyDrag = Enabled";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_bodydrag" /*RemoteObject*/ ,_enabled);
 BA.debugLineNum = 465;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbodypanel(RemoteObject __ref,RemoteObject _bodypanel) throws Exception{
try {
		Debug.PushSubsStack("setBodyPanel (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,405);
if (RapidSub.canDelegate("setbodypanel")) { return __ref.runUserSub(false, "asdraggablebottomcard","setbodypanel", __ref, _bodypanel);}
Debug.locals.put("BodyPanel", _bodypanel);
 BA.debugLineNum = 405;BA.debugLine="Public Sub setBodyPanel(BodyPanel As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 406;BA.debugLine="xpnl_CardBody = BodyPanel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_cardbody" /*RemoteObject*/ ,_bodypanel);
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcircleclip(RemoteObject __ref,RemoteObject _pnl,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("SetCircleClip (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("setcircleclip")) { return __ref.runUserSub(false, "asdraggablebottomcard","setcircleclip", __ref, _pnl, _radius);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("pnl", _pnl);
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 157;BA.debugLine="Private Sub SetCircleClip (pnl As B4XView,radius A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 171;BA.debugLine="Dim jo As JavaObject = pnl";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnl.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 172;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(True))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setClipToOutline")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(asdraggablebottomcard.__c.getField(true,"True"))})));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcornerradius_header(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setCornerRadius_Header (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("setcornerradius_header")) { return __ref.runUserSub(false, "asdraggablebottomcard","setcornerradius_header", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 374;BA.debugLine="Public Sub setCornerRadius_Header(radius As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 376;BA.debugLine="xpnl_CardHeader.Height = g_header_height * 2";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardheader" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_header_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 0)));
 BA.debugLineNum = 378;BA.debugLine="xpnl_CardHeader.SetColorAndBorder(xpnl_CardHeader";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardheader" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xpnl_cardheader" /*RemoteObject*/ ).runMethod(true,"getColor")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _radius)));
 BA.debugLineNum = 379;BA.debugLine="SetCircleClip(xpnl_CardHeader,radius)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_setcircleclip" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xpnl_cardheader" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _radius)));
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdarkpanelalpha(RemoteObject __ref,RemoteObject _alpha) throws Exception{
try {
		Debug.PushSubsStack("setDarkPanelAlpha (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,453);
if (RapidSub.canDelegate("setdarkpanelalpha")) { return __ref.runUserSub(false, "asdraggablebottomcard","setdarkpanelalpha", __ref, _alpha);}
Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 453;BA.debugLine="Public Sub setDarkPanelAlpha(alpha As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 454;BA.debugLine="If alpha >= 0 And alpha <=255 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_alpha,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",_alpha,BA.numberCast(double.class, 255))) { 
 BA.debugLineNum = 455;BA.debugLine="g_darkpanel_alpha = alpha";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_darkpanel_alpha" /*RemoteObject*/ ,_alpha);
 };
 BA.debugLineNum = 457;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdarkpanelclickable(RemoteObject __ref,RemoteObject _clickable) throws Exception{
try {
		Debug.PushSubsStack("setDarkPanelClickable (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,449);
if (RapidSub.canDelegate("setdarkpanelclickable")) { return __ref.runUserSub(false, "asdraggablebottomcard","setdarkpanelclickable", __ref, _clickable);}
Debug.locals.put("Clickable", _clickable);
 BA.debugLineNum = 449;BA.debugLine="Public Sub setDarkPanelClickable(Clickable As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 450;BA.debugLine="mDarkPanelClickable = Clickable";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdarkpanelclickable" /*RemoteObject*/ ,_clickable);
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfirstheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("setFirstHeight (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("setfirstheight")) { return __ref.runUserSub(false, "asdraggablebottomcard","setfirstheight", __ref, _height);}
Debug.locals.put("height", _height);
 BA.debugLineNum = 350;BA.debugLine="Public Sub setFirstHeight(height As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 351;BA.debugLine="g_first_height = height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_first_height" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 352;BA.debugLine="If expand_state = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_expand_state" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 353;BA.debugLine="ExpandHalf";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_expandhalf" /*RemoteObject*/ );
 };
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheaderpanel(RemoteObject __ref,RemoteObject _headerpanel) throws Exception{
try {
		Debug.PushSubsStack("setHeaderPanel (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,396);
if (RapidSub.canDelegate("setheaderpanel")) { return __ref.runUserSub(false, "asdraggablebottomcard","setheaderpanel", __ref, _headerpanel);}
Debug.locals.put("HeaderPanel", _headerpanel);
 BA.debugLineNum = 396;BA.debugLine="Public Sub setHeaderPanel(HeaderPanel As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 397;BA.debugLine="xpnl_CardHeader = HeaderPanel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_cardheader" /*RemoteObject*/ ,_headerpanel);
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setisdraggable(RemoteObject __ref,RemoteObject _draggable) throws Exception{
try {
		Debug.PushSubsStack("setIsDraggable (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,433);
if (RapidSub.canDelegate("setisdraggable")) { return __ref.runUserSub(false, "asdraggablebottomcard","setisdraggable", __ref, _draggable);}
Debug.locals.put("draggable", _draggable);
 BA.debugLineNum = 433;BA.debugLine="Public Sub setIsDraggable(draggable As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 434;BA.debugLine="g_IsDraggable = draggable";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_isdraggable" /*RemoteObject*/ ,_draggable);
 BA.debugLineNum = 435;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsecondheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("setSecondHeight (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,362);
if (RapidSub.canDelegate("setsecondheight")) { return __ref.runUserSub(false, "asdraggablebottomcard","setsecondheight", __ref, _height);}
Debug.locals.put("height", _height);
 BA.debugLineNum = 362;BA.debugLine="Public Sub setSecondHeight(height As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 363;BA.debugLine="g_second_height = height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_second_height" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 364;BA.debugLine="If expand_state = 2 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_expand_state" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 365;BA.debugLine="ExpandFull";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_expandfull" /*RemoteObject*/ );
 };
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setusercanclose(RemoteObject __ref,RemoteObject _canclose) throws Exception{
try {
		Debug.PushSubsStack("setUserCanClose (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("setusercanclose")) { return __ref.runUserSub(false, "asdraggablebottomcard","setusercanclose", __ref, _canclose);}
Debug.locals.put("CanClose", _canclose);
 BA.debugLineNum = 333;BA.debugLine="Public Sub setUserCanClose(CanClose As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 334;BA.debugLine="mUserCanClose = CanClose";
Debug.JustUpdateDeviceLine();
__ref.setField ("_musercanclose" /*RemoteObject*/ ,_canclose);
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _ignore_event) throws Exception{
try {
		Debug.PushSubsStack("Show (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "asdraggablebottomcard","show", __ref, _ignore_event);}
Debug.locals.put("ignore_event", _ignore_event);
 BA.debugLineNum = 190;BA.debugLine="Public Sub Show(ignore_event As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="ShowIntern(ignore_event,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_showintern" /*void*/ ,(Object)(_ignore_event),(Object)(asdraggablebottomcard.__c.getField(true,"False")));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _showintern(RemoteObject __ref,RemoteObject _ignore_event,RemoteObject _fromtouch) throws Exception{
try {
		Debug.PushSubsStack("ShowIntern (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("showintern")) { __ref.runUserSub(false, "asdraggablebottomcard","showintern", __ref, _ignore_event, _fromtouch); return;}
ResumableSub_ShowIntern rsub = new ResumableSub_ShowIntern(null,__ref,_ignore_event,_fromtouch);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ShowIntern extends BA.ResumableSub {
public ResumableSub_ShowIntern(com.stolte.bottomactionmenu.asdraggablebottomcard parent,RemoteObject __ref,RemoteObject _ignore_event,RemoteObject _fromtouch) {
this.parent = parent;
this.__ref = __ref;
this._ignore_event = _ignore_event;
this._fromtouch = _fromtouch;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.stolte.bottomactionmenu.asdraggablebottomcard parent;
RemoteObject _ignore_event;
RemoteObject _fromtouch;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowIntern (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,194);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("ignore_event", _ignore_event);
Debug.locals.put("fromtouch", _fromtouch);
 BA.debugLineNum = 196;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Open\",0";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Open"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 197;BA.debugLine="CallSub(mCallBack,mEventName & \"_Open\")";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Open"))));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 199;BA.debugLine="mDarkPanel.Enabled = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 200;BA.debugLine="If mDarkPanel.Visible = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"getVisible"),parent.__c.getField(true,"False"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 201;BA.debugLine="mDarkPanel.SetVisibleAnimated(g_show_duration,Tr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(__ref.getField(true,"_g_show_duration" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 203;BA.debugLine="disable_touch = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_disable_touch" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 204;BA.debugLine="If expand_state = 1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_expand_state" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 20;
 BA.debugLineNum = 205;BA.debugLine="xpnl_CardBase.Height = g_second_height + g_heade";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_second_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "+",1, 0)));
 BA.debugLineNum = 206;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(g_show_duration,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_g_show_duration" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_g_first_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "--",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_g_width" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_second_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "+",1, 0))));
 BA.debugLineNum = 207;BA.debugLine="xpnl_CardBody.Height = g_second_height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbody" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, __ref.getField(true,"_g_second_height" /*RemoteObject*/ )));
 BA.debugLineNum = 208;BA.debugLine="Sleep(g_show_duration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asdraggablebottomcard", "showintern"),__ref.getField(true,"_g_show_duration" /*RemoteObject*/ ));
this.state = 31;
return;
case 31:
//C
this.state = 20;
;
 BA.debugLineNum = 209;BA.debugLine="xpnl_CardBase.Height = g_first_height + g_header";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_first_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "+",1, 0)));
 BA.debugLineNum = 210;BA.debugLine="xpnl_CardBody.Height = g_first_height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbody" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, __ref.getField(true,"_g_first_height" /*RemoteObject*/ )));
 BA.debugLineNum = 211;BA.debugLine="VisibleBodyHeightChanged";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_visiblebodyheightchanged" /*RemoteObject*/ );
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 213;BA.debugLine="xpnl_CardBase.Height = g_second_height + g_heade";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_second_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "+",1, 0)));
 BA.debugLineNum = 214;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(g_show_duration,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_g_show_duration" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_xpnl_cardbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_g_second_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "--",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_g_width" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_g_second_height" /*RemoteObject*/ ),__ref.getField(true,"_g_header_height" /*RemoteObject*/ )}, "+",1, 0))));
 BA.debugLineNum = 215;BA.debugLine="xpnl_CardBody.Height = g_second_height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_cardbody" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, __ref.getField(true,"_g_second_height" /*RemoteObject*/ )));
 BA.debugLineNum = 216;BA.debugLine="VisibleBodyHeightChanged";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_visiblebodyheightchanged" /*RemoteObject*/ );
 BA.debugLineNum = 217;BA.debugLine="If fromtouch = False Then Sleep(g_show_duration)";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_fromtouch,parent.__c.getField(true,"False"))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asdraggablebottomcard", "showintern"),__ref.getField(true,"_g_show_duration" /*RemoteObject*/ ));
this.state = 32;
return;
case 32:
//C
this.state = 19;
;
if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 220;BA.debugLine="disable_touch = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_disable_touch" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 221;BA.debugLine="expand_state = 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expand_state" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 222;BA.debugLine="If ignore_event = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 21:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_ignore_event,parent.__c.getField(true,"False"))) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 224;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Opened";
Debug.JustUpdateDeviceLine();
if (true) break;

case 24:
//if
this.state = 27;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Opened"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 225;BA.debugLine="CallSub(mCallBack,mEventName & \"_Opened\")";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Opened"))));
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _visiblebodyheightchanged(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("VisibleBodyHeightChanged (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("visiblebodyheightchanged")) { return __ref.runUserSub(false, "asdraggablebottomcard","visiblebodyheightchanged", __ref);}
 BA.debugLineNum = 467;BA.debugLine="Private Sub VisibleBodyHeightChanged";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 468;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Visible";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VisibleBodyHeightChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 469;BA.debugLine="CallSub2(mCallBack,mEventName & \"_VisibleBodyHei";
Debug.JustUpdateDeviceLine();
asdraggablebottomcard.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VisibleBodyHeightChanged"))),(Object)((__ref.getField(false,"_xpnl_cardbody" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 };
 BA.debugLineNum = 472;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_cardheader_touch2(RemoteObject __ref,RemoteObject _viewtag,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("xpnl_CardHeader_Touch2 (asdraggablebottomcard) ","asdraggablebottomcard",4,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("xpnl_cardheader_touch2")) { return __ref.runUserSub(false, "asdraggablebottomcard","xpnl_cardheader_touch2", __ref, _viewtag, _action, _x, _y, _motionevent);}
Debug.locals.put("ViewTag", _viewtag);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 257;BA.debugLine="Private Sub xpnl_CardHeader_Touch2(ViewTag As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 258;BA.debugLine="Return HandleTouch(Action,y)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_handletouch" /*RemoteObject*/ ,(Object)(_action),(Object)(_y));
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}