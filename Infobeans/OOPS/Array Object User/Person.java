import java.util.Scanner;
class Person
{
	private int id;
	private String name;
	private double price;
	private String address;
	
	Product(int id,String name,double price,String address)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.address=address;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public String getAddress()
	{
		return address;
	}
}
class Product_main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size=Integer.parseInt(sc.nextLine());
		Product p[]=new Product[size];
		
		for (int i=0;i<p.length;i++)
		{
			int id=Integer.parseInt(sc.nextLine());
			String name=sc.nextLine();
			double price=Double.parseDouble(sc.nextLine());;
			String address=sc.nextLine();
			System.out.println();
			p[i]=new Product(id,name,price,address);
		}
		System.out.println("Your Details : ");
		for(Product a:p)
		{
			System.out.println(a.getId()+" : "+a.getName()+" : "+a.getPrice()+" : "+a.getAddress());
		}
		
	}
}