package java8_4;

import java.util.ArrayList;
import java.util.List;

class House
{
	private int id;
	private String location;
	private double rent;
	public House(int id, String location, double rent) {
		super();
		this.id = id;
		this.location = location;
		this.rent = rent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", location=" + location + ", rent=" + rent + "]";
	}
	
	
}
public class HouseMain {
public static void main(String[] args) {
	House p1=new House(101, "Location1", 10);
	House p2=new House(102, "Location2", 20);
	House p3=new House(103, "Location3", 30);
	House p4=new House(104, "Location4", 40);
	House p5=new House(105, "Product5", 50);
	House p6=new House(106, "Product6", 60);
	
	ArrayList<House>  l=new ArrayList<>();
	l.add(p1);
	l.add(p2);
	l.add(p3);
	l.add(p4);
	l.add(p5);
	l.add(p6);
	List<House> l1= l.stream().map(x->{x.setRent((x.getRent()/5)+x.getRent());
			 return x;}).toList();
	l1.forEach(w->System.out.println(w));
	
}
}

 