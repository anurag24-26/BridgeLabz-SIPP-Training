//perimeter of rectangle
import java.util.Scanner;
public class perimeterofrectangle {
    public static void main(String[] args) {
        // Importing Scanner class for user input
        
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for length and width input
        System.out.println("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        
        // Calculating perimeter of the rectangle
        double perimeter = 2 * (length + width);
        
        // Displaying the result
        System.out.println("Perimeter of the rectangle is: " + perimeter);
        
        // Closing the scanner
        sc.close();
    }
}