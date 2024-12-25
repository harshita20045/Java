class First1
{
	private int rollno;
	private String name;
	
	void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println(rollno+" : "+name);
	}
}
class First
{
	public static void main(String args[])
	{
		First1 s1=new First1();
		s1.setRollno(101);
		s1.setName("Nayan");
		s1.display();
		
	}
}