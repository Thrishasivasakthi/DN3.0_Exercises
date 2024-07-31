package TaskManagementSystem;

public class TaskManager {
    private Node head;
    private int size;

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public TaskManager() {
        this.head = null;
        this.size = 0;
    }

    // Add task to the end of the list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Search for a task by ID
    public Task searchTaskById(int id) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == id) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by ID
    public boolean deleteTaskById(int id) {
        if (head == null) {
            return false; // List is empty
        }
        if (head.task.getTaskId() == id) {
            head = head.next; // Remove head node
            size--;
            return true;
        }
        Node current = head;
        while (current.next != null && current.next.task.getTaskId() != id) {
            current = current.next;
        }
        if (current.next == null) {
            return false; // Task not found
        }
        current.next = current.next.next; // Remove node
        size--;
        return true;
    }
}
