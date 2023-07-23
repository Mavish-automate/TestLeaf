package week1;

public class Day3_Change_OddIndex_To_UpperCase 
{
	
	public static void main(String[] args) 
	{
		
		
		String str="changeme";
		char[] strindex = str.toCharArray();
		
		int length=strindex.length;
		
		for(int i=0;i<length;i++) 
		{
			if(i%2!=0) 
			{
				char c = strindex[i];
				System.out.println(c);
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("converting the case");
		System.out.println("the given string is: "+" "+str);
		
		String lc = str.toLowerCase();
		String uc = str.toUpperCase();
		
		for(int i=0;i<length;i++) 
		{
		if(i%2==0)	
		{
		char lowercase = lc.charAt(i);	
		System.out.print(lowercase);
		}
		else {
			char uppercase = uc.charAt(i);
			System.out.print(uppercase);
		}
		}
		
		
		}
	

	

}
