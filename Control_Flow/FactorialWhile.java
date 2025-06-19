package Control_Flow;
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            int fact = 1;
            int i = 1;
            while (i <= number) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is: " + fact);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }
    }
}