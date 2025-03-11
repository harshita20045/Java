package java8_1;

interface Factorial
{
	public int calcualte(int n);
}
public class FactorialCalculator {
public static void main(String[] args) {
	Factorial f=n->{
		int temp=n;
		for (int i = n-1; i >=1 ; i--) {
			n=n*i;
		}
		return n;
		
	};
	System.out.println(f.calcualte(5));
}
}
