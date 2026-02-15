
public class Question8 {
    public static void main(String[] args) {
        // Question 8: Movie Ticket Booking System
        MovieTicket ticket = new MovieTicket("Avengers: Endgame", 15.0);
        ticket.bookTicket(101);
        ticket.displayTicketDetails();
    }
}

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName, double basePrice) {
        this.movieName = movieName;
        this.price = basePrice;
        this.seatNumber = 0; // 0 indicates not booked
    }

    public void bookTicket(int seatNumber) {
        this.seatNumber = seatNumber;
        System.out.println("Ticket booked successfully for seat " + seatNumber);
        // Assuming price might change based on booking, but for now we keep it same
    }

    public void displayTicketDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie: " + movieName);
        if (seatNumber > 0) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Status: Not Booked");
        }
    }
}