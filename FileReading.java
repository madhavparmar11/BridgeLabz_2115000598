import java.io.*;

public class FileReading {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("largefile.txt");
        while (fr.read() != -1);
        fr.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("largefile.txt"));
        while (isr.read() != -1);
        isr.close();
    }
}
