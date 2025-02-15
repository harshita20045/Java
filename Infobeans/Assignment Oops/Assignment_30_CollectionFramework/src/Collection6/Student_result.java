package Collection6;

import java.util.HashSet;
import java.util.Set;

public class Student_result {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("Asha");
		set1.add("Bhoomika");
		set1.add("Chetna");
		set1.add("Divyansh");
		set1.add("Elephant");
		set1.add("Fayyaz");
		set1.add("Garima");
		set1.add("Harshita");
		set1.add("Ishika");
		set1.add("Janvi");
		Set<String> set2 = new HashSet<String>();
		set2.add("Asha");
		set2.add("Bhoomika");
		set2.add("Chetna");
		System.out.println(set1);
		Set<String> set=new HashSet<String>(set1);
		set.removeAll(set2);
		System.out.println("Passed Student name : ");
		System.out.println(set);
	}
}
