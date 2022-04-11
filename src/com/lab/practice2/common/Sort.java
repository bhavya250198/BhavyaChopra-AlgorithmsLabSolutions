package com.lab.practice2.common;

public class Sort {
 public int[] descSort(int arr[])
 {
	 int min=0;
	 int temp=0;
	 int min_index=0;
	 for(int i=0;i<arr.length;i++) {
		  min_index=i;
		  for(int j=i+1;j<= arr.length-1;j++)
		 {
			 if(arr[j] < arr[min_index]) 
				 min_index=j;
		 }	 
		  temp=arr[min_index];
				 arr[min_index]=arr[i];
				 arr[i]=temp;
			 
		 
	 }
	 int a1[] = new int[arr.length];
	 int h = arr.length-1;
	 		for(int k=0;k<a1.length;k++) {
	 			a1[k]=arr[h];
	 			h--;
	 		}
	 return a1;
 }
}
