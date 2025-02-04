package Collection1;

import java.util.ArrayList;

class Upper_case {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Harshita");
		a1.add("Asha");
		a1.add("Aashita");
		a1.add("Himanshi");
		a1.add("Astha");
		System.out.println(a1);
//		for(String i:a1) {
//			
//			if(i.charAt(0)=='a'||i.charAt(0)=='A') {
//				System.out.println(i.toUpperCase());
//			}
//			else {
//				System.out.println(i);
//			}
//			
//		
		
		for (int i = 0; i < a1.size(); i++) {
			if(a1.get(i).charAt(0)=='a'||a1.get(i).charAt(0)=='A') {
				a1.set(i, a1.get(i).toUpperCase());
			}
		}
		System.out.println(a1);
		
	}
}
