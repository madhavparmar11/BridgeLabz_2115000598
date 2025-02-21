import java.io.*;

public class PipedCommunication {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);

        Thread writer = new Thread(() -> {
            try {
                pos.write("Hello from Writer".getBytes());
                pos.close();
            } catch (IOException ignored) {}
        });

        Thread reader = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException ignored) {}
        });

        writer.start();
        reader.start();
    }
}
