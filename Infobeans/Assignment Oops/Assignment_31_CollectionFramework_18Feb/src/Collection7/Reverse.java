package Collection7;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	Stack<String> s=new Stack<String>();
	Stack<String> r=new Stack<String>();
	s.add("hello");
	s.add("hii");
	s.add("heyy");
	Iterator<String> itr=s.iterator();
	while(itr.hasNext())
	{
		String a=(String) itr.next();
		StringBuffer s1=new StringBuffer(a);
		s1.reverse();
		a=s1.toString();
		r.push(a);
	}
	Iterator<String> itr1=r.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
}
}
