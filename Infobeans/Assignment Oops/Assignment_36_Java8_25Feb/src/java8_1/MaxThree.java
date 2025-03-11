package java8_1;

interface MaxFinder
{
   public void findMax(int a,int b,int c);	
}
public class MaxThree {
public static void main(String[] args) {
	
	MaxFinder e1=  (a,b,c)->{
				if(a>b&&a>c) {
					System.out.println(a);
				}
				else if(b>c) {
					System.out.println(b);
				}
				else{
					System.out.println(c);
				}
					
		
	};
e1.findMax(10, 30, 40);
}
}
