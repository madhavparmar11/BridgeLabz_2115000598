class WarehouseItem {
    int id;
    WarehouseItem(int id) {
        this.id = id;
    }
}

class Electronics extends WarehouseItem {
    Electronics(int id) {
        super(id);
    }
}

class Groceries extends WarehouseItem {
    Groceries(int id) {
        super(id);
    }
}

class Furniture extends WarehouseItem {
    Furniture(int id) {
        super(id);
    }
}

class Storage<T extends WarehouseItem> {
    private Object[] items;
    private int size;
    
    Storage(int capacity) {
        items = new Object[capacity];
        size = 0;
    }
    
    void addItem(T item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }
    
    T getItem(int index) {
        if (index >= 0 && index < size) {
            return (T) items[index];
        }
        return null;
    }
    
    static void displayItems(Storage<? extends WarehouseItem> storage) {
        for (int i = 0; i < storage.size; i++) {
            System.out.println(storage.getItem(i).id);
        }
    }
}

public class SmartWarehouseManagement {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>(3);
        electronicsStorage.addItem(new Electronics(101));
        electronicsStorage.addItem(new Electronics(102));

        Storage<Furniture> furnitureStorage = new Storage<>(2);
        furnitureStorage.addItem(new Furniture(201));
        furnitureStorage.addItem(new Furniture(202));

        Storage.displayItems(electronicsStorage);
        Storage.displayItems(furnitureStorage);
    }
}
