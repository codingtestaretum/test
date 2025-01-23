package com.aretum.coding.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aretum.coding.EmployeeNotFoundException;
import com.aretum.coding.model.Employee;
import com.aretum.coding.repo.EmployeeRepository;


@RestController
class EmployeeController {

    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Get all Employees
    List<Employee> all() {

        return null;
    }

    // create new employee
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return null;
    }

    // GetSingle employee
    Employee one(@PathVariable Long id) {

        return null;

    }

    // update employee
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return null;

    }

  //delete employee
    void deleteEmployee(@PathVariable Long id) {


    }
}