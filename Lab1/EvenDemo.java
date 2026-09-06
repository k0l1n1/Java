package Lab1;
import java.util.Scanner;
public class EvenDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 2,n;
		System.out.print("Enter a number: ");
		n = sc.nextInt();
	        do {
	            System.out.print(i + " ");
	            i += 2;
	        } while (i <= n);

	    }
	}
