package Method;
public class Example {
	 public static void main(String[] args) {  
	        double x = 28;  
	        double y = 4;  
	        // Basic arithmetic operations  
	        System.out.println("Addition: " + (x + y));  
	        System.out.println("Subtraction: " + (x - y));  
	        System.out.println("Multiplication: " + (x * y));  
	        System.out.println("Division: " + (x / y));  
	        // Square root  
	        System.out.println("Square root of " + x + ": " + Math.sqrt(x));  
	        // Cube root  
	        System.out.println("Cube root of " + x + ": " + Math.cbrt(x));  
	        // Power  
	        System.out.println("Power of " + x + " to " + y + ": " + Math.pow(x, y));  
	        // Trigonometric functions  
	        double angle = 45.0;  
	        double radian = Math.toRadians(angle);  
	        System.out.println("Sine of " + angle + " degrees: " + Math.sin(radian));  
	        System.out.println("Cosine of " + angle + " degrees: " + Math.cos(radian));  
	        System.out.println("Tangent of " + angle + " degrees: " + Math.tan(radian));  
	        // Rounding  
	        double value = -123.456;  
	        System.out.println("Absolute value of " + value + ": " + Math.abs(value));  
	        System.out.println("Ceil value of " + value + ": " + Math.ceil(value));  
	        System.out.println("Floor value of " + value + ": " + Math.floor(value));  
	        System.out.println("Round value of " + value + ": " + Math.round(value));  
	        // Random numbers  
	        System.out.println("Random number between 0.0 and 1.0: " + Math.random());  
	        System.out.println("Random number between 0 and 100: " + (int) (Math.random() * 100));  
	        // Maximum and minimum  
	        double[] numbers = {10.5, 20.7, 5.2, 30.9};  
	        System.out.println("Maximum value: " + Math.max(numbers[0], Math.max(numbers[1], Math.max(numbers[2], numbers[3]))));  
	        System.out.println("Minimum value: " + Math.min(numbers[0], Math.min(numbers[1], Math.min(numbers[2], numbers[3]))));  
	        // Exponential and logarithmic functions  
	        System.out.println("e^" + x + ": " + Math.exp(x));  
	        System.out.println("Logarithm base 10 of " + x + ": " + Math.log10(x));  
	        System.out.println("Logarithm base e of " + x + ": " + Math.log(x));  
	        // Hypotenuse  
	        double side1 = 3.0;  
	        double side2 = 4.0;  
	        System.out.println("Hypotenuse of a right triangle with sides " + side1 + " and " + side2 + ": " + Math.hypot(side1, side2));  
	        // Trigonometric functions (inverse)  
	        double sinValue = 0.5;  
	        System.out.println("Arcsine of " + sinValue + ": " + Math.toDegrees(Math.asin(sinValue)));  
	        System.out.println("Arccosine of " + sinValue + ": " + Math.toDegrees(Math.acos(sinValue)));  
	        System.out.println("Arctangent of " + sinValue + ": " + Math.toDegrees(Math.atan(sinValue)));  
	        // Constants  
	        System.out.println("Value of PI: " + Math.PI);  
	        System.out.println("Value of E: " + Math.E);  
	        int positiveNumber = 24;
	        int negativeNumber = -42;
	        double decimalLarge = 123.456;
	        double decimalSmall = 0.567;

	        // Display the original values
	        System.out.println("Positive number: " + positiveNumber);
	        System.out.println("Negative number: " + negativeNumber);

	        // Absolute values
	        System.out.println("Absolute of " + negativeNumber + ": " + Math.abs(negativeNumber));
	        System.out.println("Absolute of " + decimalSmall + ": " + Math.abs(decimalSmall));

	        // Rounding functions
	        System.out.println(decimalLarge + " rounded is " + Math.round(decimalLarge));
	        System.out.println(decimalSmall + " rounded is " + Math.round(decimalSmall));

	        // Ceiling and floor functions
	        System.out.println("Ceiling of " + decimalSmall + ": " + Math.ceil(decimalSmall));
	        System.out.println("Floor of " + decimalLarge + ": " + Math.floor(decimalLarge));

	        // Minimum and maximum
	        System.out.println("Minimum of " + positiveNumber + " and " + negativeNumber + ": " + Math.min(positiveNumber, negativeNumber));
	        System.out.println("Maximum of " + decimalLarge + " and " + decimalSmall + ": " + Math.max(decimalLarge, decimalSmall));

	        // Trigonometric operations
	        double angleDegrees = 60.0;
	        double angleRadians = Math.toRadians(angleDegrees);
	        System.out.println("Sine of " + angleDegrees + " degrees: " + Math.sin(angleRadians));
	        System.out.println("Cosine of " + angleDegrees + " degrees: " + Math.cos(angleRadians));

	        // Inverse trigonometric operations
	        double value1 = 0.5;
	        System.out.println("Arcsine of " + value1 + ": " + Math.asin(value1));
	        System.out.println("Arccosine of " + value1 + ": " + Math.acos(value1));
	        System.out.println("Arctangent of " + value1 + ": " + Math.atan(value1));

	        // Exponential and logarithmic
	        System.out.println("e raised to " + positiveNumber + ": " + Math.exp(positiveNumber));
	        System.out.println("Natural log of " + positiveNumber + ": " + Math.log(positiveNumber));
	        System.out.println("Log base 10 of " + positiveNumber + ": " + Math.log10(positiveNumber));

	        // Power and square root
	        System.out.println(positiveNumber + " to the power of 3: " + Math.pow(positiveNumber, 3));
	        System.out.println("Square root of " + positiveNumber + ": " + Math.sqrt(positiveNumber));

	        // Random number generation
	     System.out.println("Random number: " + Math.random());

	        // Additional methods
	        double hypotenuse = Math.hypot(positiveNumber, negativeNumber);
	        System.out.println("Hypotenuse of a right triangle with sides " + positiveNumber + " and " + negativeNumber + ": " + hypotenuse);

	        double base = 2;
	        double exponent = 8;
	        double result = Math.scalb(base, (int)exponent);
	        System.out.println("Scaling " + base + " by 2 to the power of " + exponent + ": " + result);

	        // Constants
	        System.out.println("Pi: " + Math.PI);
	        System.out.println("Euler's number e: " + Math.E);
	    
	    }  
}
