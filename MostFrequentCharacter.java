import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "success";
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        
        char mostFrequent = 0;
        int maxCount = 0;
        
        for (char ch : charCount.keySet()) {
            if (charCount.get(ch) > maxCount) {
                maxCount = charCount.get(ch);
                mostFrequent = ch;
            }
        }
        System.out.println("Most Frequent Character: " + mostFrequent);
    }
}
