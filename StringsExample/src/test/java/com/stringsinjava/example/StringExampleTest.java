package com.stringsinjava.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.stringsinjava.example.StringExample.isPalindrome;

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


}
