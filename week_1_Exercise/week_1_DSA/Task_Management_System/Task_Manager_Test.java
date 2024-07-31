package TaskManagementSystem;

public class TaskManagerTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add tasks
        manager.addTask(new Task(1, "Wash Clothes", "Completed"));
        manager.addTask(new Task(2, "Do dry", "completed"));
        manager.addTask(new Task(3, "Go grocery shopping", "Completed"));

        // Traverse tasks
        System.out.println("All Tasks:");
        manager.traverseTasks();

        // Search task
        System.out.println("\nSearching for task with ID 2:");
        Task task = manager.searchTaskById(2);
        System.out.println(task);

        // Delete task
        System.out.println("\nDeleting task with ID 2:");
        boolean deleted = manager.deleteTaskById(2);
        System.out.println("Task deleted: " + deleted);

        // Traverse tasks again
        System.out.println("\nAll Tasks after deletion:");
        manager.traverseTasks();
    }

}

