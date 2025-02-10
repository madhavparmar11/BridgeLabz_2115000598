abstract class Product {
    private int productId;
    private int price;
    private String name;

    public Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getPrice() { return price; }

    public abstract int calculateDiscount();
}

class Electronics extends Product {
    public Electronics(int productId, String name, int price) { super(productId, name, price); }
    public int calculateDiscount() { return getPrice() / 10; }
}

class Clothing extends Product {
    public Clothing(int productId, String name, int price) { super(productId, name, price); }
    public int calculateDiscount() { return getPrice() / 5; }
}

interface Taxable {
    int calculateTax();
}

class ECommerce {
    public static void main(String[] args) {
        Product[] products = { new Electronics(1, "Laptop", 1000), new Clothing(2, "Shirt", 200) };
        for (Product product : products) {
            System.out.println(product.getPrice() - product.calculateDiscount());
        }
    }
}
