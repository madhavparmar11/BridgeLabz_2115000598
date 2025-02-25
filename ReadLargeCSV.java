import java.io.*;

public class ReadLargeCSV {
    public static void main(String[] args) {
        String filePath = "large_file.csv";
        int batchSize = 100;  // Read in chunks of 100 lines
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {
                count++;
                System.out.println(line);  // Process the line here
                
                if (count % batchSize == 0) {
                    System.out.println("Processed " + count + " records...");
                }
            }

            System.out.println("Total records processed: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
