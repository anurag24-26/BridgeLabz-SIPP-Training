package Java_Strings;
import java.util.Scanner;

public class SubstringCompare {

    // Method using charAt()
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare using charAt()
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String custom = customSubstring(input, start, end);
        String builtIn = input.substring(start, end);

        System.out.println("Custom substring: " + custom);
        System.out.println("Built-in substring: " + builtIn);
        System.out.println("Are both substrings equal? " + compareStrings(custom, builtIn));
    }
}
