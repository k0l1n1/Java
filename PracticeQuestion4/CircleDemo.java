package PracticeQuestion4;
import java.util.Scanner;
class Circle {
    double radius;
    Circle(double r) {
        radius = r;
    }
    void display() {
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        System.out.println("Area of Circle : " + area);
        System.out.println("Circumference of Circle : " + circumference);
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Circle obj = new Circle(radius);
        obj.display();
    }
}
