import java.util.Scanner;
class Season{
public static void main(String [] args){
Scanner s=new Scanner(System.in);

System.out.print("Enter a number of month : ");
int n=s.nextInt();
switch(n){
case 1:System.out.println("Winter Season (Shishir) and Pre-Winter Season (Hemant)");
break;
case 2:System.out.println("Spring Season (Vasant)");
break;
case 3:System.out.println("Spring Season (Vasant) and Summer Season (Grishma)");
break;
case 4:System.out.println("Summer Season (Grishma)");
break;
case 5:System.out.println("Summer Season (Grishma)");
break;
case 6:System.out.println("Monsoon Season (Varsha)");
break;
case 7:System.out.println("Monsoon Season (Varsha)");
break;
case 8:System.out.println("Monsoon Season (Varsha)");
break;
case 9:System.out.println("Monsoon Season (Varsha)");
break;
case 10:System.out.println("Autumn Season (Sharad)");
break;
case 11:System.out.println("Autumn Season (Sharad)");
break;
case 12:System.out.println("Pre-Winter Season (Hemant)");
break;
default:System.out.println("Invalid Number");
}


}

}