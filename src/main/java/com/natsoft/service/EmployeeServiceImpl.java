package com.natsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natsoft.entity.Employee;
import com.natsoft.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

//	@Autowired
//	private EmployeeRepository repo;
//	
//	@Override
//	public Integer saveEmployee(Employee e) {
//		e = repo.save(e);
//		return e.getId();
//	}
//	
//	@Override
//	public List<Employee> findAllEmployees(){
//		List<Employee> list = repo.findAll();
//		return list;
//	}
}
