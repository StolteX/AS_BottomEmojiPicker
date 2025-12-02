
#import "b4i_b4xcomparatorsort.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_as_bottomemojipicker.h"
#import "b4i_asdraggablebottomcard.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcache.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xcomparatorsort 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xcomparatorsort) instance released.");
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(B4I*) _ba{
[self initializeClassModule];
 //BA.debugLineNum = 4;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _sort:(B4IList*) _data :(NSObject*) _comparator{
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Sort (Data As List, Comparator As Objec";
 //BA.debugLineNum = 16;BA.debugLine="Me.As(NativeObject).RunMethod(\"_sort2::\", Array(D";
[((B4INativeObject*) [B4IObjectWrapper createWrapper:[B4INativeObject new] object:(NSObject*)(self)]) RunMethod:@"_sort2::" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((_data).object)],[B4I nilToNSNull:_comparator]]]];
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _sort2:(NSArray*) _d :(NSObject*) _comparator{
B4IList* _data = [B4IList new];
_data.object = _d;
[self _quicksort:_data :(int) (0) :[_data Size] :_comparator];
return @"";
}
- (NSString*)  _quicksort:(B4IList*) _data :(int) _startindex :(int) _length :(NSObject*) _comparator{
int _pivotindex = 0;
int _r = 0;
if (_length>1) { 
_pivotindex = [self->___c Rnd:(int) (0) :_length];
_r = [self _partition:_data :_startindex :_length :_pivotindex :_comparator];
[self _quicksort:_data :_startindex :_r :_comparator];
[self _quicksort:_data :(int) (_startindex+_r+1) :(int) (_length-_r-1) :_comparator];
 };
return @"";
}

- (int)  _partition:(B4IList*) _data :(int) _startindex :(int) _length :(int) _pivotindex :(NSObject*) _comparator{
	NSObject* _pivotvalue =[_data Get:(int) (_startindex+_pivotindex)];
	int _l = 0;
	int _i = 0;
	[_data.object exchangeObjectAtIndex:_startindex + _pivotindex  withObjectAtIndex:_startindex + _length - 1];
	{
		const int limit4 = (int) (_length-2);
		_i = (int) (0) ;
		for (;_i <= limit4 ;_i = _i + 1 ) {
			NSObject* o1 = [_data Get:(int) (_startindex+_i)];
			if ([self compare:o1 :_pivotvalue :_comparator] < 0) {
				_l = _l+1;
				[_data.object exchangeObjectAtIndex:_startindex + _l-1  withObjectAtIndex:_startindex + _i];
		 	};
		 }
	};
	[_data.object exchangeObjectAtIndex:_startindex + _length-1  withObjectAtIndex:_startindex +_l];
	return _l;
}

- (int) compare:(NSObject*) o1 :(NSObject*) o2 :(id) comparator {
	return [comparator _compare:o1 :o2];
}
- (int) _compare:(NSObject*) o1 :(NSObject*) o2 {
return 0;
}
@end
