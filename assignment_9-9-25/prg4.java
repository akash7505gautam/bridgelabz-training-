public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "akash";
        this.roomType = "luxury";
        this.nights = 2;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    public String toString() {
        return "HotelBooking [guestName=" + guestName + ", roomType=" + roomType + ", nights=" + nights + "]";
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Alice", "Suite", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);

        System.out.println("Default: " + defaultBooking);
        System.out.println("Custom: " + customBooking);
        System.out.println("Copied: " + copiedBooking);
    }
}
