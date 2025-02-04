/*Sampad wants to implement a program that takes input for a student's name and grade, validates the input, and then displays the grade for the given student.

1.	The grade should be an integer value.
2.	The program should validate the grade using the validateGrade() method. The method should throw an IllegalArgumentException if the grade is less than 0 or greater than 100.
3.	If the input is invalid due to a non-integer grade, catch the NumberFormatException and print the built-in exception message.
4.	If the input is invalid due to an out-of-range grade, catch the IllegalArgumentException and print the built-in exception message.
5.	Catch the exceptions using the multi-catch block.

Assist Sampad to implement this program.
Input format :
The first line of input consists of a string, representing the student's name.
The second line consists of an integer, representing the student's grade.
Output format :
If the input is valid and the grade is within the allowed range, print "Grade for [student name]: [grade]".
If there is an exception related to invalid input, print "Invalid input: " followed by the built-in exception message.
If the grade is outside the allowed range, print "Invalid grade: " followed by the built-in exception message.

Refer to the sample output for formatting specifications.
Code constraints :
length of input string ≤ 10
Sample test cases :
Input 1 :
Alice
85
Output 1 :
Grade for Alice: 85
Input 2 :
Bob
abc
Output 2 :
Invalid input: For input string: "abc"
Input 3 :
Eve
120
Output 3 :
Invalid grade: Invalid grade: 120
Input 4 :
John
-5
Output 4 :
Invalid grade: Invalid grade: -5

*/
package Exception3;
import java.util.Scanner;

class Student {
    String name;
    int grade;

   
    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

  
    void validateGrade() {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Invalid grade: " + grade);
        }
        System.out.println("Grade for " + name + ": " + grade);
    }
}

public class Que2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();
            
           
           
            System.out.print("Enter student's grade: ");        
            int grade = Integer.parseInt(scanner.nextLine()); 

            Student s1 = new Student(name, grade);
            s1.validateGrade();

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid grade: " + e.getMessage());
        } 
    }
}
