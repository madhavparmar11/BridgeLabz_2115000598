import org.junit.jupiter.api.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class DateFormatter {
    public static String formatDate(String inputDate) {
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}

public class DateFormatterTest {
    @Test
    void testValidDate() {
        Assertions.assertEquals("25-12-2025", DateFormatter.formatDate("2025-12-25"));
    }

    @Test
    void testInvalidDate() {
        Assertions.assertThrows(DateTimeParseException.class, () -> DateFormatter.formatDate("invalid-date"));
    }
}
