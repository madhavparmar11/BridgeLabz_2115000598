import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private List<Product> products = new ArrayList<>();
    private int orderId;
    private static int orderCounter = 1;

    public Order() {
        this.orderId = orderCounter++;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getOrderId() {
        return orderId;
    }
}

class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getName() {
        return name;
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        Order order = new Order();
        order.addProduct(new Product("Laptop", 1200.0));
        order.addProduct(new Product("Mouse", 25.0));
        customer.placeOrder(order);

        System.out.println(customer.getName() + " placed Order ID: " + order.getOrderId());
        for (Product p : order.getProducts()) {
            System.out.println("Product: " + p.getName() + ", Price: $" + p.getPrice());
        }
    }
}
