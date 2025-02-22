import java.util.regex.*;

class RepeatingWordsFinder {
    public static void extract(String text) {
        Matcher matcher = Pattern.compile("\\b(\\w+)\\b(?=.*\\b\\1\\b)").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        extract("Hello Hello world world");
    }
}