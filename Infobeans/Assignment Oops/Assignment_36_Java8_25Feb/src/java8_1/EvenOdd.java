package java8_1;

interface EvenOddChecker
{
   public void check(int n);	
}
public class EvenOdd {
public static void main(String[] args) {
	
	EvenOddChecker e1=  n->{
				if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	};
	e1.check(11);
}
}
