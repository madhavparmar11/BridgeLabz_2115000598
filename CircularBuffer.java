class CircularBuffer {
    int[] buffer;
    int size, front, rear, count;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = rear = count = 0;
    }

    void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % size;
        if (count < size) count++;
        else front = (front + 1) % size;
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
    }

    public static void main(String[] args) {
        CircularBuffer obj = new CircularBuffer(3);
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.display();
    }
}
