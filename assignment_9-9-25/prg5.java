public class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.available = true;
    }

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public Book(Book other) {
        this(other.title, other.author, other.price, other.available);
    }

    public boolean borrow() {
        if (available) {
            available = false;
            System.out.println("You borrowed \"" + title + "\".");
            return true;
        } else {
            System.out.println("Sorry, \"" + title + "\" is  unavailable.");
            return false;
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public String toString() {
        return "Book [title=\"" + title + "\", author=\"" + author + "\", price=₹" 
                + price + ", available=" + available + "]";
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("1984", "George Orwell", 299.99, true);
        Book copiedBook = new Book(customBook);

        System.out.println("Default: " + defaultBook);
        System.out.println("Custom: " + customBook);
        System.out.println("Copied: " + copiedBook);

        customBook.borrow();    
        customBook.borrow();  
    }
}
