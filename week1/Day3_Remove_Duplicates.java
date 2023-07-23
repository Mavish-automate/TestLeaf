package week1;



public class Day3_Remove_Duplicates 
{
	public static void main(String[] args) 
	{

		 int[] n= {23,88,88,65,87,65,33,33,23,8};
		 int l = n.length;
		 System.out.println(l+" "+"is the given array length");
		 
		 for(int i=0;i<l;i++) 
		 {
			 int count=0;

			 for(int j=i+1;j<l;j++) 
			 {
				 if(n[i]==n[j]) 
				 {
					 count++;
					 break;
				 }
			 }
			 
			 if(count!=1)
			 {
				 System.out.print(n[i]+" ");
				 System.out.println();

			 }

		 }
		 System.out.println("----------------------------------");
		
		 System.out.println("Method 2:Remove Known Duplicates from String");
		 
		 String str="we learn  java basics as part java sessions in java week1";
		
		 String[] str1 = str.split("java");
		for(String str2:str1)
		{
			System.out.print(str2+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Method 3: Remove Unknown Duplicates from String");
		 
		String str3="we learn  java basics as part java sessions in java week1";
		
		String[] spit = str3.split(" ");
		
		for(int i=0;i<spit.length;i++) 
		{
		for(int j=i+1;j<spit.length;j++)	
		{
		if(spit[i].equals(spit[j])) 
		{
			
			System.out.println(spit[i]);			
		}
		}
		}
		
		String removedupe = str3.replaceAll("java", " " );
		System.out.println(removedupe);
		
		
	
	
	}
		
		
}
		
		
	

