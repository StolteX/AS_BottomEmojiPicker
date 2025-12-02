package com.stolte.bottomactionmenu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.stolte.bottomactionmenu.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.stolte.bottomactionmenu.b4xmainpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public com.stolte.bottomactionmenu.as_bottomemojipicker _bottomemojipicker = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_emojiresult = null;
public com.stolte.bottomactionmenu.main _main = null;
public com.stolte.bottomactionmenu.starter _starter = null;
public com.stolte.bottomactionmenu.b4xpages _b4xpages = null;
public com.stolte.bottomactionmenu.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(com.stolte.bottomactionmenu.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"frm_main\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frm_main",ba);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="B4XPages.SetTitle(Me,\"AS BottomEmojiPicker Exampl";
_b4xpages._settitle /*String*/ (ba,this,(Object)("AS BottomEmojiPicker Example"));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="End Sub";
return "";
}
public String  _bottomemojipicker_emojiselected(com.stolte.bottomactionmenu.b4xmainpage __ref,String _emoji) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "bottomemojipicker_emojiselected", false))
	 {return ((String) Debug.delegate(ba, "bottomemojipicker_emojiselected", new Object[] {_emoji}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub BottomEmojiPicker_EmojiSelected (Emoji";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="xlbl_EmojiResult.Text = xlbl_EmojiResult.Text & E";
__ref._xlbl_emojiresult /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._xlbl_emojiresult /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()+_emoji));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.stolte.bottomactionmenu.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private BottomEmojiPicker As AS_BottomEmojiPicker";
_bottomemojipicker = new com.stolte.bottomactionmenu.as_bottomemojipicker();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private xlbl_EmojiResult As B4XView";
_xlbl_emojiresult = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.stolte.bottomactionmenu.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public String  _opencustom(com.stolte.bottomactionmenu.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "opencustom", false))
	 {return ((String) Debug.delegate(ba, "opencustom", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub OpenCustom";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._initialize /*String*/ (null,ba,this,"BottomEmojiPicker",__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="BottomEmojiPicker.BackgroundColor = xui.Color_ARG";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setbackgroundcolor /*int*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)));
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="BottomEmojiPicker.CategoryTextColor = xui.Color_W";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setcategorytextcolor /*int*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="BottomEmojiPicker.CategoryIndicatorColor = xui.Co";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setcategoryindicatorcolor /*int*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="BottomEmojiPicker.EmojiSize = 50";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setemojisize /*int*/ (null,(int) (50));
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="BottomEmojiPicker.BodyHeight = 300dip";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setbodyheight /*float*/ (null,(float) (__c.DipToCurrent((int) (300))));
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="BottomEmojiPicker.Rows = 3";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setrows /*int*/ (null,(int) (3));
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="BottomEmojiPicker.ShowPicker";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._showpicker /*void*/ (null);
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="End Sub";
return "";
}
public void  _opendark(com.stolte.bottomactionmenu.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "opendark", false))
	 {Debug.delegate(ba, "opendark", null); return;}
ResumableSub_OpenDark rsub = new ResumableSub_OpenDark(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_OpenDark extends BA.ResumableSub {
public ResumableSub_OpenDark(com.stolte.bottomactionmenu.b4xmainpage parent,com.stolte.bottomactionmenu.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.stolte.bottomactionmenu.b4xmainpage __ref;
com.stolte.bottomactionmenu.b4xmainpage parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._initialize /*String*/ (null,ba,parent,"BottomEmojiPicker",__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="BottomEmojiPicker.BackgroundColor = xui.Color_ARG";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setbackgroundcolor /*int*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)));
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="BottomEmojiPicker.CategoryTextColor = xui.Color_W";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setcategorytextcolor /*int*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="BottomEmojiPicker.CategoryIndicatorColor = xui.Co";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setcategoryindicatorcolor /*int*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="BottomEmojiPicker.ShowPicker";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._showpicker /*void*/ (null);
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Sleep(5000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "opendark"),(int) (5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Log(\"jetzt\")";
parent.__c.LogImpl("2786442","jetzt",0);
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="BottomEmojiPicker.HidePicker";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._hidepicker /*String*/ (null);
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _openlight(com.stolte.bottomactionmenu.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "openlight", false))
	 {return ((String) Debug.delegate(ba, "openlight", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub OpenLight";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._initialize /*String*/ (null,ba,this,"BottomEmojiPicker",__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="BottomEmojiPicker.BackgroundColor = xui.Color_Whi";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setbackgroundcolor /*int*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="BottomEmojiPicker.CategoryTextColor = xui.Color_B";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setcategorytextcolor /*int*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="BottomEmojiPicker.CategoryIndicatorColor = xui.Co";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._setcategoryindicatorcolor /*int*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="BottomEmojiPicker.ShowPicker";
__ref._bottomemojipicker /*com.stolte.bottomactionmenu.as_bottomemojipicker*/ ._showpicker /*void*/ (null);
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_opencustom_click(com.stolte.bottomactionmenu.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "xlbl_opencustom_click", false))
	 {return ((String) Debug.delegate(ba, "xlbl_opencustom_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub xlbl_OpenCustom_Click";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="OpenCustom";
__ref._opencustom /*String*/ (null);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_opendark_click(com.stolte.bottomactionmenu.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "xlbl_opendark_click", false))
	 {return ((String) Debug.delegate(ba, "xlbl_opendark_click", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub xlbl_OpenDark_Click";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="OpenDark";
__ref._opendark /*void*/ (null);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_openlight_click(com.stolte.bottomactionmenu.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "xlbl_openlight_click", false))
	 {return ((String) Debug.delegate(ba, "xlbl_openlight_click", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub xlbl_OpenLight_Click";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="OpenLight";
__ref._openlight /*String*/ (null);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
}