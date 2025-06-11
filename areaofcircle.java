import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        // Importing Scanner class for user input
        
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for radius input
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        // Calculating area of the circle
        double area = Math.PI * radius * radius;
        
        // Displaying the result
        System.out.println("Area of the circle is: " + area);
        
        // Closing the scanner
        sc.close();
    }
}
