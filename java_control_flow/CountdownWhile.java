package java_control_flow;
import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();

        while (counter >= 1) {
            System.out.println("Countdown: " + counter);
            counter--;
        }
        System.out.println("Liftoff!");
    }
}