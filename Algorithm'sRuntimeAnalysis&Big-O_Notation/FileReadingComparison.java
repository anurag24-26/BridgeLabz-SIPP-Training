import java.io.*;

public class FileReadingComparison {
    public static void main(String[] args) throws Exception {
        String fileName = "largefile.txt"; // create a sample large file

        // FileReader
        long start = System.nanoTime();
        try (FileReader fr = new FileReader(fileName)) {
            while (fr.read() != -1) {}
        }
        System.out.println("FileReader time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        // InputStreamReader
        start = System.nanoTime();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName))) {
            while (isr.read() != -1) {}
        }
        System.out.println("InputStreamReader time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
