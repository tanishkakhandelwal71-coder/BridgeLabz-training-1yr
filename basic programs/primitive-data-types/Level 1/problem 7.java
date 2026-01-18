public class VolumeOfEarth {

    public static void main(String[] args) {

        double radiusKm = 6378;      // radius of Earth in kilometers
        double pi = 3.14159;

        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        // Convert radius to miles (1 km = 0.621371 miles)
        double radiusMiles = radiusKm * 0.621371;

        // Volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3);
        System.out.println("The volume of earth in cubic miles is " + volumeMiles3);
    }
}