package Collection2;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String employeeName;
    private int employeeId;
    private String employeeDepartment;
    
    public Employee(String employeeName, int employeeId, String employeeDepartment) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeDepartment = employeeDepartment;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    public String getEmployeeDepartment() {
        return employeeDepartment;
    }
    
    @Override
    public String toString() {
        return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeDepartment=" + employeeDepartment + "]";
    }
}

public class Que4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String name = scanner.nextLine();
            int id = scanner.nextInt();
            scanner.nextLine();
            String department = scanner.nextLine();
            employees.add(new Employee(name, id, department));
        }
        System.out.println("List of All Employees");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
      
    }
}
