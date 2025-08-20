package Functional_Interfaces;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Smart Devices
        SmartDevice light = new Light();
        light.turnOn();
        light.turnOff();

        // Vehicle rental
        Vehicle car = new Car();
        car.rent();
        car.returnVehicle();

        // Payments
        PaymentMethod upi = new UPI();
        upi.pay(500);

        // Functional Interfaces (already in FunctionalExamples)

        // Static method interfaces
        System.out.println("Strong? " + SecurityUtils.isStrongPassword("Pass1234"));
        System.out.println("10km in miles = " + ConversionUtils.kmToMiles(10));
        System.out.println("Date format: " + DateUtils.formatDate(new Date(), "dd-MM-yyyy"));

        // Default methods
        PaymentProcessor paypal = new PayPalProcessor();
        paypal.pay(200);
        paypal.refund(50);

        Exporter exporter = new CSVExporter();
        exporter.export("Report1");
        exporter.exportToJSON("Report1");

        VehicleDashboard eCar = new ElectricCar();
        eCar.displaySpeed(100);
        eCar.displayBattery(80);

        // Marker interfaces
        PatientData p = new PatientData("John", "Flu");
        System.out.println(p);

        Prototype proto = new Prototype("Original");
        Prototype clone = proto.clone();
        System.out.println(clone);
    }
}
