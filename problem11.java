import java.util.*;

class Vehicle {
    void show() {
        System.out.println("Vehicle");
    }
}

class Truck extends Vehicle {
    void show() {
        System.out.println("Truck");
    }
}

class Bike extends Vehicle {
    void show() {
        System.out.println("Bike");
    }
}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    void showFleet() {
        for (T v : fleet) {
            v.show();
        }
    }
}

class TestFleet {
    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck());
        trucks.addVehicle(new Truck());

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike());

        trucks.showFleet();
        bikes.showFleet();
    }
}