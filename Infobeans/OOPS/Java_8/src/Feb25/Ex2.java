package Feb25;

interface I2
{
     public void add(int a,int b);
}
public class Ex2 {
	public static void main(String[] args) {
		I2 obj=(a,b)->{
			System.out.println("hello guys");
			System.out.println(a+b);
			System.out.println("Party Over");
		};
		obj.add(12, 13);
	}
}
