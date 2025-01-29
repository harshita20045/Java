package Jan_28;

class Person1
{
	int id;
	String name;
	Person1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString() //we have override toString method (rules--> same as method overriding)
	{
		return id+" : "+name;
	}
	
}
class Demo2 {

	public static void main(String[] args) {
		Person1 p1=new Person1(101,"Kattappa");
		System.out.println(p1);
		String s1=p1+" : "+"rashmika";
		System.out.println(s1);
	}
}
