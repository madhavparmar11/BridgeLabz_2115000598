abstract class FoodItem {
    private int price;
    private String itemName;
    private int quantity;

    public FoodItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract int calculateTotalPrice();
}

class VegItem extends FoodItem {
    public VegItem(String itemName, int price, int quantity) { super(itemName, price, quantity); }
    public int calculateTotalPrice() { return super.calculateTotalPrice() * 1; }
}

interface Discountable {
    int applyDiscount();
}

class FoodOrder {
    public static void main(String[] args) {
        FoodItem[] foodItems = { new VegItem("Salad", 50, 2) };
        for (FoodItem food : foodItems) {
            System.out.println(food.calculateTotalPrice());
        }
    }
}
