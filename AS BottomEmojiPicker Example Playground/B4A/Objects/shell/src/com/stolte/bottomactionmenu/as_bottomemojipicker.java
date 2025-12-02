
package com.stolte.bottomactionmenu;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class as_bottomemojipicker {
    public static RemoteObject myClass;
	public as_bottomemojipicker() {
	}
    public static PCBA staticBA = new PCBA(null, as_bottomemojipicker.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _xparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _bottomcard = RemoteObject.declareNull("com.stolte.bottomactionmenu.asdraggablebottomcard");
public static RemoteObject _xpnl_listviewbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xclv_main = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _xpnl_header = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_body = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_dragindicator = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _m_headerheight = RemoteObject.createImmutable(0f);
public static RemoteObject _m_bodyheight = RemoteObject.createImmutable(0f);
public static RemoteObject _m_headercolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_bodycolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_categorytextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_categoryindicatorcolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_emojisize = RemoteObject.createImmutable(0);
public static RemoteObject _m_rows = RemoteObject.createImmutable(0);
public static RemoteObject _m_emojis = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _xpnl_categoriesbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_currentcategoryindicator = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _currentcategory = RemoteObject.createImmutable("");
public static com.stolte.bottomactionmenu.main _main = null;
public static com.stolte.bottomactionmenu.starter _starter = null;
public static com.stolte.bottomactionmenu.b4xpages _b4xpages = null;
public static com.stolte.bottomactionmenu.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BottomCard",_ref.getField(false, "_bottomcard"),"CurrentCategory",_ref.getField(false, "_currentcategory"),"m_BodyColor",_ref.getField(false, "_m_bodycolor"),"m_BodyHeight",_ref.getField(false, "_m_bodyheight"),"m_CategoryIndicatorColor",_ref.getField(false, "_m_categoryindicatorcolor"),"m_CategoryTextColor",_ref.getField(false, "_m_categorytextcolor"),"m_Emojis",_ref.getField(false, "_m_emojis"),"m_EmojiSize",_ref.getField(false, "_m_emojisize"),"m_HeaderColor",_ref.getField(false, "_m_headercolor"),"m_HeaderHeight",_ref.getField(false, "_m_headerheight"),"m_Rows",_ref.getField(false, "_m_rows"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Tag",_ref.getField(false, "_tag"),"xclv_Main",_ref.getField(false, "_xclv_main"),"xParent",_ref.getField(false, "_xparent"),"xpnl_Body",_ref.getField(false, "_xpnl_body"),"xpnl_CategoriesBackground",_ref.getField(false, "_xpnl_categoriesbackground"),"xpnl_CurrentCategoryIndicator",_ref.getField(false, "_xpnl_currentcategoryindicator"),"xpnl_DragIndicator",_ref.getField(false, "_xpnl_dragindicator"),"xpnl_Header",_ref.getField(false, "_xpnl_header"),"xpnl_ListviewBackground",_ref.getField(false, "_xpnl_listviewbackground"),"xui",_ref.getField(false, "_xui")};
}
}