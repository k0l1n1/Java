package PracticeQuestion6;
import Demo.Employee;
public class Manager extends Employee {

    Manager(double sal) {
        super(sal);
    }

    void displayManagerSalary() {

        System.out.println("Manager Salary: " + salary);

        displaySalary();
    }

    public static void main(String[] args) {

        Manager obj = new Manager(50000);

        obj.displayManagerSalary();
    }
}
