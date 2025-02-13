class CustomHashMap {
    private int[] keys, values;
    private int size;

    public CustomHashMap(int capacity) {
        size = capacity;
        keys = new int[size];
        values = new int[size];
        for (int i = 0; i < size; i++) keys[i] = -1;
    }

    public void put(int key, int value) {
        int index = key % size;
        while (keys[index] != -1) index = (index + 1) % size;
        keys[index] = key;
        values[index] = value;
    }

    public int get(int key) {
        int index = key % size;
        while (keys[index] != key) index = (index + 1) % size;
        return values[index];
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap(10);
        map.put(1, 100);
        System.out.println(map.get(1));
    }
}
