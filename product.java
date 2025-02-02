public class product {
    public static int totalproducts = 0;
    private String productname;
    private int price;

    public product(String productname, int price) {
        this.productname = productname;
        this.price = price;
        totalproducts++;
    }

    public void displayproductdetails() {
        System.out.println("Product Name: " + productname);
        System.out.println("Price: " + price);
    }

    public static void displaytotalproducts() {
        System.out.println("Total Products: " + totalproducts);
    }

    public static void main(String[] args) {
        product p1 = new product("Laptop", 500);
        product p2 = new product("Mobile", 200);
        product p3 = new product("Tablet", 100);
        p1.displayproductdetails();
        p2.displayproductdetails();
        p3.displayproductdetails();
        product.displaytotalproducts();
    }
}
