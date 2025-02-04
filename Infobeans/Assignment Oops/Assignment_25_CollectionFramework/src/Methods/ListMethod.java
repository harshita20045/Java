package Methods;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<Integer>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	System.out.println(l1);
	System.out.println();
	List<Integer> l2=new ArrayList<Integer>();
	l2.add(100);
	l2.add(200);
	l2.add(300);
	l2.add(500);
	System.out.println(l2);
	System.out.println();
	l2.add(3,400);
	
	
	System.out.println("1. add(index ,object) : ");
	System.out.println(l2);
	System.out.println();
	
	
	System.out.println("2. addAll(index ,collection) : "+ l2.addAll(2, l1));
	System.out.println(l2);
	System.out.println();
	
	
	System.out.println("3. remove(index) : "+ l2.remove(2));
	System.out.println(l2);
	System.out.println();
	
	
	System.out.println("4. get(index) : "+ l2.get(2));
	System.out.println(l2);
	System.out.println();
	
	
	System.out.println("5. set(index) : "+ l2.set(1, 100));
	System.out.println(l2);
	System.out.println();
	
	
	System.out.println("6. indexOf(object) : "+ l2.indexOf(100));
	System.out.println(l2);
	System.out.println();
	
	
	System.out.println("7. lastindexOf(object) : "+ l2.lastIndexOf(100));
	System.out.println(l2);
	System.out.println();
	System.out.println("6. indexOf(object) : "+ l2.indexOf(101));
	System.out.println(l2);
	System.out.println();
	
}
}
