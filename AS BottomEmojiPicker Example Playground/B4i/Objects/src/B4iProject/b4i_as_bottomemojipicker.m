
#import "b4i_as_bottomemojipicker.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_asdraggablebottomcard.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcache.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xcomparatorsort.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"

@interface ResumableSub_as_bottomemojipicker_ShowPicker :B4IResumableSub 
- (instancetype) init: (b4i_as_bottomemojipicker*) parent1;
@end
@implementation ResumableSub_as_bottomemojipicker_ShowPicker {
b4i_as_bottomemojipicker* parent;
float _datepickerheight;
float _safeareaheight;
B4IArray* _argb;
}
- (instancetype) init: (b4i_as_bottomemojipicker*) parent1 {
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = -1;
 //BA.debugLineNum = 105;BA.debugLine="Dim DatePickerHeight As Float = m_BodyHeight";
self->_datepickerheight = parent->__m_bodyheight;
 //BA.debugLineNum = 106;BA.debugLine="Dim SafeAreaHeight As Float = 0";
self->_safeareaheight = (float) (0);
 //BA.debugLineNum = 109;BA.debugLine="SafeAreaHeight = B4XPages.GetNativeParent(B4XPage";
self->_safeareaheight = [[[parent->__b4xpages _getnativeparent /*B4IPage**/ :(NSObject*)([parent->__b4xpages _mainpage /*b4i_b4xmainpage**/ ])] SafeAreaInsets] Bottom];
 //BA.debugLineNum = 110;BA.debugLine="m_BodyHeight = m_BodyHeight + SafeAreaHeight";
parent->__m_bodyheight = (float) (parent->__m_bodyheight+self->_safeareaheight);
 //BA.debugLineNum = 116;BA.debugLine="BottomCard.Initialize(Me,\"BottomCard\")";
[parent->__bottomcard _initialize /*NSString**/ :self.bi :parent :@"BottomCard"];
 //BA.debugLineNum = 117;BA.debugLine="BottomCard.BodyDrag = True";
[parent->__bottomcard _setbodydrag: /*BOOL*/ true];
 //BA.debugLineNum = 118;BA.debugLine="BottomCard.Create(xParent,m_BodyHeight,m_BodyHeig";
[parent->__bottomcard _create /*NSString**/ :parent->__xparent :parent->__m_bodyheight :parent->__m_bodyheight :parent->__m_headerheight :[parent->__xparent Width] :[parent->__bottomcard _orientation_middle /*int*/ ]];
 //BA.debugLineNum = 120;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
[parent->__xpnl_header setColor:parent->__m_headercolor];
 //BA.debugLineNum = 122;BA.debugLine="xpnl_Header.AddView(xpnl_DragIndicator,xParent.Wi";
[parent->__xpnl_header AddView:(UIView*)((parent->__xpnl_dragindicator).object) :(float) ([parent->__xparent Width]/(double)2-((int) (70))/(double)2) :(float) (parent->__m_headerheight/(double)2-((int) (6))/(double)2) :(float) (((int) (70))) :(float) (((int) (6)))];
 //BA.debugLineNum = 123;BA.debugLine="Dim ARGB() As Int = GetARGB(m_CategoryTextColor)";
self->_argb = [parent _getargb:parent->__m_categorytextcolor];
 //BA.debugLineNum = 124;BA.debugLine="xpnl_DragIndicator.SetColorAndBorder(xui.Color_AR";
[parent->__xpnl_dragindicator SetColorAndBorder:[parent->__xui Color_ARGB:(int) (80) :((NSNumber*)[self->_argb getObjectFastN:(int) (1)]).intValue :((NSNumber*)[self->_argb getObjectFastN:(int) (2)]).intValue :((NSNumber*)[self->_argb getObjectFastN:(int) (3)]).intValue] :(float) (0) :(int) (0) :(float) (((int) (3)))];
 //BA.debugLineNum = 126;BA.debugLine="BottomCard.BodyPanel.Color = m_BodyColor";
[[parent->__bottomcard _getbodypanel /*B4XViewWrapper**/ ] setColor:parent->__m_bodycolor];
 //BA.debugLineNum = 127;BA.debugLine="BottomCard.HeaderPanel.AddView(xpnl_Header,0,0,xP";
[[parent->__bottomcard _getheaderpanel /*B4XViewWrapper**/ ] AddView:(UIView*)((parent->__xpnl_header).object) :(float) (0) :(float) (0) :[parent->__xparent Width] :parent->__m_headerheight];
 //BA.debugLineNum = 128;BA.debugLine="BottomCard.BodyPanel.AddView(xpnl_Body,0,0,xParen";
[[parent->__bottomcard _getbodypanel /*B4XViewWrapper**/ ] AddView:(UIView*)((parent->__xpnl_body).object) :(float) (0) :(float) (0) :[parent->__xparent Width] :self->_datepickerheight];
 //BA.debugLineNum = 129;BA.debugLine="BottomCard.CornerRadius_Header = 30dip/2";
[parent->__bottomcard _setcornerradius_header:(float) (((int) (30))/(double)2)];
 //BA.debugLineNum = 131;BA.debugLine="xpnl_CategoriesBackground = xui.CreatePanel(\"\")";
parent->__xpnl_categoriesbackground = [parent->__xui CreatePanel:self.bi :@""];
 //BA.debugLineNum = 132;BA.debugLine="xpnl_Body.AddView(xpnl_CategoriesBackground,0,0,x";
[parent->__xpnl_body AddView:(UIView*)((parent->__xpnl_categoriesbackground).object) :(float) (0) :(float) (0) :[parent->__xpnl_body Width] :(float) ([parent->__xparent Width]/(double)9)];
 //BA.debugLineNum = 134;BA.debugLine="xpnl_ListviewBackground.RemoveViewFromParent";
[parent->__xpnl_listviewbackground RemoveViewFromParent];
 //BA.debugLineNum = 135;BA.debugLine="xpnl_Body.AddView(xpnl_ListviewBackground,0,xPare";
[parent->__xpnl_body AddView:(UIView*)((parent->__xpnl_listviewbackground).object) :(float) (0) :(float) ([parent->__xparent Width]/(double)9) :[parent->__xpnl_body Width] :(float) (parent->__m_bodyheight-[parent->__xparent Width]/(double)9-self->_safeareaheight)];
 //BA.debugLineNum = 140;BA.debugLine="CreateCategories(Array As String(\"smileys_emotion";
[parent _createcategories:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:@"smileys_emotion"],[B4I nilToNSNull:@"people_body"]]] :[self.bi CharToString:((unichar)(((int)0xe24e)))]];
 //BA.debugLineNum = 141;BA.debugLine="CreateCategories(Array As String(\"animals_nature\"";
[parent _createcategories:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:@"animals_nature"]]] :[self.bi CharToString:((unichar)(((int)0xe91d)))]];
 //BA.debugLineNum = 142;BA.debugLine="CreateCategories(Array As String(\"food_drink\"),Ch";
[parent _createcategories:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:@"food_drink"]]] :[self.bi CharToString:((unichar)(((int)0xe556)))]];
 //BA.debugLineNum = 143;BA.debugLine="CreateCategories(Array As String(\"travel_places\")";
[parent _createcategories:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:@"travel_places"]]] :[self.bi CharToString:((unichar)(((int)0xe0af)))]];
 //BA.debugLineNum = 144;BA.debugLine="CreateCategories(Array As String(\"activities\"),Ch";
[parent _createcategories:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:@"activities"]]] :[self.bi CharToString:((unichar)(((int)0xe566)))]];
 //BA.debugLineNum = 145;BA.debugLine="CreateCategories(Array As String(\"objects\"),Chr(0";
[parent _createcategories:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:@"objects"]]] :[self.bi CharToString:((unichar)(((int)0xe90f)))]];
 //BA.debugLineNum = 146;BA.debugLine="CreateCategories(Array As String(\"symbols\"),Chr(0";
[parent _createcategories:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:@"symbols"]]] :[self.bi CharToString:((unichar)(((int)0xe52e)))]];
 //BA.debugLineNum = 147;BA.debugLine="CreateCategories(Array As String(\"flags\"),Chr(0xE";
[parent _createcategories:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:@"flags"]]] :[self.bi CharToString:((unichar)(((int)0xe153)))]];
 //BA.debugLineNum = 149;BA.debugLine="CurrentCategory = \"smileys_emotion\"";
parent->__currentcategory = @"smileys_emotion";
 //BA.debugLineNum = 157;BA.debugLine="xpnl_CurrentCategoryIndicator = xui.CreatePanel(\"";
parent->__xpnl_currentcategoryindicator = [parent->__xui CreatePanel:self.bi :@""];
 //BA.debugLineNum = 158;BA.debugLine="xpnl_CategoriesBackground.AddView(xpnl_CurrentCat";
[parent->__xpnl_categoriesbackground AddView:(UIView*)((parent->__xpnl_currentcategoryindicator).object) :(float) (0) :(float) ([parent->__xparent Width]/(double)9-((int) (2))) :(float) ([parent->__xparent Width]/(double)9) :(float) (((int) (2)))];
 //BA.debugLineNum = 159;BA.debugLine="xpnl_CurrentCategoryIndicator.Color = m_CategoryI";
[parent->__xpnl_currentcategoryindicator setColor:parent->__m_categoryindicatorcolor];
 //BA.debugLineNum = 162;BA.debugLine="Sleep(0)";
[parent->___c Sleep:self.bi :self :(int) (0)];
self->_state = 1;
return;
case 1:
//C
self->_state = -1;
;
 //BA.debugLineNum = 164;BA.debugLine="BottomCard.Show(False)";
[parent->__bottomcard _show /*NSString**/ :false];
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_as_bottomemojipicker 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_as_bottomemojipicker) instance released.");
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
 //BA.debugLineNum = 12;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
 //BA.debugLineNum = 13;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
 //BA.debugLineNum = 14;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
 //BA.debugLineNum = 16;BA.debugLine="Private xParent As B4XView";
self->__xparent = [B4XViewWrapper new];
 //BA.debugLineNum = 17;BA.debugLine="Private BottomCard As ASDraggableBottomCard";
self->__bottomcard = [b4i_asdraggablebottomcard new];
 //BA.debugLineNum = 18;BA.debugLine="Private xpnl_ListviewBackground As B4XView";
self->__xpnl_listviewbackground = [B4XViewWrapper new];
 //BA.debugLineNum = 19;BA.debugLine="Private xclv_Main As CustomListView";
self->__xclv_main = [b4i_customlistview new];
 //BA.debugLineNum = 21;BA.debugLine="Private xpnl_Header As B4XView";
self->__xpnl_header = [B4XViewWrapper new];
 //BA.debugLineNum = 22;BA.debugLine="Private xpnl_Body As B4XView";
self->__xpnl_body = [B4XViewWrapper new];
 //BA.debugLineNum = 23;BA.debugLine="Private xpnl_DragIndicator As B4XView";
self->__xpnl_dragindicator = [B4XViewWrapper new];
 //BA.debugLineNum = 25;BA.debugLine="Private m_HeaderHeight As Float";
self->__m_headerheight = 0.0f;
 //BA.debugLineNum = 26;BA.debugLine="Private m_BodyHeight As Float";
self->__m_bodyheight = 0.0f;
 //BA.debugLineNum = 27;BA.debugLine="Private m_HeaderColor As Int";
self->__m_headercolor = 0;
 //BA.debugLineNum = 28;BA.debugLine="Private m_BodyColor As Int";
self->__m_bodycolor = 0;
 //BA.debugLineNum = 29;BA.debugLine="Private m_CategoryTextColor As Int";
self->__m_categorytextcolor = 0;
 //BA.debugLineNum = 30;BA.debugLine="Private m_CategoryIndicatorColor As Int";
self->__m_categoryindicatorcolor = 0;
 //BA.debugLineNum = 31;BA.debugLine="Private m_EmojiSize As Int";
self->__m_emojisize = 0;
 //BA.debugLineNum = 32;BA.debugLine="Private m_Rows As Int";
self->__m_rows = 0;
 //BA.debugLineNum = 34;BA.debugLine="Private m_Emojis As Map";
self->__m_emojis = [B4IMap new];
 //BA.debugLineNum = 35;BA.debugLine="Private xpnl_CategoriesBackground As B4XView";
self->__xpnl_categoriesbackground = [B4XViewWrapper new];
 //BA.debugLineNum = 36;BA.debugLine="Private xpnl_CurrentCategoryIndicator As B4XView";
self->__xpnl_currentcategoryindicator = [B4XViewWrapper new];
 //BA.debugLineNum = 37;BA.debugLine="Private CurrentCategory as String";
self->__currentcategory = @"";
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _createcategories:(B4IArray*) _categorynames :(NSString*) _icon{
float _width = 0.0f;
NSString* _category = @"";
int _counter = 0;
B4XViewWrapper* _xpnl_emojibackground = nil;
B4IList* _emojis = nil;
B4IMap* _colemojis = nil;
float _heightwidth = 0.0f;
B4IList* _tmp_lst = nil;
 //BA.debugLineNum = 168;BA.debugLine="Private Sub CreateCategories(CategoryNames() As St";
 //BA.debugLineNum = 170;BA.debugLine="Dim Width As Float = xParent.Width/8";
_width = (float) ([self->__xparent Width]/(double)8);
 //BA.debugLineNum = 172;BA.debugLine="xpnl_CategoriesBackground.AddView(CreateCategoryI";
[self->__xpnl_categoriesbackground AddView:(UIView*)(([self _createcategoryitem:_icon :[self->__xui CreateMaterialIcons:(float) (25)] :(NSObject*)(((NSString*)[_categorynames getObjectFast:(int) (0)]))]).object) :(float) (_width*[self->__xpnl_categoriesbackground NumberOfViews]) :(float) (0) :_width :_width];
 //BA.debugLineNum = 174;BA.debugLine="For Each Category As String In CategoryNames";
{
const id<B4IIterable> group3 = _categorynames;
const int groupLen3 = group3.Size
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_category = [group3 Get:index3];
 //BA.debugLineNum = 176;BA.debugLine="If m_Emojis.ContainsKey(Category) = False Then";
if ([self->__m_emojis ContainsKey:(NSObject*)(_category)]==false) { 
 }else {
 //BA.debugLineNum = 182;BA.debugLine="Dim Counter As Int = 0";
_counter = (int) (0);
 //BA.debugLineNum = 183;BA.debugLine="Dim xpnl_EmojiBackground As B4XView";
_xpnl_emojibackground = [B4XViewWrapper new];
 //BA.debugLineNum = 184;BA.debugLine="Dim emojis As List = m_Emojis.Get(Category).As(";
_emojis = [B4IList new];
_emojis = (B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)([((B4IMap*)([self->__m_emojis Get:(NSObject*)(_category)])) Get:(NSObject*)(@"emojis")])];
 //BA.debugLineNum = 185;BA.debugLine="For Each colemojis As Map In emojis";
{
const id<B4IIterable> group9 = _emojis;
const int groupLen9 = group9.Size
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_colemojis = (B4IMap*)([group9 Get:index9]);
 //BA.debugLineNum = 187;BA.debugLine="Dim HeightWidth As Float = xpnl_ListviewBackgr";
_heightwidth = (float) ([self->__xpnl_listviewbackground Height]/(double)self->__m_rows);
 //BA.debugLineNum = 188;BA.debugLine="If Counter Mod m_Rows = 0 Then";
if (_counter%self->__m_rows==0) { 
 //BA.debugLineNum = 189;BA.debugLine="xpnl_EmojiBackground = xui.CreatePanel(\"\")";
_xpnl_emojibackground = [self->__xui CreatePanel:self.bi :@""];
 //BA.debugLineNum = 190;BA.debugLine="xpnl_EmojiBackground.SetLayoutAnimated(0,0,0,";
[_xpnl_emojibackground SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :_heightwidth :_heightwidth];
 //BA.debugLineNum = 191;BA.debugLine="Dim tmp_lst As List";
_tmp_lst = [B4IList new];
 //BA.debugLineNum = 192;BA.debugLine="tmp_lst.Initialize";
[_tmp_lst Initialize];
 //BA.debugLineNum = 193;BA.debugLine="xpnl_EmojiBackground.Tag = tmp_lst";
[_xpnl_emojibackground setTag:(NSObject*)((_tmp_lst).object)];
 //BA.debugLineNum = 194;BA.debugLine="xclv_Main.Add(xpnl_EmojiBackground,m_Emojis.G";
[self->__xclv_main _add:_xpnl_emojibackground :[((B4IMap*)([self->__m_emojis Get:(NSObject*)(_category)])) Get:(NSObject*)(@"slug")]];
 };
 //BA.debugLineNum = 197;BA.debugLine="xpnl_EmojiBackground.Tag.As(List).Add(colemoji";
[((B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)([_xpnl_emojibackground Tag])]) Add:[_colemojis Get:(NSObject*)(@"emoji")]];
 //BA.debugLineNum = 200;BA.debugLine="Counter = Counter +1";
_counter = (int) (_counter+1);
 }
};
 };
 }
};
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _createcategoryitem:(NSString*) _text :(B4XFont*) _xfont :(NSObject*) _value{
B4XViewWrapper* _xlbl = nil;
 //BA.debugLineNum = 255;BA.debugLine="Private Sub CreateCategoryItem(Text As String,xFon";
 //BA.debugLineNum = 256;BA.debugLine="Dim xlbl As B4XView = CreateLabel(\"xlbl_Category\"";
_xlbl = [B4XViewWrapper new];
_xlbl = [self _createlabel:@"xlbl_Category"];
 //BA.debugLineNum = 257;BA.debugLine="xlbl.Font = xFont";
[_xlbl setFont:_xfont];
 //BA.debugLineNum = 258;BA.debugLine="xlbl.Text = Text";
[_xlbl setText:_text];
 //BA.debugLineNum = 259;BA.debugLine="xlbl.TextColor = m_CategoryTextColor";
[_xlbl setTextColor:self->__m_categorytextcolor];
 //BA.debugLineNum = 260;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\",\"CENTER\")";
[_xlbl SetTextAlignment:@"CENTER" :@"CENTER"];
 //BA.debugLineNum = 261;BA.debugLine="xlbl.Tag = Value";
[_xlbl setTag:_value];
 //BA.debugLineNum = 262;BA.debugLine="Return xlbl";
if (true) return _xlbl;
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return nil;
}
- (B4XViewWrapper*)  _createlabel:(NSString*) _eventname{
B4ILabelWrapper* _lbl = nil;
 //BA.debugLineNum = 364;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
 //BA.debugLineNum = 365;BA.debugLine="Dim lbl As Label";
_lbl = [B4ILabelWrapper new];
 //BA.debugLineNum = 366;BA.debugLine="lbl.Initialize(EventName)";
[_lbl Initialize:self.bi :_eventname];
 //BA.debugLineNum = 367;BA.debugLine="Return lbl";
if (true) return (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((_lbl).object)];
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _emojiselected:(NSString*) _text{
 //BA.debugLineNum = 354;BA.debugLine="Private Sub EmojiSelected(Text As String)";
 //BA.debugLineNum = 355;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EmojiS";
if ([self->__xui SubExists:self->__mcallback :[@[self->__meventname,@"_EmojiSelected"] componentsJoinedByString:@""] :(int) (1)]) { 
 //BA.debugLineNum = 356;BA.debugLine="CallSub2(mCallBack, mEventName & \"_EmojiSelected";
[self->___c CallSub2:self.bi :self->__mcallback :[@[self->__meventname,@"_EmojiSelected"] componentsJoinedByString:@""] :(NSObject*)(_text)];
 };
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return @"";
}
- (B4IArray*)  _getargb:(int) _color{
B4IArray* _res = nil;
 //BA.debugLineNum = 387;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()'ignore";
 //BA.debugLineNum = 388;BA.debugLine="Dim res(4) As Int";
_res = [[B4IArray alloc]initObjects:@[@((int) (4))] :@0 :nil];
 //BA.debugLineNum = 389;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
[_res setObjectFastN:(int) (0):@((((unsigned int)((_color) & (((int)0xff000000)))) >> ((int) (24))))];
 //BA.debugLineNum = 390;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
[_res setObjectFastN:(int) (1):@((((unsigned int)((_color) & (((int)0xff0000)))) >> ((int) (16))))];
 //BA.debugLineNum = 391;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
[_res setObjectFastN:(int) (2):@((((unsigned int)((_color) & (((int)0xff00)))) >> ((int) (8))))];
 //BA.debugLineNum = 392;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
[_res setObjectFastN:(int) (3):@(((_color) & (((int)0xff))))];
 //BA.debugLineNum = 393;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return nil;
}
- (int)  _getbackgroundcolor{
 //BA.debugLineNum = 346;BA.debugLine="Public Sub getBackgroundColor As Int";
 //BA.debugLineNum = 347;BA.debugLine="Return m_BodyColor";
if (true) return self->__m_bodycolor;
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return 0;
}
- (float)  _getbodyheight{
 //BA.debugLineNum = 303;BA.debugLine="Public Sub getBodyHeight As Float";
 //BA.debugLineNum = 304;BA.debugLine="Return m_BodyHeight";
if (true) return self->__m_bodyheight;
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return 0.0f;
}
- (int)  _getcategoryindicatorcolor{
 //BA.debugLineNum = 324;BA.debugLine="Public Sub getCategoryIndicatorColor As Int";
 //BA.debugLineNum = 325;BA.debugLine="Return m_CategoryIndicatorColor";
if (true) return self->__m_categoryindicatorcolor;
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return 0;
}
- (int)  _getcategorytextcolor{
 //BA.debugLineNum = 334;BA.debugLine="Public Sub getCategoryTextColor As Int";
 //BA.debugLineNum = 335;BA.debugLine="Return m_CategoryTextColor";
if (true) return self->__m_categorytextcolor;
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return 0;
}
- (int)  _getemojisize{
 //BA.debugLineNum = 316;BA.debugLine="Public Sub getEmojiSize As Int";
 //BA.debugLineNum = 317;BA.debugLine="Return m_EmojiSize";
if (true) return self->__m_emojisize;
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return 0;
}
- (int)  _getrows{
 //BA.debugLineNum = 293;BA.debugLine="Public Sub getRows As Int";
 //BA.debugLineNum = 294;BA.debugLine="Return m_Rows";
if (true) return self->__m_rows;
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _ini_xclv{
B4ILabelWrapper* _tmplbl = nil;
B4IMap* _tmpmap = nil;
B4IScrollView* _sv = nil;
 //BA.debugLineNum = 76;BA.debugLine="Private Sub ini_xclv";
 //BA.debugLineNum = 77;BA.debugLine="Dim tmplbl As Label";
_tmplbl = [B4ILabelWrapper new];
 //BA.debugLineNum = 78;BA.debugLine="tmplbl.Initialize(\"\")";
[_tmplbl Initialize:self.bi :@""];
 //BA.debugLineNum = 80;BA.debugLine="Dim tmpmap As Map";
_tmpmap = [B4IMap new];
 //BA.debugLineNum = 81;BA.debugLine="tmpmap.Initialize";
[_tmpmap Initialize];
 //BA.debugLineNum = 82;BA.debugLine="tmpmap.Put(\"DividerColor\",0x00FFFFFF)";
[_tmpmap Put:(NSObject*)(@"DividerColor") :(NSObject*)(@(((int)0x00ffffff)))];
 //BA.debugLineNum = 83;BA.debugLine="tmpmap.Put(\"DividerHeight\",0)";
[_tmpmap Put:(NSObject*)(@"DividerHeight") :(NSObject*)(@(0))];
 //BA.debugLineNum = 84;BA.debugLine="tmpmap.Put(\"PressedColor\",0x00FFFFFF)";
[_tmpmap Put:(NSObject*)(@"PressedColor") :(NSObject*)(@(((int)0x00ffffff)))];
 //BA.debugLineNum = 85;BA.debugLine="tmpmap.Put(\"InsertAnimationDuration\",0)";
[_tmpmap Put:(NSObject*)(@"InsertAnimationDuration") :(NSObject*)(@(0))];
 //BA.debugLineNum = 86;BA.debugLine="tmpmap.Put(\"ListOrientation\",\"Horizontal\")";
[_tmpmap Put:(NSObject*)(@"ListOrientation") :(NSObject*)(@"Horizontal")];
 //BA.debugLineNum = 87;BA.debugLine="tmpmap.Put(\"ShowScrollBar\",False)";
[_tmpmap Put:(NSObject*)(@"ShowScrollBar") :(NSObject*)(@(false))];
 //BA.debugLineNum = 88;BA.debugLine="xclv_Main.Initialize(Me,\"xclv_main\")";
[self->__xclv_main _initialize:self.bi :self :@"xclv_main"];
 //BA.debugLineNum = 89;BA.debugLine="xclv_Main.DesignerCreateView(xpnl_ListviewBackgro";
[self->__xclv_main _designercreateview:(NSObject*)((self->__xpnl_listviewbackground).object) :_tmplbl :_tmpmap];
 //BA.debugLineNum = 97;BA.debugLine="Dim sv As ScrollView = xclv_Main.sv";
_sv = [B4IScrollView new];
_sv = (B4IScrollView*) [B4IObjectWrapper createWrapper:[B4IScrollView new] object:(UIScrollView*)((self->__xclv_main->__sv).object)];
 //BA.debugLineNum = 98;BA.debugLine="sv.Color = xui.Color_Transparent'xui.Color_ARGB(2";
[_sv setColor:[self->__xui Color_Transparent]];
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname :(B4XViewWrapper*) _parent{
[self initializeClassModule];
B4IJSONParser* _parser = nil;
B4IList* _jroot = nil;
B4IMap* _coljroot = nil;
 //BA.debugLineNum = 41;BA.debugLine="Public Sub Initialize(Callback As Object,EventName";
 //BA.debugLineNum = 43;BA.debugLine="mEventName = EventName";
self->__meventname = _eventname;
 //BA.debugLineNum = 44;BA.debugLine="mCallBack = Callback";
self->__mcallback = _callback;
 //BA.debugLineNum = 45;BA.debugLine="xParent = Parent";
self->__xparent = _parent;
 //BA.debugLineNum = 47;BA.debugLine="m_HeaderHeight = 40dip";
self->__m_headerheight = (float) (((int) (40)));
 //BA.debugLineNum = 48;BA.debugLine="m_BodyHeight = 300dip";
self->__m_bodyheight = (float) (((int) (300)));
 //BA.debugLineNum = 50;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
self->__xpnl_header = [self->__xui CreatePanel:self.bi :@""];
 //BA.debugLineNum = 51;BA.debugLine="xpnl_Body = xui.CreatePanel(\"\")";
self->__xpnl_body = [self->__xui CreatePanel:self.bi :@""];
 //BA.debugLineNum = 52;BA.debugLine="xpnl_DragIndicator = xui.CreatePanel(\"\")";
self->__xpnl_dragindicator = [self->__xui CreatePanel:self.bi :@""];
 //BA.debugLineNum = 53;BA.debugLine="xpnl_ListviewBackground = xui.CreatePanel(\"\")";
self->__xpnl_listviewbackground = [self->__xui CreatePanel:self.bi :@""];
 //BA.debugLineNum = 54;BA.debugLine="xpnl_ListviewBackground.SetLayoutAnimated(0,0,0,P";
[self->__xpnl_listviewbackground SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[_parent Width] :self->__m_bodyheight];
 //BA.debugLineNum = 56;BA.debugLine="m_HeaderColor = xui.Color_ARGB(255,32, 33, 37)";
self->__m_headercolor = [self->__xui Color_ARGB:(int) (255) :(int) (32) :(int) (33) :(int) (37)];
 //BA.debugLineNum = 57;BA.debugLine="m_BodyColor = xui.Color_ARGB(255,32, 33, 37)";
self->__m_bodycolor = [self->__xui Color_ARGB:(int) (255) :(int) (32) :(int) (33) :(int) (37)];
 //BA.debugLineNum = 58;BA.debugLine="m_CategoryTextColor = xui.Color_White";
self->__m_categorytextcolor = [self->__xui Color_White];
 //BA.debugLineNum = 59;BA.debugLine="m_CategoryIndicatorColor = xui.Color_White";
self->__m_categoryindicatorcolor = [self->__xui Color_White];
 //BA.debugLineNum = 60;BA.debugLine="m_EmojiSize = 30";
self->__m_emojisize = (int) (30);
 //BA.debugLineNum = 61;BA.debugLine="m_Rows = 5";
self->__m_rows = (int) (5);
 //BA.debugLineNum = 63;BA.debugLine="ini_xclv";
[self _ini_xclv];
 //BA.debugLineNum = 65;BA.debugLine="m_Emojis.Initialize";
[self->__m_emojis Initialize];
 //BA.debugLineNum = 66;BA.debugLine="Dim parser As JSONParser";
_parser = [B4IJSONParser new];
 //BA.debugLineNum = 67;BA.debugLine="parser.Initialize(File.ReadString(File.DirAssets,";
[_parser Initialize:[[self->___c File] ReadString:[[self->___c File] DirAssets] :@"data-by-group.json"]];
 //BA.debugLineNum = 68;BA.debugLine="Dim jRoot As List = parser.NextArray";
_jroot = [B4IList new];
_jroot = [_parser NextArray];
 //BA.debugLineNum = 70;BA.debugLine="For Each coljRoot As Map In jRoot";
{
const id<B4IIterable> group22 = _jroot;
const int groupLen22 = group22.Size
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_coljroot = (B4IMap*)([group22 Get:index22]);
 //BA.debugLineNum = 71;BA.debugLine="m_Emojis.Put(coljRoot.Get(\"slug\"),coljRoot)";
[self->__m_emojis Put:[_coljroot Get:(NSObject*)(@"slug")] :(NSObject*)(_coljroot)];
 }
};
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setbackgroundcolor:(int) _color{
 //BA.debugLineNum = 338;BA.debugLine="Public Sub setBackgroundColor(Color As Int)";
 //BA.debugLineNum = 339;BA.debugLine="m_BodyColor = Color";
self->__m_bodycolor = _color;
 //BA.debugLineNum = 340;BA.debugLine="If BottomCard.IsInitialized Then BottomCard.BodyP";
if ([self->__bottomcard IsInitialized /*BOOL*/ ]) { 
[[self->__bottomcard _getbodypanel /*B4XViewWrapper**/ ] setColor:self->__m_bodycolor];};
 //BA.debugLineNum = 341;BA.debugLine="m_HeaderColor = Color";
self->__m_headercolor = _color;
 //BA.debugLineNum = 342;BA.debugLine="xpnl_Body.Color = Color";
[self->__xpnl_body setColor:_color];
 //BA.debugLineNum = 343;BA.debugLine="xpnl_Header.Color = Color";
[self->__xpnl_header setColor:_color];
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setbodyheight:(float) _height{
 //BA.debugLineNum = 307;BA.debugLine="Public Sub setBodyHeight(Height As Float)";
 //BA.debugLineNum = 308;BA.debugLine="m_BodyHeight = Height";
self->__m_bodyheight = _height;
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setcategoryindicatorcolor:(int) _color{
 //BA.debugLineNum = 320;BA.debugLine="Public Sub setCategoryIndicatorColor(Color As Int)";
 //BA.debugLineNum = 321;BA.debugLine="m_CategoryIndicatorColor = Color";
self->__m_categoryindicatorcolor = _color;
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setcategorytextcolor:(int) _color{
B4IArray* _argb = nil;
 //BA.debugLineNum = 328;BA.debugLine="Public Sub setCategoryTextColor(Color As Int)";
 //BA.debugLineNum = 329;BA.debugLine="m_CategoryTextColor = Color";
self->__m_categorytextcolor = _color;
 //BA.debugLineNum = 330;BA.debugLine="Dim ARGB() As Int = GetARGB(m_CategoryTextColor)";
_argb = [self _getargb:self->__m_categorytextcolor];
 //BA.debugLineNum = 331;BA.debugLine="xpnl_DragIndicator.SetColorAndBorder(xui.Color_AR";
[self->__xpnl_dragindicator SetColorAndBorder:[self->__xui Color_ARGB:(int) (80) :((NSNumber*)[_argb getObjectFastN:(int) (1)]).intValue :((NSNumber*)[_argb getObjectFastN:(int) (2)]).intValue :((NSNumber*)[_argb getObjectFastN:(int) (3)]).intValue] :(float) (0) :(int) (0) :(float) (((int) (3)))];
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setemojisize:(int) _size{
 //BA.debugLineNum = 312;BA.debugLine="Public Sub setEmojiSize(Size As Int)";
 //BA.debugLineNum = 313;BA.debugLine="m_EmojiSize= Size";
self->__m_emojisize = _size;
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setrows:(int) _rows{
 //BA.debugLineNum = 297;BA.debugLine="Public Sub setRows(Rows As Int)";
 //BA.debugLineNum = 298;BA.debugLine="m_Rows = Rows";
self->__m_rows = _rows;
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return @"";
}
- (void)  _showpicker{
ResumableSub_as_bottomemojipicker_ShowPicker* rsub = [[ResumableSub_as_bottomemojipicker_ShowPicker alloc] init:self ];
[rsub resume:self.bi :nil];
}
//-78809393
- (NSString*)  _xclv_main_visiblerangechanged:(int) _firstindex :(int) _lastindex{
int _i = 0;
B4XViewWrapper* _xlbl_category = nil;
int _extrasize = 0;
B4XViewWrapper* _p = nil;
B4IList* _tmp_list = nil;
int _z = 0;
B4XViewWrapper* _xlbl_emoji = nil;
 //BA.debugLineNum = 209;BA.debugLine="Private Sub xclv_main_VisibleRangeChanged (FirstIn";
 //BA.debugLineNum = 211;BA.debugLine="If xclv_Main.GetValue(FirstIndex) <> CurrentCateg";
if ([[self->__xclv_main _getvalue:_firstindex] isEqual:(NSObject*)(self->__currentcategory)] == false) { 
 //BA.debugLineNum = 213;BA.debugLine="For i = 0 To xpnl_CategoriesBackground.NumberOfV";
{
const int step2 = 1;
const int limit2 = (int) ([self->__xpnl_categoriesbackground NumberOfViews]-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 215;BA.debugLine="If xclv_Main.GetValue(FirstIndex) = xpnl_Catego";
if ([[self->__xclv_main _getvalue:_firstindex] isEqual:[[self->__xpnl_categoriesbackground GetView:_i] Tag]]) { 
 //BA.debugLineNum = 218;BA.debugLine="Dim xlbl_Category As B4XView = xpnl_Categories";
_xlbl_category = [B4XViewWrapper new];
_xlbl_category = [self->__xpnl_categoriesbackground GetView:_i];
 //BA.debugLineNum = 219;BA.debugLine="xpnl_CurrentCategoryIndicator.SetLayoutAnimate";
[self->__xpnl_currentcategoryindicator SetLayoutAnimated:(int) (250) :[_xlbl_category Left] :[self->__xpnl_currentcategoryindicator Top] :[self->__xpnl_currentcategoryindicator Width] :[self->__xpnl_currentcategoryindicator Height]];
 //BA.debugLineNum = 220;BA.debugLine="CurrentCategory = xclv_Main.GetValue(FirstInde";
self->__currentcategory = [self.bi ObjectToString:[self->__xclv_main _getvalue:_firstindex]];
 };
 }
};
 };
 //BA.debugLineNum = 225;BA.debugLine="Dim ExtraSize As Int = 10";
_extrasize = (int) (10);
 //BA.debugLineNum = 226;BA.debugLine="For i = 0 To xclv_Main.Size - 1";
{
const int step11 = 1;
const int limit11 = (int) ([self->__xclv_main _getsize]-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 227;BA.debugLine="Dim p As B4XView = xclv_Main.GetPanel(i)";
_p = [B4XViewWrapper new];
_p = [self->__xclv_main _getpanel:_i];
 //BA.debugLineNum = 228;BA.debugLine="If i > FirstIndex - ExtraSize And i < LastIndex";
if (_i>_firstindex-_extrasize && _i<_lastindex+_extrasize) { 
 //BA.debugLineNum = 230;BA.debugLine="If p.NumberOfViews = 0 Then";
if ([_p NumberOfViews]==0) { 
 //BA.debugLineNum = 232;BA.debugLine="Dim tmp_List As List =  p.Tag";
_tmp_list = [B4IList new];
_tmp_list = (B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)([_p Tag])];
 //BA.debugLineNum = 233;BA.debugLine="For z = 0 To tmp_List.Size -1";
{
const int step16 = 1;
const int limit16 = (int) ([_tmp_list Size]-1);
_z = (int) (0) ;
for (;_z <= limit16 ;_z = _z + step16 ) {
 //BA.debugLineNum = 235;BA.debugLine="Dim xlbl_Emoji As B4XView = CreateLabel(\"xlbl";
_xlbl_emoji = [B4XViewWrapper new];
_xlbl_emoji = [self _createlabel:@"xlbl_Emoji"];
 //BA.debugLineNum = 236;BA.debugLine="xlbl_Emoji.Font = xui.CreateDefaultFont(m_Emo";
[_xlbl_emoji setFont:[self->__xui CreateDefaultFont:(float) (self->__m_emojisize)]];
 //BA.debugLineNum = 237;BA.debugLine="xlbl_Emoji.Text = tmp_List.Get(z)";
[_xlbl_emoji setText:[self.bi ObjectToString:[_tmp_list Get:_z]]];
 //BA.debugLineNum = 238;BA.debugLine="xlbl_Emoji.TextColor = xui.Color_White";
[_xlbl_emoji setTextColor:[self->__xui Color_White]];
 //BA.debugLineNum = 239;BA.debugLine="xlbl_Emoji.SetTextAlignment(\"CENTER\",\"CENTER\"";
[_xlbl_emoji SetTextAlignment:@"CENTER" :@"CENTER"];
 //BA.debugLineNum = 241;BA.debugLine="p.AddView(xlbl_Emoji,0,p.Width*z,p.Width,p.Wi";
[_p AddView:(UIView*)((_xlbl_emoji).object) :(float) (0) :(float) ([_p Width]*_z) :[_p Width] :[_p Width]];
 }
};
 };
 }else {
 //BA.debugLineNum = 248;BA.debugLine="If p.NumberOfViews > 0 Then";
if ([_p NumberOfViews]>0) { 
 //BA.debugLineNum = 249;BA.debugLine="p.RemoveAllViews";
[_p RemoveAllViews];
 };
 };
 }
};
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _xlbl_category_click{
B4XViewWrapper* _xlbl_category = nil;
int _i = 0;
 //BA.debugLineNum = 270;BA.debugLine="Private Sub xlbl_Category_Click";
 //BA.debugLineNum = 271;BA.debugLine="Dim xlbl_Category As B4XView = Sender";
_xlbl_category = [B4XViewWrapper new];
_xlbl_category = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])];
 //BA.debugLineNum = 272;BA.debugLine="xpnl_CurrentCategoryIndicator.SetLayoutAnimated(2";
[self->__xpnl_currentcategoryindicator SetLayoutAnimated:(int) (250) :[_xlbl_category Left] :[self->__xpnl_currentcategoryindicator Top] :[self->__xpnl_currentcategoryindicator Width] :[self->__xpnl_currentcategoryindicator Height]];
 //BA.debugLineNum = 273;BA.debugLine="CurrentCategory = xlbl_Category.Tag";
self->__currentcategory = [self.bi ObjectToString:[_xlbl_category Tag]];
 //BA.debugLineNum = 274;BA.debugLine="If xlbl_Category.Tag = \"recent\" Then";
if ([[_xlbl_category Tag] isEqual:(NSObject*)(@"recent")]) { 
 //BA.debugLineNum = 275;BA.debugLine="xclv_Main.ScrollToItem(0)";
[self->__xclv_main _scrolltoitem:(int) (0)];
 }else {
 //BA.debugLineNum = 277;BA.debugLine="For i = 0 To xclv_Main.Size -1";
{
const int step7 = 1;
const int limit7 = (int) ([self->__xclv_main _getsize]-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 279;BA.debugLine="If xlbl_Category.Tag = xclv_Main.GetValue(i) Th";
if ([[_xlbl_category Tag] isEqual:[self->__xclv_main _getvalue:_i]]) { 
 //BA.debugLineNum = 280;BA.debugLine="xclv_Main.ScrollToItem(i)";
[self->__xclv_main _scrolltoitem:_i];
 //BA.debugLineNum = 281;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _xlbl_emoji_click{
B4XViewWrapper* _xlbl_emoji = nil;
 //BA.debugLineNum = 265;BA.debugLine="Private Sub xlbl_Emoji_Click";
 //BA.debugLineNum = 266;BA.debugLine="Dim xlbl_Emoji As B4XView = Sender";
_xlbl_emoji = [B4XViewWrapper new];
_xlbl_emoji = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])];
 //BA.debugLineNum = 267;BA.debugLine="EmojiSelected(xlbl_Emoji.Text)";
[self _emojiselected:[_xlbl_emoji Text]];
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return @"";
}
@end
