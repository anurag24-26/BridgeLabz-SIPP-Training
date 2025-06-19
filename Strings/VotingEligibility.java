package Strings;
import java.util.*;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // 10 to 99
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false";
            else result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.printf("%-10s %-10s\n", "Age", "Can Vote?");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkEligibility(ages);
        display(result);
    }
}
