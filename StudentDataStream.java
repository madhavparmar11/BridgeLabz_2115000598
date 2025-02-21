import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.9);
        } catch (IOException e) {
            System.out.println("Error writing data.");
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"))) {
            System.out.println("Roll No: " + dis.readInt());
            System.out.println("Name: " + dis.readUTF());
            System.out.println("GPA: " + dis.readDouble());
        } catch (IOException e) {
            System.out.println("Error reading data.");
        }
    }
}
