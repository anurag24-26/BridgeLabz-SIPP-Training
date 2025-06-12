package Java_Programming_Elements;
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter;

        System.out.print("Enter the perimeter of square: ");
        perimeter = input.nextDouble();

        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
