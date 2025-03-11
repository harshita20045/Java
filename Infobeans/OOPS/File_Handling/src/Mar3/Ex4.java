package Mar3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {
public static void main(String[] args) throws IOException {
	File f=new File("D:\\Git\\Language\\Java\\Infobeans\\OOPS\\File_Handling\\src\\Mar3\\javaworld.txt");
	System.out.println(f.exists());
	f.createNewFile();
	System.out.println(f.exists());
	FileWriter fw=new FileWriter(f);
	fw.write("welcome");
	fw.flush();
	System.out.println(f.length());
}
}
