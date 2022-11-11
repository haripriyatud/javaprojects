package com.arraylist.maven.com.arraylist.example;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ArrayListExample {
	public Stream<String> findnamesStartingWithS(List<String> names) {
		return names.stream().filter(s->s.startsWith("S"));
	}

	public Stream<Integer> filter_with_predicate(List<Integer> numbers_list,Predicate<Integer> predicate) {
		return numbers_list.parallelStream().filter(predicate);
	}

	public Stream<Integer> transformation_with_map(List<Integer> numbers_list,Function<Integer,Integer> transform_function) {
		return numbers_list.parallelStream().map(transform_function);
	}

	
	public void addsingleElement(List<String> array,String name) {
		 array.add(name);
	}
	
	public void addElement_with_position(List<String> array,String name,int index) {
		 array.add(index, name);
	}
	
	public void addmoreElements(List<String> array,List<String> more_elements) {
		 array.addAll(more_elements);
	}
	
	
	public void SortinAscending(List<String> array){
		array.sort(Comparator.naturalOrder());	
	}
	
	public void SortinDscending(List<String> array){
		array.sort(Comparator.reverseOrder());	
	}
	
	
	
}
