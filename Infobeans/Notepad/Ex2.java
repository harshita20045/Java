import java.util.*;
class MySorting implements Comparator<Integer>
{
  public int compare(Integer i1,Integer i2)
  {
     return -i1.compareTo(i2);
  }
}
class Ex2
{
   public static void main(String args[])
   {
      ArrayList<Integer>  l=new ArrayList<Integer>();
      l.add(10);
      l.add(78);
      l.add(32);
      l.add(34);
      l.add(13);
      l.add(12);
      System.out.println(l);
//Collections.sort(l,new MySorting());
l.sort(new MySorting());
System.out.println(l);
   }
}