package java8_1;

interface Square{
	
	public int findSquare(int a);
}
public class  SquareFind{
public static void main(String[] args) {
	Square s=n->n*n;
	
System.out.println(s.findSquare(4));
}
}
