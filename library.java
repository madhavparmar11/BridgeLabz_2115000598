public class library {
    String author;
    int price;
    String title;
    String availibility;

    library(String author, int price, String title, String availibility) {
        this.author = author;
        this.price = price;
        this.title = title;
        this.availibility = availibility;
    }

    library() {
        this.author = "No Author";
        this.price = 0;
        this.title = "No Title";
        this.availibility = "No Availibility";
    }

    public void borrow() {
        if (availibility.equals("Available")) {
            availibility = "Not Available";
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public static void main(String[] args) {
        library l1 = new library("John", 25, "Java Programming", "Available");
        library l2 = new library();
        l1.borrow();

    }
}
