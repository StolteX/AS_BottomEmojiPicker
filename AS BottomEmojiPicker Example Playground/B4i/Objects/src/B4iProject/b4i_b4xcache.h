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
@class b4i_b4xcomparatorsort;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xcache : B4IClass
{
@public b4i_b4xorderedmap* __data;
@public int __mmaxsize;
@public float __removethreshold;
@public int __eternalcounts;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _class_globals;
@property (nonatomic)b4i_b4xorderedmap* _data;
@property (nonatomic)int _mmaxsize;
@property (nonatomic)float _removethreshold;
@property (nonatomic)int _eternalcounts;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (BOOL)  _containskey:(NSString*) _key;
- (_b4xcacheitem*)  _createb4xcacheitem:(NSObject*) _value :(NSString*) _key;
- (NSObject*)  _get:(NSString*) _key;
- (int)  _getmaxsize;
- (NSString*)  _initialize:(B4I*) _ba;
- (BOOL)  _iseternal:(NSString*) _key;
- (B4IList*)  _keys;
- (NSObject*)  _put:(NSString*) _key :(NSObject*) _value;
- (NSObject*)  _puteternal:(NSString*) _key :(NSObject*) _value;
- (NSString*)  _remove:(NSString*) _key;
- (NSString*)  _removeolditems:(long long) _agems;
- (NSString*)  _setmaxsize:(int) _s;
- (int)  _size;
- (NSString*)  _trimifoversize;
@end
@interface _b4xcacheitem:NSObject
{
@public BOOL _IsInitialized;
@public NSObject* _Value;
@public long long _LastAccessedTime;
@public NSString* _Key;
@public BOOL _Eternal;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)NSObject* Value;
@property (nonatomic)long long LastAccessedTime;
@property (nonatomic)NSString* Key;
@property (nonatomic)BOOL Eternal;
-(void)Initialize;
@end
