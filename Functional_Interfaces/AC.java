package Functional_Interfaces;

public class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC turned on");
    }

    public void turnOff() {
        System.out.println("AC turned off");
    }
}
