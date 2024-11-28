class Practice
{
	public static void main(String [] args)
	{
		int a[]={10, 40, 35, 25, 61, 52,7,4,2};
		int i,temp;
		for(i=0;i<a.length/2;i++)
		{
			temp=a[i];
                        a[i]=a[a.length-i-1];
                        a[a.length-i-1]=temp;
              0           

		}
		
		for(i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}
	
}