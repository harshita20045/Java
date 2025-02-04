package Feb3;

import java.util.ArrayList;

public class Ex4_Func {
public static void main(String[] args) {
	
	ArrayList<Integer> a1=new ArrayList<Integer>();
	//List<Integer> a1=new ArrayList<Integer>(); -------> Sirf list ki method use kar payege
	//Collection<Integer> a1=new ArrayList<Integer>();  -------> Sirf Collection  ki method use kar payege
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	System.out.println(a1);
	ArrayList<Integer> a2=new ArrayList<Integer>();
	a2.addAll(a1);
	System.out.println(a2);
	System.out.println(a2.contains(10));
	System.out.println(a2.contains(90));
	System.out.println(a2.containsAll(a1));
	System.out.println(a2.isEmpty());
	System.out.println(a2.size());
	a2.remove(1);
	System.out.println(a2);
	System.out.println(a2.size());
	
}
}
