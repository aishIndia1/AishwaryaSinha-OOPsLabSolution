package com.greatlearning.main;

import com.greatlearning.services.AdminDepartment;
import com.greatlearning.services.HrDepartment;
import com.greatlearning.services.SuperDepartment;
import com.greatlearning.services.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment superDepartment1 = new AdminDepartment();
		HrDepartment superDepartment2 = new HrDepartment();
		TechDepartment superDepartment3 = new TechDepartment();
		System.out.println("Welcome to " + superDepartment1.departmentName());
		System.out.println(superDepartment1.getTodaysWork()); 
		System.out.println(superDepartment1.getWorkDeadline());
		System.out.println(superDepartment1.isTodayAHoliday() + "\n");
		System.out.println("Welcome to " + superDepartment2.departmentName()); 
		System.out.println(superDepartment2.doActivity());
		System.out.println(superDepartment2.getTodaysWork());
		System.out.println(superDepartment2.getWorkDeadline());
		System.out.println(superDepartment2.isTodayAHoliday());
		System.out.println("\n");
		System.out.println("Welcome to " + superDepartment3.departmentName());
		System.out.println(superDepartment3.getTodaysWork());
		System.out.println(superDepartment3.getWorkDeadline());
		System.out.println(superDepartment3.getTechStackInformation());
		System.out.println(superDepartment3.isTodayAHoliday());
		
	}

}
