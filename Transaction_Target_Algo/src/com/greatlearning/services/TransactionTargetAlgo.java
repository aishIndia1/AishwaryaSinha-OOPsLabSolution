package com.greatlearning.services;

public class TransactionTargetAlgo {
	
	public int process(int target, int[] arr) {
		int val=0;
		int count = 0;
		for (int i=0; i<arr.length; i++) {
			val = target - arr[i];
			if(val <= 0) {
				count++;
				System.out.println("Target achieved after " + count + " transactions");
				break;
			}
			else {
				target = target - arr[i];
				count++;
			}
		}
		
		if(val > 0) {
			System.out.println("Given target is not achieved");
		}
		return 0;
		
	}

}
