package comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MySort1 implements Comparator<Integer> {
//Short cut of compare descending
	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}

}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new TreeSet<Integer>(new MySort1());
		s.add(10);
		s.add(90);
		s.add(30);
		s.add(80);
		s.add(20);
		System.out.println(s);

	}

}
