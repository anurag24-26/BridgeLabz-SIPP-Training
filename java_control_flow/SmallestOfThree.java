// Program to check if the first number is the smallest
package Java_Control_Flow;
import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        System.out.println("Is the first number the smallest? " + (a < b && a < c));
    }
}
