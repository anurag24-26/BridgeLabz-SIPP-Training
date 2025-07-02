package Keywords_and_Instance;

public class Vehicle {
    static double registrationFee = 1500.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration No: " + registrationNumber);
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Fee: ₹" + registrationFee);
        }
    }
}