import java.util.Scanner;
class Generate_bill
{
	double generate_bill(double q,double r)
	{
		return q*r;				
	}
	
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
        System.out.print("Enter Quantity : ");
        int  q = s.nextInt();
		System.out.print("Enter Rate : ");
        int  r = s.nextInt();
		Generate_bill g=new Generate_bill();
		System.out.println("Generate Bill : "+g.generate_bill(q,r));
		
	}
}