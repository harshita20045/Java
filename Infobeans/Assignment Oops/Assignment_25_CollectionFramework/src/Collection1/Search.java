package Collection1;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a1 = new ArrayList<String>();
//		System.out.println("Enter a size : ");
//		int size = Integer.parseInt(sc.nextLine());
//		for (int i = 0; i < size; i++) {
//			a1.add(sc.nextLine());
//		}
		System.out.println("Enter a elements and 1 to stop  : ");
         do 
         {
 			

 			if(sc.nextLine().charAt(0)=='1') {
 				break;
 			}
 			a1.add(sc.nextLine());
         }while(true);
         
		System.out.println("Enter a element to search  : ");
		String search=new String();
	 search = sc.nextLine();
	
		if (a1.contains(search)) {
			System.out.println(search + " exist at position " + a1.indexOf(search));
		}
//      for (int i = 0; i < size; i++) {
//		if(a1.get(i).equals(search)) {
//			System.out.println(a1.get(i)+" exist at position "+ (i+1));
//		}
//	}
	}

}
