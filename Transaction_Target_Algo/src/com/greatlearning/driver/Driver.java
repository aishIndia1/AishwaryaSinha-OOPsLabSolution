package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.TransactionTargetAlgo;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* System.out.println("Hello World"); */

		TransactionTargetAlgo transactionTargetAlgo = new TransactionTargetAlgo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int noOfTransactions = sc.nextInt();
		System.out.println("Enter the values of array");
		int transaction[] = new int[noOfTransactions];
		for(int i=0; i<noOfTransactions; i++) {
			transaction[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTarget = sc.nextInt();
		int target = 0;
		for(int i=0;i<noOfTarget;i++) {
		System.out.println("Enter the value of target");
		target = sc.nextInt();
			transactionTargetAlgo.process(target, transaction);
		}
		
	}

}
