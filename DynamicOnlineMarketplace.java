class ProductCategory {
    int categoryId;
    ProductCategory(int categoryId) {
        this.categoryId = categoryId;
    }
}

class BookCategory extends ProductCategory {
    BookCategory(int categoryId) {
        super(categoryId);
    }
}

class ClothingCategory extends ProductCategory {
    ClothingCategory(int categoryId) {
        super(categoryId);
    }
}

class GadgetCategory extends ProductCategory {
    GadgetCategory(int categoryId) {
        super(categoryId);
    }
}

class Product<T extends ProductCategory> {
    T category;
    int price;
    
    Product(T category, int price) {
        this.category = category;
        this.price = price;
    }
    
    static <T extends Product<?>> void applyDiscount(T product, int percentage) {
        product.price -= (product.price * percentage) / 100;
    }
}

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>(new BookCategory(1), 500);
        Product<ClothingCategory> clothing = new Product<>(new ClothingCategory(2), 1000);

        Product.applyDiscount(book, 10);
        Product.applyDiscount(clothing, 20);

        System.out.println(book.price);
        System.out.println(clothing.price);
    }
}
