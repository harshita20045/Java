package Feb3;

import java.util.ArrayList;

public class Ex3_ArrayListConstructor {
public static void main(String[] args) {
	//1.
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	
	System.out.println(a1);
	//2.
	ArrayList<Integer> a2=new ArrayList<Integer>(100);
	a2.add(10);
	a2.add(20);
	a2.add(30);
	System.out.println(a2);
	
	//3.  ArrayList<Integer> a3=new ArrayList<Integer>(Collection c);
	ArrayList<Integer> a3=new ArrayList<Integer>(a2);        
	
	System.out.println(a3);

	//3.ArrayList<Integer> a1=new ArrayList<Integer>();
}
}
