package Collection8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
class Sort1 implements Comparator<String>
{
	public int compare(String i1,String i2) {
		return -i1.compareTo(i2);
	}
}
public class CityNameReverse  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<String> t1 = new TreeSet<>(new Sort1());
		while (true) {
			String cityName = sc.nextLine();
			if (cityName.equals("-1"))
				break;
			t1.add(cityName);
		}
		Iterator j = t1.iterator();
		while (j.hasNext()) {
			System.out.println(j.next());
		}

	}

}
