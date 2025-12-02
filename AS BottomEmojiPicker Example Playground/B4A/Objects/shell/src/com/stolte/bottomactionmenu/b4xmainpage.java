
package com.stolte.bottomactionmenu;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _bottomemojipicker = RemoteObject.declareNull("com.stolte.bottomactionmenu.as_bottomemojipicker");
public static RemoteObject _xlbl_emojiresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static com.stolte.bottomactionmenu.main _main = null;
public static com.stolte.bottomactionmenu.starter _starter = null;
public static com.stolte.bottomactionmenu.b4xpages _b4xpages = null;
public static com.stolte.bottomactionmenu.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BottomEmojiPicker",_ref.getField(false, "_bottomemojipicker"),"Root",_ref.getField(false, "_root"),"xlbl_EmojiResult",_ref.getField(false, "_xlbl_emojiresult"),"xui",_ref.getField(false, "_xui")};
}
}