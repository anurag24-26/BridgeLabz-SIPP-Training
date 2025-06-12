package Java_Programming_Elements;

import java.util.Scanner;

public class TrianglesArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height;

        System.out.print("Enter base (in inches): ");
        base = input.nextDouble();

        System.out.print("Enter height (in inches): ");
        height = input.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square cm.");
    }
}

