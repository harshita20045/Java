package Jan_29;

import java.util.Objects;

class Person{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
       public String toString() {
    	   return getId()+" : "+getName();
       }
	
	
//	int id;
//	String name;	
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}

	
	
	
	/*public String toString() {
		return  id +" : "+name ;
	}*/
	
}
class Student extends Person{

//	String tension;
//	Student(int id, String name,String tension) {
//		super(id, name);
//		this.tension=tension;
//	}
	
	private String tension;

	public String getTension() {
		return tension;
	}

	public void setTension(String tension) {
		this.tension = tension;
	}
	
	
	/*public String toString() {
		return super.toString()+" : "+tension;
	}*/
	
	public String toString() {
 	   return super.toString()+" : "+getTension();
    }
	
}
class Mastikhor extends Student{

//	String party;
//	Mastikhor(int id, String name, String tension,String party) {
//		super(id, name, tension);
//		this.party=party;	
//	}
	
	private String party;
	
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	/*public String toString() {
		return super.toString()+" : "+party;
	}*/
	public String toString() {
		return super.toString()+" : "+getParty();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(party);
	}
	
	
	
	public boolean equals(Mastikhor m) {
		return getId()==m.getId()&&getName()==m.getName()&&getTension()==m.getTension()&&getParty()==m.getParty();
	}
		
}
public class Demo1 {

	public static void main(String[] args) {
		
//		Mastikhor m1=new Mastikhor(101,"rashmika","bohot","yes");
//		Mastikhor m2=new Mastikhor(101,"rashmika","bohot","yes");
		//System.out.println (m1);
//		System.out.println (m1.hashCode());
//		System.out.println (m1==m2);
//		System.out.println (m1.equals(m2));
		
		Mastikhor m1=new Mastikhor();
		m1.setId(101);
		m1.setName("Rashmika");
		m1.setTension("bohot");
		m1.setParty("yes");
		System.out.println(m1);
		System.out.println(m1.hashCode());
		
		
		Mastikhor m2=new Mastikhor();
		m2.setId(101);
		m2.setName("Rashmika");
		m2.setTension("bohot");
		m2.setParty("no");
		System.out.println(m2);
		System.out.println(m2.hashCode());
		
		
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
	}
}
