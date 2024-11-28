class Practice5
{
	public static void main(String [] args)
	{
	int a[]={1,2,3,4,5};
	int b[]={1,2,3,3,4};
	int flag=0;
		int i;
		for(i=0;i<5;i++)

		{
			if(a[i]!=b[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Success");
		else
			System.out.println("Failure at position : "+(i+1));
		
		
	}
}