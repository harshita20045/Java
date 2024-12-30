class Student4
{
	private int rollno;
	private String name;
	
	Student4(int rollno,String name)
	{	
		System.out.println("Para");
		this.rollno=rollno;
		this.name=name;
	}
	void display()
	{
		System.out.println(rollno+" : "+name);
	}
}
class Parameter
{
	public static void main(String args[])
	{
		Student4 s1=new Student4(101,"Pushpa");
		s1.display();
		Student4 s2=new Student4(102,"Pushpa2");
		s2.display();
		
	}
}