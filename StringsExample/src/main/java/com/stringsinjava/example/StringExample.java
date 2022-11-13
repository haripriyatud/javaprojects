package com.stringsinjava.example;

public class StringExample {
	public static boolean isPalindrome(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    String rev=sb.reverse().toString();  
	    if(str.equals(rev)){  
	        return true; 
	    }else{  
	        return false;
	    }  
	}  
}
