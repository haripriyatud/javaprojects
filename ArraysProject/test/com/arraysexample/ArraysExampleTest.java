package com.arraysexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import java.util.OptionalInt;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class ArraysExampleTest {

	ArraysExample arraysexample = new ArraysExample();
	int[] numbers = { 12, 4, 5, 2, 8 };
	Integer[] numbers_before_sorting = { 12, 4, 5, 2, 8 };
	Integer[] numbers_after_sorting_descending = { 12, 8, 5, 4, 2 };

	int sorted_numbers_ascending[] = { 2, 4, 5, 8, 12 };
	int even_numbers[] = { 12, 4, 2, 8 };
	int square_elements[] = { 144, 16, 25, 4, 64 };

	@Test
	public void sumOfElementsTest() {
		int sum = arraysexample.sumOfElements(numbers);
		assertEquals(31, sum);
	}

	@Test
	public void numberOfElementsTest() {
		long count = arraysexample.numberOfElements(numbers);
		assertEquals(5, count);
	}

	@Test
	public void minimumOfElementsTest() {
		OptionalInt minimum_element = arraysexample.minimumOfElements(numbers);
		assertEquals(OptionalInt.of(2), minimum_element);
	}

	@Test
	public void maximumOfElementsTest() {
		OptionalInt minimum_element = arraysexample.maximumOfElements(numbers);
		assertEquals(OptionalInt.of(12), minimum_element);
	}

	@Test
	public void sortElementsAscendingTest() {
		IntStream sorted_elements = arraysexample.sortElementsAscending(numbers);
		assertThat(sorted_elements.toArray(), is(sorted_numbers_ascending));
	}

	@Test
	public void findOnlyEvenTest() {
		IntStream even_numbers_result = arraysexample.findOnlyEven(numbers);
		assertThat(even_numbers_result.toArray(), is(even_numbers));
	}

	@Test
	public void squareElementsTest() {
		IntStream square_elements_result = arraysexample.squareElements(numbers);
		assertThat(square_elements_result.toArray(), is(square_elements));
	}

	@Test
	public void allMatchExampleTest() {
		boolean are_all_elements_greater_than_1 = arraysexample.allMatchExample(numbers, e -> e > 1);
		assertTrue(are_all_elements_greater_than_1);
	}

	@Test
	public void allMatchExampleTestcombination() {
		boolean are_all_elements_greater_than_1_and_not_divisible_by_10 = arraysexample.allMatchExample(numbers,
				e -> e > 1 && e % 10 != 0);
		assertTrue(are_all_elements_greater_than_1_and_not_divisible_by_10);
	}

	@Test
	public void anyMatchExampleTestTrue() {
		boolean is_any_element_in_list_divisible_by_5 = arraysexample.anyMatchExample(numbers, e -> e % 5 == 0);
		assertTrue(is_any_element_in_list_divisible_by_5);
	}

	@Test
	public void anyMatchExampleTestFalse() {
		boolean is_any_element_in_list_divisible_by_10 = arraysexample.anyMatchExample(numbers, e -> e % 10 == 0);
		assertFalse(is_any_element_in_list_divisible_by_10);
	}

	@Test
	public void binarySearchExample() {
		int index = arraysexample.binarySearchExample(numbers, 4);
		assertThat(numbers, is(sorted_numbers_ascending));
		assertEquals(1, index);
	}

	@Test
	public void sort_reverse_orderTest() {
		arraysexample.sort_reverse_order(numbers_before_sorting);
		assertThat(numbers_before_sorting, is(numbers_after_sorting_descending));
	}

}
