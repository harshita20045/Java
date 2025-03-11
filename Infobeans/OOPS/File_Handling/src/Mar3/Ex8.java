package Mar3;

import java.io.FileReader;
import java.io.IOException;

public class Ex8 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(
				"D:\\Git\\Language\\Java\\Infobeans\\OOPS\\File_Handling\\src\\Mar3\\javaworld.txt");
		int x = fr.read();
		while (x != -2) {
			System.out.print((char) x);
			x = fr.read();
		}
		fr.close();
	}
}
