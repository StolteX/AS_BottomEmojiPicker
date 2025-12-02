#import "iCore.h"
#import "iJSON.h"
#import "xCustomListView.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class b4i_as_bottomemojipicker;
@class b4i_asdraggablebottomcard;
@class b4i_b4xbitset;
@class b4i_b4xbytesbuilder;
@class _b4xcacheitem;
@class b4i_b4xcache;
@class b4i_b4xcomparatorsort;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xmainpage : B4IClass
{
@public B4XViewWrapper* __root;
@public B4IXUI* __xui;
@public b4i_as_bottomemojipicker* __bottomemojipicker;
@public B4XViewWrapper* __xlbl_emojiresult;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _b4xpage_created:(B4XViewWrapper*) _root1;
- (NSString*)  _bottomemojipicker_emojiselected:(NSString*) _emoji;
- (NSString*)  _class_globals;
@property (nonatomic)B4XViewWrapper* _root;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)b4i_as_bottomemojipicker* _bottomemojipicker;
@property (nonatomic)B4XViewWrapper* _xlbl_emojiresult;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _initialize:(B4I*) _ba;
- (NSString*)  _opencustom;
- (NSString*)  _opendark;
- (NSString*)  _openlight;
- (NSString*)  _xlbl_opencustom_click;
- (NSString*)  _xlbl_opendark_click;
- (NSString*)  _xlbl_openlight_click;
@end
