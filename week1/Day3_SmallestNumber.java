package week1;

import java.util.Arrays;

public class Day3_SmallestNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Method 1: using arrays.sort");
		int [] num= {34,98,56,38,8};
		int d;
		int l = num.length;
		System.out.println(l+" "+"is the given array length");
		System.out.println();
		System.out.println(l-1+" "+"is the given elements in the array");
		
		for(int i=0;i<l;i++) 
		{
			Arrays.sort(num);
			System.out.println(num[i]+" "+"is the "+ (i+1) +" "+ " smallest");
		}
	System.out.println();
	System.out.println("----------------------------------------------------");
	System.out.println("Method 2: using swap");
	System.out.println();
	
	int[] n= {78,54,87,9,123};
	int l1 = n.length;
	System.out.println(l1+" "+"is the array length");
	int m;
	for(int i=0;i<l1;i++) 
	{
		for(int j=i+1;j<l1;j++) 
		{
		if(n[i]>n[j])	
		{
			m=n[i];
			n[i]=n[j];
			n[j]=m;
			
		}
		}
		System.out.println(n[i]+" is "+(i+1)+"  smallest");
	}
	
	
		
	}

}
