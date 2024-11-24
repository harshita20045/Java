class Ternary{
public static void main(String[]args){
int m=80;
String c= (m>=91&&m<=100)?"A":(m>=81&&m<=90)?"B":(m>=71&&m<=80)?"C":(m>=61&&m<=70)?"D":(m>=31&&m<=60)?"E":"Fail";
System.out.println(c);
}
}