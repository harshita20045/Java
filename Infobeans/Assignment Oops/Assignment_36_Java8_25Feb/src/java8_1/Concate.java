package java8_1;

interface ConcatString{
	
	public String concatenate(String s1,String s2);
}
public class  Concate {
public static void main(String[] args) {
	ConcatString s=(a,b)->a+b;
	
System.out.println(s.concatenate("dsgd", "dsgfd"));
}
}
