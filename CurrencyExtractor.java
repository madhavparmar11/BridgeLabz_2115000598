import java.util.regex.*;

class CurrencyExtractor {
    public static void extract(String text) {
        Matcher matcher = Pattern.compile("\\$?\\d+(\\.\\d{2})?").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        extract("The price is $12.99");
    }
}
