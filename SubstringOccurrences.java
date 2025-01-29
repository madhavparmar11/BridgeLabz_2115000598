public class SubstringOccurrences {
    public static void main(String[] args) {
        String input = "hello hello world hello";
        String substring = "hello";
        int count = 0;
        
        int index = 0;
        while ((index = input.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        System.out.println("Occurrences: " + count);
    }
}
