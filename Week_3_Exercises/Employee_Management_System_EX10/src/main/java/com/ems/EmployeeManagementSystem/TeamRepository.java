package com.ems.EmployeeManagementSystem;

import com.ems.EmployeeManagementSystem.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    // Add custom query methods if needed
}

