package week1;

public class Day2_Mobile 
{
public void sendsms() 
{
	System.out.println("From Oppo");
}
public long makeCall(long phno) 
{
	return phno;
}
public static void main(String[] args) 
{
Day2_Mobile myPhone = new Day2_Mobile();
myPhone.sendsms();

long makeCall = myPhone.makeCall(1234567890);
System.out.println(makeCall);


}
}
