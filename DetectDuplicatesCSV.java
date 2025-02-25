import java.io.*;
import java.util.*;

public class DetectDuplicatesCSV {
    public static void main(String[] args) {
        String filePath = "data.csv";
        Map<String, String> records = new HashMap<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String id = values[0];

                if (records.containsKey(id)) {
                    duplicates.add(line);
                } else {
                    records.put(id, line);
                }
            }

            if (!duplicates.isEmpty()) {
                System.out.println("Duplicate Records Found:");
                duplicates.forEach(System.out::println);
            } else {
                System.out.println("No duplicates found.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
