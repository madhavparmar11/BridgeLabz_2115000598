import java.util.Scanner;

class Product {
    int id;
    char[] name;
    int quantity;
    double price;
    Product next;

    Product(int id, char[] name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    Product head;

    void addProduct(int id, char[] name, int quantity, double price) {
        Product newProduct = new Product(id, name, quantity, price);
        newProduct.next = this.head;
        this.head = newProduct;
    }

    void removeProduct(int id) {
        Product temp = this.head, prev = null;
        while (temp != null && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        if (prev == null) this.head = temp.next;
        else prev.next = temp.next;
    }

    void updateQuantity(int id, int newQuantity) {
        Product temp = this.head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    void updatePrice(int id, double newPrice) {
        Product temp = this.head;
        while (temp != null) {
            if (temp.id == id) {
                temp.price = newPrice;
                return;
            }
            temp = temp.next;
        }
    }

    Product searchProduct(int id) {
        Product temp = this.head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void displayInventory() {
        Product temp = this.head;
        while (temp != null) {
            System.out.print(temp.id + " ");
            int i = 0;
            while (temp.name[i] != '\0') System.out.print(temp.name[i++]);
            System.out.println(" " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        inventory.addProduct(101, new char[]{'L', 'a', 'p', 't', 'o', 'p', '\0'}, 10, 999.99);
        inventory.addProduct(102, new char[]{'P', 'h', 'o', 'n', 'e', '\0'}, 20, 599.99);
        inventory.addProduct(103, new char[]{'T', 'a', 'b', 'l', 'e', 't', '\0'}, 15, 399.99);

        inventory.displayInventory();
        inventory.updateQuantity(101, 5);
        inventory.updatePrice(103, 349.99);
        inventory.displayInventory();
        inventory.removeProduct(102);
        inventory.displayInventory();

        scanner.close();
    }
}
	