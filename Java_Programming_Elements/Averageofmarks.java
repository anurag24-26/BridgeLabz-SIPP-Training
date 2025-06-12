package Java_Programming_Elements;

public class Averageofmarks {
    public static void main(String[] args) {
        String name="Sam";
        int maths = 94;
        int physics= 95;
        int chemistry = 96;
        // Calculate average marks
        double average = (maths + physics + chemistry) / 3.0;
        // Display the result
        System.out.println(name + "'s average marks are: " + average);
    }
}
