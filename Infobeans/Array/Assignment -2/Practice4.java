class Practice4
{
	public static void main(String [] args)
	{	
		int a[]={1,2,3,4,5};
		int b[]=new int[a.length];
		
		
			for(int i=0;i<a.length;i++)
			{
				b[i]=a[i];		
			}
			
			for(int i=0;i<a.length;i++)
			{
			System.out.println((i+1)+" element : "+b[i]);
		}
		
		
	}
}