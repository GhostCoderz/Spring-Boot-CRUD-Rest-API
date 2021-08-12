package com.ghostcoderz.application.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.ghostcoderz.application.entity.Employee;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	
	public List<Employee> findAll();

}
