package com.stringexample;

public class StringExample {
public static void main(String[] args){
		
		String str= "Java string.";
		String morestr="Please Pratice";
		String strduplicate= "Java String.";
		System.out.println(str.length());
		System.out.println(str.contains("ring"));
		System.out.println(str.startsWith("Java"));
		System.out.println(str.startsWith("str"));
		System.out.println(str.toUpperCase());
		System.out.println(str.concat(morestr));
		System.out.println(str.charAt(5));
		System.out.println(str.compareTo(strduplicate));
		System.out.println(str.compareToIgnoreCase(strduplicate));
		System.out.println(str.equals(strduplicate));
		System.out.println(str.equalsIgnoreCase(strduplicate));
	
		
		StringBuffer sbuffer=new StringBuffer("Java String.");
		System.out.println(sbuffer.append(morestr));
		System.out.println(sbuffer.insert(sbuffer.length(), " more"));
		System.out.println(sbuffer.delete(sbuffer.length()-4, sbuffer.length()));
		
		StringBuilder sbuilder=new StringBuilder("Java String.");
		System.out.println(sbuilder.append(morestr));
		System.out.println(sbuilder.insert(sbuilder.length(), " more"));
		System.out.println(sbuilder.delete(sbuilder.length()-4, sbuilder.length()));
		
	}
	

}
