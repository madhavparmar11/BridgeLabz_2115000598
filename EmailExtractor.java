import java.util.regex.*;
class EmailExtractor {
    public static void extract(String text) {
        Matcher matcher = Pattern.compile("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        extract("Contact me at example@mail.com");
    }
}
