import org.junit.jupiter.api.*;

class DatabaseConnection {
    boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("Database connected.");
    }

    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected.");
    }

    public boolean isConnected() {
        return connected;
    }
}

public class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testConnection() {
        Assertions.assertTrue(db.isConnected());
    }

    @Test
    void testDisconnection() {
        db.disconnect();
        Assertions.assertFalse(db.isConnected());
    }
}
