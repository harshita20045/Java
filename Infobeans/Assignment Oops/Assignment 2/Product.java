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
		
		System.out.println(p1.getID()+" : "+p1.getBrand()+" : "+p1.getPrice()+" : "+p1.getType());
		
		
	}
} 