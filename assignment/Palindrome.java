package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343;
		int num1=num;
		int temp=0;
		int rem;
		for (int i=0;i<5; i++) {
			rem=num%10;
			temp=(temp*10)+rem;
			num=num/10;
		}
		
	System.out.println("Given Number="+num1);
	System.out.println("Reversed Number="+temp);
	if(num1==temp)
	{
		System.out.println(num1+" is a palindrome");
	}
	else
	{
		System.out.println(num1+" is not a palindrome");
	}
}
}
