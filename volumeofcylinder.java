import java.util.Scanner;
public class volumeofcylinder {
    public static void main(String[] args) {
        // Importing Scanner class for user input

        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompting user for radius and height input
        System.out.println("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculating volume of the cylinder
        double volume = Math.PI * radius * radius * height;

        // Displaying the result
        System.out.println("Volume of the cylinder is: " + volume);

        // Closing the scanner
        sc.close();
    }
}
