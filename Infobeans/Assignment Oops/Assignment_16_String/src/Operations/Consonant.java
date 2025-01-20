package Operations;

public class Consonant 
{

	public int consonant_count(String str) 
	{
		int count=0;
		for(int i=0;i<str.length();i++) 
		{
			int v=str.charAt(i);
		
			if(v>=97&&v<=128||v>=65&&v<=96)
			{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				
			}
			else
			{
				count++;
			}
			
		}
		}
		return count;
		
	}
	
}

