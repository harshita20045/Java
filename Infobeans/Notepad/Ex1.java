import java.util.*;
class Ex1
{
  public static void main(String args[])
  {
    ArrayList<Integer>  l=new ArrayList<Integer>();
    l.add(10);
    l.add(20);
    l.add(50);
    l.add(90);
    l.add(10);
    l.add(30);
    l.add(40); 

System.out.println(l);
Collections.sort(l);
System.out.println(l); 
  }
}