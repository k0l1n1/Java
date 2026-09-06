package PracticeQuestion7;
import java.util.Scanner;
class employee {
    String name;
    String address;
    int age;
    int mob;
    float sal;
    void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}
class officer extends employee {
    String spl;
    void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }
}
class manager extends employee {
    String dep;
    void print_Dept() {
        System.out.println("Department: " + dep);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        officer off = new officer();
        System.out.print("Enter Officer's Name: ");
        off.name = sc.nextLine();
        System.out.print("Enter Address: ");
        off.address = sc.nextLine();
        System.out.print("Enter Age: ");
        off.age = sc.nextInt();
        System.out.print("Enter Mobile: ");
        off.mob = sc.nextInt();
        System.out.print("Enter Salary: ");
        off.sal = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter Specialization: ");
        off.spl = sc.nextLine();
        manager man = new manager();
        System.out.print("Enter Manager's Name: ");
        man.name = sc.nextLine();
        System.out.print("Enter Address: ");
        man.address = sc.nextLine();
        System.out.print("Enter Age: ");
        man.age = sc.nextInt();
        System.out.print("Enter Mobile: ");
        man.mob = sc.nextInt();
        System.out.print("Enter Salary: ");
        man.sal = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter Department: ");
        man.dep = sc.nextLine();
        System.out.println("\n--- Officer Details ---");
        System.out.println("Name: " + off.name+"\nAddress: " + off.address+"\nAge: " + off.age);
        System.out.println("Mobile: " + off.mob);
        off.print_Salary();
        off.print_Specialization();
        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + man.name);
        System.out.println("Address: " + man.address);
        System.out.println("Age: " + man.age);
        System.out.println("Mobile: " + man.mob);
        man.print_Salary();
        man.print_Dept();
    }
}
