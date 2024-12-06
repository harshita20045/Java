import java.util.Scanner;

public class School {
    String name;
    int roll_no, p, c, m, h, e;
    int total;
    float avg;

    // Function to get data from the user
    void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        roll_no = scanner.nextInt();

        System.out.print("Marks of Physics: ");
        p = scanner.nextInt();

        System.out.print("Marks of Chemistry: ");
        c = scanner.nextInt();

        System.out.print("Marks of Mathematics: ");
        m = scanner.nextInt();

        System.out.print("Marks of Hindi: ");
        h = scanner.nextInt();

        System.out.print("Marks of English: ");
        e = scanner.nextInt();
    }

    // Function to process data: calculate total and average
    void process() {
        total = p + c + m + h + e;
        avg = total / 5.0f;
    }

    // Function to display student details
    void putData() {
        System.out.println("\nName: " + name);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Physics: " + p);
        System.out.println("Chemistry: " + c);
        System.out.println("Mathematics: " + m);
        System.out.println("Hindi: " + h);
        System.out.println("English: " + e);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        String topperName = "";
        int topperRollNo = 0;
        float highestAvg = 0;

        for (int i = 0; i < n; i++) {
            School student = new School();

            System.out.println("\nEnter details for student " + (i + 1));
            student.getData();
            student.process();
            student.putData();

            if (highestAvg == 0 || student.avg > highestAvg) {
                highestAvg = student.avg;
                topperName = student.name;
                topperRollNo = student.roll_no;
            }
        }

        System.out.println("\n****** Class Topper ******");
        System.out.println("Topper Name: " + topperName);
        System.out.println("Topper Roll Number: " + topperRollNo);
        System.out.println("Topper Average: " + highestAvg);
    }
}
