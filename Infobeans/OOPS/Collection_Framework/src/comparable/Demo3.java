package comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MySort implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if (o1 < o2) {
			return +1;
		} else if (o1 > o2) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new TreeSet<Integer>(new MySort());
		s.add(10);
		s.add(90);
		s.add(30);
		s.add(80);
		s.add(20);
		System.out.println(s);

	}

}
