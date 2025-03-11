package Collection12;

import java.util.HashMap;
import java.util.Map;


public class Student {
public static void main(String[] args) {
	HashMap<String, Integer> h=new HashMap<>();
	h.put("abc", 567);
	h.put("acb", 576);
	h.put("bac", 657);
	h.put("bca", 675);
	h.put("cab", 756);
	h.put("cba", 765);
	
	
	
	for (Map.Entry<String, Integer> i : h.entrySet()) {
		System.out.print(i.getKey());
		System.out.println(" "+i.getValue());
		
	}
	
} 
}
