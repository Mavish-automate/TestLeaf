package week3.day1.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {
	/*
	 * Problem Statement : Print only duplicate values
	 * Expected output: 4 and 8
	 * 
	 * How to solve?
	 * 1) Regular for loop
	 * 2) Using Set
	 * 
	 * Using Set 
	 * 
	 * a) Add every element into Set
	 * b) If it is already there in the Set -> Print duplicate
	 * 
	 */

	public static void main(String[] args) 
	{
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> uniq=new LinkedHashSet<Integer>();
		Set<Integer> dupe=new LinkedHashSet<Integer>();

		for(int i=0;i<=data.length-1;i++) 
		{
		if(	(!uniq.add(data[i])))
		{
			dupe.add(data[i]);
		}

		}
		System.out.println(uniq+" ");
		System.out.println(dupe+" ");


		
	}

}
