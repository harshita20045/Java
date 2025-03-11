package filehandling1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Copy {
public static void main(String[] args) throws IOException {
	FileReader f=new FileReader("D:\\Git\\Language\\Java\\Infobeans\\Assignment Oops\\Assignment_40_FileHandling_3Mar\\src\\filehandling1\\source.txt");
	PrintWriter f1=new PrintWriter("D:\\Git\\Language\\Java\\Infobeans\\Assignment Oops\\Assignment_40_FileHandling_3Mar\\src\\filehandling1\\destination.txt");

	BufferedReader br=new BufferedReader(f);
	String str=br.readLine();
	while(str!=null) {
		f1.println(str);
		str=br.readLine();
		
		
	}
	f1.close();
	br.close();
}
}
