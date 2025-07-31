package Java_IO_Streams;

import java.io.*;
class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largefile.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.txt"))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Buffered copy took: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}