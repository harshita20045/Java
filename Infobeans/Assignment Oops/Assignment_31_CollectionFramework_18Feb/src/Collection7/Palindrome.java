package Collection7;

import java.util.Iterator;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<String>();
		s.add("Harshita");
		s.add("Kasak");
		s.add("kritika");
		s.add("Kanak");
		s.add("Vedika");
		s.add("Naman");
		s.add("Vedu");
		s.add("Malyalam");
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			 String a=(String) itr.next();
			StringBuffer s1 = new StringBuffer(a);
			s1.reverse();
			String a1 = s1.toString();
			if (a.equalsIgnoreCase(a1)) {
				System.out.println(a + " is Palindrome");
			}

		}
//		for(String i:s) 
//		{
//			StringBuffer s1 = new StringBuffer(i);
//			s1.reverse();
//			String a = s1.toString();
//			if (i.equalsIgnoreCase(a)) {
//				System.out.println(i + " is Palindrome");
//			}
//
//		}

	}
}
