package module1;
import java.util.Scanner;
class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;
    BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
    }
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account Number : ");
        int acc = sc.nextInt();
        sc.nextLine();
        System.out.print("Account Holder : ");
        String name = sc.nextLine();
        System.out.print("Initial Balance : ");
        double bal = sc.nextDouble();
        BankAccount b = new BankAccount(acc, name, bal);
        System.out.print("Deposit Amount : ");
        double amount = sc.nextDouble();
        b.deposit(amount);
        System.out.println("\nUpdated Account Details");
        b.displayDetails();
    }
    }
