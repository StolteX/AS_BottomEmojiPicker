
package com.stolte.bottomactionmenu;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xbytesbuilder {
    public static RemoteObject myClass;
	public b4xbytesbuilder() {
	}
    public static PCBA staticBA = new PCBA(null, b4xbytesbuilder.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mbuffer = null;
public static RemoteObject _mlength = RemoteObject.createImmutable(0);
public static com.stolte.bottomactionmenu.main _main = null;
public static com.stolte.bottomactionmenu.starter _starter = null;
public static com.stolte.bottomactionmenu.b4xpages _b4xpages = null;
public static com.stolte.bottomactionmenu.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"mBuffer",_ref.getField(false, "_mbuffer"),"mLength",_ref.getField(false, "_mlength")};
}
}