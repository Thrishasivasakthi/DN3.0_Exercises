package com.ems.EmployeeManagementSystem.projection;

public class DepartmentProjectionDto {
    private Long id;
    private String departmentName;

    public DepartmentProjectionDto(Long id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
