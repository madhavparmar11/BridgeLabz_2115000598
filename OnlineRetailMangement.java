class Order {
    int orderId;
    int orderDate;

    Order(int orderId, int orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void getOrderStatus() {
        System.out.println("Order placed.");
    }
}

class ShippedOrder extends Order {
    int trackingNumber;

    ShippedOrder(int orderId, int orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus() {
        System.out.println("Order shipped.");
    }
}

class DeliveredOrder extends ShippedOrder {
    int deliveryDate;

    DeliveredOrder(int orderId, int orderDate, int trackingNumber, int deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus() {
        System.out.println("Order delivered.");
    }
}

class Main {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(1, 20240101, 12345, 20240105);
        d.getOrderStatus();
    }
}
