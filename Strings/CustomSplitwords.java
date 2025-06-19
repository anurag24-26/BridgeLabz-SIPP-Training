package Strings;

import java.util.*;

public class CustomSplitwords {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) str.charAt(count++);
        } catch (Exception e) {
            return count - 1;
        }
    }

    public static String[] customSplit(String str) {
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < findLength(str); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                if (!word.equals("")) {
                    words.add(word);
                    word = "";
                }
            }
        }
        if (!word.equals("")) words.add(word);
        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] custom = customSplit(input);
        String[] builtin = input.split(" ");

        System.out.println("Custom split: " + Arrays.toString(custom));
        System.out.println("Built-in split: " + Arrays.toString(builtin));
        System.out.println("Are both equal? " + compareArrays(custom, builtin));
    }
}

