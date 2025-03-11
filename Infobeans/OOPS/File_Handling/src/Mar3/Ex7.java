package Mar3;

import java.io.IOException;
import java.io.PrintWriter;

public class Ex7 {
public static void main(String[] args) throws IOException {
	PrintWriter pw=new PrintWriter("D:\\Git\\Language\\Java\\Infobeans\\OOPS\\File_Handling\\src\\Mar3\\javaworld.txt");
	pw.println("welcome");
	pw.println("home");
	pw.println(100);
	pw.append("Bye");
	pw.close();
	System.out.println("done");
}
}
