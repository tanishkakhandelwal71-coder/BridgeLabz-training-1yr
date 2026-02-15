
public class Question9 {
    public static void main(String[] args) {
        // Question 9: Vehicle Registration
        Vehicle.updateRegistrationFee(150.0); // Set class variable
        
        Vehicle v1 = new Vehicle("John", "Sedan");
        Vehicle v2 = new Vehicle("Doe", "SUV");
        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        
        Vehicle.updateRegistrationFee(200.0);
        System.out.println("\nAfter fee update:");
        v1.displayVehicleDetails();
    }
}

class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}