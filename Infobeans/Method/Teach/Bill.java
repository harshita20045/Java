import java.util.Scanner;
class Bill
{
	float qty,rate,amt,dis,net;
	int ino;
void getdetails()
{
	Scanner s=new Scanner(System.in);
	System.out.print("Enter Item no. : ");
	ino=s.nextInt();
	System.out.print("Enter qty : ");
	qty=s.nextFloat();
	
	System.out.print("Enter rate : ");
	rate=s.nextFloat();
	
}
void process()
{
	amt=qty*rate;
	dis=amt*(10.0f/100);
	net=amt-dis;
}
void putdetails()
{
	
	System.out.println("Item no. : "+ino);
	
	System.out.println("qty : "+qty);
	
	System.out.println("Amount : "+amt);
	System.out.println("Aftem discount Amount : "+net);	
}
public static void main(String [] args)
	{
		Bill b=new Bill();
		b.getdetails();
		b.process();
		b.putdetails();
	}
}