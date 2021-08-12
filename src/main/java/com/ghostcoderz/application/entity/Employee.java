package com.ghostcoderz.application.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String empName;
	private String gender;
	private Date dob;
	private String email;
	private String dept;
	private double salary;
	
	public Employee() {}

	Employee(int id, String empName, String gender, Date dob, String email, String dept, double salary) {
		this.id = id;
		this.empName = empName;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int empId) {
		this.id = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName +", gender=" + gender + ", dob="
				+ dob + ", email=" + email + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
