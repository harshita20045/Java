package Methods;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod {
	
public static void main(String[] args) {
	Collection<Integer> c1 =new ArrayList<Integer>();
	System.out.println("1.  add() : ");
	c1.add(10);
	c1.add(20);
	c1.add(30);
	c1.add(40);
	c1.add(50);
	System.out.println("c1 : ");
	System.out.println(c1);
	System.out.println();
	Collection<Integer> c2 =new ArrayList<Integer>();
	System.out.println("2. addAll() in c2: "+c2.addAll(c1));
	System.out.println(c1);
	System.out.println();
	
	System.out.println("3. remove(object) 10: "+ c2.remove(10));

	System.out.println(c2);
	System.out.println();
	
	System.out.println("4. removeAll(object) : "+ c1.removeAll(c2));
	System.out.println(c1);
	System.out.println();
	
	c1.add(20);
	c1.add(30);
	c1.add(40);
	c1.add(50);
	System.out.println();
	
	
	System.out.println("Again : ");
	System.out.println("c1 : ");
	System.out.println(c1);
	System.out.println();
	System.out.println("c2 : ");
	System.out.println(c2);
	
	System.out.println();
	
	
	System.out.println("5. retainAll(object) : "+ c2.retainAll(c1));
	System.out.println(c1);
	System.out.println(c2);
	System.out.println();
	
	
	System.out.println("6. clear() : ");
	c2.clear();
	System.out.print("c2 : " );
	System.out.println(c2);
	System.out.println();

	System.out.println("addAll() in c2: "+c2.addAll(c1));
	System.out.println(c1);
	System.out.println();

	System.out.println("7. c1.contains(20) : "+ c1.contains(20));
	System.out.println();
	
	System.out.println("8. c1.containsAll(c2) : "+ c1.containsAll(c2));
	System.out.println();
	
	System.out.println("9. c1.isEmpty()  : "+c1.isEmpty());
	System.out.println();
	
	System.out.println("10. c1.size() : "+c1.size());
	System.out.println();
	
	System.out.println("11. object[] toArray() : ");
	c1.toArray();
	for(Integer i : c1) {
		System.out.println(i);
	}
	
	System.out.println();
	System.out.println("12. hashCode() : "+c1.hashCode());
	System.out.println();
	
	System.out.println("13. boolean equals(Object element) : "+c1.equals(c2));
	System.out.println();
}
}
