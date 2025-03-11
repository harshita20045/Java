package functionalInterface;

interface RandomNumberGenerator{
	public void generate(int min,int max);
}
public class Random {
public static void main(String[] args) {
	RandomNumberGenerator r=(min,max)->{
		System.out.println( (int)(Math.random()*(max-min+1)+min));

	};
	r.generate(100, 200);
}
}
