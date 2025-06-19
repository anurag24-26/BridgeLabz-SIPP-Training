// Program to check if the first, second, or third number is the largest
package Control_Flow;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        System.out.println("Is the first number the largest? " + (a > b && a > c));
        System.out.println("Is the second number the largest? " + (b > a && b > c));
        System.out.println("Is the third number the largest? " + (c > a && c > b));
    }
}
