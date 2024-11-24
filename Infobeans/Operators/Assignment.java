class Assignment{
public static void main(String [] args){
int a =10;
int b=5;
int c=(++b)*(a);
System.out.println(c);
a=(c++);
System.out.println(c);
System.out.println((a++)>=12);

}}