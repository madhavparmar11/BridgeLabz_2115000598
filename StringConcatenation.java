public class StringConcatenation {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 1000000; i++) s += "a";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) sb.append("a");

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 1000000; i++) sbf.append("a");
    }
}
