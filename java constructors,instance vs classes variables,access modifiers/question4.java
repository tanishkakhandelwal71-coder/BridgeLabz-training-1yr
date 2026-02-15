
public class Question4 {
    public static void main(String[] args) {
        // Question 4: HotelBooking Class
        HotelBooking booking1 = new HotelBooking(); // Default
        booking1.display();
        
        HotelBooking booking2 = new HotelBooking("John Smith", "Suite", 3); // Parameterized
        booking2.display();
        
        HotelBooking booking3 = new HotelBooking(booking2); // Copy
        booking3.display();
    }
}

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Booking: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}