//Write a program that takes three numbers as input from the user and prints their average.

import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        // Importing Scanner class for user input
        
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for three numbers input
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter third number: ");
        double num3 = sc.nextDouble();
        
        // Calculating average
        double average = (num1 + num2 + num3) / 3;
        
        // Displaying the result
        System.out.println("The average of the three numbers is: " + average);
        
        // Closing the scanner
        sc.close();
    }
}