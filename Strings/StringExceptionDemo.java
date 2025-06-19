package Strings;
import java.util.Scanner;

public class StringExceptionDemo {

    // Method that throws the exception
    public static void generateException(String str) {
        System.out.println("Accessing charAt out of bounds...");
        // This will throw exception
        System.out.println(str.charAt(str.length()));
    }

    // Method that handles the exception
    public static void handleException(String str) {
        try {
            System.out.println("Handling exception using try-catch...");
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        // This will crash (comment after checking once)
        // generateException(input);  

        // This will handle
        handleException(input);
    }
}
