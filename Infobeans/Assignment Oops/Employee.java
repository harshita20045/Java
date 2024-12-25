class Emp_Info
{
	private long e_no;
	private String e_name;
	private long e_Mn;
	private String e_address;
	double e_salary;
	public void setNo(long e_no)
	{
		this.e_no=e_no;
	}
	public long getNo()
	{
		return e_no; 
	}
	public void setName(String e_name)
	{
		this.e_name=e_name;
	}
	public String getName()
	{
		return e_name; 
	}
	public void setMn(long e_Mn)
	{
		this.e_Mn=e_Mn;
	}
	public long getMn()
	{
		return e_Mn; 
	}
	
	public void setAddress(String e_address )
	{
		this.e_address=e_address;
	}
	public String getAddress()
	{
		return e_address; 
	}
	public void setSalary(double e_salary)
	{
		this.e_salary=e_salary;
	}
	public double getSalary()
	{
		return e_salary; 
	}
}
class Employee
{
	public static void main(String [] args)
	{
		Emp_Info e1=new Emp_Info();
		e1.setNo(1);
		e1.setName("Harshita");
		e1.setMn(9926490772l);
		e1.setAddress("Indore");
		e1.setSalary(1000);
		Emp_Info e2=new Emp_Info();
		e2.setNo(2);
		e2.setName("Garima");
		e2.setMn(7470361548l);
		e2.setAddress("Indore");
		e2.setSalary(31000);
		Emp_Info e3=new Emp_Info();
		e3.setNo(3);
		e3.setName("Asha");
		e3.setMn(8889490772l);
		e3.setAddress("Indore");
		e3.setSalary(60000);
		
		Emp_Info arr[]=new Emp_Info[3];
		arr[0]=e1;
		arr[1]=e2;
		arr[2]=e3;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getSalary()>50000)
			{
			System.out.println(arr[i].getNo()+"  "+arr[i].getName()+" "+arr[i].getMn()+" "+arr[i].getAddress()+" "+arr[i].getSalary());
			}
		}
	}
} 