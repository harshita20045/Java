package functionalInterface;

interface LeapYearChecker {
	public boolean isLeapYear(int year);
}

public class LeapYear {
	public static void main(String[] args) {
		LeapYearChecker l = y -> {

			if (y % 400 == 0) {
				System.out.println("Leap Year");
			} else if (y % 100 == 0) {
				System.out.println("Not Leap Year");
			} else if (y % 4 == 0) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not Leap Year");
			}
			return true;
		};
		int n=2024;
		if(l.isLeapYear(n))
		{
			System.out.println(n+" is Leap Year .");
		}
		else
		{
			System.out.println(n+" not is Leap Year .");
		}
	}
}
