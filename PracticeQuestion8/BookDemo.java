package PracticeQuestion8;
class Book {
    String title;
    String author;
    Book(String t, String a) {
        title = t;
        author = a;
    }
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}
class Technical extends Book {
    String subject;
    Technical(String t, String a, String s) {
        super(t, a);
        subject = s;
    }
    @Override
    void display() {
        System.out.println("Technical Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}
class Story extends Technical {
    String genre;
    Story(String t, String a, String s, String g) {
        super(t, a, s);
        genre = g;
    }
    void display() {
        System.out.println("Story Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Genre: " + genre);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("General Knowledge", "John");
        Book b2 = new Technical("Java Programming", "James Gosling", "Programming");
        Book b3 = new Story("Harry Potter", "J.K. Rowling", "Fantasy", "Adventure");
        System.out.println("        Book Details");
        b1.display();
        System.out.println("\n   Technical Book Details ");
        b2.display();
        System.out.println("\n   Story Book Details ");
        b3.display();
    }
}
