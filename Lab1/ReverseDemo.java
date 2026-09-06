package Lab1;
import java.util.Scanner;
public class ReverseDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        for (; num != 0; num = num / 10) {
            rev = rev * 10 + (num % 10);
        }
        System.out.println("Reverse = " + rev);
    }
}
