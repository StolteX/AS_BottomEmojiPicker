
#import "b4i_b4xmainpage.h"
#import "b4i_main.h"
#import "b4i_as_bottomemojipicker.h"
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


@implementation b4i_b4xmainpage 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xmainpage) instance released.");
}
- (NSString*)  _b4xpage_created:(B4XViewWrapper*) _root1{
 //BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 22;BA.debugLine="Root = Root1";
self->__root = _root1;
 //BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"frm_main\")";
[self->__root LoadLayout:@"frm_main" :self.bi];
 //BA.debugLineNum = 25;BA.debugLine="B4XPages.SetTitle(Me,\"AS BottomEmojiPicker Exampl";
[self->__b4xpages _settitle /*NSString**/ :self :(NSObject*)(@"AS BottomEmojiPicker Example")];
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _bottomemojipicker_emojiselected:(NSString*) _emoji{
 //BA.debugLineNum = 68;BA.debugLine="Private Sub BottomEmojiPicker_EmojiSelected (Emoji";
 //BA.debugLineNum = 69;BA.debugLine="xlbl_EmojiResult.Text = xlbl_EmojiResult.Text & E";
[self->__xlbl_emojiresult setText:[@[[self->__xlbl_emojiresult Text],_emoji] componentsJoinedByString:@""]];
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
self->__root = [B4XViewWrapper new];
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
 //BA.debugLineNum = 12;BA.debugLine="Private BottomEmojiPicker As AS_BottomEmojiPicker";
self->__bottomemojipicker = [b4i_as_bottomemojipicker new];
 //BA.debugLineNum = 13;BA.debugLine="Private xlbl_EmojiResult As B4XView";
self->__xlbl_emojiresult = [B4XViewWrapper new];
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(B4I*) _ba{
[self initializeClassModule];
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _opencustom{
 //BA.debugLineNum = 53;BA.debugLine="Private Sub OpenCustom";
 //BA.debugLineNum = 55;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
[self->__bottomemojipicker _initialize /*NSString**/ :self.bi :self :@"BottomEmojiPicker" :self->__root];
 //BA.debugLineNum = 57;BA.debugLine="BottomEmojiPicker.BackgroundColor = xui.Color_ARG";
[self->__bottomemojipicker _setbackgroundcolor: /*int*/ [self->__xui Color_ARGB:(int) (255) :(int) (32) :(int) (33) :(int) (37)]];
 //BA.debugLineNum = 58;BA.debugLine="BottomEmojiPicker.CategoryTextColor = xui.Color_W";
[self->__bottomemojipicker _setcategorytextcolor: /*int*/ [self->__xui Color_White]];
 //BA.debugLineNum = 59;BA.debugLine="BottomEmojiPicker.CategoryIndicatorColor = xui.Co";
[self->__bottomemojipicker _setcategoryindicatorcolor: /*int*/ [self->__xui Color_White]];
 //BA.debugLineNum = 60;BA.debugLine="BottomEmojiPicker.EmojiSize = 50";
[self->__bottomemojipicker _setemojisize: /*int*/ (int) (50)];
 //BA.debugLineNum = 61;BA.debugLine="BottomEmojiPicker.BodyHeight = 300dip";
[self->__bottomemojipicker _setbodyheight: /*float*/ (float) (((int) (300)))];
 //BA.debugLineNum = 62;BA.debugLine="BottomEmojiPicker.Rows = 3";
[self->__bottomemojipicker _setrows: /*int*/ (int) (3)];
 //BA.debugLineNum = 64;BA.debugLine="BottomEmojiPicker.ShowPicker";
[self->__bottomemojipicker _showpicker /*void*/ ];
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _opendark{
 //BA.debugLineNum = 29;BA.debugLine="Private Sub OpenDark";
 //BA.debugLineNum = 31;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
[self->__bottomemojipicker _initialize /*NSString**/ :self.bi :self :@"BottomEmojiPicker" :self->__root];
 //BA.debugLineNum = 33;BA.debugLine="BottomEmojiPicker.BackgroundColor = xui.Color_ARG";
[self->__bottomemojipicker _setbackgroundcolor: /*int*/ [self->__xui Color_ARGB:(int) (255) :(int) (32) :(int) (33) :(int) (37)]];
 //BA.debugLineNum = 34;BA.debugLine="BottomEmojiPicker.CategoryTextColor = xui.Color_W";
[self->__bottomemojipicker _setcategorytextcolor: /*int*/ [self->__xui Color_White]];
 //BA.debugLineNum = 35;BA.debugLine="BottomEmojiPicker.CategoryIndicatorColor = xui.Co";
[self->__bottomemojipicker _setcategoryindicatorcolor: /*int*/ [self->__xui Color_White]];
 //BA.debugLineNum = 37;BA.debugLine="BottomEmojiPicker.ShowPicker";
[self->__bottomemojipicker _showpicker /*void*/ ];
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _openlight{
 //BA.debugLineNum = 41;BA.debugLine="Private Sub OpenLight";
 //BA.debugLineNum = 43;BA.debugLine="BottomEmojiPicker.Initialize(Me,\"BottomEmojiPicke";
[self->__bottomemojipicker _initialize /*NSString**/ :self.bi :self :@"BottomEmojiPicker" :self->__root];
 //BA.debugLineNum = 45;BA.debugLine="BottomEmojiPicker.BackgroundColor = xui.Color_Whi";
[self->__bottomemojipicker _setbackgroundcolor: /*int*/ [self->__xui Color_White]];
 //BA.debugLineNum = 46;BA.debugLine="BottomEmojiPicker.CategoryTextColor = xui.Color_B";
[self->__bottomemojipicker _setcategorytextcolor: /*int*/ [self->__xui Color_Black]];
 //BA.debugLineNum = 47;BA.debugLine="BottomEmojiPicker.CategoryIndicatorColor = xui.Co";
[self->__bottomemojipicker _setcategoryindicatorcolor: /*int*/ [self->__xui Color_Black]];
 //BA.debugLineNum = 49;BA.debugLine="BottomEmojiPicker.ShowPicker";
[self->__bottomemojipicker _showpicker /*void*/ ];
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _xlbl_opencustom_click{
 //BA.debugLineNum = 91;BA.debugLine="Private Sub xlbl_OpenCustom_Click";
 //BA.debugLineNum = 93;BA.debugLine="OpenCustom";
[self _opencustom];
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _xlbl_opendark_click{
 //BA.debugLineNum = 75;BA.debugLine="Private Sub xlbl_OpenDark_Click";
 //BA.debugLineNum = 77;BA.debugLine="OpenDark";
[self _opendark];
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _xlbl_openlight_click{
 //BA.debugLineNum = 83;BA.debugLine="Private Sub xlbl_OpenLight_Click";
 //BA.debugLineNum = 85;BA.debugLine="OpenLight";
[self _openlight];
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return @"";
}
@end
