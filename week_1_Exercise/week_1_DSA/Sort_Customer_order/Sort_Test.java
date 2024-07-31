package SortCustomerOrder;

public class SortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "thrisha", 790.0),
            new Order(2, "Shruti", 200.0),
            new Order(3, "Sumi", 900.0),
            new Order(4, "Swathi", 100.0)
        };

        // Bubble Sort
        Order[] bubbleSortedOrders = orders.clone();
        SortUtil.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sort Results:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Quick Sort
        Order[] quickSortedOrders = orders.clone();
        SortUtil.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nQuick Sort Results:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }

}

