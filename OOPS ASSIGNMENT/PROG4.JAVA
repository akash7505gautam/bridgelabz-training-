package JAVA_PROGRAM;

public class prog4 {
    static class Item {
        int itemcode;
        String itemname;
        int price;
        int quantity;

        Item(int itemcode,String itemname,int price,int quantity){
            this.itemcode=itemcode;
            this.itemname=itemname;
            this.price=price;
            this.quantity=quantity;

        }
        void displaydetails(){
            System.out.println("itemcode is "+this.itemcode+" itemname is "+this.itemname+ "and one item price is "+this.price+" and total quantity is "+this.quantity);
            System.out.println("totsl cost for "+this.quantity+" items is " +(this.quantity*this.price));
        }
    
        
    }
    public static void main(String[] args) {
        Item i = new Item(200406,"kurkure",200,3);
        i.displaydetails();
        
    }
    
}
