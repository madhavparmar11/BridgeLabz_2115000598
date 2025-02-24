import org.junit.jupiter.api.*;

class UserRegistration {
    public void registerUser(String username, String email, String password) {
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$") || password.length() < 8) {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}

public class UserRegistrationTest {
    private UserRegistration userRegistration;

    @BeforeEach
    void setUp() {
        userRegistration = new UserRegistration();
    }

    @Test
    void testValidRegistration() {
        Assertions.assertDoesNotThrow(() -> userRegistration.registerUser("user1", "email@example.com", "Secure123"));
    }

    @Test
    void testInvalidEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("user1", "invalid-email", "Secure123"));
    }

    @Test
    void testInvalidPassword() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("user1", "email@example.com", "weak"));
    }
}
