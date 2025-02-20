import java.util.*;

class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;
        rotateList(list, k);
        System.out.println(list);
    }

    static void rotateList(List<Integer> list, int k) {
        int n = list.size();
        k %= n;
        reverse(list, 0, n - 1);
        reverse(list, 0, n - k - 1);
        reverse(list, n - k, n - 1);
    }

    static void reverse(List<Integer> list, int left, int right) {
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
