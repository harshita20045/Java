class Product_Info
{
	private int p_id;
	private String p_brand;
	private double p_price;
	private String p_type;
	
	public void setID(int p_id)
	{
		this.p_id=p_id;
	}
	public int getID()
	{
		return p_id; 
	}
	public void setBrand(String p_brand)
	{
		this.p_brand=p_brand;
	}
	public String getBrand()
	{
		return p_brand; 
	}
	public void setPrice(double p_price)
	{
		this.p_price=p_price;
	}
	public double getPrice()
	{
		return p_price; 
	}
	public void setType(String p_type)
	{
		this.p_type=p_type;
	}
	public String getType()
	{
		return p_type; 
	}	
}
class Product
{
	public static void main(String [] args)
	{
		Product_Info p1=new Product_Info();
		p1.setID(1);
		p1.setBrand("Boat");
		p1.setPrice(2000);
		p1.setType("earbuds");
		
		Product_Info p2=new Product_Info();
		p2.setID(2);
		p2.setBrand("Bata");
		p2.setPrice(5000);
		p2.setType("Shoes");
		
		Product_Info p3=new Product_Info();
		p3.setID(3);
		p3.setBrand("Maggie");
		p3.setPrice(100);
		p3.setType("Noddles");
		
		
		Product_Info arr[]=new Product_Info[3];
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getPrice()<1000)
			{
			System.out.println(arr[i].getID()+"  "+arr[i].getBrand()+" "+arr[i].getPrice()+" "+arr[i].getType());
			}
		}
	}
} 