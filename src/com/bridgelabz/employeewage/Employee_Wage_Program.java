package com.bridgelabz.employeewage;

import java.util.Random;

class Employee_Wage_Program {
//class variables in EmpWage
	static final int IS_Full_TIME = 0;
	static final int IS_PART_TIME = 1;
	final static int WAGE_PER_HOUR = 20;
	final static int MAX_WORKING_DAYS = 20;
	final static int MAX_WORKING_HOURS = 60;

	static int empHrs;
	static int wageForMonth;
	static int total_Working_Hours;
	static int total_Working_Days;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program");
		Employee_Wage_Program.totalwage();
	}

// class methods in EmpWage
	private static void totalwage() {
		// checking the total wage for the 20 days
		for (int i = 1; i <= MAX_WORKING_DAYS; i++) {
			if (total_Working_Days < MAX_WORKING_DAYS && total_Working_Hours < MAX_WORKING_HOURS) {
				// checking the employee is present or absent
				Employee_Wage_Program.empCheck();
				// calculating daily wage
				int dailyWage = WAGE_PER_HOUR * empHrs;
				System.out.println("Daily Employee wage: " + dailyWage);
				// calculating employee working days
				total_Working_Days++;
				System.out.println(
						"Total working hours: " + total_Working_Hours + " For the days is: " + total_Working_Days);
				wageForMonth = wageForMonth + dailyWage;

				System.out.println();
			}
		}
		System.out.println("Total Wage for the month is: " + wageForMonth + " Total working days are: "
				+ total_Working_Days + " Total working hours are: " + total_Working_Hours);
	}

	private static void empCheck() {
		Random random = new Random(); // generating random number
		int isPresent = random.nextInt(3);
		System.out.println(isPresent);
		// Checking if the employee is present full time/part time/absent
		// with the switch case
		switch (isPresent) {
		case IS_Full_TIME: {
			if (total_Working_Hours + 8 <= MAX_WORKING_HOURS) {
				System.out.println("Employee is present Full time");
				empHrs = 8;
				// calculating total working hours
				total_Working_Hours = total_Working_Hours + empHrs;
			}

		}
			break;
		case IS_PART_TIME: {
			if (total_Working_Hours + 4 <= MAX_WORKING_HOURS) {
				System.out.println("Employee is present Part time");
				empHrs = 4;
				// calculating total working hours
				total_Working_Hours = total_Working_Hours + empHrs;
			}
		}
			break;
		default:
			System.out.println("Employee is absent");
			empHrs = 0;
		}
	}
}
