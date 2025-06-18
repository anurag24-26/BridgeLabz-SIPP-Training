package Java_Control_Flow;
import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            int fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + number + " is: " + fact);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }
    }
}