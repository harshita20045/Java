package Mar3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex5 {
public static void main(String[] args) throws IOException{
	File f=new File("D:\\Git\\Language\\Java\\Infobeans\\OOPS\\File_Handling\\src\\Mar3\\javaworld.txt");
	FileWriter fw=new FileWriter(f,true);
	fw.write("welcome");
	fw.flush();
	
}
}
