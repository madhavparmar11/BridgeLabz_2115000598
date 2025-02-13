class QueueUsingStacks {
    private int[] stack1;
    private int[] stack2;
    private int top1, top2, size;

    public QueueUsingStacks(int size) {
        this.size = size;
        stack1 = new int[size];
        stack2 = new int[size];
        top1 = -1;
        top2 = -1;
    }

    public void enqueue(int value) {
        if (top1 == size - 1) return;
        stack1[++top1] = value;
    }

    public int dequeue() {
        if (top2 == -1) {
            while (top1 >= 0) {
                stack2[++top2] = stack1[top1--];
            }
        }
        return (top2 >= 0) ? stack2[top2--] : -1;
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
