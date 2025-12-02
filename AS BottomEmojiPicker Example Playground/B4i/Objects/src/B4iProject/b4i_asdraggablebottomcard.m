
#import "b4i_asdraggablebottomcard.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_as_bottomemojipicker.h"
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

@interface ResumableSub_asdraggablebottomcard_Hide :B4IResumableSub 
- (instancetype) init: (b4i_asdraggablebottomcard*) parent1 :(BOOL) _ignore_event1;
@end
@implementation ResumableSub_asdraggablebottomcard_Hide {
b4i_asdraggablebottomcard* parent;
BOOL _ignore_event;
}
- (instancetype) init: (b4i_asdraggablebottomcard*) parent1 :(BOOL) _ignore_event1 {
self->_ignore_event = _ignore_event1;
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
self->_state = 1;
 //BA.debugLineNum = 232;BA.debugLine="If inClosingProcess Then Return";
if (true) break;

case 1:
//if
self->_state = 6;
if (parent->__inclosingprocess) { 
self->_state = 3;
;}if (true) break;

case 3:
//C
self->_state = 6;
if (true) return ;
if (true) break;

case 6:
//C
self->_state = 7;
;
 //BA.debugLineNum = 233;BA.debugLine="inClosingProcess = True";
parent->__inclosingprocess = true;
 //BA.debugLineNum = 234;BA.debugLine="expand_state = 0";
parent->__expand_state = (int) (0);
 //BA.debugLineNum = 235;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Close\",";
if (true) break;

case 7:
//if
self->_state = 10;
if ([parent->__xui SubExists:parent->__mcallback :[@[parent->__meventname,@"_Close"] componentsJoinedByString:@""] :(int) (0)]) { 
self->_state = 9;
}if (true) break;

case 9:
//C
self->_state = 10;
 //BA.debugLineNum = 236;BA.debugLine="CallSub(mCallBack,mEventName & \"_Close\")";
[parent->___c CallSub:self.bi :parent->__mcallback :[@[parent->__meventname,@"_Close"] componentsJoinedByString:@""]];
 if (true) break;

case 10:
//C
self->_state = 11;
;
 //BA.debugLineNum = 239;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(g_hide_duration,x";
[parent->__xpnl_cardbase SetLayoutAnimated:parent->__g_hide_duration :[parent->__xpnl_cardbase Left] :(float) ([parent->__mdarkpanel Height]+parent->__g_first_height) :parent->__g_width :[parent->__xpnl_cardbase Height]];
 //BA.debugLineNum = 241;BA.debugLine="mDarkPanel.SetVisibleAnimated(g_hide_duration,Fal";
[parent->__mdarkpanel SetVisibleAnimated:parent->__g_hide_duration :false];
 //BA.debugLineNum = 242;BA.debugLine="If ignore_event = False Then";
if (true) break;

case 11:
//if
self->_state = 20;
if (self->_ignore_event==false) { 
self->_state = 13;
}else {
self->_state = 19;
}if (true) break;

case 13:
//C
self->_state = 14;
 //BA.debugLineNum = 243;BA.debugLine="Sleep(g_hide_duration)";
[parent->___c Sleep:self.bi :self :parent->__g_hide_duration];
self->_state = 21;
return;
case 21:
//C
self->_state = 14;
;
 //BA.debugLineNum = 244;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Closed";
if (true) break;

case 14:
//if
self->_state = 17;
if ([parent->__xui SubExists:parent->__mcallback :[@[parent->__meventname,@"_Closed"] componentsJoinedByString:@""] :(int) (0)]) { 
self->_state = 16;
}if (true) break;

case 16:
//C
self->_state = 17;
 //BA.debugLineNum = 245;BA.debugLine="CallSub(mCallBack,mEventName & \"_Closed\")";
[parent->___c CallSub:self.bi :parent->__mcallback :[@[parent->__meventname,@"_Closed"] componentsJoinedByString:@""]];
 if (true) break;

case 17:
//C
self->_state = 20;
;
 if (true) break;

case 19:
//C
self->_state = 20;
 //BA.debugLineNum = 248;BA.debugLine="Sleep(g_hide_duration)";
[parent->___c Sleep:self.bi :self :parent->__g_hide_duration];
self->_state = 22;
return;
case 22:
//C
self->_state = 20;
;
 if (true) break;

case 20:
//C
self->_state = -1;
;
 //BA.debugLineNum = 250;BA.debugLine="xpnl_CardBase.Height = g_first_height";
[parent->__xpnl_cardbase setHeight:parent->__g_first_height];
 //BA.debugLineNum = 251;BA.debugLine="Sleep(0)";
[parent->___c Sleep:self.bi :self :(int) (0)];
self->_state = 23;
return;
case 23:
//C
self->_state = -1;
;
 //BA.debugLineNum = 252;BA.debugLine="inClosingProcess = False";
parent->__inclosingprocess = false;
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end
@interface ResumableSub_asdraggablebottomcard_ShowIntern :B4IResumableSub 
- (instancetype) init: (b4i_asdraggablebottomcard*) parent1 :(BOOL) _ignore_event1 :(BOOL) _fromtouch1;
@end
@implementation ResumableSub_asdraggablebottomcard_ShowIntern {
b4i_asdraggablebottomcard* parent;
BOOL _ignore_event;
BOOL _fromtouch;
}
- (instancetype) init: (b4i_asdraggablebottomcard*) parent1 :(BOOL) _ignore_event1 :(BOOL) _fromtouch1 {
self->_ignore_event = _ignore_event1;
self->_fromtouch = _fromtouch1;
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
self->_state = 1;
 //BA.debugLineNum = 196;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Open\",0";
if (true) break;

case 1:
//if
self->_state = 4;
if ([parent->__xui SubExists:parent->__mcallback :[@[parent->__meventname,@"_Open"] componentsJoinedByString:@""] :(int) (0)]) { 
self->_state = 3;
}if (true) break;

case 3:
//C
self->_state = 4;
 //BA.debugLineNum = 197;BA.debugLine="CallSub(mCallBack,mEventName & \"_Open\")";
[parent->___c CallSub:self.bi :parent->__mcallback :[@[parent->__meventname,@"_Open"] componentsJoinedByString:@""]];
 if (true) break;

case 4:
//C
self->_state = 5;
;
 //BA.debugLineNum = 199;BA.debugLine="mDarkPanel.Enabled = True";
[parent->__mdarkpanel setEnabled:true];
 //BA.debugLineNum = 200;BA.debugLine="If mDarkPanel.Visible = False Then";
if (true) break;

case 5:
//if
self->_state = 8;
if ([parent->__mdarkpanel Visible]==false) { 
self->_state = 7;
}if (true) break;

case 7:
//C
self->_state = 8;
 //BA.debugLineNum = 201;BA.debugLine="mDarkPanel.SetVisibleAnimated(g_show_duration,Tr";
[parent->__mdarkpanel SetVisibleAnimated:parent->__g_show_duration :true];
 if (true) break;

case 8:
//C
self->_state = 9;
;
 //BA.debugLineNum = 203;BA.debugLine="disable_touch = True";
parent->__disable_touch = true;
 //BA.debugLineNum = 204;BA.debugLine="If expand_state = 1 Then";
if (true) break;

case 9:
//if
self->_state = 20;
if (parent->__expand_state==1) { 
self->_state = 11;
}else {
self->_state = 13;
}if (true) break;

case 11:
//C
self->_state = 20;
 //BA.debugLineNum = 205;BA.debugLine="xpnl_CardBase.Height = g_second_height + g_heade";
[parent->__xpnl_cardbase setHeight:(float) (parent->__g_second_height+parent->__g_header_height)];
 //BA.debugLineNum = 206;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(g_show_duration,";
[parent->__xpnl_cardbase SetLayoutAnimated:parent->__g_show_duration :[parent->__xpnl_cardbase Left] :(float) ([parent->__mdarkpanel Height]-parent->__g_first_height-parent->__g_header_height) :parent->__g_width :(float) (parent->__g_second_height+parent->__g_header_height)];
 //BA.debugLineNum = 207;BA.debugLine="xpnl_CardBody.Height = g_second_height";
[parent->__xpnl_cardbody setHeight:parent->__g_second_height];
 //BA.debugLineNum = 208;BA.debugLine="Sleep(g_show_duration)";
[parent->___c Sleep:self.bi :self :parent->__g_show_duration];
self->_state = 31;
return;
case 31:
//C
self->_state = 20;
;
 //BA.debugLineNum = 209;BA.debugLine="xpnl_CardBase.Height = g_first_height + g_header";
[parent->__xpnl_cardbase setHeight:(float) (parent->__g_first_height+parent->__g_header_height)];
 //BA.debugLineNum = 210;BA.debugLine="xpnl_CardBody.Height = g_first_height";
[parent->__xpnl_cardbody setHeight:parent->__g_first_height];
 //BA.debugLineNum = 211;BA.debugLine="VisibleBodyHeightChanged";
[parent _visiblebodyheightchanged];
 if (true) break;

case 13:
//C
self->_state = 14;
 //BA.debugLineNum = 213;BA.debugLine="xpnl_CardBase.Height = g_second_height + g_heade";
[parent->__xpnl_cardbase setHeight:(float) (parent->__g_second_height+parent->__g_header_height)];
 //BA.debugLineNum = 214;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(g_show_duration,";
[parent->__xpnl_cardbase SetLayoutAnimated:parent->__g_show_duration :[parent->__xpnl_cardbase Left] :(float) ([parent->__mdarkpanel Height]-parent->__g_second_height-parent->__g_header_height) :parent->__g_width :(float) (parent->__g_second_height+parent->__g_header_height)];
 //BA.debugLineNum = 215;BA.debugLine="xpnl_CardBody.Height = g_second_height";
[parent->__xpnl_cardbody setHeight:parent->__g_second_height];
 //BA.debugLineNum = 216;BA.debugLine="VisibleBodyHeightChanged";
[parent _visiblebodyheightchanged];
 //BA.debugLineNum = 217;BA.debugLine="If fromtouch = False Then Sleep(g_show_duration)";
if (true) break;

case 14:
//if
self->_state = 19;
if (self->_fromtouch==false) { 
self->_state = 16;
;}if (true) break;

case 16:
//C
self->_state = 19;
[parent->___c Sleep:self.bi :self :parent->__g_show_duration];
self->_state = 32;
return;
case 32:
//C
self->_state = 19;
;
if (true) break;

case 19:
//C
self->_state = 20;
;
 if (true) break;

case 20:
//C
self->_state = 21;
;
 //BA.debugLineNum = 220;BA.debugLine="disable_touch = False";
parent->__disable_touch = false;
 //BA.debugLineNum = 221;BA.debugLine="expand_state = 1";
parent->__expand_state = (int) (1);
 //BA.debugLineNum = 222;BA.debugLine="If ignore_event = False Then";
if (true) break;

case 21:
//if
self->_state = 30;
if (self->_ignore_event==false) { 
self->_state = 23;
}else {
self->_state = 29;
}if (true) break;

case 23:
//C
self->_state = 24;
 //BA.debugLineNum = 224;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Opened";
if (true) break;

case 24:
//if
self->_state = 27;
if ([parent->__xui SubExists:parent->__mcallback :[@[parent->__meventname,@"_Opened"] componentsJoinedByString:@""] :(int) (0)]) { 
self->_state = 26;
}if (true) break;

case 26:
//C
self->_state = 27;
 //BA.debugLineNum = 225;BA.debugLine="CallSub(mCallBack,mEventName & \"_Opened\")";
[parent->___c CallSub:self.bi :parent->__mcallback :[@[parent->__meventname,@"_Opened"] componentsJoinedByString:@""]];
 if (true) break;

case 27:
//C
self->_state = 30;
;
 if (true) break;

case 29:
//C
self->_state = 30;
 if (true) break;

case 30:
//C
self->_state = -1;
;
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_asdraggablebottomcard 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_asdraggablebottomcard) instance released.");
}
- (NSString*)  _addpangesture:(int) _minimumtouch :(int) _maximumtouch{
 //BA.debugLineNum = 490;BA.debugLine="Private Sub AddPanGesture(MinimumTouch As Int, Max";
 //BA.debugLineNum = 491;BA.debugLine="mView = xpnl_CardHeader";
self->__mview = (B4IViewWrapper*) [B4IObjectWrapper createWrapper:[B4IViewWrapper new] object:(UIView*)((self->__xpnl_cardheader).object)];
 //BA.debugLineNum = 492;BA.debugLine="nome.RunMethod(\"grPan:::\",Array(xpnl_CardHeader,M";
[self->__nome RunMethod:@"grPan:::" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((self->__xpnl_cardheader).object)],[B4I nilToNSNull:(NSObject*)(@(_minimumtouch))],[B4I nilToNSNull:(NSObject*)(@(_maximumtouch))]]]];
 //BA.debugLineNum = 493;BA.debugLine="If m_BodyDrag Then";
if (self->__m_bodydrag) { 
 //BA.debugLineNum = 494;BA.debugLine="mView2 = xpnl_CardBody";
self->__mview2 = (B4IViewWrapper*) [B4IObjectWrapper createWrapper:[B4IViewWrapper new] object:(UIView*)((self->__xpnl_cardbody).object)];
 //BA.debugLineNum = 495;BA.debugLine="nome.RunMethod(\"grPan:::\",Array(xpnl_CardBody,Min";
[self->__nome RunMethod:@"grPan:::" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((self->__xpnl_cardbody).object)],[B4I nilToNSNull:(NSObject*)(@(_minimumtouch))],[B4I nilToNSNull:(NSObject*)(@(_maximumtouch))]]]];
 };
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _base_resize:(double) _width :(double) _height{
float _tmp_left = 0.0f;
 //BA.debugLineNum = 137;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
 //BA.debugLineNum = 138;BA.debugLine="Dim tmp_left As Float = 0";
_tmp_left = (float) (0);
 //BA.debugLineNum = 139;BA.debugLine="If g_orientation = Orientation_MIDDLE Then";
if (self->__g_orientation==[self _orientation_middle]) { 
 //BA.debugLineNum = 140;BA.debugLine="tmp_left = Width/2 - g_width/2";
_tmp_left = (float) (_width/(double)2-self->__g_width/(double)2);
 }else if(self->__g_orientation==[self _orientation_right]) { 
 //BA.debugLineNum = 142;BA.debugLine="tmp_left = Width - g_width";
_tmp_left = (float) (_width-self->__g_width);
 };
 //BA.debugLineNum = 145;BA.debugLine="mDarkPanel.SetLayoutAnimated(0,0,0,Width,Height)";
[self->__mdarkpanel SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
 //BA.debugLineNum = 146;BA.debugLine="xpnl_CardBase.SetLayoutAnimated(0,tmp_left,Height";
[self->__xpnl_cardbase SetLayoutAnimated:(int) (0) :_tmp_left :(float) (_height+self->__g_first_height) :self->__g_width :self->__g_first_height];
 //BA.debugLineNum = 148;BA.debugLine="xpnl_CardHeader.SetLayoutAnimated(0,0,0,g_width,g";
[self->__xpnl_cardheader SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :self->__g_width :self->__g_header_height];
 //BA.debugLineNum = 150;BA.debugLine="xpnl_CardBody.SetLayoutAnimated(0,0,g_header_heig";
[self->__xpnl_cardbody SetLayoutAnimated:(int) (0) :(float) (0) :self->__g_header_height :self->__g_width :self->__g_first_height];
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 57;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 58;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
 //BA.debugLineNum = 59;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
 //BA.debugLineNum = 61;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
 //BA.debugLineNum = 62;BA.debugLine="Private mDarkPanel As B4XView";
self->__mdarkpanel = [B4XViewWrapper new];
 //BA.debugLineNum = 64;BA.debugLine="Private downy As Float";
self->__downy = 0.0f;
 //BA.debugLineNum = 65;BA.debugLine="Private old_top As Float";
self->__old_top = 0.0f;
 //BA.debugLineNum = 67;BA.debugLine="Private g_first_height,g_second_height,g_width,g_";
self->__g_first_height = 0.0f;
self->__g_second_height = 0.0f;
self->__g_width = 0.0f;
self->__g_header_height = 0.0f;
 //BA.debugLineNum = 68;BA.debugLine="Private g_orientation As Int";
self->__g_orientation = 0;
 //BA.debugLineNum = 70;BA.debugLine="Public g_show_duration As Int = 250";
self->__g_show_duration = (int) (250);
 //BA.debugLineNum = 71;BA.debugLine="Public g_hide_duration As Int = 700";
self->__g_hide_duration = (int) (700);
 //BA.debugLineNum = 72;BA.debugLine="Private g_darkpanel_alpha As Int = 165";
self->__g_darkpanel_alpha = (int) (165);
 //BA.debugLineNum = 73;BA.debugLine="Private g_IsDraggable As Boolean = True";
self->__g_isdraggable = true;
 //BA.debugLineNum = 74;BA.debugLine="Private mDarkPanelClickable As Boolean = True";
self->__mdarkpanelclickable = true;
 //BA.debugLineNum = 75;BA.debugLine="Private mUserCanClose As Boolean = True";
self->__musercanclose = true;
 //BA.debugLineNum = 78;BA.debugLine="Private m_BodyDrag As Boolean = False";
self->__m_bodydrag = false;
 //BA.debugLineNum = 79;BA.debugLine="Private expand_state As Int = 0";
self->__expand_state = (int) (0);
 //BA.debugLineNum = 81;BA.debugLine="Private disable_touch As Boolean = False";
self->__disable_touch = false;
 //BA.debugLineNum = 83;BA.debugLine="Private last_swipe2top As Boolean = False";
self->__last_swipe2top = false;
 //BA.debugLineNum = 84;BA.debugLine="Private inClosingProcess As Boolean = False";
self->__inclosingprocess = false;
 //BA.debugLineNum = 89;BA.debugLine="Private xpnl_CardBase As B4XView";
self->__xpnl_cardbase = [B4XViewWrapper new];
 //BA.debugLineNum = 90;BA.debugLine="Private xpnl_CardHeader As B4XView";
self->__xpnl_cardheader = [B4XViewWrapper new];
 //BA.debugLineNum = 91;BA.debugLine="Private xpnl_CardBody As B4XView";
self->__xpnl_cardbody = [B4XViewWrapper new];
 //BA.debugLineNum = 96;BA.debugLine="Private nome As NativeObject=Me";
self->__nome = [B4INativeObject new];
self->__nome = (B4INativeObject*) [B4IObjectWrapper createWrapper:[B4INativeObject new] object:(NSObject*)(self)];
 //BA.debugLineNum = 97;BA.debugLine="Private mView As View'ignore";
self->__mview = [B4IViewWrapper new];
 //BA.debugLineNum = 98;BA.debugLine="Private mView2 As View'ignore";
self->__mview2 = [B4IViewWrapper new];
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _create:(B4XViewWrapper*) _parent :(float) _first_height :(float) _second_height :(float) _header_height :(float) _width :(int) _orientation{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub Create (Parent As B4XView,first_height";
 //BA.debugLineNum = 110;BA.debugLine="g_first_height = first_height";
self->__g_first_height = _first_height;
 //BA.debugLineNum = 111;BA.debugLine="g_second_height = second_height";
self->__g_second_height = _second_height;
 //BA.debugLineNum = 112;BA.debugLine="g_width = width";
self->__g_width = _width;
 //BA.debugLineNum = 113;BA.debugLine="g_orientation = orientation";
self->__g_orientation = _orientation;
 //BA.debugLineNum = 114;BA.debugLine="g_header_height = header_height";
self->__g_header_height = _header_height;
 //BA.debugLineNum = 116;BA.debugLine="ini_views(Parent)";
[self _ini_views:_parent];
 //BA.debugLineNum = 127;BA.debugLine="AddPanGesture(1,2)";
[self _addpangesture:(int) (1) :(int) (2)];
 //BA.debugLineNum = 134;BA.debugLine="Base_Resize(Parent.Width,Parent.Height)";
[self _base_resize:[_parent Width] :[_parent Height]];
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _expandfull{
 //BA.debugLineNum = 382;BA.debugLine="Public Sub ExpandFull";
 //BA.debugLineNum = 383;BA.debugLine="expand_state = 2";
self->__expand_state = (int) (2);
 //BA.debugLineNum = 384;BA.debugLine="ShowIntern(True,True)";
[self _showintern:true :true];
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _expandhalf{
 //BA.debugLineNum = 387;BA.debugLine="Public Sub ExpandHalf";
 //BA.debugLineNum = 388;BA.debugLine="expand_state = 1";
self->__expand_state = (int) (1);
 //BA.debugLineNum = 389;BA.debugLine="ShowIntern(True,False)";
[self _showintern:true :false];
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _getbodydrag{
 //BA.debugLineNum = 459;BA.debugLine="Public Sub getBodyDrag As Boolean";
 //BA.debugLineNum = 460;BA.debugLine="Return m_BodyDrag";
if (true) return self->__m_bodydrag;
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return false;
}
- (B4XViewWrapper*)  _getbodypanel{
 //BA.debugLineNum = 401;BA.debugLine="Public Sub getBodyPanel As B4XView";
 //BA.debugLineNum = 402;BA.debugLine="Return xpnl_CardBody";
if (true) return self->__xpnl_cardbody;
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return nil;
}
- (B4XViewWrapper*)  _getcardbase{
 //BA.debugLineNum = 341;BA.debugLine="Public Sub getCardBase As B4XView";
 //BA.debugLineNum = 342;BA.debugLine="Return xpnl_CardBase";
if (true) return self->__xpnl_cardbase;
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return nil;
}
- (B4XViewWrapper*)  _getdarkpanel{
 //BA.debugLineNum = 337;BA.debugLine="Public Sub getDarkPanel As B4XView";
 //BA.debugLineNum = 338;BA.debugLine="Return mDarkPanel";
if (true) return self->__mdarkpanel;
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return nil;
}
- (int)  _getdarkpanelalpha{
 //BA.debugLineNum = 441;BA.debugLine="Public Sub getDarkPanelAlpha As Int";
 //BA.debugLineNum = 442;BA.debugLine="Return g_darkpanel_alpha";
if (true) return self->__g_darkpanel_alpha;
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return 0;
}
- (BOOL)  _getdarkpanelclickable{
 //BA.debugLineNum = 445;BA.debugLine="Public Sub getDarkPanelClickable As Boolean";
 //BA.debugLineNum = 446;BA.debugLine="Return mDarkPanelClickable";
if (true) return self->__mdarkpanelclickable;
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return false;
}
- (float)  _getfirstheight{
 //BA.debugLineNum = 345;BA.debugLine="Public Sub getFirstHeight As Float";
 //BA.debugLineNum = 346;BA.debugLine="Return g_first_height";
if (true) return self->__g_first_height;
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return 0.0f;
}
- (float)  _getheaderheight{
 //BA.debugLineNum = 369;BA.debugLine="Public Sub getHeaderHeight As Float";
 //BA.debugLineNum = 370;BA.debugLine="Return g_header_height";
if (true) return self->__g_header_height;
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return 0.0f;
}
- (B4XViewWrapper*)  _getheaderpanel{
 //BA.debugLineNum = 392;BA.debugLine="Public Sub getHeaderPanel As B4XView";
 //BA.debugLineNum = 393;BA.debugLine="Return xpnl_CardHeader";
if (true) return self->__xpnl_cardheader;
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return nil;
}
- (BOOL)  _getisdraggable{
 //BA.debugLineNum = 437;BA.debugLine="Public Sub getIsDraggable As Boolean";
 //BA.debugLineNum = 438;BA.debugLine="Return g_IsDraggable";
if (true) return self->__g_isdraggable;
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return false;
}
- (BOOL)  _getisopen{
 //BA.debugLineNum = 421;BA.debugLine="Public Sub getIsOpen As Boolean";
 //BA.debugLineNum = 422;BA.debugLine="If expand_state = 0 Then Return False Else Return";
if (self->__expand_state==0) { 
if (true) return false;}
else {
if (true) return true;};
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return false;
}
- (BOOL)  _getisopenfull{
 //BA.debugLineNum = 429;BA.debugLine="Public Sub getIsOpenFull As Boolean";
 //BA.debugLineNum = 430;BA.debugLine="If expand_state = 2 Then Return True Else Return";
if (self->__expand_state==2) { 
if (true) return true;}
else {
if (true) return false;};
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return false;
}
- (BOOL)  _getisopenhalf{
 //BA.debugLineNum = 425;BA.debugLine="Public Sub getIsOpenHalf As Boolean";
 //BA.debugLineNum = 426;BA.debugLine="If expand_state = 1 Then Return True Else Return";
if (self->__expand_state==1) { 
if (true) return true;}
else {
if (true) return false;};
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return false;
}
- (float)  _getsecondheight{
 //BA.debugLineNum = 357;BA.debugLine="Public Sub getSecondHeight As Float";
 //BA.debugLineNum = 358;BA.debugLine="Return g_second_height";
if (true) return self->__g_second_height;
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return 0.0f;
}
- (BOOL)  _getusercanclose{
 //BA.debugLineNum = 329;BA.debugLine="Public Sub getUserCanClose As Boolean";
 //BA.debugLineNum = 330;BA.debugLine="Return mUserCanClose";
if (true) return self->__musercanclose;
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return false;
}
- (BOOL)  _handletouch:(int) _action :(float) _y{
 //BA.debugLineNum = 282;BA.debugLine="Private Sub HandleTouch(Action As Int,y As Float)";
 //BA.debugLineNum = 283;BA.debugLine="If g_IsDraggable = False Or disable_touch = True";
if (self->__g_isdraggable==false || self->__disable_touch==true) { 
if (true) return false;};
 //BA.debugLineNum = 284;BA.debugLine="If Action = xpnl_CardBase.TOUCH_ACTION_DOWN Then";
if (_action==[self->__xpnl_cardbase TOUCH_ACTION_DOWN]) { 
 //BA.debugLineNum = 285;BA.debugLine="downy  = y";
self->__downy = _y;
 };
 //BA.debugLineNum = 288;BA.debugLine="VisibleBodyHeightChanged";
[self _visiblebodyheightchanged];
 //BA.debugLineNum = 290;BA.debugLine="If Action = xpnl_CardBase.TOUCH_ACTION_DOWN Then";
if (_action==[self->__xpnl_cardbase TOUCH_ACTION_DOWN]) { 
 //BA.debugLineNum = 292;BA.debugLine="old_top = xpnl_CardBase.Top";
self->__old_top = [self->__xpnl_cardbase Top];
 }else if(_action==[self->__xpnl_cardbase TOUCH_ACTION_MOVE]) { 
 //BA.debugLineNum = 295;BA.debugLine="If y < downy Then";
if (_y<self->__downy) { 
 //BA.debugLineNum = 296;BA.debugLine="last_swipe2top = True";
self->__last_swipe2top = true;
 }else {
 //BA.debugLineNum = 298;BA.debugLine="last_swipe2top = False";
self->__last_swipe2top = false;
 };
 //BA.debugLineNum = 301;BA.debugLine="If mUserCanClose = True Then";
if (self->__musercanclose==true) { 
 //BA.debugLineNum = 302;BA.debugLine="xpnl_CardBase.Top = Max(mDarkPanel.Height - g_s";
[self->__xpnl_cardbase setTop:(float) (fmax([self->__mdarkpanel Height]-self->__g_second_height-self->__g_header_height,[self->__xpnl_cardbase Top]+_y-self->__downy))];
 }else {
 //BA.debugLineNum = 304;BA.debugLine="xpnl_CardBase.Top = Min(mDarkPanel.Height - g_f";
[self->__xpnl_cardbase setTop:(float) (fmin([self->__mdarkpanel Height]-self->__g_first_height-self->__g_header_height,fmax([self->__mdarkpanel Height]-self->__g_second_height-self->__g_header_height,[self->__xpnl_cardbase Top]+_y-self->__downy)))];
 };
 //BA.debugLineNum = 307;BA.debugLine="If xpnl_CardBase.Top < (mDarkPanel.Height - g_fi";
if ([self->__xpnl_cardbase Top]<([self->__mdarkpanel Height]-self->__g_first_height)) { 
 //BA.debugLineNum = 308;BA.debugLine="expand_state = 2";
self->__expand_state = (int) (2);
 //BA.debugLineNum = 309;BA.debugLine="xpnl_CardBody.Height = g_second_height";
[self->__xpnl_cardbody setHeight:self->__g_second_height];
 //BA.debugLineNum = 310;BA.debugLine="xpnl_CardBase.Height = g_second_height + g_head";
[self->__xpnl_cardbase setHeight:(float) (self->__g_second_height+self->__g_header_height)];
 }else {
 //BA.debugLineNum = 313;BA.debugLine="expand_state = 1";
self->__expand_state = (int) (1);
 };
 //BA.debugLineNum = 315;BA.debugLine="VisibleBodyHeightChanged";
[self _visiblebodyheightchanged];
 }else if(_action==[self->__xpnl_cardbase TOUCH_ACTION_UP]) { 
 //BA.debugLineNum = 317;BA.debugLine="If expand_state = 1 And old_top < xpnl_CardBase.";
if (self->__expand_state==1 && self->__old_top<[self->__xpnl_cardbase Top] && self->__last_swipe2top==false && self->__musercanclose==true) { 
 //BA.debugLineNum = 318;BA.debugLine="Hide(False)";
[self _hide:false];
 }else if(self->__expand_state==2 && self->__old_top<[self->__xpnl_cardbase Top]) { 
 //BA.debugLineNum = 320;BA.debugLine="expand_state = 1";
self->__expand_state = (int) (1);
 //BA.debugLineNum = 321;BA.debugLine="ShowIntern(True,True)";
[self _showintern:true :true];
 }else {
 //BA.debugLineNum = 323;BA.debugLine="ShowIntern(True,True)";
[self _showintern:true :true];
 };
 };
 //BA.debugLineNum = 326;BA.debugLine="Return True";
if (true) return true;
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return false;
}
- (void)  _hide:(BOOL) _ignore_event{
ResumableSub_asdraggablebottomcard_Hide* rsub = [[ResumableSub_asdraggablebottomcard_Hide alloc] init:self : _ignore_event];
[rsub resume:self.bi :nil];
}
//-1866328669
- (NSString*)  _ini_views:(B4XViewWrapper*) _parent{
 //BA.debugLineNum = 176;BA.debugLine="Private Sub ini_views(Parent As B4XView)";
 //BA.debugLineNum = 177;BA.debugLine="xpnl_CardBase = xui.CreatePanel(\"xpnl_CardBase\")";
self->__xpnl_cardbase = [self->__xui CreatePanel:self.bi :@"xpnl_CardBase"];
 //BA.debugLineNum = 178;BA.debugLine="xpnl_CardHeader = xui.CreatePanel(\"xpnl_header\")";
self->__xpnl_cardheader = [self->__xui CreatePanel:self.bi :@"xpnl_header"];
 //BA.debugLineNum = 179;BA.debugLine="xpnl_CardBody = xui.CreatePanel(\"\")";
self->__xpnl_cardbody = [self->__xui CreatePanel:self.bi :@""];
 //BA.debugLineNum = 180;BA.debugLine="mDarkPanel = xui.CreatePanel(\"mDarkPanel\")";
self->__mdarkpanel = [self->__xui CreatePanel:self.bi :@"mDarkPanel"];
 //BA.debugLineNum = 181;BA.debugLine="Parent.AddView(mDarkPanel,0,0,0,0)";
[_parent AddView:(UIView*)((self->__mdarkpanel).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
 //BA.debugLineNum = 182;BA.debugLine="Parent.AddView(xpnl_CardBase,0,0,0,0)";
[_parent AddView:(UIView*)((self->__xpnl_cardbase).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
 //BA.debugLineNum = 183;BA.debugLine="xpnl_CardBase.AddView(xpnl_CardHeader,0,0,0,0)";
[self->__xpnl_cardbase AddView:(UIView*)((self->__xpnl_cardheader).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
 //BA.debugLineNum = 184;BA.debugLine="xpnl_CardBase.AddView(xpnl_CardBody,0,0,0,0)";
[self->__xpnl_cardbase AddView:(UIView*)((self->__xpnl_cardbody).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
 //BA.debugLineNum = 186;BA.debugLine="mDarkPanel.Color = xui.Color_ARGB(g_darkpanel_alp";
[self->__mdarkpanel setColor:[self->__xui Color_ARGB:self->__g_darkpanel_alpha :(int) (0) :(int) (0) :(int) (0)]];
 //BA.debugLineNum = 187;BA.debugLine="mDarkPanel.Visible = False";
[self->__mdarkpanel setVisible:false];
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
[self initializeClassModule];
 //BA.debugLineNum = 102;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 103;BA.debugLine="mEventName = EventName";
self->__meventname = _eventname;
 //BA.debugLineNum = 104;BA.debugLine="mCallBack = Callback";
self->__mcallback = _callback;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mdarkpanel_click{
 //BA.debugLineNum = 481;BA.debugLine="Private Sub mDarkPanel_Click";
 //BA.debugLineNum = 482;BA.debugLine="If mDarkPanelClickable = False Then Return";
if (self->__mdarkpanelclickable==false) { 
if (true) return @"";};
 //BA.debugLineNum = 483;BA.debugLine="mDarkPanel.Enabled = False";
[self->__mdarkpanel setEnabled:false];
 //BA.debugLineNum = 484;BA.debugLine="Hide(False)";
[self _hide:false];
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return @"";
}
- (int)  _orientation_left{
 //BA.debugLineNum = 409;BA.debugLine="Public Sub Orientation_LEFT As Int";
 //BA.debugLineNum = 410;BA.debugLine="Return 0";
if (true) return (int) (0);
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return 0;
}
- (int)  _orientation_middle{
 //BA.debugLineNum = 413;BA.debugLine="Public Sub Orientation_MIDDLE As Int";
 //BA.debugLineNum = 414;BA.debugLine="Return 1";
if (true) return (int) (1);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return 0;
}
- (int)  _orientation_right{
 //BA.debugLineNum = 417;BA.debugLine="Public Sub Orientation_RIGHT As Int";
 //BA.debugLineNum = 418;BA.debugLine="Return 2";
if (true) return (int) (2);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _setbodydrag:(BOOL) _enabled{
 //BA.debugLineNum = 463;BA.debugLine="Public Sub setBodyDrag(Enabled As Boolean)";
 //BA.debugLineNum = 464;BA.debugLine="m_BodyDrag = Enabled";
self->__m_bodydrag = _enabled;
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setbodypanel:(B4XViewWrapper*) _bodypanel{
 //BA.debugLineNum = 405;BA.debugLine="Public Sub setBodyPanel(BodyPanel As B4XView)";
 //BA.debugLineNum = 406;BA.debugLine="xpnl_CardBody = BodyPanel";
self->__xpnl_cardbody = _bodypanel;
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setcircleclip:(B4XViewWrapper*) _pnl :(int) _radius{
 //BA.debugLineNum = 157;BA.debugLine="Private Sub SetCircleClip (pnl As B4XView,radius A";
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setcornerradius_header:(float) _radius{
 //BA.debugLineNum = 374;BA.debugLine="Public Sub setCornerRadius_Header(radius As Float)";
 //BA.debugLineNum = 376;BA.debugLine="xpnl_CardHeader.Height = g_header_height * 2";
[self->__xpnl_cardheader setHeight:(float) (self->__g_header_height*2)];
 //BA.debugLineNum = 378;BA.debugLine="xpnl_CardHeader.SetColorAndBorder(xpnl_CardHeader";
[self->__xpnl_cardheader SetColorAndBorder:[self->__xpnl_cardheader Color] :(float) (0) :(int) (0) :_radius];
 //BA.debugLineNum = 379;BA.debugLine="SetCircleClip(xpnl_CardHeader,radius)";
[self _setcircleclip:self->__xpnl_cardheader :(int) (_radius)];
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setdarkpanelalpha:(int) _alpha{
 //BA.debugLineNum = 453;BA.debugLine="Public Sub setDarkPanelAlpha(alpha As Int)";
 //BA.debugLineNum = 454;BA.debugLine="If alpha >= 0 And alpha <=255 Then";
if (_alpha>=0 && _alpha<=255) { 
 //BA.debugLineNum = 455;BA.debugLine="g_darkpanel_alpha = alpha";
self->__g_darkpanel_alpha = _alpha;
 };
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setdarkpanelclickable:(BOOL) _clickable{
 //BA.debugLineNum = 449;BA.debugLine="Public Sub setDarkPanelClickable(Clickable As Bool";
 //BA.debugLineNum = 450;BA.debugLine="mDarkPanelClickable = Clickable";
self->__mdarkpanelclickable = _clickable;
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setfirstheight:(float) _height{
 //BA.debugLineNum = 350;BA.debugLine="Public Sub setFirstHeight(height As Float)";
 //BA.debugLineNum = 351;BA.debugLine="g_first_height = height";
self->__g_first_height = _height;
 //BA.debugLineNum = 352;BA.debugLine="If expand_state = 1 Then";
if (self->__expand_state==1) { 
 //BA.debugLineNum = 353;BA.debugLine="ExpandHalf";
[self _expandhalf];
 };
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setheaderpanel:(B4XViewWrapper*) _headerpanel{
 //BA.debugLineNum = 396;BA.debugLine="Public Sub setHeaderPanel(HeaderPanel As B4XView)";
 //BA.debugLineNum = 397;BA.debugLine="xpnl_CardHeader = HeaderPanel";
self->__xpnl_cardheader = _headerpanel;
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setisdraggable:(BOOL) _draggable{
 //BA.debugLineNum = 433;BA.debugLine="Public Sub setIsDraggable(draggable As Boolean)";
 //BA.debugLineNum = 434;BA.debugLine="g_IsDraggable = draggable";
self->__g_isdraggable = _draggable;
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setsecondheight:(float) _height{
 //BA.debugLineNum = 362;BA.debugLine="Public Sub setSecondHeight(height As Float)";
 //BA.debugLineNum = 363;BA.debugLine="g_second_height = height";
self->__g_second_height = _height;
 //BA.debugLineNum = 364;BA.debugLine="If expand_state = 2 Then";
if (self->__expand_state==2) { 
 //BA.debugLineNum = 365;BA.debugLine="ExpandFull";
[self _expandfull];
 };
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setusercanclose:(BOOL) _canclose{
 //BA.debugLineNum = 333;BA.debugLine="Public Sub setUserCanClose(CanClose As Boolean)";
 //BA.debugLineNum = 334;BA.debugLine="mUserCanClose = CanClose";
self->__musercanclose = _canclose;
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _show:(BOOL) _ignore_event{
 //BA.debugLineNum = 190;BA.debugLine="Public Sub Show(ignore_event As Boolean)";
 //BA.debugLineNum = 191;BA.debugLine="ShowIntern(ignore_event,False)";
[self _showintern:_ignore_event :false];
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return @"";
}
- (void)  _showintern:(BOOL) _ignore_event :(BOOL) _fromtouch{
ResumableSub_asdraggablebottomcard_ShowIntern* rsub = [[ResumableSub_asdraggablebottomcard_ShowIntern alloc] init:self : _ignore_event: _fromtouch];
[rsub resume:self.bi :nil];
}
//-783238131
- (NSString*)  _uigesture_pan:(int) _state :(float) _x :(float) _y :(NSObject*) _obj{
 //BA.debugLineNum = 263;BA.debugLine="Private Sub uigesture_pan(state As Int,x As Float,";
 //BA.debugLineNum = 264;BA.debugLine="Select state";
switch (_state) {
case 1: {
 //BA.debugLineNum = 266;BA.debugLine="HandleTouch(xpnl_CardBase.TOUCH_ACTION_DOWN,y)";
[self _handletouch:[self->__xpnl_cardbase TOUCH_ACTION_DOWN] :_y];
 break; }
case 2: {
 //BA.debugLineNum = 268;BA.debugLine="HandleTouch(xpnl_CardBase.TOUCH_ACTION_MOVE,y)";
[self _handletouch:[self->__xpnl_cardbase TOUCH_ACTION_MOVE] :_y];
 break; }
case 3: {
 //BA.debugLineNum = 270;BA.debugLine="HandleTouch(xpnl_CardBase.TOUCH_ACTION_UP,y)";
[self _handletouch:[self->__xpnl_cardbase TOUCH_ACTION_UP] :_y];
 break; }
}
;
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _visiblebodyheightchanged{
 //BA.debugLineNum = 467;BA.debugLine="Private Sub VisibleBodyHeightChanged";
 //BA.debugLineNum = 468;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Visible";
if ([self->__xui SubExists:self->__mcallback :[@[self->__meventname,@"_VisibleBodyHeightChanged"] componentsJoinedByString:@""] :(int) (1)]) { 
 //BA.debugLineNum = 469;BA.debugLine="CallSub2(mCallBack,mEventName & \"_VisibleBodyHei";
[self->___c CallSub2:self.bi :self->__mcallback :[@[self->__meventname,@"_VisibleBodyHeightChanged"] componentsJoinedByString:@""] :(NSObject*)(@([self->__xpnl_cardbody Height]))];
 };
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return @"";
}

/////////// PAN ///////////

-(void)grPan :(UIView*)v :(int)mintouch :(int)maxtouch
{
UIPanGestureRecognizer *pan = [[UIPanGestureRecognizer alloc] initWithTarget:self  action:@selector(handlePan:)];
 
 [pan setMaximumNumberOfTouches:maxtouch];
 [pan setMinimumNumberOfTouches:mintouch];
pan.delegate=self;
 [v addGestureRecognizer:pan];

}

- (void)handlePan:(UIPanGestureRecognizer *)gestureRecognizer {  

	int st =gestureRecognizer.state;
float x= [gestureRecognizer locationInView:(self._mview).object].x;
float y= [gestureRecognizer locationInView:(self._mview).object].y;

    [self.bi raiseEvent:nil event:@"uigesture_pan::::" params:@[@((int)st),@((float)x),@((float)y),(gestureRecognizer)]];

  }  

-(void)grPan2 :(UIView*)v :(int)mintouch :(int)maxtouch
{
UIPanGestureRecognizer *pan = [[UIPanGestureRecognizer alloc] initWithTarget:self  action:@selector(handlePan:)];
 
 [pan setMaximumNumberOfTouches:maxtouch];
 [pan setMinimumNumberOfTouches:mintouch];
pan.delegate=self;
 [v addGestureRecognizer:pan];

}

- (void)handlePan2:(UIPanGestureRecognizer *)gestureRecognizer {  

	int st =gestureRecognizer.state;
float x= [gestureRecognizer locationInView:(self._mview2).object].x;
float y= [gestureRecognizer locationInView:(self._mview2).object].y;

    [self.bi raiseEvent:nil event:@"uigesture_pan::::" params:@[@((int)st),@((float)x),@((float)y),(gestureRecognizer)]];

  }  

@end
