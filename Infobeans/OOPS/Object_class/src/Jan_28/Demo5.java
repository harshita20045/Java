package Jan_28;

class Person5{
	int id;
	String name;
	Person5(int id ,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id +" : "+name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
class Student5 extends Person5{
	String tension;
	Student5(int id,String name,String tension){
		super(id,name);
		this.tension=tension;
	}
	public String toString() {
		return super.toString()+" : "+tension;
	}
}
public class Demo5 {

	public static void main(String[] args) {
		Student5 s1= new Student5(101,"Katappa","Bohot");
		System.out.println(s1);
	}
}
