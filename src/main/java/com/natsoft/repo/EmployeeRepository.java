package com.natsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natsoft.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  
}
