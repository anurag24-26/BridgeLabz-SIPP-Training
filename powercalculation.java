//Power Calculation
// Write a program that takes two numbers as input: a base and an exponent,
// and prints the result of base raised to the exponent (without using loops or
// conditionals).
import java.util.Scanner;
public class powercalculation {
    public static void main(String[] args) {
        // Importing Scanner class for user input
        
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for base and exponent input
        System.out.println("Enter the base: ");
        double base = sc.nextDouble();
        System.out.println("Enter the exponent: ");
        double exponent = sc.nextDouble();
        
        // Calculating power using Math.pow method
        double result = Math.pow(base, exponent);
        
        // Displaying the result
        System.out.println("Result of " + base + " raised to the power of " + exponent + " is: " + result);
        
        // Closing the scanner
        sc.close();
    }
}