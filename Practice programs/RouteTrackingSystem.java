 class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String id, String loc , double dist, int expected,int actual) {
       
































	   this.checkpointId = id;
        this.locationName = loc;
        this.distanceFromLast = dist;
        this.expectedDuration = expected;
        this.actualDuration = actual;
    }

    boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    abstract boolean isCritical();
    abstract String getType();
    abstract double calculatePenalty();
}
class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String loc, double dist, int expected, int actual) {
        super(id, loc, dist, expected, actual);
    }

    boolean isCritical() { return true; }

    String getType() { return "Delivery"; }

    double calculatePenalty() {
        if (!isDelayed()) return 0;
        return (actualDuration - expectedDuration) * 2;
    }
}
class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String loc, double dist, int expected, int actual) {
        super(id, loc, dist, expected, actual);
    }

    boolean isCritical() { return true; }

    String getType() { return "Fuel"; }

    double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}
class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double dist, int expected, int actual) {
        super(id, loc, dist, expected, actual);
    }

    boolean isCritical() { return false; }

    String getType() { return "Rest"; }

    double calculatePenalty() {
        if (actualDuration - expectedDuration > 30) {
            return (actualDuration - expectedDuration) * 0.5;
        }
        return 0;
    }
}
class RouteLinkedList<T extends Checkpoint> {

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add checkpoint
    void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Remove checkpoint
    boolean removeCheckpoint(String id) {
        if (head == null) return false;

        if (head.data.checkpointId.equals(id)) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.checkpointId.equals(id)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Find checkpoint
    T findCheckpoint(String id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.checkpointId.equals(id))
                return temp.data;
            temp = temp.next;
        }
        return null;
    }

    // Total Distance
    double computeTotalDistance() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return total;
    }

    // Total Penalty
    double computeTotalPenalty() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    // P
    void printRoute() {
        Node temp = head;
        int i = 1;

        while (temp != null) {
            Checkpoint c = temp.data;
            System.out.println(i + ". " + c.getType() + "Checkpoint – " + c.locationName +
                    " – " + (c.isDelayed() ? "Delayed" : "On Time") +
                    " – Penalty: " + c.calculatePenalty());
            temp = temp.next;
            i++;
        }
    }

    // Consistency Check
    boolean checkCritical() {
        boolean hasDelivery = false, hasFuel = false;

        Node temp = head;
        while (temp != null) {
            if (temp.data instanceof DeliveryCheckpoint) hasDelivery = true;
            if (temp.data instanceof FuelCheckpoint) hasFuel = true;
            temp = temp.next;
        }

        return hasDelivery && hasFuel;
    }
}
class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }
}
public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1","Warehouse A",40,30,40));
        d.routeHistory.addCheckpoint(new FuelCheckpoint("C2","Pump 12",20,15,15));
        d.routeHistory.addCheckpoint(new RestCheckpoint("C3","Motel X",30,20,35));
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4","Client Hub",30,25,40));

        System.out.println("Driver: " + d.driverId + " - " + d.name);
        System.out.println("Route Summary:");

        d.routeHistory.printRoute();

        double totalDistance = d.routeHistory.computeTotalDistance();
        double totalPenalty = d.routeHistory.computeTotalPenalty();

        System.out.println("\nTotal Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + (totalDistance - totalPenalty));

        System.out.println("Critical Route Check: " +
                (d.routeHistory.checkCritical() ?
                        "All required checkpoints present" :
                        "Missing critical checkpoints"));
    }
}