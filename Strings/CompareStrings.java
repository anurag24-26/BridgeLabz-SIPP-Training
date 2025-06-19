package Strings;
import java.util.Scanner;

public class CompareStrings {

    public static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean charAtResult = compareUsingCharAt(str1, str2);
        boolean equalsResult = str1.equals(str2);

        System.out.println("Comparison using charAt: " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);
        System.out.println("Are both results same? " + (charAtResult == equalsResult));
    }
}
