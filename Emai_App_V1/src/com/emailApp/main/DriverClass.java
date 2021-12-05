package com.emailApp.main;

import java.util.Scanner;

import com.emailApp.model.Employee;
import com.emailApp.service.CredentialService;
import com.emailApp.utils.Constants;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println("Hello World");
		
		display();
		
		Employee e1 = new Employee("Aish", "Sinha");
		
		Scanner sc = new Scanner(System.in);
		int dept = sc.nextInt();
		//System.out.println("Dept : " + dept);
		String deptName="";
		
		switch (dept) {
		case 1:
		//	System.out.println("Technical option is selected");
			deptName = Constants.ADMIN_DEPARTMENT;
			
			break;
		
		case 2:
		//	System.out.println("Admin option is selected");
			deptName = Constants.ADMIN_DEPARTMENT;
			
			break;
		
		case 3:
		//	System.out.println("Human Resource option is selected");
			deptName = Constants.HR_DEPARTMENT;
			break;
		
		case 4:
		//	System.out.println("Legal option is selected");
			deptName = Constants.LEGAL_DEPARTMENT;
			break;

		}
		
		String firstName = e1.getFirstName();
		String lastName = e1.getLastName();
		
		String email = CredentialService.generateEmailAddress(firstName, lastName, deptName);
		
	//	System.out.println("Email add :"+ email);
		
		String password = CredentialService.generateRandomPassword();
		
	//	System.out.println("Password is : " + password);
		
		CredentialService.showCredentials(email, password);

	}
	
	public static void display() {
		
		System.out.println("Please enter the department from the following");
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
	}

}
