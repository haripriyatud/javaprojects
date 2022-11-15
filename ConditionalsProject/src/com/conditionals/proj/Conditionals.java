package com.conditionals.proj;

import java.time.LocalDate;

public class Conditionals {

	public String printGreeting(int hour) {

		if (hour >= 6 && hour <= 12) {

			return "Good Morning";
		} else if (hour >= 13 && hour <= 16) {
			return "Good Afternoon";
		} else if (hour >= 17 && hour <= 21) {
			return "Good Evening";
		} else {
			return "Good Night";
		}

	}

	public int printNumberOfMonths(LocalDate date) {
		int month = date.getMonthValue();
		int days = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if (date.isLeapYear())
				days = 29;
			else
				days = 28;
		}
		return days;

	}

	
	
	
	public int printNumberOfMonthsJava17Syntax(LocalDate date) {
		int month = date.getMonthValue();
		int days = 0;
		switch (month) {
		case 1,3,5,7,8,10,12-> days = 31;
		case 4,6,9,11-> days = 30;
		case 2 ->{
			if (date.isLeapYear())
				days = 29;
			else
				days = 28;
		}
		}
		return days;

	}
	public String isOddorEven(int num) {
		String result = (num % 2 == 0) ? "even" : "odd";
		return result;

	}

	public long countDigit(long n) {
		if (n == 0)
			return 0;

		return 1 + countDigit(n / 10);

	}

}
