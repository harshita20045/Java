package Collection11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Hall implements Comparable<Hall>
{
   private String name;
   private String contactNumber;
   private double costPerDay;
   private String ownerName;
   
   

public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
	super();
	this.name = name;
	this.contactNumber = contactNumber;
	this.costPerDay = costPerDay;
	this.ownerName = ownerName;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getContactNumber() {
	return contactNumber;
}



public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}



public double getCostPerDay() {
	return costPerDay;
}



public void setCostPerDay(double costPerDay) {
	this.costPerDay = costPerDay;
}



public String getOwnerName() {
	return ownerName;
}



public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}



@Override
public String toString() {
	return  name + " " + contactNumber + " " + costPerDay + " "
			+ ownerName + "";
}



@Override
public int compareTo(Hall o) {
	if(this.getCostPerDay()<o.getCostPerDay()) 
	{
		return -1;
	}
	else if(this.getCostPerDay()>o.getCostPerDay()) 
	{
		return +1;
	}
	else
	{
		return 0;
	}
	
}
 
   
}

public class Main {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	ArrayList<Hall> t=new ArrayList<>();
	int n=Integer.parseInt(sc.nextLine());
	for (int i = 0; i < n; i++) {
		String name=sc.nextLine();
	    String cn=sc.nextLine();
		double cpd=Double.parseDouble(sc.nextLine());
		String oName=sc.nextLine();
		Hall h=new Hall(name,cn,cpd,oName);
		t.add(h);
	}
	Collections.sort(t);
	for(Hall i: t) {
	System.out.println(i);
	}
	}
}
