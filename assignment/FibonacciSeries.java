package week1.day2.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int num1=0;
		int num2=1;
		int temp;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 2; i <=range; i++) {
			temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.println(temp);
		}
		
	}

}
