package InventoryManagementSystem;

public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Product product1 = new Product(1, "Laptop", 10, 666.99);
        Product product2 = new Product(2, "Smartphone", 20, 499.99);
        manager.addProduct(product1);
        manager.addProduct(product2);
        System.out.println("Inventory after adding products:");
        manager.displayProducts();
        Product updatedProduct1 = new Product(1, "Laptop", 8, 789.99);
        manager.updateProduct(updatedProduct1);
        System.out.println("\nInventory after updating a product:");
        manager.displayProducts();
        manager.deleteProduct(2);
        System.out.println("\nInventory after deleting a product:");
        manager.displayProducts();
    }
}

