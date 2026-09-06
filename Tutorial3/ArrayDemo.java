package Tutorial3;
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray in Reverse Order:");
        for(int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
