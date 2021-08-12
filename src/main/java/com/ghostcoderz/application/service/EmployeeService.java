package com.ghostcoderz.application.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ghostcoderz.application.dao.EmployeeDAO;
import com.ghostcoderz.application.entity.Employee;

@Service
public class EmployeeService 
{
	
	@Autowired
	private EmployeeDAO empdao;
	
	public Employee saveEmployee(Employee emp)
	{
		this.empdao.save(emp);
		return emp;
	}
	
	public List<Employee> getAllEmployees()
	{
		return this.empdao.findAll();
	}
	
	public boolean removeEmployee(int id)
	{
		try
		{
			this.empdao.deleteById(id);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public Employee updateEmployee(Employee emp)
	{
		this.empdao.save(emp);
		return emp;
	}

	public Employee findById(int id) 
	{
		return this.empdao.findById(id).orElse(null);
	}

}
