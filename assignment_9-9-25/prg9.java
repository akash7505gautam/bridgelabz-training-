public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0; // Default fee

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName +
                           ", Vehicle: " + vehicleType +
                           ", Registration Fee: $" + String.format("%.2f", registrationFee));
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Sedan");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(120.0);

        System.out.println("After fee update:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
