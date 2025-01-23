package com.aretum.coding.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aretum.coding.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
