package EmployeeManagementSystem;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Add_employees
        manager.addEmployee(new Employee(1, "Johith", "Developer", 70000));
        manager.addEmployee(new Employee(2, "Bharani", "Designer", 60000));
        manager.addEmployee(new Employee(3, "Shrutii", "Manager", 80000));

        // Traverse_employees
        System.out.println("All Employees:");
        manager.traverseEmployees();

        // Search_employee
        System.out.println("\nSearching for employee with ID :");
        Employee e = manager.searchEmployeeById(2);
        System.out.println(e);

        // Delete_employee
        System.out.println("\nDeleting employee with ID 3:");
        boolean deleted = manager.deleteEmployeeById(3);
        System.out.println("Employee deleted: " + deleted);

        // Traverse_employees again
        System.out.println("\nAll Employees after deletion:");
        manager.traverseEmployees();
    }

}

