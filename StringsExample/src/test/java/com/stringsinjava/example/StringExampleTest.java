package com.stringsinjava.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.stringsinjava.example.StringExample.isPalindrome;
import static com.stringsinjava.example.StringExample.appendFunction;
import static com.stringsinjava.example.StringExample.deleteFunction;
import static com.stringsinjava.example.StringExample.upperCaseConversion;
import static com.stringsinjava.example.StringExample.lowerCaseConversion;
import static com.stringsinjava.example.StringExample.compareString;

import org.junit.jupiter.api.Test;

public class StringExampleTest {

	StringExample stringexample = new StringExample();

	@Test
	public void isPalindromeTestTrue() {
		boolean result = isPalindrome("madam");
		assertTrue(result);
	}

	@Test
	public void isPalindromeTestFalse() {
		boolean result = isPalindrome("palindrome");
		assertFalse(result);
	}

	@Test
	public void appendFunctionTest() {
		String appended_resultant_string = appendFunction("Home","work");
		assertEquals("Homework", appended_resultant_string);
	}


	@Test
	public void deleteFunctionTest() {
		String resultant_string_after_deletion = deleteFunction("Homework","work");
		assertEquals("Home", resultant_string_after_deletion);
	}
	
	@Test
	public void upperCaseConversionTest() {
		String upper_case_string = upperCaseConversion("home");
		assertEquals("HOME", upper_case_string);
	}
	
	@Test
	public void lowerCaseConversionTest() {
		String lower_case_string = lowerCaseConversion("HOME");
		assertEquals("home", lower_case_string);
	}
	
	
	@Test
	public void compareToStringTest() {
		int compare_result = compareString("home","home");
		assertTrue(compare_result==0);
	}
	
	@Test
	public void compareToStringTestPositive() {
		int compare_result = compareString("home","Home");
		assertTrue(compare_result>0);
	}
	
	
	
	@Test
	public void compareToStringTestNegative() {
		int compare_result = compareString("Home","home");
		assertTrue(compare_result<0);
	}
	
	@Test
	public void StringContainsStartsWithEndsWithTest() {
		assertTrue("Java string".contains("ing"));
		assertFalse("Java string".contains("this"));
		assertTrue("Java string".startsWith("Java"));
	    assertTrue("Java string".endsWith("ing"));
	}
	
	
}
