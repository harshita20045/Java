package Map1;

import java.util.Map;
import java.util.TreeMap;

public class Ex3 {
public static void main(String[] args) {
	TreeMap<String,String> tm=new TreeMap<>();
	tm.put("b","PINK");
	tm.put("a","RED");
	tm.put("d","BLACK");
	tm.put("c","WHITE");
	tm.put("e","ORANGE");
	tm.put("f","YELLOW");
	for(Map.Entry<String, String> x:tm.entrySet()) 
	{
		System.err.println("Keys: "+x.getKey()+"   Values: "+x.getValue());
		System.out.println("Keys: "+x.getKey()+"   Values: "+x.getValue());
	}
}
}
