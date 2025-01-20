package Operations;

import java.util.Scanner;

public class Char_count {

	public int char_count(String str,char ch) 
	{
		
		int count=0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		
		}
		return count;
		
	}
}
