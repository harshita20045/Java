package Collection3;

import java.util.ArrayList;
import java.util.Scanner;

class Hospital
{
	private int id;
	private String name;
	private String disease;
	private int age;
	public Hospital(int id, String name, String disease, int age) {
		super();
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.age = age;
	}
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
		this.name = name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", disease=" + disease + ", age=" + age + "]\n";
	}
	
	
}
public class HospitalMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		ArrayList<Hospital> l=new ArrayList<Hospital>();
		while(true){
		System.out.println("----Welcome To Hospital Patient Management System----");
		System.out.println("Press 1 --------> Adding new patients ");
		System.out.println("Press 2 --------> Displaying all patient records");
		System.out.println("Press 3 --------> Searching for patients by disease");
		System.out.println("Press 4 --------> Removing a discharged patient by ID");
		System.out.println("Press 5 --------> Finding the youngest patient");
		System.out.println("Press 6 --------> Exit");
		System.out.println();
		System.out.print("Enter Your Choice : ");
		int choice=Integer.parseInt(scanner.nextLine());
		if(choice == 6) {
			break;
		}
		switch (choice) {
		case 1: 
			  System.out.print("Enter Patient Id: ");
              int id =Integer.parseInt(scanner.nextLine()) ;
              System.out.print("Enter Patient name: ");
              String name = scanner.nextLine();
              System.out.print("Enter Disease anme: ");
              String disease = scanner.nextLine();
              System.out.print("Enter Patient Age: ");
              int age = Integer.parseInt(scanner.nextLine());
              Hospital h=new Hospital(id,name,disease,age);
              l.add(h);
              System.out.println("Added Successfully");
              
       break;
            
        case 2:
              System.out.println(l);
              
        break;
        
        
        case 3:
        	System.out.println("Enter Patient Disease");
        	String search=scanner.nextLine();
        	System.out.println("");
        	for(Hospital i : l) 
        	{
        		if(i.getDisease().equalsIgnoreCase(search)) {
        			System.out.println(i);
        		}
        	}
         break;
         
        case 4:
        	System.out.println("Enter id to discharge Patient : ");
        	int pId=Integer.parseInt(scanner.nextLine());
        	for(Hospital i:l) {
        		if(i.getId()==pId) {
        			l.remove(i);
        			System.out.println("Removed");
        			break;
        		}
        	}		
        	System.out.println(l);
        break;
        
        case 5:
        	int min=900;
        	for(Hospital i : l) 
        	{
        		
        		if(i.getAge()<min) {
        			min=i.getAge();
        		}
        		
        	}
        	for (Hospital i : l) {
				if(i.getAge()==min) {
					System.out.println(i);
				}
			}
		System.out.println();
		break;
		default:
		    System.out.println("Invalid choice");;
		}
		

		
	}
	}
}
