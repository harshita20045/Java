package Jan_28;

class Person3{
	int id;
	String name;
	Person3(int id,String name){
		this.id=id;
		this.name=name;
	}
	/*public String toString() {  because return type is String and it is returning int
		return id;
	}*/
//	public int toString() { // --> against the rule of method overriding 
//		return id ;
//	}
	public String toString() { // --> if you want to return int
		return id+"" ;
	}
	
	
}
public class Demo3 {

	public static void main(String[] args) {
		Person3 p1=new Person3(101,"katappa");
		System.out.println(p1);
	}
	
}
