
public class Q3_BookThisKeyword {

    static class Book {
        String title;
        String author;
        double price;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James", 450);

        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Price: Rs." + b.price);
    }
}