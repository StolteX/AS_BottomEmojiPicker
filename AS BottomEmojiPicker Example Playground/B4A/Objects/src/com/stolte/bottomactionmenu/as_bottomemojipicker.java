package com.stolte.bottomactionmenu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class as_bottomemojipicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.stolte.bottomactionmenu.as_bottomemojipicker");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.stolte.bottomactionmenu.as_bottomemojipicker.class).invoke(this, new Object[] {null});
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
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xparent = null;
public com.stolte.bottomactionmenu.asdraggablebottomcard _bottomcard = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_listviewbackground = null;
public b4a.example3.customlistview _xclv_main = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_header = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_body = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_dragindicator = null;
public float _m_headerheight = 0f;
public float _m_bodyheight = 0f;
public int _m_headercolor = 0;
public int _m_bodycolor = 0;
public int _m_categorytextcolor = 0;
public int _m_categoryindicatorcolor = 0;
public int _m_emojisize = 0;
public int _m_rows = 0;
public anywheresoftware.b4a.objects.collections.Map _m_emojis = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_categoriesbackground = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_currentcategoryindicator = null;
public String _currentcategory = "";
public com.stolte.bottomactionmenu.main _main = null;
public com.stolte.bottomactionmenu.starter _starter = null;
public com.stolte.bottomactionmenu.b4xpages _b4xpages = null;
public com.stolte.bottomactionmenu.b4xcollections _b4xcollections = null;
public String  _initialize(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_parent}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _jroot = null;
anywheresoftware.b4a.objects.collections.Map _coljroot = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub Initialize(Callback As Object,EventName";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="xParent = Parent";
__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="m_HeaderHeight = 40dip";
__ref._m_headerheight /*float*/  = (float) (__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="m_BodyHeight = 300dip";
__ref._m_bodyheight /*float*/  = (float) (__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="xpnl_Body = xui.CreatePanel(\"\")";
__ref._xpnl_body /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="xpnl_DragIndicator = xui.CreatePanel(\"\")";
__ref._xpnl_dragindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="xpnl_ListviewBackground = xui.CreatePanel(\"\")";
__ref._xpnl_listviewbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="xpnl_ListviewBackground.SetLayoutAnimated(0,0,0,P";
__ref._xpnl_listviewbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_parent.getWidth(),(int) (__ref._m_bodyheight /*float*/ ));
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="m_HeaderColor = xui.Color_ARGB(255,32, 33, 37)";
__ref._m_headercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37));
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="m_BodyColor = xui.Color_ARGB(255,32, 33, 37)";
__ref._m_bodycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37));
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="m_CategoryTextColor = xui.Color_White";
__ref._m_categorytextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="m_CategoryIndicatorColor = xui.Color_White";
__ref._m_categoryindicatorcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="m_EmojiSize = 30";
__ref._m_emojisize /*int*/  = (int) (30);
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="m_Rows = 5";
__ref._m_rows /*int*/  = (int) (5);
RDebugUtils.currentLine=1310742;
 //BA.debugLineNum = 1310742;BA.debugLine="ini_xclv";
__ref._ini_xclv /*String*/ (null);
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="m_Emojis.Initialize";
__ref._m_emojis /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1310746;
 //BA.debugLineNum = 1310746;BA.debugLine="parser.Initialize(File.ReadString(File.DirAssets,";
_parser.Initialize(__c.File.ReadString(__c.File.getDirAssets(),"data-by-group.json"));
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="Dim jRoot As List = parser.NextArray";
_jroot = new anywheresoftware.b4a.objects.collections.List();
_jroot = _parser.NextArray();
RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="For Each coljRoot As Map In jRoot";
_coljroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group22 = _jroot;
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_coljroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group22.Get(index22)));
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="m_Emojis.Put(coljRoot.Get(\"slug\"),coljRoot)";
__ref._m_emojis /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_coljroot.Get((Object)("slug")),(Object)(_coljroot.getObject()));
 }
};
RDebugUtils.currentLine=1310753;
 //BA.debugLineNum = 1310753;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "setbackgroundcolor", false))
	 {return ((String) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_color}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub setBackgroundColor(Color As Int)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="m_BodyColor = Color";
__ref._m_bodycolor /*int*/  = _color;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If BottomCard.IsInitialized Then BottomCard.BodyP";
if (__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ .IsInitialized /*boolean*/ ()) { 
__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._getbodypanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );};
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="m_HeaderColor = Color";
__ref._m_headercolor /*int*/  = _color;
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="xpnl_Body.Color = Color";
__ref._xpnl_body /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_color);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="xpnl_Header.Color = Color";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_color);
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return "";
}
public String  _setcategorytextcolor(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "setcategorytextcolor", false))
	 {return ((String) Debug.delegate(ba, "setcategorytextcolor", new Object[] {_color}));}
int[] _argb = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub setCategoryTextColor(Color As Int)";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="m_CategoryTextColor = Color";
__ref._m_categorytextcolor /*int*/  = _color;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim ARGB() As Int = GetARGB(m_CategoryTextColor)";
_argb = __ref._getargb /*int[]*/ (null,__ref._m_categorytextcolor /*int*/ );
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="xpnl_DragIndicator.SetColorAndBorder(xui.Color_AR";
__ref._xpnl_dragindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),_argb[(int) (1)],_argb[(int) (2)],_argb[(int) (3)]),(int) (0),(int) (0),__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="End Sub";
return "";
}
public String  _setcategoryindicatorcolor(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "setcategoryindicatorcolor", false))
	 {return ((String) Debug.delegate(ba, "setcategoryindicatorcolor", new Object[] {_color}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub setCategoryIndicatorColor(Color As Int)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="m_CategoryIndicatorColor = Color";
__ref._m_categoryindicatorcolor /*int*/  = _color;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public String  _setemojisize(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "setemojisize", false))
	 {return ((String) Debug.delegate(ba, "setemojisize", new Object[] {_size}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub setEmojiSize(Size As Int)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="m_EmojiSize= Size";
__ref._m_emojisize /*int*/  = _size;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public String  _setbodyheight(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "setbodyheight", false))
	 {return ((String) Debug.delegate(ba, "setbodyheight", new Object[] {_height}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub setBodyHeight(Height As Float)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="m_BodyHeight = Height";
__ref._m_bodyheight /*float*/  = _height;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public String  _setrows(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,int _rows) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "setrows", false))
	 {return ((String) Debug.delegate(ba, "setrows", new Object[] {_rows}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub setRows(Rows As Int)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="m_Rows = Rows";
__ref._m_rows /*int*/  = _rows;
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public void  _showpicker(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "showpicker", false))
	 {Debug.delegate(ba, "showpicker", null); return;}
ResumableSub_ShowPicker rsub = new ResumableSub_ShowPicker(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowPicker extends BA.ResumableSub {
public ResumableSub_ShowPicker(com.stolte.bottomactionmenu.as_bottomemojipicker parent,com.stolte.bottomactionmenu.as_bottomemojipicker __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.stolte.bottomactionmenu.as_bottomemojipicker __ref;
com.stolte.bottomactionmenu.as_bottomemojipicker parent;
float _datepickerheight = 0f;
float _safeareaheight = 0f;
int[] _argb = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="as_bottomemojipicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim DatePickerHeight As Float = m_BodyHeight";
_datepickerheight = __ref._m_bodyheight /*float*/ ;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Dim SafeAreaHeight As Float = 0";
_safeareaheight = (float) (0);
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="SafeAreaHeight = 20dip";
_safeareaheight = (float) (parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="m_BodyHeight = m_BodyHeight + SafeAreaHeight";
__ref._m_bodyheight /*float*/  = (float) (__ref._m_bodyheight /*float*/ +_safeareaheight);
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="BottomCard.Initialize(Me,\"BottomCard\")";
__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._initialize /*String*/ (null,ba,parent,"BottomCard");
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="BottomCard.BodyDrag = True";
__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._setbodydrag /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="BottomCard.Create(xParent,m_BodyHeight,m_BodyHeig";
__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._create /*String*/ (null,__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._m_bodyheight /*float*/ ,__ref._m_bodyheight /*float*/ ,__ref._m_headerheight /*float*/ ,(float) (__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._orientation_middle /*int*/ (null));
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="xpnl_Header.AddView(xpnl_DragIndicator,xParent.Wi";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_dragindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-parent.__c.DipToCurrent((int) (70))/(double)2),(int) (__ref._m_headerheight /*float*/ /(double)2-parent.__c.DipToCurrent((int) (6))/(double)2),parent.__c.DipToCurrent((int) (70)),parent.__c.DipToCurrent((int) (6)));
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="Dim ARGB() As Int = GetARGB(m_CategoryTextColor)";
_argb = __ref._getargb /*int[]*/ (null,__ref._m_categorytextcolor /*int*/ );
RDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="xpnl_DragIndicator.SetColorAndBorder(xui.Color_AR";
__ref._xpnl_dragindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),_argb[(int) (1)],_argb[(int) (2)],_argb[(int) (3)]),(int) (0),(int) (0),parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=1441815;
 //BA.debugLineNum = 1441815;BA.debugLine="BottomCard.BodyPanel.Color = m_BodyColor";
__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._getbodypanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=1441816;
 //BA.debugLineNum = 1441816;BA.debugLine="BottomCard.HeaderPanel.AddView(xpnl_Header,0,0,xP";
__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._getheaderpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).AddView((android.view.View)(__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._m_headerheight /*float*/ ));
RDebugUtils.currentLine=1441817;
 //BA.debugLineNum = 1441817;BA.debugLine="BottomCard.BodyPanel.AddView(xpnl_Body,0,0,xParen";
__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._getbodypanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).AddView((android.view.View)(__ref._xpnl_body /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (_datepickerheight));
RDebugUtils.currentLine=1441818;
 //BA.debugLineNum = 1441818;BA.debugLine="BottomCard.CornerRadius_Header = 30dip/2";
__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._setcornerradius_header(null,(float) (parent.__c.DipToCurrent((int) (30))/(double)2));
RDebugUtils.currentLine=1441820;
 //BA.debugLineNum = 1441820;BA.debugLine="xpnl_CategoriesBackground = xui.CreatePanel(\"\")";
__ref._xpnl_categoriesbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1441821;
 //BA.debugLineNum = 1441821;BA.debugLine="xpnl_Body.AddView(xpnl_CategoriesBackground,0,0,x";
__ref._xpnl_body /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_categoriesbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._xpnl_body /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)9));
RDebugUtils.currentLine=1441823;
 //BA.debugLineNum = 1441823;BA.debugLine="xpnl_ListviewBackground.RemoveViewFromParent";
__ref._xpnl_listviewbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=1441824;
 //BA.debugLineNum = 1441824;BA.debugLine="xpnl_Body.AddView(xpnl_ListviewBackground,0,xPare";
__ref._xpnl_body /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_listviewbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)9),__ref._xpnl_body /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._m_bodyheight /*float*/ -__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)9-_safeareaheight));
RDebugUtils.currentLine=1441829;
 //BA.debugLineNum = 1441829;BA.debugLine="CreateCategories(Array As String(\"smileys_emotion";
__ref._createcategories /*String*/ (null,new String[]{"smileys_emotion","people_body"},BA.ObjectToString(parent.__c.Chr(((int)0xe24e))));
RDebugUtils.currentLine=1441830;
 //BA.debugLineNum = 1441830;BA.debugLine="CreateCategories(Array As String(\"animals_nature\"";
__ref._createcategories /*String*/ (null,new String[]{"animals_nature"},BA.ObjectToString(parent.__c.Chr(((int)0xe91d))));
RDebugUtils.currentLine=1441831;
 //BA.debugLineNum = 1441831;BA.debugLine="CreateCategories(Array As String(\"food_drink\"),Ch";
__ref._createcategories /*String*/ (null,new String[]{"food_drink"},BA.ObjectToString(parent.__c.Chr(((int)0xe556))));
RDebugUtils.currentLine=1441832;
 //BA.debugLineNum = 1441832;BA.debugLine="CreateCategories(Array As String(\"travel_places\")";
__ref._createcategories /*String*/ (null,new String[]{"travel_places"},BA.ObjectToString(parent.__c.Chr(((int)0xe0af))));
RDebugUtils.currentLine=1441833;
 //BA.debugLineNum = 1441833;BA.debugLine="CreateCategories(Array As String(\"activities\"),Ch";
__ref._createcategories /*String*/ (null,new String[]{"activities"},BA.ObjectToString(parent.__c.Chr(((int)0xe566))));
RDebugUtils.currentLine=1441834;
 //BA.debugLineNum = 1441834;BA.debugLine="CreateCategories(Array As String(\"objects\"),Chr(0";
__ref._createcategories /*String*/ (null,new String[]{"objects"},BA.ObjectToString(parent.__c.Chr(((int)0xe90f))));
RDebugUtils.currentLine=1441835;
 //BA.debugLineNum = 1441835;BA.debugLine="CreateCategories(Array As String(\"symbols\"),Chr(0";
__ref._createcategories /*String*/ (null,new String[]{"symbols"},BA.ObjectToString(parent.__c.Chr(((int)0xe52e))));
RDebugUtils.currentLine=1441836;
 //BA.debugLineNum = 1441836;BA.debugLine="CreateCategories(Array As String(\"flags\"),Chr(0xE";
__ref._createcategories /*String*/ (null,new String[]{"flags"},BA.ObjectToString(parent.__c.Chr(((int)0xe153))));
RDebugUtils.currentLine=1441838;
 //BA.debugLineNum = 1441838;BA.debugLine="CurrentCategory = \"smileys_emotion\"";
__ref._currentcategory /*String*/  = "smileys_emotion";
RDebugUtils.currentLine=1441846;
 //BA.debugLineNum = 1441846;BA.debugLine="xpnl_CurrentCategoryIndicator = xui.CreatePanel(\"";
__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1441847;
 //BA.debugLineNum = 1441847;BA.debugLine="xpnl_CategoriesBackground.AddView(xpnl_CurrentCat";
__ref._xpnl_categoriesbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)9-parent.__c.DipToCurrent((int) (2))),(int) (__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)9),parent.__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=1441848;
 //BA.debugLineNum = 1441848;BA.debugLine="xpnl_CurrentCategoryIndicator.Color = m_CategoryI";
__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_categoryindicatorcolor /*int*/ );
RDebugUtils.currentLine=1441851;
 //BA.debugLineNum = 1441851;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_bottomemojipicker", "showpicker"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=1441853;
 //BA.debugLineNum = 1441853;BA.debugLine="BottomCard.Show(False)";
__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._show /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=1441855;
 //BA.debugLineNum = 1441855;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _hidepicker(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "hidepicker", false))
	 {return ((String) Debug.delegate(ba, "hidepicker", null));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Public Sub HidePicker";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="BottomCard.Hide(False)";
__ref._bottomcard /*com.stolte.bottomactionmenu.asdraggablebottomcard*/ ._hide /*void*/ (null,__c.False);
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="Private xParent As B4XView";
_xparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Private BottomCard As ASDraggableBottomCard";
_bottomcard = new com.stolte.bottomactionmenu.asdraggablebottomcard();
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="Private xpnl_ListviewBackground As B4XView";
_xpnl_listviewbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Private xclv_Main As CustomListView";
_xclv_main = new b4a.example3.customlistview();
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="Private xpnl_Header As B4XView";
_xpnl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="Private xpnl_Body As B4XView";
_xpnl_body = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="Private xpnl_DragIndicator As B4XView";
_xpnl_dragindicator = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="Private m_HeaderHeight As Float";
_m_headerheight = 0f;
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="Private m_BodyHeight As Float";
_m_bodyheight = 0f;
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="Private m_HeaderColor As Int";
_m_headercolor = 0;
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="Private m_BodyColor As Int";
_m_bodycolor = 0;
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="Private m_CategoryTextColor As Int";
_m_categorytextcolor = 0;
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="Private m_CategoryIndicatorColor As Int";
_m_categoryindicatorcolor = 0;
RDebugUtils.currentLine=1245206;
 //BA.debugLineNum = 1245206;BA.debugLine="Private m_EmojiSize As Int";
_m_emojisize = 0;
RDebugUtils.currentLine=1245207;
 //BA.debugLineNum = 1245207;BA.debugLine="Private m_Rows As Int";
_m_rows = 0;
RDebugUtils.currentLine=1245209;
 //BA.debugLineNum = 1245209;BA.debugLine="Private m_Emojis As Map";
_m_emojis = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1245210;
 //BA.debugLineNum = 1245210;BA.debugLine="Private xpnl_CategoriesBackground As B4XView";
_xpnl_categoriesbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1245211;
 //BA.debugLineNum = 1245211;BA.debugLine="Private xpnl_CurrentCategoryIndicator As B4XView";
_xpnl_currentcategoryindicator = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1245212;
 //BA.debugLineNum = 1245212;BA.debugLine="Private CurrentCategory As String";
_currentcategory = "";
RDebugUtils.currentLine=1245213;
 //BA.debugLineNum = 1245213;BA.debugLine="End Sub";
return "";
}
public String  _createcategories(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,String[] _categorynames,String _icon) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "createcategories", false))
	 {return ((String) Debug.delegate(ba, "createcategories", new Object[] {_categorynames,_icon}));}
float _width = 0f;
String _category = "";
int _counter = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_emojibackground = null;
anywheresoftware.b4a.objects.collections.List _emojis = null;
anywheresoftware.b4a.objects.collections.Map _colemojis = null;
float _heightwidth = 0f;
anywheresoftware.b4a.objects.collections.List _tmp_lst = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub CreateCategories(CategoryNames() As St";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim Width As Float = xParent.Width/8";
_width = (float) (__ref._xparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)8);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="xpnl_CategoriesBackground.AddView(CreateCategoryI";
__ref._xpnl_categoriesbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._createcategoryitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_icon,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (25)),(Object)(_categorynames[(int) (0)])).getObject()),(int) (_width*__ref._xpnl_categoriesbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()),(int) (0),(int) (_width),(int) (_width));
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="For Each Category As String In CategoryNames";
{
final String[] group3 = _categorynames;
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_category = group3[index3];
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="If m_Emojis.ContainsKey(Category) = False Then";
if (__ref._m_emojis /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_category))==__c.False) { 
 }else {
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="Dim Counter As Int = 0";
_counter = (int) (0);
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="Dim xpnl_EmojiBackground As B4XView";
_xpnl_emojibackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="Dim emojis As List = m_Emojis.Get(Category).As(";
_emojis = new anywheresoftware.b4a.objects.collections.List();
_emojis = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._m_emojis /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_category))))).Get((Object)("emojis"))));
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="For Each colemojis As Map In emojis";
_colemojis = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group9 = _emojis;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_colemojis = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="Dim HeightWidth As Float = xpnl_ListviewBackgr";
_heightwidth = (float) (__ref._xpnl_listviewbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._m_rows /*int*/ );
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="If Counter Mod m_Rows = 0 Then";
if (_counter%__ref._m_rows /*int*/ ==0) { 
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="xpnl_EmojiBackground = xui.CreatePanel(\"\")";
_xpnl_emojibackground = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1507350;
 //BA.debugLineNum = 1507350;BA.debugLine="xpnl_EmojiBackground.SetLayoutAnimated(0,0,0,";
_xpnl_emojibackground.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_heightwidth),(int) (_heightwidth));
RDebugUtils.currentLine=1507351;
 //BA.debugLineNum = 1507351;BA.debugLine="Dim tmp_lst As List";
_tmp_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507352;
 //BA.debugLineNum = 1507352;BA.debugLine="tmp_lst.Initialize";
_tmp_lst.Initialize();
RDebugUtils.currentLine=1507353;
 //BA.debugLineNum = 1507353;BA.debugLine="xpnl_EmojiBackground.Tag = tmp_lst";
_xpnl_emojibackground.setTag((Object)(_tmp_lst.getObject()));
RDebugUtils.currentLine=1507354;
 //BA.debugLineNum = 1507354;BA.debugLine="xclv_Main.Add(xpnl_EmojiBackground,m_Emojis.G";
__ref._xclv_main /*b4a.example3.customlistview*/ ._add(_xpnl_emojibackground,((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._m_emojis /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_category))))).Get((Object)("slug")));
 };
RDebugUtils.currentLine=1507357;
 //BA.debugLineNum = 1507357;BA.debugLine="xpnl_EmojiBackground.Tag.As(List).Add(colemoji";
((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_xpnl_emojibackground.getTag()))).Add(_colemojis.Get((Object)("emoji")));
RDebugUtils.currentLine=1507360;
 //BA.debugLineNum = 1507360;BA.debugLine="Counter = Counter +1";
_counter = (int) (_counter+1);
 }
};
 };
 }
};
RDebugUtils.currentLine=1507367;
 //BA.debugLineNum = 1507367;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createcategoryitem(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "createcategoryitem", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createcategoryitem", new Object[] {_text,_xfont,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub CreateCategoryItem(Text As String,xFon";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim xlbl As B4XView = CreateLabel(\"xlbl_Category\"";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_Category");
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="xlbl.Font = xFont";
_xlbl.setFont(_xfont);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="xlbl.TextColor = m_CategoryTextColor";
_xlbl.setTextColor(__ref._m_categorytextcolor /*int*/ );
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="xlbl.Tag = Value";
_xlbl.setTag(_value);
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="Return xlbl";
if (true) return _xlbl;
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="End Sub";
return null;
}
public String  _emojiselected(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "emojiselected", false))
	 {return ((String) Debug.delegate(ba, "emojiselected", new Object[] {_text}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub EmojiSelected(Text As String)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EmojiS";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EmojiSelected",(int) (1))) { 
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="CallSub2(mCallBack, mEventName & \"_EmojiSelected";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EmojiSelected",(Object)(_text));
 };
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="End Sub";
return "";
}
public int[]  _getargb(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "getargb", false))
	 {return ((int[]) Debug.delegate(ba, "getargb", new Object[] {_color}));}
int[] _res = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()'ignore";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim res(4) As Int";
_res = new int[(int) (4)];
;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="End Sub";
return null;
}
public int  _getbackgroundcolor(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "getbackgroundcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getbackgroundcolor", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub getBackgroundColor As Int";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Return m_BodyColor";
if (true) return __ref._m_bodycolor /*int*/ ;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return 0;
}
public float  _getbodyheight(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "getbodyheight", false))
	 {return ((Float) Debug.delegate(ba, "getbodyheight", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub getBodyHeight As Float";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Return m_BodyHeight";
if (true) return __ref._m_bodyheight /*float*/ ;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return 0f;
}
public int  _getcategoryindicatorcolor(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "getcategoryindicatorcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getcategoryindicatorcolor", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub getCategoryIndicatorColor As Int";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Return m_CategoryIndicatorColor";
if (true) return __ref._m_categoryindicatorcolor /*int*/ ;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return 0;
}
public int  _getcategorytextcolor(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "getcategorytextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getcategorytextcolor", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub getCategoryTextColor As Int";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Return m_CategoryTextColor";
if (true) return __ref._m_categorytextcolor /*int*/ ;
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return 0;
}
public int  _getemojisize(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "getemojisize", false))
	 {return ((Integer) Debug.delegate(ba, "getemojisize", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub getEmojiSize As Int";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Return m_EmojiSize";
if (true) return __ref._m_emojisize /*int*/ ;
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return 0;
}
public int  _getrows(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "getrows", false))
	 {return ((Integer) Debug.delegate(ba, "getrows", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub getRows As Int";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Return m_Rows";
if (true) return __ref._m_rows /*int*/ ;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return 0;
}
public String  _ini_xclv(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "ini_xclv", false))
	 {return ((String) Debug.delegate(ba, "ini_xclv", null));}
anywheresoftware.b4a.objects.LabelWrapper _tmplbl = null;
anywheresoftware.b4a.objects.collections.Map _tmpmap = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub ini_xclv";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="tmpmap.Put(\"DividerColor\",0x00FFFFFF)";
_tmpmap.Put((Object)("DividerColor"),(Object)(((int)0x00ffffff)));
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="tmpmap.Put(\"DividerHeight\",0)";
_tmpmap.Put((Object)("DividerHeight"),(Object)(0));
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="tmpmap.Put(\"PressedColor\",0x00FFFFFF)";
_tmpmap.Put((Object)("PressedColor"),(Object)(((int)0x00ffffff)));
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="tmpmap.Put(\"InsertAnimationDuration\",0)";
_tmpmap.Put((Object)("InsertAnimationDuration"),(Object)(0));
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="tmpmap.Put(\"ListOrientation\",\"Horizontal\")";
_tmpmap.Put((Object)("ListOrientation"),(Object)("Horizontal"));
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="tmpmap.Put(\"ShowScrollBar\",False)";
_tmpmap.Put((Object)("ShowScrollBar"),(Object)(__c.False));
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="xclv_Main.Initialize(Me,\"xclv_main\")";
__ref._xclv_main /*b4a.example3.customlistview*/ ._initialize(ba,this,"xclv_main");
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="xclv_Main.DesignerCreateView(xpnl_ListviewBackgro";
__ref._xclv_main /*b4a.example3.customlistview*/ ._designercreateview((Object)(__ref._xpnl_listviewbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_tmplbl,_tmpmap);
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="xclv_Main.AsView.SetLayoutAnimated(0,xclv_Main.As";
__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (0),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getLeft(),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getTop(),__ref._xpnl_listviewbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_listviewbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="xclv_Main.Base_Resize(xpnl_ListviewBackground.Wid";
__ref._xclv_main /*b4a.example3.customlistview*/ ._base_resize(__ref._xpnl_listviewbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_listviewbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1376281;
 //BA.debugLineNum = 1376281;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_visiblerangechanged(com.stolte.bottomactionmenu.as_bottomemojipicker __ref,int _firstindex,int _lastindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "xclv_main_visiblerangechanged", false))
	 {return ((String) Debug.delegate(ba, "xclv_main_visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_category = null;
int _extrasize = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.collections.List _tmp_list = null;
int _z = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_emoji = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub xclv_main_VisibleRangeChanged (FirstIn";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="If xclv_Main.GetValue(FirstIndex) <> CurrentCateg";
if ((__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_firstindex)).equals((Object)(__ref._currentcategory /*String*/ )) == false) { 
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="For i = 0 To xpnl_CategoriesBackground.NumberOfV";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xpnl_categoriesbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="If xclv_Main.GetValue(FirstIndex) = xpnl_Catego";
if ((__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_firstindex)).equals(__ref._xpnl_categoriesbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).getTag())) { 
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="Dim xlbl_Category As B4XView = xpnl_Categories";
_xlbl_category = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_category = __ref._xpnl_categoriesbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i);
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="xpnl_CurrentCategoryIndicator.SetLayoutAnimate";
__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (250),_xlbl_category.getLeft(),__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="CurrentCategory = xclv_Main.GetValue(FirstInde";
__ref._currentcategory /*String*/  = BA.ObjectToString(__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_firstindex));
 };
 }
};
 };
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="Dim ExtraSize As Int = 10";
_extrasize = (int) (10);
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="For i = 0 To xclv_Main.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="Dim p As B4XView = xclv_Main.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xclv_main /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=1572883;
 //BA.debugLineNum = 1572883;BA.debugLine="If i > FirstIndex - ExtraSize And i < LastIndex";
if (_i>_firstindex-_extrasize && _i<_lastindex+_extrasize) { 
RDebugUtils.currentLine=1572885;
 //BA.debugLineNum = 1572885;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
RDebugUtils.currentLine=1572887;
 //BA.debugLineNum = 1572887;BA.debugLine="Dim tmp_List As List =  p.Tag";
_tmp_list = new anywheresoftware.b4a.objects.collections.List();
_tmp_list = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_p.getTag()));
RDebugUtils.currentLine=1572888;
 //BA.debugLineNum = 1572888;BA.debugLine="For z = 0 To tmp_List.Size -1";
{
final int step16 = 1;
final int limit16 = (int) (_tmp_list.getSize()-1);
_z = (int) (0) ;
for (;_z <= limit16 ;_z = _z + step16 ) {
RDebugUtils.currentLine=1572890;
 //BA.debugLineNum = 1572890;BA.debugLine="Dim xlbl_Emoji As B4XView = CreateLabel(\"xlbl";
_xlbl_emoji = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_emoji = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_Emoji");
RDebugUtils.currentLine=1572891;
 //BA.debugLineNum = 1572891;BA.debugLine="xlbl_Emoji.Font = xui.CreateDefaultFont(m_Emo";
_xlbl_emoji.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (__ref._m_emojisize /*int*/ )));
RDebugUtils.currentLine=1572892;
 //BA.debugLineNum = 1572892;BA.debugLine="xlbl_Emoji.Text = tmp_List.Get(z)";
_xlbl_emoji.setText(BA.ObjectToCharSequence(_tmp_list.Get(_z)));
RDebugUtils.currentLine=1572893;
 //BA.debugLineNum = 1572893;BA.debugLine="xlbl_Emoji.TextColor = xui.Color_White";
_xlbl_emoji.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=1572894;
 //BA.debugLineNum = 1572894;BA.debugLine="xlbl_Emoji.SetTextAlignment(\"CENTER\",\"CENTER\"";
_xlbl_emoji.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=1572896;
 //BA.debugLineNum = 1572896;BA.debugLine="p.AddView(xlbl_Emoji,0,p.Width*z,p.Width,p.Wi";
_p.AddView((android.view.View)(_xlbl_emoji.getObject()),(int) (0),(int) (_p.getWidth()*_z),_p.getWidth(),_p.getWidth());
 }
};
 };
 }else {
RDebugUtils.currentLine=1572903;
 //BA.debugLineNum = 1572903;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=1572904;
 //BA.debugLineNum = 1572904;BA.debugLine="p.RemoveAllViews";
_p.RemoveAllViews();
 };
 };
 }
};
RDebugUtils.currentLine=1572908;
 //BA.debugLineNum = 1572908;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_category_click(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "xlbl_category_click", false))
	 {return ((String) Debug.delegate(ba, "xlbl_category_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_category = null;
int _i = 0;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub xlbl_Category_Click";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim xlbl_Category As B4XView = Sender";
_xlbl_category = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_category = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="xpnl_CurrentCategoryIndicator.SetLayoutAnimated(2";
__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (250),_xlbl_category.getLeft(),__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_currentcategoryindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="CurrentCategory = xlbl_Category.Tag";
__ref._currentcategory /*String*/  = BA.ObjectToString(_xlbl_category.getTag());
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="If xlbl_Category.Tag = \"recent\" Then";
if ((_xlbl_category.getTag()).equals((Object)("recent"))) { 
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="xclv_Main.ScrollToItem(0)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (0));
 }else {
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="For i = 0 To xclv_Main.Size -1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="If xlbl_Category.Tag = xclv_Main.GetValue(i) Th";
if ((_xlbl_category.getTag()).equals(__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i))) { 
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="xclv_Main.ScrollToItem(i)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem(_i);
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_emoji_click(com.stolte.bottomactionmenu.as_bottomemojipicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_bottomemojipicker";
if (Debug.shouldDelegate(ba, "xlbl_emoji_click", false))
	 {return ((String) Debug.delegate(ba, "xlbl_emoji_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_emoji = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub xlbl_Emoji_Click";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim xlbl_Emoji As B4XView = Sender";
_xlbl_emoji = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_emoji = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="EmojiSelected(xlbl_Emoji.Text)";
__ref._emojiselected /*String*/ (null,_xlbl_emoji.getText());
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
}