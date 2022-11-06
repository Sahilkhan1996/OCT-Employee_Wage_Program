package com.bridgelabz.employeewage;

public class MultipleCompanies {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program");
		// company name, wAGE_PER_HOUR, mAX_WORKING_DAYS, mAX_WORKING_HOURS
		Employee_Wage_Program bridgeLabz = new Employee_Wage_Program("BridgeLabz", 20, 20, 80);
		bridgeLabz.totalwage();
		System.out.println(bridgeLabz); //from to string 
		Employee_Wage_Program tCS = new Employee_Wage_Program("TCS", 10, 10, 60);
		tCS.totalwage();		
		System.out.println(tCS);//from to string
	}
}
