package electricityBill;

public class Domestic {

	private String consumer_no;
	private String consumerName;
	//private String purpose;
	private String consume_address;
	private String consumer_mobile;
	private String consumer_email;
	//private String connection_type;
	private String meter_no;
	private String bill_no;
	private String bill_month;
	private String bill_date;
	private int reading;
	//private double averageUnit;
	//private int energy_charge;
	//private String fixed_charge;
	//private String current_bill;
	//private String subsidy;

	public Domestic(String consumer_no, String consumerName, String consume_address,String consumer_email, String consumer_mobile, String meter_no, String bill_month, String bill_date ,int reading) {

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
	public double subsidy() {
		if(reading<=100)
		{
			return energy_charge()-500;
		}
		else {
			return 0.0;
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
		System.out.println("|  Security Deposited:                                      Date : "+bill_date+"   |");
		System.out.println("|                                                                                   |");
		System.out.println("|-----------------------------------------------------------------------------------|");
		System.out.println("|Consumer No. " + consumer_no + "                                                    ");
		System.out.println("|Purpose: Domestic light and fan                                                     ");
		System.out.println("|Mr./Ms. " + consumerName + "                                                        ");
		System.out.println("|" + consume_address + "                                                             ");
		System.out.println("|                                                                                    ");
		System.out.println("|Mobile No. " + consumer_mobile + "                                                  ");
		System.out.println("|Email Id: " + consumer_email + "                                                    ");
		System.out.println("|                                                                                    ");
		System.out.println("|------------------------------------------------------------------------------------");
		System.out.println("|Connection Type: Domestic                                                           ");
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
		System.out.println("|Average Unit Per Day : " + (reading/30.0) + "                                       ");
		System.out.println("|------------------------------------------------------------------------------------");
		System.out.println("|____________________________________________________________________________________");
		System.out.println("|Billing Details                         |                                           ");
		System.out.println("|________________________________________|___________________________________________");
		System.out.println("|Energy Charges                          |               "+energy_charge() +"        ");
		System.out.println("|Fixed Charge                            |               "+fixed_charge()+"          ");
		System.out.println("|Additional SD installment               |                0.0                        ");
		System.out.println("|Other Charges                           |                0.0                        ");
		System.out.println("|Current Month Bill Amount               |               "+(energy_charge()+fixed_charge()));
		System.out.println("|M.P. Govt. Subsidy Amount               |               "+subsidy()+"                 ");
		System.out.println("|CCB Adjustment                          |                0.0                        ");
		System.out.println("|Lock Credit/Employee Rebate (-)         |                0.0                        ");
		System.out.println("|Previous Month Delayed Payment Subcharge|                0.0                        ");
		System.out.println("|------------------------------------------------------------------------------------");
		System.out.println("|Current Month Bill Amount               |               "+((energy_charge()+fixed_charge())-subsidy()));
		System.out.println("|Old Dues                                |                0.0                           ");
		System.out.println("|Amount Recived against Bill             |               "+((energy_charge()+fixed_charge())-subsidy()));
		System.out.println("|___________________________________________________________________________________ ");
		System.out.println("|                                                                                   |");
		System.out.println("|-----------------------------------------------------------------------------------|");
		System.out.println("| ____  _____            ____                                                       |");
		System.out.println("||     |     | \\      / |                                                          |");
		System.out.println("||____ |_____|  \\    /  |___                                                       |");
		System.out.println("|     ||     |   \\  /   |                                                          |");
		System.out.println("|_____||     |    \\/    |___                                                       |");
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

