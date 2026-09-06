package PracticeQuestion5;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
