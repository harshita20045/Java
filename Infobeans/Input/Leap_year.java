class Leap_year{
public static void main (String [] args){
int y=2500;
if(y%400==0){
System.out.println("Leap Year");
}
else if (y%100==0){
System.out.println("Not Leap Year");
}
else if(y%4==0){
System.out.println("Leap Year");
}
else{
System.out.println("Not Leap Year");
}
}
}