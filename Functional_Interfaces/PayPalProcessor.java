package Functional_Interfaces;

public class PayPalProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}
