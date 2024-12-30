class Product_Info
{
	private int p_id;
	private String p_brand;
	private double p_price;
	private String p_type;
	
	Product_Info()
	{
		p_id=1;
		p_brand="Bata";
		p_price=8000;
		p_type="shoes";
	}
	Product_Info(int p_id,String p_brand,double p_price,String p_type)
	{
		this.p_id=p_id;
		this.p_brand=p_brand;
		this.p_price=p_price;
		this.p_type=p_type;
	}
	Product_Info(Product_Info p)
	{
		this.p_id=p.p_id;
		this.p_brand=p.p_brand;
		this.p_price=p.p_price;
		this.p_type=p.p_type;
	}
	void display()
	{
		System.out.println(p_id+" : "+p_brand+" : "+p_price+" : "+p_type);
	}
	
}
class Product
{
	public static void main(String [] args)
	{
		Product_Info p1=new Product_Info();
		p1.display();
		Product_Info p2=new Product_Info(2,"Maggi",200,"Noodles");
		p2.display();
		Product_Info p3=new Product_Info(p2);
		p3.display();
		
		
	}
} 