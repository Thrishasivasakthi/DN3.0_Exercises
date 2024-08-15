package com.ems.EmployeeManagementSystem;

import com.ems.EmployeeManagementSystem.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Project entity.
 * Extends JpaRepository to provide CRUD operations.
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Add custom query methods if needed
}

