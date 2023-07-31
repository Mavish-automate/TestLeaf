package week3.day1.assignments;

import java.util.*;

public class SortingUsingCollection 
{
	// Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		

			// get the length of the array		

			// sort the array			

			// Iterate it in the reverse order

			// print the array
				
			// Required Output: Wipro, HCL , CTS, Aspire Systems
	
	public static void main(String[] args) 
	{
		String[] str= {"Google","Microsoft","TestLeaf","Maverick"};
		
		int length = str.length;
		System.out.println(length);
		System.out.println("original Array Values after sorting: ");
		
		Arrays.sort(str);
		
		for(String org: str) 
		{
			System.out.println(org);
		}
		
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
			







	}
	}

	

		

		

		





