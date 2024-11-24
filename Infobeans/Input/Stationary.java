class Stationary{
public static void main(String [] args)
{
int cost=100;
int pen_cost=15;
int pencil_cost=3;
int pen_no=(int)(cost/pen_cost);
int remainder = cost%pen_cost;
int pencil_no= (int)(remainder/pencil_cost);
int pen = pen_cost*pen_no;
int pencil = pencil_cost*pencil_no;
int total = pen_no + pencil_no;

System.out.println("NO. of Pen : " + pen_no);
System.out.println("NO. of Pencil : " + pencil_no); 
System.out.println("Cost of Pens : " + pen);
System.out.println("Cost of Pencils : " + pencil);
System.out.println("Total number of Products : " + total);

}
}