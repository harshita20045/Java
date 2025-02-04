/*Assignment 4:
Create a parent class Vehicle with a method speed() that prints "Speed varies for different vehicles."
Create subclasses:
Car that overrides speed() to print "The car speed is 120 km/h."
Bike that overrides speed() to print "The bike speed is 80 km/h."
Use polymorphism to display the speed of different vehicles in the Main class.
*/

class Vehicle 
{
    void speed() 
	{
        System.out.println("Speed varies for different vehicles.");
    }
}

class Car extends Vehicle 
{
    void speed() 
	{
        System.out.println("The car speed is 120 km/h.");
    }
}

class Bike extends Vehicle 
{
   
    void speed() 
	{
        System.out.println("The bike speed is 80 km/h.");
    }
}

class Main_vehicle 
{
    public static void main(String[] args) 
	{
        Vehicle v1 = new Car();  
        Vehicle v2 = new Bike(); 
        Vehicle v3 = new Vehicle(); 

        v1.speed(); 
        v2.speed(); 
        v3.speed(); 
    }
}
