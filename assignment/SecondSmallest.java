package week1.day2.assignment;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] a= {23,45,67,32,89,22};
		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a);

		}
		System.out.println(a[1]);
	}

}
