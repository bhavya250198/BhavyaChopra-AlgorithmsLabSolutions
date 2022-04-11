package com.lab.practice1.details;



public class PayMoney {
	private static String calculateTransaction(int a[],int target,int index) {
		int count=0;
		String str="";
		int indexDetails=index+1;
		if(a.length == 1)
		{
			
			if(target <= a[0]) {
			
				count=1;
				str= "Target"+" "+indexDetails+" achieved after"+" "+Integer.toString(count)+" "+"transaction";
				
				
			}
			else {
				count=0;
				str= "Given Target is not achieved";
				
							}
		}
		else {
			int value=target;
			for(int i =0;i<a.length;i++)
			{
					if(value <= a[i]) {
						count++;
						value -= a[i];
						if(value <= 0)
						break;
					}
					else {
						value -=a[i];
						count++;
						
					}
			}
			
			if(value <= 0)
			{
				String transaction = count == 1?"transaction":"transactions";
				str="Target"+" "+indexDetails+" is achieved after"+" "+Integer.toString(count)+" "+transaction;
				
			}
			else if(value > 0)
			{
				str= "Given Target is not achieved"; 
			}
			
			
		}
		return str;
	}
	public String displayTargets(int a[],int target,int index) {
		
		String str = calculateTransaction(a,target,index);
		return str;
	}

}
