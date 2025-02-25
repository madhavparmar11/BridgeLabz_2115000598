import java.io.*;
import java.util.*;

public class SortCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        List<String[]> records = new ArrayList<>();
        String header = br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            records.add(line.split(","));
        }
        br.close();

        records.sort((a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

        System.out.println(header);
        for (int i = 0; i < Math.min(5, records.size()); i++) {
            System.out.println(String.join(",", records.get(i)));
        }
    }
}
