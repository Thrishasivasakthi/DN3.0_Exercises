package com.ems.EmployeeManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query method to find employees by department name
    List<Employee> findByDepartmentName(String departmentName);

    // Derived query method to find employees with a salary greater than a specific amount
    List<Employee> findBySalaryGreaterThan(Double salary);

    // Custom query using JPQL to find employees by department name
    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findEmployeesByDepartment(@Param("departmentName") String departmentName);

    // Custom query using JPQL to find employees whose salary is within a range
    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN :minSalary AND :maxSalary")
    List<Employee> findEmployeesBySalaryRange(@Param("minSalary") Double minSalary, @Param("maxSalary") Double maxSalary);

    // Custom query using native SQL to find employees by department ID
    @Query(value = "SELECT * FROM employees WHERE department_id = :departmentId", nativeQuery = true)
    List<Employee> findEmployeesByDepartmentId(@Param("departmentId") Long departmentId);
}

