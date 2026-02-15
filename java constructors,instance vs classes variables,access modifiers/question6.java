
public class Question6 {
    public static void main(String[] args) {
        // Question 6: Car Rental System
        CarRental rental = new CarRental("Alice", "Toyota Camry", 5);
        rental.displayRentalDetails();
    }
}

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 50.0; // Assume base rate

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}