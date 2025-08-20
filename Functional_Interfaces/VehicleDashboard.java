package Functional_Interfaces;

public interface VehicleDashboard {
    void displaySpeed(int speed);

    default void displayBattery(int batteryPercent) {
        System.out.println("Battery: " + batteryPercent + "%");
    }
}
