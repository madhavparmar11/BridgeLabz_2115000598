import java.io.FileWriter;

public class WriteCSV {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("employees.csv");
        writer.append("ID,Name,Department,Salary\n");
        writer.append("1,Alice,HR,50000\n");
        writer.append("2,Bob,IT,70000\n");
        writer.append("3,Charlie,Finance,60000\n");
        writer.append("4,David,IT,75000\n");
        writer.append("5,Eva,Sales,55000\n");
        writer.flush();
        writer.close();
    }
}
