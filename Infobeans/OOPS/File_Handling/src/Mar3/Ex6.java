package Mar3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex6 {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("D:\\Git\\Language\\Java\\Infobeans\\OOPS\\File_Handling\\src\\Mar3\\javaworld.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("welcome");
	bw.newLine();
	bw.write("home");
	bw.close();
	System.out.println("done+"
			+ "");
}
}
