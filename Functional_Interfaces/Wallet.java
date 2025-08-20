package Functional_Interfaces;

public class Wallet implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Wallet");
    }
}
