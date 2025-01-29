package Exception2;
import java.util.Scanner;

class InvalidAgeForDrivingLicenseException extends RuntimeException {
    InvalidAgeForDrivingLicenseException(String message) {
        super(message);
    }
}



class InvalidMarkForDrivingLicenseException extends RuntimeException {
    InvalidMarkForDrivingLicenseException(String message) {
        super(message);
    }
}

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int userAge = Integer.parseInt(scanner.nextLine());
        int mark = Integer.parseInt(scanner.nextLine());

        try {
           
            if (userAge <= 18) {
                throw new InvalidAgeForDrivingLicenseException("InvalidAgeForDrivingLicenseException: Age should be more than 18 years old");
            }
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkForDrivingLicenseException("InvalidMarkForDrivingLicenseException: Invalid mark");
            }
            if (mark <= 80) {
                throw new InvalidMarkForDrivingLicenseException("InvalidMarkForDrivingLicenseException: Mark should be more than 80");
            }
            System.out.println("Approved");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
