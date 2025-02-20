import java.util.*;

class InvertMap {
    Map<Integer, List<String>> invertedMap = new HashMap<>();

    void invert(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            int value = map.get(key);
            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }
            invertedMap.get(value).add(key);
        }
    }

    void display() {
        for (int key : invertedMap.keySet()) {
            System.out.println(key + "=" + invertedMap.get(key));
        }
    }

    public static void main(String[] args) {
        InvertMap obj = new InvertMap();
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
        obj.invert(input);
        obj.display();
    }
}
