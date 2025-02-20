import java.util.*;

class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> result = new HashSet<>(set1);
        for (int num : set2) {
            if (!set1.contains(num)) {
                result.add(num);
            }
        }
        for (int num : set1) {
            if (set2.contains(num)) {
                result.remove(num);
            }
        }

        System.out.println(result);
    }
}
