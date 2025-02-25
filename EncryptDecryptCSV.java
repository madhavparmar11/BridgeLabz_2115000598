import java.io.*;
import java.util.Base64;

public class EncryptDecryptCSV {
    public static void main(String[] args) {
        String inputFile = "sensitive_data.csv";
        String encryptedFile = "encrypted.csv";
        String decryptedFile = "decrypted.csv";

        encryptCSV(inputFile, encryptedFile);
        decryptCSV(encryptedFile, decryptedFile);
    }

    public static void encryptCSV(String inputFile, String outputFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {

            writer.append("ID,Name,Email,Salary\n");
            br.readLine(); // Skip header

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String encryptedEmail = Base64.getEncoder().encodeToString(values[2].getBytes());
                String encryptedSalary = Base64.getEncoder().encodeToString(values[3].getBytes());

                writer.append(values[0] + "," + values[1] + "," + encryptedEmail + "," + encryptedSalary + "\n");
            }

            System.out.println("Data encrypted and saved to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void decryptCSV(String inputFile, String outputFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {

            writer.append("ID,Name,Email,Salary\n");
            br.readLine(); // Skip header

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String decryptedEmail = new String(Base64.getDecoder().decode(values[2]));
                String decryptedSalary = new String(Base64.getDecoder().decode(values[3]));

                writer.append(values[0] + "," + values[1] + "," + decryptedEmail + "," + decryptedSalary + "\n");
            }

            System.out.println("Data decrypted and saved to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
