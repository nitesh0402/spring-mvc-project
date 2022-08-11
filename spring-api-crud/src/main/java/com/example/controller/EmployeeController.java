package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeDao;
import com.example.dto.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;

	@GetMapping("/h")
	public String hello() {

		return "hello nitesh verma";
	}

	@PostMapping("/saveEmp")
	public Employee saveEmployee(@RequestBody Employee e1) {
		Employee e = employeeDao.save(e1);

		return e;

	}

@GetMapping("/allRecord")
	public List<Employee> getAllEmpRecord() {
		return employeeDao.findAll();
	}

}
