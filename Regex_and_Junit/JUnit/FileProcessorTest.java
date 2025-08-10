import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class FileProcessorTest {
    FileProcessor processor;
    String filename = "testfile.txt";

    @BeforeEach
    public void setUp() {
        processor = new FileProcessor();
    }

    @Test
    public void testWriteAndReadFile() throws IOException {
        processor.writeToFile(filename, "Hello World");
        assertEquals("Hello World", processor.readFromFile(filename));
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        processor.writeToFile(filename, "Content");
        assertTrue(new File(filename).exists());
    }

    @Test
    public void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> processor.readFromFile("nofile.txt"));
    }
}
