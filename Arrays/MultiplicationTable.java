package Arrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] table = new int[10];

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}