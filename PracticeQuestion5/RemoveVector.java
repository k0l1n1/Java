package PracticeQuestion5;
import java.util.Vector;
public class RemoveVector {
    public static void main(String[] args) {
        Vector<String> colors = new Vector<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Vector Before removing Green:");
        for (String color : colors) {
            System.out.println(color);
        }
        colors.remove("Green");
        System.out.println("\nVector after removing Green:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
