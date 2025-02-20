import java.util.*;

class MergeMaps {
    Map<String, Integer> merge(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        for (String key : map2.keySet()) {
            result.put(key, result.getOrDefault(key, 0) + map2.get(key));
        }
        return result;
    }

    public static void main(String[] args) {
        MergeMaps obj = new MergeMaps();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        System.out.println(obj.merge(map1, map2));
    }
}
