package Feb3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class Demo {
public static void main(String[] args) {
	ArrayList<String> l = new ArrayList<String>();
	
	l.add("abc"); 
	l.add("xyz");
	l.add("www");
	System.out.println(l);
	System.out.println(l instanceof Cloneable);
	System.out.println(l instanceof Serializable);
	System.out.println(l instanceof RandomAccess);
	
}
}
