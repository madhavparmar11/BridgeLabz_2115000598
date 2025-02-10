abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem {
    public Book(int itemId, String title, String author) { super(itemId, title, author); }
    public int getLoanDuration() { return 14; }
}

class Library {
    public static void main(String[] args) {
        LibraryItem[] items = { new Book(1, "Java Programming", "Author A") };
        for (LibraryItem item : items) {
            System.out.println(item.getLoanDuration());
        }
    }
}
