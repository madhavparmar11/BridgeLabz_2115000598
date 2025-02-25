import java.io.*;
import java.util.*;

public class ModifyCSV {
    public static void main(String[] args) throws Exception {
        List<String[]> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        String line;
        data.add(br.readLine().split(","));
        while ((line = br.readLine()) != null) {
            String[] row = line.split(",");
            if (row[2].equals("IT")) {
                row[3] = String.valueOf(Integer.parseInt(row[3]) * 1.1);
            }
            data.add(row);
        }
        br.close();

        FileWriter writer = new FileWriter("updated_employees.csv");
        for (String[] row : data) {
            writer.append(String.join(",", row)).append("\n");
        }
        writer.flush();
        writer.close();
    }
}
