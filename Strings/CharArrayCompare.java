package Strings;
import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getCharsManually(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] manual = getCharsManually(input);
        char[] builtin = input.toCharArray();

        boolean isSame = compareCharArrays(manual, builtin);

        System.out.println("Manual conversion: " + new String(manual));
        System.out.println("Built-in toCharArray: " + new String(builtin));
        System.out.println("Are both arrays equal? " + isSame);
    }
}
 