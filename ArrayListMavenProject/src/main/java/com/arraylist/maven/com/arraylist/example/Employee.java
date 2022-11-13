package com.arraylist.maven.com.arraylist.example;

public class Employee {
	private int emp_id;
	private String name;
	private String designation;

	public Employee(int emp_id, String name, String designation) {
		this.emp_id = emp_id;
		this.name = name;
		this.designation = designation;
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

}
