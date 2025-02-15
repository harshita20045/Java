package Collection7;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapFunctionsExample {
    public static void main(String[] args) {
        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("banana", 3);
        hashMap.put("apple", 2);
        hashMap.put("cherry", 5);
        
        System.out.println("HashMap:");
        System.out.println("Value for 'apple': " + hashMap.get("apple"));
        System.out.println("All keys: " + hashMap.keySet());
        System.out.println("Contains key 'banana'? " + hashMap.containsKey("banana"));
        System.out.println("Map size: " + hashMap.size());
        
        // TreeMap example
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("banana", 3);
        treeMap.put("apple", 2);
        treeMap.put("cherry", 5);
        
        System.out.println("\nTreeMap:");
        System.out.println("Sorted keys: " + treeMap.keySet());
        System.out.println("First (lowest) key: " + treeMap.firstKey());
        System.out.println("Last (highest) key: " + treeMap.lastKey());
        System.out.println("SubMap (apple to cherry): " + treeMap.subMap("apple", "cherry"));
    }
}