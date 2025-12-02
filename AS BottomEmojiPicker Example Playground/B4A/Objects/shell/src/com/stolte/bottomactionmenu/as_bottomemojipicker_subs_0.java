package com.stolte.bottomactionmenu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class as_bottomemojipicker_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
as_bottomemojipicker._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",as_bottomemojipicker._meventname);
 //BA.debugLineNum = 12;BA.debugLine="Private mCallBack As Object 'ignore";
as_bottomemojipicker._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",as_bottomemojipicker._mcallback);
 //BA.debugLineNum = 13;BA.debugLine="Private xui As XUI 'ignore";
as_bottomemojipicker._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",as_bottomemojipicker._xui);
 //BA.debugLineNum = 14;BA.debugLine="Public Tag As Object";
as_bottomemojipicker._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",as_bottomemojipicker._tag);
 //BA.debugLineNum = 16;BA.debugLine="Private xParent As B4XView";
as_bottomemojipicker._xparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xparent",as_bottomemojipicker._xparent);
 //BA.debugLineNum = 17;BA.debugLine="Private BottomCard As ASDraggableBottomCard";
as_bottomemojipicker._bottomcard = RemoteObject.createNew ("com.stolte.bottomactionmenu.asdraggablebottomcard");__ref.setField("_bottomcard",as_bottomemojipicker._bottomcard);
 //BA.debugLineNum = 18;BA.debugLine="Private xpnl_ListviewBackground As B4XView";
as_bottomemojipicker._xpnl_listviewbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_listviewbackground",as_bottomemojipicker._xpnl_listviewbackground);
 //BA.debugLineNum = 19;BA.debugLine="Private xclv_Main As CustomListView";
as_bottomemojipicker._xclv_main = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_xclv_main",as_bottomemojipicker._xclv_main);
 //BA.debugLineNum = 21;BA.debugLine="Private xpnl_Header As B4XView";
as_bottomemojipicker._xpnl_header = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_header",as_bottomemojipicker._xpnl_header);
 //BA.debugLineNum = 22;BA.debugLine="Private xpnl_Body As B4XView";
as_bottomemojipicker._xpnl_body = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_body",as_bottomemojipicker._xpnl_body);
 //BA.debugLineNum = 23;BA.debugLine="Private xpnl_DragIndicator As B4XView";
as_bottomemojipicker._xpnl_dragindicator = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_dragindicator",as_bottomemojipicker._xpnl_dragindicator);
 //BA.debugLineNum = 25;BA.debugLine="Private m_HeaderHeight As Float";
as_bottomemojipicker._m_headerheight = RemoteObject.createImmutable(0f);__ref.setField("_m_headerheight",as_bottomemojipicker._m_headerheight);
 //BA.debugLineNum = 26;BA.debugLine="Private m_BodyHeight As Float";
as_bottomemojipicker._m_bodyheight = RemoteObject.createImmutable(0f);__ref.setField("_m_bodyheight",as_bottomemojipicker._m_bodyheight);
 //BA.debugLineNum = 27;BA.debugLine="Private m_HeaderColor As Int";
as_bottomemojipicker._m_headercolor = RemoteObject.createImmutable(0);__ref.setField("_m_headercolor",as_bottomemojipicker._m_headercolor);
 //BA.debugLineNum = 28;BA.debugLine="Private m_BodyColor As Int";
as_bottomemojipicker._m_bodycolor = RemoteObject.createImmutable(0);__ref.setField("_m_bodycolor",as_bottomemojipicker._m_bodycolor);
 //BA.debugLineNum = 29;BA.debugLine="Private m_CategoryTextColor As Int";
as_bottomemojipicker._m_categorytextcolor = RemoteObject.createImmutable(0);__ref.setField("_m_categorytextcolor",as_bottomemojipicker._m_categorytextcolor);
 //BA.debugLineNum = 30;BA.debugLine="Private m_CategoryIndicatorColor As Int";
as_bottomemojipicker._m_categoryindicatorcolor = RemoteObject.createImmutable(0);__ref.setField("_m_categoryindicatorcolor",as_bottomemojipicker._m_categoryindicatorcolor);
 //BA.debugLineNum = 31;BA.debugLine="Private m_EmojiSize As Int";
as_bottomemojipicker._m_emojisize = RemoteObject.createImmutable(0);__ref.setField("_m_emojisize",as_bottomemojipicker._m_emojisize);
 //BA.debugLineNum = 32;BA.debugLine="Private m_Rows As Int";
as_bottomemojipicker._m_rows = RemoteObject.createImmutable(0);__ref.setField("_m_rows",as_bottomemojipicker._m_rows);
 //BA.debugLineNum = 34;BA.debugLine="Private m_Emojis As Map";
as_bottomemojipicker._m_emojis = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_m_emojis",as_bottomemojipicker._m_emojis);
 //BA.debugLineNum = 35;BA.debugLine="Private xpnl_CategoriesBackground As B4XView";
as_bottomemojipicker._xpnl_categoriesbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_categoriesbackground",as_bottomemojipicker._xpnl_categoriesbackground);
 //BA.debugLineNum = 36;BA.debugLine="Private xpnl_CurrentCategoryIndicator As B4XView";
as_bottomemojipicker._xpnl_currentcategoryindicator = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_currentcategoryindicator",as_bottomemojipicker._xpnl_currentcategoryindicator);
 //BA.debugLineNum = 37;BA.debugLine="Private CurrentCategory As String";
as_bottomemojipicker._currentcategory = RemoteObject.createImmutable("");__ref.setField("_currentcategory",as_bottomemojipicker._currentcategory);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcategories(RemoteObject __ref,RemoteObject _categorynames,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("CreateCategories (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("createcategories")) { return __ref.runUserSub(false, "as_bottomemojipicker","createcategories", __ref, _categorynames, _icon);}
RemoteObject _width = RemoteObject.createImmutable(0f);
RemoteObject _category = RemoteObject.createImmutable("");
RemoteObject _counter = RemoteObject.createImmutable(0);
RemoteObject _xpnl_emojibackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _emojis = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colemojis = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _heightwidth = RemoteObject.createImmutable(0f);
RemoteObject _tmp_lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("CategoryNames", _categorynames);
Debug.locals.put("Icon", _icon);
 BA.debugLineNum = 172;BA.debugLine="Private Sub CreateCategories(CategoryNames() As St";
Debug.ShouldStop(2048);
 BA.debugLineNum = 174;BA.debugLine="Dim Width As Float = xParent.Width/8";
Debug.ShouldStop(8192);
_width = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(8)}, "/",0, 0));Debug.locals.put("Width", _width);Debug.locals.put("Width", _width);
 BA.debugLineNum = 176;BA.debugLine="xpnl_CategoriesBackground.AddView(CreateCategoryI";
Debug.ShouldStop(32768);
__ref.getField(false,"_xpnl_categoriesbackground" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createcategoryitem" /*RemoteObject*/ ,(Object)(_icon),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(BA.numberCast(float.class, 25)))),(Object)((_categorynames.getArrayElement(true,BA.numberCast(int.class, 0))))).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(false,"_xpnl_categoriesbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews")}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _width)));
 BA.debugLineNum = 178;BA.debugLine="For Each Category As String In CategoryNames";
Debug.ShouldStop(131072);
{
final RemoteObject group3 = _categorynames;
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_category = group3.getArrayElement(true,RemoteObject.createImmutable(index3));Debug.locals.put("Category", _category);
Debug.locals.put("Category", _category);
 BA.debugLineNum = 180;BA.debugLine="If m_Emojis.ContainsKey(Category) = False Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_m_emojis" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_category))),as_bottomemojipicker.__c.getField(true,"False"))) { 
 }else {
 BA.debugLineNum = 186;BA.debugLine="Dim Counter As Int = 0";
Debug.ShouldStop(33554432);
_counter = BA.numberCast(int.class, 0);Debug.locals.put("Counter", _counter);Debug.locals.put("Counter", _counter);
 BA.debugLineNum = 187;BA.debugLine="Dim xpnl_EmojiBackground As B4XView";
Debug.ShouldStop(67108864);
_xpnl_emojibackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("xpnl_EmojiBackground", _xpnl_emojibackground);
 BA.debugLineNum = 188;BA.debugLine="Dim emojis As List = m_Emojis.Get(Category).As(";
Debug.ShouldStop(134217728);
_emojis = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_emojis = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_m_emojis" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_category))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("emojis")))));Debug.locals.put("emojis", _emojis);Debug.locals.put("emojis", _emojis);
 BA.debugLineNum = 189;BA.debugLine="For Each colemojis As Map In emojis";
Debug.ShouldStop(268435456);
_colemojis = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group9 = _emojis;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_colemojis = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group9.runMethod(false,"Get",index9));Debug.locals.put("colemojis", _colemojis);
Debug.locals.put("colemojis", _colemojis);
 BA.debugLineNum = 191;BA.debugLine="Dim HeightWidth As Float = xpnl_ListviewBackgr";
Debug.ShouldStop(1073741824);
_heightwidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_m_rows" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("HeightWidth", _heightwidth);Debug.locals.put("HeightWidth", _heightwidth);
 BA.debugLineNum = 192;BA.debugLine="If Counter Mod m_Rows = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_counter,__ref.getField(true,"_m_rows" /*RemoteObject*/ )}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 193;BA.debugLine="xpnl_EmojiBackground = xui.CreatePanel(\"\")";
Debug.ShouldStop(1);
_xpnl_emojibackground = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_EmojiBackground", _xpnl_emojibackground);
 BA.debugLineNum = 194;BA.debugLine="xpnl_EmojiBackground.SetLayoutAnimated(0,0,0,";
Debug.ShouldStop(2);
_xpnl_emojibackground.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _heightwidth)),(Object)(BA.numberCast(int.class, _heightwidth)));
 BA.debugLineNum = 195;BA.debugLine="Dim tmp_lst As List";
Debug.ShouldStop(4);
_tmp_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("tmp_lst", _tmp_lst);
 BA.debugLineNum = 196;BA.debugLine="tmp_lst.Initialize";
Debug.ShouldStop(8);
_tmp_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 197;BA.debugLine="xpnl_EmojiBackground.Tag = tmp_lst";
Debug.ShouldStop(16);
_xpnl_emojibackground.runMethod(false,"setTag",(_tmp_lst.getObject()));
 BA.debugLineNum = 198;BA.debugLine="xclv_Main.Add(xpnl_EmojiBackground,m_Emojis.G";
Debug.ShouldStop(32);
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_xpnl_emojibackground),(Object)((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_m_emojis" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_category))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("slug"))))));
 };
 BA.debugLineNum = 201;BA.debugLine="xpnl_EmojiBackground.Tag.As(List).Add(colemoji";
Debug.ShouldStop(256);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _xpnl_emojibackground.runMethod(false,"getTag"))).runVoidMethod ("Add",(Object)(_colemojis.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("emoji"))))));
 BA.debugLineNum = 204;BA.debugLine="Counter = Counter +1";
Debug.ShouldStop(2048);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Counter", _counter);
 }
}Debug.locals.put("colemojis", _colemojis);
;
 };
 }
}Debug.locals.put("Category", _category);
;
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcategoryitem(RemoteObject __ref,RemoteObject _text,RemoteObject _xfont,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CreateCategoryItem (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("createcategoryitem")) { return __ref.runUserSub(false, "as_bottomemojipicker","createcategoryitem", __ref, _text, _xfont, _value);}
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("xFont", _xfont);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 259;BA.debugLine="Private Sub CreateCategoryItem(Text As String,xFon";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="Dim xlbl As B4XView = CreateLabel(\"xlbl_Category\"";
Debug.ShouldStop(8);
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = __ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("xlbl_Category")));Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 261;BA.debugLine="xlbl.Font = xFont";
Debug.ShouldStop(16);
_xlbl.runMethod(false,"setFont",_xfont);
 BA.debugLineNum = 262;BA.debugLine="xlbl.Text = Text";
Debug.ShouldStop(32);
_xlbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 263;BA.debugLine="xlbl.TextColor = m_CategoryTextColor";
Debug.ShouldStop(64);
_xlbl.runMethod(true,"setTextColor",__ref.getField(true,"_m_categorytextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 264;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.ShouldStop(128);
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 265;BA.debugLine="xlbl.Tag = Value";
Debug.ShouldStop(256);
_xlbl.runMethod(false,"setTag",_value);
 BA.debugLineNum = 266;BA.debugLine="Return xlbl";
Debug.ShouldStop(512);
if (true) return _xlbl;
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,368);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "as_bottomemojipicker","createlabel", __ref, _eventname);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 368;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
Debug.ShouldStop(32768);
 BA.debugLineNum = 369;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(65536);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 370;BA.debugLine="lbl.Initialize(EventName)";
Debug.ShouldStop(131072);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 371;BA.debugLine="Return lbl";
Debug.ShouldStop(262144);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _emojiselected(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("EmojiSelected (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("emojiselected")) { return __ref.runUserSub(false, "as_bottomemojipicker","emojiselected", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 358;BA.debugLine="Private Sub EmojiSelected(Text As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 359;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EmojiS";
Debug.ShouldStop(64);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EmojiSelected"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 360;BA.debugLine="CallSub2(mCallBack, mEventName & \"_EmojiSelected";
Debug.ShouldStop(128);
as_bottomemojipicker.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EmojiSelected"))),(Object)((_text)));
 };
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getargb(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("GetARGB (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,391);
if (RapidSub.canDelegate("getargb")) { return __ref.runUserSub(false, "as_bottomemojipicker","getargb", __ref, _color);}
RemoteObject _res = null;
Debug.locals.put("Color", _color);
 BA.debugLineNum = 391;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()'ignore";
Debug.ShouldStop(64);
 BA.debugLineNum = 392;BA.debugLine="Dim res(4) As Int";
Debug.ShouldStop(128);
_res = RemoteObject.createNewArray ("int", new int[] {4}, new Object[]{});Debug.locals.put("res", _res);
 BA.debugLineNum = 393;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.ShouldStop(256);
_res.setArrayElement (as_bottomemojipicker.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(as_bottomemojipicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff000000))))),(Object)(BA.numberCast(int.class, 24))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 394;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.ShouldStop(512);
_res.setArrayElement (as_bottomemojipicker.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(as_bottomemojipicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff0000))))),(Object)(BA.numberCast(int.class, 16))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 395;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.ShouldStop(1024);
_res.setArrayElement (as_bottomemojipicker.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(as_bottomemojipicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff00))))),(Object)(BA.numberCast(int.class, 8))),BA.numberCast(int.class, 2));
 BA.debugLineNum = 396;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
Debug.ShouldStop(2048);
_res.setArrayElement (as_bottomemojipicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff)))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 397;BA.debugLine="Return res";
Debug.ShouldStop(4096);
if (true) return _res;
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbackgroundcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBackgroundColor (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("getbackgroundcolor")) { return __ref.runUserSub(false, "as_bottomemojipicker","getbackgroundcolor", __ref);}
 BA.debugLineNum = 350;BA.debugLine="Public Sub getBackgroundColor As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 351;BA.debugLine="Return m_BodyColor";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(true,"_m_bodycolor" /*RemoteObject*/ );
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodyheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBodyHeight (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("getbodyheight")) { return __ref.runUserSub(false, "as_bottomemojipicker","getbodyheight", __ref);}
 BA.debugLineNum = 307;BA.debugLine="Public Sub getBodyHeight As Float";
Debug.ShouldStop(262144);
 BA.debugLineNum = 308;BA.debugLine="Return m_BodyHeight";
Debug.ShouldStop(524288);
if (true) return __ref.getField(true,"_m_bodyheight" /*RemoteObject*/ );
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcategoryindicatorcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCategoryIndicatorColor (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("getcategoryindicatorcolor")) { return __ref.runUserSub(false, "as_bottomemojipicker","getcategoryindicatorcolor", __ref);}
 BA.debugLineNum = 328;BA.debugLine="Public Sub getCategoryIndicatorColor As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 329;BA.debugLine="Return m_CategoryIndicatorColor";
Debug.ShouldStop(256);
if (true) return __ref.getField(true,"_m_categoryindicatorcolor" /*RemoteObject*/ );
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcategorytextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCategoryTextColor (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,338);
if (RapidSub.canDelegate("getcategorytextcolor")) { return __ref.runUserSub(false, "as_bottomemojipicker","getcategorytextcolor", __ref);}
 BA.debugLineNum = 338;BA.debugLine="Public Sub getCategoryTextColor As Int";
Debug.ShouldStop(131072);
 BA.debugLineNum = 339;BA.debugLine="Return m_CategoryTextColor";
Debug.ShouldStop(262144);
if (true) return __ref.getField(true,"_m_categorytextcolor" /*RemoteObject*/ );
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getemojisize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEmojiSize (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("getemojisize")) { return __ref.runUserSub(false, "as_bottomemojipicker","getemojisize", __ref);}
 BA.debugLineNum = 320;BA.debugLine="Public Sub getEmojiSize As Int";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="Return m_EmojiSize";
Debug.ShouldStop(1);
if (true) return __ref.getField(true,"_m_emojisize" /*RemoteObject*/ );
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrows(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRows (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,297);
if (RapidSub.canDelegate("getrows")) { return __ref.runUserSub(false, "as_bottomemojipicker","getrows", __ref);}
 BA.debugLineNum = 297;BA.debugLine="Public Sub getRows As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="Return m_Rows";
Debug.ShouldStop(512);
if (true) return __ref.getField(true,"_m_rows" /*RemoteObject*/ );
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidepicker(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HidePicker (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("hidepicker")) { return __ref.runUserSub(false, "as_bottomemojipicker","hidepicker", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Public Sub HidePicker";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="BottomCard.Hide(False)";
Debug.ShouldStop(128);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_hide" /*void*/ ,(Object)(as_bottomemojipicker.__c.getField(true,"False")));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ini_xclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ini_xclv (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("ini_xclv")) { return __ref.runUserSub(false, "as_bottomemojipicker","ini_xclv", __ref);}
RemoteObject _tmplbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _tmpmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 76;BA.debugLine="Private Sub ini_xclv";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Dim tmplbl As Label";
Debug.ShouldStop(4096);
_tmplbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("tmplbl", _tmplbl);
 BA.debugLineNum = 78;BA.debugLine="tmplbl.Initialize(\"\")";
Debug.ShouldStop(8192);
_tmplbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 80;BA.debugLine="Dim tmpmap As Map";
Debug.ShouldStop(32768);
_tmpmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("tmpmap", _tmpmap);
 BA.debugLineNum = 81;BA.debugLine="tmpmap.Initialize";
Debug.ShouldStop(65536);
_tmpmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="tmpmap.Put(\"DividerColor\",0x00FFFFFF)";
Debug.ShouldStop(131072);
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DividerColor"))),(Object)(RemoteObject.createImmutable((((int)0x00ffffff)))));
 BA.debugLineNum = 83;BA.debugLine="tmpmap.Put(\"DividerHeight\",0)";
Debug.ShouldStop(262144);
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DividerHeight"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 84;BA.debugLine="tmpmap.Put(\"PressedColor\",0x00FFFFFF)";
Debug.ShouldStop(524288);
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("PressedColor"))),(Object)(RemoteObject.createImmutable((((int)0x00ffffff)))));
 BA.debugLineNum = 85;BA.debugLine="tmpmap.Put(\"InsertAnimationDuration\",0)";
Debug.ShouldStop(1048576);
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("InsertAnimationDuration"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 86;BA.debugLine="tmpmap.Put(\"ListOrientation\",\"Horizontal\")";
Debug.ShouldStop(2097152);
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ListOrientation"))),(Object)((RemoteObject.createImmutable("Horizontal"))));
 BA.debugLineNum = 87;BA.debugLine="tmpmap.Put(\"ShowScrollBar\",False)";
Debug.ShouldStop(4194304);
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ShowScrollBar"))),(Object)((as_bottomemojipicker.__c.getField(true,"False"))));
 BA.debugLineNum = 88;BA.debugLine="xclv_Main.Initialize(Me,\"xclv_main\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("xclv_main")));
 BA.debugLineNum = 89;BA.debugLine="xclv_Main.DesignerCreateView(xpnl_ListviewBackgro";
Debug.ShouldStop(16777216);
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_designercreateview",(Object)((__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).getObject())),(Object)(_tmplbl),(Object)(_tmpmap));
 BA.debugLineNum = 92;BA.debugLine="xclv_Main.AsView.SetLayoutAnimated(0,xclv_Main.As";
Debug.ShouldStop(134217728);
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 93;BA.debugLine="xclv_Main.Base_Resize(xpnl_ListviewBackground.Wid";
Debug.ShouldStop(268435456);
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(BA.numberCast(double.class, __ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Initialize (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "as_bottomemojipicker","initialize", __ref, _ba, _callback, _eventname, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _jroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coljroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 41;BA.debugLine="Public Sub Initialize(Callback As Object,EventName";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1024);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 44;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(2048);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 45;BA.debugLine="xParent = Parent";
Debug.ShouldStop(4096);
__ref.setField ("_xparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 47;BA.debugLine="m_HeaderHeight = 40dip";
Debug.ShouldStop(16384);
__ref.setField ("_m_headerheight" /*RemoteObject*/ ,BA.numberCast(float.class, as_bottomemojipicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 48;BA.debugLine="m_BodyHeight = 300dip";
Debug.ShouldStop(32768);
__ref.setField ("_m_bodyheight" /*RemoteObject*/ ,BA.numberCast(float.class, as_bottomemojipicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 50;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
Debug.ShouldStop(131072);
__ref.setField ("_xpnl_header" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 51;BA.debugLine="xpnl_Body = xui.CreatePanel(\"\")";
Debug.ShouldStop(262144);
__ref.setField ("_xpnl_body" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 52;BA.debugLine="xpnl_DragIndicator = xui.CreatePanel(\"\")";
Debug.ShouldStop(524288);
__ref.setField ("_xpnl_dragindicator" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 53;BA.debugLine="xpnl_ListviewBackground = xui.CreatePanel(\"\")";
Debug.ShouldStop(1048576);
__ref.setField ("_xpnl_listviewbackground" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 54;BA.debugLine="xpnl_ListviewBackground.SetLayoutAnimated(0,0,0,P";
Debug.ShouldStop(2097152);
__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_m_bodyheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 56;BA.debugLine="m_HeaderColor = xui.Color_ARGB(255,32, 33, 37)";
Debug.ShouldStop(8388608);
__ref.setField ("_m_headercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 37))));
 BA.debugLineNum = 57;BA.debugLine="m_BodyColor = xui.Color_ARGB(255,32, 33, 37)";
Debug.ShouldStop(16777216);
__ref.setField ("_m_bodycolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 37))));
 BA.debugLineNum = 58;BA.debugLine="m_CategoryTextColor = xui.Color_White";
Debug.ShouldStop(33554432);
__ref.setField ("_m_categorytextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 59;BA.debugLine="m_CategoryIndicatorColor = xui.Color_White";
Debug.ShouldStop(67108864);
__ref.setField ("_m_categoryindicatorcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 60;BA.debugLine="m_EmojiSize = 30";
Debug.ShouldStop(134217728);
__ref.setField ("_m_emojisize" /*RemoteObject*/ ,BA.numberCast(int.class, 30));
 BA.debugLineNum = 61;BA.debugLine="m_Rows = 5";
Debug.ShouldStop(268435456);
__ref.setField ("_m_rows" /*RemoteObject*/ ,BA.numberCast(int.class, 5));
 BA.debugLineNum = 63;BA.debugLine="ini_xclv";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_ini_xclv" /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="m_Emojis.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_m_emojis" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 66;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 67;BA.debugLine="parser.Initialize(File.ReadString(File.DirAssets,";
Debug.ShouldStop(4);
_parser.runVoidMethod ("Initialize",(Object)(as_bottomemojipicker.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(as_bottomemojipicker.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("data-by-group.json")))));
 BA.debugLineNum = 68;BA.debugLine="Dim jRoot As List = parser.NextArray";
Debug.ShouldStop(8);
_jroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_jroot = _parser.runMethod(false,"NextArray");Debug.locals.put("jRoot", _jroot);Debug.locals.put("jRoot", _jroot);
 BA.debugLineNum = 70;BA.debugLine="For Each coljRoot As Map In jRoot";
Debug.ShouldStop(32);
_coljroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group22 = _jroot;
final int groupLen22 = group22.runMethod(true,"getSize").<Integer>get()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_coljroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group22.runMethod(false,"Get",index22));Debug.locals.put("coljRoot", _coljroot);
Debug.locals.put("coljRoot", _coljroot);
 BA.debugLineNum = 71;BA.debugLine="m_Emojis.Put(coljRoot.Get(\"slug\"),coljRoot)";
Debug.ShouldStop(64);
__ref.getField(false,"_m_emojis" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("slug"))))),(Object)((_coljroot.getObject())));
 }
}Debug.locals.put("coljRoot", _coljroot);
;
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBackgroundColor (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("setbackgroundcolor")) { return __ref.runUserSub(false, "as_bottomemojipicker","setbackgroundcolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 342;BA.debugLine="Public Sub setBackgroundColor(Color As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="m_BodyColor = Color";
Debug.ShouldStop(4194304);
__ref.setField ("_m_bodycolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 344;BA.debugLine="If BottomCard.IsInitialized Then BottomCard.BodyP";
Debug.ShouldStop(8388608);
if (__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_getbodypanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));};
 BA.debugLineNum = 345;BA.debugLine="m_HeaderColor = Color";
Debug.ShouldStop(16777216);
__ref.setField ("_m_headercolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 346;BA.debugLine="xpnl_Body.Color = Color";
Debug.ShouldStop(33554432);
__ref.getField(false,"_xpnl_body" /*RemoteObject*/ ).runMethod(true,"setColor",_color);
 BA.debugLineNum = 347;BA.debugLine="xpnl_Header.Color = Color";
Debug.ShouldStop(67108864);
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"setColor",_color);
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbodyheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("setBodyHeight (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,311);
if (RapidSub.canDelegate("setbodyheight")) { return __ref.runUserSub(false, "as_bottomemojipicker","setbodyheight", __ref, _height);}
Debug.locals.put("Height", _height);
 BA.debugLineNum = 311;BA.debugLine="Public Sub setBodyHeight(Height As Float)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 312;BA.debugLine="m_BodyHeight = Height";
Debug.ShouldStop(8388608);
__ref.setField ("_m_bodyheight" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcategoryindicatorcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setCategoryIndicatorColor (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("setcategoryindicatorcolor")) { return __ref.runUserSub(false, "as_bottomemojipicker","setcategoryindicatorcolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 324;BA.debugLine="Public Sub setCategoryIndicatorColor(Color As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="m_CategoryIndicatorColor = Color";
Debug.ShouldStop(16);
__ref.setField ("_m_categoryindicatorcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcategorytextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setCategoryTextColor (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,332);
if (RapidSub.canDelegate("setcategorytextcolor")) { return __ref.runUserSub(false, "as_bottomemojipicker","setcategorytextcolor", __ref, _color);}
RemoteObject _argb = null;
Debug.locals.put("Color", _color);
 BA.debugLineNum = 332;BA.debugLine="Public Sub setCategoryTextColor(Color As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 333;BA.debugLine="m_CategoryTextColor = Color";
Debug.ShouldStop(4096);
__ref.setField ("_m_categorytextcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 334;BA.debugLine="Dim ARGB() As Int = GetARGB(m_CategoryTextColor)";
Debug.ShouldStop(8192);
_argb = __ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_getargb" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_m_categorytextcolor" /*RemoteObject*/ )));Debug.locals.put("ARGB", _argb);Debug.locals.put("ARGB", _argb);
 BA.debugLineNum = 335;BA.debugLine="xpnl_DragIndicator.SetColorAndBorder(xui.Color_AR";
Debug.ShouldStop(16384);
__ref.getField(false,"_xpnl_dragindicator" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 80)),(Object)(_argb.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(_argb.getArrayElement(true,BA.numberCast(int.class, 2))),(Object)(_argb.getArrayElement(true,BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(as_bottomemojipicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 336;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setemojisize(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("setEmojiSize (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("setemojisize")) { return __ref.runUserSub(false, "as_bottomemojipicker","setemojisize", __ref, _size);}
Debug.locals.put("Size", _size);
 BA.debugLineNum = 316;BA.debugLine="Public Sub setEmojiSize(Size As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 317;BA.debugLine="m_EmojiSize= Size";
Debug.ShouldStop(268435456);
__ref.setField ("_m_emojisize" /*RemoteObject*/ ,_size);
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrows(RemoteObject __ref,RemoteObject _rows) throws Exception{
try {
		Debug.PushSubsStack("setRows (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("setrows")) { return __ref.runUserSub(false, "as_bottomemojipicker","setrows", __ref, _rows);}
Debug.locals.put("Rows", _rows);
 BA.debugLineNum = 301;BA.debugLine="Public Sub setRows(Rows As Int)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="m_Rows = Rows";
Debug.ShouldStop(8192);
__ref.setField ("_m_rows" /*RemoteObject*/ ,_rows);
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("ShowPicker (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,107);
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
public ResumableSub_ShowPicker(com.stolte.bottomactionmenu.as_bottomemojipicker parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.stolte.bottomactionmenu.as_bottomemojipicker parent;
RemoteObject _datepickerheight = RemoteObject.createImmutable(0f);
RemoteObject _safeareaheight = RemoteObject.createImmutable(0f);
RemoteObject _argb = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowPicker (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,107);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 109;BA.debugLine="Dim DatePickerHeight As Float = m_BodyHeight";
Debug.ShouldStop(4096);
_datepickerheight = __ref.getField(true,"_m_bodyheight" /*RemoteObject*/ );Debug.locals.put("DatePickerHeight", _datepickerheight);Debug.locals.put("DatePickerHeight", _datepickerheight);
 BA.debugLineNum = 110;BA.debugLine="Dim SafeAreaHeight As Float = 0";
Debug.ShouldStop(8192);
_safeareaheight = BA.numberCast(float.class, 0);Debug.locals.put("SafeAreaHeight", _safeareaheight);Debug.locals.put("SafeAreaHeight", _safeareaheight);
 BA.debugLineNum = 116;BA.debugLine="SafeAreaHeight = 20dip";
Debug.ShouldStop(524288);
_safeareaheight = BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))));Debug.locals.put("SafeAreaHeight", _safeareaheight);
 BA.debugLineNum = 117;BA.debugLine="m_BodyHeight = m_BodyHeight + SafeAreaHeight";
Debug.ShouldStop(1048576);
__ref.setField ("_m_bodyheight" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_bodyheight" /*RemoteObject*/ ),_safeareaheight}, "+",1, 0)));
 BA.debugLineNum = 120;BA.debugLine="BottomCard.Initialize(Me,\"BottomCard\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("BottomCard")));
 BA.debugLineNum = 121;BA.debugLine="BottomCard.BodyDrag = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_setbodydrag" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 122;BA.debugLine="BottomCard.Create(xParent,m_BodyHeight,m_BodyHeig";
Debug.ShouldStop(33554432);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_create" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xparent" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_m_bodyheight" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_m_bodyheight" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_m_headerheight" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_orientation_middle" /*RemoteObject*/ )));
 BA.debugLineNum = 124;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
Debug.ShouldStop(134217728);
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_headercolor" /*RemoteObject*/ ));
 BA.debugLineNum = 126;BA.debugLine="xpnl_Header.AddView(xpnl_DragIndicator,xParent.Wi";
Debug.ShouldStop(536870912);
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_dragindicator" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_headerheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6))),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6)))));
 BA.debugLineNum = 127;BA.debugLine="Dim ARGB() As Int = GetARGB(m_CategoryTextColor)";
Debug.ShouldStop(1073741824);
_argb = __ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_getargb" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_m_categorytextcolor" /*RemoteObject*/ )));Debug.locals.put("ARGB", _argb);Debug.locals.put("ARGB", _argb);
 BA.debugLineNum = 128;BA.debugLine="xpnl_DragIndicator.SetColorAndBorder(xui.Color_AR";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_xpnl_dragindicator" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 80)),(Object)(_argb.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(_argb.getArrayElement(true,BA.numberCast(int.class, 2))),(Object)(_argb.getArrayElement(true,BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 130;BA.debugLine="BottomCard.BodyPanel.Color = m_BodyColor";
Debug.ShouldStop(2);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_getbodypanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 131;BA.debugLine="BottomCard.HeaderPanel.AddView(xpnl_Header,0,0,xP";
Debug.ShouldStop(4);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_getheaderpanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_m_headerheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 132;BA.debugLine="BottomCard.BodyPanel.AddView(xpnl_Body,0,0,xParen";
Debug.ShouldStop(8);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_getbodypanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_body" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, _datepickerheight)));
 BA.debugLineNum = 133;BA.debugLine="BottomCard.CornerRadius_Header = 30dip/2";
Debug.ShouldStop(16);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_setcornerradius_header",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 135;BA.debugLine="xpnl_CategoriesBackground = xui.CreatePanel(\"\")";
Debug.ShouldStop(64);
__ref.setField ("_xpnl_categoriesbackground" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 136;BA.debugLine="xpnl_Body.AddView(xpnl_CategoriesBackground,0,0,x";
Debug.ShouldStop(128);
__ref.getField(false,"_xpnl_body" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_categoriesbackground" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_body" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(9)}, "/",0, 0))));
 BA.debugLineNum = 138;BA.debugLine="xpnl_ListviewBackground.RemoveViewFromParent";
Debug.ShouldStop(512);
__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 139;BA.debugLine="xpnl_Body.AddView(xpnl_ListviewBackground,0,xPare";
Debug.ShouldStop(1024);
__ref.getField(false,"_xpnl_body" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_listviewbackground" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(9)}, "/",0, 0))),(Object)(__ref.getField(false,"_xpnl_body" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_bodyheight" /*RemoteObject*/ ),__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(9),_safeareaheight}, "-/-",2, 0))));
 BA.debugLineNum = 144;BA.debugLine="CreateCategories(Array As String(\"smileys_emotion";
Debug.ShouldStop(32768);
__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createcategories" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("smileys_emotion"),RemoteObject.createImmutable("people_body")})),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe24e)))))));
 BA.debugLineNum = 145;BA.debugLine="CreateCategories(Array As String(\"animals_nature\"";
Debug.ShouldStop(65536);
__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createcategories" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("animals_nature")})),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe91d)))))));
 BA.debugLineNum = 146;BA.debugLine="CreateCategories(Array As String(\"food_drink\"),Ch";
Debug.ShouldStop(131072);
__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createcategories" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("food_drink")})),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe556)))))));
 BA.debugLineNum = 147;BA.debugLine="CreateCategories(Array As String(\"travel_places\")";
Debug.ShouldStop(262144);
__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createcategories" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("travel_places")})),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe0af)))))));
 BA.debugLineNum = 148;BA.debugLine="CreateCategories(Array As String(\"activities\"),Ch";
Debug.ShouldStop(524288);
__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createcategories" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("activities")})),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe566)))))));
 BA.debugLineNum = 149;BA.debugLine="CreateCategories(Array As String(\"objects\"),Chr(0";
Debug.ShouldStop(1048576);
__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createcategories" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("objects")})),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe90f)))))));
 BA.debugLineNum = 150;BA.debugLine="CreateCategories(Array As String(\"symbols\"),Chr(0";
Debug.ShouldStop(2097152);
__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createcategories" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("symbols")})),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe52e)))))));
 BA.debugLineNum = 151;BA.debugLine="CreateCategories(Array As String(\"flags\"),Chr(0xE";
Debug.ShouldStop(4194304);
__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createcategories" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("flags")})),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe153)))))));
 BA.debugLineNum = 153;BA.debugLine="CurrentCategory = \"smileys_emotion\"";
Debug.ShouldStop(16777216);
__ref.setField ("_currentcategory" /*RemoteObject*/ ,BA.ObjectToString("smileys_emotion"));
 BA.debugLineNum = 161;BA.debugLine="xpnl_CurrentCategoryIndicator = xui.CreatePanel(\"";
Debug.ShouldStop(1);
__ref.setField ("_xpnl_currentcategoryindicator" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 162;BA.debugLine="xpnl_CategoriesBackground.AddView(xpnl_CurrentCat";
Debug.ShouldStop(2);
__ref.getField(false,"_xpnl_categoriesbackground" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_currentcategoryindicator" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(9),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "/-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(9)}, "/",0, 0))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 163;BA.debugLine="xpnl_CurrentCategoryIndicator.Color = m_CategoryI";
Debug.ShouldStop(4);
__ref.getField(false,"_xpnl_currentcategoryindicator" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_categoryindicatorcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 166;BA.debugLine="Sleep(0)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_bottomemojipicker", "showpicker"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 168;BA.debugLine="BottomCard.Show(False)";
Debug.ShouldStop(128);
__ref.getField(false,"_bottomcard" /*RemoteObject*/ ).runClassMethod (com.stolte.bottomactionmenu.asdraggablebottomcard.class, "_show" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static RemoteObject  _xclv_main_visiblerangechanged(RemoteObject __ref,RemoteObject _firstindex,RemoteObject _lastindex) throws Exception{
try {
		Debug.PushSubsStack("xclv_main_VisibleRangeChanged (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("xclv_main_visiblerangechanged")) { return __ref.runUserSub(false, "as_bottomemojipicker","xclv_main_visiblerangechanged", __ref, _firstindex, _lastindex);}
int _i = 0;
RemoteObject _xlbl_category = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _extrasize = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tmp_list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _z = 0;
RemoteObject _xlbl_emoji = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("FirstIndex", _firstindex);
Debug.locals.put("LastIndex", _lastindex);
 BA.debugLineNum = 213;BA.debugLine="Private Sub xclv_main_VisibleRangeChanged (FirstIn";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 215;BA.debugLine="If xclv_Main.GetValue(FirstIndex) <> CurrentCateg";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_firstindex)),(__ref.getField(true,"_currentcategory" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 217;BA.debugLine="For i = 0 To xpnl_CategoriesBackground.NumberOfV";
Debug.ShouldStop(16777216);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_categoriesbackground" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 219;BA.debugLine="If xclv_Main.GetValue(FirstIndex) = xpnl_Catego";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_firstindex)),__ref.getField(false,"_xpnl_categoriesbackground" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runMethod(false,"getTag"))) { 
 BA.debugLineNum = 222;BA.debugLine="Dim xlbl_Category As B4XView = xpnl_Categories";
Debug.ShouldStop(536870912);
_xlbl_category = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_category = __ref.getField(false,"_xpnl_categoriesbackground" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("xlbl_Category", _xlbl_category);Debug.locals.put("xlbl_Category", _xlbl_category);
 BA.debugLineNum = 223;BA.debugLine="xpnl_CurrentCategoryIndicator.SetLayoutAnimate";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_xpnl_currentcategoryindicator" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(_xlbl_category.runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_xpnl_currentcategoryindicator" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_xpnl_currentcategoryindicator" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_currentcategoryindicator" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 224;BA.debugLine="CurrentCategory = xclv_Main.GetValue(FirstInde";
Debug.ShouldStop(-2147483648);
__ref.setField ("_currentcategory" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_firstindex))));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 229;BA.debugLine="Dim ExtraSize As Int = 10";
Debug.ShouldStop(16);
_extrasize = BA.numberCast(int.class, 10);Debug.locals.put("ExtraSize", _extrasize);Debug.locals.put("ExtraSize", _extrasize);
 BA.debugLineNum = 230;BA.debugLine="For i = 0 To xclv_Main.Size - 1";
Debug.ShouldStop(32);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 231;BA.debugLine="Dim p As B4XView = xclv_Main.GetPanel(i)";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 232;BA.debugLine="If i > FirstIndex - ExtraSize And i < LastIndex";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,_extrasize}, "-",1, 1))) && RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,_extrasize}, "+",1, 1)))) { 
 BA.debugLineNum = 234;BA.debugLine="If p.NumberOfViews = 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 236;BA.debugLine="Dim tmp_List As List =  p.Tag";
Debug.ShouldStop(2048);
_tmp_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tmp_list = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _p.runMethod(false,"getTag"));Debug.locals.put("tmp_List", _tmp_list);Debug.locals.put("tmp_List", _tmp_list);
 BA.debugLineNum = 237;BA.debugLine="For z = 0 To tmp_List.Size -1";
Debug.ShouldStop(4096);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_tmp_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_z = 0 ;
for (;(step16 > 0 && _z <= limit16) || (step16 < 0 && _z >= limit16) ;_z = ((int)(0 + _z + step16))  ) {
Debug.locals.put("z", _z);
 BA.debugLineNum = 239;BA.debugLine="Dim xlbl_Emoji As B4XView = CreateLabel(\"xlbl";
Debug.ShouldStop(16384);
_xlbl_emoji = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_emoji = __ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("xlbl_Emoji")));Debug.locals.put("xlbl_Emoji", _xlbl_emoji);Debug.locals.put("xlbl_Emoji", _xlbl_emoji);
 BA.debugLineNum = 240;BA.debugLine="xlbl_Emoji.Font = xui.CreateDefaultFont(m_Emo";
Debug.ShouldStop(32768);
_xlbl_emoji.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, __ref.getField(true,"_m_emojisize" /*RemoteObject*/ )))));
 BA.debugLineNum = 241;BA.debugLine="xlbl_Emoji.Text = tmp_List.Get(z)";
Debug.ShouldStop(65536);
_xlbl_emoji.runMethod(true,"setText",BA.ObjectToCharSequence(_tmp_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _z)))));
 BA.debugLineNum = 242;BA.debugLine="xlbl_Emoji.TextColor = xui.Color_White";
Debug.ShouldStop(131072);
_xlbl_emoji.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 243;BA.debugLine="xlbl_Emoji.SetTextAlignment(\"CENTER\",\"CENTER\"";
Debug.ShouldStop(262144);
_xlbl_emoji.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 245;BA.debugLine="p.AddView(xlbl_Emoji,0,p.Width*z,p.Width,p.Wi";
Debug.ShouldStop(1048576);
_p.runVoidMethod ("AddView",(Object)((_xlbl_emoji.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getWidth"),RemoteObject.createImmutable(_z)}, "*",0, 1)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getWidth")));
 }
}Debug.locals.put("z", _z);
;
 };
 }else {
 BA.debugLineNum = 252;BA.debugLine="If p.NumberOfViews > 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 253;BA.debugLine="p.RemoveAllViews";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("RemoveAllViews");
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xlbl_category_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xlbl_Category_Click (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("xlbl_category_click")) { return __ref.runUserSub(false, "as_bottomemojipicker","xlbl_category_click", __ref);}
RemoteObject _xlbl_category = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int _i = 0;
 BA.debugLineNum = 274;BA.debugLine="Private Sub xlbl_Category_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Dim xlbl_Category As B4XView = Sender";
Debug.ShouldStop(262144);
_xlbl_category = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_category = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), as_bottomemojipicker.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xlbl_Category", _xlbl_category);Debug.locals.put("xlbl_Category", _xlbl_category);
 BA.debugLineNum = 276;BA.debugLine="xpnl_CurrentCategoryIndicator.SetLayoutAnimated(2";
Debug.ShouldStop(524288);
__ref.getField(false,"_xpnl_currentcategoryindicator" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(_xlbl_category.runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_xpnl_currentcategoryindicator" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_xpnl_currentcategoryindicator" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_currentcategoryindicator" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 277;BA.debugLine="CurrentCategory = xlbl_Category.Tag";
Debug.ShouldStop(1048576);
__ref.setField ("_currentcategory" /*RemoteObject*/ ,BA.ObjectToString(_xlbl_category.runMethod(false,"getTag")));
 BA.debugLineNum = 278;BA.debugLine="If xlbl_Category.Tag = \"recent\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_xlbl_category.runMethod(false,"getTag"),RemoteObject.createImmutable(("recent")))) { 
 BA.debugLineNum = 279;BA.debugLine="xclv_Main.ScrollToItem(0)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 281;BA.debugLine="For i = 0 To xclv_Main.Size -1";
Debug.ShouldStop(16777216);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 283;BA.debugLine="If xlbl_Category.Tag = xclv_Main.GetValue(i) Th";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_xlbl_category.runMethod(false,"getTag"),__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))))) { 
 BA.debugLineNum = 284;BA.debugLine="xclv_Main.ScrollToItem(i)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_xclv_main" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 285;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xlbl_emoji_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xlbl_Emoji_Click (as_bottomemojipicker) ","as_bottomemojipicker",2,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("xlbl_emoji_click")) { return __ref.runUserSub(false, "as_bottomemojipicker","xlbl_emoji_click", __ref);}
RemoteObject _xlbl_emoji = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 269;BA.debugLine="Private Sub xlbl_Emoji_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Dim xlbl_Emoji As B4XView = Sender";
Debug.ShouldStop(8192);
_xlbl_emoji = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_emoji = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), as_bottomemojipicker.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xlbl_Emoji", _xlbl_emoji);Debug.locals.put("xlbl_Emoji", _xlbl_emoji);
 BA.debugLineNum = 271;BA.debugLine="EmojiSelected(xlbl_Emoji.Text)";
Debug.ShouldStop(16384);
__ref.runClassMethod (com.stolte.bottomactionmenu.as_bottomemojipicker.class, "_emojiselected" /*RemoteObject*/ ,(Object)(_xlbl_emoji.runMethod(true,"getText")));
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}