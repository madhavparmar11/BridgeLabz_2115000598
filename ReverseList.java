import java.util.*;

class ReverseList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        List<Integer> linkedList = new LinkedList<>(arrayList);

        reverseList(arrayList);
        reverseList(linkedList);

        System.out.println(arrayList);
        System.out.println(linkedList);
    }

    static void reverseList(List<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
