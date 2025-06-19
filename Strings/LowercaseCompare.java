package Strings;
import java.util.Scanner;

public class LowercaseCompare {

    // Method to manually convert text to lowercase using ASCII values
    public static String manualToLowerCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character is uppercase A-Z
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32)); 
            } else {
                result.append(ch); // Keep other characters as is
            }
        }

        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input from user
        System.out.print("Enter a text: ");
        String originalText = sc.nextLine();

        // Step 2: Built-in lowercase conversion
        String builtInLower = originalText.toLowerCase();

        // Step 3: Manual lowercase conversion
        String manualLower = manualToLowerCase(originalText);

        // Step 4: Compare the results
        boolean isEqual = compareStrings(builtInLower, manualLower);

        // Output
        System.out.println("\nOriginal Text: " + originalText);
        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Manual Conversion: " + manualLower);
        System.out.println("Are both lowercase versions equal? " + isEqual);
    }
}
