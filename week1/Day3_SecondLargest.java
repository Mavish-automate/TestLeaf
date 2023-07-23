package week1;

import java.util.Arrays;

public class Day3_SecondLargest 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Method 1: ");
		int[] data= {3,2,11,4,6,7};
		int length = data.length;
		System.out.println(length+" "+"is the array length");
		Arrays.sort(data);
		System.out.println(data[4]+" "+"is the second largest");
		
		System.out.println("----------------------------------------------");
		System.out.println("Method 2: ");
		for(int i=length-2;i>=0;i--) 
		{
			System.out.println(data[length-2]+" "+"is the second largest");
			break;
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("Method 3: ");
		int[] num= {3,2,11,4,6,7};
		int l = num.length;
		System.out.println(l+" "+"is the array length");
		int d;
		for(int i=0;i<l;i++) 
		{
			for(int j=i+1;j<l;j++) 
			{
				if(num[i]>num[j]) 
				{
					d=num[i];
					num[i]=num[j];
					num[j]=d;

				}
			}
			System.out.print(num[i]+" ");
			
			

		}
		System.out.println();
		System.out.println(num[4]+" "+"second largest");
	}

}
