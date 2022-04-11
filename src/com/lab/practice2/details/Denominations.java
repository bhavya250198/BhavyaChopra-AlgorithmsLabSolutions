package com.lab.practice2.details;

import java.util.Arrays;

public class Denominations {
	public void  displayMinimumNotes(int arr[],int val) {
		int n = arr.length;
		int count[] = new int[n];
		 Arrays.fill(count, 0);
		
		int index=0;
		while(val > 0)
		{
			if(val >= arr[index])
			{
			val-=arr[index];
			count[index]++;
			}
			else {
				
				index++;
			}
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i =0;i<count.length;i++)
			System.out.println(arr[i]+" : "+count[i]);
	}

}
