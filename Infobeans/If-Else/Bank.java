class Bank{
public static void main(String [] args){
int ab=1000;
int wb=2100;
int nb=ab-wb;
if(wb>ab)
{
System.out.println("Insufficient funds");
}
else 
{
    if(wb%10!=0)
    {
      System.out.println("Invalid denomination");
    }
    else{
      System.out.println("Balance After Withdrawal is "+nb);
    }
}

}}