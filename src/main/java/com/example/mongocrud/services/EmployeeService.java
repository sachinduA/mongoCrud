package com.example.mongocrud.services;

import com.example.mongocrud.model.Employee;
import com.example.mongocrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveOrUpdate(Employee emp){
        return employeeRepository.save(emp);
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public void delete(Employee emp){
        employeeRepository.delete(emp);
    }
}
