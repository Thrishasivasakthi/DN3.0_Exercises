package com.ems.EmployeeManagementSystem.projection;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.name}")
    String getName();
}
