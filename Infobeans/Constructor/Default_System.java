class Student2
{
	private int rollno;
	private String name;
	
	void display()
	{
		System.out.println(rollno+" : "+name);
	}
}
class Default_System
{
	public static void main(String args[])
	{
		Student2 s1=new Student2();
		
		s1.display();
		
	}
}