package PracticeQuestion4;
import java.util.Scanner;
class Marks {
    int mark1;
    int mark2;
    int mark3;
    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }
    double calculateAverage() {
        return calculateTotal() / 3.0;
    }
}
public class MarksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        int mark1 = sc.nextInt();
        System.out.print("Enter mark 2: ");
        int mark2 = sc.nextInt();
        System.out.print("Enter mark 3: ");
        int mark3 = sc.nextInt();
        Marks obj = new Marks(mark1, mark2, mark3);
        int total = obj.calculateTotal();
        double average = obj.calculateAverage();
        System.out.println("Total = " + total+"\nAverage = " + average);
    }
}
