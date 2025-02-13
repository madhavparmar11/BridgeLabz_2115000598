class SortStack {
    private int[] stack;
    private int top, size;

    public SortStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == size - 1) return;
        stack[++top] = value;
    }

    public int pop() {
        return (top >= 0) ? stack[top--] : -1;
    }

    private void sortedInsert(int value) {
        if (top == -1 || stack[top] <= value) {
            push(value);
        } else {
            int temp = pop();
            sortedInsert(value);
            push(temp);
        }
    }

    public void sort() {
        if (top == -1) return;
        int temp = pop();
        sort();
        sortedInsert(temp);
    }

    public static void main(String[] args) {
        SortStack stack = new SortStack(5);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.sort();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
