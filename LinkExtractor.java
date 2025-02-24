import java.util.regex.*;

class LinkExtractor {
    public static void extract(String text) {
        Matcher matcher = Pattern.compile("https?://\\S+").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        extract("Visit https://example.com");
    }
}