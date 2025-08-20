package Functional_Interfaces;

public class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card");
    }
}
