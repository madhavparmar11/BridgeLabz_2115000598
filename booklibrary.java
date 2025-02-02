public class booklibrary {
    public double isbn;
    protected String title;
    private String author;

    public booklibrary(double isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void getauthorname() {
        System.out.println("Author Name: " + author);
    }

    public void setauthorname(String author) {
        this.author = author;
    }

    void display() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        getauthorname();
    }

    class ebook extends booklibrary {
        private String format;

        public ebook(double isbn, String title, String author, String format) {
            super(isbn, title, author);
            this.format = format;
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Format: " + format);
        }
    }

    public static void main(String[] args) {
        booklibrary b1 = new booklibrary(123456789, "Java Programming", "John");
        booklibrary.ebook b2 = b1.new ebook(987654321, "Python Programming", "Jane", "PDF");
        b1.display();
        b2.display();
    }
}
