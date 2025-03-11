package filehandling1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	File f=new File("D:\\Git\\Language\\Java\\Infobeans\\Assignment Oops\\Assignment_40_FileHandling_3Mar\\src\\filehandling1\\data.txt");
	f.createNewFile();
	System.out.println(f.exists());
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String str=br.readLine();
	while(str!=null) {
		System.out.println(str);
		str=br.readLine();
	}
	br.close();
}
}
