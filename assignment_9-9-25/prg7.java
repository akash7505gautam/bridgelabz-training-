public class Product {
    private String productName;
    private double price;

    private static int totalProducts = 0;

    public Product() {
        this.productName = "Unknown Product";
        this.price = 0.0;
        totalProducts++;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: $" + String.format("%.2f", price));
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("asus", 1052.99);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts(); 
    }
}
