package Java_Programming_Elements;

public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double kmToMile = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMile, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}
