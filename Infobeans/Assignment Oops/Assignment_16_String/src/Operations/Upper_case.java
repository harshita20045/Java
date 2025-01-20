package Operations;

public class Upper_case {

	public void upper_case(String str) 
	 {  
		for (int i = 0; i < str.length(); i++) 
		{
			int a=str.charAt(i);
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
			{
				System.out.print((char)(a-32));
			}
			else 
			{
				System.out.print((char)a);
			}
		
			
		}
		

	 }
}