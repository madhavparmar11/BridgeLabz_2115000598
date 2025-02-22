import java.util.regex.*;

class DateExtractor {
    public static void extract(String text) {
        Matcher matcher = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        extract("Today's date is 12/03/2025");
    }
}