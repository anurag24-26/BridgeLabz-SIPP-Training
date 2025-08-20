package Functional_Interfaces;

public class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light turned on");
    }

    public void turnOff() {
        System.out.println("Light turned off");
    }
}
