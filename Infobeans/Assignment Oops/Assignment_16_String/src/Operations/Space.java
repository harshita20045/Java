package Operations;

public class Space {

	public int space_count(String str) 
	{
		int count=0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		
		}
		return count;
		
	}
}
