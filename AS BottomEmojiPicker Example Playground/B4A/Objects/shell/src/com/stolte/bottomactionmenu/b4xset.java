
package com.stolte.bottomactionmenu;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xset {
    public static RemoteObject myClass;
	public b4xset() {
	}
    public static PCBA staticBA = new PCBA(null, b4xset.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _map = RemoteObject.declareNull("com.stolte.bottomactionmenu.b4xorderedmap");
public static com.stolte.bottomactionmenu.main _main = null;
public static com.stolte.bottomactionmenu.starter _starter = null;
public static com.stolte.bottomactionmenu.b4xpages _b4xpages = null;
public static com.stolte.bottomactionmenu.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"map",_ref.getField(false, "_map")};
}
}