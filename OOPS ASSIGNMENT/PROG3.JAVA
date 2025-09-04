package JAVA_PROGRAM;

public class prog3{
    static class Book {
        String author;
        String title;
        int price;
        Book(String author,String title,int price){
            this.author=author;
            this.title=title;
            this.price=price;
        }
        void displaydetails(){
            System.out.println(author+" "+title+" "+price);
        }
    
        
    }
    public static void main(String[] args) {
        Book b = new Book("shakespeare","Hamlet",200);
        b.displaydetails();

    }

    
}
