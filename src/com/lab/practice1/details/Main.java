package com.lab.practice1.details;
import java.util.*;

public class Main {
	private static void show()
	{
		try {
		Scanner ob = new Scanner(System.in);
		 System.out.println("Enter the size of transaction array");
		int size = ob.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of array");
		for(int i =0;i<size;i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Find the total number of targets that need to achieved");
		int targetTransaction = ob.nextInt();
		int target[] = new int[targetTransaction];
		for(int i =0;i<targetTransaction;i++)
		{
		System.out.println("Enter the value of target");
		 target[i] = ob.nextInt();	
		
		PayMoney pay  = new PayMoney();
		String result = pay.displayTargets(arr,target[i],i);
		System.out.println(result);
		}
		}
		catch(Exception ex) {
			System.out.println("Exception"+ex);
		}
	}
	public static void main(String args[]) {
		show();
		
	}
}
