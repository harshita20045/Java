package filehandling1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count {
public static void main(String[] args) throws IOException {
	FileReader f=new FileReader("D:\\Git\\Language\\Java\\Infobeans\\Assignment Oops\\Assignment_40_FileHandling_3Mar\\src\\filehandling1\\input.txt");
	FileReader f1=new FileReader("D:\\Git\\Language\\Java\\Infobeans\\Assignment Oops\\Assignment_40_FileHandling_3Mar\\src\\filehandling1\\input.txt");
	
	BufferedReader br=new BufferedReader(f1);
	int ch=f.read();
	int countChar = 0;
	System.out.println("ew=tw");
	int countWord = 0;
	
	String str=br.readLine();
	while(ch!=-1)
	{
		//System.out.println((char)ch);
		if(ch!=' ') {
		 countChar++;	
		}
		ch=f.read();
	}
	while(str!=null)
	{
		//System.out.println((char)ch);
		
		String[] s=str.split(" ");
		countWord+=s.length;
		str=br.readLine();
		
	}
	f.close();
	br.close();
	System.out.println("Number of character : "+countChar);
	System.out.println("Number of Word : "+countWord);
}
}
