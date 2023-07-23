package week1;

public class Day2_Tab 
{

	public static void main(String[] args) 
	{
		Day2_Mobile  phn1=new Day2_Mobile();
		phn1.sendsms();
		long makeCall = phn1.makeCall(1234566779890l);
		System.out.println(makeCall);
		
		
		
	}
}
