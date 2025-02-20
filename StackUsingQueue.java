import java.util.*;

class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    void push(int value) {
        queue1.add(value);
    }

    int pop() {
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int top = queue1.remove();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;
    }

    public static void main(String[] args) {
        StackUsingQueues obj = new StackUsingQueues();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop());
    }
}
