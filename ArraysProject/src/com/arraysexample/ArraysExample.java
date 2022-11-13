package com.arraysexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ArraysExample {

	public int sumOfElements(int numbers[]) {

		return Arrays.stream(numbers).sum();

	}

	public long numberOfElements(int numbers[]) {

		return Arrays.stream(numbers).count();

	}

	public OptionalInt minimumOfElements(int numbers[]) {

		return Arrays.stream(numbers).min();

	}

	public OptionalInt maximumOfElements(int numbers[]) {

		return Arrays.stream(numbers).max();

	}

	public IntStream sortElementsAscending(int numbers[]) {

		return Arrays.stream(numbers).sorted();
	}

	public void sort_reverse_order(Integer numbers[]) {
		Arrays.sort(numbers, Collections.reverseOrder());
	}

	public IntStream findOnlyEven(int numbers[]) {

		return Arrays.stream(numbers).filter(e -> e % 2 == 0);
	}

	public IntStream squareElements(int numbers[]) {

		return Arrays.stream(numbers).map(e -> e * e);
	}

	public boolean allMatchExample(int numbers[], IntPredicate p) {

		return Arrays.stream(numbers).allMatch(p);
	}

	public boolean anyMatchExample(int numbers[], IntPredicate p) {

		return Arrays.stream(numbers).anyMatch(p);
	}

	public int binarySearchExample(int numbers[], int key) {
		Arrays.sort(numbers);
		return Arrays.binarySearch(numbers, key);
	}

}
