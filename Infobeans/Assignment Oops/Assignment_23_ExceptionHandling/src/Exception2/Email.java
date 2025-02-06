package Exception2;
import java.util.Scanner;

class DotException extends RuntimeException {
    DotException(String message) {
        super(message);
    }
}

class AtTheRateException extends RuntimeException {
    AtTheRateException(String message) {
        super(message);
    }
}

class DomainException extends RuntimeException {
    DomainException(String message) {
        super(message);
    }
}

public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        try {
            if (!email.contains(".")) {
                throw new DotException("DotException: Invalid Dot usage");
            }
            if (!email.contains("@") ) {
                throw new AtTheRateException("AtTheRateException: Invalid @ usage");
            }
            if (!(email.endsWith(".in") || email.endsWith(".com") || email.endsWith(".net") || email.endsWith(".biz"))) {
                throw new DomainException("DomainException: Invalid Domain");
            }
            System.out.println("Valid email address");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid email address");
        }
    }
}
