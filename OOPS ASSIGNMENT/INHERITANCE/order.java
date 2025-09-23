public class order {
    int id;
    String date;

    public order(int id, String date) {
        this.id = id;
        this.date = date;
    }

    public void status() {
        System.out.println("order placed");
    }

    public void details() {
        System.out.println(id);
        System.out.println(date);
        status();
    }

    class shipped extends order {
    String track;

    public shipped(int id, String date, String track) {
        super(id, date);
        this.track = track;
    }

    @Override
    public void status() {
        System.out.println("order is shipped ");
    }

    @Override
    public void details() {
        super.details();
        System.out.println( track);
 
    }
    
}

class deliver extends shipped {
    String deliverydate;

    public deliver(int id, String date, String track, String deliverydate) {
        super(id, date, track);
        this.deliverydate = deliverydate;
    }

    @Override
    public void status() {
        System.out.println("order deliver");
    }

    @Override
    public void details() {
        super.details();
        System.out.println( deliverydate);
    }
}

public class order_system {
    public static void main(String[] args) {
        order obj1 = new order(101, "2025-09-20");
        shipped obj2 = new shipped(102, "2025-09-21", "TRK123456");
        deliver obj3 = new deliver(103, "2025-09-22", "TRK987654", "2025-09-23");

        
        obj1.details();
     

        obj2.details();

        obj3.details();
    }
}
