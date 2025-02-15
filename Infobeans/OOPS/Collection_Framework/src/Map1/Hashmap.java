package Map1;


import java.util.HashMap;

class Employee1
{
	String name;
	int roll;
	public Employee1(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return " "+name + " "+ roll ;
	}
	
}
public class Hashmap {
public static void main(String[] args) {
	HashMap<Integer,Employee1> map=new HashMap<>();
	map.put(101, new Employee1("Harshita",1));
	map.put(102, new Employee1("Harshit",2));
	map.put(103, new Employee1("Harshi",3));
	map.put(104, new Employee1("Harsh",4));
	System.out.println(map);
	
}
}
