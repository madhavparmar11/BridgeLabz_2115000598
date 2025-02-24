import java.util.regex.*;

class SpaceReplacer {
    public static String replace(String text) {
        return text.replaceAll("\\s+", " ");
    }
    public static void main(String[] args) {
        System.out.println(replace("This   is   a   test"));
    }
}
