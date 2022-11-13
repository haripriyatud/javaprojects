package com.stringsinjava.example;

public class StringExample {
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static String appendFunction(String str,String appendString) {
		StringBuilder sb = new StringBuilder(str);
	     sb.append(appendString);
	     return sb.toString();
	}
	
	public static String deleteFunction(String str,String characterstobeDeleted) {
		StringBuilder sb = new StringBuilder(str);
	     sb.delete(sb.length() - characterstobeDeleted.length(), sb.length());
	     return sb.toString();
	}
	
	public static String upperCaseConversion(String str) {
		return str.toUpperCase();
	}
	
	public static String lowerCaseConversion(String str) {
		return str.toLowerCase();
	}
	
	public static int compareString(String str,String comparestr) {
		return str.compareTo(comparestr);
	}
	

}
