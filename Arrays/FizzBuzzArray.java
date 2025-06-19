package Arrays;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input!");
            return;
        }

        String[] result = new String[num];

        for (int i = 0; i < num; i++) {
            int value = i + 1;
            if (value % 3 == 0 && value % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (value % 3 == 0) {
                result[i] = "Fizz";
            } else if (value % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = Integer.toString(value);
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }
    }
}