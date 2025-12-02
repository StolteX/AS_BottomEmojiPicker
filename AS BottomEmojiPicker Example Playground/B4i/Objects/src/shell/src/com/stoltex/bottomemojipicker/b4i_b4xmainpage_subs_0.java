package com.stoltex.bottomemojipicker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"frm_main\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout::",(Object)(RemoteObject.createImmutable("frm_main")),__ref.getField(false, "bi"));
 BA.debugLineNum = 24;BA.debugLine="B4XPages.SetTitle(Me,\"AS BottomActionMenu Example";
Debug.ShouldStop(8388608);
b4i_b4xmainpage._b4xpages.runVoidMethod ("_settitle::" /*RemoteObject*/ ,(Object)(__ref),(Object)((RemoteObject.createImmutable("AS BottomActionMenu Example"))));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bottomactionmenu_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("BottomActionMenu_ItemClick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,51);
if (RapidSub.canDelegate("bottomactionmenu_itemclick")) { return __ref.runUserSub(false, "b4xmainpage","bottomactionmenu_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 51;BA.debugLine="Private Sub BottomActionMenu_ItemClick (Index As I";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Log(\"Item Clicked: \" & Index)";
Debug.ShouldStop(524288);
b4i_main.__c.runVoidMethod ("LogImpl:::","011468801",RemoteObject.concat(RemoteObject.createImmutable("Item Clicked: "),_index),0);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4i_b4xmainpage._root = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_root",b4i_b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4i_b4xmainpage._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_b4xmainpage._xui);
 //BA.debugLineNum = 12;BA.debugLine="Private BottomEmojiPicker As AS_BottomEmojiPicker";
b4i_b4xmainpage._bottomemojipicker = RemoteObject.createNew ("b4i_as_bottomemojipicker");__ref.setField("_bottomemojipicker",b4i_b4xmainpage._bottomemojipicker);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _opendark(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OpenDark (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,28);
if (RapidSub.canDelegate("opendark")) { return __ref.runUserSub(false, "b4xmainpage","opendark", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Private Sub OpenDark";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
Debug.ShouldStop(536870912);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (b4i_as_bottomemojipicker.class, "_initialize::::" /*RemoteObject*/ ,__ref.getField(false, "bi"),(Object)(__ref),(Object)(BA.ObjectToString("BottomEmojiPicker")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="BottomEmojiPicker.ShowPicker";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (b4i_as_bottomemojipicker.class, "_showpicker" /*void*/ );
 BA.debugLineNum = 34;BA.debugLine="BottomEmojiPicker.Color = xui.Color_ARGB(255,32,";
Debug.ShouldStop(2);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (b4i_as_bottomemojipicker.class, "_setcolor:" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB::::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 37))));
 BA.debugLineNum = 35;BA.debugLine="BottomEmojiPicker.TextColor = xui.Color_White";
Debug.ShouldStop(4);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (b4i_as_bottomemojipicker.class, "_settextcolor:" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White"));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openlight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OpenLight (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,39);
if (RapidSub.canDelegate("openlight")) { return __ref.runUserSub(false, "b4xmainpage","openlight", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub OpenLight";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
Debug.ShouldStop(256);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (b4i_as_bottomemojipicker.class, "_initialize::::" /*RemoteObject*/ ,__ref.getField(false, "bi"),(Object)(__ref),(Object)(BA.ObjectToString("BottomEmojiPicker")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="BottomEmojiPicker.Color = xui.Color_White";
Debug.ShouldStop(1024);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (b4i_as_bottomemojipicker.class, "_setcolor:" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White"));
 BA.debugLineNum = 44;BA.debugLine="BottomEmojiPicker.TextColor = xui.Color_Black";
Debug.ShouldStop(2048);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (b4i_as_bottomemojipicker.class, "_settextcolor:" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_Black"));
 BA.debugLineNum = 46;BA.debugLine="BottomEmojiPicker.ShowPicker";
Debug.ShouldStop(8192);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (b4i_as_bottomemojipicker.class, "_showpicker" /*void*/ );
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
public static RemoteObject  _xlbl_opendark_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xlbl_OpenDark_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,58);
if (RapidSub.canDelegate("xlbl_opendark_click")) { return __ref.runUserSub(false, "b4xmainpage","xlbl_opendark_click", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Private Sub xlbl_OpenDark_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="OpenDark";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4i_b4xmainpage.class, "_opendark" /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xlbl_openlight_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xlbl_OpenLight_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,66);
if (RapidSub.canDelegate("xlbl_openlight_click")) { return __ref.runUserSub(false, "b4xmainpage","xlbl_openlight_click", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Private Sub xlbl_OpenLight_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="OpenLight";
Debug.ShouldStop(8);
__ref.runClassMethod (b4i_b4xmainpage.class, "_openlight" /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}