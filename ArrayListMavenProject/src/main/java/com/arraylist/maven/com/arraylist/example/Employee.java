package com.arraylist.maven.com.arraylist.example;

public class Employee {
	private int emp_id;
	private String name;
	private String designation;
	private double salary;
	private int yearsExperience;

	


	public Employee(int emp_id, String name, String designation, double salary, int yearsExperience) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.yearsExperience = yearsExperience;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

}
