package Map1;

import java.util.HashMap;
import java.util.Map;

public class Ex {
public static void main(String[] args) {
	Map<Integer,String> hashMap=new HashMap<>();
	hashMap.put(101, "John");
	hashMap.put(103, "John");
	hashMap.put(102, "Jhonny");
	hashMap.put(null, null);
	
	System.out.println(hashMap);
	System.out.println("Does Map contain 101 :"+hashMap.containsKey(101));
	System.out.println("Does Map contain Bob :"+hashMap.containsValue("Bob"));
	System.out.println();
}
}
