import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            System.out.println("First line: " + reader.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}