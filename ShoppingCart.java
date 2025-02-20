import java.util.*;

public class ShoppingCart {
    HashMap<String, Integer> prices = new HashMap<>();
    LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
    TreeMap<Integer, String> sortedCart = new TreeMap<>();

    void addItem(String item, int price) {
        prices.put(item, price);
        cart.put(item, price);
        sortedCart.put(price, item);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 50000);
        cart.addItem("Phone", 20000);
        System.out.println(cart.sortedCart);
    }
}
