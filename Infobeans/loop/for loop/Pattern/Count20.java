class Count20{
public static void main(String args[]){															
for(int i=5;i>=1;i--){
for(int j=5;j>=i;j--){
if(i==j&&i!=5&&i!=1){								
System.out.print(i-1);
}
else{
System.out.print(i);
}
}
System.out.println();
}
}}