package com.arraylist.maven.com.arraylist.example;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

	List<Employee> employee_list = new ArrayList<Employee>();

	List<String> employee_names_sorted = Arrays.asList("Alice", "Bobby", "Charlie", "Daniel", "Gabriel");

	List<String> employee_With_salary_greater_than500000 = Arrays.asList("Alice", "Bobby");

	List<String> system_enginers = Arrays.asList("Charlie", "Daniel");

	List<Double> ten_precent_salary_increment = Arrays.asList(660000.0, 440000.0);

	@BeforeEach
	public void add_employees() {
		Employee e1 = new Employee(1001, "Alice", "Sales Manager", 560000, 5);
		Employee e2 = new Employee(1002, "Charlie", "System Engineer", 340000, 3);
		Employee e3 = new Employee(1003, "Gabriel", "HR Manager", 450000, 3);
		Employee e4 = new Employee(1003, "Bobby", "Technical Lead", 600000, 7);
		Employee e5 = new Employee(1005, "Daniel", "Senior System Engineer", 400000, 6);
		employee_list.add(e1);
		employee_list.add(e2);
		employee_list.add(e3);
		employee_list.add(e4);
		employee_list.add(e5);
	}

	@Test
	public void sort_employees() {
		employee_list.sort(Comparator.comparing(Employee::getName));
		List<String> employee_names_result = employee_list.stream().map(e -> e.getName()).collect(Collectors.toList());
		assertThat(employee_names_sorted, is(employee_names_result));
	}

	@Test
	public void employees_with_salary_greaterthan500000() {
		List<String> employee_names_result = employee_list.stream().filter(e -> e.getSalary() > 500000)
				.map(e -> e.getName()).collect(Collectors.toList());
		assertThat(employee_With_salary_greater_than500000, is(employee_names_result));
	}

	@Test
	public void system_engineer_employees() {
		List<String> employee_names_result = employee_list.stream()
				.filter(e -> e.getDesignation().contains("System Engineer")).map(e -> e.getName())
				.collect(Collectors.toList());
		assertThat(system_enginers, is(employee_names_result));
	}

	@Test
	public void increment_10percent_for_work_experience_greater_than_5() {
		List<Double> incremented_salary = employee_list.stream().filter(e -> e.getYearsExperience() > 5)
				.map(e -> e.getSalary() + (e.getSalary() * 0.10)).collect(Collectors.toList());
		assertThat(ten_precent_salary_increment, is(incremented_salary));
	}

}
