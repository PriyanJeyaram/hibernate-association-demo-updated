package com.bootcamp.hibernateassociationdemoupdated.service;

import com.bootcamp.hibernateassociationdemoupdated.entity.Employee;
import com.bootcamp.hibernateassociationdemoupdated.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo repo;

    @Override
    public void addEmployee(Employee employee) {
        repo.save(employee);
    }
}
