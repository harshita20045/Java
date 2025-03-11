package Collection13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Hall implements Comparable<Hall> {
	private String name;
	private String contactNumber;
	private double costPerDay;
	private String ownerName;

	public Hall() {
		
	}

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
		return name + " " + contactNumber + " " + costPerDay + " " + ownerName + "";
	}

	@Override
	public int compareTo(Hall o) {
		
		if (this.getCostPerDay() < o.getCostPerDay()) {
			return -1;
		} else if (this.getCostPerDay() > o.getCostPerDay()) {
			return +1;
		} else {
			return 0;
		}
	}

}

public class HallMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Hall> h = new HashMap<>();
		System.out.print("Enter number of hall : ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name of hall : ");
			String name = sc.nextLine();
			System.out.print("Enter contact Number : ");
			String cn = sc.nextLine();
			System.out.print("Enter cost per day : ");
			double cpd = Double.parseDouble(sc.nextLine());
			System.out.print("Enter owner name : ");
			String oName = sc.nextLine();
			 
			h.put(name, new Hall(name, cn, cpd, oName));
		}

List<Hall> l=new ArrayList<>(h.values());
		Collections.sort(l);
		for (Hall i : l) {
			System.out.println(i);
		}

	}
}
