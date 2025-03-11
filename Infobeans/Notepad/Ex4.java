import java.util.*;
class Employee1 implements Comparable<Employee1>
{
    private int id;
    private String name;
    private double salary;
    public Employee1(int id,String name, double salary)
    {
       this.id=id;
       this.name=name;
       this.salary=salary;
    }
   public Employee1()
   {
   }
   public void setId(int id)
   {
      this.id=id;
   }
   public int getId()
   {
      return id;  
   }
   public void setName(String name)
   {
     this.name=name;
   }
   public String getName()
   {
      return name;
   }
   public void setSalary(double Salary)
   {
     this.salary=salary;
   }
   public double getSalary()
   {
      return salary;
   }
   public String toString()
   {
      return id +" : "+name+" : "+salary;
   }
   public int compareTo(Employee1 e)
   {
     if(this.salary<e.salary)
     {
          return -1;
     } 
     else if(this.salary>e.salary)
     {
        return +1;
     }
     else 
    {
        return 0;
    }
   }   
}
class MySorting implements Comparator<Employee1>
{
   public int compare(Employee1 e1,Employee1 e2)
   {
        return -e1.compareTo(e2);
   }
}
public class Ex4
{
      public static void main(String args[])
      {
          ArrayList<Employee1> l=new ArrayList<Employee1>();
          Employee1 e1 = new Employee1(101,"rashmika",2000);
          Employee1 e2 = new Employee1(103,"deepika",9003);
          Employee1 e3 = new Employee1(102,"katappa",10000);
          l.add(e1);
          l.add(e2);
          l.add(e3);
          System.out.println(l);
          Collections.sort(l,new MySorting()); 
          System.out.println(l);
        
      }
}