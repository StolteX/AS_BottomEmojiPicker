
#import "b4i_b4xcache.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_as_bottomemojipicker.h"
#import "b4i_asdraggablebottomcard.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xcomparatorsort.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"

@implementation _b4xcacheitem
-(void)Initialize{
self.IsInitialized = true;
self->_Value = [NSObject new];
self->_LastAccessedTime = 0L;
self->_Key = @"";
self->_Eternal = false;
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end

@implementation b4i_b4xcache 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xcache) instance released.");
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Type B4XCacheItem (Value As Object, LastAccessedT";
;
 //BA.debugLineNum = 3;BA.debugLine="Private Data As B4XOrderedMap";
self->__data = [b4i_b4xorderedmap new];
 //BA.debugLineNum = 4;BA.debugLine="Private mMaxSize As Int = 100";
self->__mmaxsize = (int) (100);
 //BA.debugLineNum = 5;BA.debugLine="Private RemoveThreshold As Float = 0.3";
self->__removethreshold = (float) (0.3);
 //BA.debugLineNum = 6;BA.debugLine="Private EternalCounts As Int";
self->__eternalcounts = 0;
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _containskey:(NSString*) _key{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
 //BA.debugLineNum = 67;BA.debugLine="Return Data.ContainsKey(Key)";
if (true) return [self->__data _containskey /*BOOL*/ :(NSObject*)(_key)];
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return false;
}
- (_b4xcacheitem*)  _createb4xcacheitem:(NSObject*) _value :(NSString*) _key{
_b4xcacheitem* _t1 = nil;
 //BA.debugLineNum = 102;BA.debugLine="Private Sub CreateB4XCacheItem (Value As Object, K";
 //BA.debugLineNum = 103;BA.debugLine="Dim t1 As B4XCacheItem";
_t1 = [_b4xcacheitem new];
 //BA.debugLineNum = 104;BA.debugLine="t1.Initialize";
[_t1 Initialize];
 //BA.debugLineNum = 105;BA.debugLine="t1.Value = Value";
_t1->_Value /*NSObject**/  = _value;
 //BA.debugLineNum = 106;BA.debugLine="t1.LastAccessedTime = DateTime.Now";
_t1->_LastAccessedTime /*long long*/  = [[self->___c DateTime] Now];
 //BA.debugLineNum = 107;BA.debugLine="t1.Key = Key";
_t1->_Key /*NSString**/  = _key;
 //BA.debugLineNum = 108;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _get:(NSString*) _key{
_b4xcacheitem* _ci = nil;
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Get (Key As String) As Object";
 //BA.debugLineNum = 25;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (_b4xcacheitem*)([self->__data _get /*NSObject**/ :(NSObject*)(_key)]);
 //BA.debugLineNum = 26;BA.debugLine="If ci <> Null Then";
if (_ci!= nil) { 
 //BA.debugLineNum = 27;BA.debugLine="If ci.Eternal = False Then ci.LastAccessedTime =";
if (_ci->_Eternal /*BOOL*/ ==false) { 
_ci->_LastAccessedTime /*long long*/  = [[self->___c DateTime] Now];};
 //BA.debugLineNum = 28;BA.debugLine="Return ci.Value";
if (true) return _ci->_Value /*NSObject**/ ;
 };
 //BA.debugLineNum = 30;BA.debugLine="Return Null";
if (true) return nil;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return nil;
}
- (int)  _getmaxsize{
 //BA.debugLineNum = 19;BA.debugLine="Public Sub getMaxSize As Int";
 //BA.debugLineNum = 20;BA.debugLine="Return mMaxSize";
if (true) return self->__mmaxsize;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(B4I*) _ba{
[self initializeClassModule];
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="Data.Initialize";
[self->__data _initialize /*NSString**/ :self.bi];
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _iseternal:(NSString*) _key{
_b4xcacheitem* _ci = nil;
 //BA.debugLineNum = 60;BA.debugLine="Private Sub IsEternal(Key As String) As Boolean";
 //BA.debugLineNum = 61;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (_b4xcacheitem*)([self->__data _get /*NSObject**/ :(NSObject*)(_key)]);
 //BA.debugLineNum = 62;BA.debugLine="Return IIf(ci = Null, False, ci.Eternal)";
if (true) return [self.bi ObjectToBoolean:((_ci== nil) ? ((NSObject*)(@(false))) : ((NSObject*)(@(_ci->_Eternal /*BOOL*/ ))))];
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return false;
}
- (B4IList*)  _keys{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub Keys As List";
 //BA.debugLineNum = 99;BA.debugLine="Return Data.Keys";
if (true) return [self->__data _getkeys /*B4IList**/ ];
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _put:(NSString*) _key :(NSObject*) _value{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub Put (Key As String, Value As Object) As";
 //BA.debugLineNum = 36;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if ([self _iseternal:_key]) { 
self->__eternalcounts = (int) (self->__eternalcounts-1);};
 //BA.debugLineNum = 37;BA.debugLine="Data.Put(Key, CreateB4XCacheItem(Value, Key))";
[self->__data _put /*NSString**/ :(NSObject*)(_key) :(NSObject*)([self _createb4xcacheitem:_value :_key])];
 //BA.debugLineNum = 38;BA.debugLine="TrimIfOversize";
[self _trimifoversize];
 //BA.debugLineNum = 39;BA.debugLine="Return Value";
if (true) return _value;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _puteternal:(NSString*) _key :(NSObject*) _value{
_b4xcacheitem* _ci = nil;
 //BA.debugLineNum = 44;BA.debugLine="Public Sub PutEternal (Key As String, Value As Obj";
 //BA.debugLineNum = 45;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if ([self _iseternal:_key]) { 
self->__eternalcounts = (int) (self->__eternalcounts-1);};
 //BA.debugLineNum = 46;BA.debugLine="Dim ci As B4XCacheItem = CreateB4XCacheItem(Value";
_ci = [self _createb4xcacheitem:_value :_key];
 //BA.debugLineNum = 47;BA.debugLine="ci.Eternal = True";
_ci->_Eternal /*BOOL*/  = true;
 //BA.debugLineNum = 48;BA.debugLine="ci.LastAccessedTime = 9223372036854775807";
_ci->_LastAccessedTime /*long long*/  = (long long) (9223372036854775807L);
 //BA.debugLineNum = 49;BA.debugLine="EternalCounts = EternalCounts + 1";
self->__eternalcounts = (int) (self->__eternalcounts+1);
 //BA.debugLineNum = 50;BA.debugLine="Data.Put(Key, ci)";
[self->__data _put /*NSString**/ :(NSObject*)(_key) :(NSObject*)(_ci)];
 //BA.debugLineNum = 51;BA.debugLine="Return Value";
if (true) return _value;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _remove:(NSString*) _key{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub Remove (Key As String)";
 //BA.debugLineNum = 56;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if ([self _iseternal:_key]) { 
self->__eternalcounts = (int) (self->__eternalcounts-1);};
 //BA.debugLineNum = 57;BA.debugLine="Data.Remove(Key)";
[self->__data _remove /*NSString**/ :(NSObject*)(_key)];
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _removeolditems:(long long) _agems{
B4IList* _values = nil;
long long _level = 0L;
_b4xcacheitem* _ci = nil;
 //BA.debugLineNum = 82;BA.debugLine="Public Sub RemoveOldItems (AgeMs As Long)";
 //BA.debugLineNum = 83;BA.debugLine="Dim values As List = Data.Values";
_values = [B4IList new];
_values = [self->__data _getvalues /*B4IList**/ ];
 //BA.debugLineNum = 84;BA.debugLine="Dim level As Long = DateTime.Now - AgeMs";
_level = (long long) ([[self->___c DateTime] Now]-_agems);
 //BA.debugLineNum = 85;BA.debugLine="For Each ci As B4XCacheItem In values";
{
const id<B4IIterable> group3 = _values;
const int groupLen3 = group3.Size
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_ci = (_b4xcacheitem*)([group3 Get:index3]);
 //BA.debugLineNum = 86;BA.debugLine="If ci.LastAccessedTime <= level Then";
if (_ci->_LastAccessedTime /*long long*/ <=_level) { 
 //BA.debugLineNum = 87;BA.debugLine="Data.Remove(ci.Key)";
[self->__data _remove /*NSString**/ :(NSObject*)(_ci->_Key /*NSString**/ )];
 };
 }
};
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setmaxsize:(int) _s{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub setMaxSize(s As Int)";
 //BA.debugLineNum = 15;BA.debugLine="mMaxSize = s";
self->__mmaxsize = _s;
 //BA.debugLineNum = 16;BA.debugLine="TrimIfOversize";
[self _trimifoversize];
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return @"";
}
- (int)  _size{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub Size As Int";
 //BA.debugLineNum = 94;BA.debugLine="Return Data.Size";
if (true) return [self->__data _getsize /*int*/ ];
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _trimifoversize{
B4IList* _values = nil;
int _numberofitemstoremove = 0;
int _i = 0;
 //BA.debugLineNum = 70;BA.debugLine="Private Sub TrimIfOversize";
 //BA.debugLineNum = 71;BA.debugLine="If Data.Size - EternalCounts > mMaxSize Then";
if ([self->__data _getsize /*int*/ ]-self->__eternalcounts>self->__mmaxsize) { 
 //BA.debugLineNum = 72;BA.debugLine="Dim values As List = Data.Values";
_values = [B4IList new];
_values = [self->__data _getvalues /*B4IList**/ ];
 //BA.debugLineNum = 73;BA.debugLine="values.SortType(\"LastAccessedTime\", True)";
[_values SortType:@"LastAccessedTime" :true];
 //BA.debugLineNum = 74;BA.debugLine="Dim NumberOfItemsToRemove As Int = Ceil(mMaxSize";
_numberofitemstoremove = (int) (ceil(self->__mmaxsize*self->__removethreshold));
 //BA.debugLineNum = 75;BA.debugLine="For i = 0 To NumberOfItemsToRemove";
{
const int step5 = 1;
const int limit5 = _numberofitemstoremove;
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 76;BA.debugLine="Data.Remove(values.Get(i).As(B4XCacheItem).Key)";
[self->__data _remove /*NSString**/ :(NSObject*)(((_b4xcacheitem*)([_values Get:_i]))->_Key /*NSString**/ )];
 }
};
 };
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return @"";
}
@end
