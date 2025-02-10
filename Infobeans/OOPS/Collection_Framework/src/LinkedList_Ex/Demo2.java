package LinkedList_Ex;

import java.util.LinkedList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
	  List<String> l=new LinkedList<String>();
	  l.add("abc");
	  l.add("xyz");
	  l.add("www");
	  System.out.println(l);
	  l.addFirst("katappa");
	  System.out.println(l);
	  l.addLast("bahubali");
	  System.out.println(l);
	  l.removeFirst();
	  System.out.println(l);
	  l.removeLast();
	  System.out.println(l);
	  System.out.println(l.getFirst());
	  System.out.println(l.getLast());
	  l.add("rashmika");
	  System.out.println(l);
	  l.add(2, "deepika");
	  System.out.println(l);

	}

}
