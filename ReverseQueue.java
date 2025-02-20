import java.util.*;

class ReverseQueue {
    Queue<Integer> queue = new LinkedList<>();

    void enqueue(int value) {
        queue.add(value);
    }

    void reverseQueue() {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    void display() {
        for (int val : queue) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        ReverseQueue obj = new ReverseQueue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.reverseQueue();
        obj.display();
    }
}
