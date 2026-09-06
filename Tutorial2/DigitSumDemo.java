package Tutorial2;
import java.util.Scanner;
public class DigitSumDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int num = sc.nextInt();
        int sum = 0,temp=num;
        while (temp != 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }
        System.out.println("Sum of digits of "+ num + " is = " + sum);
    }
}
