package Java_Methods;
import java.util.*;
public class MaxaHandshakes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt(); // Number of people
        int maxHandshakes = calculateMaxHandshakes(n);
        System.out.println("Maximum handshakes possible: " + maxHandshakes);
    }

    public static int calculateMaxHandshakes(int n) {
        if (n <= 1) {
            return 0; // No handshakes possible with 0 or 1 person
        }
        return (n * (n - 1)) / 2; // Formula for maximum handshakes
    }
}