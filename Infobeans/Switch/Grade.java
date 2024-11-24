import java .util.Scanner;
class Grade{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter a Grade : ");
char ch =s.next().charAt(0);
switch(ch){
case 'A':System.out.println("Pass");
break;
case 'B':System.out.println("Pass");
break;
case 'C':System.out.println("Pass");
break;
case 'D':System.out.println("Pass");
break;
case 'E':System.out.println("Pass");
break;
case 'F':System.out.println("Fail");
break;
default:System.out.println("Wrong Grade");


}

}
}