package PlatformManagementSystem;
import java.util.Arrays;
public class SearchUtil {
    public  static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null; 
    }
    public  static Product binarySearch(Product[] products, int targetId) {
        Arrays.sort(products, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));
        
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            if (midProduct.getProductId() == targetId) {
                return midProduct;
            } else if (midProduct.getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; 
    }
}
