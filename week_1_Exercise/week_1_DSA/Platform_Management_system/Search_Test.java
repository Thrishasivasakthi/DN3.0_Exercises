package PlatformManagementSystem;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(3, "Waterbottle", "Accessories"),
            new Product(1, "Smartphone", "Electronics"),
            new Product(2, "Lipstick", "Accessories")
        };

        // Linear search
        Product foundProduct = SearchUtil.linearSearch(products, 2);
        System.out.println("Linear Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));

        // Binary search (needs sorted array)
        products = new Product[] {
            new Product(1, "Smartphone", "Electronics"),
            new Product(2, "Headphones", "Accessories"),
            new Product(3, "Laptop", "Electronics")
        };

        foundProduct = SearchUtil.binarySearch(products, 2);
        System.out.println("Binary Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));
    }
}

