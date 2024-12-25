class Student3
{
	private int rollno;
	private String name;
	public int getRollno()
	{
		return rollno;
	}
	public String getName()
	{
		return name;
	}
	Student3()
	{	
		System.out.println("User Defined");
		rollno=101;
		name="Pushpa";
	}
	
}
class Default_user
{
	public static void main(String args[])
	{
		Student3 s1=new Student3();
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		
	}
}