package java_strings;
import java.util.Scanner;

public class CustomTrim {

    // Method 1: Find the start and end index after trimming spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method 2: Create a substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method 3: Compare two strings using charAt()
    public static boolean customCompare(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();

        // Built-in trim result
        String builtInTrimmed = input.trim();

        // Custom trim process
        int[] indices = findTrimIndices(input);
        String customTrimmed = customSubstring(input, indices[0], indices[1]);

        // Compare both results
        boolean isEqual = customCompare(customTrimmed, builtInTrimmed);

        // Output
        System.out.println("Custom Trimmed: [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrimmed + "]");
        System.out.println("Are both equal? " + isEqual);
    }
}
