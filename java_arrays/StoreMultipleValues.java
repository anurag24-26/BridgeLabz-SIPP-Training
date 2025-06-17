package java_arrays;
import java.util.Scanner;

public class StoreMultipleValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0, count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number (0 or negative to stop): ");
            int num = sc.nextInt();
            if (num <= 0) break;
            numbers[count++] = num;
            sum += num;
        }

        System.out.print("Entered numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum = " + sum);
    }
}