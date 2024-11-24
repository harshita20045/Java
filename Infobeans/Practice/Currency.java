class Currency{
public static void main(String [] args){
int n=4523;
int t=n/2000;
int f=n%2000/500;
int tw=n%2000%500/200;
int h=n%2000%500%200/100;
int fi=n%2000%500%200%100/50;
int twe=n%2000%500%200%100%50/20;
int te=n%2000%500%200%100%50%20/10;
int fiv=n%2000%500%200%100%50%20%10/5;
int two=n%2000%500%200%100%50%20%10%5/2;
int one=n%2000%500%200%100%50%20%10%5%2/1;




System.out.println("Rs 2000 : " + t + " notes/coins");
System.out.println("Rs 500  : " + f + " notes/coins");
System.out.println("Rs 200  : " + tw + " notes/coins");
System.out.println("Rs 100  : " + h + " notes/coins");
System.out.println("Rs 50   : " + fi + " notes/coins");
System.out.println("Rs 20   : " + twe + " notes/coins");
System.out.println("Rs 10   : " + te+ " notes/coins");
System.out.println("Rs 5    : " + fiv + " coins");
System.out.println("Rs 2    : " + two + " coins");
System.out.println("Rs 1    : " + one + " coins");
}}