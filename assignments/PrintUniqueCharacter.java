package week3.day1.assignments;

import java.util.LinkedHashSet;

import java.util.*;

public class PrintUniqueCharacter {

	//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
	public static void main(String[] args) 
	
	{
		String str="maheshwari";
		char[] ch = str.toCharArray();
		
		Set<Character> uniq=new LinkedHashSet<Character>();
		Set<Character> dupe=new LinkedHashSet<Character>();

		for(int i=0;i<=ch.length-1;i++) 
		{
		if(	(!uniq.add(ch[i])))
		{
			dupe.add(ch[i]);
		}

		}
		System.out.println(uniq+" ");
		System.out.println(dupe+" ");

	}

}
