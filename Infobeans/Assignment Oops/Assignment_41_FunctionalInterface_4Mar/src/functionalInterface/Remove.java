package functionalInterface;

interface RemoveSpaces{
	public String clean(String str);
}
public class Remove {
public static void main(String[] args) {
	String str="hii i am harshita";
	
	RemoveSpaces r=(n)->{
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ') {
				  s=s+str.charAt(i);
			}
		}
		return s;
	};
	System.out.println(r.clean(str));
}
}
