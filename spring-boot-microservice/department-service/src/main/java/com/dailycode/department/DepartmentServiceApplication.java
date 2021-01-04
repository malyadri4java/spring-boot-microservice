package com.dailycode.department;

import com.dailycode.department.model.Department;
import com.dailycode.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentServiceApplication implements CommandLineRunner {

    @Autowired
    private DepartmentService departmentService;

    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        departmentService.saveDepartment(new Department(null, "IT", "25th cross street", "IT-001"));
    }
}
