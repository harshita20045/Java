class Song{

	public static void main (String args[]){
		
		String str="Shehnaiyo ki sada Keh rahi hai Khushi ki mubarak Ghadi aa gayi hai Saji surkh jode mein Chand si dulhan Zameen pe falak se Pari aa gayi hai Dulhe ka sehra suhana lagta hai Dulhe ka sehra suhana lagta hai Rs 1 Trial Dulhan ka toh Dil deewana lagta hai Dulhe ka sehra suhana lagta hai Dulhan ka toh Dil deewana lagta hai Pal bhar me kaise badalte hai rishte Pal bhar me kaise badalte hai rishte Ab to har apna begana lagta hai Dulhe ka sehra suhana lagta hai Dulhan ka toh Dil deewana lagta hai Sath pheron se bandha Janmo ka ye bandhan Pyar se joda hai rabb ne Preet ka daman (x2) Hai nayi rasme, nayi qasame Nayi uljhan Hont hai khamosh Lekin keh rahi dhakan Dhadkan, dhadkan Dhadkan, dhadkan Dhadkan meri dhadkan Dhadkan teri dhadkan Dhadkan dhadkan, Dhadkan dhadkan, Dhadkan dhadkan,dhadkan dhadkan Meri dhadkan, meri dhadkan Mushkil ashqon ko chupana lagta hai Mushkil ashqon ko chupana lagta hai Dhulhan ka to dil diwana lagta hai Pal bhar me kaise badalte hain rishte Pal bhar me kaise badalte hain rishte Ab to har apna begana lagta hai Dulhe ka sehra suhana lagta hai Dulhan ka toh Dil deewana lagta hai (x2) Mai teri bahon ke Jhoole me pali babul Ja rahi hoon chod ke Teri gali babul Main teri, bahon ke jhule, me pali babul Main teri bahon ke jhule me pali babul Main teri bahon ke jhule me pali babul Jaa rahi hoon chod ke teri gali babul Khoobsurat ye zamane yaad aayegi Chah ke bhi hum tumhein Na bhool payengi, mushkil Mushkil daman ko chudana lagta hai Dulhan ka to dil deewana lagta ha (x2) Pal bhar me kaise badalte hain rishte Ab to har apna begana lagta hai Dulhe ka sehra suhana lagta hai Dulhan ka to dil deewana lagta hai (x6) Dulhan ka to dil deewana lagta hai Dhadkan, dhadkan..dhadkan, dhadkan";
		StringBuilder s=new StringBuilder(str);
		String a[]=str.split("[,\\s\\.]");
		int i;
		int dhadkan=0;
		int dulhan=0;
		int dulhe=0;
		for( i=0;i<a.length;i++){
			/*if(a[i].equalsIgnoreCase("dhadkan")){
				
				System.out.print(a[i].replaceAll(a[i], "Java")+ "  ");
			}
			else if(a[i].equalsIgnoreCase("dulhe")){
				System.out.print(a[i].replaceAll(a[i], "Method Overriding")+ "  ");
			}
			else if(a[i].equalsIgnoreCase("dulhan")){
				System.out.print(a[i].replaceAll(a[i], "Exception Handling")+ "  ");
			}
			else if(a[i].equalsIgnoreCase("dil")){
				System.out.print(a[i].replaceAll(a[i], "Concept")+ "  ");
			}
			else if(a[i].equalsIgnoreCase("suhana")){
				System.out.print(a[i].replaceAll(a[i], "Tabahi")+ "  ");
			}
			else{
				
				System.out.print(a[i]+"  ");
			}
			
			*/
			
			if(a[i].equalsIgnoreCase("dhadkan")){
				dhadkan++;
			}
			if(a[i].equalsIgnoreCase("dulhe")){
				dulhe++;
			}
			if(a[i].equalsIgnoreCase("dulhan")){
				dulhan++;
			}
			
		}
		System.out.println("Dhadkan : "+dhadkan);
		System.out.println("Dulhe :"+dulhe);
		System.out.println("Dulhan : "+dulhan);
	}
}