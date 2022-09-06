package week1.day2.assignment2;

public class PrimeNumber {
public static void main(String[] args) {
	int num=13;
	boolean flag=false;
	for(int i=2;i<=num/2;i++)
	{
		if(num%i!=0)
		{
			flag=true;
		}
		else
		{
			flag=false;
			break;
		}
	}
	if(flag==true)
	{
	System.out.println(num+" is a prime number");
}
	else
	{
		System.out.println(num+" is not a prime number");
	}
}
}