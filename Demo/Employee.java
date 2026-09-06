package Demo;
public class Employee {
    protected double salary;
    public Employee(double sal) {
        salary = sal;
    }
    protected void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}
