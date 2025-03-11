package java8_1;

interface CompareNumbers
{
	public void compare(int a,int b);
}
public class Compare {
public static void main(String[] args) {
		CompareNumbers obj=(a,b)->
		{
			if(a>b)
				System.out.println("Greater");
			else if(a<b)
				System.out.println("Smaller");
			else
				System.out.println("Equal");
		};
		
		obj.compare(10, 60);
}
}
