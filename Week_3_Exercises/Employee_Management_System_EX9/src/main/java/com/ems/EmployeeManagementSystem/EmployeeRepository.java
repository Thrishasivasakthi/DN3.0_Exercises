package com.ems.EmployeeManagementSystem;
import com.ems.EmployeeManagementSystem.Employee;
import com.ems.EmployeeManagementSystem.projection.EmployeeProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<EmployeeProjection> findAllProjectedBy();
}