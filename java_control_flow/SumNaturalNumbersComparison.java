
package Java_Control_Flow;
import java.util.Scanner;

public class SumNaturalNumbersComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }

        int sumLoop = 0;
        int i = 1;
        while (i <= n) {
            sumLoop += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Are both sums equal? " + (sumLoop == sumFormula));
    }
}