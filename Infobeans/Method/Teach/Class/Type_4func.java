class Type_4func
{
	int sq(int x)
	{
		return x*x;				
	}
	int cube(int y)
	{
		return y*y*y;				
	}
	
	public static void main(String [] args)
	{
		Type_4func t=new Type_4func();
		System.out.println("Square : "+t.sq(2));
		System.out.println("Cube : "+t.cube(3));
	}
}