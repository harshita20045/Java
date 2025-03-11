package java8_1;

interface Power{
	
	public int findPower(int base,int exponent);
}
public class PowerCalculator {
public static void main(String[] args) {
	
	Power p=(x,y)->{
	int count=1;
		for (int i = 1; i <= y; i++) {
			count =count*x;
		}
		return count;
		
	};
	
	System.out.println(p.findPower(3, 3));
	
}
}
