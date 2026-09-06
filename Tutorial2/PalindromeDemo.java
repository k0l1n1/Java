package Tutorial2;
import java.util.Scanner;
public class PalindromeDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int org = num, rev = 0, temp;
        while (num != 0) {
            temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;
        }
        if (org == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
