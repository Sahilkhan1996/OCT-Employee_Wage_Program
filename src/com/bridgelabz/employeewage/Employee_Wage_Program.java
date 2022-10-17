package com.bridgelabz.employeewage;

import java.util.Random;

public class Employee_Wage_Program {
	final static int wagePerHour = 20;
	static int empHrs;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program");
		Random random = new Random(); // generating random number
		int isPresent = random.nextInt(3);
		// Checking if the employee is present full time/part time/absent
		if (isPresent == 0) {
			System.out.println("Employee is present Full time");
			empHrs = 8;
		} else if (isPresent == 1) {
			System.out.println("Employee is present Part time");
			empHrs = 4;
		} else {
			System.out.println("Employee is absent");
			empHrs = 0;
		}
		int dailyWage = wagePerHour * empHrs;
		System.out.println("Daily Employee wage: " + dailyWage);
	}
}
