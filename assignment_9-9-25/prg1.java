public class Book {
    private String title;
    private String author;
    private double price;

    
    public Book() {
        this.title = "four.five";
        this.author = "ruskin bond";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("The tempest", "Paul", 752.99);

        System.out.println("Default Book:");
        defaultBook.display();

        System.out.println("\nCustom Book:");
        customBook.display();
    }
}
