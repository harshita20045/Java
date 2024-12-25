class Student5
{
	private int rollno;
	private String name;
	
	Student5(int rollno,String name)
	{	
		this.rollno=rollno;
		this.name=name;
	}
	Student5(Student5 s)
	{	
		System.out.println("Object Parameter Constructor");
		this.rollno=s.rollno;
		this.name=s.name;
	}
	void display()
	{
		System.out.println(rollno+" : "+name);
	}
}
class Object_para
{
	public static void main(String args[])
	{
		Student5 s1=new Student5(101,"Pushpa");
		s1.display();
		Student5 s2=new Student5(s1);
		s2.display();
		
	}
}