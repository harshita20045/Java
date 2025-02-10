package Cursors;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("abc");
		a.add("xyz");
		a.add("www");
		System.out.println(a);
		ListIterator itr=a.listIterator();
		while(itr.hasNext()) 
		{
			String s=(String)itr.next();
			if(s.equals("abc")) 
			{
				itr.remove();
			}
			else if(s.equals("xyz")) 
			{
				itr.add("rashmika");
			}
			else if(s.equals("www"))
			{
				itr.set("deepika");
			}
		}
		System.out.println(a);
	}
}
