public class convertFahrenheitToCelsius {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Test the conversions
        System.out.println("32 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(32));
        System.out.println("0 Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(0));
        System.out.println("100 Pounds to Kilograms: " + convertPoundsToKilograms(100));
        System.out.println("45 Kilograms to Pounds: " + convertKilogramsToPounds(45));
        System.out.println("10 Gallons to Liters: " + convertGallonsToLiters(10));
        System.out.println("25 Liters to Gallons: " + convertLitersToGallons(25));
    }
}
