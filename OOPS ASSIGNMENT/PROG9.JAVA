package JAVA_PROGRAM;

public class prog9 {
    static class Movieticket {
        String moviename;
        String seatno;
        int price;

        Movieticket(String moviename){
            this.moviename=moviename;
            // this.seatno=seatno;
            // this.price=price;
        }
        void bookticket(String seatno,int price){
            System.out.println("your seat no is "+seatno+ " and the price is "+price);
        }
        void displaydetails(){
            System.out.println("your movie name is "+this.moviename);
            bookticket("A2",200);

        }
    
        
    }
    public static void main(String[] args) {
        Movieticket m1 = new Movieticket("DHOOM3");
        
        m1.displaydetails();
    }
    
}
