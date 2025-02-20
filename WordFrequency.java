import java.util.*;

class WordFrequency {
    Map<String, Integer> map = new HashMap<>();

    void countWords(String[] words) {
        for (String word : words) {
            String lower = word.toLowerCase();
            map.put(lower, map.getOrDefault(lower, 0) + 1);
        }
    }

    void display() {
        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
    }

    public static void main(String[] args) {
        WordFrequency obj = new WordFrequency();
        String[] input = {"Hello", "world", "hello", "Java"};
        obj.countWords(input);
        obj.display();
    }
}
