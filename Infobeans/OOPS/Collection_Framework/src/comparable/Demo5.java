package comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MySort2 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new TreeSet<String>(new MySort2());
		s.add("abc");
		s.add("cba");
		s.add("bac");
		s.add("sdf");
		s.add("fre");
		System.out.println(s);

	}

}
