public class Book {
    public String ISBN;           
    protected String title;       
    private String author;        

    
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN +
                           ", Title: " + title +
                           ", Author: " + author);
    }
}

public class EBook extends Book {
    private String downloadUrl;

    public EBook(String ISBN, String title, String author, String downloadUrl) {
        super(ISBN, title, author);
        this.downloadUrl = downloadUrl;
    }

    public void displayEBookDetails() {
        System.out.println("E‑Book ISBN: " + ISBN +
                           ", Title: " + title +
                           ", Author: " + getAuthor() +
                           ", Download URL: " + downloadUrl);
    }
}

public class Main {
    public static void main(String[] args) {
        Book physical = new Book("1345", "Java", "mith");
        physical.displayBookDetails();

        EBook ebook = new EBook("678", "Java", "nes" "http://download.com/java");
        ebook.displayEBookDetails();

        ebook.setAuthor("james");
        System.out.println("After updating author:");
        ebook.displayEBookDetails();
    }
}
