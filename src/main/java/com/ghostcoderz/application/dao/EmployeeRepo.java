package com.ghostcoderz.application.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ghostcoderz.application.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	@Override
	public List<Employee> findAll();

}
