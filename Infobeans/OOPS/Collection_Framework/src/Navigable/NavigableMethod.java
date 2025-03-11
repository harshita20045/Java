package Navigable;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMethod {
public static void main(String[] args) {
	NavigableMap<String,String> original = new TreeMap<>();
	original.put("1", "1");
	original.put("2", "2");
	original.put("3", "3");
	original.put("4", "4");
	original.put("5", "5");

	//this submap1 will contain "3", "3"
	SortedMap    submap1  = original.subMap("2", "4");
	System.out.println(original);
	

	//this submap2 will contain ("2", "2") ("3", "3") and ("4", "4") because
//	    fromInclusive=true, and toInclusive=true
	NavigableMap submap2 = original.subMap("2", true, "4", true);
	System.out.println(submap2);
	
	//ceilingKey will be "2".
	Object ceilingKey = original.ceilingKey("2");
	System.out.println(ceilingKey);
	
	//floorKey will be "2".
	Object floorKey = original.floorKey("2");
	System.out.println(floorKey);
	

	//higherKey will be "3".
	Object higherKey = original.higherKey("2");
	System.out.println(higherKey);
	
	//lowerKey will be "1"
	Object lowerKey = original.lowerKey("2");
	System.out.println(lowerKey);
	

	//ceilingEntry will be ("3", "3").
	Map.Entry ceilingEntry = original.ceilingEntry("4");
	System.out.println(ceilingEntry);
	
	//higherEntry will be ("4", "4").
	Map.Entry higherEntry = original.higherEntry("4");
	System.out.println(higherEntry);
	
	//lowerEntry will be ("1", "1")
	Map.Entry lowerEntry = original.lowerEntry("1");
	System.out.println(lowerEntry);
	
	//first is ("1", "1")
	Map.Entry first = original.pollFirstEntry();
	System.out.println(first);
	
	//last is ("5", "5")
	Map.Entry last = original.pollLastEntry();
	System.out.println(last);
}
}
