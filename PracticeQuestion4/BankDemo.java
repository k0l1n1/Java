package PracticeQuestion4;
import java.util.Scanner;
class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;
    BankAccount(int number, String holder, double bal) {
        accountNumber = number;
        accountHolder = holder;
        balance = bal;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void displayDetails() {
        System.out.println("Account Number : " + accountNumber+"\nAccount Holder : " + accountHolder+"\nBalance : " + balance);
    }
}
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder name: ");
        String holder = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        BankAccount obj = new BankAccount(number, holder, balance);
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        obj.deposit(amount);
        System.out.println("\nUpdated Account Details:");
        obj.displayDetails();
    }
}
