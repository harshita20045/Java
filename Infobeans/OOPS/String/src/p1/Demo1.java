package p1;

public class Demo1 {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		String s3=new String("abc");
		String s4=new String("abc");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		String s5=s4;
		System.out.println(s4==s5);
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s5));
		System.out.println(s1.equals(s3));
		System.out.println(s4.equals(s1));
		
	}
}
