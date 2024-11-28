import java.util.Scanner;
class Student
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("------------WELOME FOR STUDENTS ENTRY-----------");
		System.out.println();
		System.out.println();
		System.out.print("Enter number of student : ");
		int n=s.nextInt();
		String name[]=new String[n];
		int roll_no[]=new int[n];
		float m1[]=new float[n];
		float m2[]=new float[n];
		float m3[]=new float[n];
		float t[]=new float[n];
		float av[]=new float[n];
		
		float maxm1=0,maxm2=0,maxm3=0,maxt=0;
		int f1=0,f2=0,f3=0,f4=0;
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++)
		{
			s.nextLine();
			System.out.print("Enter name of "+(i+1)+" Student :");
			name[i]=s.nextLine();
			System.out.print("Enter Roll number of "+name[i]+":");
			roll_no[i]=s.nextInt();
			System.out.print("Marks of Physics : ");
			m1[i]=s.nextInt();
			System.out.print("Marks of Chemistry : ");
			m2[i]=s.nextInt();
			System.out.print("Marks of Mathematics : ");
			m3[i]=s.nextInt();
			t[i]=m1[i]+m2[i]+m3[i];
			av[i]=t[i]/3;
			if(maxm1<m1[i])
			{
				maxm1=m1[i];
				f1=i;
				
			}
			if(maxm2<m2[i])
			{
				maxm2=m1[i];
				f2=i;
			}
			if(maxm3<m3[i])
			{
				maxm3=m3[i];
				f3=i;
			}
			if(maxt<t[i])
			{
				maxt=t[i];
				
				f4=i;
			}
			System.out.println();
			System.out.println();
			
			
		}
		System.out.println();
		System.out.println("------ Here is the Information of Students ------");
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.println("Name of "+(i+1)+" Student :"+name[i]);
			System.out.println("Roll Number of "+(name[i])+" is :"+roll_no[i]);
			System.out.println("Marks of Physics : "+m1[i]);
			System.out.println("Marks of Chemistry : "+m2[i]);
			System.out.println("Marks of Mathematics : "+m3[i]);
			System.out.println("Total Marks : "+t[i]);
			System.out.println("Average of marks : "+av[i]);
		System.out.println();
		System.out.println();
		}
		
		System.out.println();
		System.out.println("--------Maximum of all---------- ");
		
			System.out.println("Maximum Marks of Physics : "+maxm1+" achieved by "+name[f1]);
			System.out.println("Marks of Chemistry : "+maxm2+" achieved by "+name[f2]);
			System.out.println("Marks of Mathematics : "+maxm3+" achieved by "+name[f3]);
			
			System.out.println("Topper of the class is : "+name[f4]);
	}
}