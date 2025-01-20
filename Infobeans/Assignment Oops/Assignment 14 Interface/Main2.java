import java.util.Scanner;

interface Ride 
{
    double calculateFare(double distance);
}

class BikeRide implements Ride 
{
    public double calculateFare(double distance) 
	{
        return distance * 1.5;  
    }
}

class CarRide implements Ride 
{
    public double calculateFare(double distance) 
	{
        return distance * 5.0;  
    }
}

class SharedRide implements Ride 
{
    public double calculateFare(double distance) 
	{
        return distance * 2.5; 
    }
}

class Main2 
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Fare Calculation System :");
		System.out.println("----------------> bike");
		System.out.println("----------------> car");
		System.out.println("----------------> shared");
        System.out.print("Enter ride type : ");	
        String rideType = s.nextLine();
        
        System.out.print("Enter distance in kilometers: ");
        double distance = s.nextDouble();
        
        Ride r;
        switch (rideType) {
            case "bike":
                r = new BikeRide();
                break;
            case "car":
                r = new CarRide();
                break;
            case "shared":
                r = new SharedRide();
                break;
            default:
                System.out.println("Invalid ride type. Please enter bike, car, or shared.");
              
                return;
        }
        
        double fare = r.calculateFare(distance);
        System.out.println("Total Fare: Rs. " + fare);
      
    }
}
