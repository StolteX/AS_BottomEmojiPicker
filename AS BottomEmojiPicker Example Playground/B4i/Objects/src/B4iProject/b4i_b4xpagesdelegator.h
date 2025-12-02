#import "iCore.h"
#import "iJSON.h"
#import "xCustomListView.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class b4i_b4xmainpage;
@class b4i_as_bottomemojipicker;
@class b4i_asdraggablebottomcard;
@class b4i_b4xbitset;
@class b4i_b4xbytesbuilder;
@class _b4xcacheitem;
@class b4i_b4xcache;
@class b4i_b4xcomparatorsort;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xpagesdelegator : B4IClass
{
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _activity_pause;
- (NSString*)  _activity_resume;
- (NSString*)  _class_globals;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _initialize:(B4I*) _ba;
- (NSString*)  _mainform_resize:(double) _width :(double) _height;
@end
