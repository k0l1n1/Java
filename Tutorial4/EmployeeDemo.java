package module1;
import java.util.Scanner;
class employee {
    int empId;
    String empName;
    double salary;
    employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }
    void displayEmployee() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }
}
public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter details of Employee 1 \nID : ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name : ");
        String name1 = sc.nextLine();
        System.out.print("Salary : ");
        double sal1 = sc.nextDouble();
        System.out.print("\nEnter details of Employee 2 \nID : ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name : ");
        String name2 = sc.nextLine();
        System.out.print("Salary : ");
        double sal2 = sc.nextDouble();
        employee e1 = new employee(id1, name1, sal1);
        employee e2 = new employee(id2, name2, sal2);
        System.out.println("\nEmployee Details");
        e1.displayEmployee();
        System.out.println();
        e2.displayEmployee();
	}
}
