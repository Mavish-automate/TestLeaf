package week1;

import javax.annotation.processing.SupportedSourceVersion;

public class Day3_ReverseEvenWords
{
public static void main(String[] args) 
{
	String str=" i am a software tester";
	System.out.println("given word is: "+str);
	int l = str.length();
	String rev="";
	
	for(int i=l-1;i>=0;i--) 
	{
		
		rev=rev+str.charAt(i);
		
	}
	
	System.out.println(rev);
System.out.println(	rev.length());
System.out.println("----------------------------------------------");
System.out.println("Method 2: reverse words @ even pos");

String str1="i am a software tester";
String[] split = str1.split(" ");
for(int i=0;i<split.length;i++) 
{
	if(i%2==0) 
	{
		char[] charArray = split[i].toCharArray();
		
		for(int j=charArray.length-1;j>=0;j--)
		{
			System.out.print(charArray[j]+" ");
		}
		
	}
	else
	{
	System.out.print(split[i]+" ");	
	}
		
		}
System.out.println();
System.out.println("----------------------------");



}
}	
	
		





