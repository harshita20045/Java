package Cursors;
import java.util.ArrayList;
import java.util.Iterator;
public class Iterator1 {
public static void main(String[] args) {
	ArrayList<String> l=new ArrayList<String>();
	l.add("abc");
	l.add("xyz");
	l.add("www");
	l.add("rashmika");
	System.out.println(l);
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		String s=(String)itr.next();
		if(s.startsWith("r"))
			System.out.println(s);
		else if(s.startsWith("a"))
			itr.remove();
	}
	System.out.println(l);
}
}
