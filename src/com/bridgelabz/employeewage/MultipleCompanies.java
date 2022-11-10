package com.bridgelabz.employeewage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MultipleCompanies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, List<Integer>> dailyWageMap=new HashMap<String, List<Integer>>();
		// Arraylist to save the emp wages
		List<Integer> wagelist = new ArrayList<>();

		System.out.println("Welcome to Employee Wage Computation Program");

		System.out.println("How may company's details would you like to add ?");
		int num = sc.nextInt();
		System.out.println("-------------------------");

		for (int i = 0; i < num; i++) {
			System.out.println("Enter Company Name: ");
			String companyName = sc.next();

			System.out.println("Enter Wage per Hour:");
			int wagePerHour = sc.nextInt();

			System.out.println("Enter Total No. of Working Days in a Month:");
			int MAX_WORKING_DAYS = sc.nextInt();

			System.out.println("Enter Total No. of Working Hours in a Month:");
			int MAX_WORKING_HOURS = sc.nextInt();

			Employee_Wage_Program empObj = new Employee_Wage_Program(companyName, wagePerHour, MAX_WORKING_DAYS,
					MAX_WORKING_HOURS);
			int wage = empObj.totalwage();
			wagelist.add(wage);
			dailyWageMap.put(companyName, empObj.dailyWageList);
		}
		
		//Array list to add all the monthly wage
		System.out.println("Array of monthly wages of companies: ");
		System.out.println(wagelist);
		sc.close();
		//Iterating the Map
		System.out.println("The Daily Wage of the Companies are below: ");
		for(Map.Entry<String, List<Integer>> dailywage: dailyWageMap.entrySet()) {
			System.out.println("The Company Name is: "+dailywage.getKey()+" and their daily wage is: "+dailywage.getValue());
		}
		
	}
}