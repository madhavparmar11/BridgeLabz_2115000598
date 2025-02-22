import java.util.regex.*;

class CreditCardValidator {
    public static boolean isValid(String cardNumber) {
        return cardNumber.matches("^(4|5)\\d{15}$");
    }
    public static void main(String[] args) {
        System.out.println(isValid("4111111111111111"));
    }
}