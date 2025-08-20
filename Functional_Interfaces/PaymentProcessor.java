package Functional_Interfaces;

public interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refunding " + amount);
    }
}
