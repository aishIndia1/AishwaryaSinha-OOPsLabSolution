package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String bracket = new String();
		bracket = sc.next();
		char[] bracketArr = new char[bracket.length()];
		for (int i=0; i<bracket.length(); i++) {
			bracketArr[i] = bracket.charAt(i);
		}
		boolean result = BalancingBrackets.bracket(bracketArr);
		if(result) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
