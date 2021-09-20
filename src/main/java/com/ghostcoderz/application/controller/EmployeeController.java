package com.ghostcoderz.application.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ghostcoderz.application.entity.Employee;
import com.ghostcoderz.application.service.EmployeeService;

@CrossOrigin("*")
@RestController
public class EmployeeController 
{
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping({"/","home"})
	public String welcome()
	{
		return "<body>\r\n"
				+ "    <center>\r\n"
				+ "        <h1>Welcome to the Employee CRUD Rest API with Spring Boot and Data JPA</h1>\r\n"
				+ "        <h3>Created By - Ved Asole(a.k.a GhostCoderz)</h3>  \r\n"
				+ "    </center>\r\n"
				+ "    <h2>User Manual :</h2>\r\n"
				+ "    <h3>\r\n"
				+ "        <ul>\r\n"
				+ "            <li>To insert an employee : \r\n"
				+ "                <ul>\r\n"
				+ "                    <li> Use POST request and send the Employee object in the request body on </li> \r\n"
				+ "                    <li> Use link for localhost : <a href=\"http:// localhost:9191/employee\">http:// localhost:9191/employee</a> or </li> \r\n"
				+ "                    <li> Use  link for Online API usage : <a href=\"https://spring-boot-crud-rest.herokuapp.com/employee\">https://spring-boot-crud-rest.herokuapp.com/employee</a></li> </ul> </li> <br>\r\n"
				+ "            <li>To see details of an employee : \r\n"
				+ "                <ul>\r\n"
				+ "                    <li> Use GET request and send the Employee id as a path variable on </li>\r\n"
				+ "                    <li> Use link for localhost : <a href=\"localhost:9191/employee/id\">localhost:9191/employee/id</a> or </li> \r\n"
				+ "                    <li> Use  link for Online API usage : <a href=\"https://spring-boot-crud-rest.herokuapp.com/employee/id\">https://spring-boot-crud-rest.herokuapp.com/employee/id</a> </li>  </li>\r\n"
				+ "                   <li> Note : At the place of id fill up the id of the employee </li> </ul> </li> <br>\r\n"
				+ "            <li>To see details of all the employees : \r\n"
				+ "                <ul>\r\n"
				+ "                    <li> Use GET request and send the Employee object in the request body on </li> \r\n"
				+ "                    <li> Use link for localhost : <a href=\"localhost:9191/employees\">localhost:9191/employees</a> or </li> \r\n"
				+ "                    <li> Use  link for Online API usage : <a href=\"https://spring-boot-crud-rest.herokuapp.com/employees\">https://spring-boot-crud-rest.herokuapp.com/employees</a></li> </ul> </li> <br>\r\n"
				+ "            <li>To delete an employee : \r\n"
				+ "                <ul>\r\n"
				+ "                    <li> Use DELETE request and send the Employee id as a path variable on </li> \r\n"
				+ "                    <li> Use link for localhost : <a href=\"localhost:9191/employee/id\">localhost:9191/employee/id</a> or </li> \r\n"
				+ "                    <li> Use  link for Online API usage : <a href=\"https://spring-boot-crud-rest.herokuapp.com/employee/id\">https://spring-boot-crud-rest.herokuapp.com/employee/id</a></li> </ul> </li> <br>\r\n"
				+ "            <li>To update an employee : \r\n"
				+ "                <ul>\r\n"
				+ "                    <li> Use PUT request and send the Employee object in the request body on </li> \r\n"
				+ "                    <li> Use link for localhost : <a href=\"localhost:9191/employee/id\">localhost:9191/employee/id</a> or </li> \r\n"
				+ "                    <li> Use  link for Online API usage : <a href=\"https://spring-boot-crud-rest.herokuapp.com/employee/id\">https://spring-boot-crud-rest.herokuapp.com/employee/id</a></li> </ul> </li> <br>\r\n"
				+ "        </ul>\r\n"
				+ "    </h3>\r\n"
				+ "    <h2>To view or download the code : Visit to <a href=\"https://github.com/GhostCoderz/Spring-Boot-CRUD-Rest-API\">Github Project</a> </h2>\r\n"
				+ "    <h2>For any issues : Contact through <a href=\"https://github.com/GhostCoderz\">Github Profile</a> </h2>\r\n"
				+ "</body>";
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return this.empService.saveEmployee(emp);		
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id)
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
