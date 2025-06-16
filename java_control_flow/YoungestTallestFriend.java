import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age and height of Amar:");
        int age1 = scanner.nextInt();
        double height1 = scanner.nextDouble();

        System.out.println("Enter age and height of Akbar:");
        int age2 = scanner.nextInt();
        double height2 = scanner.nextDouble();

        System.out.println("Enter age and height of Anthony:");
        int age3 = scanner.nextInt();
        double height3 = scanner.nextDouble();

        if (age1 <= age2 && age1 <= age3) {
            System.out.println("Amar is the youngest.");
        } else if (age2 <= age1 && age2 <= age3) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        if (height1 >= height2 && height1 >= height3) {
            System.out.println("Amar is the tallest.");
        } else if (height2 >= height1 && height2 >= height3) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }
    }
}