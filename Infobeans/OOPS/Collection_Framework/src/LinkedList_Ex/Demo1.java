package LinkedList_Ex;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Demo1 {
public static void main(String[] args) {
	LinkedList<String> l = new LinkedList<String>();
	
	l.add("abc");
	l.add("xyz");
	l.add("www");
	System.out.println(l);
	System.out.println(l instanceof Cloneable);
	System.out.println(l instanceof Serializable);
	System.out.println(l instanceof RandomAccess);
	
}
}
