import java.util.*;

class FindNthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        System.out.println(findNthFromEnd(list, n));
    }

    static String findNthFromEnd(LinkedList<String> list, int n) {
        int slow = 0, fast = 0;
        while (fast < n) {
            fast++;
        }
        while (fast < list.size()) {
            slow++;
            fast++;
        }
        return list.get(slow);
    }
}
