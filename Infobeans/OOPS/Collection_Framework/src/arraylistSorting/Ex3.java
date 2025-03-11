package arraylistSorting;

import java.util.*;
class Employee implements Comparable<Employee>
{
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name, double salary)
    {
       this.id=id;
       this.name=name;
       this.salary=salary;
    }
   public Employee()
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
   public int compareTo(Employee e)
   {
     if(this.id<e.id)
     {
          return +1;
     } 
     else if(this.id>e.id)
     {
        return -1;
     }
     else 
    {
        return 0;
    }
   }   
}
public class Ex3
{
      public static void main(String args[])
      {
          ArrayList<Employee> l=new ArrayList<Employee>();
          Employee e1 = new Employee(101,"rashmika",2000);
          Employee e2 = new Employee(103,"deepika",9003);
          Employee e3 = new Employee(102,"katappa",10000);
          l.add(e1);
          l.add(e2);
          l.add(e3);
          System.out.println(l);
          Collections.sort(l); 
          System.out.println(l);
        
      }
}