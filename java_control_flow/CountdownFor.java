package Java_Control_Flow;
import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
        System.out.println("Liftoff!");
    }
}