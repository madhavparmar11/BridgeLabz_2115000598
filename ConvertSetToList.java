import java.util.*;

class ConvertSetToList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
