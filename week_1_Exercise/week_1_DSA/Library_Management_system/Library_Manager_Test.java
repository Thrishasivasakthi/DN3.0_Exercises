package LibraryManagementSystem;
import java.util.Arrays;
public class LibraryManagerTest {
    public static void main(String[] args) {
        // Create sample books
        Book[] books = {
            new Book(1, "Meet You In Another Life", "Viva"),
            new Book(2, "The Love", "Bharani"),
            new Book(3, " Nice come", "Kajal")
        };

        LibraryManager manager = new LibraryManager(books);

        // Test Linear Search
        System.out.println("Linear Search Result:");
        Book resultLinear = manager.searchBookTitleLinear("1984");
        System.out.println(resultLinear);

        // Sort books by title for binary search
        manager.sortBooksTitle();

        // Test Binary Search
        System.out.println("\nBinary Search Result:");
        Book resultBinary = manager.searchBookTitleBinary("The Great Gatsby");
        System.out.println(resultBinary);
    }

}
