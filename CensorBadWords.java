import java.util.regex.*;

class CensorBadWords {
    public static String censor(String text, String[] badWords) {
        for (String word : badWords) {
            text = text.replaceAll("\\b" + word + "\\b", "****");
        }
        return text;
    }
    public static void main(String[] args) {
        System.out.println(censor("This is a bad sentence", new String[]{"bad"}));
    }
}
