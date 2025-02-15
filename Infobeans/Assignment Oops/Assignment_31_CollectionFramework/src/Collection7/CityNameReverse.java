package Collection7;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CityNameReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<String> t1 = new TreeSet<>();
		while (true) {
			String cityName = sc.nextLine();
			if (cityName.equals("-1"))
				break;
			t1.add(cityName);
		}
		Iterator j = t1.descendingIterator();
		while (j.hasNext()) {
			System.out.println(j.next());
		}

	}

}
