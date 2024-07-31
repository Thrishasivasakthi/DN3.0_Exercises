package LibraryManagementSystem;
import java.util.Arrays;
import java.util.Comparator;
public class LibraryManager {
    private Book[] books;
    
    public LibraryManager(Book[] books) {
        this.books = books;
    }

    // Linear Search
    public Book searchBookTitleLinear(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search (requires sorted array)
    public Book searchBookTitleBinary(String title) {
        // Assuming books array is sorted by title
        int left = 0;
        int right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Method to sort books by title for binary search
    public void sortBookTitle() {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

}
