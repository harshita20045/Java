class Data_member
{
	int a;
	public void show()
	{
		a=10;
		System.out.println("a : "+a);
	}
	public static void main(String [] args)
	{
		Data_member d=new Data_member();
		d.show();
		d.a=0;
		System.out.println("a : "+d.a);
		
	}
}