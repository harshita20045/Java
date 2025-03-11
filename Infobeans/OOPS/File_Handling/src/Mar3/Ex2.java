package Mar3;

import java.io.File;
import java.io.IOException;

public class Ex2 {
public static void main(String[] args) throws IOException {
	File f=new File("D:\\Git\\Language\\Java\\Infobeans\\OOPS\\File_Handling\\src\\Mar3\\javaworld.txt");
	f.createNewFile();
	System.out.println(f.exists());
	System.out.println(f.length());
	
}
}
