import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

class FileProcessor {
    public void writeToFile(String filename, String content) throws IOException {
        Files.write(Paths.get(filename), content.getBytes());
    }

    public String readFromFile(String filename) throws IOException {
        return Files.readString(Paths.get(filename));
    }
}

public class FileProcessorTest {
    private static final String TEST_FILE = "test.txt";
    private FileProcessor fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        fileProcessor.writeToFile(TEST_FILE, content);
        Assertions.assertEquals(content, fileProcessor.readFromFile(TEST_FILE));
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "JUnit test");
        Assertions.assertTrue(Files.exists(Paths.get(TEST_FILE)));
    }

    @Test
    void testIOExceptionHandling() {
        Assertions.assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
    }
}
