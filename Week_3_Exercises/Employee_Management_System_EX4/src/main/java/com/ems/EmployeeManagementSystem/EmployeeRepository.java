package com.ems.EmployeeManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	// Derived query method to find employees by name
    List<Employee> findByName(String name);
    
    // Derived query method to find employees by email
    Employee findByEmail(String email);
    
    // Derived query method to find employees by department
    List<Employee> findByDepartment(Department department);
}

