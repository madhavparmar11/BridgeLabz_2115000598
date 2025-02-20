import java.util.*;

class UnionIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
