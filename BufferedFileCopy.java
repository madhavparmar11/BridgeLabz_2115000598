import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        File sourceFile = new File("largefile.bin");
        File destFile = new File("copy.bin");

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            long startTime = System.nanoTime();

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Buffered Copy Completed in: " + (endTime - startTime) / 1e6 + " ms");

        } catch (IOException e) {
            System.out.println("File copy failed: " + e.getMessage());
        }
    }
}
