package Functional_Interfaces;

public class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV turned on");
    }

    public void turnOff() {
        System.out.println("TV turned off");
    }
}
