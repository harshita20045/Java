package Jan_28;

class Person{
	int id ;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Person p1= new Person(101,"Katappa"); 
		System.out.println(p1);//toString()
		String s1=p1+"rashmika";
		System.out.println(s1);
	}
}
