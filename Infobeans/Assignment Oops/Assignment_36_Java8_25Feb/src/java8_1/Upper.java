package java8_1;

interface ToUpperCase{
	
	public String convert(String i);
}
public class Upper {
public static void main(String[] args) {
	ToUpperCase u1=n->n.toUpperCase();
	
System.out.println(u1.convert("sdgfdg"));
}
}
