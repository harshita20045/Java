package Ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Passenger {
	int trainNumber;
	String name;
	String source;
	String destination;
	String dob;
	String doj;
	int seatNumber;
	double amount;
	String ticketStatus;
	Scanner sc = new Scanner(System.in);

	public Passenger(int trainNumber, String name, String source, String destination, String dob, String doj,
			double amount, String ticketStatus) {
		super();
		this.trainNumber = trainNumber;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.dob = dob;
		this.doj = doj;
		this.amount = amount;
		this.ticketStatus = ticketStatus;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	@Override
	public String toString() {
		return "\ntrainNumbe r = " + trainNumber + "\nname = " + name + "\nsource = " + source + "\ndestination = "
				+ destination + "\ndob = " + dob + "\ndoj = " + doj + "\namount = " + amount + "\nticketStatus = "
				+ ticketStatus;
	}


}

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Long, Passenger> m = new HashMap<>();
		ArrayList<Map> conf=new ArrayList<Map>(); 
		System.out.println();
		System.out.println("-----------------------------------WELCOME-------------------------------------------");
		int again = 0;
		do {
			System.out.println("Press 1--> For Booking ");
			System.out.println("Press 2--> List of passengers with ticketStatus as confirmed");
			System.out.println("Press 3--> List of passengers with ticketStatus as Waiting ");
			System.out.println("Press 4--> List of passengers with ticketStatus as RSC ");
			System.out.println("Press 5--> for the passenger whose status is waiting,  the seatNumber should be NULL ");
			System.out.println("Press 6--> Display the count of booking made for 10-Feb-25 ");
			System.out.println("Press 7--> Display how much amount is collected for Jan month ");
			System.out.println("Press 8--> Display all booking made for a trainer no. 17655 ");
			System.out.println("Press 9--> Display all bookings  based on Train name ");
			System.out.println("Press 10--> Display all booking based on doj ");
			System.out.println();
			System.out.print("Enter your choice :");
			int choice = Integer.parseInt(scanner.nextLine());
			long pnr;
			switch (choice) {
			case 1:
				System.out.print("Enter train Number : ");
				int trainNumber = Integer.parseInt(scanner.nextLine());
				System.out.print("Enter train Name : ");
				String name = scanner.nextLine();
				System.out.print("Enter Source : ");
				String source = scanner.nextLine();
				System.out.print("Enter Destination : ");
				String destination = scanner.nextLine();
				System.out.print("Enter Date of Booking : ");
				String dob = scanner.nextLine();
				System.out.print("Enter Date of Journey : ");
				String doj = scanner.nextLine();
				System.out.print("Enter Amount : ");
				double amount = Double.parseDouble(scanner.nextLine());
				System.out.print("Enter ticket Status : ");
				String ticketStatus = scanner.nextLine();
              
				pnr = (long) (Math.random() * (10000000000l - 999999999 + 1)) + 999999999;
//				if (pnr >= 1683497489l && pnr <= 3468754678l) {
//					ticketStatus = "Waiting";
//				} else if (pnr <= 4537538637l) {
//					ticketStatus = "RSC";
//				} else {
//					ticketStatus = "Confirmed";
//				}
				
				m.put(pnr, new Passenger(trainNumber, name, source, destination, dob, doj, amount,ticketStatus));
				  if(ticketStatus.equalsIgnoreCase("Confirmed")) 
	                {
	                	conf.add(m);
	                }
				  
				break;
			case 2:
//				System.out.println("List of passengers with ticketStatus as confirmed");
				Iterator itr=conf.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				
				break;
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11: System.out.println("");
			case 12:

			}
			again = Integer.parseInt(scanner.nextLine());
		} while (again != 0);
	}
}
