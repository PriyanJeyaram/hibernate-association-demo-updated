package com.bootcamp.hibernateassociationdemoupdated.controller;

import com.bootcamp.hibernateassociationdemoupdated.entity.Employee;
import com.bootcamp.hibernateassociationdemoupdated.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<String> addEmp(Employee employee){
        employeeService.addEmployee(employee);
        return new ResponseEntity<>("Employee created Successfully", HttpStatus.CREATED);
    }
}
