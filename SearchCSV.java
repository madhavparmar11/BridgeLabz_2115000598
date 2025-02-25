import java.io.BufferedReader;
import java.io.FileReader;

public class SearchCSV {
    public static void main(String[] args) throws Exception {
        String searchName = "Bob";
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data[1].equalsIgnoreCase(searchName)) {
                System.out.println("Department: " + data[2] + ", Salary: " + data[3]);
            }
        }
        br.close();
    }
}
