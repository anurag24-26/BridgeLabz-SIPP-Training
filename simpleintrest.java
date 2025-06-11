// Importing Scanner class for user input
import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompting user for principal amount, rate of interest, and time period
        System.out.println("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period in years: ");
        double time = sc.nextDouble();

        // Calculating simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("Simple Interest is: " + simpleInterest);

        // Closing the scanner
        sc.close();
    }
}
