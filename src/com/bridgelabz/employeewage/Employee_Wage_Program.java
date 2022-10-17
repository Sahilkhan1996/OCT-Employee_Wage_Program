package com.bridgelabz.employeewage;

import java.util.Random;

public class Employee_Wage_Program {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program");
		Random random=new Random();
		int isPresent=random.nextInt(2);
		System.out.println(isPresent);
		if(isPresent==0) {
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is absent");
		}
	}
}
