import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) throws Exception {
        Pattern emailPattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w+$");
        Pattern phonePattern = Pattern.compile("^\\d{10}$");

        BufferedReader br = new BufferedReader(new FileReader("users.csv"));
        br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (!emailPattern.matcher(data[1]).matches() || !phonePattern.matcher(data[2]).matches()) {
                System.out.println("Invalid: " + line);
            }
        }
        br.close();
    }
}
