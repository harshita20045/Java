package electricityBill;

import java.util.Scanner;

public class Main {
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
			
			switch(choice) 
			{
			case 1:Domestic d=new Domestic(consumer_no, consumerName, consume_address,consumer_email, consumer_mobile, meter_no, bill_month,
					bill_date, reading);
			d.display();
				break;
			case 2:Commercial c=new Commercial(consumer_no, consumerName, consume_address,consumer_email, consumer_mobile, meter_no, bill_month,
					bill_date, reading);
			c.display();
				break;
			}
			
			System.out.println("If you want to generate more bill than enter 1 else any number : ");
			int a=scanner.nextInt();
			if(a==1) {
				break;
			}
		}
		System.out.println("THANKS FOR VISITING");
	}
	}
