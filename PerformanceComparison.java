import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        compareStringConcatenation();
        compareFileReading("largefile.txt");
    }

    public static void compareStringConcatenation() {
        int n = 1_000_000;
        String text = "hello";

        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbd.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static void compareFileReading(String fileName) {
        long startTime, endTime;

        startTime = System.nanoTime();
        int wordCountFR = countWordsWithFileReader(fileName);
        endTime = System.nanoTime();
        System.out.println("FileReader Word Count: " + wordCountFR);
        System.out.println("FileReader Time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        int wordCountISR = countWordsWithInputStreamReader(fileName);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader Word Count: " + wordCountISR);
        System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static int countWordsWithFileReader(String fileName) {
        int wordCount = 0;
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }

    public static int countWordsWithInputStreamReader(String fileName) {
        int wordCount = 0;
        try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }
}
