import java.util.Scanner;
class Ternary{
public static void main(String[]args){
Scanner sc=new Scanner(	System.in);
System.out.print("Enter your marks : ");
int m=sc.nextInt();
String c= (m>=91&&m<=100)?"A":(m>=81&&m<=90)?"B":(m>=71&&m<=80)?"C":(m>=61&&m<=70)?"D":(m>=31&&m<=60)?"E":"Fail";
System.out.println(c);
}
}