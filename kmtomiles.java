//Write a program that takes the distance in kilometers as input from the user
// and converts it into miles using the formula:
// Miles = Kilometers * 0.621371.
import java.util.Scanner;
public class kmtomiles {
    public static void main(String[] args) {
        // Importing Scanner class for user input
        
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for distance in kilometers input
        System.out.println("Enter the distance in kilometers: ");
        double kilometers = sc.nextDouble();
        
        // Converting kilometers to miles
        double miles = kilometers * 0.621371;
        
        // Displaying the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        
        // Closing the scanner
        sc.close();
    }
}