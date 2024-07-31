package EmployeeManagementSystem;

public class EmployeeManager {
    private Employee[] employees;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public EmployeeManager() {
        employees = new Employee[INITIAL_CAPACITY];
        size = 0;
    }

    
    public void addEmployee(Employee employee) {
        if (size == employees.length) {
    
            resize();
        }
        employees[size++] = employee;
    }

    
    private void resize() {
        Employee[] newArray = new Employee[employees.length * 2];
        System.arraycopy(employees, 0, newArray, 0, size);
        employees = newArray;
    }


    public Employee searchEmployeeById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    
    public boolean deleteEmployeeById(int id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false; 
        }
        
        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[--size] = null; 
        return true;
    }

}
