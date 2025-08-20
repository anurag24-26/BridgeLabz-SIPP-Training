package Functional_Interfaces;

public class UPI implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI");
    }
}
