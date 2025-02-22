import org.junit.jupiter.api.*;

class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class TemperatureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        Assertions.assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0));
    }

    @Test
    void testFahrenheitToCelsius() {
        Assertions.assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32));
    }
}
