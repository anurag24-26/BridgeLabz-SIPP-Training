package java_control_flow;
import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter employee's years of service: ");
        int years = scanner.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus for less than or equal to 5 years of service.");
        }
    }
}