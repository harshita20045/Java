package Collection11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee implements Comparable<Employee>
{
   private String name;
   private double score;
 
public Employee(String name, double score) {
	super();
	this.name = name;
	this.score = score;
}




public String getName() {
	return name;
}




@Override
public String toString() {
	return name + " " + score ;
}




public void setName(String name) {
	this.name = name;
}




public double getScore() {
	return score;
}




public void setScore(double score) {
	this.score = score;
}




public int compareTo(Employee o) {
	if(this.getScore()<o.getScore()) 
	{
		return +1;
	}
	else if(this.getScore()>o.getScore()) 
	{
		return -1;
	}
	else
	{
		return 0;
	}
	
}

   
}

public class EmployeeMain {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	ArrayList<Employee> t=new ArrayList<>();
	int n=Integer.parseInt(sc.nextLine());
	for (int i = 0; i < n; i++) {
		String name=sc.nextLine();
	    double score=Double.parseDouble(sc.nextLine());
		
		Employee e=new Employee(name,score);
		t.add(e);
	}
	Collections.sort(t);
	for(Employee i: t) {
	System.out.println(i);
	}
	}
}
