package Collection12;

import java.util.HashMap;
import java.util.Map;


public class Country {
public static void main(String[] args) {
	HashMap<String, String> h=new HashMap<>();
	h.put("India", "Delhi");
	h.put("Brazil", "Brazilia");
	h.put("America", "Delhi");
	h.put("Australia", "Delhi");
	
	for (Map.Entry<String, String> i : h.entrySet()) {
		System.out.print(i.getKey());
		System.out.println(" "+i.getValue());
		
	}
	
} 
}
