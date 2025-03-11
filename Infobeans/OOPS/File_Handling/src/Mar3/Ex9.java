package Mar3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex9 {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("D:\\Git\\Language\\Java\\Infobeans\\OOPS\\File_Handling\\src\\Mar3\\javaworld.txt");
	BufferedReader br=new BufferedReader(fr);
	String str=br.readLine();
	while(str!=null) {
		System.out.println(str);
		str=br.readLine();
	}
	br.close();
}
}
