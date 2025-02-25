import java.io.*;
import java.util.*;

public class CSVtoJSON {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String jsonFile = "students.json";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            JSONArray jsonArray = new JSONArray();
            String line;
            String[] headers = br.readLine().split(",");

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                JSONObject obj = new JSONObject();
                for (int i = 0; i < headers.length; i++) {
                    obj.put(headers[i], values[i]);
                }
                jsonArray.put(obj);
            }

            FileWriter writer = new FileWriter(jsonFile);
            writer.write(jsonArray.toString(4));
            writer.flush();
            writer.close();
            System.out.println("CSV converted to JSON successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
