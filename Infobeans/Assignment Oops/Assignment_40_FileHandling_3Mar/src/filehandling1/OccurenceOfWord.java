package filehandling1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OccurenceOfWord {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while(true) {
		FileReader f = new FileReader(
				"D:\\Git\\Language\\Java\\Infobeans\\Assignment Oops\\Assignment_40_FileHandling_3Mar\\src\\filehandling1\\document.txt");
		BufferedReader br = new BufferedReader(f);
		
		System.out.println("Enter a word : ");
		String word = sc.nextLine();
		String str = br.readLine();
		int count = 0;
		while (str != null) {

			String[] s = str.split(" ");
			for (int i = 0; i < s.length; i++) {
				if (s[i].equalsIgnoreCase(word)) {
					count++;
				}
			}
			str = br.readLine();

		}
		if (count == 0) {
			System.out.println("No element is present");
		} else {
			System.out.println(word +" is occured "+count+" times .");
		}
		f.close();
		br.close();
		}
	}
}
