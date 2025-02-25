import java.io.BufferedReader;
import java.io.FileReader;

public class CountCSVRows {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        int count = 0;
        br.readLine();
        while (br.readLine() != null) {
            count++;
        }
        br.close();
        System.out.println("Number of records: " + count);
    }
}
