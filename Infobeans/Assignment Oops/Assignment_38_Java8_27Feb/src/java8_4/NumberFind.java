package java8_4;

import java.util.ArrayList;

public class NumberFind {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(-20);
		l.add(30);
		l.add(-32);
		l.add(34);
		l.add(12);

		l.stream().filter(x -> x <= 0).forEach(w -> System.out.print(w+" "));
	}
}
