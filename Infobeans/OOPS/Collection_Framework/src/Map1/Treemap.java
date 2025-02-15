package Map1;

import java.util.TreeMap;
class Employee
{
	String name;
	int roll;
	public Employee(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return " "+name + " "+ roll ;
	}
	
}
public class Treemap {
public static void main(String[] args) {
	TreeMap<Integer,Employee> map=new TreeMap<>();
	map.put(101, new Employee("Harshita",1));
	map.put(102, new Employee("Harshit",2));
	map.put(103, new Employee("Harshi",3));
	map.put(104, new Employee("Harsh",4));
	System.out.println(map);
	
}
}
