class Book {
    private static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("Invalid book instance.");
        }
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "0987654321");
        
        book1.displayBookDetails();
        book2.displayBookDetails();
        
        Book.displayLibraryName();
    }
}
