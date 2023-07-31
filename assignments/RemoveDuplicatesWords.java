package week3.day1.assignments;

import java.util.LinkedHashSet;

import java.util.*;

public class RemoveDuplicatesWords {

	
	/*
	 * Pseudo code 

	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
	 *
	 *Output= We learn java basics as part of sessions in week1
	 *
	 * Psuedocode
	 *
	 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
	 * c) Create a empty Set 
	 * d) Iterate the String array
                 d.1) add each word into Set
	 * e) Print the Set values which is having unique words
	 */
	public static void main(String[] args)
	{
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		for(String str:split) 
		{
		System.out.println(str);	
		}
		Set<String> uniq=new LinkedHashSet<String>();

		Set<String> dupe=new LinkedHashSet<String>();
		
		for(int i=0;i<split.length;i++) 
		{
			if(!uniq.add(split[i])) 
			{
				dupe.add(split[i]);
			}
		}
		System.out.print((uniq)+" ");
		System.out.println();
		System.out.println(dupe+" ");

		
	}

}
