package com.example.mongocrud.controller;

import com.example.mongocrud.model.Employee;
import com.example.mongocrud.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //add or update employee
    @PostMapping
    public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee emp){
        employeeService.saveOrUpdate(emp);
        return new ResponseEntity<Employee>(employeeService.saveOrUpdate(emp), HttpStatus.ACCEPTED);
    }

    //view employee
    @GetMapping
    public ResponseEntity<List<Employee>> findAll(){
        return new ResponseEntity<List<Employee>>(employeeService.findAll(), HttpStatus.ACCEPTED);
    }

    //delete employee
    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody Employee emp){
        employeeService.delete(emp);
        return new ResponseEntity<String>("Record deleted", HttpStatus.ACCEPTED);
    }
}
