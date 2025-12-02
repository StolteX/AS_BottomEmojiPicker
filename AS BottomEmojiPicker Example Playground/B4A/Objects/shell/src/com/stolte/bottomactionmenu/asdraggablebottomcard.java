
package com.stolte.bottomactionmenu;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class asdraggablebottomcard {
    public static RemoteObject myClass;
	public asdraggablebottomcard() {
	}
    public static PCBA staticBA = new PCBA(null, asdraggablebottomcard.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mdarkpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _downy = RemoteObject.createImmutable(0f);
public static RemoteObject _old_top = RemoteObject.createImmutable(0f);
public static RemoteObject _g_first_height = RemoteObject.createImmutable(0f);
public static RemoteObject _g_second_height = RemoteObject.createImmutable(0f);
public static RemoteObject _g_width = RemoteObject.createImmutable(0f);
public static RemoteObject _g_header_height = RemoteObject.createImmutable(0f);
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
public static RemoteObject _xpnl_cardbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_cardheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_cardbody = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static com.stolte.bottomactionmenu.main _main = null;
public static com.stolte.bottomactionmenu.starter _starter = null;
public static com.stolte.bottomactionmenu.b4xpages _b4xpages = null;
public static com.stolte.bottomactionmenu.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"disable_touch",_ref.getField(false, "_disable_touch"),"downy",_ref.getField(false, "_downy"),"expand_state",_ref.getField(false, "_expand_state"),"g_darkpanel_alpha",_ref.getField(false, "_g_darkpanel_alpha"),"g_first_height",_ref.getField(false, "_g_first_height"),"g_header_height",_ref.getField(false, "_g_header_height"),"g_hide_duration",_ref.getField(false, "_g_hide_duration"),"g_IsDraggable",_ref.getField(false, "_g_isdraggable"),"g_orientation",_ref.getField(false, "_g_orientation"),"g_second_height",_ref.getField(false, "_g_second_height"),"g_show_duration",_ref.getField(false, "_g_show_duration"),"g_width",_ref.getField(false, "_g_width"),"inClosingProcess",_ref.getField(false, "_inclosingprocess"),"last_swipe2top",_ref.getField(false, "_last_swipe2top"),"m_BodyDrag",_ref.getField(false, "_m_bodydrag"),"mCallBack",_ref.getField(false, "_mcallback"),"mDarkPanel",_ref.getField(false, "_mdarkpanel"),"mDarkPanelClickable",_ref.getField(false, "_mdarkpanelclickable"),"mEventName",_ref.getField(false, "_meventname"),"mUserCanClose",_ref.getField(false, "_musercanclose"),"old_top",_ref.getField(false, "_old_top"),"xpnl_CardBase",_ref.getField(false, "_xpnl_cardbase"),"xpnl_CardBody",_ref.getField(false, "_xpnl_cardbody"),"xpnl_CardHeader",_ref.getField(false, "_xpnl_cardheader"),"xui",_ref.getField(false, "_xui")};
}
}