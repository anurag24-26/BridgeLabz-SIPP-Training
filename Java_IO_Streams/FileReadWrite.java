package Java_IO_Streams;

import java.io.*;
class FileReadWrite {
    public static void main(String[] args) {
        File source = new File("source.txt");
        File dest = new File("destination.txt");
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}