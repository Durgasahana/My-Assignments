package week3day2assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a= {23,45,67,32,89,22};
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
			

		}
		System.out.println("Original list:"+list);
		Collections.sort(list);
		System.out.println("Sorted list:"+list);
		System.out.println("Second largest:"+list.get(4));
	}

}
