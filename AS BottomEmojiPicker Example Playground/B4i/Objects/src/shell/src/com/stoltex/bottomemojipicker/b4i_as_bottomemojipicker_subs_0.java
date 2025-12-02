package com.stoltex.bottomemojipicker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_as_bottomemojipicker_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
b4i_as_bottomemojipicker._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4i_as_bottomemojipicker._meventname);
 //BA.debugLineNum = 12;BA.debugLine="Private mCallBack As Object 'ignore";
b4i_as_bottomemojipicker._mcallback = RemoteObject.createNew ("NSObject");__ref.setField("_mcallback",b4i_as_bottomemojipicker._mcallback);
 //BA.debugLineNum = 13;BA.debugLine="Private xui As XUI 'ignore";
b4i_as_bottomemojipicker._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_as_bottomemojipicker._xui);
 //BA.debugLineNum = 14;BA.debugLine="Public Tag As Object";
b4i_as_bottomemojipicker._tag = RemoteObject.createNew ("NSObject");__ref.setField("_tag",b4i_as_bottomemojipicker._tag);
 //BA.debugLineNum = 16;BA.debugLine="Private xParent As B4XView";
b4i_as_bottomemojipicker._xparent = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_xparent",b4i_as_bottomemojipicker._xparent);
 //BA.debugLineNum = 17;BA.debugLine="Private BottomCard As ASDraggableBottomCard";
b4i_as_bottomemojipicker._bottomcard = RemoteObject.createNew ("b4i_asdraggablebottomcard");__ref.setField("_bottomcard",b4i_as_bottomemojipicker._bottomcard);
 //BA.debugLineNum = 18;BA.debugLine="Private xpnl_ListviewBackground As B4XView";
b4i_as_bottomemojipicker._xpnl_listviewbackground = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_xpnl_listviewbackground",b4i_as_bottomemojipicker._xpnl_listviewbackground);
 //BA.debugLineNum = 19;BA.debugLine="Private xclv_Main As CustomListView";
b4i_as_bottomemojipicker._xclv_main = RemoteObject.createNew ("b4i_customlistview");__ref.setField("_xclv_main",b4i_as_bottomemojipicker._xclv_main);
 //BA.debugLineNum = 21;BA.debugLine="Private xpnl_Header As B4XView";
b4i_as_bottomemojipicker._xpnl_header = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_xpnl_header",b4i_as_bottomemojipicker._xpnl_header);
 //BA.debugLineNum = 22;BA.debugLine="Private xpnl_Body As B4XView";
b4i_as_bottomemojipicker._xpnl_body = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_xpnl_body",b4i_as_bottomemojipicker._xpnl_body);
 //BA.debugLineNum = 23;BA.debugLine="Private xpnl_DragIndicator As B4XView";
b4i_as_bottomemojipicker._xpnl_dragindicator = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_xpnl_dragindicator",b4i_as_bottomemojipicker._xpnl_dragindicator);
 //BA.debugLineNum = 25;BA.debugLine="Private m_HeaderHeight As Float";
b4i_as_bottomemojipicker._m_headerheight = RemoteObject.createImmutable(0.0f);__ref.setField("_m_headerheight",b4i_as_bottomemojipicker._m_headerheight);
 //BA.debugLineNum = 26;BA.debugLine="Private m_BodyHeight As Float";
b4i_as_bottomemojipicker._m_bodyheight = RemoteObject.createImmutable(0.0f);__ref.setField("_m_bodyheight",b4i_as_bottomemojipicker._m_bodyheight);
 //BA.debugLineNum = 27;BA.debugLine="Private m_HeaderColor As Int";
b4i_as_bottomemojipicker._m_headercolor = RemoteObject.createImmutable(0);__ref.setField("_m_headercolor",b4i_as_bottomemojipicker._m_headercolor);
 //BA.debugLineNum = 28;BA.debugLine="Private m_BodyColor As Int";
b4i_as_bottomemojipicker._m_bodycolor = RemoteObject.createImmutable(0);__ref.setField("_m_bodycolor",b4i_as_bottomemojipicker._m_bodycolor);
 //BA.debugLineNum = 29;BA.debugLine="Private m_TextColor As Int";
b4i_as_bottomemojipicker._m_textcolor = RemoteObject.createImmutable(0);__ref.setField("_m_textcolor",b4i_as_bottomemojipicker._m_textcolor);
 //BA.debugLineNum = 30;BA.debugLine="Private m_Emojis As String";
b4i_as_bottomemojipicker._m_emojis = RemoteObject.createImmutable("");__ref.setField("_m_emojis",b4i_as_bottomemojipicker._m_emojis);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcategories(RemoteObject __ref,RemoteObject _xpnl_background) throws Exception{
try {
		Debug.PushSubsStack("CreateCategories (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,186);
if (RapidSub.canDelegate("createcategories")) { return __ref.runUserSub(false, "as_bottomemojipicker","createcategories", __ref, _xpnl_background);}
RemoteObject _width = RemoteObject.createImmutable(0.0f);
Debug.locals.put("xpnl_Background", _xpnl_background);
 BA.debugLineNum = 186;BA.debugLine="Private Sub CreateCategories(xpnl_Background As B4";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 188;BA.debugLine="Dim Width As Float = xParent.Width/9";
Debug.ShouldStop(134217728);
_width = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"Width"),RemoteObject.createImmutable(9)}, "/",0, 0));Debug.locals.put("Width", _width);Debug.locals.put("Width", _width);
 BA.debugLineNum = 190;BA.debugLine="xpnl_Background.AddView(CreateCategoryItem(Chr(0x";
Debug.ShouldStop(536870912);
_xpnl_background.runVoidMethod ("AddView:::::",(Object)(((__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createcategoryitem::" /*RemoteObject*/ ,(Object)(BA.CharToString(b4i_main.__c.runMethod(true,"Chr:",(Object)(BA.numberCast(int.class, ((int)0xe192)))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons:",(Object)(BA.numberCast(float.class, 25)))))).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(0)}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(_width),(Object)(_width));
 BA.debugLineNum = 191;BA.debugLine="xpnl_Background.AddView(CreateCategoryItem(Chr(0x";
Debug.ShouldStop(1073741824);
_xpnl_background.runVoidMethod ("AddView:::::",(Object)(((__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createcategoryitem::" /*RemoteObject*/ ,(Object)(BA.CharToString(b4i_main.__c.runMethod(true,"Chr:",(Object)(BA.numberCast(int.class, ((int)0xe24e)))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons:",(Object)(BA.numberCast(float.class, 25)))))).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(1)}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(_width),(Object)(_width));
 BA.debugLineNum = 192;BA.debugLine="xpnl_Background.AddView(CreateCategoryItem(Chr(0x";
Debug.ShouldStop(-2147483648);
_xpnl_background.runVoidMethod ("AddView:::::",(Object)(((__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createcategoryitem::" /*RemoteObject*/ ,(Object)(BA.CharToString(b4i_main.__c.runMethod(true,"Chr:",(Object)(BA.numberCast(int.class, ((int)0xf1b0)))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFontAwesome:",(Object)(BA.numberCast(float.class, 25)))))).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(_width),(Object)(_width));
 BA.debugLineNum = 193;BA.debugLine="xpnl_Background.AddView(CreateCategoryItem(Chr(0x";
Debug.ShouldStop(1);
_xpnl_background.runVoidMethod ("AddView:::::",(Object)(((__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createcategoryitem::" /*RemoteObject*/ ,(Object)(BA.CharToString(b4i_main.__c.runMethod(true,"Chr:",(Object)(BA.numberCast(int.class, ((int)0xe556)))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons:",(Object)(BA.numberCast(float.class, 25)))))).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(3)}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(_width),(Object)(_width));
 BA.debugLineNum = 194;BA.debugLine="xpnl_Background.AddView(CreateCategoryItem(Chr(0x";
Debug.ShouldStop(2);
_xpnl_background.runVoidMethod ("AddView:::::",(Object)(((__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createcategoryitem::" /*RemoteObject*/ ,(Object)(BA.CharToString(b4i_main.__c.runMethod(true,"Chr:",(Object)(BA.numberCast(int.class, ((int)0xe566)))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons:",(Object)(BA.numberCast(float.class, 25)))))).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(4)}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(_width),(Object)(_width));
 BA.debugLineNum = 195;BA.debugLine="xpnl_Background.AddView(CreateCategoryItem(Chr(0x";
Debug.ShouldStop(4);
_xpnl_background.runVoidMethod ("AddView:::::",(Object)(((__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createcategoryitem::" /*RemoteObject*/ ,(Object)(BA.CharToString(b4i_main.__c.runMethod(true,"Chr:",(Object)(BA.numberCast(int.class, ((int)0xe0af)))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons:",(Object)(BA.numberCast(float.class, 25)))))).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(5)}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(_width),(Object)(_width));
 BA.debugLineNum = 196;BA.debugLine="xpnl_Background.AddView(CreateCategoryItem(Chr(0x";
Debug.ShouldStop(8);
_xpnl_background.runVoidMethod ("AddView:::::",(Object)(((__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createcategoryitem::" /*RemoteObject*/ ,(Object)(BA.CharToString(b4i_main.__c.runMethod(true,"Chr:",(Object)(BA.numberCast(int.class, ((int)0xe90f)))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons:",(Object)(BA.numberCast(float.class, 25)))))).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(6)}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(_width),(Object)(_width));
 BA.debugLineNum = 197;BA.debugLine="xpnl_Background.AddView(CreateCategoryItem(Chr(0x";
Debug.ShouldStop(16);
_xpnl_background.runVoidMethod ("AddView:::::",(Object)(((__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createcategoryitem::" /*RemoteObject*/ ,(Object)(BA.CharToString(b4i_main.__c.runMethod(true,"Chr:",(Object)(BA.numberCast(int.class, ((int)0xe87d)))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons:",(Object)(BA.numberCast(float.class, 25)))))).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(7)}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(_width),(Object)(_width));
 BA.debugLineNum = 198;BA.debugLine="xpnl_Background.AddView(CreateCategoryItem(Chr(0x";
Debug.ShouldStop(32);
_xpnl_background.runVoidMethod ("AddView:::::",(Object)(((__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createcategoryitem::" /*RemoteObject*/ ,(Object)(BA.CharToString(b4i_main.__c.runMethod(true,"Chr:",(Object)(BA.numberCast(int.class, ((int)0xe153)))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons:",(Object)(BA.numberCast(float.class, 25)))))).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(8)}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(_width),(Object)(_width));
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcategoryitem(RemoteObject __ref,RemoteObject _text,RemoteObject _xfont) throws Exception{
try {
		Debug.PushSubsStack("CreateCategoryItem (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,203);
if (RapidSub.canDelegate("createcategoryitem")) { return __ref.runUserSub(false, "as_bottomemojipicker","createcategoryitem", __ref, _text, _xfont);}
RemoteObject _xlbl = RemoteObject.declareNull("B4XViewWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("xFont", _xfont);
 BA.debugLineNum = 203;BA.debugLine="Private Sub CreateCategoryItem(Text As String,xFon";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Dim xlbl As B4XView = CreateLabel(\"\")";
Debug.ShouldStop(2048);
_xlbl = RemoteObject.createNew ("B4XViewWrapper");
_xlbl = __ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createlabel:" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 205;BA.debugLine="xlbl.Font = xFont";
Debug.ShouldStop(4096);
_xlbl.runMethod(false,"setFont:",_xfont);
 BA.debugLineNum = 206;BA.debugLine="xlbl.Text = Text";
Debug.ShouldStop(8192);
_xlbl.runMethod(true,"setText:",_text);
 BA.debugLineNum = 207;BA.debugLine="xlbl.TextColor = xui.Color_White";
Debug.ShouldStop(16384);
_xlbl.runMethod(true,"setTextColor:",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White"));
 BA.debugLineNum = 208;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.ShouldStop(32768);
_xlbl.runVoidMethod ("SetTextAlignment::",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 209;BA.debugLine="Return xlbl";
Debug.ShouldStop(65536);
if (true) return _xlbl;
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createemojilabel(RemoteObject __ref,RemoteObject _startrange,RemoteObject _endrange) throws Exception{
try {
		Debug.PushSubsStack("CreateEmojiLabel (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,162);
if (RapidSub.canDelegate("createemojilabel")) { return __ref.runUserSub(false, "as_bottomemojipicker","createemojilabel", __ref, _startrange, _endrange);}
RemoteObject _counter = RemoteObject.createImmutable(0);
RemoteObject _xpnl_emojibackground = RemoteObject.declareNull("B4XViewWrapper");
int _i = 0;
RemoteObject _heightwidth = RemoteObject.createImmutable(0.0f);
RemoteObject _xlbl_emoji = RemoteObject.declareNull("B4XViewWrapper");
Debug.locals.put("StartRange", _startrange);
Debug.locals.put("EndRange", _endrange);
 BA.debugLineNum = 162;BA.debugLine="Private Sub CreateEmojiLabel(StartRange As Int,End";
Debug.ShouldStop(2);
 BA.debugLineNum = 164;BA.debugLine="Dim Counter As Int = 0";
Debug.ShouldStop(8);
_counter = BA.numberCast(int.class, 0);Debug.locals.put("Counter", _counter);Debug.locals.put("Counter", _counter);
 BA.debugLineNum = 165;BA.debugLine="Dim xpnl_EmojiBackground As B4XView";
Debug.ShouldStop(16);
_xpnl_emojibackground = RemoteObject.createNew ("B4XViewWrapper");Debug.locals.put("xpnl_EmojiBackground", _xpnl_emojibackground);
 BA.debugLineNum = 166;BA.debugLine="For i = StartRange To EndRange";
Debug.ShouldStop(32);
{
final int step3 = 1;
final int limit3 = _endrange.<Number>get().intValue();
_i = _startrange.<Number>get().intValue() ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 168;BA.debugLine="Dim HeightWidth As Float = xpnl_ListviewBackgrou";
Debug.ShouldStop(128);
_heightwidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).runMethod(true,"Height"),RemoteObject.createImmutable(5)}, "/",0, 0));Debug.locals.put("HeightWidth", _heightwidth);Debug.locals.put("HeightWidth", _heightwidth);
 BA.debugLineNum = 169;BA.debugLine="If Counter Mod 5 = 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(5)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 170;BA.debugLine="xpnl_EmojiBackground = xui.CreatePanel(\"\")";
Debug.ShouldStop(512);
_xpnl_emojibackground = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_EmojiBackground", _xpnl_emojibackground);
 BA.debugLineNum = 171;BA.debugLine="xpnl_EmojiBackground.SetLayoutAnimated(0,0,0,He";
Debug.ShouldStop(1024);
_xpnl_emojibackground.runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(_heightwidth),(Object)(_heightwidth));
 BA.debugLineNum = 172;BA.debugLine="xclv_Main.Add(xpnl_EmojiBackground,\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_add::",(Object)(_xpnl_emojibackground),(Object)((RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 175;BA.debugLine="Dim xlbl_Emoji As B4XView = CreateLabel(\"\")";
Debug.ShouldStop(16384);
_xlbl_emoji = RemoteObject.createNew ("B4XViewWrapper");
_xlbl_emoji = __ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createlabel:" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xlbl_Emoji", _xlbl_emoji);Debug.locals.put("xlbl_Emoji", _xlbl_emoji);
 BA.debugLineNum = 176;BA.debugLine="xlbl_Emoji.Font = xui.CreateDefaultFont(25)";
Debug.ShouldStop(32768);
_xlbl_emoji.runMethod(false,"setFont:",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont:",(Object)(BA.numberCast(float.class, 25))));
 BA.debugLineNum = 177;BA.debugLine="xlbl_Emoji.Text = UTS(i)";
Debug.ShouldStop(65536);
_xlbl_emoji.runMethod(true,"setText:",__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_uts:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 178;BA.debugLine="xlbl_Emoji.TextColor = xui.Color_White";
Debug.ShouldStop(131072);
_xlbl_emoji.runMethod(true,"setTextColor:",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White"));
 BA.debugLineNum = 179;BA.debugLine="xlbl_Emoji.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.ShouldStop(262144);
_xlbl_emoji.runVoidMethod ("SetTextAlignment::",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 180;BA.debugLine="xpnl_EmojiBackground.AddView(xlbl_Emoji,0,Height";
Debug.ShouldStop(524288);
_xpnl_emojibackground.runVoidMethod ("AddView:::::",(Object)(((_xlbl_emoji).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_heightwidth,(RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(5)}, "%",0, 1))}, "*",0, 0))),(Object)(_heightwidth),(Object)(_heightwidth));
 BA.debugLineNum = 182;BA.debugLine="Counter = Counter +1";
Debug.ShouldStop(2097152);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Counter", _counter);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,257);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "as_bottomemojipicker","createlabel", __ref, _eventname);}
RemoteObject _lbl = RemoteObject.declareNull("B4ILabelWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 257;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(2);
_lbl = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 259;BA.debugLine="lbl.Initialize(EventName)";
Debug.ShouldStop(4);
_lbl.runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(_eventname));
 BA.debugLineNum = 260;BA.debugLine="Return lbl";
Debug.ShouldStop(8);
if (true) return BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_lbl).getObject());
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fonttobitmap(RemoteObject __ref,RemoteObject _text,RemoteObject _ismaterialicons,RemoteObject _fontsize,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("FontToBitmap (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,264);
if (RapidSub.canDelegate("fonttobitmap")) { return __ref.runUserSub(false, "as_bottomemojipicker","fonttobitmap", __ref, _text, _ismaterialicons, _fontsize, _color);}
RemoteObject _p = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _cvs1 = RemoteObject.declareNull("B4XCanvas");
RemoteObject _fnt = RemoteObject.declareNull("B4XFont");
RemoteObject _r = RemoteObject.declareNull("B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.declareNull("B4XBitmapWrapper");
Debug.locals.put("text", _text);
Debug.locals.put("IsMaterialIcons", _ismaterialicons);
Debug.locals.put("FontSize", _fontsize);
Debug.locals.put("color", _color);
 BA.debugLineNum = 264;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(256);
b4i_as_bottomemojipicker._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_as_bottomemojipicker._xui);
 BA.debugLineNum = 266;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 267;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
Debug.ShouldStop(1024);
_p.runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 32))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 32))))));
 BA.debugLineNum = 268;BA.debugLine="Dim cvs1 As B4XCanvas";
Debug.ShouldStop(2048);
_cvs1 = RemoteObject.createNew ("B4XCanvas");Debug.locals.put("cvs1", _cvs1);
 BA.debugLineNum = 269;BA.debugLine="cvs1.Initialize(p)";
Debug.ShouldStop(4096);
_cvs1.runVoidMethod ("Initialize:",(Object)(((_p).getObject())));
 BA.debugLineNum = 270;BA.debugLine="Dim fnt As B4XFont";
Debug.ShouldStop(8192);
_fnt = RemoteObject.createNew ("B4XFont");Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 271;BA.debugLine="If IsMaterialIcons Then fnt = xui.CreateMaterialI";
Debug.ShouldStop(16384);
if (_ismaterialicons.getBoolean()) { 
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons:",(Object)(_fontsize));Debug.locals.put("fnt", _fnt);}
else {
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFontAwesome:",(Object)(_fontsize));Debug.locals.put("fnt", _fnt);};
 BA.debugLineNum = 272;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
Debug.ShouldStop(32768);
_r = RemoteObject.createNew ("B4XRect");
_r = _cvs1.runMethod(false,"MeasureText::",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 273;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
Debug.ShouldStop(65536);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_cvs1.runMethod(false,"TargetRect").runMethod(true,"CenterY"),_r.runMethod(true,"Height"),RemoteObject.createImmutable(2),_r.runMethod(true,"Top")}, "-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 274;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
Debug.ShouldStop(131072);
_cvs1.runVoidMethod ("DrawText::::::",(Object)(_text),(Object)(_cvs1.runMethod(false,"TargetRect").runMethod(true,"CenterX")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_color),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 275;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
Debug.ShouldStop(262144);
_b = RemoteObject.createNew ("B4XBitmapWrapper");
_b = _cvs1.runMethod(false,"CreateBitmap");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 276;BA.debugLine="cvs1.Release";
Debug.ShouldStop(524288);
_cvs1.runVoidMethod ("Release");
 BA.debugLineNum = 277;BA.debugLine="Return b";
Debug.ShouldStop(1048576);
if (true) return _b;
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getargb(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("GetARGB (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,280);
if (RapidSub.canDelegate("getargb")) { return __ref.runUserSub(false, "as_bottomemojipicker","getargb", __ref, _color);}
RemoteObject _res = null;
Debug.locals.put("Color", _color);
 BA.debugLineNum = 280;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()'ignore";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="Dim res(4) As Int";
Debug.ShouldStop(16777216);
_res = RemoteObject.createNew("B4IArray").runMethod(false, "initObjects:::", (Object)new RemoteObject[] {BA.numberCast(int.class, 4)}, 0, null);Debug.locals.put("res", _res);
 BA.debugLineNum = 282;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.ShouldStop(33554432);
_res.runVoidMethod ("setObjectFastN::", BA.numberCast(int.class, 0),b4i_main.__c.runMethod(false,"Bit").runMethod(true,"UnsignedShiftRight::",(Object)(b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff000000))))),(Object)(BA.numberCast(int.class, 24))));
 BA.debugLineNum = 283;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.ShouldStop(67108864);
_res.runVoidMethod ("setObjectFastN::", BA.numberCast(int.class, 1),b4i_main.__c.runMethod(false,"Bit").runMethod(true,"UnsignedShiftRight::",(Object)(b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff0000))))),(Object)(BA.numberCast(int.class, 16))));
 BA.debugLineNum = 284;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.ShouldStop(134217728);
_res.runVoidMethod ("setObjectFastN::", BA.numberCast(int.class, 2),b4i_main.__c.runMethod(false,"Bit").runMethod(true,"UnsignedShiftRight::",(Object)(b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff00))))),(Object)(BA.numberCast(int.class, 8))));
 BA.debugLineNum = 285;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
Debug.ShouldStop(268435456);
_res.runVoidMethod ("setObjectFastN::", BA.numberCast(int.class, 3),b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff)))));
 BA.debugLineNum = 286;BA.debugLine="Return res";
Debug.ShouldStop(536870912);
if (true) return _res;
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getColor (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,232);
if (RapidSub.canDelegate("getcolor")) { return __ref.runUserSub(false, "as_bottomemojipicker","getcolor", __ref);}
 BA.debugLineNum = 232;BA.debugLine="Public Sub getColor As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="Return m_BodyColor";
Debug.ShouldStop(256);
if (true) return __ref.getField(true,"_m_bodycolor" /*RemoteObject*/ );
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextColor (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,220);
if (RapidSub.canDelegate("gettextcolor")) { return __ref.runUserSub(false, "as_bottomemojipicker","gettextcolor", __ref);}
 BA.debugLineNum = 220;BA.debugLine="Public Sub getTextColor As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="Return m_TextColor";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(true,"_m_textcolor" /*RemoteObject*/ );
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ini_xclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ini_xclv (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,59);
if (RapidSub.canDelegate("ini_xclv")) { return __ref.runUserSub(false, "as_bottomemojipicker","ini_xclv", __ref);}
RemoteObject _tmplbl = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _tmpmap = RemoteObject.declareNull("B4IMap");
RemoteObject _sv = RemoteObject.declareNull("B4IScrollView");
 BA.debugLineNum = 59;BA.debugLine="Private Sub ini_xclv";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Dim tmplbl As Label";
Debug.ShouldStop(134217728);
_tmplbl = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("tmplbl", _tmplbl);
 BA.debugLineNum = 61;BA.debugLine="tmplbl.Initialize(\"\")";
Debug.ShouldStop(268435456);
_tmplbl.runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 63;BA.debugLine="Dim tmpmap As Map";
Debug.ShouldStop(1073741824);
_tmpmap = RemoteObject.createNew ("B4IMap");Debug.locals.put("tmpmap", _tmpmap);
 BA.debugLineNum = 64;BA.debugLine="tmpmap.Initialize";
Debug.ShouldStop(-2147483648);
_tmpmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="tmpmap.Put(\"DividerColor\",0x00FFFFFF)";
Debug.ShouldStop(1);
_tmpmap.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("DividerColor"))),(Object)(RemoteObject.createImmutable((((int)0x00ffffff)))));
 BA.debugLineNum = 66;BA.debugLine="tmpmap.Put(\"DividerHeight\",0)";
Debug.ShouldStop(2);
_tmpmap.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("DividerHeight"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 67;BA.debugLine="tmpmap.Put(\"PressedColor\",0x00FFFFFF)";
Debug.ShouldStop(4);
_tmpmap.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("PressedColor"))),(Object)(RemoteObject.createImmutable((((int)0x00ffffff)))));
 BA.debugLineNum = 68;BA.debugLine="tmpmap.Put(\"InsertAnimationDuration\",0)";
Debug.ShouldStop(8);
_tmpmap.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("InsertAnimationDuration"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 69;BA.debugLine="tmpmap.Put(\"ListOrientation\",\"Horizontal\")";
Debug.ShouldStop(16);
_tmpmap.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("ListOrientation"))),(Object)((RemoteObject.createImmutable("Horizontal"))));
 BA.debugLineNum = 70;BA.debugLine="tmpmap.Put(\"ShowScrollBar\",False)";
Debug.ShouldStop(32);
_tmpmap.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("ShowScrollBar"))),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 71;BA.debugLine="xclv_Main.Initialize(Me,\"xclv_main\")";
Debug.ShouldStop(64);
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(__ref),(Object)(RemoteObject.createImmutable("xclv_main")));
 BA.debugLineNum = 72;BA.debugLine="xclv_Main.DesignerCreateView(xpnl_ListviewBackgro";
Debug.ShouldStop(128);
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_designercreateview:::",(Object)(((__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ )).getObject())),(Object)(_tmplbl),(Object)(_tmpmap));
 BA.debugLineNum = 80;BA.debugLine="Dim sv As ScrollView = xclv_Main.sv";
Debug.ShouldStop(32768);
_sv = RemoteObject.createNew ("B4IScrollView");
_sv = BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IScrollView"), (__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).getField(false,"_sv")).getObject());Debug.locals.put("sv", _sv);Debug.locals.put("sv", _sv);
 BA.debugLineNum = 81;BA.debugLine="sv.Color = xui.Color_Transparent'xui.Color_ARGB(2";
Debug.ShouldStop(65536);
_sv.runMethod(true,"setColor:",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_Transparent"));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,34);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "as_bottomemojipicker","initialize", __ref, _ba, _callback, _eventname, _parent);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize(Callback As Object,EventName";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(8);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 37;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(16);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 38;BA.debugLine="xParent = Parent";
Debug.ShouldStop(32);
__ref.setField ("_xparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 40;BA.debugLine="m_HeaderHeight = 40dip";
Debug.ShouldStop(128);
__ref.setField ("_m_headerheight" /*RemoteObject*/ ,BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 41;BA.debugLine="m_BodyHeight = 250dip";
Debug.ShouldStop(256);
__ref.setField ("_m_bodyheight" /*RemoteObject*/ ,BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 43;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
Debug.ShouldStop(1024);
__ref.setField ("_xpnl_header" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 44;BA.debugLine="xpnl_Body = xui.CreatePanel(\"\")";
Debug.ShouldStop(2048);
__ref.setField ("_xpnl_body" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 45;BA.debugLine="xpnl_DragIndicator = xui.CreatePanel(\"\")";
Debug.ShouldStop(4096);
__ref.setField ("_xpnl_dragindicator" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 46;BA.debugLine="xpnl_ListviewBackground = xui.CreatePanel(\"\")";
Debug.ShouldStop(8192);
__ref.setField ("_xpnl_listviewbackground" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 47;BA.debugLine="xpnl_ListviewBackground.SetLayoutAnimated(0,0,0,P";
Debug.ShouldStop(16384);
__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(_parent.runMethod(true,"Width")),(Object)(__ref.getField(true,"_m_bodyheight" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="m_HeaderColor = xui.Color_ARGB(255,32, 33, 37)";
Debug.ShouldStop(65536);
__ref.setField ("_m_headercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB::::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 37))));
 BA.debugLineNum = 50;BA.debugLine="m_BodyColor = xui.Color_ARGB(255,32, 33, 37)";
Debug.ShouldStop(131072);
__ref.setField ("_m_bodycolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB::::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 37))));
 BA.debugLineNum = 51;BA.debugLine="m_TextColor = xui.Color_White";
Debug.ShouldStop(262144);
__ref.setField ("_m_textcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White"));
 BA.debugLineNum = 53;BA.debugLine="ini_xclv";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_ini_xclv" /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="m_Emojis = File.ReadString(File.DirAssets,\"Emojis";
Debug.ShouldStop(4194304);
__ref.setField ("_m_emojis" /*RemoteObject*/ ,b4i_main.__c.runMethod(false,"File").runMethod(true,"ReadString::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("Emojis.json"))));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setColor (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,224);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "as_bottomemojipicker","setcolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 224;BA.debugLine="Public Sub setColor(Color As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="m_BodyColor = Color";
Debug.ShouldStop(1);
__ref.setField ("_m_bodycolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 226;BA.debugLine="If BottomCard.IsInitialized Then BottomCard.BodyP";
Debug.ShouldStop(2);
if (__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).getBoolean()) { 
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_getbodypanel" /*RemoteObject*/ ).runMethod(true,"setColor:",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));};
 BA.debugLineNum = 227;BA.debugLine="m_HeaderColor = Color";
Debug.ShouldStop(4);
__ref.setField ("_m_headercolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 228;BA.debugLine="xpnl_Body.Color = Color";
Debug.ShouldStop(8);
__ref.getField(false,"_xpnl_body" /*RemoteObject*/ ).runMethod(true,"setColor:",_color);
 BA.debugLineNum = 229;BA.debugLine="xpnl_Header.Color = Color";
Debug.ShouldStop(16);
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"setColor:",_color);
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,214);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "as_bottomemojipicker","settextcolor", __ref, _color);}
RemoteObject _argb = null;
Debug.locals.put("Color", _color);
 BA.debugLineNum = 214;BA.debugLine="Public Sub setTextColor(Color As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="m_TextColor = Color";
Debug.ShouldStop(4194304);
__ref.setField ("_m_textcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 216;BA.debugLine="Dim ARGB() As Int = GetARGB(m_TextColor)";
Debug.ShouldStop(8388608);
_argb = __ref.runClassMethod (b4i_as_bottomemojipicker.class, "_getargb:" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_m_textcolor" /*RemoteObject*/ )));Debug.locals.put("ARGB", _argb);Debug.locals.put("ARGB", _argb);
 BA.debugLineNum = 217;BA.debugLine="xpnl_DragIndicator.SetColorAndBorder(xui.Color_AR";
Debug.ShouldStop(16777216);
__ref.getField(false,"_xpnl_dragindicator" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder::::",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB::::",(Object)(BA.numberCast(int.class, 80)),(Object)(_argb.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, 1))),(Object)(_argb.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, 2))),(Object)(_argb.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _showpicker(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowPicker (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,86);
if (RapidSub.canDelegate("showpicker")) { __ref.runUserSub(false, "as_bottomemojipicker","showpicker", __ref); return;}
ResumableSub_ShowPicker rsub = new ResumableSub_ShowPicker(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ShowPicker extends BA.ResumableSub {
public ResumableSub_ShowPicker(b4i_as_bottomemojipicker parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4i_as_bottomemojipicker parent;
RemoteObject _datepickerheight = RemoteObject.createImmutable(0.0f);
RemoteObject _safeareaheight = RemoteObject.createImmutable(0.0f);
RemoteObject _argb = null;
RemoteObject _parser = RemoteObject.declareNull("B4IJSONParser");
RemoteObject _jroot = RemoteObject.declareNull("B4IMap");
RemoteObject _emojis = RemoteObject.declareNull("B4IMap");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _category = RemoteObject.createImmutable("");
RemoteObject _emoji = RemoteObject.createImmutable("");
RemoteObject group30;
int index30;
int groupLen30;
RemoteObject group31;
int index31;
int groupLen31;
RemoteObject group32;
int index32;
int groupLen32;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowPicker (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,86);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 88;BA.debugLine="Dim DatePickerHeight As Float = m_BodyHeight";
Debug.ShouldStop(8388608);
_datepickerheight = __ref.getField(true,"_m_bodyheight" /*RemoteObject*/ );Debug.locals.put("DatePickerHeight", _datepickerheight);Debug.locals.put("DatePickerHeight", _datepickerheight);
 BA.debugLineNum = 89;BA.debugLine="Dim SafeAreaHeight As Float = 0";
Debug.ShouldStop(16777216);
_safeareaheight = BA.numberCast(float.class, 0);Debug.locals.put("SafeAreaHeight", _safeareaheight);Debug.locals.put("SafeAreaHeight", _safeareaheight);
 BA.debugLineNum = 92;BA.debugLine="SafeAreaHeight = B4XPages.GetNativeParent(B4XPage";
Debug.ShouldStop(134217728);
_safeareaheight = parent._b4xpages.runMethod(false,"_getnativeparent:" /*RemoteObject*/ ,(Object)((parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ )))).runMethod(false,"SafeAreaInsets").runMethod(true,"Bottom");Debug.locals.put("SafeAreaHeight", _safeareaheight);
 BA.debugLineNum = 93;BA.debugLine="m_BodyHeight = m_BodyHeight + SafeAreaHeight";
Debug.ShouldStop(268435456);
__ref.setField ("_m_bodyheight" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_bodyheight" /*RemoteObject*/ ),_safeareaheight}, "+",1, 0)));
 BA.debugLineNum = 99;BA.debugLine="BottomCard.Initialize(Me,\"BottomCard\")";
Debug.ShouldStop(4);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_initialize:::" /*RemoteObject*/ ,__ref.getField(false, "bi"),(Object)(__ref),(Object)(RemoteObject.createImmutable("BottomCard")));
 BA.debugLineNum = 100;BA.debugLine="BottomCard.BodyDrag = True";
Debug.ShouldStop(8);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_setbodydrag:" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 101;BA.debugLine="BottomCard.Create(xParent,m_BodyHeight,m_BodyHeig";
Debug.ShouldStop(16);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_create::::::" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xparent" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_m_bodyheight" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_m_bodyheight" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_m_headerheight" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_orientation_middle" /*RemoteObject*/ )));
 BA.debugLineNum = 103;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
Debug.ShouldStop(64);
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"setColor:",__ref.getField(true,"_m_headercolor" /*RemoteObject*/ ));
 BA.debugLineNum = 105;BA.debugLine="xpnl_Header.AddView(xpnl_DragIndicator,xParent.Wi";
Debug.ShouldStop(256);
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_xpnl_dragindicator" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"Width"),RemoteObject.createImmutable(2),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 70))),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_headerheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 6))),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 70))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 6))))));
 BA.debugLineNum = 106;BA.debugLine="Dim ARGB() As Int = GetARGB(m_TextColor)";
Debug.ShouldStop(512);
_argb = __ref.runClassMethod (b4i_as_bottomemojipicker.class, "_getargb:" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_m_textcolor" /*RemoteObject*/ )));Debug.locals.put("ARGB", _argb);Debug.locals.put("ARGB", _argb);
 BA.debugLineNum = 107;BA.debugLine="xpnl_DragIndicator.SetColorAndBorder(xui.Color_AR";
Debug.ShouldStop(1024);
__ref.getField(false,"_xpnl_dragindicator" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder::::",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB::::",(Object)(BA.numberCast(int.class, 80)),(Object)(_argb.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, 1))),(Object)(_argb.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, 2))),(Object)(_argb.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 109;BA.debugLine="BottomCard.BodyPanel.Color = m_BodyColor";
Debug.ShouldStop(4096);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_getbodypanel" /*RemoteObject*/ ).runMethod(true,"setColor:",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 110;BA.debugLine="BottomCard.HeaderPanel.AddView(xpnl_Header,0,0,xP";
Debug.ShouldStop(8192);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_getheaderpanel" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_xpnl_header" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(true,"_m_headerheight" /*RemoteObject*/ )));
 BA.debugLineNum = 111;BA.debugLine="BottomCard.BodyPanel.AddView(xpnl_Body,0,0,xParen";
Debug.ShouldStop(16384);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_getbodypanel" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_xpnl_body" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(_datepickerheight));
 BA.debugLineNum = 112;BA.debugLine="BottomCard.CornerRadius_Header = 30dip/2";
Debug.ShouldStop(32768);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_setcornerradius_header:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 30))),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 114;BA.debugLine="CreateCategories(BottomCard.BodyPanel)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createcategories:" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_getbodypanel" /*RemoteObject*/ )));
 BA.debugLineNum = 116;BA.debugLine="xpnl_ListviewBackground.RemoveViewFromParent";
Debug.ShouldStop(524288);
__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 117;BA.debugLine="xpnl_Body.AddView(xpnl_ListviewBackground,0,xPare";
Debug.ShouldStop(1048576);
__ref.getField(false,"_xpnl_body" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"Width"),RemoteObject.createImmutable(9)}, "/",0, 0))),(Object)(__ref.getField(false,"_xpnl_body" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_bodyheight" /*RemoteObject*/ ),__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"Width"),RemoteObject.createImmutable(9),_safeareaheight}, "-/-",2, 0))));
 BA.debugLineNum = 120;BA.debugLine="CreateEmojiLabel(0x1f600,0x1f64e)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createemojilabel::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0x1f600))),(Object)(BA.numberCast(int.class, ((int)0x1f64e))));
 BA.debugLineNum = 121;BA.debugLine="CreateEmojiLabel(0x1f910,0x1f91e)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createemojilabel::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0x1f910))),(Object)(BA.numberCast(int.class, ((int)0x1f91e))));
 BA.debugLineNum = 122;BA.debugLine="CreateEmojiLabel(0x1f920,0x1f927)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createemojilabel::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0x1f920))),(Object)(BA.numberCast(int.class, ((int)0x1f927))));
 BA.debugLineNum = 123;BA.debugLine="CreateEmojiLabel(0x1f300,0x1f5ff)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createemojilabel::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0x1f300))),(Object)(BA.numberCast(int.class, ((int)0x1f5ff))));
 BA.debugLineNum = 124;BA.debugLine="CreateEmojiLabel(0x1f680,0x1f6c1)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createemojilabel::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0x1f680))),(Object)(BA.numberCast(int.class, ((int)0x1f6c1))));
 BA.debugLineNum = 125;BA.debugLine="CreateEmojiLabel(0x1f950,0x1f95e)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createemojilabel::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0x1f950))),(Object)(BA.numberCast(int.class, ((int)0x1f95e))));
 BA.debugLineNum = 126;BA.debugLine="CreateEmojiLabel(0x1f980,0x1f991)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4i_as_bottomemojipicker.class, "_createemojilabel::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0x1f980))),(Object)(BA.numberCast(int.class, ((int)0x1f991))));
 BA.debugLineNum = 128;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 129;BA.debugLine="parser.Initialize(m_Emojis)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize:",(Object)(__ref.getField(true,"_m_emojis" /*RemoteObject*/ )));
 BA.debugLineNum = 130;BA.debugLine="Dim jRoot As Map = parser.NextObject";
Debug.ShouldStop(2);
_jroot = _parser.runMethod(false,"NextObject");Debug.locals.put("jRoot", _jroot);Debug.locals.put("jRoot", _jroot);
 BA.debugLineNum = 131;BA.debugLine="Dim emojis As Map = jRoot.Get(\"emojis\")";
Debug.ShouldStop(4);
_emojis = (_jroot.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("emojis")))));Debug.locals.put("emojis", _emojis);Debug.locals.put("emojis", _emojis);
 BA.debugLineNum = 133;BA.debugLine="For Each Key As String In emojis.Keys";
Debug.ShouldStop(16);
if (true) break;

case 1:
//for
this.state = 12;
group30 = _emojis.runMethod(false,"Keys");
index30 = 0;
groupLen30 = group30.runMethod(true,"Size").<Integer>get();
Debug.locals.put("Key", _key);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 12;
if (index30 < groupLen30) {
this.state = 3;
_key = BA.ObjectToString(group30.runMethod(false,"Get:",index30));Debug.locals.put("Key", _key);}
if (true) break;

case 14:
//C
this.state = 13;
index30++;
Debug.locals.put("Key", _key);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 135;BA.debugLine="For Each Category As String In emojis.Get(Key).A";
Debug.ShouldStop(64);
if (true) break;

case 4:
//for
this.state = 11;
group31 = ((_emojis.runMethod(false,"Get:",(Object)((_key))))).runMethod(false,"Keys");
index31 = 0;
groupLen31 = group31.runMethod(true,"Size").<Integer>get();
Debug.locals.put("Category", _category);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 11;
if (index31 < groupLen31) {
this.state = 6;
_category = BA.ObjectToString(group31.runMethod(false,"Get:",index31));Debug.locals.put("Category", _category);}
if (true) break;

case 16:
//C
this.state = 15;
index31++;
Debug.locals.put("Category", _category);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 137;BA.debugLine="For Each Emoji As String In emojis.Get(Key).As(";
Debug.ShouldStop(256);
if (true) break;

case 7:
//for
this.state = 10;
group32 = ((((_emojis.runMethod(false,"Get:",(Object)((_key))))).runMethod(false,"Get:",(Object)((_category))))).runMethod(false,"Keys");
index32 = 0;
groupLen32 = group32.runMethod(true,"Size").<Integer>get();
Debug.locals.put("Emoji", _emoji);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 10;
if (index32 < groupLen32) {
this.state = 9;
_emoji = BA.ObjectToString(group32.runMethod(false,"Get:",index32));Debug.locals.put("Emoji", _emoji);}
if (true) break;

case 18:
//C
this.state = 17;
index32++;
Debug.locals.put("Emoji", _emoji);
if (true) break;

case 9:
//C
this.state = 18;
 BA.debugLineNum = 139;BA.debugLine="Log(Emoji)";
Debug.ShouldStop(1024);
b4i_main.__c.runVoidMethod ("LogImpl:::","012058677",_emoji,0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 16;
Debug.locals.put("Emoji", _emoji);
;
 BA.debugLineNum = 143;BA.debugLine="Log(Category)";
Debug.ShouldStop(16384);
b4i_main.__c.runVoidMethod ("LogImpl:::","012058681",_category,0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("Category", _category);
;
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
Debug.locals.put("Key", _key);
;
 BA.debugLineNum = 156;BA.debugLine="Sleep(0)";
Debug.ShouldStop(134217728);
b4i_main.__c.runVoidMethod ("Sleep:::",__ref.getField(false, "bi"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_bottomemojipicker", "showpicker"),BA.numberCast(int.class, 0));
this.state = 19;
return;
case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 158;BA.debugLine="BottomCard.Show(False)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_show:" /*RemoteObject*/ ,(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _uts(RemoteObject __ref,RemoteObject _codepoint) throws Exception{
try {
		Debug.PushSubsStack("UTS (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,251);
if (RapidSub.canDelegate("uts")) { return __ref.runUserSub(false, "as_bottomemojipicker","uts", __ref, _codepoint);}
RemoteObject _bc = RemoteObject.declareNull("B4IByteConverter");
RemoteObject _b = null;
Debug.locals.put("codepoint", _codepoint);
 BA.debugLineNum = 251;BA.debugLine="Private Sub UTS (codepoint As Int) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 252;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(134217728);
_bc = RemoteObject.createNew ("B4IByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 253;BA.debugLine="Dim b() As Byte = bc.IntsToBytes(Array As Int(cod";
Debug.ShouldStop(268435456);
_b = _bc.runMethod(false,"IntsToBytes:",(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {_codepoint})));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 254;BA.debugLine="Return BytesToString(b, 0, 4, \"UTF32\")";
Debug.ShouldStop(536870912);
if (true) return b4i_main.__c.runMethod(true,"BytesToString::::",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4)),(Object)(RemoteObject.createImmutable("UTF32")));
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xclv_main_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("xclv_main_ItemClick (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "bi"),__ref,240);
if (RapidSub.canDelegate("xclv_main_itemclick")) { return __ref.runUserSub(false, "as_bottomemojipicker","xclv_main_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 240;BA.debugLine="Private Sub xclv_main_ItemClick (Index As Int, Val";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_ItemCl";
Debug.ShouldStop(65536);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(BA.numberCast(int.class, 2))).getBoolean()) { 
 BA.debugLineNum = 242;BA.debugLine="CallSub3(mCallBack, mEventName & \"_ItemClick\",In";
Debug.ShouldStop(131072);
b4i_main.__c.runMethodAndSync(false,"CallSub3:::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)((_index)),(Object)(_value));
 };
 BA.debugLineNum = 244;BA.debugLine="BottomCard.Hide(True)";
Debug.ShouldStop(524288);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (b4i_asdraggablebottomcard.class, "_hide:" /*void*/ ,(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}