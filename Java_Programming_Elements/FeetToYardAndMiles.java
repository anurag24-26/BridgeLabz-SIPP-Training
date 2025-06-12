package Java_Programming_Elements;

import java.util.Scanner;

public class FeetToYardAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet;

        System.out.print("Enter distance in feet: ");
        feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}

