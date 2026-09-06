package PracticeQuestion4;
import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void display() {
        System.out.println("Title : " + title+"\nAuthor : " + author+"\nPrice : " + price);
    }
}
public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of Book 1");
        System.out.print("Title : ");
        String title1 = sc.nextLine();
        System.out.print("Author : ");
        String author1 = sc.nextLine();
        System.out.print("Price : ");
        double price1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("\nEnter details of Book 2");
        System.out.print("Title : ");
        String title2 = sc.nextLine();
        System.out.print("Author : ");
        String author2 = sc.nextLine();
        System.out.print("Price : ");
        double price2 = sc.nextDouble();
        Book b1 = new Book(title1, author1, price1);
        Book b2 = new Book(title2, author2, price2);
        System.out.println("\nBook 1 Details:");
        b1.display();
        System.out.println("\nBook 2 Details:");
        b2.display();
    }
}
