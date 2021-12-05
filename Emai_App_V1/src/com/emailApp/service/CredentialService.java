package com.emailApp.service;

import java.util.Random;

public class CredentialService {
	
	public static String generateEmailAddress(String firstName, String lastName, String deptName) {
	//	System.out.println("This is generated Email Address method");
		String emailAddress = firstName+lastName+"@"+deptName+".company.com";
		return emailAddress;
	}
	
	public static String generateRandomPassword() {
	//	System.out.println("This is generated Random Password method");
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$^*()%&";
	      String numbers = "1234567890";
	      
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      int length = 8;
	      char[] password = new char[length];

	 //     password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	 //     password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	   //   password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	   //   password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      String pass = password.toString();
	      return pass;
	      
		
	}

	public static void showCredentials(String email, String password) {
		System.out.println("Dear Aish your generated credentials are as follows");
		System.out.println("Email --> " + email);
		System.out.println("Password --> " + password);
	}
}
