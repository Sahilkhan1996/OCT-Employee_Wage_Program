package com.bridgelabz.employeewage;

import java.util.Random;

public class Employee_Wage_Program {
	final static int wagePerHour = 20;
	static int empHrs;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program");
		Random random = new Random();
		int isPresent = random.nextInt(2);
		if (isPresent == 0) {
			System.out.println("Employee is present");
			empHrs = 8;
		} else {
			System.out.println("Employee is absent");
			empHrs = 0;
		}
		int dailyWage = wagePerHour * empHrs;
		System.out.println("Daily Employee wage: " + dailyWage);
	}
}
