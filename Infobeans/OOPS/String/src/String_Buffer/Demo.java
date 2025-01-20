package String_Buffer;

public class Demo {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("rashmika");
		str.append("welcome");
		str.insert(0, "guys");
		System.out.println(str);
		
		
		System.out.println(str.delete(4, 12));
		//System.out.println(str.reverse());
		//System.out.println(str.replace(4,7,"not"));
		//System.out.println(str.replace(4,8,"not"));
		//System.out.println(str.replace(4,7,"node"));
		
	
		
		
	}
}
