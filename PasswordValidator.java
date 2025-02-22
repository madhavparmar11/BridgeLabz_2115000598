import org.junit.jupiter.api.*;

class PasswordValidator {
    public static boolean isValid(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}

public class PasswordValidatorTest {
    @Test
    void testValidPassword() {
        Assertions.assertTrue(PasswordValidator.isValid("StrongPass1"));
    }

    @Test
    void testInvalidPassword() {
        Assertions.assertFalse(PasswordValidator.isValid("weakpass"));
    }
}
