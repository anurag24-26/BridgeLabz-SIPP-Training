package java_control_flow;
import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            int formulaSum = number * (number + 1) / 2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);

            if (sum == formulaSum) {
                System.out.println("Both sums are equal.");
            } else {
                System.out.println("There is a discrepancy in the sums.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
    }
}