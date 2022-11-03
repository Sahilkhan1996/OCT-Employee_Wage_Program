package com.bridgelabz.employeewage;

public class MultipleCompanies {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program");
		// company name, wAGE_PER_HOUR, mAX_WORKING_DAYS, mAX_WORKING_HOURS
		Employee_Wage_Program emp1 = new Employee_Wage_Program("BridgeLabz", 20, 20, 80);
		emp1.totalwage();
		Employee_Wage_Program emp2 = new Employee_Wage_Program("TCS", 10, 10, 60);
		emp2.totalwage();		
	}
}
