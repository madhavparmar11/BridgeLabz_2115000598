import java.util.*;

class MaxKey {
    String findMaxKey(Map<String, Integer> map) {
        String maxKey = "";
        int maxValue = Integer.MIN_VALUE;
        for (String key : map.keySet()) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        MaxKey obj = new MaxKey();
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 10);
        input.put("B", 20);
        input.put("C", 15);
        System.out.println(obj.findMaxKey(input));
    }
}
