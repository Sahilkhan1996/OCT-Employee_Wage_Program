package com.bridgelabz.employeewage;

import java.util.Scanner;

public class MultipleCompanies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee_Wage_Program[] ewb;

		System.out.println("Welcome to Employee Wage Computation Program");

		System.out.println("How may company's details would you like to add ?");
		int num = sc.nextInt();
		System.out.println("-------------------------");

		ewb = new Employee_Wage_Program[num];

		for (int i = 0; i < num; i++) {
			System.out.println("Enter Company Name: ");
			String companyName = sc.next();

			System.out.println("Enter Wage per Hour:");
			int wagePerHour = sc.nextInt();
			
			System.out.println("Enter Total No. of Working Days in a Month:");
			int MAX_WORKING_DAYS = sc.nextInt();
			
			System.out.println("Enter Total No. of Working Hours in a Month:");
			int MAX_WORKING_HOURS = sc.nextInt();
			
			ewb[i] = new Employee_Wage_Program(companyName,wagePerHour,MAX_WORKING_DAYS,MAX_WORKING_HOURS);
			ewb[i].totalwage();
		}
		sc.close();
	}
}