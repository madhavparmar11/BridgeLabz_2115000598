import java.util.regex.*;

class CapitalizedWordsExtractor {
    public static void extract(String text) {
        Matcher matcher = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        extract("Hello World from Java");
    }
}