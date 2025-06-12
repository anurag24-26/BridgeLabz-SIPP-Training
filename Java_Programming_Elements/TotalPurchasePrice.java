package Java_Programming_Elements;

import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice;
        int quantity;

        System.out.print("Enter unit price (INR): ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
