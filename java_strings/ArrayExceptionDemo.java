package Java_Strings;

import java.util.Scanner;

public class ArrayExceptionDemo {

    public static void generateException(String[] names) {
        System.out.println("Accessing out of bounds...");
        System.out.println(names[names.length]); // Will throw exception
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Handling exception with try-catch...");
            System.out.println(names[names.length]); // Throws exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            names[i] = sc.next();
        }

        // generateException(names); // Uncomment to crash
        handleException(names);
    }
}
