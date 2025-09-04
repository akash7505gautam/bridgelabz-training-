package JAVA_PROGRAM;

public class prog5 {
    static class Mobilephone {
        String brand;
        String model;
        int price;
        Mobilephone(String brand,String model,int price){
            this.brand=brand;
            this.model=model;
            this.price=price;
        }
        void displaydetails(){
            System.out.println("brand is "+this.brand+" model is "+this.model+" price is "+this.price);
        }
    
        
    }
    public static void main(String[] args) {
        Mobilephone m1 = new Mobilephone("VIVO", "Vivo T2 Pro", 25000);
        m1.displaydetails();
    }
    
}
