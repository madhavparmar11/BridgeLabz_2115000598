import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) throws Exception {
        Map<String, String[]> studentData = new HashMap<>();
        BufferedReader br1 = new BufferedReader(new FileReader("students1.csv"));
        BufferedReader br2 = new BufferedReader(new FileReader("students2.csv"));

        br1.readLine();
        String line;
        while ((line = br1.readLine()) != null) {
            String[] data = line.split(",");
            studentData.put(data[0], data);
        }
        br1.close();

        br2.readLine();
        while ((line = br2.readLine()) != null) {
            String[] data = line.split(",");
            if (studentData.containsKey(data[0])) {
                String[] details = studentData.get(data[0]);
                System.out.println(details[0] + "," + details[1] + "," + details[2] + "," + data[1] + "," + data[2]);
            }
        }
        br2.close();
    }
}
