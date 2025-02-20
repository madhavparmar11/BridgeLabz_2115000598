import java.util.*;

class GenerateBinaryNumbers {
    Queue<String> queue = new LinkedList<>();

    List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        queue.add("1");
        for (int i = 0; i < n; i++) {
            String val = queue.remove();
            result.add(val);
            queue.add(val + "0");
            queue.add(val + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        GenerateBinaryNumbers obj = new GenerateBinaryNumbers();
        List<String> output = obj.generateBinary(5);
        for (String num : output) {
            System.out.print(num + " ");
        }
    }
}
