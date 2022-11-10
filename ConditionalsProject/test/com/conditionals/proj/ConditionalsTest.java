package com.conditionals.proj;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class ConditionalsTest {

	Conditionals conditional = new Conditionals();	
	
@Test
public void goodAfternoonTest(){ 
	String greeting = conditional.printGreeting(14);
	assertEquals("Good Afternoon", greeting);
}

@Test
public void currentGreetingTest(){
	LocalTime current_time = LocalTime.now();
	int hour = current_time.getHour();
	String greeting = conditional.printGreeting(hour);
	assertEquals("Good Morning", greeting);
}

@Test
public void numberofDaysTest(){
	LocalDate date = LocalDate.now();
	int days= conditional.printNumberOfMonths(date);
	assertEquals(30, days);
}

@Test
public void numberofDaysFeburaryLeapYearTest(){
	LocalDate date = LocalDate.of(2020, 2, 23);
	int days= conditional.printNumberOfMonths(date);
	assertEquals(29, days);
}

@Test
public void numberofDaysFeburaryNonLeapYearTest(){
	LocalDate date = LocalDate.of(2015, 2, 23);
	int days= conditional.printNumberOfMonths(date);
	assertEquals(28, days);
}	

@Test
public void numberofDaysOctoberTest(){
	LocalDate date =  LocalDate.of(2015, 10, 23);
	int days= conditional.printNumberOfMonths(date);
	assertEquals(31, days);
}
}
