package Collection3;

import java.util.LinkedList;
import java.util.Scanner;

class Passenger{
	private int ticketNumber;
	private String name;
	private String source;
	private String destination;
	private int seatNumber;
	public Passenger(int ticketNumber, String name, String source, String destination, int seatNumber) {
		super();
		this.ticketNumber = ticketNumber;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.seatNumber = seatNumber;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	@Override
	public String toString() {
		return "Passenger [ticketNumber=" + ticketNumber + ", name=" + name + ", source=" + source + ", destination="
				+ destination + ", seatNumber=" + seatNumber + "]";
	}
	
	
}
public class Railway {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		LinkedList<Passenger> l=new LinkedList<Passenger>();
		while(true){
		System.out.println("---- Welcome To Railway Reservation System ----");
		System.out.println("Press 1 --------> Add new reservations at the end of the list ");
		System.out.println("Press 2 --------> Cancel a reservation by ticketNumber");
		System.out.println("Press 3 --------> Display all reserved tickets");
		System.out.println("Press 4 --------> Exit");
		System.out.println();
			
		System.out.print("Enter Your Choice : ");
		int choice=Integer.parseInt(scanner.nextLine());
		if(choice == 4) {
			break;
		}
		switch (choice) {
		case 1: 
			  System.out.print("Enter Ticket number: ");
              int ticketNumber =Integer.parseInt(scanner.nextLine()) ;
              System.out.print("Enter Name: ");
              String name = scanner.nextLine();
              System.out.print("Enter Source: ");
              String source = scanner.nextLine();
              System.out.print("Enter Destination ");
              String destination = scanner.nextLine();
              System.out.print("Enter Seat Number ");
              int seatNumber = Integer.parseInt(scanner.nextLine());
              Passenger p=new Passenger(ticketNumber,name,source,destination,seatNumber);
              l.add(p);
              System.out.println("Reservation Successfull");
              
       break;
            
        
        case 2:
        	System.out.print("Enter ticketNumber for cancel a reservation :");
        	int search=Integer.parseInt(scanner.nextLine());
        	System.out.println();
        	for(Passenger i : l) 
        	{
        		if(i.getTicketNumber()==search) {
        			l.remove(i);
        			System.out.println("Reservation Cancelled ");
        			break;
        		}
        	}
         break;
         
        
        case 3:
        	for(Passenger i : l) 
        	{
        		System.out.println(i);
        	}
       
		System.out.println();
		break;
		default:
		    System.out.println("Invalid choice");;
		}
		

		
	}
		System.out.println("THANK YOU FOR VISITING");
	}

}
