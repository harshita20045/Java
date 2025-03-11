import java.util.*;
class Student implements Comparable<Student>
{
private int rollNo;
private String name;
private String course;
public Student(int rollNo,String name,String course)
{
this.rollNo=rollNo;
this.name=name;
this.course=course;
}

public String toString()
{
return "\n\nRoll Number = "+rollNo+"\nName = "+name+"\nCourse = "+course;
}
public int compareTo(Student obj)
{

if(this.rollNo<obj.rollNo)
{
return -1;
}
else if(this.rollNo>obj.rollNo)
{
return +1;
}
else
{
return 0;
}
}
}

class Main
{
public static void main(String args[])
{
Scanner scanner =new Scanner(System.in);
Set<Student> s=new TreeSet<Student>();
while(true){
System.out.println("Press 1 ----> To Add Student");
System.out.println("Press 2 ----> To Display");
System.out.println("Press 3 ----> To Exit");
System.out.println();
System.out.print("Enter your choice : ");
int choice =Integer.parseInt(scanner.nextLine());
if(choice==3)
{
break;
}
switch(choice)
{
case 1:System.out.print("Enter Roll number : ");
int rollNo=Integer.parseInt(scanner.nextLine());
System.out.print("Enter name : ");
String name=scanner.nextLine();
System.out.print("Enter course : ");
String course=scanner.nextLine();
Student obj=new Student(rollNo,name,course);
s.add(obj);

break;

case 2: System.out.println(s);

}

}
}
}