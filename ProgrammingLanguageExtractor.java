import java.util.regex.*;

class ProgrammingLanguageExtractor {
    public static void extract(String text) {
        Matcher matcher = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        extract("I love Java and Python");
    }
}
