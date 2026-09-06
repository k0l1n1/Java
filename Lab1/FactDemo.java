package Lab1;
import java.util.Scanner;
public class FactDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        int fact = 1,n=x;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial of "+ x + " is = "+ fact);
    }
}
