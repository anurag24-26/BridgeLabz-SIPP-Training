package Java_Arrays;

import java.util.Scanner;

public class PosNegEvenOddCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i] + " is Positive and " + (arr[i] % 2 == 0 ? "Even" : "Odd"));
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }

        if (arr[0] == arr[4]) {
            System.out.println("First and last elements are Equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First element is Greater than last");
        } else {
            System.out.println("First element is Less than last");
        }
    }
}