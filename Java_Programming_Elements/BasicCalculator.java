package Java_Programming_Elements;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1, number2;
        
        System.out.print("Enter first number: ");
        number1 = input.nextFloat();
        
        System.out.print("Enter second number: ");
        number2 = input.nextFloat();
        
        float sum = number1 + number2;
        float difference = number1 - number2;
        float product = number1 * number2;
        float quotient = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " + sum + ", " + difference + ", " + product + ", and " + quotient);
    }
}
