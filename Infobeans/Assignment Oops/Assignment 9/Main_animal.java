/*2.
Create a parent class Animal with a method makeSound() that prints "Some generic sound."
Create subclasses:
Dog that overrides makeSound() to print "Woof Woof."
Cat that overrides makeSound() to print "Meow Meow."
In the Main class, use polymorphism to call makeSound() on different Animal objects.*/

class Animal 
{
    void makeSound() 
	{
        System.out.println("Some generic sound.");
    }
}

class Dog extends Animal 
{
    void makeSound() 
	{
        System.out.println("Woof Woof.");
    }
}

class Cat extends Animal 
{
  
    void makeSound() 
	{
        System.out.println("Meow Meow.");
    }
}

public class Main 
{
    public static void main(String[] args) 
	{
        Animal animal1 = new Dog();  
        Animal animal2 = new Cat();  
        Animal animal3 = new Animal();  

        animal1.makeSound();  
        animal2.makeSound(); 
        animal3.makeSound();  
    }
}
