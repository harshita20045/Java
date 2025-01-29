package Jan_28;

class Person4{
	int id;
	String name;
	Person4(int id,String name){
		this.id=id;
		this.name=name;
	}
	Person4(){}  // if it is not there so it will give error because child class is having default constructor and it will call default constructor of parent class (and ther is no default constructor in parent class (kyki humne parameter constructor banaya hai or isliye system khud se nahi banayega))
	public String toString() {
		return id+" : "+name;
	}
}
class Student extends Person4 {
	
}
public class Demo4 {

	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1);
	}
}
