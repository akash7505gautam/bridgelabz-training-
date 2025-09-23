class person {
    String name;
    int id;

    public person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void details() {
        System.out.println(name);
        System.out.println(id);
    }
}

class chef extends person {
    String dish;

    public chef(String name, int id, String dish) {
        super(name, id);
        this.dish = dish;
    }

    public void duties() {
        System.out.println(dish);
    }

    public void show_all() {
        details();
        duties();
    }
}

class waiter extends person  {
    int tableno;

    public waiter(String name, int id, int tableno) {
        super(name, id);
        this.tableno = tableno;
    }

    public void duties() {
        System.out.println("Waiter is serving table number" + tableno);
    }

    public void show_all() {
        details();
        duties();
    }
}

public class restaurant_system {
    public static void main(String[] args) {
        chef obj1 = new chef("Rohan", 1, "Paneer Butter Masala");
        waiter obj2 = new waiter("Amit", 2, 5);

        
        obj1.show_all();


        obj2.show_all();
    }
}
