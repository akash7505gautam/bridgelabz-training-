public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 50.0; // default average per-day rate
    }

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public CarRental(CarRental other) {
        this(other.customerName, other.carModel, other.rentalDays, other.dailyRate);
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public String toString() {
        return "CarRental [Customer: " + customerName +
               ", Car: " + carModel +
               ", Days: " + rentalDays +
               ", Daily Rate: $" + String.format("%.2f", dailyRate) +
               ", Total Cost: $" + String.format("%.2f", calculateTotalCost()) + "]";
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Alice", "Sedan", 5, 45.0);
        CarRental copiedRental = new CarRental(customRental);

        System.out.println(defaultRental);
        System.out.println(customRental);
        System.out.println(copiedRental);
    }
}
