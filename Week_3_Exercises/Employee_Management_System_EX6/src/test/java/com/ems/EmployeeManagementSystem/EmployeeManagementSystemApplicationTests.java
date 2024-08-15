package com.ems.EmployeeManagementSystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;

@SpringBootTest
class EmployeeManagementSystemApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testFindByDepartmentName() {
        List<Employee> employees = employeeRepository.findByDepartmentName("Engineering");
        assertFalse(employees.isEmpty(), "The employee list should not be empty for department 'Engineering'");
    }
}
