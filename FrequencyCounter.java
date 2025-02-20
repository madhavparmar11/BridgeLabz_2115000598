import java.util.*;

class FrequencyCounter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : list) {
            if (!frequencyMap.containsKey(word)) {
                frequencyMap.put(word, 0);
            }
            frequencyMap.put(word, frequencyMap.get(word) + 1);
        }
        System.out.println(frequencyMap);
    }
}
