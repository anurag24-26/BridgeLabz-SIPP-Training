package Java_Methods;
import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principal = sc.nextInt(); // Principal amount
        int rate = sc.nextInt();; // Rate of interest
        int time = sc.nextInt();; // Time in years

        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + interest);
    }

    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
}   