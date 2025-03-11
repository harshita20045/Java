package Feb25;

interface I3
{
	public int square (int a);
	}
public class Ex3 {

	public static void main(String[] args) {
		I3 obj =x->x*x;
		System.out.println(obj.square(20));
	}
}
