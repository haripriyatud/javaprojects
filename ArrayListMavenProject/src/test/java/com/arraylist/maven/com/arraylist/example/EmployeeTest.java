package com.arraylist.maven.com.arraylist.example;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
	Employee e1 = new Employee(1001, "Alice", "System Engineer");
	Employee e2 = new Employee(1002, "Charlie", "System Engineer");
	Employee e3 = new Employee(1003, "Gabriel", "System Engineer");
	Employee e4 = new Employee(1003, "Bobby", "System Engineer");
	List<Employee> employee_list = new ArrayList<Employee>();
	List<String> employee_names_sorted = Arrays.asList("Alice", "Bobby", "Charlie", "Gabriel");

	@Test
	public void add_employees() {
		employee_list.add(e1);
		employee_list.add(e2);
		employee_list.add(e3);
		employee_list.add(e4);
		assertEquals(4, employee_list.size());
	}

	@Test
	public void sort_employees() {
		add_employees();
		employee_list.sort(Comparator.comparing(Employee::getName));
		List<String> employee_names_result = employee_list.stream().map(e -> e.getName()).collect(Collectors.toList());
		assertThat(employee_names_sorted, is(employee_names_result));
	}

}
