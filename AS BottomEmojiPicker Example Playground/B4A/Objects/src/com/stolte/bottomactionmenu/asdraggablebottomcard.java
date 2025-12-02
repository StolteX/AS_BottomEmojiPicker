package com.stolte.bottomactionmenu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class asdraggablebottomcard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.stolte.bottomactionmenu.asdraggablebottomcard");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.stolte.bottomactionmenu.asdraggablebottomcard.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mdarkpanel = null;
public float _downy = 0f;
public float _old_top = 0f;
public float _g_first_height = 0f;
public float _g_second_height = 0f;
public float _g_width = 0f;
public float _g_header_height = 0f;
public int _g_orientation = 0;
public int _g_show_duration = 0;
public int _g_hide_duration = 0;
public int _g_darkpanel_alpha = 0;
public boolean _g_isdraggable = false;
public boolean _mdarkpanelclickable = false;
public boolean _musercanclose = false;
public boolean _m_bodydrag = false;
public int _expand_state = 0;
public boolean _disable_touch = false;
public boolean _last_swipe2top = false;
public boolean _inclosingprocess = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_cardbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_cardheader = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_cardbody = null;
public com.stolte.bottomactionmenu.main _main = null;
public com.stolte.bottomactionmenu.starter _starter = null;
public com.stolte.bottomactionmenu.b4xpages _b4xpages = null;
public com.stolte.bottomactionmenu.b4xcollections _b4xcollections = null;
public void  _hide(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,boolean _ignore_event) throws Exception{
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "hide", true))
	 {Debug.delegate(ba, "hide", new Object[] {_ignore_event}); return;}
ResumableSub_Hide rsub = new ResumableSub_Hide(this,__ref,_ignore_event);
rsub.resume(ba, null);
}
public static class ResumableSub_Hide extends BA.ResumableSub {
public ResumableSub_Hide(com.stolte.bottomactionmenu.asdraggablebottomcard parent,com.stolte.bottomactionmenu.asdraggablebottomcard __ref,boolean _ignore_event) {
this.parent = parent;
this.__ref = __ref;
this._ignore_event = _ignore_event;
this.__ref = parent;
}
com.stolte.bottomactionmenu.asdraggablebottomcard __ref;
com.stolte.bottomactionmenu.asdraggablebottomcard parent;
boolean _ignore_event;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="asdraggablebottomcard";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="If inClosingProcess Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._inclosingprocess /*boolean*/ ) { 
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
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="inClosingProcess = True";
__ref._inclosingprocess /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="expand_state = 0";
__ref._expand_state /*int*/  = (int) (0);
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Close\",";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Close",(int) (0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="CallSub(mCallBack,mEventName & \"_Close\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Close");
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(g_hide_duration,x";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._g_hide_duration /*int*/ ,__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__ref._g_first_height /*float*/ ),(int) (__ref._g_width /*float*/ ),__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="mDarkPanel.SetVisibleAnimated(g_hide_duration,Fal";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(__ref._g_hide_duration /*int*/ ,parent.__c.False);
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="If ignore_event = False Then";
if (true) break;

case 11:
//if
this.state = 20;
if (_ignore_event==parent.__c.False) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="Sleep(g_hide_duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asdraggablebottomcard", "hide"),__ref._g_hide_duration /*int*/ );
this.state = 21;
return;
case 21:
//C
this.state = 14;
;
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Closed";
if (true) break;

case 14:
//if
this.state = 17;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(int) (0))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="CallSub(mCallBack,mEventName & \"_Closed\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Closed");
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=3735569;
 //BA.debugLineNum = 3735569;BA.debugLine="Sleep(g_hide_duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asdraggablebottomcard", "hide"),__ref._g_hide_duration /*int*/ );
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
RDebugUtils.currentLine=3735571;
 //BA.debugLineNum = 3735571;BA.debugLine="xpnl_CardBase.Height = g_first_height";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._g_first_height /*float*/ ));
RDebugUtils.currentLine=3735572;
 //BA.debugLineNum = 3735572;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asdraggablebottomcard", "hide"),(int) (0));
this.state = 23;
return;
case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=3735573;
 //BA.debugLineNum = 3735573;BA.debugLine="inClosingProcess = False";
__ref._inclosingprocess /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=3735574;
 //BA.debugLineNum = 3735574;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbodypanel(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getbodypanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbodypanel", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub getBodyPanel As B4XView";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Return xpnl_CardBody";
if (true) return __ref._xpnl_cardbody /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return null;
}
public String  _initialize(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return "";
}
public String  _setbodydrag(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setbodydrag", true))
	 {return ((String) Debug.delegate(ba, "setbodydrag", new Object[] {_enabled}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub setBodyDrag(Enabled As Boolean)";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="m_BodyDrag = Enabled";
__ref._m_bodydrag /*boolean*/  = _enabled;
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
public String  _create(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,float _first_height,float _second_height,float _header_height,float _width,int _orientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "create", true))
	 {return ((String) Debug.delegate(ba, "create", new Object[] {_parent,_first_height,_second_height,_header_height,_width,_orientation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub Create (Parent As B4XView,first_height";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="g_first_height = first_height";
__ref._g_first_height /*float*/  = _first_height;
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="g_second_height = second_height";
__ref._g_second_height /*float*/  = _second_height;
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="g_width = width";
__ref._g_width /*float*/  = _width;
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="g_orientation = orientation";
__ref._g_orientation /*int*/  = _orientation;
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="g_header_height = header_height";
__ref._g_header_height /*float*/  = _header_height;
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="ini_views(Parent)";
__ref._ini_views /*String*/ (null,_parent);
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="Base_Resize(Parent.Width,Parent.Height)";
__ref._base_resize /*String*/ (null,_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="Private r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="r.Target = xpnl_CardBase";
_r.Target = (Object)(__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject());
RDebugUtils.currentLine=3342350;
 //BA.debugLineNum = 3342350;BA.debugLine="r.SetOnTouchListener(\"xpnl_CardHeader_Touch2\")";
_r.SetOnTouchListener(ba,"xpnl_CardHeader_Touch2");
RDebugUtils.currentLine=3342362;
 //BA.debugLineNum = 3342362;BA.debugLine="Base_Resize(Parent.Width,Parent.Height)";
__ref._base_resize /*String*/ (null,_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=3342363;
 //BA.debugLineNum = 3342363;BA.debugLine="End Sub";
return "";
}
public int  _orientation_middle(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "orientation_middle", true))
	 {return ((Integer) Debug.delegate(ba, "orientation_middle", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub Orientation_MIDDLE As Int";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Return 1";
if (true) return (int) (1);
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getheaderpanel(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getheaderpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub getHeaderPanel As B4XView";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Return xpnl_CardHeader";
if (true) return __ref._xpnl_cardheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return null;
}
public String  _setcornerradius_header(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,float _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setcornerradius_header", true))
	 {return ((String) Debug.delegate(ba, "setcornerradius_header", new Object[] {_radius}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub setCornerRadius_Header(radius As Float)";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="xpnl_CardHeader.Height = g_header_height * 2";
__ref._xpnl_cardheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._g_header_height /*float*/ *2));
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="xpnl_CardHeader.SetColorAndBorder(xpnl_CardHeader";
__ref._xpnl_cardheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xpnl_cardheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor(),(int) (0),(int) (0),(int) (_radius));
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="SetCircleClip(xpnl_CardHeader,radius)";
__ref._setcircleclip /*String*/ (null,__ref._xpnl_cardheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(int) (_radius));
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="End Sub";
return "";
}
public String  _show(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,boolean _ignore_event) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_ignore_event}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub Show(ignore_event As Boolean)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="ShowIntern(ignore_event,False)";
__ref._showintern /*void*/ (null,_ignore_event,__c.False);
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
float _tmp_left = 0f;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim tmp_left As Float = 0";
_tmp_left = (float) (0);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="If g_orientation = Orientation_MIDDLE Then";
if (__ref._g_orientation /*int*/ ==__ref._orientation_middle /*int*/ (null)) { 
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="tmp_left = Width/2 - g_width/2";
_tmp_left = (float) (_width/(double)2-__ref._g_width /*float*/ /(double)2);
 }else 
{RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Else If g_orientation = Orientation_RIGHT Then";
if (__ref._g_orientation /*int*/ ==__ref._orientation_right /*int*/ (null)) { 
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="tmp_left = Width - g_width";
_tmp_left = (float) (_width-__ref._g_width /*float*/ );
 }}
;
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="mDarkPanel.SetLayoutAnimated(0,0,0,Width,Height)";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(0,tmp_left,Height";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_tmp_left),(int) (_height+__ref._g_first_height /*float*/ ),(int) (__ref._g_width /*float*/ ),(int) (__ref._g_first_height /*float*/ ));
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="xpnl_CardHeader.SetLayoutAnimated(0,0,0,g_width,g";
__ref._xpnl_cardheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (__ref._g_width /*float*/ ),(int) (__ref._g_header_height /*float*/ ));
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="xpnl_CardBody.SetLayoutAnimated(0,0,g_header_heig";
__ref._xpnl_cardbody /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (__ref._g_header_height /*float*/ ),(int) (__ref._g_width /*float*/ ),(int) (__ref._g_first_height /*float*/ ));
RDebugUtils.currentLine=3407890;
 //BA.debugLineNum = 3407890;BA.debugLine="End Sub";
return "";
}
public int  _orientation_right(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "orientation_right", true))
	 {return ((Integer) Debug.delegate(ba, "orientation_right", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub Orientation_RIGHT As Int";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Return 2";
if (true) return (int) (2);
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="Private mDarkPanel As B4XView";
_mdarkpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="Private downy As Float";
_downy = 0f;
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="Private old_top As Float";
_old_top = 0f;
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="Private g_first_height,g_second_height,g_width,g_";
_g_first_height = 0f;
_g_second_height = 0f;
_g_width = 0f;
_g_header_height = 0f;
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="Private g_orientation As Int";
_g_orientation = 0;
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="Public g_show_duration As Int = 250";
_g_show_duration = (int) (250);
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="Public g_hide_duration As Int = 700";
_g_hide_duration = (int) (700);
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="Private g_darkpanel_alpha As Int = 165";
_g_darkpanel_alpha = (int) (165);
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="Private g_IsDraggable As Boolean = True";
_g_isdraggable = __c.True;
RDebugUtils.currentLine=3211281;
 //BA.debugLineNum = 3211281;BA.debugLine="Private mDarkPanelClickable As Boolean = True";
_mdarkpanelclickable = __c.True;
RDebugUtils.currentLine=3211282;
 //BA.debugLineNum = 3211282;BA.debugLine="Private mUserCanClose As Boolean = True";
_musercanclose = __c.True;
RDebugUtils.currentLine=3211285;
 //BA.debugLineNum = 3211285;BA.debugLine="Private m_BodyDrag As Boolean = False";
_m_bodydrag = __c.False;
RDebugUtils.currentLine=3211286;
 //BA.debugLineNum = 3211286;BA.debugLine="Private expand_state As Int = 0";
_expand_state = (int) (0);
RDebugUtils.currentLine=3211288;
 //BA.debugLineNum = 3211288;BA.debugLine="Private disable_touch As Boolean = False";
_disable_touch = __c.False;
RDebugUtils.currentLine=3211290;
 //BA.debugLineNum = 3211290;BA.debugLine="Private last_swipe2top As Boolean = False";
_last_swipe2top = __c.False;
RDebugUtils.currentLine=3211291;
 //BA.debugLineNum = 3211291;BA.debugLine="Private inClosingProcess As Boolean = False";
_inclosingprocess = __c.False;
RDebugUtils.currentLine=3211296;
 //BA.debugLineNum = 3211296;BA.debugLine="Private xpnl_CardBase As B4XView";
_xpnl_cardbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3211297;
 //BA.debugLineNum = 3211297;BA.debugLine="Private xpnl_CardHeader As B4XView";
_xpnl_cardheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3211298;
 //BA.debugLineNum = 3211298;BA.debugLine="Private xpnl_CardBody As B4XView";
_xpnl_cardbody = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3211307;
 //BA.debugLineNum = 3211307;BA.debugLine="End Sub";
return "";
}
public String  _ini_views(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "ini_views", true))
	 {return ((String) Debug.delegate(ba, "ini_views", new Object[] {_parent}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub ini_views(Parent As B4XView)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="xpnl_CardBase = xui.CreatePanel(\"xpnl_CardBase\")";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_CardBase");
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="xpnl_CardHeader = xui.CreatePanel(\"xpnl_header\")";
__ref._xpnl_cardheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_header");
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="xpnl_CardBody = xui.CreatePanel(\"\")";
__ref._xpnl_cardbody /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="mDarkPanel = xui.CreatePanel(\"mDarkPanel\")";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mDarkPanel");
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Parent.AddView(mDarkPanel,0,0,0,0)";
_parent.AddView((android.view.View)(__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="Parent.AddView(xpnl_CardBase,0,0,0,0)";
_parent.AddView((android.view.View)(__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="xpnl_CardBase.AddView(xpnl_CardHeader,0,0,0,0)";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_cardheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="xpnl_CardBase.AddView(xpnl_CardBody,0,0,0,0)";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_cardbody /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="mDarkPanel.Color = xui.Color_ARGB(g_darkpanel_alp";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(__ref._g_darkpanel_alpha /*int*/ ,(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="mDarkPanel.Visible = False";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="End Sub";
return "";
}
public String  _expandfull(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "expandfull", true))
	 {return ((String) Debug.delegate(ba, "expandfull", null));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub ExpandFull";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="expand_state = 2";
__ref._expand_state /*int*/  = (int) (2);
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="ShowIntern(True,True)";
__ref._showintern /*void*/ (null,__c.True,__c.True);
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="End Sub";
return "";
}
public void  _showintern(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,boolean _ignore_event,boolean _fromtouch) throws Exception{
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "showintern", true))
	 {Debug.delegate(ba, "showintern", new Object[] {_ignore_event,_fromtouch}); return;}
ResumableSub_ShowIntern rsub = new ResumableSub_ShowIntern(this,__ref,_ignore_event,_fromtouch);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowIntern extends BA.ResumableSub {
public ResumableSub_ShowIntern(com.stolte.bottomactionmenu.asdraggablebottomcard parent,com.stolte.bottomactionmenu.asdraggablebottomcard __ref,boolean _ignore_event,boolean _fromtouch) {
this.parent = parent;
this.__ref = __ref;
this._ignore_event = _ignore_event;
this._fromtouch = _fromtouch;
this.__ref = parent;
}
com.stolte.bottomactionmenu.asdraggablebottomcard __ref;
com.stolte.bottomactionmenu.asdraggablebottomcard parent;
boolean _ignore_event;
boolean _fromtouch;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="asdraggablebottomcard";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Open\",0";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Open",(int) (0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="CallSub(mCallBack,mEventName & \"_Open\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Open");
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="mDarkPanel.Enabled = True";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="If mDarkPanel.Visible = False Then";
if (true) break;

case 5:
//if
this.state = 8;
if (__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible()==parent.__c.False) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="mDarkPanel.SetVisibleAnimated(g_show_duration,Tr";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(__ref._g_show_duration /*int*/ ,parent.__c.True);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="disable_touch = True";
__ref._disable_touch /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="If expand_state = 1 Then";
if (true) break;

case 9:
//if
this.state = 20;
if (__ref._expand_state /*int*/ ==1) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 20;
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="xpnl_CardBase.Height = g_second_height + g_heade";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._g_second_height /*float*/ +__ref._g_header_height /*float*/ ));
RDebugUtils.currentLine=3670028;
 //BA.debugLineNum = 3670028;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(g_show_duration,";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._g_show_duration /*int*/ ,__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_first_height /*float*/ -__ref._g_header_height /*float*/ ),(int) (__ref._g_width /*float*/ ),(int) (__ref._g_second_height /*float*/ +__ref._g_header_height /*float*/ ));
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="xpnl_CardBody.Height = g_second_height";
__ref._xpnl_cardbody /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._g_second_height /*float*/ ));
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="Sleep(g_show_duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asdraggablebottomcard", "showintern"),__ref._g_show_duration /*int*/ );
this.state = 31;
return;
case 31:
//C
this.state = 20;
;
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="xpnl_CardBase.Height = g_first_height + g_header";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._g_first_height /*float*/ +__ref._g_header_height /*float*/ ));
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="xpnl_CardBody.Height = g_first_height";
__ref._xpnl_cardbody /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._g_first_height /*float*/ ));
RDebugUtils.currentLine=3670033;
 //BA.debugLineNum = 3670033;BA.debugLine="VisibleBodyHeightChanged";
__ref._visiblebodyheightchanged /*String*/ (null);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="xpnl_CardBase.Height = g_second_height + g_heade";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._g_second_height /*float*/ +__ref._g_header_height /*float*/ ));
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(g_show_duration,";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._g_show_duration /*int*/ ,__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_second_height /*float*/ -__ref._g_header_height /*float*/ ),(int) (__ref._g_width /*float*/ ),(int) (__ref._g_second_height /*float*/ +__ref._g_header_height /*float*/ ));
RDebugUtils.currentLine=3670037;
 //BA.debugLineNum = 3670037;BA.debugLine="xpnl_CardBody.Height = g_second_height";
__ref._xpnl_cardbody /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._g_second_height /*float*/ ));
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="VisibleBodyHeightChanged";
__ref._visiblebodyheightchanged /*String*/ (null);
RDebugUtils.currentLine=3670039;
 //BA.debugLineNum = 3670039;BA.debugLine="If fromtouch = False Then Sleep(g_show_duration)";
if (true) break;

case 14:
//if
this.state = 19;
if (_fromtouch==parent.__c.False) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asdraggablebottomcard", "showintern"),__ref._g_show_duration /*int*/ );
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
RDebugUtils.currentLine=3670042;
 //BA.debugLineNum = 3670042;BA.debugLine="disable_touch = False";
__ref._disable_touch /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=3670043;
 //BA.debugLineNum = 3670043;BA.debugLine="expand_state = 1";
__ref._expand_state /*int*/  = (int) (1);
RDebugUtils.currentLine=3670044;
 //BA.debugLineNum = 3670044;BA.debugLine="If ignore_event = False Then";
if (true) break;

case 21:
//if
this.state = 30;
if (_ignore_event==parent.__c.False) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=3670046;
 //BA.debugLineNum = 3670046;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Opened";
if (true) break;

case 24:
//if
this.state = 27;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Opened",(int) (0))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=3670047;
 //BA.debugLineNum = 3670047;BA.debugLine="CallSub(mCallBack,mEventName & \"_Opened\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Opened");
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
RDebugUtils.currentLine=3670051;
 //BA.debugLineNum = 3670051;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _expandhalf(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "expandhalf", true))
	 {return ((String) Debug.delegate(ba, "expandhalf", null));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub ExpandHalf";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="expand_state = 1";
__ref._expand_state /*int*/  = (int) (1);
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="ShowIntern(True,False)";
__ref._showintern /*void*/ (null,__c.True,__c.False);
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="End Sub";
return "";
}
public boolean  _getbodydrag(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getbodydrag", true))
	 {return ((Boolean) Debug.delegate(ba, "getbodydrag", null));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub getBodyDrag As Boolean";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Return m_BodyDrag";
if (true) return __ref._m_bodydrag /*boolean*/ ;
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getcardbase(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getcardbase", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getcardbase", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub getCardBase As B4XView";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Return xpnl_CardBase";
if (true) return __ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getdarkpanel(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getdarkpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getdarkpanel", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub getDarkPanel As B4XView";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Return mDarkPanel";
if (true) return __ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return null;
}
public int  _getdarkpanelalpha(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getdarkpanelalpha", true))
	 {return ((Integer) Debug.delegate(ba, "getdarkpanelalpha", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub getDarkPanelAlpha As Int";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Return g_darkpanel_alpha";
if (true) return __ref._g_darkpanel_alpha /*int*/ ;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return 0;
}
public boolean  _getdarkpanelclickable(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getdarkpanelclickable", true))
	 {return ((Boolean) Debug.delegate(ba, "getdarkpanelclickable", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub getDarkPanelClickable As Boolean";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Return mDarkPanelClickable";
if (true) return __ref._mdarkpanelclickable /*boolean*/ ;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return false;
}
public float  _getfirstheight(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getfirstheight", true))
	 {return ((Float) Debug.delegate(ba, "getfirstheight", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub getFirstHeight As Float";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Return g_first_height";
if (true) return __ref._g_first_height /*float*/ ;
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return 0f;
}
public float  _getheaderheight(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getheaderheight", true))
	 {return ((Float) Debug.delegate(ba, "getheaderheight", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub getHeaderHeight As Float";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Return g_header_height";
if (true) return __ref._g_header_height /*float*/ ;
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return 0f;
}
public boolean  _getisdraggable(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getisdraggable", true))
	 {return ((Boolean) Debug.delegate(ba, "getisdraggable", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub getIsDraggable As Boolean";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Return g_IsDraggable";
if (true) return __ref._g_isdraggable /*boolean*/ ;
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return false;
}
public boolean  _getisopen(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getisopen", true))
	 {return ((Boolean) Debug.delegate(ba, "getisopen", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub getIsOpen As Boolean";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If expand_state = 0 Then Return False Else Return";
if (__ref._expand_state /*int*/ ==0) { 
if (true) return __c.False;}
else {
if (true) return __c.True;};
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return false;
}
public boolean  _getisopenfull(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getisopenfull", true))
	 {return ((Boolean) Debug.delegate(ba, "getisopenfull", null));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub getIsOpenFull As Boolean";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="If expand_state = 2 Then Return True Else Return";
if (__ref._expand_state /*int*/ ==2) { 
if (true) return __c.True;}
else {
if (true) return __c.False;};
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return false;
}
public boolean  _getisopenhalf(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getisopenhalf", true))
	 {return ((Boolean) Debug.delegate(ba, "getisopenhalf", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub getIsOpenHalf As Boolean";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="If expand_state = 1 Then Return True Else Return";
if (__ref._expand_state /*int*/ ==1) { 
if (true) return __c.True;}
else {
if (true) return __c.False;};
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return false;
}
public float  _getsecondheight(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getsecondheight", true))
	 {return ((Float) Debug.delegate(ba, "getsecondheight", null));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub getSecondHeight As Float";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Return g_second_height";
if (true) return __ref._g_second_height /*float*/ ;
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return 0f;
}
public boolean  _getusercanclose(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "getusercanclose", true))
	 {return ((Boolean) Debug.delegate(ba, "getusercanclose", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub getUserCanClose As Boolean";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Return mUserCanClose";
if (true) return __ref._musercanclose /*boolean*/ ;
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return false;
}
public boolean  _handletouch(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,int _action,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "handletouch", true))
	 {return ((Boolean) Debug.delegate(ba, "handletouch", new Object[] {_action,_y}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub HandleTouch(Action As Int,y As Float)";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If g_IsDraggable = False Or disable_touch = True";
if (__ref._g_isdraggable /*boolean*/ ==__c.False || __ref._disable_touch /*boolean*/ ==__c.True) { 
if (true) return __c.False;};
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="If Action = xpnl_CardBase.TOUCH_ACTION_DOWN Then";
if (_action==__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="downy  = y";
__ref._downy /*float*/  = _y;
 };
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="VisibleBodyHeightChanged";
__ref._visiblebodyheightchanged /*String*/ (null);
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="If Action = xpnl_CardBase.TOUCH_ACTION_DOWN Then";
if (_action==__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="old_top = xpnl_CardBase.Top";
__ref._old_top /*float*/  = (float) (__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop());
 }else 
{RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="Else if Action = xpnl_CardBase.TOUCH_ACTION_MOVE";
if (_action==__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="If y < downy Then";
if (_y<__ref._downy /*float*/ ) { 
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="last_swipe2top = True";
__ref._last_swipe2top /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=3866640;
 //BA.debugLineNum = 3866640;BA.debugLine="last_swipe2top = False";
__ref._last_swipe2top /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=3866643;
 //BA.debugLineNum = 3866643;BA.debugLine="If mUserCanClose = True Then";
if (__ref._musercanclose /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=3866644;
 //BA.debugLineNum = 3866644;BA.debugLine="xpnl_CardBase.Top = Max(mDarkPanel.Height - g_s";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (__c.Max(__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_second_height /*float*/ -__ref._g_header_height /*float*/ ,__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+_y-__ref._downy /*float*/ )));
 }else {
RDebugUtils.currentLine=3866646;
 //BA.debugLineNum = 3866646;BA.debugLine="xpnl_CardBase.Top = Min(mDarkPanel.Height - g_f";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (__c.Min(__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_first_height /*float*/ -__ref._g_header_height /*float*/ ,__c.Max(__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_second_height /*float*/ -__ref._g_header_height /*float*/ ,__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+_y-__ref._downy /*float*/ ))));
 };
RDebugUtils.currentLine=3866649;
 //BA.debugLineNum = 3866649;BA.debugLine="If xpnl_CardBase.Top < (mDarkPanel.Height - g_fi";
if (__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()<(__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_first_height /*float*/ )) { 
RDebugUtils.currentLine=3866650;
 //BA.debugLineNum = 3866650;BA.debugLine="expand_state = 2";
__ref._expand_state /*int*/  = (int) (2);
RDebugUtils.currentLine=3866651;
 //BA.debugLineNum = 3866651;BA.debugLine="xpnl_CardBody.Height = g_second_height";
__ref._xpnl_cardbody /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._g_second_height /*float*/ ));
RDebugUtils.currentLine=3866652;
 //BA.debugLineNum = 3866652;BA.debugLine="xpnl_CardBase.Height = g_second_height + g_head";
__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._g_second_height /*float*/ +__ref._g_header_height /*float*/ ));
 }else {
RDebugUtils.currentLine=3866655;
 //BA.debugLineNum = 3866655;BA.debugLine="expand_state = 1";
__ref._expand_state /*int*/  = (int) (1);
 };
RDebugUtils.currentLine=3866657;
 //BA.debugLineNum = 3866657;BA.debugLine="VisibleBodyHeightChanged";
__ref._visiblebodyheightchanged /*String*/ (null);
 }else 
{RDebugUtils.currentLine=3866658;
 //BA.debugLineNum = 3866658;BA.debugLine="Else if Action = xpnl_CardBase.TOUCH_ACTION_UP Th";
if (_action==__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=3866659;
 //BA.debugLineNum = 3866659;BA.debugLine="If expand_state = 1 And old_top < xpnl_CardBase.";
if (__ref._expand_state /*int*/ ==1 && __ref._old_top /*float*/ <__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop() && __ref._last_swipe2top /*boolean*/ ==__c.False && __ref._musercanclose /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=3866660;
 //BA.debugLineNum = 3866660;BA.debugLine="Hide(False)";
__ref._hide /*void*/ (null,__c.False);
 }else 
{RDebugUtils.currentLine=3866661;
 //BA.debugLineNum = 3866661;BA.debugLine="Else if expand_state = 2 And old_top < xpnl_Card";
if (__ref._expand_state /*int*/ ==2 && __ref._old_top /*float*/ <__ref._xpnl_cardbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()) { 
RDebugUtils.currentLine=3866662;
 //BA.debugLineNum = 3866662;BA.debugLine="expand_state = 1";
__ref._expand_state /*int*/  = (int) (1);
RDebugUtils.currentLine=3866663;
 //BA.debugLineNum = 3866663;BA.debugLine="ShowIntern(True,True)";
__ref._showintern /*void*/ (null,__c.True,__c.True);
 }else {
RDebugUtils.currentLine=3866665;
 //BA.debugLineNum = 3866665;BA.debugLine="ShowIntern(True,True)";
__ref._showintern /*void*/ (null,__c.True,__c.True);
 }}
;
 }}}
;
RDebugUtils.currentLine=3866668;
 //BA.debugLineNum = 3866668;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=3866669;
 //BA.debugLineNum = 3866669;BA.debugLine="End Sub";
return false;
}
public String  _visiblebodyheightchanged(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "visiblebodyheightchanged", true))
	 {return ((String) Debug.delegate(ba, "visiblebodyheightchanged", null));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub VisibleBodyHeightChanged";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Visible";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_VisibleBodyHeightChanged",(int) (1))) { 
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="CallSub2(mCallBack,mEventName & \"_VisibleBodyHei";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_VisibleBodyHeightChanged",(Object)(__ref._xpnl_cardbody /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="End Sub";
return "";
}
public String  _mdarkpanel_click(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "mdarkpanel_click", true))
	 {return ((String) Debug.delegate(ba, "mdarkpanel_click", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub mDarkPanel_Click";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="If mDarkPanelClickable = False Then Return";
if (__ref._mdarkpanelclickable /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="mDarkPanel.Enabled = False";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Hide(False)";
__ref._hide /*void*/ (null,__c.False);
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="End Sub";
return "";
}
public int  _orientation_left(com.stolte.bottomactionmenu.asdraggablebottomcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "orientation_left", true))
	 {return ((Integer) Debug.delegate(ba, "orientation_left", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub Orientation_LEFT As Int";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return 0;
}
public String  _setbodypanel(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,anywheresoftware.b4a.objects.B4XViewWrapper _bodypanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setbodypanel", true))
	 {return ((String) Debug.delegate(ba, "setbodypanel", new Object[] {_bodypanel}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub setBodyPanel(BodyPanel As B4XView)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="xpnl_CardBody = BodyPanel";
__ref._xpnl_cardbody /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _bodypanel;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return "";
}
public String  _setcircleclip(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setcircleclip", true))
	 {return ((String) Debug.delegate(ba, "setcircleclip", new Object[] {_pnl,_radius}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub SetCircleClip (pnl As B4XView,radius A";
RDebugUtils.currentLine=3473422;
 //BA.debugLineNum = 3473422;BA.debugLine="Dim jo As JavaObject = pnl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
RDebugUtils.currentLine=3473423;
 //BA.debugLineNum = 3473423;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(True))";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="End Sub";
return "";
}
public String  _setdarkpanelalpha(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,int _alpha) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setdarkpanelalpha", true))
	 {return ((String) Debug.delegate(ba, "setdarkpanelalpha", new Object[] {_alpha}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub setDarkPanelAlpha(alpha As Int)";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="If alpha >= 0 And alpha <=255 Then";
if (_alpha>=0 && _alpha<=255) { 
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="g_darkpanel_alpha = alpha";
__ref._g_darkpanel_alpha /*int*/  = _alpha;
 };
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="End Sub";
return "";
}
public String  _setdarkpanelclickable(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,boolean _clickable) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setdarkpanelclickable", true))
	 {return ((String) Debug.delegate(ba, "setdarkpanelclickable", new Object[] {_clickable}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub setDarkPanelClickable(Clickable As Bool";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="mDarkPanelClickable = Clickable";
__ref._mdarkpanelclickable /*boolean*/  = _clickable;
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="End Sub";
return "";
}
public String  _setfirstheight(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setfirstheight", true))
	 {return ((String) Debug.delegate(ba, "setfirstheight", new Object[] {_height}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub setFirstHeight(height As Float)";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="g_first_height = height";
__ref._g_first_height /*float*/  = _height;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="If expand_state = 1 Then";
if (__ref._expand_state /*int*/ ==1) { 
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="ExpandHalf";
__ref._expandhalf /*String*/ (null);
 };
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="End Sub";
return "";
}
public String  _setheaderpanel(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,anywheresoftware.b4a.objects.B4XViewWrapper _headerpanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setheaderpanel", true))
	 {return ((String) Debug.delegate(ba, "setheaderpanel", new Object[] {_headerpanel}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub setHeaderPanel(HeaderPanel As B4XView)";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="xpnl_CardHeader = HeaderPanel";
__ref._xpnl_cardheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _headerpanel;
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return "";
}
public String  _setisdraggable(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,boolean _draggable) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setisdraggable", true))
	 {return ((String) Debug.delegate(ba, "setisdraggable", new Object[] {_draggable}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub setIsDraggable(draggable As Boolean)";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="g_IsDraggable = draggable";
__ref._g_isdraggable /*boolean*/  = _draggable;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public String  _setsecondheight(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setsecondheight", true))
	 {return ((String) Debug.delegate(ba, "setsecondheight", new Object[] {_height}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub setSecondHeight(height As Float)";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="g_second_height = height";
__ref._g_second_height /*float*/  = _height;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="If expand_state = 2 Then";
if (__ref._expand_state /*int*/ ==2) { 
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="ExpandFull";
__ref._expandfull /*String*/ (null);
 };
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="End Sub";
return "";
}
public String  _setusercanclose(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,boolean _canclose) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "setusercanclose", true))
	 {return ((String) Debug.delegate(ba, "setusercanclose", new Object[] {_canclose}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub setUserCanClose(CanClose As Boolean)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="mUserCanClose = CanClose";
__ref._musercanclose /*boolean*/  = _canclose;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public boolean  _xpnl_cardheader_touch2(com.stolte.bottomactionmenu.asdraggablebottomcard __ref,Object _viewtag,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="asdraggablebottomcard";
if (Debug.shouldDelegate(ba, "xpnl_cardheader_touch2", true))
	 {return ((Boolean) Debug.delegate(ba, "xpnl_cardheader_touch2", new Object[] {_viewtag,_action,_x,_y,_motionevent}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub xpnl_CardHeader_Touch2(ViewTag As Obje";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Return HandleTouch(Action,y)";
if (true) return __ref._handletouch /*boolean*/ (null,_action,_y);
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return false;
}
}