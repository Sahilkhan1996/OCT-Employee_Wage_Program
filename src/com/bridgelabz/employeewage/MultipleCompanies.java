package com.bridgelabz.employeewage;

import java.util.Scanner;

public class MultipleCompanies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee_Wage_Program[] ewb;

		System.out.println("Welcome to Employee Wage Computation Program");

		System.out.println("How may company's details would you like to add ?");
		int num = sc.nextInt();

		ewb = new Employee_Wage_Program[num];

		for (int i = 0; i < num; i++) {
			ewb[i] = new Employee_Wage_Program();
			ewb[i].totalwage();
		}
		sc.close();
	}
}