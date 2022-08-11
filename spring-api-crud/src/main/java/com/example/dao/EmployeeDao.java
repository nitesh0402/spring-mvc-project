package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dto.Employee;

@Service
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
