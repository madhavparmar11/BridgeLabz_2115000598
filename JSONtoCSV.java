import org.json.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class JSONtoCSV {
    public static void main(String[] args) {
        String jsonFile = "students.json";
        String csvFile = "students.csv";

        try {
            String jsonData = new String(Files.readAllBytes(Paths.get(jsonFile)));
            JSONArray jsonArray = new JSONArray(jsonData);

            FileWriter writer = new FileWriter(csvFile);
            writer.append("ID,Name,Age,Marks\n");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                writer.append(obj.getInt("ID") + "," +
                              obj.getString("Name") + "," +
                              obj.getInt("Age") + "," +
                              obj.getInt("Marks") + "\n");
            }

            writer.flush();
            writer.close();
            System.out.println("JSON converted to CSV successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
