package electricityBill;

import java.util.Scanner;

class Bill {

	private String consumer_no;
	private String consumerName;
	private String purpose;
	private String consume_address;
	private String consumer_mobile;
	private String consumer_email;
	private String connection_type;
	private String meter_no;
	private String bill_no;
	private String bill_month;
	private String bill_date;
	private int reading;
	private double averageUnit;
	//private int energy_charge;
	//private String fixed_charge;
	private String current_bill;
	private String subsidy;

	public Bill(String consumer_no, String consumerName, String consume_address,String consumer_email, String consumer_mobile, String meter_no, String bill_month, String bill_date ,int reading) {

		this.consumer_no = consumer_no;
		this.consumerName = consumerName;
		this.consume_address = consume_address;
		this.consumer_mobile = consumer_mobile;
		this.consumer_email = consumer_email;
		this.meter_no = meter_no;
		this.bill_month = bill_month;
		this.bill_date = bill_date;
		this.reading = reading;
	}

	public double energy_charge() {
		if (reading <= 30) {
			return reading * 3.34;
		} else if (reading >= 30 && reading <= 50) {
			return reading * 4.27;

		} else if (reading >= 51 && reading <= 150) {
			return reading * 5.23;

		} else if (reading >= 151 && reading <= 300) {
			return reading * 6.61;

		} else {
			return reading * 6.80;
		}

	}
	public double fixed_charge() {
		if (reading <= 30) {
			return 0;
		} else if (reading >= 30 && reading <= 50) {
			return 71;
			
		} else if (reading >= 51 && reading <= 150) {
			return 124;
			
		} else if (reading >= 151 && reading <= 300) {
			return 124;
			
		} else {
			return 124;
		}
		
	}

	void display() {
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("|                                                                                   |");
		System.out.println("|            Madhya Pradesh Pashcim Kshetra Vidhyut Vitran Company Ltd.             |");
		System.out.println("|                   G.P.H   Compound, Pologround, Indore (M.P.)                     |");
		System.out.println("|                        (Wholly Owned by Govt. of M.P.)                            |");
		System.out.println("|   Call Center No. 1912                                    https://www.mpwz.co.in  |");
		System.out.println("|                                                                                   |");
		System.out.println("|-----------------------------------------------------------------------------------|");
		System.out.println("|                                                                                   |");
		System.out.println("|  Security Deposited:                                      Date :                  |");
		System.out.println("|                                                                                   |");
		System.out.println("|-----------------------------------------------------------------------------------|");
		System.out.println("|Consumer No. " + consumer_no + "                                                    ");
		System.out.println("|Purpose: " + purpose + "                                                            ");
		System.out.println("|Mr./Ms. " + consumerName + "                                                        ");
		System.out.println("|" + consume_address + "                                                             ");
		System.out.println("|                                                                                    ");
		System.out.println("|Mobile No. " + consumer_mobile + "                                                  ");
		System.out.println("|Email Id: " + consumer_email + "                                                    ");
		System.out.println("|                                                                                    ");
		System.out.println("|------------------------------------------------------------------------------------");
		System.out.println("|Connection Type: " + connection_type + "                                            ");
		System.out.println("|Meter serial No: " + meter_no + "                                                   ");
		System.out.println("|Division: Indore north                                                              ");
		System.out.println("|----------------------------------------------------------------------------------- ");
		System.out.println("|Customer Care Detail :                                                              ");
		System.out.println("|Call Center No. 1912                                                                ");
		System.out.println("|Assistant Engineer : Mr/Ms. Rakesh Shah (7312381171)                                ");
		System.out.println("|Executive Engineer : Mr.Ms. Yogesh Aathnere (7312480201)                            ");
		System.out.println("|------------------------------------------------------------------------------------");
		System.out.println("|Bill No. " + bill_no + "                                                            ");
		System.out.println("|Bill Month. " + bill_month + "                                                      ");
		System.out.println("|Bill Date : " + bill_date + "                                                       ");
		System.out.println("|Bill Type : Actual Bill                                                             ");
		System.out.println("|Read Type : NORMAL                                                                  ");
		System.out.println("|------------------------------------------------------------------------------------");
		System.out.println("|Meter Unit Reading : " + reading + "                                                ");
		System.out.println("|Average Unit Per Day : " + averageUnit + "                                          ");
		System.out.println("|------------------------------------------------------------------------------------");
		System.out.println("|____________________________________________________________________________________");
		System.out.println("|Billing Details                         |                                           ");
		System.out.println("|________________________________________|___________________________________________");
		System.out.println("|Energy Charges                          |               "+energy_charge() +"        ");
		System.out.println("|Fixed Charge                            |               "+fixed_charge()+"          ");
		System.out.println("|Additional SD installment               |                0.0                        ");
		System.out.println("|Other Charges                           |                0.0                        ");
		System.out.println("|Current Month Bill Amount               |               "+(energy_charge()+fixed_charge()));
		System.out.println("|M.P. Govt. Subsidy Amount               |               "+subsidy+"                 ");
		System.out.println("|CCB Adjustment                          |                0.0                        ");
		System.out.println("|Lock Credit/Employee Rebate (-)         |                0.0                        ");
		System.out.println("|Previous Month Delayed Payment Subcharge|                0.0                        ");
		System.out.println("|------------------------------------------------------------------------------------");
		System.out.println("|Current Month Bill Amount               |                                           ");
		System.out.println("|Old Dues                                |                                           ");
		System.out.println("|Amount Recived against Bill             |                                           ");
		System.out.println("|___________________________________________________________________________________ ");
		System.out.println("|                                                                                   |");
		System.out.println("|-----------------------------------------------------------------------------------|");
		System.out.println("| ____  _____            ____                                                       |");
		System.out.println("||     |     | \\      / |                                                          |");
		System.out.println("||____ |_____|  \\    /  |___                                                       |");
		System.out.println("|     ||     |   \\  /   |                                                          |");
		System.out.println("|_____||     |    \\/    |____                                                      |");
		System.out.println("|                   ____         ___  ___  ____                                     |");
		System.out.println("|                   |    |\\   | |   |   | |       \\   /                           |");
		System.out.println("|                   |__  | \\  | |__ |___| |    _   \\ /                            |");
		System.out.println("|                   |    |  \\ | |   | \\  |   | |    /                             |");
		System.out.println("|                   |___ |   \\| |___|  \\ |___| |   /                              |");
		System.out.println("|                                                                                   |");
		System.out.println("|                                                                                   |");
		System.out.println("|                                                                                   |");
		System.out.println("|                                                                                   |");
	    System.out.println("|-----------------------------------------------------------------------------------|");

	}

}

public class ElectricBill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String consumer_no;
		String consumerName;
		String consume_address;
		String consumer_mobile;
		String consumer_email;
		String meter_no;
		String bill_month;
		String bill_date;
		int reading;

		System.out.println("WELCOME TO MADHYA PRADESH PASCHIM KSHETRA VIDHYUT VITRAN COMPANY Ltd.");
		System.out.println();
		int choice = 0;
		while (true) {

			do {
				System.out.println();
				System.out.println("Select Bill type : ");
				System.out.println("1. Domestic  ");
				System.out.println("2. Commercial ");
				System.out.println(" ");
				System.out.print("Enter your choice : ");
				try {
					choice = Integer.parseInt(scanner.nextLine());
				} catch (NumberFormatException e) {
					System.out.println();
					System.err.println("Integer Value Required");
					System.out.println();
				}
				if (choice != 1 && choice != 2) {
					System.out.println();
					System.out.println("Invalid Choice enter(1 or 2)");
				}
			} while (choice != 1 && choice != 2);
			System.out.println();

			System.out.println("------------------------------Enter Your Details---------------------------- ");

			System.out.println();
			System.out.print("Consumer No. :");
			consumer_no = scanner.nextLine();
			System.out.print("Name :");
			consumerName = scanner.nextLine();
			System.out.print("Address :");
			consume_address = scanner.nextLine();
			System.out.print("Mobile No. :");
			consumer_mobile = scanner.nextLine();
			System.out.print("Email :");
			consumer_email = scanner.nextLine();
			System.out.print("Meter No. :");
			meter_no = scanner.nextLine();
			System.out.print("Month :");
			bill_month = scanner.nextLine();
			System.out.print("Date :");
			bill_date = scanner.nextLine();
			System.out.print("Reading :");
			reading = Integer.parseInt(scanner.nextLine());
			Bill b = new Bill(consumer_no, consumerName, consume_address,consumer_email, consumer_mobile, meter_no, bill_month,
					bill_date, reading);
			b.display();
		}
	}
}
