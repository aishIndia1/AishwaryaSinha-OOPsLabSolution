package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.MergeSort;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of companies");
		int numberOfCompany = 0;
		double stockPrice[] = new double[numberOfCompany];
		boolean priceRose[] = new boolean[numberOfCompany];
		numberOfCompany = sc.nextInt();
		for(int i=0; i<numberOfCompany; i++) {
			System.out.println("Enter current stock price of the company " + i+1);
			stockPrice[i] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			priceRose[i] = sc.nextBoolean();
		}
		MergeSort mergeSort = new MergeSort();
		int count = 0;
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit\r\n");
		int ch = sc.nextInt();
		switch (ch) {
		case 1: mergeSort.applyMergeSort(stockPrice, 0, numberOfCompany-1);
			System.out.println("Stock prices in descending order are :");
			for(int i=numberOfCompany-1; i<=0;i--) {
				System.out.print(stockPrice[i]);
			}
			break;
		
		case 2: mergeSort.applyMergeSort(stockPrice, 0, numberOfCompany-1);
		System.out.println("Stock prices in descending order are :");
		for(int i=0; i<numberOfCompany;i++) {
			System.out.print(stockPrice[i]);
		}
		break;

		case 3: count = 0; 
			for(int i=0; i<numberOfCompany;i++) {
					if(priceRose[i]==true) {
						count++;
					}
				}
			
				System.out.println("Total no of companies whose stock price rose today :" + count);
		break;	
		
		case 4: count = 0; 
		for(int i=0; i<numberOfCompany;i++) {
				if(priceRose[i]==true) {
					count++;
				}
			}
		
			System.out.println("Total no of companies whose stock price declined today : " + count);
			
			break;
		
		case 5: int specificStock = sc.nextInt(); 
				count=0;
		for(int i=0; i<numberOfCompany;i++) {
				if(stockPrice[i] == specificStock) {
					count++;
				}
			}
			if(count>0)
				System.out.println("Stock of value " + specificStock + " is present ");
			else
				System.out.println("Stock of value " + specificStock + " is notpresent ");
			break;
		case 6: System.exit(0);
		default:
			break;
		}

	}

}
