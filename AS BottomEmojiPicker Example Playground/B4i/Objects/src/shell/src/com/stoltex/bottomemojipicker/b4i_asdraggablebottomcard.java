
package com.stoltex.bottomemojipicker;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_asdraggablebottomcard {
    public static RemoteObject myClass;
	public b4i_asdraggablebottomcard() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_asdraggablebottomcard.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("NSObject");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _mdarkpanel = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _downy = RemoteObject.createImmutable(0.0f);
public static RemoteObject _old_top = RemoteObject.createImmutable(0.0f);
public static RemoteObject _g_first_height = RemoteObject.createImmutable(0.0f);
public static RemoteObject _g_second_height = RemoteObject.createImmutable(0.0f);
public static RemoteObject _g_width = RemoteObject.createImmutable(0.0f);
public static RemoteObject _g_header_height = RemoteObject.createImmutable(0.0f);
public static RemoteObject _g_orientation = RemoteObject.createImmutable(0);
public static RemoteObject _g_show_duration = RemoteObject.createImmutable(0);
public static RemoteObject _g_hide_duration = RemoteObject.createImmutable(0);
public static RemoteObject _g_darkpanel_alpha = RemoteObject.createImmutable(0);
public static RemoteObject _g_isdraggable = RemoteObject.createImmutable(false);
public static RemoteObject _mdarkpanelclickable = RemoteObject.createImmutable(false);
public static RemoteObject _musercanclose = RemoteObject.createImmutable(false);
public static RemoteObject _m_bodydrag = RemoteObject.createImmutable(false);
public static RemoteObject _expand_state = RemoteObject.createImmutable(0);
public static RemoteObject _disable_touch = RemoteObject.createImmutable(false);
public static RemoteObject _last_swipe2top = RemoteObject.createImmutable(false);
public static RemoteObject _inclosingprocess = RemoteObject.createImmutable(false);
public static RemoteObject _xpnl_cardbase = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xpnl_cardheader = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xpnl_cardbody = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _nome = RemoteObject.declareNull("B4INativeObject");
public static RemoteObject _mview = RemoteObject.declareNull("B4IViewWrapper");
public static RemoteObject _mview2 = RemoteObject.declareNull("B4IViewWrapper");
public static b4i_main _main = null;
public static b4i_b4xpages _b4xpages = null;
public static b4i_b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"disable_touch",_ref.getField(false, "_disable_touch"),"downy",_ref.getField(false, "_downy"),"expand_state",_ref.getField(false, "_expand_state"),"g_darkpanel_alpha",_ref.getField(false, "_g_darkpanel_alpha"),"g_first_height",_ref.getField(false, "_g_first_height"),"g_header_height",_ref.getField(false, "_g_header_height"),"g_hide_duration",_ref.getField(false, "_g_hide_duration"),"g_IsDraggable",_ref.getField(false, "_g_isdraggable"),"g_orientation",_ref.getField(false, "_g_orientation"),"g_second_height",_ref.getField(false, "_g_second_height"),"g_show_duration",_ref.getField(false, "_g_show_duration"),"g_width",_ref.getField(false, "_g_width"),"inClosingProcess",_ref.getField(false, "_inclosingprocess"),"last_swipe2top",_ref.getField(false, "_last_swipe2top"),"m_BodyDrag",_ref.getField(false, "_m_bodydrag"),"mCallBack",_ref.getField(false, "_mcallback"),"mDarkPanel",_ref.getField(false, "_mdarkpanel"),"mDarkPanelClickable",_ref.getField(false, "_mdarkpanelclickable"),"mEventName",_ref.getField(false, "_meventname"),"mUserCanClose",_ref.getField(false, "_musercanclose"),"mView",_ref.getField(false, "_mview"),"mView2",_ref.getField(false, "_mview2"),"nome",_ref.getField(false, "_nome"),"old_top",_ref.getField(false, "_old_top"),"xpnl_CardBase",_ref.getField(false, "_xpnl_cardbase"),"xpnl_CardBody",_ref.getField(false, "_xpnl_cardbody"),"xpnl_CardHeader",_ref.getField(false, "_xpnl_cardheader"),"xui",_ref.getField(false, "_xui")};
}
}