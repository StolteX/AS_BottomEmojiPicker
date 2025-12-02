package com.stolte.bottomactionmenu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Root = Root1";
Debug.ShouldStop(2097152);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"frm_main\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frm_main")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="B4XPages.SetTitle(Me,\"AS BottomEmojiPicker Exampl";
Debug.ShouldStop(16777216);
b4xmainpage._b4xpages.runVoidMethod ("_settitle" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("AS BottomEmojiPicker Example"))));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bottomemojipicker_emojiselected(RemoteObject __ref,RemoteObject _emoji) throws Exception{
try {
		Debug.PushSubsStack("BottomEmojiPicker_EmojiSelected (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("bottomemojipicker_emojiselected")) { return __ref.runUserSub(false, "b4xmainpage","bottomemojipicker_emojiselected", __ref, _emoji);}
Debug.locals.put("Emoji", _emoji);
 BA.debugLineNum = 70;BA.debugLine="Private Sub BottomEmojiPicker_EmojiSelected (Emoji";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="xlbl_EmojiResult.Text = xlbl_EmojiResult.Text & E";
Debug.ShouldStop(64);
__ref.getField(false,"_xlbl_emojiresult" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_xlbl_emojiresult" /*RemoteObject*/ ).runMethod(true,"getText"),_emoji)));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 12;BA.debugLine="Private BottomEmojiPicker As AS_BottomEmojiPicker";
b4xmainpage._bottomemojipicker = RemoteObject.createNew ("com.stolte.bottomactionmenu.as_bottomemojipicker");__ref.setField("_bottomemojipicker",b4xmainpage._bottomemojipicker);
 //BA.debugLineNum = 13;BA.debugLine="Private xlbl_EmojiResult As B4XView";
b4xmainpage._xlbl_emojiresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xlbl_emojiresult",b4xmainpage._xlbl_emojiresult);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
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
public static RemoteObject  _opencustom(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OpenCustom (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("opencustom")) { return __ref.runUserSub(false, "b4xmainpage","opencustom", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Private Sub OpenCustom";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
Debug.ShouldStop(16777216);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("BottomEmojiPicker")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 59;BA.debugLine="BottomEmojiPicker.BackgroundColor = xui.Color_ARG";
Debug.ShouldStop(67108864);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 37))));
 BA.debugLineNum = 60;BA.debugLine="BottomEmojiPicker.CategoryTextColor = xui.Color_W";
Debug.ShouldStop(134217728);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setcategorytextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 61;BA.debugLine="BottomEmojiPicker.CategoryIndicatorColor = xui.Co";
Debug.ShouldStop(268435456);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setcategoryindicatorcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 62;BA.debugLine="BottomEmojiPicker.EmojiSize = 50";
Debug.ShouldStop(536870912);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setemojisize" /*RemoteObject*/ ,BA.numberCast(int.class, 50));
 BA.debugLineNum = 63;BA.debugLine="BottomEmojiPicker.BodyHeight = 300dip";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setbodyheight" /*RemoteObject*/ ,BA.numberCast(float.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 64;BA.debugLine="BottomEmojiPicker.Rows = 3";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setrows" /*RemoteObject*/ ,BA.numberCast(int.class, 3));
 BA.debugLineNum = 66;BA.debugLine="BottomEmojiPicker.ShowPicker";
Debug.ShouldStop(2);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_showpicker" /*void*/ );
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _opendark(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OpenDark (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("opendark")) { __ref.runUserSub(false, "b4xmainpage","opendark", __ref); return;}
ResumableSub_OpenDark rsub = new ResumableSub_OpenDark(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_OpenDark extends BA.ResumableSub {
public ResumableSub_OpenDark(com.stolte.bottomactionmenu.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.stolte.bottomactionmenu.b4xmainpage parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("OpenDark (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 31;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("BottomEmojiPicker")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="BottomEmojiPicker.BackgroundColor = xui.Color_ARG";
Debug.ShouldStop(1);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 37))));
 BA.debugLineNum = 34;BA.debugLine="BottomEmojiPicker.CategoryTextColor = xui.Color_W";
Debug.ShouldStop(2);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setcategorytextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 35;BA.debugLine="BottomEmojiPicker.CategoryIndicatorColor = xui.Co";
Debug.ShouldStop(4);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setcategoryindicatorcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 37;BA.debugLine="BottomEmojiPicker.ShowPicker";
Debug.ShouldStop(16);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_showpicker" /*void*/ );
 BA.debugLineNum = 38;BA.debugLine="Sleep(5000)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "opendark"),BA.numberCast(int.class, 5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 39;BA.debugLine="Log(\"jetzt\")";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","2786442",RemoteObject.createImmutable("jetzt"),0);
 BA.debugLineNum = 40;BA.debugLine="BottomEmojiPicker.HidePicker";
Debug.ShouldStop(128);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_hidepicker" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static RemoteObject  _openlight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OpenLight (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("openlight")) { return __ref.runUserSub(false, "b4xmainpage","openlight", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Private Sub OpenLight";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
Debug.ShouldStop(4096);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("BottomEmojiPicker")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="BottomEmojiPicker.BackgroundColor = xui.Color_Whi";
Debug.ShouldStop(16384);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 48;BA.debugLine="BottomEmojiPicker.CategoryTextColor = xui.Color_B";
Debug.ShouldStop(32768);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setcategorytextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 49;BA.debugLine="BottomEmojiPicker.CategoryIndicatorColor = xui.Co";
Debug.ShouldStop(65536);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_setcategoryindicatorcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 51;BA.debugLine="BottomEmojiPicker.ShowPicker";
Debug.ShouldStop(262144);
__ref.getField(false,"_bottomemojipicker" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_showpicker" /*void*/ );
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
public static RemoteObject  _xlbl_opencustom_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xlbl_OpenCustom_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("xlbl_opencustom_click")) { return __ref.runUserSub(false, "b4xmainpage","xlbl_opencustom_click", __ref);}
 BA.debugLineNum = 93;BA.debugLine="Private Sub xlbl_OpenCustom_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="OpenCustom";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (com.stolte.bottomactionmenu.b4xmainpage.class, "_opencustom" /*RemoteObject*/ );
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("xlbl_OpenDark_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("xlbl_opendark_click")) { return __ref.runUserSub(false, "b4xmainpage","xlbl_opendark_click", __ref);}
 BA.debugLineNum = 77;BA.debugLine="Private Sub xlbl_OpenDark_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="OpenDark";
Debug.ShouldStop(16384);
__ref.runClassMethod (com.stolte.bottomactionmenu.b4xmainpage.class, "_opendark" /*void*/ );
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("xlbl_OpenLight_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("xlbl_openlight_click")) { return __ref.runUserSub(false, "b4xmainpage","xlbl_openlight_click", __ref);}
 BA.debugLineNum = 85;BA.debugLine="Private Sub xlbl_OpenLight_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 87;BA.debugLine="OpenLight";
Debug.ShouldStop(4194304);
__ref.runClassMethod (com.stolte.bottomactionmenu.b4xmainpage.class, "_openlight" /*RemoteObject*/ );
 BA.debugLineNum = 88;BA.debugLine="End Sub";
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