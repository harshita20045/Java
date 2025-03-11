package functionalInterface;

interface TitleCaseConverter {
	public void convert(String sentence);
}

public class Title {
	public static void main(String[] args) {
		String str="HUFEHFIUHNUIFEF ENWFNEIFE BFHEJBF BJKFDH";
		TitleCaseConverter t=s->{
			String []a=s.split(" ");
			for (int i = 0; i < a.length; i++) {
				String str1=a[i].substring(0, 1).toUpperCase();
				String str2=a[i].substring(1, a[i].length()).toLowerCase();
				String result=str1+str2;
				System.out.print(result+" ");
			}
		};
		t.convert(str);
	}
}
