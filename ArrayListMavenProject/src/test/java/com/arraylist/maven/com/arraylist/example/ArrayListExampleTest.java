package com.arraylist.maven.com.arraylist.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class ArrayListExampleTest {

	List<String> names = Arrays.asList("Anita", "Satya", "Sam", "Bobby", "Sandra");
	List<String> names_starting_with_S = Arrays.asList("Satya", "Sam", "Sandra");
	List<String> names_ascending_order = Arrays.asList("Anita", "Bobby", "Sam", "Sandra", "Satya");
	List<String> names_descending_order = Arrays.asList("Satya", "Sandra", "Sam", "Bobby", "Anita");
	List<String> citrusfruits = new ArrayList<String>();
	ArrayListExample arraylistexample = new ArrayListExample();
	List<Integer> numbers = Arrays.asList(11, 23, 35, 46, 57, 63, 78, 89, 92, 100);
	List<Integer> even_numbers = Arrays.asList(46, 78, 92, 100);
	List<Integer> odd_numbers = Arrays.asList(11, 23, 35, 57, 63, 89);
	List<Integer> numbers_greater_than_50 = Arrays.asList(57, 63, 78, 89, 92, 100);
	List<Integer> square_of_numbers = Arrays.asList(121, 529, 1225, 2116, 3249, 3969, 6084, 7921, 8464, 10000);
	List<String> citrus_fruits_list = Arrays.asList("Lemon", "Mandarin", "Orange", "Grape Fruit", "Lime");
	List<String> citrus_fruits_more_elements = Arrays.asList("Grape Fruit", "Lime");

	@Test
	public void findnamesStartingWithSTest() {
		Stream<String> result = arraylistexample.findnamesStartingWithS(names);
		assertThat(names_starting_with_S, is(result.collect(Collectors.toList())));
	}

	@Test
	public void addElementTest() {
		arraylistexample.addsingleElement(citrusfruits, "Lemon");
		arraylistexample.addsingleElement(citrusfruits, "Orange");
		assertTrue(citrusfruits.contains("Lemon"));
		assertFalse(citrusfruits.contains("Melon"));
		arraylistexample.addElement_with_position(citrusfruits, "Mandarin", 1);
		assertEquals("Mandarin", citrusfruits.get(1));
		arraylistexample.addmoreElements(citrusfruits, citrus_fruits_more_elements);
		assertEquals(5, citrusfruits.size());
		assertThat(citrus_fruits_list, is(citrusfruits));
	}
	
	@Test
	public void removeElementTest() {
		addElementTest();
		assertEquals(5, citrusfruits.size());
		arraylistexample.removeSingleElement(citrusfruits, "Orange");
		arraylistexample.removeSingleElement(citrusfruits, 0);
		assertEquals(3, citrusfruits.size());
		arraylistexample.removemoreElement(citrusfruits,citrus_fruits_more_elements);
		assertEquals(1, citrusfruits.size());
		arraylistexample.removeElementsmatchingPredicate(citrusfruits,e->e.startsWith("M"));
		assertTrue(citrusfruits.isEmpty());
	}

	@Test
	public void sortElementsAscendingTest() {
		arraylistexample.SortinAscending(names);
		assertThat(names_ascending_order, is(names));
	}

	@Test
	public void sortElementsDescendingTest() {
		arraylistexample.SortinDscending(names);
		assertThat(names_descending_order, is(names));
	}

	@Test
	public void find_only_even_numbers() {
		Stream<Integer> result = arraylistexample.filter_with_predicate(numbers, e -> e % 2 == 0);
		assertThat(even_numbers, is(result.collect(Collectors.toList())));
	}

	@Test
	public void find_only_odd_numbers() {
		Stream<Integer> result = arraylistexample.filter_with_predicate(numbers, e -> e % 2 != 0);
		assertThat(odd_numbers, is(result.collect(Collectors.toList())));
	}

	@Test
	public void find_numbers_greater_than50() {
		Stream<Integer> result = arraylistexample.filter_with_predicate(numbers, e -> e > 50);
		assertThat(numbers_greater_than_50, is(result.collect(Collectors.toList())));
	}

	@Test
	public void square_elementsTest() {
		Stream<Integer> result = arraylistexample.transformation_with_map(numbers, e -> e * e);
		assertThat(square_of_numbers, is(result.collect(Collectors.toList())));
	}

}
