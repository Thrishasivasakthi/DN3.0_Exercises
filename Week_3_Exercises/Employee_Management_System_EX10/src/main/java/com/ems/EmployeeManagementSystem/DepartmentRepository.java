package com.ems.EmployeeManagementSystem;

import com.ems.EmployeeManagementSystem.Department;
import com.ems.EmployeeManagementSystem.projection.DepartmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<DepartmentProjection> findAllProjectedBy();
}
