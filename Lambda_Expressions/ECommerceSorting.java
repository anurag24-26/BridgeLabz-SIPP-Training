
package Lambda_Expressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Scenario:
 * Sort products differently based on campaigns: by price, rating, or discount.
 * Use a lambda with Comparator to sort dynamically.
 */
public class ECommerceSorting {

    static class Product {
        final String name;
        final double price;
        final double rating; // 0-5
        final double discount; // percentage 0-100

        Product(String name, double price, double rating, double discount) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discount = discount;
        }

        @Override
        public String toString() {
            return String.format("%s (₹%.2f, ⭐%.1f, %s%% off)", name, price, rating, (int) discount);
        }
    }

    public static void sortAndPrint(List<Product> products, Comparator<Product> comparator, String label) {
        products.stream().sorted(comparator).forEach(p -> System.out.println(label + " → " + p));
        System.out.println();
    }

    public static void runDemo() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Earbuds", 1499, 4.0, 10));
        products.add(new Product("Smartphone", 18999, 4.5, 20));
        products.add(new Product("Laptop", 55999, 4.7, 15));
        products.add(new Product("Smartwatch", 3999, 4.2, 25));

        // Lambdas with Comparator
        Comparator<Product> byPriceAsc = (a, b) -> Double.compare(a.price, b.price);
        Comparator<Product> byRatingDesc = (a, b) -> Double.compare(b.rating, a.rating);
        Comparator<Product> byDiscountDesc = (a, b) -> Double.compare(b.discount, a.discount);

        System.out.println("[Sort by Price ASC]");
        sortAndPrint(products, byPriceAsc, "Price");

        System.out.println("[Sort by Rating DESC]");
        sortAndPrint(products, byRatingDesc, "Rating");

        System.out.println("[Sort by Discount DESC]");
        sortAndPrint(products, byDiscountDesc, "Discount");
    }
}
