package com.bridgelabz.employeewage;

import java.util.Random;

public class Employee_Wage_Program {

	static final int IS_Full_Time = 0;
	static final int IS_PART_TIME = 1;
	final static int WAGE_PER_HOUR = 20;
	final static int TOTAL_WORKING_DAYS = 20;

	static int empHrs;
	static int wageForMonth;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program");
		System.out.println("Complete days and daily wages for 20 days of the employee");
		Employee_Wage_Program.totalwage();
		System.out.println("Employee completed 20 days sucessfully");
		System.out.println("Total Wage for the month is: " + wageForMonth);

	}

	private static void totalwage() {
		//checking the total wage for the 20 days 
		for (int i = 0; i < TOTAL_WORKING_DAYS; i++) {
			Random random = new Random(); // generating random number
			int isPresent = random.nextInt(3);
			// Checking if the employee is present full time/part time/absent
			// with the switch case
			switch (isPresent) {
			case IS_Full_Time: {
				System.out.println("Employee is present Full time");
				empHrs = 8;
			}
				break;
			case IS_PART_TIME: {
				System.out.println("Employee is present Part time");
				empHrs = 4;
			}
				break;
			default:
				System.out.println("Employee is absent");
				empHrs = 0;
			}

			int dailyWage = WAGE_PER_HOUR * empHrs;
			System.out.println("Daily Employee wage: " + dailyWage);

			wageForMonth = wageForMonth + dailyWage;
		}
	}
	

}
