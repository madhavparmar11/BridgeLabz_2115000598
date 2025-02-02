public class book {
    String tittle;
    String author;
    int price;
    String avalibility;

    book(String tittle, String author, int price, String avalibility) {
        this.tittle = tittle;
        this.author = author;
        this.price = price;
        this.avalibility = avalibility;
    }

    book() {
        this("No tittle", "No author", 0, "No");
    }

    void borrowbook() {
        System.out.println("Tittle: " + tittle);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Avalibility: " + avalibility);
    }

    public static void main(String[] args) {
        book b1 = new book("Java", "James Gosling", 500, "Yes");
        book b2 = new book();
        b1.borrowbook();
        b2.borrowbook();
    }
}