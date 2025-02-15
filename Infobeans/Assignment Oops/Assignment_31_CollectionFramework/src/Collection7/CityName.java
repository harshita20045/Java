package Collection7;

import java.util.Scanner;
import java.util.TreeSet;

public class CityName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<String> t1 = new TreeSet<>();
		while (true) {
			String cityName = sc.nextLine();
			if (cityName.equals("-1"))
				break;
			t1.add(cityName);
		}
		for (String i : t1) {
			System.out.println(i);
		}
	}
}
