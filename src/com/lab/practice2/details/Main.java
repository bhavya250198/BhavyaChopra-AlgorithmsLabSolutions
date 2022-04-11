package com.lab.practice2.details;
import java.util.*;

import com.lab.practice2.common.Sort;
public class Main {
	private static void show() {
		try {
		Scanner ob = new Scanner(System.in);
		 System.out.println("Enter the size of currency denomination");
		 int size = ob.nextInt();
		 int arr[] = new int[size];
		 System.out.println("Enter the currency denomination value");
		 for(int i =0;i<size;i++) {
				arr[i] = ob.nextInt();
			}
		 Sort sort = new Sort();
		 System.out.println("Enter the amount you want to pay");
		 int amount = ob.nextInt();
		 int arrayNum[] = sort.descSort(arr);
		 Denominations denominations = new Denominations();
		 denominations.displayMinimumNotes(arrayNum,amount);
		}
		catch(Exception ex) {
			System.out.println("Exception"+ex);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		show();

	}

}
