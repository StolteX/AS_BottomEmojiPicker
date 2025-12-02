
package com.stoltex.bottomemojipicker;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_as_bottomemojipicker {
    public static RemoteObject myClass;
	public b4i_as_bottomemojipicker() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_as_bottomemojipicker.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("NSObject");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _tag = RemoteObject.declareNull("NSObject");
public static RemoteObject _xparent = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _bottomcard = RemoteObject.declareNull("b4i_asdraggablebottomcard");
public static RemoteObject _xpnl_listviewbackground = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xclv_main = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _xpnl_header = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xpnl_body = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xpnl_dragindicator = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _m_headerheight = RemoteObject.createImmutable(0.0f);
public static RemoteObject _m_bodyheight = RemoteObject.createImmutable(0.0f);
public static RemoteObject _m_headercolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_bodycolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_emojis = RemoteObject.createImmutable("");
public static b4i_main _main = null;
public static b4i_b4xpages _b4xpages = null;
public static b4i_b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BottomCard",_ref.getField(false, "_bottomcard"),"m_BodyColor",_ref.getField(false, "_m_bodycolor"),"m_BodyHeight",_ref.getField(false, "_m_bodyheight"),"m_Emojis",_ref.getField(false, "_m_emojis"),"m_HeaderColor",_ref.getField(false, "_m_headercolor"),"m_HeaderHeight",_ref.getField(false, "_m_headerheight"),"m_TextColor",_ref.getField(false, "_m_textcolor"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Tag",_ref.getField(false, "_tag"),"xclv_Main",_ref.getField(false, "_xclv_main"),"xParent",_ref.getField(false, "_xparent"),"xpnl_Body",_ref.getField(false, "_xpnl_body"),"xpnl_DragIndicator",_ref.getField(false, "_xpnl_dragindicator"),"xpnl_Header",_ref.getField(false, "_xpnl_header"),"xpnl_ListviewBackground",_ref.getField(false, "_xpnl_listviewbackground"),"xui",_ref.getField(false, "_xui")};
}
}