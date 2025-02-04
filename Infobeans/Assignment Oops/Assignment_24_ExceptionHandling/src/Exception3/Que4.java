package Exception3;

import java.util.Scanner;

class UnderageException extends RuntimeException {
	UnderageException(String message) {
        super(message);
    }
}
class DrivingLicense{
	int age;

	public DrivingLicense(int age) {
		super();
		this.age = age;
	}
	void verifyAge() {
		if (age <18) {
			throw new UnderageException("Error : You re not eligible"); 
		}
		else {
			System.out.println("You are eligible");
		}
	}
}
public class Que4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
        String name = scanner.nextLine();
        int userAge = Integer.parseInt(scanner.nextLine());
        
		DrivingLicense d1 =new DrivingLicense(userAge);
        d1.verifyAge();
        
		}
		catch(UnderageException e){
			System.out.println(e.getMessage());
		}
	}
}
