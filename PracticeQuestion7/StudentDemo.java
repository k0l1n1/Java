package PracticeQuestion7;
import java.util.Scanner;
class Students {
    String name;
    int rollNo;
    String course;
    void setDetails(String n, int r, String c) {
        name = n;
        rollNo = r;
        course = c;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class StudentAccount extends Students {
    double collegeFee;
    void setCollegeFee(double fee) {
        collegeFee = fee;
    }
    void displayCollegeFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}
class Hosteller extends StudentAccount {
    double hostelFee;
    double messFee;
    void setHostelDetails(double hFee, double mFee) {
        hostelFee = hFee;
        messFee = mFee;
    }
    void displayHostelDetails() {
        displayDetails();
        displayCollegeFee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        double totalFee = collegeFee + hostelFee + messFee;
        System.out.println("Total Fee: " + totalFee);
    }
}
class DayScholar extends StudentAccount {
    double busFee;
    void setBusFee(double fee) {
        busFee = fee;
    }
    void displayDayScholarDetails() {
        displayDetails();
        displayCollegeFee();
        System.out.println("Bus Fee: " + busFee);
        double totalFee = collegeFee + busFee;
        System.out.println("Total Fee: " + totalFee);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hosteller h = new Hosteller();
        System.out.print("Enter Hosteller's Name: ");
        String hName = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int hRollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String hCourse = sc.nextLine();
        System.out.print("Enter College Fee: ");
        double hCollegeFee = sc.nextDouble();
        System.out.print("Enter Hostel Fee: ");
        double hostelFee = sc.nextDouble();
        System.out.print("Enter Mess Fee: ");
        double messFee = sc.nextDouble();
        h.setDetails(hName, hRollNo, hCourse);
        h.setCollegeFee(hCollegeFee);
        h.setHostelDetails(hostelFee, messFee);
        sc.nextLine();
        System.out.print("\nEnter Day Scholar's Name: ");
        String dName = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int dRollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String dCourse = sc.nextLine();
        System.out.print("Enter College Fee: ");
        double dCollegeFee = sc.nextDouble();
        System.out.print("Enter Bus Fee: ");
        double busFee = sc.nextDouble();
        DayScholar d = new DayScholar();
        d.setDetails(dName, dRollNo, dCourse);
        d.setCollegeFee(dCollegeFee);
        d.setBusFee(busFee);
        System.out.println("\n--- HOSTELLER DETAILS ---");
        h.displayHostelDetails();
        System.out.println("\n--- DAY SCHOLAR DETAILS ---");
        d.displayDayScholarDetails();
        sc.close();
    }
}
