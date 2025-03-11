package filehandling1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {
public static void main(String[] args) throws IOException  {
	Scanner sc=new Scanner(System.in);
	File f=new File("D:\\Git\\Language\\Java\\Infobeans\\Assignment Oops\\Assignment_40_FileHandling_3Mar\\src\\filehandling1\\student.txt");
	f.createNewFile();
	FileWriter fw=new FileWriter(f,true);
	System.out.print("How many number of students you want to enter :");
	int n=Integer.parseInt(sc.nextLine());
	for (int i = 0; i < n; i++) {
		System.out.print("Enter "+(i+1)+" name ");
		String str=sc.nextLine();
		fw.write("\n"+str);
		fw.flush();
	}
	System.out.println("success");
}
}
