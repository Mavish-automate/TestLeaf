package week1;

public class Day3_Missing_Numbers 
{
	public static void main(String[] args)
	{
		int [] a= {1,2,3,4,7,8};
		int l = a.length;
		System.out.println(l+" "+"is the given original array length");
		System.out.println((l+1)+" "+"is the new array length");
		System.out.println();
		for(int i=1;i<l+1;i++) 
		{
			if(i!=a[i-1]) 
			{
				System.out.println(i);
				
			}
			
		}
		
		int [] b= {2,4,6,10,12};
		int l1 = b.length;
		System.out.println(l1+" "+"is the original array length");
		System.out.println((l1+1)+" "+"is the new array length");
		for(int i=1;i<l1+1;i++) 
		{
			if((2*i)!=b[i-1]) 
			{
				System.out.println((2*i)+" "+" is the missing number");
				break;
				
			}
			
		}
		
	}

}
