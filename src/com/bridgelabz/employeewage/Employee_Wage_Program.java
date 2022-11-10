package com.bridgelabz.employeewage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Employee_Wage_Program implements EmpWage {
//class variables in EmpWage
	static final int IS_Full_TIME = 0;
	static final int IS_PART_TIME = 1;
	String companyName;
	int WAGE_PER_HOUR; // 20
	int MAX_WORKING_DAYS; // 20
	int MAX_WORKING_HOURS; // 60

	int empHrs;
	int dailyWage;
	int wageForMonth;// company dependent
	int total_Working_Hours;// company dependent
	int total_Working_Days;// company dependent
	Scanner sc = new Scanner(System.in);
	List<Integer> dailyWageList = new ArrayList<Integer>();

	public Employee_Wage_Program(String companyName, int wAGE_PER_HOUR, int mAX_WORKING_DAYS, int mAX_WORKING_HOURS) {
		super();
		this.companyName = companyName;
		this.WAGE_PER_HOUR = wAGE_PER_HOUR;
		this.MAX_WORKING_DAYS = mAX_WORKING_DAYS;
		this.MAX_WORKING_HOURS = mAX_WORKING_HOURS;
	}

	// class methods in EmpWage
	public int totalwage() {
		// checking the total wage for the 20 days
		for (int i = 1; i <= MAX_WORKING_DAYS; i++) {
			if (total_Working_Days < MAX_WORKING_DAYS && total_Working_Hours < MAX_WORKING_HOURS) {
				// checking the employee is present or absent
				empCheck();
				// calculating daily wage
				dailyWage = WAGE_PER_HOUR * empHrs;
				dailyWageList.add(dailyWage);
				// System.out.println("Daily Employee wage: " + dailyWage);
				// calculating employee working days
				total_Working_Days++;
				// System.out.println("Total working hours: " + total_Working_Hours + " For the
				// days is: " + total_Working_Days);
				wageForMonth = wageForMonth + dailyWage;

				// System.out.println();
			}
		}
		System.out.println("The company name " + companyName + " has Total Wage for the month is: " + wageForMonth
				+ " Total working days are: " + total_Working_Days + " Total working hours are: "
				+ total_Working_Hours);
		return wageForMonth;
	}

	void empCheck() {
		Random random = new Random(); // generating random number
		int isPresent = random.nextInt(3);
		// System.out.println(isPresent);
		// Checking if the employee is present full time/part time/absent
		// with the switch case
		switch (isPresent) {
		case IS_Full_TIME: {
			// Adding condition to avoid going the max hours more than limit
			if (total_Working_Hours + 8 <= MAX_WORKING_HOURS) {
				// System.out.println("Employee is present Full time");
				empHrs = 8;
				// calculating total working hours
				total_Working_Hours = total_Working_Hours + empHrs;
			}

		}
			break;
		case IS_PART_TIME: {
			// Adding condition to avoid going the max hours more than limit
			if (total_Working_Hours + 4 <= MAX_WORKING_HOURS) {
				// System.out.println("Employee is present Part time");
				empHrs = 4;
				// calculating total working hours
				total_Working_Hours = total_Working_Hours + empHrs;
			}
		}
			break;
		default:
			// System.out.println("Employee is absent");
			empHrs = 0;
		}
	}

	@Override
	public String toString() {
		return "Employee_Wage_Program's Company Name is: " + companyName + " and it's wage for the month is: "
				+ wageForMonth;
	}

}