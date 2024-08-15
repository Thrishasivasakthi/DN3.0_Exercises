package com.ems.EmployeeManagementSystem.projection;

import org.springframework.beans.factory.annotation.Value;

public interface DepartmentProjection {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.departmentName}")
    String getDepartmentName();
}

