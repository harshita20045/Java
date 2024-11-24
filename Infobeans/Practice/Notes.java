import java.util.Scanner;
class Notes {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the amount you want to break down: Rs ");
  int amount = scanner.nextInt();
int notes2000 = amount / 2000;
  amount = amount % 2000;
 int notes500 = amount / 500;
  amount = amount % 500;
int notes200 = amount / 200;
  amount = amount % 200;
int notes100 = amount / 100;
amount = amount % 100;
int notes50 = amount / 50;
amount = amount % 50;
int notes20 = amount / 20;
amount = amount % 20;
int notes10 = amount / 10;
 amount = amount % 10;
int coins5 = amount / 5;
 amount = amount % 5;
int coins2 = amount / 2;
 amount = amount % 2;
int coins1 = amount;
System.out.println("\n Number of Notes:");
System.out.println("=========================");
System.out.println("Rs 2000 : " + notes2000 + " notes/coins");
System.out.println("Rs 500  : " + notes500 + " notes/coins");
System.out.println("Rs 200  : " + notes200 + " notes/coins");
System.out.println("Rs 100  : " + notes100 + " notes/coins");
System.out.println("Rs 50   : " + notes50 + " notes/coins");
System.out.println("Rs 20   : " + notes20 + " notes/coins");
System.out.println("Rs 10   : " + notes10 + " notes/coins");
System.out.println("Rs 5    : " + coins5 + " coins");
System.out.println("Rs 2    : " + coins2 + " coins");
System.out.println("Rs 1    : " + coins1 + " coins");
char ch=(char)2;
System.out.println("\n"+ch+" Thank you for using it......");  }
}