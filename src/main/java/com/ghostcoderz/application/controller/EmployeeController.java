package com.ghostcoderz.application.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ghostcoderz.application.entity.Employee;
import com.ghostcoderz.application.service.EmployeeService;

@RestController
public class EmployeeController 
{
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/")
	public String welcome()
	{
		return "<center><h1>Welcome to the Employee CRUD Rest API with Spring Boot and Data JPA</h1><br>"
				+ "<h3>Created By - Ved Asole(a.k.a GhostCoderz)</h3></center>";
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return this.empService.saveEmployee(emp);		
	}
	
	@GetMapping("/employee/{id}")
	public Employee addEmployee(@PathVariable int id)
	{
		return this.empService.findById(id);		
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return this.empService.getAllEmployees();
	}
	
	@DeleteMapping("/employee/{id}")
	public boolean removeEmployee(@PathVariable int id)
	{
		return this.empService.removeEmployee(id);
	}
	
	@PutMapping("employee")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		return this.empService.updateEmployee(emp);
	}

}
